/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soura;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;




/**
 *
 * @author L41
 */
public class sbfinal extends javax.swing.JFrame {
     public String TA;
    public String TB;
       public List<String> tableonelist;
    public List<String> tabletwolist;
   

     
static int milisec=0;
static int sec=0;
static int min=0; 

static boolean state=true;
    /**
     * Creates new form sbfinal
     */
    public sbfinal(List<String> tableone,List<String> tabletwo,String name1,String name2) {
        initComponents();
      
            tableonelist=tableone;
        tabletwolist=tabletwo;
        TA=name1;
        TB=name2;
        String j="";
        String k="";
           cb1.addItem(null);
           cb2.addItem(null);
           
        for(String i:tableonelist){
            
           j=j+"\n"+i;
           
           cb1.addItem(i);
          
         
        }
        for(String i:tabletwolist){
            k=k+"\n"+i;
            cb2.addItem(i);
            
           
        }
      
           
     
         TA=name1;
        TB=name2;
        q1.setText(TA);
        q2.setText(TB);
         if (TA.equals("FC Barcelona"))
        {
            l1.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\barcalogo.png"));
        }else if(TA.equals("Real Madrid C.F."))
        {
            l1.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\rmdlogo.png"));
        }else if(TA.equals("Atletico Madrid"))
        {
            l1.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\atmlogo.png"));
        }else if (TA.equals("Sevilla FC"))
        {
            l1.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\sevillalogo.png"));
        }else if(TA.equals("Valencia CF"))
        {
            l1.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\valencialogo.png"));
        }
        
        
        if (TB.equals("FC Barcelona"))
        {
            l2.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\barcalogo.png"));
        }else if(TB.equals("Real Madrid C.F."))
        {
            l2.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\rmdlogo.png"));
        }else if(TB.equals("Atletico Madrid"))
        {
            l2.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\atmlogo.png"));
        }else if (TB.equals("Sevilla FC"))
        {
            l2.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\sevillalogo.png"));
        }else if(TB.equals("Valencia CF"))
        {
            l2.setIcon(new ImageIcon("D:\\2018-19\\IP Practical\\shirsh\\src\\soura\\valencialogo.png"));
        }
    }

    public sbfinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        pause = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        finish = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        txtg1 = new javax.swing.JTextField();
        txtg2 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        lblsec = new javax.swing.JLabel();
        lblmilisec = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        txtmatchday = new javax.swing.JTextField();
        ty = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtans = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("matchday");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start.setText("start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        pause.setText("pause");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });
        getContentPane().add(pause, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SCORE BOARD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 179, 41));

        jButton2.setText("goal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 60, 30));

        finish.setText("FINISH");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        getContentPane().add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        q1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        q1.setForeground(new java.awt.Color(255, 255, 255));
        q1.setText("TEAM1");
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 29));

        q2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        q2.setForeground(new java.awt.Color(255, 255, 255));
        q2.setText("TEAM2");
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, -1, -1));

        txtg1.setText("0");
        getContentPane().add(txtg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 59, 53));

        txtg2.setText("0");
        getContentPane().add(txtg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 60, 53));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 150, 130));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 153, 130));

        lblmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmin.setForeground(new java.awt.Color(255, 255, 255));
        lblmin.setText("0");
        getContentPane().add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 72, 49));

        lblsec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblsec.setForeground(new java.awt.Color(255, 255, 255));
        lblsec.setText("0");
        getContentPane().add(lblsec, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 64, 49));

        lblmilisec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmilisec.setForeground(new java.awt.Color(255, 255, 255));
        lblmilisec.setText("0");
        getContentPane().add(lblmilisec, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 50, 49));

        jButton1.setText("goal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 60, 30));

        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        cb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb2ItemStateChanged(evt);
            }
        });
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        txtmatchday.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmatchdayKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmatchdayKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmatchdayKeyTyped(evt);
            }
        });
        getContentPane().add(txtmatchday, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 50, -1));

        txtans.setColumns(20);
        txtans.setRows(5);
        jScrollPane1.setViewportView(txtans);

        javax.swing.GroupLayout tyLayout = new javax.swing.GroupLayout(ty);
        ty.setLayout(tyLayout);
        tyLayout.setHorizontalGroup(
            tyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tyLayout.setVerticalGroup(
            tyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(ty, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 320, 130));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MATCHDAY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soura/images33.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

            
      
        state=true;
        Thread t=new Thread()
        { public void run ()
            {
                for( ;;)
                if (state ==true)
                {
                    try
                    {
                        sleep(1);
                        if (milisec>1000)
                        { milisec=0;
                            sec++;}
                        if(sec>60)
                        {milisec=0;
                            sec=0;
                            min++;}
                        lblmilisec.setText(":"+milisec);
                        milisec++;
                        lblsec.setText(":"+sec);
                        lblmin.setText(":"+min);

                    }
                    catch(Exception e)
                    {}
                }
                else
                {break;}
            }

        };
        t.start();
        
    }//GEN-LAST:event_startActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
        state=false;

    }//GEN-LAST:event_pauseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 finish.setEnabled(false);
 txtans.setText(" " );
 JOptionPane.showMessageDialog(null,"PLEASE ENTER MATCHDAY NUMBER!");
pause.setVisible(false);        
cb1.setVisible(false);
cb2.setVisible(false);
  

    }//GEN-LAST:event_formWindowOpened

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
try
{ty.setVisible(true);
    String m=lblmin.getText();
    String s=lblsec.getText();  
    String p1=(String)cb1.getSelectedItem();
    txtans.append(""+p1+"player scored goal  at Time"+m+"min"+s+"seconds"+"\n"+" "); 
      try{
        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project12","root","123456");
        Statement stmt=con.createStatement();
        String str="Insert into players values('"+p1+"');";
        stmt.executeUpdate(str);
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
                    
}
catch(Exception e)
{
        JOptionPane.showMessageDialog(null, e);
}       
    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtans.setVisible(true);
        cb1.setVisible(true);
        pause.doClick();
        int n;
        n=Integer.parseInt(txtg1.getText());
        int m1=n+1;
        txtg1.setText(""+m1);
      
   
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

txtans.setVisible(true);
cb2.setVisible(true);
pause.doClick();
int n;
n=Integer.parseInt(txtg2.getText());
 int m1=n+1;
 txtg2.setText(""+m1);
   
        
       
        
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
String f=txtmatchday.getText();
        if (f.equals(null))
        {
              JOptionPane.showMessageDialog(null,"PLEASE ENTER MATCH NO.");
        }
        else
        {
        int resp=JOptionPane.showConfirmDialog(this, "Do you want to Save !");
   int mts=Integer.parseInt(txtmatchday.getText());
        if(resp==JOptionPane.YES_OPTION)
        {
        try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project12","root","123456");
            Statement stmt=con.createStatement();
            String str="Insert into matchhistory values("+txtmatchday.getText()+",'"+q1.getText()+"','"+q2.getText()+"',"+txtg1.getText()+","+txtg2.getText()+");";
        stmt.executeUpdate(str);
        JOptionPane.showMessageDialog(null, "data saved");
        int t1=Integer.parseInt(txtg1.getText());
                int t2=Integer.parseInt(txtg2.getText());
                String p1=q1.getText();
                   String p2=q2.getText();
                   String str1;
                   String str2;
                  
                  if (t1>t2)
                  {
                      str1="insert into win values ('"+p1+"'); ";
                      str2="insert into loss values('"+p2+"');";
                  }else if (t1<t2)
                  {
                       str1="insert into win values ('"+p2+"');"; 
                       str2="insert into loss values('"+p1+"');";
                  }else
                  {
                       str1="insert into draw values ('"+p2+"');";
                      str2=" insert into draw values('"+p1+"');";}
                  stmt.executeUpdate(str1);
                    stmt.executeUpdate(str2);
                  
                  stmt.close();
                  con.close();
                 
                 startframe sf=new startframe();
                 sf.setVisible(true);
                 this.dispose();
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "please enter a new matchdayno." );
        }
        
        }
        }
        
        
  
        
    
    
    }//GEN-LAST:event_finishActionPerformed

    private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged

       
        
    }//GEN-LAST:event_cb1ItemStateChanged

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
ty.setVisible(true);
        String m=lblmin.getText();
        String s=lblsec.getText();
       String p2=(String)cb2.getSelectedItem();
       
       txtans.append(""+p2+"player scored goal  at Time"+m+"min"+s+"seconds"+"\n"+" ");  
          try{
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/project12","root","123456");
            Statement stmt=con.createStatement();
            String str="Insert into players values('"+p2+"');";
        stmt.executeUpdate(str);
      }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
                    
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb2ItemStateChanged

       
        
    }//GEN-LAST:event_cb2ItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          
    }//GEN-LAST:event_formWindowActivated

    private void txtmatchdayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatchdayKeyPressed
        
        if(txtmatchday.getText().equals(""))
        {  
        finish.setEnabled(false);
        }else
        {
            finish.setEnabled(true);
        }
        
    }//GEN-LAST:event_txtmatchdayKeyPressed

    private void txtmatchdayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatchdayKeyReleased
    if(txtmatchday.getText().equals(""))
        {  
        finish.setEnabled(false);
        }else
        {
            finish.setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatchdayKeyReleased

    private void txtmatchdayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmatchdayKeyTyped
    if(txtmatchday.getText().equals(""))
        {  
        finish.setEnabled(false);
        }else
        {
            finish.setEnabled(true);
        }      
    }//GEN-LAST:event_txtmatchdayKeyTyped

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
            java.util.logging.Logger.getLogger(sbfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sbfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sbfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sbfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sbfinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton finish;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel lblmilisec;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel lblsec;
    private javax.swing.JButton pause;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JButton start;
    private javax.swing.JTextArea txtans;
    private javax.swing.JTextField txtg1;
    private javax.swing.JTextField txtg2;
    private javax.swing.JTextField txtmatchday;
    private javax.swing.JPanel ty;
    // End of variables declaration//GEN-END:variables
}
