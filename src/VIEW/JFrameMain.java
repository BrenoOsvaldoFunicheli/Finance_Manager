/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CONTROLLER.AdjustController;
import CONTROLLER.RoutesController;
import HELPERS.BUILDER.FrameHomeBuilder;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author osval
 */
public class JFrameMain extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private final RoutesController rc;
    private final AdjustController ac;
    private FrameFinancas frm;
    private Session session;

    public JFrameMain(Session session, String title) {
        this();
        this.frm = new FrameFinancas(session);
        this.setTitle(title);
        this.session = session;
    }

    public Session getSession() {
        return session;
    }

    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() {
        this.frm = new FrameHomeBuilder(session).builder();
        this.rc = new RoutesController();
        this.ac = new AdjustController();
        initComponents();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public RoutesController getRc() {
        return rc;
    }

    public JPanel getContentPanel() {
        return ContentPanel;
    }

    public JMenuBar getMenuSuperior() {
        return MenuSuperior;
    }

    public JTabbedPane getServiceAb() {
        return ServiceAb;
    }

    public JDesktopPane getAbaDespesa() {
        return abaDespesa;
    }

    public JDesktopPane getAbaReceitas() {
        return abaReceitas;
    }

    public JDesktopPane getAbaRelatório() {
        return abaRelatório;
    }

    public JCheckBoxMenuItem getjCheckBoxMenuItem1() {
        return jCheckBoxMenuItem1;
    }

    public JMenu getjMenu1() {
        return jMenu1;
    }

    public JMenu getjMenu2() {
        return jMenu2;
    }

    public JMenu getjMenuAjuda() {
        return jMenuAjuda;
    }

    public JMenuItem getjMenuDepesa() {
        return jMenuDepesa;
    }

    public JMenu getjMenuGerenciar() {
        return jMenuGerenciar;
    }

    public JMenuItem getjMenuICadastrarConta() {
        return jMenuICadastrarConta;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public JMenuItem getjMenuItem2() {
        return jMenuItem2;
    }

    public JMenu getjMenuOptions() {
        return jMenuOptions;
    }

    public JMenuItem getjMenuReceita() {
        return jMenuReceita;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ContentPanel = new javax.swing.JPanel();
        ServiceAb = new javax.swing.JTabbedPane();
        abaRelatório = new javax.swing.JDesktopPane();
        abaReceitas = new javax.swing.JDesktopPane();
        abaDespesa = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        MenuSuperior = new javax.swing.JMenuBar();
        jMenuOptions = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuGerenciar = new javax.swing.JMenu();
        jMenuDepesa = new javax.swing.JMenuItem();
        jMenuReceita = new javax.swing.JMenuItem();
        jMenuICadastrarConta = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ServiceAb.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                ServiceAbComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ServiceAbComponentShown(evt);
            }
        });

        abaRelatório.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                abaRelatórioComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                abaRelatórioComponentShown(evt);
            }
        });

        javax.swing.GroupLayout abaRelatórioLayout = new javax.swing.GroupLayout(abaRelatório);
        abaRelatório.setLayout(abaRelatórioLayout);
        abaRelatórioLayout.setHorizontalGroup(
            abaRelatórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        abaRelatórioLayout.setVerticalGroup(
            abaRelatórioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        ServiceAb.addTab("Home", abaRelatório);

        abaReceitas.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                abaReceitasComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                abaReceitasComponentShown(evt);
            }
        });

        javax.swing.GroupLayout abaReceitasLayout = new javax.swing.GroupLayout(abaReceitas);
        abaReceitas.setLayout(abaReceitasLayout);
        abaReceitasLayout.setHorizontalGroup(
            abaReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        abaReceitasLayout.setVerticalGroup(
            abaReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        ServiceAb.addTab("Receitas", abaReceitas);

        abaDespesa.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                abaDespesaComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                abaDespesaComponentShown(evt);
            }
        });

        javax.swing.GroupLayout abaDespesaLayout = new javax.swing.GroupLayout(abaDespesa);
        abaDespesa.setLayout(abaDespesaLayout);
        abaDespesaLayout.setHorizontalGroup(
            abaDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        abaDespesaLayout.setVerticalGroup(
            abaDespesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        ServiceAb.addTab("Despesas", abaDespesa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ServiceAb)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addComponent(ServiceAb)
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuOptions.setText("Options");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("logoff");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuOptions.add(jMenuItem2);

        MenuSuperior.add(jMenuOptions);

        jMenuGerenciar.setText("Gerenciar");

        jMenuDepesa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuDepesa.setText("Cadastra Despesa");
        jMenuDepesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDepesaActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuDepesa);

        jMenuReceita.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuReceita.setText("Cadastrar Receita");
        jMenuReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReceitaActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuReceita);

        jMenuICadastrarConta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuICadastrarConta.setText("Cadastrar Conta");
        jMenuICadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuICadastrarContaActionPerformed(evt);
            }
        });
        jMenuGerenciar.add(jMenuICadastrarConta);

        MenuSuperior.add(jMenuGerenciar);

        jMenuAjuda.setText("Ferramentas");
        MenuSuperior.add(jMenuAjuda);

        jMenu2.setText("Ajuda");
        MenuSuperior.add(jMenu2);

        setJMenuBar(MenuSuperior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new RoutesController().callLogin();
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ServiceAbComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ServiceAbComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiceAbComponentShown

    private void ServiceAbComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ServiceAbComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiceAbComponentHidden

    private void abaRelatórioComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_abaRelatórioComponentShown
        // TODO add your handling code here:
        ac.ajustHome(abaRelatório, frm, "HOME");
    }//GEN-LAST:event_abaRelatórioComponentShown

    private void abaRelatórioComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_abaRelatórioComponentHidden
        abaRelatório.removeAll();
    }//GEN-LAST:event_abaRelatórioComponentHidden

    private void jMenuDepesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDepesaActionPerformed
        rc.callExpense(getSession(), "Cadastrar Despesa");
    }//GEN-LAST:event_jMenuDepesaActionPerformed

    private void jMenuICadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuICadastrarContaActionPerformed
        rc.callAccount(getSession());
    }//GEN-LAST:event_jMenuICadastrarContaActionPerformed

    private void jMenuReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReceitaActionPerformed
        rc.callRecipe(getSession(), "Cadastrar Receita");
    }//GEN-LAST:event_jMenuReceitaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void abaReceitasComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_abaReceitasComponentHidden
        // TODO add your handling code here:
        abaReceitas.removeAll();
    }//GEN-LAST:event_abaReceitasComponentHidden

    private void abaReceitasComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_abaReceitasComponentShown
        // TODO add your handling code here:
        ac.recipeAjust(abaReceitas, frm, "RECEITA");
    }//GEN-LAST:event_abaReceitasComponentShown

    private void abaDespesaComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_abaDespesaComponentHidden
        // TODO add your handling code here:
        abaDespesa.removeAll();
    }//GEN-LAST:event_abaDespesaComponentHidden

    private void abaDespesaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_abaDespesaComponentShown
        // TODO add your handling code here:
        ac.expenseAjust(abaDespesa, frm, "DESPESA");
    }//GEN-LAST:event_abaDespesaComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JMenuBar MenuSuperior;
    private javax.swing.JTabbedPane ServiceAb;
    private javax.swing.JDesktopPane abaDespesa;
    private javax.swing.JDesktopPane abaReceitas;
    private javax.swing.JDesktopPane abaRelatório;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuItem jMenuDepesa;
    private javax.swing.JMenu jMenuGerenciar;
    private javax.swing.JMenuItem jMenuICadastrarConta;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenuOptions;
    private javax.swing.JMenuItem jMenuReceita;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
