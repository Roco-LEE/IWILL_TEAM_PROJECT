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
import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderItem;
import com.itwill.shop.order.OrderService;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
import com.itwill.shop.userinfo.User;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.awt.Dimension;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.SystemColor;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class MainFrame_230724 extends JFrame {
	private UserService userService;
	private ProductService productService;
	private OrderService orderService;
	private CartService cartService;
	
	private User loginUser = null;
	private Product productEx = null;
	
	private JPanel contentPane;
	private JTextField userSignUpIdTF;
	private JTextField userSignupNameTF;
	private JTextField userSignupEmailTF;
	private JTextField userSignupBDTF;
	private JTextField userSignupPhoneTF;
	private JTextField userIdTF;
	private JTextField userNameTF;
	private JTextField userPhoneTF;
	private JPasswordField userPasswordTF;
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
	private JTextField productSearchTF;
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
	private JTable orderPayTable;
	private JTextField orderPayNameTF;
	private JTextField orderPayPhoneTF;
	private JTextField productCategoryTF;
	private JLabel idCheckMsgLabel;
	private JComboBox orderPayPaymentComboBox;
	private JTabbedPane tabbedPane_3;
	private JTabbedPane tabbedPane_1;
	private JTabbedPane tabbedPane;
	private JTabbedPane tabbedPane_2;
	private JTabbedPane tabbedPane_4;
	private JTextField cartByProductQtyTF;
	private JComboBox userEditSexComboBox;
	private JLabel userLoginIdMessageLabel;
	private JLabel userLoginPasswordMessageLabel;
	private JLabel userLoginNameMessageLabel;
	private JLabel userLoginPhoneMessageLabel;
	private JLabel productImageLabel;
	private JTextField productSeatLeftCountTF;
	private JComboBox productQtyComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame_Original frame = new MainFrame_Original();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame_230724() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 495);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("프로그램");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("로그아웃");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					logoutProcess();
					JOptionPane.showMessageDialog(null,"로그아웃 되었습니다");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("종료");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 364, 452);
		contentPane.add(tabbedPane);
		
		JPanel userTabPannel = new JPanel();
		tabbedPane.addTab("회원", null, userTabPannel, null);
		userTabPannel.setLayout(null);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 359, 423);
		userTabPannel.add(tabbedPane_1);
		
		JPanel userLoginPanel = new JPanel();
		tabbedPane_1.addTab("로그인", null, userLoginPanel, null);
		userLoginPanel.setLayout(null);
		
		userIdTF = new JTextField();
		userIdTF.setBounds(119, 43, 116, 21);
		userLoginPanel.add(userIdTF);
		userIdTF.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("아이디");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(50, 46, 57, 15);
		userLoginPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("비밀번호");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(50, 97, 57, 15);
		userLoginPanel.add(lblNewLabel_8);
		
		userNameTF = new JTextField();
		userNameTF.setBounds(119, 231, 116, 21);
		userLoginPanel.add(userNameTF);
		userNameTF.setColumns(10);
		
		userPhoneTF = new JTextField();
		userPhoneTF.setBounds(119, 277, 116, 21);
		userLoginPanel.add(userPhoneTF);
		userPhoneTF.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("이름");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(50, 234, 57, 15);
		userLoginPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("휴대전화");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(50, 280, 57, 15);
		userLoginPanel.add(lblNewLabel_10);
		
		JButton userLoginButton = new JButton("로그인");
		userLoginButton.addActionListener(new ActionListener() {
			/******** 로그인버튼클릭시 *********/
			// 1.입력유효성체크
			public void actionPerformed(ActionEvent e) {
				String userId = userIdTF.getText();
				String userPassword = userPasswordTF.getText();
				if (userId.equals("")) {
					userLoginIdMessageLabel.setText("아이디를 입력하세요");
					userIdTF.requestFocus();
					return;
				}
				if (userPassword.equals("")) {
					userLoginPasswordMessageLabel.setText("비밀번호를 입력하세요");
					userPasswordTF.requestFocus();
					return;
				}

				// 2.UserService.login 메쏘드호출
				/*********** 2.UserService.login 메쏘드호출 **************/

				try {

					int result = userService.login(userId, userPassword);
					// System.out.println(result);
					if (result == 1) {
						// 로그인 성공
						User loginUser = userService.findUser(userId);
						loginProcess(loginUser);
						displayUserInfo(loginUser);

					} else if (result == 0) {
						// 로그인 실패
						// JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인하세요.");
						userLoginIdMessageLabel.setText("아이디또는비밀번호가 일치하지않습니다.");
						userIdTF.requestFocus();
						userIdTF.setSelectionStart(0);
						userIdTF.setSelectionEnd(userId.length());
					}
				} catch (Exception e1) {

					e1.printStackTrace();
				}
			}

		});
		userLoginButton.setBounds(50, 147, 97, 23);
		userLoginPanel.add(userLoginButton);
		
		JButton noUserLoginButton = new JButton("비회원 로그인");
		noUserLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userName = userNameTF.getText();
				String userPhone = userPhoneTF.getText();

				if (userName.equals("")) {
					userLoginNameMessageLabel.setText("이름을 입력하세요");
					userIdTF.requestFocus();
					return;
				}
				if (userPhone.equals("")) {
					userLoginPhoneMessageLabel.setText("휴대번호를 입력하세요");
					userPhoneTF.requestFocus();
					return;
				}

				try {

					int result = userService.noUserLogin(userName, userPhone);

					if (result == 1) {
						User noUser = new User();
						noUser.setUserName(userName);
						noUser.setUserPhone(userPhone);
						noUser.setUserId(userName+userPhone.substring(9));

						System.out.println("userName: " + userName);
						System.out.println("userPhone: " + userPhone);

						//userService.noUserInsert(userName, userPhone);
						int num = userService.noUserUpdate(noUser);
						System.out.println("num: " + num);
						loginUser = noUser;
						setTitle(userName + " 님 로그인");
						System.out.println("test");

//				shopTabbedPane.setSelectedIndex(1);
//				productTabPanel.setSelectedIndex(0);
//				productCategoryTabPanel.setSelectedIndex(-1);

						changeProductTabPanel(0, -1);
						tabbedPane_1.setEnabledAt(0, false);
						tabbedPane_1.setEnabledAt(1, false);
						tabbedPane_1.setEnabledAt(2, false);
						tabbedPane_1.setEnabledAt(3, false);


					} else if (result == 0) {
						// 로그인 실패
						// JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인하세요.");
						userLoginPhoneMessageLabel.setText("올바른 휴대전화 형식이 아닙니다.(010-XXXX-XXXX)");

						userPhoneTF.requestFocus();
						userPhoneTF.setSelectionStart(0);
						userPhoneTF.setSelectionEnd(userPhone.length());
					}
				} catch (Exception e1) {

					e1.printStackTrace();
				}
			}

		});
		noUserLoginButton.setBounds(88, 325, 182, 23);
		userLoginPanel.add(noUserLoginButton);
		
		userPasswordTF = new JPasswordField();
		userPasswordTF.setBounds(119, 94, 116, 21);
		userLoginPanel.add(userPasswordTF);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 181, 330, 15);
		userLoginPanel.add(separator);
		
		JButton userLoginJoinButton = new JButton("가입");
		userLoginJoinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane_1.setSelectedIndex(1);
			}
		});
		userLoginJoinButton.setFont(new Font("굴림", Font.PLAIN, 12));
		userLoginJoinButton.setBounds(175, 147, 95, 23);
		userLoginPanel.add(userLoginJoinButton);
		
		userLoginIdMessageLabel = new JLabel("");
		userLoginIdMessageLabel.setForeground(Color.RED);
		userLoginIdMessageLabel.setBounds(60, 74, 226, 15);
		userLoginPanel.add(userLoginIdMessageLabel);
		
		userLoginPasswordMessageLabel = new JLabel("");
		userLoginPasswordMessageLabel.setForeground(Color.RED);
		userLoginPasswordMessageLabel.setBounds(60, 122, 224, 15);
		userLoginPanel.add(userLoginPasswordMessageLabel);
		
		userLoginNameMessageLabel = new JLabel("");
		userLoginNameMessageLabel.setBounds(61, 258, 203, 15);
		userLoginPanel.add(userLoginNameMessageLabel);
		
		userLoginPhoneMessageLabel = new JLabel("");
		userLoginPhoneMessageLabel.setBounds(6, 306, 343, 15);
		userLoginPanel.add(userLoginPhoneMessageLabel);
		
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
					/********************************************/
					if (passwordCheck.equals(password)) {
						passwordCheck = new String(userSignUpPwCheckTF.getPassword());
					} else {
						JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
						userSignUpPwCheckTF.requestFocus();
					}
					/******************************************/

					String name = userSignupNameTF.getText();
					String email = userSignupEmailTF.getText();
					String emailSend = "";
					if (userSignUpEmailCheckBox.isSelected()) {
						emailSend = "T";
					} else {
						emailSend = "F";
					}
					String birthdate = userSignupBDTF.getText();
					String phone = userSignupPhoneTF.getText();
					String sex = (String) userSignupSexComboBox.getSelectedItem();

					if (id.equals("")) {
						idCheckMsgLabel.setText("아이디를 입력하세요.");
						userSignUpIdTF.requestFocus();
						return;
					} else {
						idCheckMsgLabel.setText("");
					}
					if (passwordCheck.equals(password)) {
						User user = new User(id, password, passwordCheck, name, email, emailSend, birthdate, phone,
							sex);
						int isAdd = userService.addUser(user);
						if (isAdd==1) {
							// 로그인 화면으로 이동
							tabbedPane_1.setSelectedIndex(0);
						} else {
							JOptionPane.showMessageDialog(null, id + "당신의 가입은 실패하였습니다.");
						}

						System.out.println(user);
					}

				} catch (Exception e1) {
					System.out.println("회원가입에러 --> " + e1.getMessage());
				}
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
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean isUser = false;
				try {
					userService = new UserService();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					isUser = userService.isDuplicatedId(userSignUpIdTF.getText());
					if (isUser == true) {
						JOptionPane.showMessageDialog(null, "중복된 아이디 입니다.");
						userSignUpIdTF.setText("");
						userSignUpIdTF.requestFocus();
						return;
					} else {
						JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_41.setBounds(282, 24, 60, 23);
		userSignUpPanel.add(btnNewButton_41);
		
		idCheckMsgLabel = new JLabel("");
		idCheckMsgLabel.setForeground(new Color(255, 0, 0));
		idCheckMsgLabel.setBounds(68, 60, 240, 15);
		userSignUpPanel.add(idCheckMsgLabel);
		
		JPanel userEditPanel = new JPanel();
		userEditPanel.setBackground(SystemColor.inactiveCaption);
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
		
		userEditSexComboBox = new JComboBox();
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
		userEditEmailCheckBox.setBackground(SystemColor.inactiveCaption);
		userEditEmailCheckBox.setBounds(128, 161, 142, 23);
		userEditPanel.add(userEditEmailCheckBox);
		
		JButton userEditButton = new JButton("회원정보 수정");
		userEditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 정보 수정 기능 구현
            	String password = new String(userEditPwTF.getPassword());
            	String passwordCheck = new String(userEditPwCheckTF.getPassword());
                String name = userNameTF.getText();
                String email=userEditEmailTF.getText();
                //String emailCheck=userEditEmailCheckBox.getActionCommand();
                //String birth=userEditBDTF.getText();
                String phone=userEditPhoneTF.getText();
                String gender=userEditSexComboBox.getActionCommand();
                	               
                if (password.equals(passwordCheck)) {
                  //비번일치시 실행
                    loginUser.setUserName(name);
                    loginUser.setUserEmail(email);
                    String eSend = "";
					if (userEditEmailCheckBox.isSelected()) {
						eSend = "T";
					} else {
						eSend = "F";
					}
					loginUser.setUserEmailSend(eSend);
                    loginUser.setUserGender(gender);

                    try {
                        userService.UpdateUser(loginUser);
                        JOptionPane.showMessageDialog(null, "회원 정보가 수정되었습니다.");
                        
                    } catch (Exception e1) {
                        e1.printStackTrace();
                        JOptionPane.showMessageDialog(null, "회원 정보 수정에 실패했습니다.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "비밀번호와 비밀번호 확인이 일치하지 않습니다.");
                }
			}
		});
		userEditButton.setBounds(115, 296, 131, 23);
		userEditPanel.add(userEditButton);
		
		userEditPwTF = new JPasswordField();
		userEditPwTF.setBounds(128, 41, 142, 21);
		userEditPanel.add(userEditPwTF);
		
		userEditPwCheckTF = new JPasswordField();
		userEditPwCheckTF.setBounds(127, 72, 143, 21);
		userEditPanel.add(userEditPwCheckTF);
		
		JButton userEditQuitButton = new JButton("회원탈퇴");
		userEditQuitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/************ 회원 탈퇴 ************/
				try {
					userService.remove(loginUser.getUserId());
					JOptionPane.showMessageDialog(null,"회원탈퇴 되었습니다.");
					changeUserTabPanel(0);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		userEditQuitButton.setBounds(66, 332, 97, 23);
		userEditPanel.add(userEditQuitButton);
		
		JButton userEditQuitButton_1 = new JButton("로그아웃");
		userEditQuitButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					logoutProcess();
					JOptionPane.showMessageDialog(null,"로그아웃 되었습니다");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		userEditQuitButton_1.setBounds(210, 332, 97, 23);
		userEditPanel.add(userEditQuitButton_1);
		
		JPanel userFindPanel = new JPanel();
		tabbedPane_1.addTab("ID/PW찾기", null, userFindPanel, null);
		userFindPanel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 69, 152, 21);
		userFindPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("조회");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User newUser=new User();
				String userPhone=textField_1.getText();
				try {
					if(userService.findUserByPhone(userPhone) != null) {
					newUser=userService.findUserByPhone(userPhone);
					} else {
						JOptionPane.showMessageDialog(null, "없는 번호입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					userFindidTF.setText(newUser.getUserId());
					userFindPwTF.setText(newUser.getUserPw());
					
				}
			}
		);
		btnNewButton_2.setBounds(222, 68, 97, 23);
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
		
		JLabel lblNewLabel_28 = new JLabel("휴대폰 번호를 입력해준다면");
		lblNewLabel_28.setBounds(58, 44, 224, 15);
		userFindPanel.add(lblNewLabel_28);
		
		JPanel productTabPannel = new JPanel();
		tabbedPane.addTab("제품", null, productTabPannel, null);
		productTabPannel.setLayout(null);
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 359, 423);
		productTabPannel.add(tabbedPane_2);
		
		JPanel productMainPanel = new JPanel();
		tabbedPane_2.addTab("메인", null, productMainPanel, null);
		productMainPanel.setLayout(null);
		
		productSearchTF = new JTextField();
		productSearchTF.setText("오늘은 오일파스텔 배우자!");
		productSearchTF.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				productSearchTF.setText("");
			}
			
		});
		productSearchTF.setBounds(38, 10, 195, 21);
		productMainPanel.add(productSearchTF);
		productSearchTF.setColumns(10);
		
		JButton productSearchButton = new JButton("취미찾기");
		productSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//검색기능
				try {
					List<Product> productList = productService.productSearch(productSearchTF.getText());
					Product tempProduct = productList.get(0); 
					showView(tempProduct);
					
					tabbedPane_2.setSelectedIndex(5);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "찾으시는 상품이 없습니다.");;
				}
			}
		});
		productSearchButton.setBounds(245, 9, 97, 23);
		productMainPanel.add(productSearchButton);
		
		JLabel lblNewLabel_12 = new JLabel("수공예");
		lblNewLabel_12.setBounds(70, 162, 57, 15);
		productMainPanel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("요리");
		lblNewLabel_13.setBounds(242, 162, 57, 15);
		productMainPanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("미술");
		lblNewLabel_14.setBounds(73, 315, 57, 15);
		productMainPanel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_27 = new JLabel("플라워");
		lblNewLabel_27.setBounds(236, 312, 57, 15);
		productMainPanel.add(lblNewLabel_27);
		
		JPanel productMainHandCraftPanel = new JPanel();
		productMainHandCraftPanel.setBounds(36, 59, 111, 93);
		productMainPanel.add(productMainHandCraftPanel);
		
		JLabel productMainHandCraftLabel = new JLabel("");
		productMainHandCraftLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeProductTabPanel(1, 0);
			}
		});
		productMainHandCraftPanel.add(productMainHandCraftLabel);
		productMainHandCraftLabel.setIcon(new ImageIcon(MainFrame_230724.class.getResource("/images/product_main_handcraft (1).png")));
		
		JPanel productMainCookingPanel = new JPanel();
		productMainCookingPanel.setBounds(203, 60, 111, 93);
		productMainPanel.add(productMainCookingPanel);
		
		JLabel productMainCookingLabel = new JLabel("");
		productMainCookingLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeProductTabPanel(1, 1);
			}
		});
		productMainCookingPanel.add(productMainCookingLabel);
		productMainCookingLabel.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_main_cooking (1).png")));
		
		JPanel productMainDrawingPanel = new JPanel();
		productMainDrawingPanel.setBounds(38, 208, 111, 93);
		productMainPanel.add(productMainDrawingPanel);
		
		JLabel productMainDrawingLabel = new JLabel("");
		productMainDrawingLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeProductTabPanel(1, 2);
			}
		});
		productMainDrawingPanel.add(productMainDrawingLabel);
		productMainDrawingLabel.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_main_drawing (1).png")));
		
		JPanel productMainFlowerPanel = new JPanel();
		productMainFlowerPanel.setBounds(205, 208, 111, 93);
		productMainPanel.add(productMainFlowerPanel);
		
		JLabel productMainFlowerLabel = new JLabel("");
		productMainFlowerLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changeProductTabPanel(1, 3);
			}
		});
		productMainFlowerPanel.add(productMainFlowerLabel);
		productMainFlowerLabel.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_main_flower-bouquet (1) (1).png")));
		/******************* 상세페널로 이동 *******************/
		JPanel productCategoryPanel = new JPanel();
		tabbedPane_2.addTab("카테고리별", null, productCategoryPanel, null);
		productCategoryPanel.setLayout(null);
		
		tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(-1, 1, 354, 391);
		productCategoryPanel.add(tabbedPane_4);
		
		JPanel product_category_handcraft_panel = new JPanel();
		tabbedPane_4.addTab("수공예", null, product_category_handcraft_panel, null);
		product_category_handcraft_panel.setLayout(null);
		
		JPanel handcraftPannel1 = new JPanel();
		handcraftPannel1.setBounds(34, 24, 125, 125);
		product_category_handcraft_panel.add(handcraftPannel1);
		
		JLabel product_handcraft_image1 = new JLabel("");
		product_handcraft_image1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(5);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_handcraft_image1.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_handcraft(1).jpg")));
		handcraftPannel1.add(product_handcraft_image1);
		
		JPanel product_handcraft_pannel2_1 = new JPanel();
		product_handcraft_pannel2_1.setBounds(189, 24, 125, 125);
		product_category_handcraft_panel.add(product_handcraft_pannel2_1);
		
		JLabel product_handcraft_image2 = new JLabel("");		
		product_handcraft_image2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(6);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_handcraft_image2.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_handcraft(2).jpg")));
		product_handcraft_pannel2_1.add(product_handcraft_image2);
		
		JLabel product_handcraft_info1 = new JLabel("[성수] 물레 도자기 만들기");
		product_handcraft_info1.setFont(new Font("굴림", Font.PLAIN, 11));
		product_handcraft_info1.setBounds(34, 149, 128, 25);
		product_category_handcraft_panel.add(product_handcraft_info1);
		
		JLabel product_handcraft_info2 = new JLabel("[연남] 시그니처 향수제작");
		product_handcraft_info2.setFont(new Font("굴림", Font.PLAIN, 11));
		product_handcraft_info2.setBounds(189, 149, 128, 25);
		product_category_handcraft_panel.add(product_handcraft_info2);
		
		JPanel product_handcraft_pannel3_1 = new JPanel();
		product_handcraft_pannel3_1.setBounds(34, 184, 125, 125);
		product_category_handcraft_panel.add(product_handcraft_pannel3_1);
		
		JLabel product_handcraft_image3 = new JLabel("");
		product_handcraft_image3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(7);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_handcraft_image3.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_handcraft(3).jpg")));
		product_handcraft_pannel3_1.add(product_handcraft_image3);
		
		JPanel product_handcraft_pannel4_1 = new JPanel();
		product_handcraft_pannel4_1.setBounds(189, 184, 125, 125);
		product_category_handcraft_panel.add(product_handcraft_pannel4_1);
		
		JLabel product_handcraft_image4 = new JLabel("");
		product_handcraft_image4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(8);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_handcraft_image4.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_handcraft(4).jpg")));
		product_handcraft_pannel4_1.add(product_handcraft_image4);
		
		JLabel product_handcraft_info3 = new JLabel("[연남] 가죽공예 카드지갑");
		product_handcraft_info3.setFont(new Font("굴림", Font.PLAIN, 11));
		product_handcraft_info3.setBounds(34, 308, 128, 25);
		product_category_handcraft_panel.add(product_handcraft_info3);
		
		JLabel product_handcraft_info4 = new JLabel("[부산] 미니어처 소파제작");
		product_handcraft_info4.setFont(new Font("굴림", Font.PLAIN, 11));
		product_handcraft_info4.setBounds(189, 308, 128, 25);
		product_category_handcraft_panel.add(product_handcraft_info4);
		
		
		JPanel product_category_cooking_panel = new JPanel();
		tabbedPane_4.addTab("요리", null, product_category_cooking_panel, null);
		product_category_cooking_panel.setLayout(null);
		
		JPanel product_handcraft_pannel1_1_1 = new JPanel();
		product_handcraft_pannel1_1_1.setBounds(37, 22, 125, 125);
		product_category_cooking_panel.add(product_handcraft_pannel1_1_1);
		
		JLabel product_cooking_image1 = new JLabel("");
		product_cooking_image1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(9);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_cooking_image1.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_cooking(1).jpg")));
		product_handcraft_pannel1_1_1.add(product_cooking_image1);
		
		JPanel product_handcraft_pannel2_1_1 = new JPanel();
		product_handcraft_pannel2_1_1.setBounds(195, 35, 125, 102);
		product_category_cooking_panel.add(product_handcraft_pannel2_1_1);
		
		JLabel product_cooking_image2 = new JLabel("");
		product_cooking_image2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(10);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_cooking_image2.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_cooking(2).jpg")));
		product_handcraft_pannel2_1_1.add(product_cooking_image2);
		
		JLabel product_cooking_info1 = new JLabel("[서촌] 피낭시에 만들기");
		product_cooking_info1.setFont(new Font("굴림", Font.PLAIN, 11));
		product_cooking_info1.setBounds(37, 147, 128, 25);
		product_category_cooking_panel.add(product_cooking_info1);
		
		JLabel product_cooking_info2 = new JLabel("[망원] 레몬케이크 만들기");
		product_cooking_info2.setFont(new Font("굴림", Font.PLAIN, 11));
		product_cooking_info2.setBounds(192, 147, 128, 25);
		product_category_cooking_panel.add(product_cooking_info2);
		
		JPanel product_handcraft_pannel3_1_1 = new JPanel();
		product_handcraft_pannel3_1_1.setBounds(37, 182, 128, 125);
		product_category_cooking_panel.add(product_handcraft_pannel3_1_1);
		
		JLabel product_cooking_image3 = new JLabel("");
		product_cooking_image3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(11);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_cooking_image3.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_cooking(3).jpg")));
		product_handcraft_pannel3_1_1.add(product_cooking_image3);
		
		JPanel product_handcraft_pannel4_1_1 = new JPanel();
		product_handcraft_pannel4_1_1.setBounds(192, 194, 128, 102);
		product_category_cooking_panel.add(product_handcraft_pannel4_1_1);
		
		JLabel product_cooking_image4 = new JLabel("");
		product_cooking_image4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(12);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_cooking_image4.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_cooking(4).jpg")));
		product_handcraft_pannel4_1_1.add(product_cooking_image4);
		
		JLabel product_cooking_info3 = new JLabel("[마포] 크림마들렌 만들기");
		product_cooking_info3.setFont(new Font("굴림", Font.PLAIN, 11));
		product_cooking_info3.setBounds(37, 306, 128, 25);
		product_category_cooking_panel.add(product_cooking_info3);
		
		JLabel product_cooking_info4 = new JLabel("[하남] 말랑쿠키 만들기");
		product_cooking_info4.setFont(new Font("굴림", Font.PLAIN, 11));
		product_cooking_info4.setBounds(192, 306, 128, 25);
		product_category_cooking_panel.add(product_cooking_info4);
		
		JPanel productrr_category_drawing_panel = new JPanel();
		tabbedPane_4.addTab("미술", null, productrr_category_drawing_panel, null);
		productrr_category_drawing_panel.setLayout(null);
		
		JPanel product_handcraft_pannel1_1_2 = new JPanel();
		product_handcraft_pannel1_1_2.setBounds(34, 23, 128, 116);
		productrr_category_drawing_panel.add(product_handcraft_pannel1_1_2);
		
		JLabel product_drawing_image1 = new JLabel("");
		product_drawing_image1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(13);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_drawing_image1.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_drawing(1).jpg")));
		product_handcraft_pannel1_1_2.add(product_drawing_image1);
		
		JPanel product_handcraft_pannel2_1_2 = new JPanel();
		product_handcraft_pannel2_1_2.setBounds(189, 37, 128, 92);
		productrr_category_drawing_panel.add(product_handcraft_pannel2_1_2);
		
		JLabel product_drawing_image2 = new JLabel("");
		product_drawing_image2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(14);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_drawing_image2.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_drawing(2).jpg")));
		product_handcraft_pannel2_1_2.add(product_drawing_image2);
		
		JLabel product_drawing_info1 = new JLabel("[마포] 브릭베어 아크릴화");
		product_drawing_info1.setFont(new Font("굴림", Font.PLAIN, 11));
		product_drawing_info1.setBounds(34, 148, 128, 25);
		productrr_category_drawing_panel.add(product_drawing_info1);

		JLabel product_drawing_info2 = new JLabel("[중구] 이모티콘 제작판매");
		product_drawing_info2.setFont(new Font("굴림", Font.PLAIN, 11));
		product_drawing_info2.setBounds(189, 148, 128, 25);
		productrr_category_drawing_panel.add(product_drawing_info2);
		
		JPanel product_handcraft_pannel3_1_2 = new JPanel();
		product_handcraft_pannel3_1_2.setBounds(34, 183, 128, 125);
		productrr_category_drawing_panel.add(product_handcraft_pannel3_1_2);
		
		JLabel product_drawing_image3 = new JLabel("");
		product_drawing_image3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(15);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_drawing_image3.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_drawing(3).jpg")));
		product_handcraft_pannel3_1_2.add(product_drawing_image3);
		
		JPanel product_handcraft_pannel4_1_2 = new JPanel();
		product_handcraft_pannel4_1_2.setBounds(189, 183, 128, 125);
		productrr_category_drawing_panel.add(product_handcraft_pannel4_1_2);
		
		JLabel product_drawing_image4 = new JLabel("");
		product_drawing_image4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(16);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_drawing_image4.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_drawing(4).jpg")));
		product_handcraft_pannel4_1_2.add(product_drawing_image4);
		
		JLabel product_drawing_info3 = new JLabel("[합정] 나이프화 아크릴화");
		product_drawing_info3.setFont(new Font("굴림", Font.PLAIN, 11));
		product_drawing_info3.setBounds(34, 307, 128, 25);
		productrr_category_drawing_panel.add(product_drawing_info3);
		
		JLabel product_drawing_info4 = new JLabel("[홍대] 오일파스텔 체험");
		product_drawing_info4.setFont(new Font("굴림", Font.PLAIN, 11));
		product_drawing_info4.setBounds(189, 307, 128, 25);
		productrr_category_drawing_panel.add(product_drawing_info4);
		
		JPanel product_flower_panel = new JPanel();
		tabbedPane_4.addTab("플라워", null, product_flower_panel, null);
		product_flower_panel.setLayout(null);
		
		JPanel product_handcraft_pannel1 = new JPanel();
		product_handcraft_pannel1.setBounds(35, 24, 125, 125);
		product_flower_panel.add(product_handcraft_pannel1);
		
		JLabel product_flower_image1 = new JLabel("");
		product_flower_image1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(1);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		
		});
		
		product_flower_image1.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_flower(1).jpg")));
		product_handcraft_pannel1.add(product_flower_image1);
		
		JPanel product_handcraft_pannel2 = new JPanel();
		product_handcraft_pannel2.setBounds(190, 24, 125, 125);
		product_flower_panel.add(product_handcraft_pannel2);
		
		JLabel product_flower_image2 = new JLabel("");
		product_flower_image2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(2);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_flower_image2.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_flower(2).jpg")));
		product_handcraft_pannel2.add(product_flower_image2);
		
		JPanel product_handcraft_pannel3 = new JPanel();
		product_handcraft_pannel3.setBounds(35, 184, 125, 125);
		product_flower_panel.add(product_handcraft_pannel3);
		
		JLabel product_flower_image3 = new JLabel("");
		product_flower_image3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(3);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_flower_image3.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_flower(3).jpg")));
		product_handcraft_pannel3.add(product_flower_image3);
		
		JPanel product_handcraft_pannel4 = new JPanel();
		product_handcraft_pannel4.setBounds(190, 184, 125, 125);
		product_flower_panel.add(product_handcraft_pannel4);
		
		JLabel product_flower_image4 = new JLabel("");
		product_flower_image4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product product = productService.productDetail(4);
					showView(product);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				changeProductTabPanel(2, -1);
			}
		});
		product_flower_image4.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/images/product_flower(4).jpg")));
		product_handcraft_pannel4.add(product_flower_image4);
		
		JLabel product_flower_info1 = new JLabel("[종로] 나만의 작은정원");
		product_flower_info1.setFont(new Font("굴림", Font.PLAIN, 11));
		product_flower_info1.setBounds(35, 149, 128, 25);
		product_flower_panel.add(product_flower_info1);
		
		JLabel product_flower_info2 = new JLabel("[망원] 화병꽂이 만들기");
		product_flower_info2.setFont(new Font("굴림", Font.PLAIN, 11));
		product_flower_info2.setBounds(190, 149, 128, 25);
		product_flower_panel.add(product_flower_info2);
		
		JLabel product_flower_info4 = new JLabel("[마포] 이벤트 새벽정원");
		product_flower_info4.setFont(new Font("굴림", Font.PLAIN, 11));
		product_flower_info4.setBounds(190, 308, 128, 25);
		product_flower_panel.add(product_flower_info4);
		
		JLabel product_flower_info3 = new JLabel("[송파] 미니 플라워 바구니");
		product_flower_info3.setFont(new Font("굴림", Font.PLAIN, 11));
		product_flower_info3.setBounds(35, 308, 128, 25);
		product_flower_panel.add(product_flower_info3);
		
		
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
		productDetailTF.setBounds(37, 169, 280, 124);
		productDetailPanel.add(productDetailTF);
		productDetailTF.setColumns(10);
		
		productDateTF = new JTextField();
		productDateTF.setEditable(false);
		productDateTF.setText("날짜");
		productDateTF.setBounds(201, 138, 116, 21);
		productDetailPanel.add(productDateTF);
		productDateTF.setColumns(10);
		
		productImageLabel = new JLabel("");
		productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLabel.setIcon(new ImageIcon(MainFrame_Original.class.getResource("/images/nothing.jpg")));
		productImageLabel.setBounds(12, 14, 158, 149);
		productDetailPanel.add(productImageLabel);
		
		productQtyComboBox = new JComboBox();
		productQtyComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		productQtyComboBox.setBounds(37, 339, 127, 23);
		productDetailPanel.add(productQtyComboBox);
		
		JButton productCartButton = new JButton("장바구니 담기");
		productCartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product tempProduct;
				try {
					tempProduct = productEx;
					showCartNameView(tempProduct);
					JOptionPane.showMessageDialog(null, "장바구니에 상품이 담겼습니다!");
					changeOrderTabPanel(0);
					displayCartList(loginUser);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		productCartButton.setBounds(201, 303, 116, 23);
		productDetailPanel.add(productCartButton);
		
		JButton productPayButton = new JButton("주문하기");
		productPayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Product tempProduct;
				try {
					tempProduct = productEx;
					showCartNameView(tempProduct);
					JOptionPane.showMessageDialog(null, "장바구니에 상품이 담겼습니다!");
					changeOrderTabPanel(1);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		productPayButton.setBounds(201, 339, 116, 23);
		productDetailPanel.add(productPayButton);
		
		productCategoryTF = new JTextField();
		productCategoryTF.setText("카테고리");
		productCategoryTF.setEditable(false);
		productCategoryTF.setBounds(201, 14, 116, 21);
		productDetailPanel.add(productCategoryTF);
		productCategoryTF.setColumns(10);
		
		productSeatLeftCountTF = new JTextField();
		productSeatLeftCountTF.setText("남은 인원수");
		productSeatLeftCountTF.setEditable(false);
		productSeatLeftCountTF.setColumns(10);
		productSeatLeftCountTF.setBounds(37, 303, 127, 21);
		productDetailPanel.add(productSeatLeftCountTF);
		
		JPanel orderTabPannel = new JPanel();
		tabbedPane.addTab("주문", null, orderTabPannel, null);
		orderTabPannel.setLayout(null);
		
		tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(loginUser != null) {
					int selectedIndex = tabbedPane.getSelectedIndex();
	                if (selectedIndex == 2) {
	                	// 장바구니 로딩
	                	displayCartList(loginUser);
	                	
	                	// 카트 to 결제
	                	orderPayNameTF.setText(loginUser.getUserName());
	                	orderPayPhoneTF.setText(loginUser.getUserPhone());
	                	
	                	
	                	// 결제내용 로딩
	    				orderListIdTF.setText(loginUser.getUserId());
	    				displayOrderList(loginUser);
	                }
				}
			}
		});
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
				if(selectedQty == null) {
					cartByProductQtyTF.setText("0");
				} else {
				cartByProductQtyTF.setText(selectedQty+"");
				}
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
		orderCartPriceTF.setText("0");
		orderCartPriceTF.setHorizontalAlignment(SwingConstants.RIGHT);
		orderCartPriceTF.setEditable(false);
		orderCartPriceTF.setBounds(201, 177, 116, 21);
		orderCartPanel.add(orderCartPriceTF);
		orderCartPriceTF.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("총 결제금액 :");
		lblNewLabel_16.setBounds(122, 180, 90, 15);
		orderCartPanel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("원");
		lblNewLabel_17.setBounds(320, 180, 22, 15);
		orderCartPanel.add(lblNewLabel_17);
		
		orderCartNameTF = new JTextField();
		orderCartNameTF.setEditable(false);
		orderCartNameTF.setBounds(102, 208, 215, 21);
		orderCartPanel.add(orderCartNameTF);
		orderCartNameTF.setColumns(10);
		
		orderCartDetailTF = new JTextField();
		orderCartDetailTF.setEditable(false);
		orderCartDetailTF.setBounds(102, 239, 215, 21);
		orderCartPanel.add(orderCartDetailTF);
		orderCartDetailTF.setColumns(10);
		
		orderCartDateTF = new JTextField();
		orderCartDateTF.setEditable(false);
		orderCartDateTF.setBounds(102, 270, 215, 21);
		orderCartPanel.add(orderCartDateTF);
		orderCartDateTF.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("강의명 :");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setBounds(33, 211, 57, 15);
		orderCartPanel.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("강의상세 :");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setBounds(33, 242, 57, 15);
		orderCartPanel.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("강의일자 :");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setBounds(33, 273, 57, 15);
		orderCartPanel.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("수강인원 :");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(20, 305, 70, 15);
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
		orderCartQtyMinusButton.setBounds(102, 301, 53, 23);
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
		orderCartQtyPlusButton.setBounds(264, 301, 53, 23);
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
		orderCartEditButton.setBounds(30, 330, 97, 23);
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
		orderCartDeleteButton.setBounds(136, 330, 97, 23);
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
		orderCartPayButton.setBounds(245, 330, 97, 23);
		orderCartPanel.add(orderCartPayButton);
		
		cartByProductQtyTF = new JTextField();
		cartByProductQtyTF.setEditable(false);
		cartByProductQtyTF.setHorizontalAlignment(SwingConstants.CENTER);
		cartByProductQtyTF.setBounds(167, 302, 75, 21);
		orderCartPanel.add(cartByProductQtyTF);
		cartByProductQtyTF.setColumns(10);
		
		JPanel orderPayPanel = new JPanel();
		orderPayPanel.setLayout(null);
		tabbedPane_3.addTab("결제", null, orderPayPanel, null);
		
		JScrollPane orderPayScrollPane = new JScrollPane();
		orderPayScrollPane.setBounds(12, 10, 330, 142);
		orderPayPanel.add(orderPayScrollPane);
		
		orderPayTable = new JTable();
		orderPayTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		orderPayTable.setModel(new DefaultTableModel(
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
		orderPayScrollPane.setViewportView(orderPayTable);
		
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
		orderPayPayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, orderPayPaymentComboBox.getSelectedItem() + "로 결제합니다.");
				try {
					cartToOrder(loginUser.getUserId());
					displayCartList(loginUser);
					displayOrderList(loginUser);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				tabbedPane_3.setSelectedIndex(2);
			}
		});
		orderPayPayButton.setBounds(123, 335, 97, 23);
		orderPayPanel.add(orderPayPayButton);
		
		orderPayPaymentComboBox = new JComboBox();
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
		orderListIdTF.setHorizontalAlignment(SwingConstants.RIGHT);
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
		
		try {
			userService = new UserService();
			productService = new ProductService();
			orderService = new OrderService();
			cartService = new CartService();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		tabbedPane_1.setEnabledAt(2, false);
		
	}//생성자
	
	// 메서드
	// 공통파트
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
	
	// 유저파트
	public void loginProcess(User loginUser) {
		this.loginUser = loginUser;
		setTitle(loginUser.getUserId() + " 님 로그인");
		tabbedPane_1.setEnabledAt(0, false);
		tabbedPane_1.setEnabledAt(1, false);
		tabbedPane_1.setEnabledAt(2, true);
		tabbedPane_1.setSelectedIndex(2);

	}
	
	public void logoutProcess() throws Exception {
		/*
		 * 1. ShopMainFrame의멤버변수에 로그인한User객삭제 2. ShopMainFrame의 타이틀변경
		 */
		this.loginUser = null;
		setTitle("");
		tabbedPane_1.setEnabledAt(0, true);
		tabbedPane_1.setEnabledAt(1, true);
		tabbedPane_1.setEnabledAt(2, false);
		tabbedPane_1.setSelectedIndex(0);
	}
	
	private void displayUserInfo(User user) {
		/**** 로그인한 회원상세데이타 보여주기 *****/
		userEditIDTF.setText(user.getUserId());
		userEditPwTF.setText(user.getUserPw());
		userEditPwTF.setText(user.getUserPwCheck());
		userEditNameTF.setText(user.getUserName());
		userEditEmailTF.setText(user.getUserEmail());
		userEditBDTF.setText(user.getUserJumin());
		userEditPhoneTF.setText(user.getUserPhone());
		userEditSexComboBox.setSelectedItem(user.getUserGender());

	}
	
	// 제품파트
	public void showView(Product product) {
		String imageStr = product.getProduct_image();
		productImageLabel.setIcon(new ImageIcon(MainFrameProduct_FINAL.class.getResource("/" + imageStr)));
//		productImageLabel.setIcon(new ImageIcon(MainFrameProduct.class.getResource("/images/nothing.jpg")));
		productCategoryTF.setText(product.getProduct_category());
		productNameTF.setText(product.getProduct_name());
		productPriceTF.setText(String.valueOf(product.getProduct_price()));//이 줄 위에다 read_count 증가시길것
		productReadCountTF.setText(String.valueOf(product.getProduct_read_count()));
		productDateTF.setText(String.valueOf(product.getProduct_start_date()));
		productDetailTF.setText(product.getProduct_detail());
		productSeatLeftCountTF.setText("모집중\t"+String.valueOf(product.getProduct_seatLeft_count())+"/8명");
		productEx = product;
		
	}
	
	//제품 상세페이지 장바구니 담기 버튼 메소드 TEST
	public void showCartNameView(Product product) throws Exception{
		Cart tempCart = new Cart(0, Integer.parseInt((String)productQtyComboBox.getSelectedItem()), loginUser.getUserId(), product);
		cartService.addCart(tempCart);
	}
	
	
	// 주문파트
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
			orderCartPriceTF.setText(String.valueOf(price));
			orderPayPriceTF.setText(String.valueOf(price));
			
			DefaultTableModel tableModel=new DefaultTableModel(tableVector,columVector);
			orderCartTable.setModel(tableModel);
			orderPayTable.setModel(tableModel);
		}catch (Exception e1) {
			System.out.println("카트리스트보기에러-->"+e1.getMessage());
		}
		
	}
	
	
	private void displayOrderList(User loginUser) {
		try {
			/***************회원리스트보기[JTable]************/
			List<OrderItem> orderList = orderService.oiList(loginUser.getUserId());
			
			Vector columVector = new Vector();
			columVector.add("순번");
			columVector.add("강의명");
			columVector.add("수량");
			columVector.add("금액");
			
			Vector tableVector = new Vector();
			for (int i = 0; i < orderList.size(); i++) {
				Vector rowVector = new Vector();
				rowVector.add(i+1);
				rowVector.add(orderList.get(i).getProduct().getProduct_name());
				rowVector.add(orderList.get(i).getOiQty());
				rowVector.add(orderList.get(i).getOiQty() * orderList.get(i).getProduct().getProduct_price());
				tableVector.add(rowVector);
			}
			
			DefaultTableModel tableModel = new DefaultTableModel(tableVector, columVector);
			orderListTable.setModel(tableModel);
			
		}catch(Exception e1) {
			System.out.println("회원리스트보기에러-->"+e1.getMessage());
			
		}
	}
	
	public void cartToOrder(String userId) throws Exception {
		userId = loginUser.getUserId();
		orderService.create(userId);
	}
	
	public void cartToOrder(String userId, int productNo, int productQty) throws Exception {
		userId = loginUser.getUserId();
		orderService.create(userId, productNo, productQty);
	}
}
