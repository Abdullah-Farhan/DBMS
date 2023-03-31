/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kitsu;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author devil
 */
public class UserAnimeData extends javax.swing.JFrame {

    /**
     * Creates new form UserAnimeData
     */
    public UserAnimeData() {
        initComponents();
        
        KITSU15.setText(home.anime);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        KITSU15 = new javax.swing.JLabel();
        KITSU14 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        KITSU17 = new javax.swing.JLabel();
        KITSU18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 250));
        setMinimumSize(new java.awt.Dimension(400, 250));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KITSU15.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        KITSU15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(KITSU15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        KITSU14.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        KITSU14.setForeground(new java.awt.Color(255, 255, 255));
        KITSU14.setText("Add Anime");
        jPanel1.add(KITSU14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Done");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 7, true));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 160, 40));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.setText("completed/dropped");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 190, 30));

        KITSU17.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        KITSU17.setForeground(new java.awt.Color(255, 255, 255));
        KITSU17.setText("Score");
        jPanel1.add(KITSU17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        KITSU18.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        KITSU18.setForeground(new java.awt.Color(255, 255, 255));
        KITSU18.setText("Status");
        jPanel1.add(KITSU18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setText("1-10");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String name, username,score,status, id = "", yes, Null;
        Null = null;
        name = home.anime;
        username = SigninFrame.username;
        yes = "Yes";
        
        int counter = 0;
        
        String testid = null;
        
        score = jTextField3.getText();
        status = jTextField2.getText();
        System.out.println("kek");
        System.out.println(SigninFrame.email);
        try{
            java.sql.Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");//Nom	hr@//localhost:1521/xe
            Statement stmt = mycon.createStatement();
            ResultSet result = stmt.executeQuery("select * from animestatusv1 cross join status where animestatusv1.status_uid = id and anime_name = '"+home.anime+"' and status.user_email = '"+SigninFrame.email+"'");
            while(result.next()){
                System.out.println(result.getString(2)+result.getString(8));
                if (result.getString(2).equals(home.anime) && result.getString(8).equals(SigninFrame.email)){
                    if ((!(score.equals("1-10") || score.equals(""))) && (!(status.endsWith("completed/dropped")) || status.equals(""))){
                        System.out.println("inside if");
                        testid = result.getString(1);
                        System.out.println(SigninFrame.email);
                        System.out.println(testid);
                        
                        
                        
                        stmt.executeQuery("update status set score = '"+score+"' where id = "+testid+"");
                        
                        System.out.println("Query 1 executed");
                        
                        if (status.equals("Watching")){
                            stmt.executeQuery("update status set plantowatch = '"+Null+"', completed = '"+Null+"', watching = '"+yes+"' where id = '"+testid+"'");
                        }
                        else if (status.equals("Completed")){
                            stmt.executeQuery("update status set plantowatch = '"+Null+"', completed = '"+yes+"', watching = '"+Null+"' where id = '"+testid+"'");
                        }
                        
                        else if (status.equals("Plan to Watch")){
                            stmt.executeQuery("update status set plantowatch = '"+yes+"', completed = '"+Null+"', watching = '"+Null+"' where id = '"+testid+"'");
                        }
                        
                        JOptionPane.showMessageDialog(null, "Anime Updated!");
                        counter = 1;
                    }
                }
            }
            
            if(counter == 0){
            try{
                result = stmt.executeQuery("Select count(uid) from status");
                while(result.next()){
                    if (result.getString(1).equals("0")){
                        id = "1";
                    }
                    else{
                        System.out.println("Q2");
                        result = stmt.executeQuery("select max(status_uid) from animestatusv1");
                        while (result.next()){
                            id = result.getString(1);
                            int i = (Integer.parseInt(id))+1;
                            id = String.valueOf(i);
                            System.out.println(id);
                        }
                    }
                }
                    System.out.println("Q3");
                    System.out.println(id);
                    System.out.println(SigninFrame.email);

                    if (status.equals("Completed")){
                        System.out.println("inside if");
                        stmt.executeQuery("insert into status values('"+id+"','"+score+"','"+yes+"','"+Null+"','"+Null+"','"+SigninFrame.email+"')");
                    }
                    else if(status.equals("Watching")){
                        stmt.executeQuery("insert into status values('"+id+"','"+score+"','"+Null+"','"+yes+"','"+Null+"','"+SigninFrame.email+"')");
                    }
                    else if(status.equals("Plan to Watch")){
                        stmt.executeQuery("insert into status values('"+id+"','"+score+"','"+Null+"','"+Null+"','"+yes+"','"+SigninFrame.email+"')");
                    }

                    JOptionPane.showMessageDialog(null,"Anime Added!");
                    System.out.println("Q5");
                    stmt.executeQuery("insert into animestatusv1 values('"+(id)+"','"+home.anime+"')");
                    
                    String temp="";
                    float avg = 0.0f;
                    
                    result = stmt.executeQuery("select score from anime where name = '"+home.anime+"'");
                    while (result.next()){
                        temp = result.getString(1);
                        avg = Float.parseFloat(temp);
                    }
                    
                    if (avg == 1.0f){
                        avg = 2.0f;
                        stmt.executeQuery("update anime set score = '"+avg+"' where name = '"+home.anime+"'");
                        System.out.println("Updated Score");
                    }
            }
            
            catch (SQLException e){
                System.out.println(e.toString());
                JOptionPane.showMessageDialog(null,"An Error Occured");
            }
            }
  
        }
            
        catch(SQLException e){
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null,"An Error Occured");
        }
        
        ShowsAddData.animeName = "";
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserAnimeData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAnimeData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAnimeData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAnimeData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAnimeData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KITSU14;
    private javax.swing.JLabel KITSU15;
    private javax.swing.JLabel KITSU17;
    private javax.swing.JLabel KITSU18;
    private javax.swing.JButton jButton10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
