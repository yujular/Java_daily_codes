package online.pratice.code.eighth;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * @author yujular
 * @title: MyNotePad
 * @date 2020/11/28
 */
public class MyNotePad extends WindowAdapter implements ActionListener, MouseListener {
    Frame frame;
    MenuBar menuBar;
    Menu menuFile,Edit;
    PopupMenu popupMenu;
    MenuItem newFile,openFile,saveFile,exitProgram;
    MenuItem editCopy,editPaste;
    MenuItem popCopy,popPaste;
    TextArea mainTextArea;
    File file;
    String copyCache;
    private FileDialog openDialog,saveDialog;
    MyNotePad(){
        frame = new Frame("记事本演示程序");
        menuBar = new MenuBar();
        menuFile = new Menu("文件");
        Edit = new Menu("编辑");
        popupMenu = new PopupMenu();
        newFile = new MenuItem("新建");
        openFile = new MenuItem("打开..");
        saveFile = new MenuItem("保存");
        exitProgram = new MenuItem("退出");
        editCopy = new MenuItem("复制");
        editPaste = new MenuItem("粘贴");
        //一开始不可选中
        editPaste.setEnabled(false);
        popCopy = new MenuItem("复制");
        popPaste = new MenuItem("粘贴");
        //一开始不可选中
        popPaste.setEnabled(false);
        mainTextArea = new TextArea(50,20);
        openDialog = new FileDialog(frame,"打开",FileDialog.LOAD);
        saveDialog = new FileDialog(frame,"保存",FileDialog.SAVE);
    }
    void show(){
        //文件菜单
        menuFile.add(newFile);
        menuFile.add(openFile);
        menuFile.add(saveFile);
        menuFile.add(exitProgram);
        //编辑菜单
        Edit.add(editCopy);
        Edit.add(editPaste);
        //弹出式菜单
        popupMenu.add(popCopy);
        popupMenu.add(popPaste);
        //菜单
        menuBar.add(menuFile);
        menuBar.add(Edit);
        //文件
        mainTextArea.add(popupMenu);
        //设置布局
        frame.setLayout(new BorderLayout());
        frame.setMenuBar(menuBar);
        frame.setBackground(Color.lightGray);
        frame.setSize(320,380);
        frame.add(mainTextArea,BorderLayout.CENTER);
        frame.setVisible(true);

        //设置监听器
        frame.addWindowListener(this);
        mainTextArea.addMouseListener(this);
        newFile.addActionListener(this::actionPerformed);
        openFile.addActionListener(this::actionPerformed);
        saveFile.addActionListener(this::actionPerformed);
        exitProgram.addActionListener(this::actionPerformed);
        editPaste.addActionListener(this::actionPerformed);
        editCopy.addActionListener(this::actionPerformed);
        popPaste.addActionListener(this::actionPerformed);
        popCopy.addActionListener(this::actionPerformed);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        if(e.getSource()==frame){
            System.exit(0);
        }
    }

    private void loadFile(){
        openDialog.setVisible(true);
        ///获取打开文件路径并保存到字符串中
        String dirPath = openDialog.getDirectory();
        //获取打开文件名称并保存到字符串中
        String fileName = openDialog.getFile();
        //判断路径和文件是否为空
        if (dirPath == null || fileName == null) {
            return;
        }else {
            //文件不为空，清空原来文件内容。
            mainTextArea.setText(null);
        }
        ///创建新的路径和名称
        file = new File(dirPath, fileName);
        try {
            //尝试从文件中读东西
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            //变量字符串初始化为空
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                //显示每一行内容
                mainTextArea.append(line + "\r\n");
            }
            //关闭文件
            bufferedReader.close();
        } catch (FileNotFoundException e1) {
            // 抛出文件路径找不到异常
            e1.printStackTrace();
        } catch (IOException e1) {
            // 抛出IO异常
            e1.printStackTrace();
        }
    }

    private void saveFileMethod(){
        saveDialog.setVisible(true);
        String dirPath = saveDialog.getDirectory();
        String fileName = saveDialog.getFile();
        if (dirPath == null || fileName == null) {
            return;
        }else {
        ///创建新的路径和名称
        file = new File(dirPath, fileName);
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            String text = mainTextArea.getText();
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (FileNotFoundException e1) {
            // 抛出文件路径找不到异常
            e1.printStackTrace();
        } catch (IOException e1) {
            // 抛出IO异常
            e1.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==newFile){
            //新建文件，文本为空
            mainTextArea.setText("");
        }else if(e.getSource()==openFile){
            loadFile();
        }else if(e.getSource()==saveFile){
            saveFileMethod();
        }else if(e.getSource()==editCopy||e.getSource()==popCopy){
            copyCache = mainTextArea.getSelectedText();
            if(copyCache!=null){
                editPaste.setEnabled(true);
                popPaste.setEnabled(true);
            }
        }else if(e.getSource()==editPaste||e.getSource()==popPaste){
            mainTextArea.insert(copyCache,mainTextArea.getCaretPosition());
        }else if(e.getSource()==exitProgram){
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
        //判断右键
        if (e.isPopupTrigger()){
            popupMenu.show(mainTextArea,mainTextArea.getX(), mainTextArea.getY());
        }
    }

    public static void main(String[] args) {
        (new MyNotePad()).show();
    }
}
