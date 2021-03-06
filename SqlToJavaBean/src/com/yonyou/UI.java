package com.yonyou;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class UI extends JFrame {
	
	private static final long serialVersionUID = 1L;
    protected JTextField inputTextFiled;
    protected JTextField tNameTextField;
    protected JTextField cNametextField;
    protected JPanel contentPane;
    protected JLabel createLable;
    protected JMenuBar menuBar;
    protected JButton chooseFileButton;
    protected JTextField outputTextFiled;
    protected JLabel tNamelable;
    protected JLabel cNameLable;
    protected JLabel label_1;
    protected JComboBox<String> comboBox;
    protected JButton confirmButton;
    protected JLabel label_2;
    protected JLabel label_3;
    protected JButton outputButton;
    protected JLabel label_4;
    protected JTextField mainTextField;
    protected JTextField subTextField;
    protected JButton confirm2;
    protected JButton mainButton;
    protected JButton subButton;
    protected JMenuItem connectItem;
    protected JMenuItem readmeItem;
	/**
	 * Create the frame.
	 */
	
	
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SQL\u8F6CJavaBean");
		setBounds(100, 100, 608, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		createLable = new JLabel("Create By Liuzhw1");
		createLable.setBounds(450, 315, 118, 15);
		contentPane.add(createLable);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 592, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u8BF4\u660E");
		menuBar.add(mnNewMenu);
		readmeItem = new JMenuItem("Readme");
		mnNewMenu.add(readmeItem);
		
		connectItem = new JMenuItem("\u8054\u7CFB\u65B9\u5F0F");
		mnNewMenu.add(connectItem);
		
		chooseFileButton = new JButton("\u6D4F\u89C8\u6587\u4EF6");
		
		chooseFileButton.setBounds(10, 51, 93, 23);
		contentPane.add(chooseFileButton);
		
		inputTextFiled = new JTextField();
		inputTextFiled.setHorizontalAlignment(SwingConstants.TRAILING);
		inputTextFiled.setBounds(131, 52, 402, 21);
		contentPane.add(inputTextFiled);
		inputTextFiled.setColumns(10);
		
		outputTextFiled = new JTextField();
		outputTextFiled.setBounds(131, 109, 402, 21);
		contentPane.add(outputTextFiled);
		outputTextFiled.setColumns(10);
		
		tNamelable = new JLabel("\u5F53\u524D\u8868\u540D");
		tNamelable.setBounds(10, 150, 54, 15);
		contentPane.add(tNamelable);
		
		tNameTextField = new JTextField();
		tNameTextField.setBounds(74, 147, 145, 21);
		contentPane.add(tNameTextField);
		tNameTextField.setColumns(10);
		
		cNameLable = new JLabel("\u8F93\u5165\u7C7B\u540D");
		cNameLable.setBounds(10, 178, 54, 15);
		contentPane.add(cNameLable);
		
		cNametextField = new JTextField();
		cNametextField.setBounds(74, 178, 145, 25);
		contentPane.add(cNametextField);
		cNametextField.setColumns(10);
		
		label_1 = new JLabel("\u7EE7\u627F\u7236\u7C7B");
		label_1.setBounds(331, 150, 54, 15);
		contentPane.add(label_1);
		
		comboBox = new JComboBox<String>();
		comboBox.addItem("SuperMainEntity");
		comboBox.addItem("SuperSubEntity");
		comboBox.setSelectedItem("SuperSubEntity");
		comboBox.setBounds(403, 147, 130, 21);
		contentPane.add(comboBox);
		
		confirmButton = new JButton("\u786E\u8BA4");
		
		confirmButton.setBounds(403, 177, 133, 23);
		contentPane.add(confirmButton);
		
		label_2 = new JLabel("\u4E3B\u8868\u4E00\u5BF9\u591A");
		label_2.setBounds(10, 222, 66, 15);
		contentPane.add(label_2);
		
		label_3 = new JLabel("\u5B50\u8868\u591A\u5BF9\u4E00");
		label_3.setBounds(10, 255, 66, 15);
		contentPane.add(label_3);
		
		outputButton = new JButton("\u8F93\u51FA\u76EE\u5F55");
		
		outputButton.setBounds(10, 108, 93, 23);
		contentPane.add(outputButton);
		
		label_4 = new JLabel("\u5982\u679C\u4E0D\u8BBE\u7F6E\uFF0C\u5219\u9ED8\u8BA4\u4E3A\u8F93\u51FA\u5230\u684C\u9762");
		label_4.setBounds(130, 94, 200, 15);
		contentPane.add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------");
		lblNewLabel_1.setBounds(13, 206, 553, 15);
		contentPane.add(lblNewLabel_1);
		
		confirm2 = new JButton("\u786E\u8BA4");
		confirm2.setBounds(84, 293, 93, 23);
		contentPane.add(confirm2);
		
		mainButton = new JButton("\u9009\u62E9\u4E3B\u8868");
		mainButton.setBounds(84, 218, 93, 23);
		contentPane.add(mainButton);
		
		subButton = new JButton("\u9009\u62E9\u5B50\u8868");
		subButton.setBounds(86, 251, 91, 23);
		contentPane.add(subButton);
		
		mainTextField = new JTextField();
		mainTextField.setBounds(187, 219, 346, 21);
		contentPane.add(mainTextField);
		mainTextField.setColumns(10);
		
		subTextField = new JTextField();
		subTextField.setBounds(187, 252, 346, 21);
		contentPane.add(subTextField);
		subTextField.setColumns(10);
		
		setVisible(true);
	}
}
