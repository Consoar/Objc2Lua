package bos.consoar.objc2lua;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainActivity implements ActionListener {
    private boolean DEBUG_TEST = false;
    private PrintStream printStream;

    JFrame frame = new JFrame("Objc2Lua");// 框架布局
    JTabbedPane tabPane = new JTabbedPane();// 选项卡布局
    Container main = new Container();//主界面
    Container about = new Container();//关于界面
    Container setting = new Container();//设置界面

    JLabel label1 = new JLabel("文件目录");
    JTextField text1 = new JTextField();// TextField 目录的路径
    JButton chooseDirButton = new JButton("选择");// 选择
    JFileChooser jfc = new JFileChooser();// 文件选择器
    JButton convertButton = new JButton("开始转换");//
    JTextArea txtLog = new JTextArea();

    //about
    JLabel versionLabel = new JLabel("版本号:1.0.1_beta", JLabel.CENTER);
    JLabel aboutLabel = new JLabel("如有转换错误的Bug或无法转换的语法,欢迎反馈", JLabel.CENTER);

    //setting
    private MainActivity() {
//        if (DEBUG_TEST) {
//            try {
//                new Parse().Convert("E:\\waxtest\\");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return;
//        }
        // 用自己的重载的OutputStream创建一个PrintStream
        printStream = new PrintStream(new MyOutputStream());
        // 指定标准输出到自己创建的PrintStream
        System.setOut(printStream);
        System.setErr(printStream);
        double lx = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        double ly = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        frame.setLocation(new Point((int) (lx / 2) - 300, (int) (ly / 2) - 240));// 设定窗口出现位置
        frame.setSize(600, 480);// 设定窗口大小
        frame.setContentPane(tabPane);// 设置布局
        label1.setBounds(10, 10, 70, 20);
        text1.setBounds(75, 10, 400, 20);
        chooseDirButton.setBounds(500, 10, 70, 20);
        convertButton.setBounds(250, 60, 100, 20);
        txtLog.setBounds(10, 90, 570, 300);
        txtLog.setLineWrap(true);        //激活自动换行功能
        txtLog.setWrapStyleWord(true);   // 激活断行不断字功能

        chooseDirButton.addActionListener(this); // 添加事件处理
        convertButton.addActionListener(this); // 添加事件处理
        main.add(label1);
        main.add(text1);
        main.add(chooseDirButton);
        main.add(convertButton);
        JScrollPane scr = new JScrollPane(txtLog);
        scr.setBounds(10, 90, 570, 300);
        main.add(scr);
        frame.setVisible(true);// 窗口可见
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 使能关闭窗口，结束程序
        tabPane.add("主界面", main);// 添加布局1

//        tabPane.add("设置", setting);

        versionLabel.setBounds(100, 60, 400, 20);
        aboutLabel.setBounds(100, 80, 400, 100);
        about.add(versionLabel);
        about.add(aboutLabel);
        tabPane.add("关于", about);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(chooseDirButton)) {// 判断触发方法的按钮是哪个
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);// 设定只能选择到文件夹
            int state = jfc.showOpenDialog(null);// 此句是打开文件选择器界面的触发语句
            if (state == 1) {
                return;
            } else {
                File f = jfc.getSelectedFile();// f为选择到的目录
                text1.setText(f.getAbsolutePath());
            }
        }

        if (e.getSource().equals(convertButton)) {
            String dir = text1.getText() + File.separator;
            if (dir.length() > 0) {
                try {
                    new Parse().Convert(dir);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "请先选择目录~", "错误", 2);
            }

        }
    }

    public static void main(String[] args) {
        new MainActivity();
    }

    //重定向system的输出
    public class MyOutputStream extends OutputStream {
        public void write(int arg0) throws IOException {
            // 写入指定的字节，忽略
        }

        public void write(byte data[]) throws IOException {
            // 追加一行字符串
            txtLog.append(new String(data));
        }

        public void write(byte data[], int off, int len) throws IOException {
            // 追加一行字符串中指定的部分，这个最重要
            txtLog.append(new String(data, off, len));
            // 移动TextArea的光标到最后，实现自动滚动
            txtLog.setCaretPosition(txtLog.getText().length());
        }
    }
}
