import java.util.*;

public class GUI extends javax.swing.JFrame {
operations OP = new operations();
    
    public GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Brand_1 = new javax.swing.JComboBox<>();
        Text_1 = new javax.swing.JLabel();
        Brand_2 = new javax.swing.JComboBox<>();
        Brand_3 = new javax.swing.JComboBox<>();
        Text_2 = new javax.swing.JLabel();
        Min_Range = new javax.swing.JLabel();
        Max_Range = new javax.swing.JLabel();
        Min_Range1 = new javax.swing.JLabel();
        Min = new javax.swing.JTextField();
        Budget = new javax.swing.JButton();
        Max = new javax.swing.JTextField();
        Text_3 = new javax.swing.JLabel();
        Check_1 = new javax.swing.JCheckBox();
        IMG_1 = new javax.swing.JLabel();
        IMG_2 = new javax.swing.JLabel();
        Check_2 = new javax.swing.JCheckBox();
        IMG_3 = new javax.swing.JLabel();
        Check_3 = new javax.swing.JCheckBox();
        IMG_4 = new javax.swing.JLabel();
        Check_4 = new javax.swing.JCheckBox();
        IMG_5 = new javax.swing.JLabel();
        Check_5 = new javax.swing.JCheckBox();
        IMG_6 = new javax.swing.JLabel();
        Check_6 = new javax.swing.JCheckBox();
        Send_Data = new javax.swing.JButton();
        Text_4 = new javax.swing.JLabel();
        Text_5 = new javax.swing.JLabel();
        Text_6 = new javax.swing.JLabel();
        Car_IMG_1 = new javax.swing.JLabel();
        Car_IMG_2 = new javax.swing.JLabel();
        Car_IMG_3 = new javax.swing.JLabel();
        Car_Manufacturer_1 = new javax.swing.JLabel();
        Car_Model_1 = new javax.swing.JLabel();
        Car_Price_1 = new javax.swing.JLabel();
        Car_Manufacturer_2 = new javax.swing.JLabel();
        Car_Model_2 = new javax.swing.JLabel();
        Car_Price_2 = new javax.swing.JLabel();
        Car_Manufacturer_3 = new javax.swing.JLabel();
        Car_Model_3 = new javax.swing.JLabel();
        Car_Price_3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("0"); // NOI18N

        Title.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Autoganga");
        Title.setMaximumSize(new java.awt.Dimension(750, 750));
        Title.setMinimumSize(new java.awt.Dimension(0, 0));
        Title.setPreferredSize(new java.awt.Dimension(300, 65));

        Brand_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_1.setName("0"); // NOI18N
        Brand_1.setPreferredSize(new java.awt.Dimension(150, 20));

        Text_1.setText("Choose your favorite car manufacturers:");
        Text_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_1.setName("0"); // NOI18N
        Text_1.setPreferredSize(new java.awt.Dimension(300, 16));

        Brand_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_2.setName("0"); // NOI18N
        Brand_2.setPreferredSize(new java.awt.Dimension(150, 20));

        Brand_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_3.setName("0"); // NOI18N
        Brand_3.setPreferredSize(new java.awt.Dimension(150, 20));

        Text_2.setText("Choose your budget: ( 5,000$ - 5,000,000$ )");
        Text_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_2.setName("0"); // NOI18N
        Text_2.setPreferredSize(new java.awt.Dimension(300, 16));

        Min_Range.setText("5,000");
        Min_Range.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Range.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Range.setPreferredSize(new java.awt.Dimension(55, 15));
        Min_Range.setRequestFocusEnabled(false);

        Max_Range.setText("5,000,000");
        Max_Range.setMaximumSize(new java.awt.Dimension(750, 750));
        Max_Range.setMinimumSize(new java.awt.Dimension(0, 0));
        Max_Range.setPreferredSize(new java.awt.Dimension(55, 15));
        Max_Range.setRequestFocusEnabled(false);

        Min_Range1.setText("-");
        Min_Range1.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Range1.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Range1.setPreferredSize(new java.awt.Dimension(55, 15));
        Min_Range1.setRequestFocusEnabled(false);

        Min.setText("5000");
        Min.setMaximumSize(new java.awt.Dimension(750, 750));
        Min.setMinimumSize(new java.awt.Dimension(0, 0));
        Min.setPreferredSize(new java.awt.Dimension(75, 20));
        Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinActionPerformed(evt);
            }
        });

        Budget.setText("Load");
        Budget.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Budget.setMaximumSize(new java.awt.Dimension(750, 750));
        Budget.setMinimumSize(new java.awt.Dimension(0, 0));
        Budget.setPreferredSize(new java.awt.Dimension(75, 20));
        Budget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BudgetActionPerformed(evt);
            }
        });

        Max.setText("5000000");
        Max.setMaximumSize(new java.awt.Dimension(750, 750));
        Max.setMinimumSize(new java.awt.Dimension(0, 0));
        Max.setPreferredSize(new java.awt.Dimension(75, 20));
        Max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxActionPerformed(evt);
            }
        });

        Text_3.setText("Check the cars you like:");
        Text_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_3.setName("0"); // NOI18N
        Text_3.setPreferredSize(new java.awt.Dimension(300, 16));

        Check_1.setText("✓");
        Check_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Check_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Check_1.setPreferredSize(new java.awt.Dimension(35, 20));

        IMG_1.setMaximumSize(new java.awt.Dimension(750, 750));

        IMG_2.setMaximumSize(new java.awt.Dimension(750, 750));

        Check_2.setText("✓");
        Check_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Check_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Check_2.setPreferredSize(new java.awt.Dimension(35, 20));

        IMG_3.setMaximumSize(new java.awt.Dimension(750, 750));

        Check_3.setText("✓");
        Check_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Check_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Check_3.setPreferredSize(new java.awt.Dimension(35, 20));

        IMG_4.setMaximumSize(new java.awt.Dimension(750, 750));

        Check_4.setText("✓");
        Check_4.setMaximumSize(new java.awt.Dimension(750, 750));
        Check_4.setMinimumSize(new java.awt.Dimension(0, 0));
        Check_4.setPreferredSize(new java.awt.Dimension(35, 20));

        IMG_5.setMaximumSize(new java.awt.Dimension(750, 750));

        Check_5.setText("✓");
        Check_5.setMaximumSize(new java.awt.Dimension(750, 750));
        Check_5.setMinimumSize(new java.awt.Dimension(0, 0));
        Check_5.setPreferredSize(new java.awt.Dimension(35, 20));

        IMG_6.setMaximumSize(new java.awt.Dimension(750, 750));

        Check_6.setText("✓");
        Check_6.setMaximumSize(new java.awt.Dimension(750, 750));
        Check_6.setMinimumSize(new java.awt.Dimension(0, 0));
        Check_6.setPreferredSize(new java.awt.Dimension(35, 20));

        Send_Data.setText("Send data and view recommended cars");
        Send_Data.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Send_Data.setMaximumSize(new java.awt.Dimension(750, 750));
        Send_Data.setMinimumSize(new java.awt.Dimension(0, 0));
        Send_Data.setPreferredSize(new java.awt.Dimension(75, 20));
        Send_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Send_DataActionPerformed(evt);
            }
        });

        Text_4.setText("Car 1:");
        Text_4.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_4.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_4.setName("0"); // NOI18N
        Text_4.setPreferredSize(new java.awt.Dimension(300, 16));
        Text_4.setRequestFocusEnabled(false);

        Text_5.setText("Car 3:");
        Text_5.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_5.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_5.setName("0"); // NOI18N
        Text_5.setPreferredSize(new java.awt.Dimension(300, 16));

        Text_6.setText("Car 2:");
        Text_6.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_6.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_6.setName("0"); // NOI18N
        Text_6.setPreferredSize(new java.awt.Dimension(300, 16));

        Car_IMG_1.setMaximumSize(new java.awt.Dimension(750, 750));

        Car_IMG_2.setMaximumSize(new java.awt.Dimension(750, 750));

        Car_IMG_3.setMaximumSize(new java.awt.Dimension(750, 750));

        Car_Manufacturer_1.setText("Manufacturer:");
        Car_Manufacturer_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Manufacturer_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Manufacturer_1.setName("0"); // NOI18N
        Car_Manufacturer_1.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Manufacturer_1.setRequestFocusEnabled(false);

        Car_Model_1.setText("Model: ");
        Car_Model_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Model_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Model_1.setName("0"); // NOI18N
        Car_Model_1.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Model_1.setRequestFocusEnabled(false);

        Car_Price_1.setText("Price: ");
        Car_Price_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Price_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Price_1.setName("0"); // NOI18N
        Car_Price_1.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Price_1.setRequestFocusEnabled(false);

        Car_Manufacturer_2.setText("Manufacturer:");
        Car_Manufacturer_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Manufacturer_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Manufacturer_2.setName("0"); // NOI18N
        Car_Manufacturer_2.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Manufacturer_2.setRequestFocusEnabled(false);

        Car_Model_2.setText("Model: ");
        Car_Model_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Model_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Model_2.setName("0"); // NOI18N
        Car_Model_2.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Model_2.setRequestFocusEnabled(false);

        Car_Price_2.setText("Price: ");
        Car_Price_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Price_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Price_2.setName("0"); // NOI18N
        Car_Price_2.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Price_2.setRequestFocusEnabled(false);

        Car_Manufacturer_3.setText("Manufacturer:");
        Car_Manufacturer_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Manufacturer_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Manufacturer_3.setName("0"); // NOI18N
        Car_Manufacturer_3.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Manufacturer_3.setRequestFocusEnabled(false);

        Car_Model_3.setText("Model: ");
        Car_Model_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Model_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Model_3.setName("0"); // NOI18N
        Car_Model_3.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Model_3.setRequestFocusEnabled(false);

        Car_Price_3.setText("Price: ");
        Car_Price_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Car_Price_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Car_Price_3.setName("0"); // NOI18N
        Car_Price_3.setPreferredSize(new java.awt.Dimension(300, 16));
        Car_Price_3.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Brand_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Brand_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Brand_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Min_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Min_Range1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Max_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Max, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Budget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Text_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Send_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Car_IMG_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Car_IMG_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Text_4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Text_6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Car_IMG_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Car_Manufacturer_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Car_Model_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Car_Price_1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Car_Manufacturer_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Car_Model_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Car_Price_2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Car_Manufacturer_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Car_Model_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Car_Price_3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(IMG_1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Check_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(IMG_2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Check_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(IMG_3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Check_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(IMG_4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Check_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(IMG_5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Check_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(IMG_6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Check_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Text_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brand_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Brand_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Brand_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Min_Range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Min_Range1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Max_Range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Budget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMG_1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMG_2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMG_3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMG_4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMG_5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IMG_6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Check_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Send_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Car_IMG_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Car_IMG_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Car_IMG_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Car_Manufacturer_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Car_Model_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Car_Price_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Car_Manufacturer_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Car_Model_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Car_Price_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Car_Manufacturer_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Car_Model_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Car_Price_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Metodos
    
    
    private void BudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BudgetActionPerformed
        try{
            int MinVal = Integer.parseInt(Min.getText());
            int MaxVal = Integer.parseInt(Max.getText());
            if(MinVal >= 5000 && MinVal <= 500000  && MaxVal >= 10000  && MaxVal <= 5000000 ){
                if(MinVal + 5000 < MaxVal){
                Min_Range.setText(String.format("%,d", MinVal));
                Max_Range.setText(String.format("%,d", MaxVal));
                System.out.println("1");
                }else{
                Min_Range.setText(String.format("%,d", MaxVal - 5000));
                Max_Range.setText(String.format("%,d", MaxVal));
                System.out.println("2");
                }
            }else{
                Min_Range.setText("5,000");
                Max_Range.setText("5,000,000");
                System.out.println("3");
            }
        }catch(NumberFormatException e){
            Min_Range.setText("5,000");
            Max_Range.setText("5,000,000");
            System.out.println("4");
        }
    }//GEN-LAST:event_BudgetActionPerformed

    private void MaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxActionPerformed

    private void Send_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Send_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Send_DataActionPerformed

    private void MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinActionPerformed

            
    //Settear las marcas
    public void setManufacturers(String[] Manufacturers){
        Brand_1.setModel(new javax.swing.DefaultComboBoxModel<>(Manufacturers));
        Brand_2.setModel(new javax.swing.DefaultComboBoxModel<>(Manufacturers));
        Brand_3.setModel(new javax.swing.DefaultComboBoxModel<>(Manufacturers));
    }
    //eliminar marca de otros selectores si ya fue elegida
    public void ManufacturerChange(String Selected1, String Selected2, String Selected3){ 
        //Brand_1.setModel(new javax.swing.DefaultComboBoxModel<>(Selected1));
        //Brand_2.setModel(new javax.swing.DefaultComboBoxModel<>(Selected2));
        //Brand_3.setModel(new javax.swing.DefaultComboBoxModel<>(Selected3));
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Brand_1;
    private javax.swing.JComboBox<String> Brand_2;
    private javax.swing.JComboBox<String> Brand_3;
    private javax.swing.JButton Budget;
    private javax.swing.JLabel Car_IMG_1;
    private javax.swing.JLabel Car_IMG_2;
    private javax.swing.JLabel Car_IMG_3;
    private javax.swing.JLabel Car_Manufacturer_1;
    private javax.swing.JLabel Car_Manufacturer_2;
    private javax.swing.JLabel Car_Manufacturer_3;
    private javax.swing.JLabel Car_Model_1;
    private javax.swing.JLabel Car_Model_2;
    private javax.swing.JLabel Car_Model_3;
    private javax.swing.JLabel Car_Price_1;
    private javax.swing.JLabel Car_Price_2;
    private javax.swing.JLabel Car_Price_3;
    private javax.swing.JCheckBox Check_1;
    private javax.swing.JCheckBox Check_2;
    private javax.swing.JCheckBox Check_3;
    private javax.swing.JCheckBox Check_4;
    private javax.swing.JCheckBox Check_5;
    private javax.swing.JCheckBox Check_6;
    private javax.swing.JLabel IMG_1;
    private javax.swing.JLabel IMG_2;
    private javax.swing.JLabel IMG_3;
    private javax.swing.JLabel IMG_4;
    private javax.swing.JLabel IMG_5;
    private javax.swing.JLabel IMG_6;
    private javax.swing.JTextField Max;
    private javax.swing.JLabel Max_Range;
    private javax.swing.JTextField Min;
    private javax.swing.JLabel Min_Range;
    private javax.swing.JLabel Min_Range1;
    private javax.swing.JButton Send_Data;
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_2;
    private javax.swing.JLabel Text_3;
    private javax.swing.JLabel Text_4;
    private javax.swing.JLabel Text_5;
    private javax.swing.JLabel Text_6;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
