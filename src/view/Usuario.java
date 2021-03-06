package view;

public class Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuario
     */
    public Usuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRegistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jComboBoxNivelAcesso = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanelBotoes = new javax.swing.JPanel();
        jToolBarBotoes = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonAddUser = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonProcurar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonSalvar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();
        jLabelTituloUsuario = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanelUsuario.setLayout(null);

        jLabel1.setText("Registro:");
        jPanelUsuario.add(jLabel1);
        jLabel1.setBounds(17, 33, 51, 16);

        jTextFieldRegistro.setEditable(false);
        jPanelUsuario.add(jTextFieldRegistro);
        jTextFieldRegistro.setBounds(30, 50, 162, 33);

        jLabel2.setText("Nome:");
        jPanelUsuario.add(jLabel2);
        jLabel2.setBounds(20, 90, 36, 16);

        jLabel3.setText("CPF:");
        jPanelUsuario.add(jLabel3);
        jLabel3.setBounds(210, 30, 25, 16);

        jTextFieldCPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanelUsuario.add(jTextFieldCPF);
        jTextFieldCPF.setBounds(220, 50, 187, 33);

        jTextFieldNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanelUsuario.add(jTextFieldNome);
        jTextFieldNome.setBounds(30, 110, 540, 33);

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanelUsuario.add(jTextField1);
        jTextField1.setBounds(30, 170, 140, 33);

        jLabel4.setText("Usuário:");
        jPanelUsuario.add(jLabel4);
        jLabel4.setBounds(20, 150, 47, 16);

        jLabel5.setText("Senha:");
        jPanelUsuario.add(jLabel5);
        jLabel5.setBounds(200, 150, 39, 16);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Confirmar");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelUsuario.add(jLabel6);
        jLabel6.setBounds(370, 150, 60, 16);

        jLabel7.setText("Senha:");
        jPanelUsuario.add(jLabel7);
        jLabel7.setBounds(440, 150, 39, 16);

        jPasswordField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanelUsuario.add(jPasswordField1);
        jPasswordField1.setBounds(210, 170, 120, 33);

        jPasswordField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanelUsuario.add(jPasswordField2);
        jPasswordField2.setBounds(380, 170, 120, 33);

        jCheckBoxAtivo.setText("Ativo?");
        jPanelUsuario.add(jCheckBoxAtivo);
        jCheckBoxAtivo.setBounds(510, 170, 60, 30);

        jComboBoxNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerencial", "Usuario" }));
        jPanelUsuario.add(jComboBoxNivelAcesso);
        jComboBoxNivelAcesso.setBounds(430, 50, 140, 30);

        jLabel8.setText("Nível Acesso");
        jPanelUsuario.add(jLabel8);
        jLabel8.setBounds(420, 30, 80, 16);

        jToolBarBotoes.setBorder(null);
        jToolBarBotoes.setFloatable(false);
        jToolBarBotoes.setBorderPainted(false);
        jToolBarBotoes.setOpaque(false);
        jToolBarBotoes.add(jSeparator1);

        jButtonAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addUser32x32.png"))); // NOI18N
        jButtonAddUser.setToolTipText("Adicionar");
        jButtonAddUser.setBorderPainted(false);
        jButtonAddUser.setFocusable(false);
        jButtonAddUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAddUser.setOpaque(false);
        jButtonAddUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarBotoes.add(jButtonAddUser);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(20, 10));
        jToolBarBotoes.add(jSeparator2);

        jButtonProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/procurar32x32.png"))); // NOI18N
        jButtonProcurar.setToolTipText("Procurar");
        jButtonProcurar.setBorderPainted(false);
        jButtonProcurar.setFocusable(false);
        jButtonProcurar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonProcurar.setOpaque(false);
        jButtonProcurar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarBotoes.add(jButtonProcurar);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(20, 10));
        jToolBarBotoes.add(jSeparator3);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar32x32.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setBorderPainted(false);
        jButtonSalvar.setFocusable(false);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setOpaque(false);
        jButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarBotoes.add(jButtonSalvar);

        jSeparator4.setSeparatorSize(new java.awt.Dimension(20, 10));
        jToolBarBotoes.add(jSeparator4);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit32x32.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.setBorderPainted(false);
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setOpaque(false);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarBotoes.add(jButtonSair);

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jToolBarBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jLabelTituloUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTituloUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabelTituloUsuario.setText(" Cadastro de Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTituloUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloUsuario)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        Principal.setVerificaTelaUsuario(true);
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
       
        Principal.setVerificaTelaUsuario(false);
        
    }//GEN-LAST:event_formInternalFrameClosed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonProcurar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxAtivo;
    private javax.swing.JComboBox<String> jComboBoxNivelAcesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelTituloUsuario;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRegistro;
    private javax.swing.JToolBar jToolBarBotoes;
    // End of variables declaration//GEN-END:variables
}
