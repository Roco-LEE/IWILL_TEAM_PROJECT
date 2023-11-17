package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartService;
import com.itwill.shop.order.OrderService;
import com.itwill.shop.product.ProductService;
import com.itwill.shop.userinfo.User;
import com.itwill.shop.userinfo.UserDao;
import com.itwill.shop.userinfo.UserService;

import javax.swing.SwingConstants;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MainFrameOrder extends JFrame {
	
	private CartService cartService;
	private ProductService productService;
	private OrderService orderService;
	private UserService userService;
	
	private User loginUser = null;
	private JPanel contentPane;
	private JTextField userSignUpIdTF;
	private JTextField userSignupNameTF;
	private JTextField userSignupEmailTF;
	private JTextField userSignupBDTF;
	private JTextField userSignupPhoneTF;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField userSignUpPwTF;
	private JPasswordField userSignUpPwCheckTF;
	private JTextField userEditIDTF;
	private JTextField userEditNameTF;
	private JTextField userEditEmailTF;
	private JTextField userEditBDTF;
	private JTextField userEditPhoneTF;
	private JPasswordField userEditPwTF;
	private JPasswordField userEditPwCheckTF;
	private JTextField textField_1;
	private JTextField userFindidTF;
	private JTextField userFindPwTF;
	private JTextField textField_4;
	private JTextField productNameTF;
	private JTextField productPriceTF;
	private JTextField productReadCountTF;
	private JTextField productDetailTF;
	private JTextField productDateTF;
	private JTextField orderListIdTF;
	private JTable orderListTable;
	private JTable orderCartTable;
	private JTextField orderCartPriceTF;
	private JTextField orderCartNameTF;
	private JTextField orderCartDetailTF;
	private JTextField orderCartDateTF;
	private JTextField orderPayPriceTF;
	private JTable table;
	private JTextField orderPayNameTF;
	private JTextField orderPayPhoneTF;
	private JTextField productCategoryTF;
	private JLabel idCheckMsgLabel;
	private JTextField cartByProductQtyTF;
	private JPanel userTabPannel;
	private JPanel productTabPannel;
	private JPanel orderTabPannel;
	private JTabbedPane tabbedPane_1;
	private JTabbedPane tabbedPane;
	private JTabbedPane tabbedPane_2;
	private JTabbedPane tabbedPane_3;
	private JTabbedPane tabbedPane_4;
	

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameOrder frame = new MainFrameOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MainFrameOrder() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 495);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("프로그램");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("로그아웃");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("종료");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 364, 452);
		contentPane.add(tabbedPane);
		
		userTabPannel = new JPanel();
		tabbedPane.addTab("회원", null, userTabPannel, null);
		userTabPannel.setLayout(null);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 359, 423);
		userTabPannel.add(tabbedPane_1);
		
		JPanel userLoginPanel = new JPanel();
		tabbedPane_1.addTab("로그인", null, userLoginPanel, null);
		userLoginPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(119, 43, 116, 21);
		userLoginPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("아이디");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(50, 46, 57, 15);
		userLoginPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("비밀번호");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(50, 97, 57, 15);
		userLoginPanel.add(lblNewLabel_8);
		
		textField_2 = new JTextField();
		textField_2.setBounds(119, 231, 116, 21);
		userLoginPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 277, 116, 21);
		userLoginPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("이름");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(50, 234, 57, 15);
		userLoginPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("휴대전화");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(50, 280, 57, 15);
		userLoginPanel.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(138, 137, 97, 23);
		userLoginPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("비회원 로그인");
		btnNewButton_1.setBounds(121, 321, 133, 23);
		userLoginPanel.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(119, 94, 116, 21);
		userLoginPanel.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 181, 330, 15);
		userLoginPanel.add(separator);
		
		JButton btnNewButton_4 = new JButton("중복확인");
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_4.setBounds(247, 42, 95, 23);
		userLoginPanel.add(btnNewButton_4);
		
		JPanel userSignUpPanel = new JPanel();
		tabbedPane_1.addTab("회원가입", null, userSignUpPanel, null);
		userSignUpPanel.setLayout(null);
		
		userSignUpIdTF = new JTextField();
		userSignUpIdTF.setBounds(128, 25, 142, 21);
		userSignUpPanel.add(userSignUpIdTF);
		userSignUpIdTF.setColumns(10);
		
		userSignupNameTF = new JTextField();
		userSignupNameTF.setBounds(128, 147, 142, 21);
		userSignUpPanel.add(userSignupNameTF);
		userSignupNameTF.setColumns(10);
		
		userSignupEmailTF = new JTextField();
		userSignupEmailTF.setBounds(128, 178, 142, 21);
		userSignUpPanel.add(userSignupEmailTF);
		userSignupEmailTF.setColumns(10);
		
		userSignupBDTF = new JTextField();
		userSignupBDTF.setBounds(128, 231, 142, 21);
		userSignUpPanel.add(userSignupBDTF);
		userSignupBDTF.setColumns(10);
		
		userSignupPhoneTF = new JTextField();
		userSignupPhoneTF.setBounds(128, 262, 142, 21);
		userSignUpPanel.add(userSignupPhoneTF);
		userSignupPhoneTF.setColumns(10);
		
		JComboBox userSignupSexComboBox = new JComboBox();
		userSignupSexComboBox.setModel(new DefaultComboBoxModel(new String[] {"남자", "여자"}));
		userSignupSexComboBox.setBounds(128, 293, 142, 23);
		userSignUpPanel.add(userSignupSexComboBox);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(58, 28, 57, 15);
		userSignUpPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(58, 88, 57, 15);
		userSignUpPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1.setBounds(29, 119, 86, 15);
		userSignUpPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(66, 150, 57, 15);
		userSignUpPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("이메일");
		lblNewLabel_3.setBounds(53, 184, 57, 15);
		userSignUpPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("생년월일");
		lblNewLabel_4.setBounds(53, 234, 57, 15);
		userSignUpPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("휴대전화");
		lblNewLabel_5.setBounds(53, 265, 57, 15);
		userSignUpPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("성별");
		lblNewLabel_6.setBounds(59, 297, 57, 15);
		userSignUpPanel.add(lblNewLabel_6);
		
		JCheckBox userSignUpEmailCheckBox = new JCheckBox("이메일 수신 동의");
		userSignUpEmailCheckBox.setBounds(128, 202, 142, 23);
		userSignUpPanel.add(userSignUpEmailCheckBox);
		
		JButton userSignUpButton = new JButton("회원가입");
		userSignUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// 회원가입 버튼
					String id = userSignUpIdTF.getText();
					String password = new String(userSignUpPwTF.getPassword());
					String passwordCheck = new String(userSignUpPwCheckTF.getPassword());
					String name = userSignupNameTF.getText();
					String email = userSignupEmailTF.getText();
					String emailSend = "";
					if(userSignUpEmailCheckBox.isSelected()) {
						emailSend = "T";
					} else {
						emailSend = "F";
					}
					String birthdate = userSignupBDTF.getText();
					String phone = userSignupPhoneTF.getText();
					String sex = (String)userSignupSexComboBox.getSelectedItem();
					
					if(id.equals("")) {
						idCheckMsgLabel.setText("아이디를 입력하세요.");
						userSignUpIdTF.requestFocus();
						return;
					} else {
						idCheckMsgLabel.setText("");
					}
					
					if(password.equals("")) {
						idCheckMsgLabel.setText("패스워드를 입력하세요.");
						userSignUpPwTF.requestFocus();
						return;
					} else {
						idCheckMsgLabel.setText("");
					}
					
					User user = new User(id, password, passwordCheck, name, email, emailSend, birthdate, phone, sex);
					
					
					
					
				} catch (Exception e1){
					System.out.println("회원가입에러 --> " + e1.getMessage());
				}
				//아이디 유효성 체크
			}
		});
		userSignUpButton.setBounds(109, 339, 97, 23);
		userSignUpPanel.add(userSignUpButton);
		
		userSignUpPwTF = new JPasswordField();
		userSignUpPwTF.setBounds(128, 85, 142, 21);
		userSignUpPanel.add(userSignUpPwTF);
		
		userSignUpPwCheckTF = new JPasswordField();
		userSignUpPwCheckTF.setBounds(128, 116, 143, 21);
		userSignUpPanel.add(userSignUpPwCheckTF);
		
		JButton btnNewButton_41 = new JButton("중복");
		btnNewButton_41.setBounds(282, 24, 60, 23);
		userSignUpPanel.add(btnNewButton_41);
		
		idCheckMsgLabel = new JLabel("");
		idCheckMsgLabel.setForeground(new Color(255, 0, 0));
		idCheckMsgLabel.setBounds(68, 60, 240, 15);
		userSignUpPanel.add(idCheckMsgLabel);
		
		JPanel userEditPanel = new JPanel();
		userEditPanel.setLayout(null);
		tabbedPane_1.addTab("회원정보", null, userEditPanel, null);
		
		userEditIDTF = new JTextField();
		userEditIDTF.setEditable(false);
		userEditIDTF.setColumns(10);
		userEditIDTF.setBounds(128, 10, 142, 21);
		userEditPanel.add(userEditIDTF);
		
		userEditNameTF = new JTextField();
		userEditNameTF.setColumns(10);
		userEditNameTF.setBounds(128, 103, 142, 21);
		userEditPanel.add(userEditNameTF);
		
		userEditEmailTF = new JTextField();
		userEditEmailTF.setColumns(10);
		userEditEmailTF.setBounds(128, 134, 142, 21);
		userEditPanel.add(userEditEmailTF);
		
		userEditBDTF = new JTextField();
		userEditBDTF.setColumns(10);
		userEditBDTF.setBounds(128, 190, 142, 21);
		userEditPanel.add(userEditBDTF);
		
		userEditPhoneTF = new JTextField();
		userEditPhoneTF.setColumns(10);
		userEditPhoneTF.setBounds(128, 221, 142, 21);
		userEditPanel.add(userEditPhoneTF);
		
		JComboBox userEditSexComboBox = new JComboBox();
		userEditSexComboBox.setEditable(true);
		userEditSexComboBox.setBounds(128, 252, 142, 23);
		userEditPanel.add(userEditSexComboBox);
		
		JLabel lblNewLabel_11 = new JLabel("아이디");
		lblNewLabel_11.setBounds(66, 13, 57, 15);
		userEditPanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_1_2 = new JLabel("비밀번호");
		lblNewLabel_1_2.setBounds(53, 41, 57, 15);
		userEditPanel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1_1.setBounds(30, 75, 86, 15);
		userEditPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(66, 106, 57, 15);
		userEditPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("이메일");
		lblNewLabel_3_1.setBounds(59, 137, 57, 15);
		userEditPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("생년월일");
		lblNewLabel_4_1.setBounds(53, 193, 57, 15);
		userEditPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("휴대전화");
		lblNewLabel_5_1.setBounds(53, 224, 57, 15);
		userEditPanel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("성별");
		lblNewLabel_6_1.setBounds(59, 256, 57, 15);
		userEditPanel.add(lblNewLabel_6_1);
		
		JCheckBox userEditEmailCheckBox = new JCheckBox("이메일 수신 동의");
		userEditEmailCheckBox.setBounds(128, 161, 142, 23);
		userEditPanel.add(userEditEmailCheckBox);
		
		JButton userEditButton = new JButton("회원정보 수정");
		userEditButton.setBounds(110, 305, 131, 23);
		userEditPanel.add(userEditButton);
		
		userEditPwTF = new JPasswordField();
		userEditPwTF.setBounds(128, 41, 142, 21);
		userEditPanel.add(userEditPwTF);
		
		userEditPwCheckTF = new JPasswordField();
		userEditPwCheckTF.setBounds(127, 72, 143, 21);
		userEditPanel.add(userEditPwCheckTF);
		
		JButton userEditQuitButton = new JButton("회원탈퇴");
		userEditQuitButton.setBounds(130, 338, 97, 23);
		userEditPanel.add(userEditQuitButton);
		
		JPanel userFindPanel = new JPanel();
		tabbedPane_1.addTab("ID/PW찾기", null, userFindPanel, null);
		userFindPanel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 51, 152, 21);
		userFindPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("조회");
		btnNewButton_2.setBounds(222, 50, 97, 23);
		userFindPanel.add(btnNewButton_2);
		
		userFindidTF = new JTextField();
		userFindidTF.setEditable(false);
		userFindidTF.setBounds(77, 143, 195, 21);
		userFindPanel.add(userFindidTF);
		userFindidTF.setColumns(10);
		
		userFindPwTF = new JTextField();
		userFindPwTF.setEditable(false);
		userFindPwTF.setBounds(77, 206, 195, 21);
		userFindPanel.add(userFindPwTF);
		userFindPwTF.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("당신의 아이디는...");
		lblNewLabel_25.setBounds(77, 118, 143, 15);
		userFindPanel.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("당신의 비밀번호는...");
		lblNewLabel_26.setBounds(77, 181, 133, 15);
		userFindPanel.add(lblNewLabel_26);
		
		productTabPannel = new JPanel();
		tabbedPane.addTab("제품", null, productTabPannel, null);
		productTabPannel.setLayout(null);
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 359, 423);
		productTabPannel.add(tabbedPane_2);
		
		JPanel productMainPanel = new JPanel();
		tabbedPane_2.addTab("메인", null, productMainPanel, null);
		productMainPanel.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(117, 10, 116, 21);
		productMainPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("취미찾기");
		btnNewButton_3.setBounds(245, 9, 97, 23);
		productMainPanel.add(btnNewButton_3);
		
		JLabel lblNewLabel_12 = new JLabel("수공예");
		lblNewLabel_12.setBounds(56, 130, 57, 15);
		productMainPanel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("요리");
		lblNewLabel_13.setBounds(244, 130, 57, 15);
		productMainPanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("미술");
		lblNewLabel_14.setBounds(56, 290, 57, 15);
		productMainPanel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_27 = new JLabel("스포츠");
		lblNewLabel_27.setBounds(244, 290, 57, 15);
		productMainPanel.add(lblNewLabel_27);
		
		JPanel productCategoryPanel = new JPanel();
		tabbedPane_2.addTab("카테고리별", null, productCategoryPanel, null);
		productCategoryPanel.setLayout(null);
		
		tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(-1, 1, 354, 391);
		productCategoryPanel.add(tabbedPane_4);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_4.addTab("수공예", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_4.addTab("요리", null, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_4.addTab("미술", null, panel_9, null);
		panel_9.setLayout(null);
		
		JPanel panel = new JPanel();
		tabbedPane_4.addTab("스포츠", null, panel, null);
		panel.setLayout(null);
		
		JPanel productDetailPanel = new JPanel();
		tabbedPane_2.addTab("제품상세", null, productDetailPanel, null);
		productDetailPanel.setLayout(null);
		
		productNameTF = new JTextField();
		productNameTF.setEditable(false);
		productNameTF.setText("제품이름");
		productNameTF.setBounds(201, 45, 116, 21);
		productDetailPanel.add(productNameTF);
		productNameTF.setColumns(10);
		
		productPriceTF = new JTextField();
		productPriceTF.setEditable(false);
		productPriceTF.setText("제품가격");
		productPriceTF.setBounds(201, 76, 116, 21);
		productDetailPanel.add(productPriceTF);
		productPriceTF.setColumns(10);
		
		productReadCountTF = new JTextField();
		productReadCountTF.setEditable(false);
		productReadCountTF.setText("조회수");
		productReadCountTF.setBounds(201, 107, 116, 21);
		productDetailPanel.add(productReadCountTF);
		productReadCountTF.setColumns(10);
		
		productDetailTF = new JTextField();
		productDetailTF.setEditable(false);
		productDetailTF.setText("상세설명");
		productDetailTF.setBounds(201, 169, 116, 124);
		productDetailPanel.add(productDetailTF);
		productDetailTF.setColumns(10);
		
		productDateTF = new JTextField();
		productDateTF.setEditable(false);
		productDateTF.setText("날짜");
		productDateTF.setBounds(201, 138, 116, 21);
		productDetailPanel.add(productDateTF);
		productDateTF.setColumns(10);
		
		JLabel productImageLabel = new JLabel("");
		productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLabel.setIcon(new ImageIcon(MainFrameOrder.class.getResource("/images/nothing.jpg")));
		productImageLabel.setBounds(12, 14, 158, 218);
		productDetailPanel.add(productImageLabel);
		
		JComboBox productQtyComboBox = new JComboBox();
		productQtyComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		productQtyComboBox.setBounds(37, 303, 127, 23);
		productDetailPanel.add(productQtyComboBox);
		
		JButton productCartButton = new JButton("장바구니 담기");
		productCartButton.setBounds(201, 303, 116, 23);
		productDetailPanel.add(productCartButton);
		
		JButton productPayButton = new JButton("주문하기");
		productPayButton.setBounds(201, 339, 116, 23);
		productDetailPanel.add(productPayButton);
		
		productCategoryTF = new JTextField();
		productCategoryTF.setText("카테고리");
		productCategoryTF.setEditable(false);
		productCategoryTF.setBounds(201, 14, 116, 21);
		productDetailPanel.add(productCategoryTF);
		productCategoryTF.setColumns(10);
		
		orderTabPannel = new JPanel();
		orderTabPannel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(loginUser==null) {
					tabbedPane_1.setSelectedIndex(1);
				}
			}
		});
		tabbedPane.addTab("주문", null, orderTabPannel, null);
		orderTabPannel.setLayout(null);
		
		tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 359, 423);
		orderTabPannel.add(tabbedPane_3);
		
		JPanel orderCartPanel = new JPanel();
		tabbedPane_3.addTab("장바구니", null, orderCartPanel, null);
		orderCartPanel.setLayout(null);
		
		JScrollPane orderCartScrollPane = new JScrollPane();
		orderCartScrollPane.setBounds(12, 10, 330, 157);
		orderCartPanel.add(orderCartScrollPane);
		
		orderCartTable = new JTable();
		orderCartTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = orderCartTable.getSelectedRow();
				Integer selectedNo = (Integer)orderCartTable.getValueAt(selectedRow,0);
				String selectedName = (String)orderCartTable.getValueAt(selectedRow, 1);
				Integer selectedQty = (Integer)orderCartTable.getValueAt(selectedRow, 2);
				orderCartNameTF.setText(selectedName);
				cartByProductQtyTF.setText(selectedQty+"");
				try {
					orderCartDetailTF.setText(cartService.getCartItemByCartNo(selectedNo).getProduct().getProduct_detail());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Date findDate;
				try {
					findDate = cartService.getCartItemByCartNo(selectedNo).getProduct().getProduct_start_date();
					String d =new SimpleDateFormat("yyyy/MM/dd").format(findDate);
					orderCartDateTF.setText(d);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
//		orderCartTable.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			
//				int selectedRow=orderCartTable.getSelectedRow();
//				String selectedId=(String)orderCartTable.getValueAt(selectedRow, 0);
//				System.out.println(selectedRow);
//				System.out.println(selectedId);
//				
//			}
//		});
		orderCartTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		orderCartTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uAC15\uC758\uBA85", "\uC778\uC6D0", "\uAC00\uACA9", "\uCD1D\uAE08\uC561"
			}
		));
		orderCartScrollPane.setViewportView(orderCartTable);
		
		orderCartPriceTF = new JTextField();
		orderCartPriceTF.setHorizontalAlignment(SwingConstants.RIGHT);
		orderCartPriceTF.setEditable(false);
		orderCartPriceTF.setBounds(255, 177, 62, 21);
		orderCartPanel.add(orderCartPriceTF);
		orderCartPriceTF.setColumns(10);
		
		
		JLabel lblNewLabel_16 = new JLabel("총 결제금액:");
		lblNewLabel_16.setBounds(178, 180, 75, 15);
		orderCartPanel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("원");
		lblNewLabel_17.setBounds(320, 180, 22, 15);
		orderCartPanel.add(lblNewLabel_17);
		
		orderCartNameTF = new JTextField();
		orderCartNameTF.setEditable(false);
		orderCartNameTF.setBounds(81, 208, 236, 21);
		orderCartPanel.add(orderCartNameTF);
		orderCartNameTF.setColumns(10);
		
		
		orderCartDetailTF = new JTextField();
		orderCartDetailTF.setEditable(false);
		orderCartDetailTF.setBounds(81, 239, 236, 21);
		orderCartPanel.add(orderCartDetailTF);
		orderCartDetailTF.setColumns(10);
		
		orderCartDateTF = new JTextField();
		orderCartDateTF.setEditable(false);
		orderCartDateTF.setBounds(81, 270, 236, 21);
		orderCartPanel.add(orderCartDateTF);
		orderCartDateTF.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("강의명 :");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_18.setBounds(12, 211, 57, 15);
		orderCartPanel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("강의상세 :");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_19.setBounds(12, 242, 62, 15);
		orderCartPanel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("강의일자 :");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_20.setBounds(12, 273, 68, 15);
		orderCartPanel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("수강인원 :");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_21.setBounds(12, 305, 62, 15);
		orderCartPanel.add(lblNewLabel_21);
		
		JButton orderCartQtyMinusButton = new JButton("-");
		orderCartQtyMinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int qtyMinus=Integer.parseInt(cartByProductQtyTF.getText());
					if(qtyMinus>1) {
					cartByProductQtyTF.setText(String.valueOf(--qtyMinus));
					} else {
						JOptionPane.showMessageDialog(null, "1명 이상 선택해야합니다.");
					}
				} catch(NumberFormatException ex) {
					cartByProductQtyTF.setText("1");
					}
				}
			});
		orderCartQtyMinusButton.setBounds(91, 301, 57, 23);
		orderCartPanel.add(orderCartQtyMinusButton);
		
		JButton orderCartQtyPlusButton = new JButton("+");
		orderCartQtyPlusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				try {
					int qtyPlus=Integer.parseInt(cartByProductQtyTF.getText());
					if(qtyPlus<8) {
						cartByProductQtyTF.setText(String.valueOf(++qtyPlus));
					} else {
						JOptionPane.showMessageDialog(null, "최대 인원수 8명입니다.");
					}
				} catch(NumberFormatException ex) {
					cartByProductQtyTF.setText("1");
					}
				}
			});
		orderCartQtyPlusButton.setBounds(255, 301, 57, 23);
		orderCartPanel.add(orderCartQtyPlusButton);
		
		JButton orderCartEditButton = new JButton("주문 수정");
		orderCartEditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRow=orderCartTable.getSelectedRow();
					int selectedNo=(Integer)orderCartTable.getValueAt(selectedRow, 0);
					cartService.updateCart(selectedNo, Integer.parseInt(cartByProductQtyTF.getText()));
					displayCartList(loginUser);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		orderCartEditButton.setBounds(33, 348, 97, 23);
		orderCartPanel.add(orderCartEditButton);
		
		JButton orderCartDeleteButton = new JButton("주문 삭제");
		orderCartDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRow=orderCartTable.getSelectedRow();
					int selectedNo=(Integer)orderCartTable.getValueAt(selectedRow, 0);
					cartService.deleteCartItemByCartNo(selectedNo);
					displayCartList(loginUser);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		orderCartDeleteButton.setBounds(142, 348, 97, 23);
		orderCartPanel.add(orderCartDeleteButton);
		
		JButton orderCartPayButton = new JButton("결제하기");
		orderCartPayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(loginUser==null) {
					changeUserTabPanel(0);
					JOptionPane.showMessageDialog(null, "로그인을 해주세요");
				} else {
				changeOrderTabPanel(1);
				}
			}
		});
		orderCartPayButton.setBounds(245, 348, 97, 23);
		orderCartPanel.add(orderCartPayButton);
		
		cartByProductQtyTF = new JTextField();
		cartByProductQtyTF.setEnabled(false);
		cartByProductQtyTF.setHorizontalAlignment(SwingConstants.CENTER);
		cartByProductQtyTF.setBounds(160, 302, 75, 21);
		orderCartPanel.add(cartByProductQtyTF);
		cartByProductQtyTF.setColumns(10);
		
		JPanel orderPayPanel = new JPanel();
		orderPayPanel.setLayout(null);
		tabbedPane_3.addTab("결제", null, orderPayPanel, null);
		
		JScrollPane orderPayScrollPane = new JScrollPane();
		orderPayScrollPane.setBounds(12, 10, 330, 142);
		orderPayPanel.add(orderPayScrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uBC88\uD638", "\uAC15\uC758\uBA85", "\uC778\uC6D0", "\uAC00\uACA9", "\uCD1D\uAE08\uC561"
			}
		));
		orderPayScrollPane.setViewportView(table);
		
		orderPayPriceTF = new JTextField();
		orderPayPriceTF.setEditable(false);
		orderPayPriceTF.setColumns(10);
		orderPayPriceTF.setBounds(202, 165, 116, 21);
		orderPayPanel.add(orderPayPriceTF);
		
		JLabel lblNewLabel_16_1 = new JLabel("총 결제금액 :");
		lblNewLabel_16_1.setBounds(123, 168, 90, 15);
		orderPayPanel.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_17_1 = new JLabel("원");
		lblNewLabel_17_1.setBounds(321, 168, 22, 15);
		orderPayPanel.add(lblNewLabel_17_1);
		
		JButton orderPayPayButton = new JButton("결제");
		orderPayPayButton.setBounds(123, 335, 97, 23);
		orderPayPanel.add(orderPayPayButton);
		
		JComboBox orderPayPaymentComboBox = new JComboBox();
		orderPayPaymentComboBox.setModel(new DefaultComboBoxModel(new String[] {"신용카드", "무통장입금", "현장결제"}));
		orderPayPaymentComboBox.setBounds(109, 290, 200, 23);
		orderPayPanel.add(orderPayPaymentComboBox);
		
		JLabel lblNewLabel_22 = new JLabel("결제수단 :");
		lblNewLabel_22.setBounds(26, 294, 57, 15);
		orderPayPanel.add(lblNewLabel_22);
		
		orderPayNameTF = new JTextField();
		orderPayNameTF.setBounds(109, 206, 198, 21);
		orderPayPanel.add(orderPayNameTF);
		orderPayNameTF.setColumns(10);
		
		orderPayPhoneTF = new JTextField();
		orderPayPhoneTF.setBounds(109, 247, 198, 21);
		orderPayPanel.add(orderPayPhoneTF);
		orderPayPhoneTF.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("수강자 :");
		lblNewLabel_23.setBounds(26, 209, 57, 15);
		orderPayPanel.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("연락처 :");
		lblNewLabel_24.setBounds(26, 250, 57, 15);
		orderPayPanel.add(lblNewLabel_24);
		
		JPanel orderListPanel = new JPanel();
		tabbedPane_3.addTab("주문내역", null, orderListPanel, null);
		orderListPanel.setLayout(null);
		
		orderListIdTF = new JTextField();
		orderListIdTF.setEditable(false);
		orderListIdTF.setBounds(47, 10, 116, 21);
		orderListPanel.add(orderListIdTF);
		orderListIdTF.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("님의 주문내역 입니다.");
		lblNewLabel_15.setBounds(175, 13, 136, 15);
		orderListPanel.add(lblNewLabel_15);
		
		JScrollPane orderListScrollPane = new JScrollPane();
		orderListScrollPane.setBounds(12, 41, 330, 308);
		orderListPanel.add(orderListScrollPane);
		
		orderListTable = new JTable();
		orderListTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"\uC8FC\uBB38\uC77C\uC790", "\uAC15\uC758\uBA85", "\uC218\uB7C9", "\uAE08\uC561"
			}
		));
		orderListScrollPane.setViewportView(orderListTable);
	
		
		cartService=new CartService();
		orderService = new OrderService();
		productService = new ProductService();
		userService = new UserService();
		
		//테스트

//		loginUser = userService.findUser("user10");
//		loginUser = null;

		loginUser = userService.findUser("user4");

		
		displayCartList(loginUser);
	}
	public void changeUserTabPanel(int userPanelNo) {
	      tabbedPane.setSelectedIndex(0);
	       tabbedPane_1.setSelectedIndex(userPanelNo);
	   }
	   public void changeProductTabPanel(int productPanelNo,int productCategoryPanelNo) {
	      tabbedPane.setSelectedIndex(1);
	      tabbedPane_2.setSelectedIndex(productPanelNo);
	      tabbedPane_4.setSelectedIndex(productCategoryPanelNo);
	   }
	   public void changeOrderTabPanel(int orderPaneNo) {
	      tabbedPane.setSelectedIndex(2);
	      tabbedPane_3.setSelectedIndex(orderPaneNo);
	   }
	
	private void displayCartList(User loginUser) {
		try {
			List<Cart> cartList=cartService.getCartItemByUserId(loginUser.getUserId());
			int price = 0;
			
			Vector columVector=new Vector();
			columVector.add("번호");
			columVector.add("강의명");
			columVector.add("인원");
			columVector.add("가격");
			columVector.add("총금액");
			
			Vector tableVector=new Vector();
			for (Cart cart : cartList) {
				Vector rowVector=new Vector();
				rowVector.add(cart.getCart_no());
				rowVector.add(cart.getProduct().getProduct_name());
				rowVector.add(cart.getCart_qty());
				rowVector.add(cart.getProduct().getProduct_price());
				rowVector.add(cart.getCart_qty()*cart.getProduct().getProduct_price());
				tableVector.add(rowVector);

				price = price + cart.getCart_qty()*cart.getProduct().getProduct_price();
				
				
			}
			System.out.println(price);
			
			orderCartPriceTF.setText(String.valueOf(price));
			
			
			DefaultTableModel tableModel=new DefaultTableModel(tableVector,columVector);
			orderCartTable.setModel(tableModel);
		}catch (Exception e1) {
			System.out.println("카트리스트보기에러-->"+e1.getMessage());
		}
		
	}
	
	
}
