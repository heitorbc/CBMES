/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.es.cb.sdro.view;

import br.gov.es.cb.sdro.control.ControlMilitarAdapter;
import br.gov.es.cb.sdro.control.MilitarControler;
import br.gov.es.cb.sdro.model.MilitarAdapter;
import br.gov.es.cb.sdro.model.Sco;
import br.gov.es.cb.sdro.util.ScoDAO;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author heitor.coelho
 */
public class TelaSCO extends javax.swing.JInternalFrame {


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_emp_gravar;
    private javax.swing.JButton btn_sco_altera;
    private javax.swing.JButton btn_sco_carregar;
    private javax.swing.JButton btn_sco_excluir;
    private javax.swing.JButton btn_sco_novo;
    private javax.swing.JButton btn_sco_salvar;
    private javax.swing.JComboBox<String> cmb_list_sco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_emp_descricao;
    private javax.swing.JLabel lbl_sco_mil_adm;
    private javax.swing.JLabel lbl_sco_mil_cmd;
    private javax.swing.JLabel lbl_sco_mil_log;
    private javax.swing.JLabel lbl_sco_mil_ope;
    private javax.swing.JLabel lbl_sco_mil_plan;
    private javax.swing.JLabel lbl_sco_nome;
    private javax.swing.JTextArea txt_area_emp;
    private javax.swing.JTextField txt_fld_emp_descr;
    private javax.swing.JTextField txt_sco_mil_adm;
    private javax.swing.JTextField txt_sco_mil_cmd;
    private javax.swing.JTextField txt_sco_mil_log;
    private javax.swing.JTextField txt_sco_mil_ope;
    private javax.swing.JTextField txt_sco_mil_plan;
    private javax.swing.JTextField txt_sco_nome;
    // End of variables declaration//GEN-END:variables

    GregorianCalendar gc = new GregorianCalendar();
    ScoDAO scoDao = new ScoDAO();
    private List<Sco> listaSco;
    private MilitarAdapter militarAdaptado;
    private ControlMilitarAdapter milControl;
    private Sco scoAtual;

    /**
     * Creates new form TelaSCO
     */
    public TelaSCO() {
        initComponents();
        this.setVisible(true);
        alteraCampos(false);
        carregaTela();
        milControl = new ControlMilitarAdapter();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_sco_nome = new javax.swing.JLabel();
        txt_sco_nome = new javax.swing.JTextField();
        lbl_sco_mil_adm = new javax.swing.JLabel();
        txt_sco_mil_adm = new javax.swing.JTextField();
        cmb_list_sco = new javax.swing.JComboBox<>();
        btn_sco_carregar = new javax.swing.JButton();
        lbl_sco_mil_ope = new javax.swing.JLabel();
        txt_sco_mil_ope = new javax.swing.JTextField();
        lbl_sco_mil_cmd = new javax.swing.JLabel();
        txt_sco_mil_cmd = new javax.swing.JTextField();
        lbl_sco_mil_log = new javax.swing.JLabel();
        lbl_sco_mil_plan = new javax.swing.JLabel();
        txt_sco_mil_log = new javax.swing.JTextField();
        txt_sco_mil_plan = new javax.swing.JTextField();
        btn_sco_altera = new javax.swing.JButton();
        btn_sco_excluir = new javax.swing.JButton();
        btn_sco_salvar = new javax.swing.JButton();
        btn_sco_novo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_emp = new javax.swing.JTextArea();
        txt_fld_emp_descr = new javax.swing.JTextField();
        lbl_emp_descricao = new javax.swing.JLabel();
        btn_emp_gravar = new javax.swing.JButton();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_sco_nome.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.lbl_sco_nome.text")); // NOI18N
        jPanel2.add(lbl_sco_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 87, -1, -1));

        txt_sco_nome.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.txt_sco_nome.text")); // NOI18N
        txt_sco_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sco_nomeActionPerformed(evt);
            }
        });
        jPanel2.add(txt_sco_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 284, -1));

        lbl_sco_mil_adm.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.lbl_sco_mil_adm.text")); // NOI18N
        jPanel2.add(lbl_sco_mil_adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txt_sco_mil_adm.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.txt_sco_mil_adm.text")); // NOI18N
        txt_sco_mil_adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sco_mil_admActionPerformed(evt);
            }
        });
        jPanel2.add(txt_sco_mil_adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 260, -1));

        cmb_list_sco.setMaximumRowCount(10);
        cmb_list_sco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clique para selecionar" }));
        cmb_list_sco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_list_scoActionPerformed(evt);
            }
        });
        jPanel2.add(cmb_list_sco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, -1));

        btn_sco_carregar.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.btn_sco_carregar.text")); // NOI18N
        btn_sco_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sco_carregarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sco_carregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 110, -1));

        lbl_sco_mil_ope.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.lbl_sco_mil_ope.text")); // NOI18N
        jPanel2.add(lbl_sco_mil_ope, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txt_sco_mil_ope.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.txt_sco_mil_ope.text")); // NOI18N
        txt_sco_mil_ope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sco_mil_opeActionPerformed(evt);
            }
        });
        jPanel2.add(txt_sco_mil_ope, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 260, -1));

        lbl_sco_mil_cmd.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.lbl_sco_mil_cmd.text")); // NOI18N
        jPanel2.add(lbl_sco_mil_cmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txt_sco_mil_cmd.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.txt_sco_mil_cmd.text")); // NOI18N
        jPanel2.add(txt_sco_mil_cmd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 260, -1));

        lbl_sco_mil_log.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.lbl_sco_mil_log.text")); // NOI18N
        jPanel2.add(lbl_sco_mil_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        lbl_sco_mil_plan.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.lbl_sco_mil_plan.text")); // NOI18N
        jPanel2.add(lbl_sco_mil_plan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txt_sco_mil_log.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.txt_sco_mil_log.text")); // NOI18N
        jPanel2.add(txt_sco_mil_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, -1));

        txt_sco_mil_plan.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.txt_sco_mil_plan.text")); // NOI18N
        jPanel2.add(txt_sco_mil_plan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 260, -1));

        btn_sco_altera.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.btn_sco_altera.text")); // NOI18N
        btn_sco_altera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sco_alteraActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sco_altera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 90, -1));

        btn_sco_excluir.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.btn_sco_excluir.text")); // NOI18N
        jPanel2.add(btn_sco_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 110, -1));

        btn_sco_salvar.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.btn_sco_salvar.text")); // NOI18N
        jPanel2.add(btn_sco_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, -1));

        btn_sco_novo.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.btn_sco_novo.text")); // NOI18N
        btn_sco_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sco_novoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sco_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 600, 360));

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_area_emp.setColumns(20);
        txt_area_emp.setRows(5);
        jScrollPane1.setViewportView(txt_area_emp);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 605, 191));

        txt_fld_emp_descr.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.txt_fld_emp_descr.text")); // NOI18N
        txt_fld_emp_descr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fld_emp_descrActionPerformed(evt);
            }
        });
        jPanel3.add(txt_fld_emp_descr, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 221, 450, -1));

        lbl_emp_descricao.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.lbl_emp_descricao.text")); // NOI18N
        jPanel3.add(lbl_emp_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 224, -1, -1));

        btn_emp_gravar.setText(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.btn_emp_gravar.text")); // NOI18N
        btn_emp_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emp_gravarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_emp_gravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(TelaSCO.class, "TelaSCO.jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_sco_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sco_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sco_nomeActionPerformed

    private void btn_emp_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emp_gravarActionPerformed
        txt_area_emp.setText(txt_area_emp.getText() + "\n" + getPegaDataAtual().toString() + " - " + txt_fld_emp_descr.getText());
        txt_fld_emp_descr.setText("");
    }//GEN-LAST:event_btn_emp_gravarActionPerformed

    private void txt_fld_emp_descrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fld_emp_descrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fld_emp_descrActionPerformed

    private void txt_sco_mil_admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sco_mil_admActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sco_mil_admActionPerformed

    private void cmb_list_scoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_list_scoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_list_scoActionPerformed

    private void btn_sco_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sco_carregarActionPerformed
        alteraCampos(false);
        btn_sco_excluir.setEnabled(true);
        scoAtual = scoDao.buscaScoPorID(cmb_list_sco.getSelectedIndex());
        txt_sco_nome.setText(scoAtual.getNome());
        txt_sco_mil_cmd.setText(milControl.getMilitarbyId(scoAtual.getIdfuncionariocomando()).getNomeGuerra());
        txt_sco_mil_adm.setText(milControl.getMilitarbyId(scoAtual.getIdfuncionarioadministracao()).getNomeGuerra());
        txt_sco_mil_ope.setText(milControl.getMilitarbyId(scoAtual.getIdfuncionariooperacoes()).getNomeGuerra());
        txt_sco_mil_log.setText(milControl.getMilitarbyId(scoAtual.getIdfuncionariologistica()).getNomeGuerra());
        txt_sco_mil_plan.setText(milControl.getMilitarbyId(scoAtual.getIdfuncionarioplanejamento()).getNomeGuerra());


    }//GEN-LAST:event_btn_sco_carregarActionPerformed

    private void txt_sco_mil_opeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sco_mil_opeActionPerformed
        
    }//GEN-LAST:event_txt_sco_mil_opeActionPerformed

    private void btn_sco_alteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sco_alteraActionPerformed
        
        alteraCampos(true);
        btn_sco_salvar.setEnabled(true);
    }//GEN-LAST:event_btn_sco_alteraActionPerformed

    private void btn_sco_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sco_novoActionPerformed
        
        cmb_list_sco.setSelectedIndex(0);
        limpaCampos();
        alteraCampos(true);
        btn_sco_salvar.setEnabled(false);
        btn_sco_altera.setEnabled(false);
        btn_sco_excluir.setEnabled(false);

    }//GEN-LAST:event_btn_sco_novoActionPerformed

    //pega a data e hora formatada
    public Date getPegaDataAtual() {
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        return calendar.getTime();
    }

    public void carregaTela() {
        listaSco = scoDao.buscaScos();
        for (Sco sco : listaSco) {
            cmb_list_sco.addItem(sco.getIdsco() + " - " + sco.getNome());
        }
        btn_sco_salvar.setEnabled(false);
        btn_sco_excluir.setEnabled(false);

    }

    public void alteraCampos(boolean status) {
        txt_area_emp.setEnabled(status);
        txt_fld_emp_descr.setEnabled(status);
        txt_sco_nome.setEnabled(status);
        txt_sco_mil_adm.setEnabled(status);
        txt_sco_mil_cmd.setEnabled(status);
        txt_sco_mil_log.setEnabled(status);
        txt_sco_mil_plan.setEnabled(status);
        txt_sco_mil_ope.setEnabled(status);
    }

    public void limpaCampos() {
        txt_area_emp.setText("");
        txt_fld_emp_descr.setText("");
        txt_sco_nome.setText("");
        txt_sco_mil_adm.setText("");
        txt_sco_mil_cmd.setText("");
        txt_sco_mil_log.setText("");
        txt_sco_mil_plan.setText("");
        txt_sco_mil_ope.setText("");
    }
}
