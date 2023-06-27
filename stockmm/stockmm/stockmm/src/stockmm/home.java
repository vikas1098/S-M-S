
package stockmm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import com.jtattoo.plaf.smart.*;


public class home extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
   
    public home() {
        initComponents();
        
        setResizable(false);
        Date date= new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        String dt=formatter.format(date);
        lbldate.setText("Date :  "+dt);
        
         new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d=new Date();
       SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
       lbltime.setText("Time :  "+sdf.format(d));
            }
        }
       ).start();
        
       
        
         try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=stocknav;user=sa;password=1234");
		//JOptionPane.showMessageDialog(this, "Conection Done");
                
                FillTable(tbcdata, "Select  *from tb_customer order by ccode");
                 FillTable(tblitem, "Select  *from tb_item order by pid");
		 FillTable(tblf4, "Select  *from tbf4 order by date");
		 FillTable(tblvf4, "Select  id,cname,pname,pcode,f4,sdata,skg,date from tb_vendor order by date");
               
                ps=con.prepareStatement("select *from tb_customer");
		ResultSet rs;
		rs=ps.executeQuery();
		while(rs.next())
		{
                  cbcname.addItem(rs.getString(2));
                  cbcname2.addItem(rs.getString(2));
                  cbcname3.addItem(rs.getString(2));
		  cbcnamev.addItem(rs.getString(2));
		}
		
		ps=con.prepareStatement("select pname from tb_item");
		ResultSet r;
		r=ps.executeQuery();
		while(r.next())
		{
			cbpnamev.addItem(r.getString("pname"));
		}
	}
	catch(Exception ex)
	{
            JOptionPane.showMessageDialog(this, ex);
	}
         
    }

   
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jSeparator1 = new javax.swing.JSeparator();
                tabpane = new javax.swing.JTabbedPane();
                Customer = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                txtcname = new javax.swing.JTextField();
                txtadd = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                txtgst = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                txtph = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                tbcdata = new javax.swing.JTable();
                btnsave = new javax.swing.JButton();
                item = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                cbcname = new javax.swing.JComboBox<>();
                jLabel7 = new javax.swing.JLabel();
                txtpname = new javax.swing.JTextField();
                txtpcode = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                txthsn = new javax.swing.JTextField();
                btnstocksave = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                tblitem = new javax.swing.JTable();
                F4 = new javax.swing.JPanel();
                txtrmi = new javax.swing.JTextField();
                jLabel17 = new javax.swing.JLabel();
                txt57f4 = new javax.swing.JTextField();
                jLabel26 = new javax.swing.JLabel();
                jLabel27 = new javax.swing.JLabel();
                txtstockdata = new javax.swing.JTextField();
                jScrollPane4 = new javax.swing.JScrollPane();
                tblf4 = new javax.swing.JTable();
                jLabel28 = new javax.swing.JLabel();
                cbcname3 = new javax.swing.JComboBox<>();
                cbpname2 = new javax.swing.JComboBox<>();
                jLabel29 = new javax.swing.JLabel();
                jLabel30 = new javax.swing.JLabel();
                txtpcode3 = new javax.swing.JTextField();
                btnsavef4 = new javax.swing.JButton();
                jLabel31 = new javax.swing.JLabel();
                dcdate2 = new com.toedter.calendar.JDateChooser();
                Stock = new javax.swing.JPanel();
                jLabel13 = new javax.swing.JLabel();
                cbcname2 = new javax.swing.JComboBox<>();
                jLabel14 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                cbpname = new javax.swing.JComboBox<>();
                txtrmi2 = new javax.swing.JTextField();
                jLabel18 = new javax.swing.JLabel();
                jLabel19 = new javax.swing.JLabel();
                txtchallan = new javax.swing.JTextField();
                jLabel20 = new javax.swing.JLabel();
                txtqty = new javax.swing.JTextField();
                jLabel21 = new javax.swing.JLabel();
                txtkg = new javax.swing.JTextField();
                jScrollPane3 = new javax.swing.JScrollPane();
                tbldailydata = new javax.swing.JTable();
                jLabel22 = new javax.swing.JLabel();
                txtstock2 = new javax.swing.JTextField();
                dcdate = new com.toedter.calendar.JDateChooser();
                jLabel23 = new javax.swing.JLabel();
                txtrestock = new javax.swing.JTextField();
                jLabel24 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                txtdstock = new javax.swing.JTextField();
                btnsavejw = new javax.swing.JButton();
                txtpcode2 = new javax.swing.JTextField();
                txtf4 = new javax.swing.JTextField();
                vendor = new javax.swing.JPanel();
                jLabel32 = new javax.swing.JLabel();
                cbcnamev = new javax.swing.JComboBox<>();
                jLabel33 = new javax.swing.JLabel();
                cbpnamev = new javax.swing.JComboBox<>();
                jLabel34 = new javax.swing.JLabel();
                txtpcodev = new javax.swing.JTextField();
                jLabel35 = new javax.swing.JLabel();
                txt57f4v = new javax.swing.JTextField();
                dcdatev = new com.toedter.calendar.JDateChooser();
                jLabel36 = new javax.swing.JLabel();
                txtstockdatav = new javax.swing.JTextField();
                jLabel37 = new javax.swing.JLabel();
                jScrollPane5 = new javax.swing.JScrollPane();
                tblvf4 = new javax.swing.JTable();
                btnsavef5 = new javax.swing.JButton();
                jLabel38 = new javax.swing.JLabel();
                txtskgv = new javax.swing.JTextField();
                jPanel1 = new javax.swing.JPanel();
                cbcnamevi = new javax.swing.JComboBox<>();
                jLabel39 = new javax.swing.JLabel();
                cbpnamevi = new javax.swing.JComboBox<>();
                jLabel40 = new javax.swing.JLabel();
                jLabel41 = new javax.swing.JLabel();
                txtpcodevi = new javax.swing.JTextField();
                jLabel42 = new javax.swing.JLabel();
                txtf4vi = new javax.swing.JTextField();
                jLabel43 = new javax.swing.JLabel();
                txtqtyvi = new javax.swing.JTextField();
                jLabel44 = new javax.swing.JLabel();
                txtkgvi = new javax.swing.JTextField();
                txtchallanvi = new javax.swing.JTextField();
                jLabel45 = new javax.swing.JLabel();
                dcdatevi = new com.toedter.calendar.JDateChooser();
                jLabel46 = new javax.swing.JLabel();
                jLabel47 = new javax.swing.JLabel();
                txtstock3 = new javax.swing.JTextField();
                txtdstock1 = new javax.swing.JTextField();
                jLabel48 = new javax.swing.JLabel();
                jLabel49 = new javax.swing.JLabel();
                txtrestock1 = new javax.swing.JTextField();
                btnsavejw1 = new javax.swing.JButton();
                jScrollPane6 = new javax.swing.JScrollPane();
                tbldailydata1 = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                lbldate = new javax.swing.JLabel();
                lbltime = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                Customer.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                CustomerMouseClicked(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel2.setText("Company Name :");

                txtcname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                txtadd.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel3.setText("Address  :");

                txtgst.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtgst.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtgstActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel4.setText("GST No.  :");

                jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel5.setText("Contact :");

                txtph.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                tbcdata.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                tbcdata.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null}
                        },
                        new String [] {
                                "Comapny Code", "Comapny Name", "Address", "GST No", "Contact No"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tbcdata.setColumnSelectionAllowed(true);
                tbcdata.setRowHeight(20);
                tbcdata.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tbcdataMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tbcdata);
                tbcdata.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

                btnsave.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                btnsave.setText("Save");
                btnsave.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnsaveActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout CustomerLayout = new javax.swing.GroupLayout(Customer);
                Customer.setLayout(CustomerLayout);
                CustomerLayout.setHorizontalGroup(
                        CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CustomerLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                .addGap(65, 65, 65)
                                .addGroup(CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtgst, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(CustomerLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtph, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(CustomerLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                                .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(52, 52, 52))
                        .addGroup(CustomerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(CustomerLayout.createSequentialGroup()
                                .addGap(352, 352, 352)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                CustomerLayout.setVerticalGroup(
                        CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CustomerLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtgst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                tabpane.addTab("Customer", Customer);

                item.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                itemMouseClicked(evt);
                        }
                });

                jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel6.setText("Company Name :");

                cbcname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbcname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

                jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel7.setText("Part Name :");

                txtpname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                txtpcode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel8.setText("Part Code/No. :");

                jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel9.setText("HSN Code :");

                txthsn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                btnstocksave.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                btnstocksave.setText("Save");
                btnstocksave.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnstocksaveActionPerformed(evt);
                        }
                });

                tblitem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                tblitem.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null}
                        },
                        new String [] {
                                "N A V CODE", "Comapny Name", "Part Name", "P code", "HSN Code"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                true, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblitem.setColumnSelectionAllowed(true);
                tblitem.setRowHeight(20);
                tblitem.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblitemMouseClicked(evt);
                        }
                });
                jScrollPane2.setViewportView(tblitem);
                tblitem.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                if (tblitem.getColumnModel().getColumnCount() > 0) {
                        tblitem.getColumnModel().getColumn(3).setHeaderValue("P code");
                }

                javax.swing.GroupLayout itemLayout = new javax.swing.GroupLayout(item);
                item.setLayout(itemLayout);
                itemLayout.setHorizontalGroup(
                        itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(itemLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8))
                                .addGap(56, 56, 56)
                                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtpcode, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(cbcname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(itemLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(55, 55, 55)
                                                .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(itemLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txthsn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(79, 79, 79))
                        .addGroup(itemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
                        .addGroup(itemLayout.createSequentialGroup()
                                .addGap(347, 347, 347)
                                .addComponent(btnstocksave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                itemLayout.setVerticalGroup(
                        itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(itemLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(cbcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtpcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(txthsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(btnstocksave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                tabpane.addTab("Item Master", item);

                txtrmi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel17.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel17.setText("R M I No. :");

                txt57f4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel26.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel26.setText("57 F4 No. :");

                jLabel27.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel27.setText("Stock Data :");

                txtstockdata.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                tblf4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                tblf4.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "F4 Code", "Comapny Name", "57 F4", "Part Name", "P Code", "R M I No", "Stock ", "Date"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblf4.setColumnSelectionAllowed(true);
                tblf4.setRowHeight(20);
                tblf4.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblf4MouseClicked(evt);
                        }
                });
                jScrollPane4.setViewportView(tblf4);
                tblf4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                if (tblf4.getColumnModel().getColumnCount() > 0) {
                        tblf4.getColumnModel().getColumn(0).setMinWidth(60);
                        tblf4.getColumnModel().getColumn(0).setMaxWidth(60);
                        tblf4.getColumnModel().getColumn(5).setHeaderValue("R M I No");
                }

                jLabel28.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel28.setText("Company Name :");

                cbcname3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbcname3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
                cbcname3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbcname3ActionPerformed(evt);
                        }
                });

                cbpname2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbpname2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
                cbpname2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbpname2ActionPerformed(evt);
                        }
                });

                jLabel29.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel29.setText("Part Name :");

                jLabel30.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel30.setText("Part Code/No. :");

                txtpcode3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                btnsavef4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                btnsavef4.setText("Save");
                btnsavef4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnsavef4ActionPerformed(evt);
                        }
                });

                jLabel31.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel31.setText("Date :");

                dcdate2.setDateFormatString("dd/MM/yyyy");
                dcdate2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                javax.swing.GroupLayout F4Layout = new javax.swing.GroupLayout(F4);
                F4.setLayout(F4Layout);
                F4Layout.setHorizontalGroup(
                        F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(F4Layout.createSequentialGroup()
                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(F4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane4))
                                        .addGroup(F4Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel26)
                                                        .addComponent(jLabel28)
                                                        .addComponent(jLabel30)
                                                        .addComponent(jLabel31))
                                                .addGap(45, 45, 45)
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtpcode3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbcname3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt57f4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dcdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(F4Layout.createSequentialGroup()
                                                                .addGap(53, 53, 53)
                                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(F4Layout.createSequentialGroup()
                                                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jLabel29)
                                                                                        .addComponent(jLabel17))
                                                                                .addGap(81, 81, 81)
                                                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(cbpname2, 0, 150, Short.MAX_VALUE)
                                                                                        .addComponent(txtrmi)))
                                                                        .addGroup(F4Layout.createSequentialGroup()
                                                                                .addComponent(jLabel27)
                                                                                .addGap(81, 81, 81)
                                                                                .addComponent(txtstockdata))))
                                                        .addGroup(F4Layout.createSequentialGroup()
                                                                .addGap(119, 119, 119)
                                                                .addComponent(btnsavef4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 68, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                F4Layout.setVerticalGroup(
                        F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(F4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(F4Layout.createSequentialGroup()
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbcname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel28))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtpcode3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel30))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel26)
                                                        .addComponent(txt57f4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(F4Layout.createSequentialGroup()
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbpname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel29))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtrmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel17))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtstockdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel27))))
                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(F4Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(F4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dcdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel31)))
                                        .addGroup(F4Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(btnsavef4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                tabpane.addTab("57F4", F4);

                jLabel13.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel13.setText("Company Name :");

                cbcname2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbcname2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
                cbcname2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbcname2ActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel14.setText("Part Name :");

                jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel15.setText("Part Code/No. :");

                jLabel16.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel16.setText("57 F4 No. :");

                cbpname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbpname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
                cbpname.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbpnameActionPerformed(evt);
                        }
                });

                txtrmi2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel18.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel18.setText("R M I No. :");

                jLabel19.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel19.setText("Challan No. :");

                txtchallan.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel20.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel20.setText("Qty in Pcs :");

                txtqty.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel21.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel21.setText("Qty in KG :");

                txtkg.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                tbldailydata.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                tbldailydata.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null}
                        },
                        new String [] {
                                "Date", "Part Name", "Qty", "Weight", "Challan No."
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                true, false, false, true, true
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tbldailydata.setRowHeight(20);
                tbldailydata.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tbldailydataMouseClicked(evt);
                        }
                });
                jScrollPane3.setViewportView(tbldailydata);
                tbldailydata.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

                jLabel22.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel22.setText("Total Stock :");

                txtstock2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtstock2.setForeground(new java.awt.Color(255, 0, 51));
                txtstock2.setEnabled(false);

                dcdate.setDateFormatString("dd/MM/yyyy");
                dcdate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel23.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel23.setText("Date :");

                txtrestock.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtrestock.setForeground(new java.awt.Color(255, 0, 51));
                txtrestock.setEnabled(false);

                jLabel24.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel24.setText("Remaining Stock :");

                jLabel25.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel25.setText("Done Stock :");

                txtdstock.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtdstock.setForeground(new java.awt.Color(255, 0, 51));
                txtdstock.setEnabled(false);

                btnsavejw.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                btnsavejw.setText("Save");
                btnsavejw.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnsavejwActionPerformed(evt);
                        }
                });

                txtpcode2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtpcode2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtpcode2ActionPerformed(evt);
                        }
                });

                txtf4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtf4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtf4ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout StockLayout = new javax.swing.GroupLayout(Stock);
                Stock.setLayout(StockLayout);
                StockLayout.setHorizontalGroup(
                        StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StockLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(StockLayout.createSequentialGroup()
                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel13)
                                                                        .addComponent(jLabel15))
                                                                .addGroup(StockLayout.createSequentialGroup()
                                                                        .addComponent(jLabel20)
                                                                        .addGap(36, 36, 36)))
                                                        .addComponent(jLabel18))
                                                .addGap(61, 61, 61)
                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtqty, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtpcode2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbcname2, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                                                        .addComponent(txtrmi2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jLabel23)
                                                        .addComponent(jLabel16))
                                                .addGap(67, 67, 67)
                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtkg, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtchallan, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dcdate, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                        .addComponent(cbpname, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtf4))
                                                .addGap(76, 76, 76))
                                        .addGroup(StockLayout.createSequentialGroup()
                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(StockLayout.createSequentialGroup()
                                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(61, 61, 61)
                                                                .addComponent(txtrestock))
                                                        .addGroup(StockLayout.createSequentialGroup()
                                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(61, 61, 61)
                                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtstock2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtdstock, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(99, 99, 99)
                                                .addComponent(btnsavejw, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StockLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3)
                                .addContainerGap())
                );
                StockLayout.setVerticalGroup(
                        StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(StockLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(cbcname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)
                                        .addComponent(cbpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(txtpcode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)
                                        .addComponent(txtf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(txtchallan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18)
                                        .addComponent(txtrmi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21)
                                        .addComponent(txtkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dcdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel22)
                                                .addComponent(txtstock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel23)))
                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(StockLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel25)
                                                        .addComponent(txtdstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(StockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel24)
                                                        .addComponent(txtrestock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(StockLayout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(btnsavejw, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                .addContainerGap())
                );

                tabpane.addTab("JW Stock", Stock);

                jLabel32.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel32.setText("Company Name :");

                cbcnamev.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbcnamev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
                cbcnamev.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbcnamevActionPerformed(evt);
                        }
                });

                jLabel33.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel33.setText("Part Name :");

                cbpnamev.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbpnamev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
                cbpnamev.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbpnamevActionPerformed(evt);
                        }
                });

                jLabel34.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel34.setText("Part Code/No. :");

                txtpcodev.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel35.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel35.setText("57 F4 No. :");

                txt57f4v.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                dcdatev.setDateFormatString("dd/MM/yyyy");
                dcdatev.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel36.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel36.setText("Date :");

                txtstockdatav.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel37.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel37.setText("Stock Data :");

                tblvf4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                tblvf4.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "F4 Code", "Comapny Name", "Part Name", "P Code", "57 F4", "Stock ", "Stock KG", "Date"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblvf4.setColumnSelectionAllowed(true);
                tblvf4.setRowHeight(20);
                tblvf4.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tblvf4MouseClicked(evt);
                        }
                });
                jScrollPane5.setViewportView(tblvf4);
                tblvf4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                if (tblvf4.getColumnModel().getColumnCount() > 0) {
                        tblvf4.getColumnModel().getColumn(0).setMinWidth(60);
                        tblvf4.getColumnModel().getColumn(0).setMaxWidth(60);
                }

                btnsavef5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                btnsavef5.setText("Save");
                btnsavef5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnsavef5ActionPerformed(evt);
                        }
                });

                jLabel38.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel38.setText("Stock in KG :");

                txtskgv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                javax.swing.GroupLayout vendorLayout = new javax.swing.GroupLayout(vendor);
                vendor.setLayout(vendorLayout);
                vendorLayout.setHorizontalGroup(
                        vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vendorLayout.createSequentialGroup()
                                .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(vendorLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cbpnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, vendorLayout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel38)
                                                .addGap(74, 74, 74)
                                                .addComponent(txtskgv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(89, 89, 89)
                                                .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(vendorLayout.createSequentialGroup()
                                                                .addComponent(btnsavef5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(vendorLayout.createSequentialGroup()
                                                                .addComponent(jLabel36)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(dcdatev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(vendorLayout.createSequentialGroup()
                                                                .addComponent(jLabel37)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                                                .addComponent(txtstockdatav, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(78, 78, 78))
                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(vendorLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane5)
                                                .addGroup(vendorLayout.createSequentialGroup()
                                                        .addGap(49, 49, 49)
                                                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel35)
                                                                .addComponent(jLabel32)
                                                                .addComponent(jLabel34))
                                                        .addGap(45, 45, 45)
                                                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtpcodev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cbcnamev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txt57f4v, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(88, 88, 88)
                                                        .addComponent(jLabel33)
                                                        .addGap(0, 299, Short.MAX_VALUE)))
                                        .addContainerGap()))
                );
                vendorLayout.setVerticalGroup(
                        vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(vendorLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(cbpnamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtstockdatav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel36)
                                        .addComponent(dcdatev, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(vendorLayout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(btnsavef5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(vendorLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtskgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel38))))
                                .addContainerGap(413, Short.MAX_VALUE))
                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(vendorLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(vendorLayout.createSequentialGroup()
                                                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(cbcnamev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel32))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtpcodev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel34))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(vendorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel35)
                                                                .addComponent(txt57f4v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jLabel33))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap()))
                );

                tabpane.addTab("Vendor", vendor);

                cbcnamevi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbcnamevi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
                cbcnamevi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbcnameviActionPerformed(evt);
                        }
                });

                jLabel39.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel39.setText("Company Name :");

                cbpnamevi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                cbpnamevi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
                cbpnamevi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbpnameviActionPerformed(evt);
                        }
                });

                jLabel40.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel40.setText("Part Name :");

                jLabel41.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel41.setText("Part Code/No. :");

                txtpcodevi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtpcodevi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtpcodeviActionPerformed(evt);
                        }
                });

                jLabel42.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel42.setText("57 F4 No. :");

                txtf4vi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtf4vi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtf4viActionPerformed(evt);
                        }
                });

                jLabel43.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel43.setText("Qty in Pcs :");

                txtqtyvi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel44.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel44.setText("Qty in KG :");

                txtkgvi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                txtchallanvi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel45.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel45.setText("Challan No. :");

                dcdatevi.setDateFormatString("dd/MM/yyyy");
                dcdatevi.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

                jLabel46.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel46.setText("Date :");

                jLabel47.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel47.setText("Total Stock :");

                txtstock3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtstock3.setForeground(new java.awt.Color(255, 0, 51));
                txtstock3.setEnabled(false);

                txtdstock1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtdstock1.setForeground(new java.awt.Color(255, 0, 51));
                txtdstock1.setEnabled(false);

                jLabel48.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel48.setText("Done Stock :");

                jLabel49.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                jLabel49.setText("Remaining Stock :");

                txtrestock1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                txtrestock1.setForeground(new java.awt.Color(255, 0, 51));
                txtrestock1.setEnabled(false);

                btnsavejw1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                btnsavejw1.setText("Save");
                btnsavejw1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnsavejw1ActionPerformed(evt);
                        }
                });

                tbldailydata1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
                tbldailydata1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null}
                        },
                        new String [] {
                                "Date", "Part Name", "Qty", "Weight", "Challan No."
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                true, false, false, true, true
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tbldailydata1.setRowHeight(20);
                tbldailydata1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tbldailydata1MouseClicked(evt);
                        }
                });
                jScrollPane6.setViewportView(tbldailydata1);
                tbldailydata1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel43)
                                                                .addGap(36, 36, 36)))
                                                .addGap(61, 61, 61)
                                                .addComponent(txtqtyvi))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addComponent(txtrestock1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(61, 61, 61)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtstock3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtdstock1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(454, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel39)
                                                        .addComponent(jLabel41))
                                                .addGap(77, 77, 77)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtpcodevi, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbcnamevi, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel40)
                                                        .addComponent(jLabel45)
                                                        .addComponent(jLabel44)
                                                        .addComponent(jLabel46)
                                                        .addComponent(jLabel42))
                                                .addGap(67, 67, 67)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtkgvi, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtchallanvi, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dcdatevi, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                        .addComponent(cbpnamevi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtf4vi))
                                                .addGap(66, 66, 66))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(413, 413, 413)
                                                .addComponent(btnsavejw1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(237, 237, 237)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane6)
                                        .addContainerGap()))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel43)
                                        .addComponent(txtqtyvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel47)
                                        .addComponent(txtstock3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel48)
                                        .addComponent(txtdstock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel49)
                                        .addComponent(txtrestock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(335, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel39)
                                                .addComponent(cbcnamevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel40)
                                                .addComponent(cbpnamevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel41)
                                                .addComponent(txtpcodevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel42)
                                                .addComponent(txtf4vi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel45)
                                                .addComponent(txtchallanvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel44)
                                                .addComponent(txtkgvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(dcdatevi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel46))
                                        .addGap(38, 38, 38)
                                        .addComponent(btnsavejw1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                        .addGap(15, 15, 15)))
                );

                tabpane.addTab("Vendor Incoming Stock ", jPanel1);

                jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
                jLabel1.setText("N A V ENTERPRIESE");

                lbldate.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
                lbldate.setText("Date");

                lbltime.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
                lbltime.setText("Time");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addComponent(tabpane)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(150, 150, 150)
                                .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbltime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbldate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btnsavef5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavef5ActionPerformed
                try
                {

                        String cname = cbcnamev.getSelectedItem()+"";
                        String pname = cbpnamev.getSelectedItem()+"";
                        String pcode =txtpcodev.getText();
                        String f4 = txt57f4v.getText();
                        String sd = txtstockdatav.getText();
                        String kg = txtskgv.getText();

                        Date date=dcdatev.getDate();
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                        String dt=formatter.format(date);

                        if(cname.equals("Select") || pname.equals("") || pcode.equals("") || f4.equals("") || sd.equals("") || kg.equals(""))
                        {
                                JOptionPane.showMessageDialog(this, "Plese Fill All Details");
                        }
                        else{

                                ps=con.prepareStatement("insert into tb_vendor values(?,?,?,?,?,?,?)");
                                ps.setString(1, cname);
                                ps.setString(2, pname);
                                ps.setString(3, pcode);
                                ps.setString(4, sd);
                                ps.setString(5, f4);
                                ps.setString(6, dt);
                                ps.setString(7, kg);

                                ps.execute();
                                JOptionPane.showMessageDialog(this, "Data save");

                                txtpcodev.setText("");
                                txt57f4v.setText("");
                                txtstockdatav.setText("");
                                txtskgv.setText("");
                                cbcnamev.setSelectedItem("Select");
                                cbpnamev.setSelectedItem("Select");
                                dcdatev.setDate(null);

                                FillTable(tblvf4, "Select  *from tb_vendor order by f4");
                        }
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_btnsavef5ActionPerformed

        private void tblvf4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblvf4MouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_tblvf4MouseClicked

        private void cbpnamevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpnamevActionPerformed
                try{

                        String cn= cbcnamev.getSelectedItem()+"";
                        String pn=cbpnamev.getSelectedItem()+"";

                        if(pn.equals("Select"))
                        txtpcodev.setText("");

                        ps=con.prepareStatement("select pcode from tb_item where pname='"+pn+"'");
                        ResultSet rs2;
                        rs2=ps.executeQuery();
                        if(rs2.next())
                        {
                                txtpcodev.setText(rs2.getString("pcode"));
                        }
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_cbpnamevActionPerformed

        private void cbcnamevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcnamevActionPerformed

        }//GEN-LAST:event_cbcnamevActionPerformed

        private void txtf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf4ActionPerformed
                try{

                        String cn= cbcname2.getSelectedItem()+"";
                        String pc=txtpcode2.getText();
                        String four=txtf4.getText();
                        ps=con.prepareStatement("select rmi,stock from tbf4 where cname='"+cn+"' and pcode='"+pc+"'and f4no='"+four+"'");
                        ResultSet rs2;
                        rs2=ps.executeQuery();
                        if(rs2.next())
                        {
                                txtrmi2.setText(rs2.getString("rmi"));
                                txtstock2.setText(rs2.getString("stock"));
                        }

                        ps=con.prepareStatement("select sum(tb_stockjw.qtypcs) as donestock from tb_stockjw where f4='"+txtf4.getText()+"' ");
                        ResultSet rs;
                        rs=ps.executeQuery();
                        while(rs.next())
                        {
                                txtdstock.setText(rs.getString("donestock"));
                        }

                        ps=con.prepareStatement("select sdata from tb_vendor where cname='"+cn+"' and pcode='"+pc+"'and f4='"+four+"'");
                        ResultSet rs3;
                        rs3=ps.executeQuery();
                        if(rs3.next())
                        {
                                txtrmi2.setText("");
                                txtstock2.setText(rs3.getString("sdata"));
                        }

                        ps=con.prepareStatement("select sum(tb_stockjw.qtypcs) as donestock from tb_stockjw where f4='"+txtf4.getText()+"' ");
                        ResultSet rs4;
                        rs4=ps.executeQuery();
                        while(rs4.next())
                        {
                                txtdstock.setText(rs4.getString("donestock"));
                        }

                        int ds =0;
                        int res=0;
                        int ts = Integer.parseInt(txtstock2.getText());

                        String dss=txtdstock.getText();
                        if(dss.equals("")){
                                ds=0;
                                String dsss=Integer.toString(ds);
                                txtdstock.setText(dsss);
                        }
                        else
                        ds= Integer.parseInt(txtdstock.getText());

                        res= ts-ds;
                        String r=Integer.toString(res);
                        txtrestock.setText(r);

                        FillTable(tbldailydata, "Select date,pname,qtypcs,qtykg,challan from tb_stockjw where ccname='"+cn+"' and pcode='"+pc+"' and f4='"+four+"'");

                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_txtf4ActionPerformed

        private void txtpcode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpcode2ActionPerformed

        }//GEN-LAST:event_txtpcode2ActionPerformed

        private void btnsavejwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavejwActionPerformed
                try{

                        String cname = cbcname2.getSelectedItem()+"";
                        String pname = cbpname.getSelectedItem()+"";
                        String pcode =txtpcode2.getText();
                        String qty = txtqty.getText();
                        String f4 = txtf4.getText();
                        String kg = txtkg.getText();
                        String rmi = txtrmi2.getText();
                        String challan = txtchallan.getText();

                        Date date=dcdate.getDate();
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                        String dt=formatter.format(date);

                        ps=con.prepareStatement("insert into tb_stockjw values(?,?,?,?,?,?,?,?,?)");
                        ps.setString(1, cname);
                        ps.setString(2, pname);
                        ps.setString(3, pcode);
                        ps.setString(4, rmi);
                        ps.setString(5, f4);
                        ps.setString(6, challan);
                        ps.setString(7, qty);
                        ps.setString(8, kg);
                        ps.setString(9, dt);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Data save");

                        ps=con.prepareStatement("select sum(tb_stockjw.qtypcs) as donestock from tb_stockjw where f4='"+txtf4.getText()+"' ");
                        ResultSet rs;
                        rs=ps.executeQuery();
                        while(rs.next())
                        {
                                txtdstock.setText(rs.getString("donestock"));
                        }

                        int ts = Integer.parseInt(txtstock2.getText());
                        int ds = Integer.parseInt(txtdstock.getText());

                        int res= ts-ds;
                        String r=Integer.toString(res);
                        txtrestock.setText(r);

                        FillTable(tbldailydata, "Select date,pname,qtypcs,qtykg,challan from tb_stockjw where ccname='"+cname+"' and pcode='"+pcode+"' and f4='"+f4+"'");
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_btnsavejwActionPerformed

        private void tbldailydataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldailydataMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_tbldailydataMouseClicked

        private void cbpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpnameActionPerformed
                try{

                        String cn= cbcname2.getSelectedItem()+"";
                        String pn=cbpname.getSelectedItem()+"";
                        ps=con.prepareStatement("select pcode from tb_item where cname='"+cn+"' and pname='"+pn+"'");
                        ResultSet rs2;
                        rs2=ps.executeQuery();
                        while(rs2.next())
                        {
                                txtpcode2.setText(rs2.getString("pcode"));
                        }

                        ps=con.prepareStatement("select pcode from tb_vendor where cname='"+cn+"' and pname='"+pn+"'");
                        ResultSet rs3;
                        rs3=ps.executeQuery();
                        while(rs3.next())
                        {
                                txtpcode2.setText(rs3.getString("pcode"));
                        }
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_cbpnameActionPerformed

        private void cbcname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcname2ActionPerformed
                try{
                        cbpname.removeAllItems();

                        String cn= cbcname2.getSelectedItem()+"";
                        ps=con.prepareStatement("select pname from tb_item where cname='"+cn+"'");
                        ResultSet rs;
                        rs=ps.executeQuery();
                        cbpname.setSelectedItem("Select");
                        while(rs.next())
                        {
                                cbpname.addItem(rs.getString("pname"));
                        }

                        ps=con.prepareStatement("select pname from tb_vendor where cname='"+cn+"'");
                        ResultSet rs2;
                        rs2=ps.executeQuery();
                        while(rs2.next())
                        {
                                cbpname.addItem(rs2.getString("pname"));
                        }
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_cbcname2ActionPerformed

        private void btnsavef4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavef4ActionPerformed
                try
                {

                        String cname = cbcname3.getSelectedItem()+"";
                        String pname = cbpname2.getSelectedItem()+"";
                        String pcode =txtpcode3.getText();
                        String f4 = txt57f4.getText();
                        String sd = txtstockdata.getText();
                        String rmi = txtrmi.getText();

                        Date date=dcdate2.getDate();
                        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
                        String dt=formatter.format(date);

                        if(cname.equals("Select") || pname.equals("") || pcode.equals("") || f4.equals("") || sd.equals(""))
                        {
                                JOptionPane.showMessageDialog(this, "Plese Fill All Details");
                        }
                        else{

                                ps=con.prepareStatement("insert into tbf4 values(?,?,?,?,?,?,?)");
                                ps.setString(1, cname);
                                ps.setString(2, f4);
                                ps.setString(3, pname);
                                ps.setString(4, pcode);
                                ps.setString(5, rmi);
                                ps.setString(6, sd);
                                ps.setString(7, dt);

                                ps.execute();
                                JOptionPane.showMessageDialog(this, "Data save");

                                txtpcode3.setText("");
                                txt57f4.setText("");
                                txtstockdata.setText("");
                                txtrmi.setText("");
                                cbcname3.setSelectedItem("Select");
                                cbpname2.setSelectedItem("Select");
                                dcdate2.setDate(null);

                                FillTable(tblf4, "Select  *from tbf4 order by f4id");
                        }
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_btnsavef4ActionPerformed

        private void cbpname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpname2ActionPerformed
                try{

                        String cn= cbcname3.getSelectedItem()+"";
                        String pn=cbpname2.getSelectedItem()+"";
                        ps=con.prepareStatement("select pcode from tb_item where cname='"+cn+"' and pname='"+pn+"'");
                        ResultSet rs2;
                        rs2=ps.executeQuery();
                        while(rs2.next())
                        {
                                txtpcode3.setText(rs2.getString("pcode"));
                        }
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_cbpname2ActionPerformed

        private void cbcname3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcname3ActionPerformed
                try{
                        cbpname2.removeAllItems();
                        cbpname2.setSelectedItem("Select");
                        String cn= cbcname3.getSelectedItem()+"";
                        ps=con.prepareStatement("select pname from tb_item where cname='"+cn+"'");
                        ResultSet rs;
                        rs=ps.executeQuery();

                        while(rs.next())
                        {

                                cbpname2.addItem(rs.getString("pname"));
                        }
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_cbcname3ActionPerformed

        private void tblf4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblf4MouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_tblf4MouseClicked

        private void itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMouseClicked
                item.revalidate();
                item.repaint();
        }//GEN-LAST:event_itemMouseClicked

        private void tblitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblitemMouseClicked
                /*JTable source = (JTable)evt.getSource();
                int row = source.rowAtPoint( evt.getPoint() );
                int column = source.columnAtPoint( evt.getPoint() );
                String s=source.getModel().getValueAt(row, column)+"";

                JOptionPane.showMessageDialog(null, s);
                btnstocksave.setText("Update");*/
        }//GEN-LAST:event_tblitemMouseClicked

        private void btnstocksaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstocksaveActionPerformed
                try{
                        String cname = cbcname.getSelectedItem()+"";
                        String pname = txtpname.getText();
                        String pcode = txtpcode.getText();
                        String hsn = txthsn.getText();

                        if(cname.equals("Select") || pname.equals("") || pcode.equals("") || hsn.equals(""))
                        {
                                JOptionPane.showMessageDialog(this, "Plese Fill All Details");
                        }
                        else{

                                ps=con.prepareStatement("insert into tb_item values(?,?,?,?)");
                                ps.setString(1, cname);
                                ps.setString(2, pname);
                                ps.setString(3, pcode);
                                ps.setString(4, hsn);
                                ps.execute();
                                JOptionPane.showMessageDialog(this, "Data save");

                                FillTable(tblitem, "Select  *from tb_item order by pid");
                        }
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_btnstocksaveActionPerformed

        private void CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseClicked
                Customer.revalidate();
                Customer.repaint();

        }//GEN-LAST:event_CustomerMouseClicked

        private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
                try{
                        String cname = txtcname.getText();
                        String add = txtadd.getText();
                        String gst = txtgst.getText();
                        String ph = txtph.getText();

                        if(cname.equals("") || add.equals("") || gst.equals("") || ph.equals(""))
                        {
                                JOptionPane.showMessageDialog(this, "Plese Fill All Details");
                        }
                        else
                        {
                                ps=con.prepareStatement("insert into tb_customer values(?,?,?,?)");
                                ps.setString(1, cname);
                                ps.setString(2, add);
                                ps.setString(3, gst);
                                ps.setString(4, ph);
                                ps.execute();
                                JOptionPane.showMessageDialog(this, "Data save");

                                txtcname.setText("");
                                txtadd.setText("");
                                txtgst.setText("");
                                txtph.setText("");

                                FillTable(tbcdata, "Select  *from tb_customer order by ccode");

                                ps=con.prepareStatement("select *from tb_customer");
                                ResultSet rs;
                                rs=ps.executeQuery();
                                while(rs.next())
                                {
                                        cbcname.addItem(rs.getString(2));
                                        cbcname2.addItem(rs.getString(2));
                                        cbcname3.addItem(rs.getString(2));
                                        cbcnamev.addItem(rs.getString(2));
                                }
                        }

                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(this, ex);
                }
        }//GEN-LAST:event_btnsaveActionPerformed

        private void tbcdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcdataMouseClicked
                JTable source = (JTable)evt.getSource();
                int row = source.rowAtPoint( evt.getPoint() );
                int column = source.columnAtPoint( evt.getPoint() );
                String s=source.getModel().getValueAt(row, column)+"";

                JOptionPane.showMessageDialog(null, s);
                btnsave.setText("Update");
        }//GEN-LAST:event_tbcdataMouseClicked

        private void txtgstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgstActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtgstActionPerformed

        private void cbcnameviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcnameviActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_cbcnameviActionPerformed

        private void cbpnameviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpnameviActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_cbpnameviActionPerformed

        private void txtpcodeviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpcodeviActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtpcodeviActionPerformed

        private void txtf4viActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtf4viActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtf4viActionPerformed

        private void btnsavejw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavejw1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btnsavejw1ActionPerformed

        private void tbldailydata1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldailydata1MouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_tbldailydata1MouseClicked

    public static void main(String args[]) {
         try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    
    public void FillTable(JTable tblname, String Query)
{
    try
    {
        
         
        ps=con.prepareStatement(Query);
        ResultSet rs =ps.executeQuery();
        

        //To remove previously added rows
        while(tblname.getRowCount() > 0) 
        {
           
            ((DefaultTableModel) tblname.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) tblname.getModel()).insertRow(rs.getRow()-1,row);
        }

       
 
        
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(this, ex);
    }
}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel Customer;
        private javax.swing.JPanel F4;
        private javax.swing.JPanel Stock;
        private javax.swing.JButton btnsave;
        private javax.swing.JButton btnsavef4;
        private javax.swing.JButton btnsavef5;
        private javax.swing.JButton btnsavejw;
        private javax.swing.JButton btnsavejw1;
        private javax.swing.JButton btnstocksave;
        private javax.swing.JComboBox<String> cbcname;
        private javax.swing.JComboBox<String> cbcname2;
        private javax.swing.JComboBox<String> cbcname3;
        private javax.swing.JComboBox<String> cbcnamev;
        private javax.swing.JComboBox<String> cbcnamevi;
        private javax.swing.JComboBox<String> cbpname;
        private javax.swing.JComboBox<String> cbpname2;
        private javax.swing.JComboBox<String> cbpnamev;
        private javax.swing.JComboBox<String> cbpnamevi;
        private com.toedter.calendar.JDateChooser dcdate;
        private com.toedter.calendar.JDateChooser dcdate2;
        private com.toedter.calendar.JDateChooser dcdatev;
        private com.toedter.calendar.JDateChooser dcdatevi;
        private javax.swing.JPanel item;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JLabel jLabel35;
        private javax.swing.JLabel jLabel36;
        private javax.swing.JLabel jLabel37;
        private javax.swing.JLabel jLabel38;
        private javax.swing.JLabel jLabel39;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel40;
        private javax.swing.JLabel jLabel41;
        private javax.swing.JLabel jLabel42;
        private javax.swing.JLabel jLabel43;
        private javax.swing.JLabel jLabel44;
        private javax.swing.JLabel jLabel45;
        private javax.swing.JLabel jLabel46;
        private javax.swing.JLabel jLabel47;
        private javax.swing.JLabel jLabel48;
        private javax.swing.JLabel jLabel49;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JScrollPane jScrollPane6;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JLabel lbldate;
        private javax.swing.JLabel lbltime;
        private javax.swing.JTabbedPane tabpane;
        private javax.swing.JTable tbcdata;
        private javax.swing.JTable tbldailydata;
        private javax.swing.JTable tbldailydata1;
        private javax.swing.JTable tblf4;
        private javax.swing.JTable tblitem;
        private javax.swing.JTable tblvf4;
        private javax.swing.JTextField txt57f4;
        private javax.swing.JTextField txt57f4v;
        private javax.swing.JTextField txtadd;
        private javax.swing.JTextField txtchallan;
        private javax.swing.JTextField txtchallanvi;
        private javax.swing.JTextField txtcname;
        private javax.swing.JTextField txtdstock;
        private javax.swing.JTextField txtdstock1;
        private javax.swing.JTextField txtf4;
        private javax.swing.JTextField txtf4vi;
        private javax.swing.JTextField txtgst;
        private javax.swing.JTextField txthsn;
        private javax.swing.JTextField txtkg;
        private javax.swing.JTextField txtkgvi;
        private javax.swing.JTextField txtpcode;
        private javax.swing.JTextField txtpcode2;
        private javax.swing.JTextField txtpcode3;
        private javax.swing.JTextField txtpcodev;
        private javax.swing.JTextField txtpcodevi;
        private javax.swing.JTextField txtph;
        private javax.swing.JTextField txtpname;
        private javax.swing.JTextField txtqty;
        private javax.swing.JTextField txtqtyvi;
        private javax.swing.JTextField txtrestock;
        private javax.swing.JTextField txtrestock1;
        private javax.swing.JTextField txtrmi;
        private javax.swing.JTextField txtrmi2;
        private javax.swing.JTextField txtskgv;
        private javax.swing.JTextField txtstock2;
        private javax.swing.JTextField txtstock3;
        private javax.swing.JTextField txtstockdata;
        private javax.swing.JTextField txtstockdatav;
        private javax.swing.JPanel vendor;
        // End of variables declaration//GEN-END:variables
}
