package javaapplication50;

import javax.swing.*;
import java.awt.*;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

public class JavaApplication50 {

    public static void main(String[] args) {
        String sekans1; //J "ccatcgccatcg"        
        String sekans2;//I "gcatcggc"
        String []sekanslar=new String[2];
        int [][]kordinat;
        sekanslar=sekans_al();
        sekans1=sekanslar[0];
        sekans2=sekanslar[1];
        kordinat=dimerleri_hesapla_kesistir(sekans1, sekans2);
        Jtable_Fasta tablo=new Jtable_Fasta(sekans1, sekans2, kordinat);

        
        
    }
    static String[] sekans_al()
    {
        boolean X;
        String []sekanslar=new String[2];
        do {
            X=false;
            sekanslar[0]=JOptionPane.showInputDialog("1.seknasý giriniz (saðdan-sola yazýlýcak [0. satýrda olucak])");
            sekanslar[1]=JOptionPane.showInputDialog("2.seknasý giriniz (yukardan-aþaðýya yazýlýcak [0. sütünda olucak]");
            sekanslar[0]=sekanslar[0].toLowerCase();
            sekanslar[1]=sekanslar[1].toLowerCase();
            for (int i = 0; i < sekanslar[0].length(); i++) {
                if(sekanslar[0].charAt(i)=='a'||sekanslar[0].charAt(i)=='c'||sekanslar[0].charAt(i)=='g'||sekanslar[0].charAt(i)=='t')
                    continue;
                else{
                                        System.out.println("girdi "+i);
                    X=true;
                    break;
                }
            }
            for (int i = 0; i < sekanslar[1].length(); i++) {
                if(sekanslar[1].charAt(i)=='a'||sekanslar[1].charAt(i)=='c'||sekanslar[1].charAt(i)=='g'||sekanslar[1].charAt(i)=='t')
                    continue;
                else{
                    System.out.println("girdi "+i);
                    X=true;
                    break;
                }
            }
            if(X==true){
                JOptionPane.showMessageDialog(null, " Lütfen dna yý temsil eden harfler dýþýnda(a,c,g,t) harf girmeyin ! ", "Hata Mesajý",1 );
            }
                
                
            }while (X);     
        

        return sekanslar;
                
    }
    static int [][] dimerleri_hesapla_kesistir(String sekans1,String sekans2)
    {
        int [][] kordinat=new int[sekans2.length()][sekans1.length()];        
        
        for (int i = 0; i < sekans2.length()-1; i++) {     
            
            for (int j = 0; j < sekans1.length()-1; j++) {               
                
                if (sekans2.charAt(i)==sekans1.charAt(j) && sekans2.charAt(i+1)==sekans1.charAt(j+1)) {
                    
                    kordinat[i][j]=1;
                    
                    if(i!=0 &&  j!=0 && kordinat[i][j]!=0 && kordinat[i-1][j-1] !=0 ){
                        kordinat[i][j]+=kordinat[i-1][j-1];
                    }                        
                    
                }
                
            }
            
        }       
        return kordinat;
    }    
}
class Jtable_Fasta extends JFrame 
{
    JTable tablo;
    JPanel jpnl;
    JLabel jlb;
    JLabel jlb2;

    public Jtable_Fasta(String sekans1, String sekans2 , int[][]kordinat)
    {
        super("Fasta Hizlama Matrisi Ve Puanlarý");       
        this.setSize(1280, 720);
        this.setVisible(true);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);              
        this.setLayout(null);
        
        jpnl=new JPanel();
        jpnl.setBounds(10, 20, 1200, 700);
        jpnl.setLayout(null);
        this.add(jpnl);
        
        jlb=new JLabel("*****    Ahmet Bahadýr Aksakal     *****     20360859079     *****     k==2 kabul edilmiþtir ***** ");
        jlb.setBounds(20,0,1200,18);
        jpnl.add(jlb);
        
        jlb2=new JLabel("fonskiyonlarý tam toplayamadým, kodun okunurluðu kötü oldu  :(  ");
        jlb2.setBounds(20,20,500,18);
        jpnl.add(jlb2);
        
        Object[] sutun=new Object[sekans1.length()+1];
        sutun[0]='-';
        
        for (int i = 1; i < sekans1.length()+1; i++) {
            sutun[i]=sekans1.charAt(i-1);
            
        }
        
        sutun[sekans1.length()]=sekans1.charAt(sekans1.length()-1);
        Object[][] veri=new Object[sekans2.length()+1][sekans1.length()+1];
        veri[0][0]="-";
        
        for (int i = 1; i < sekans2.length()+1; i++) {
            veri[i][0]=sekans2.charAt(i-1);           
        }
        
        for (int i = 1; i < sekans1.length()+1; i++) {
            veri[0][i]=sekans1.charAt(i-1);          
        }
        
        for (int i = 1; i < sekans2.length()+1; i++) {
            for (int j = 1; j < sekans1.length()+1; j++) {
                veri[i][j]=kordinat[i-1][j-1];                  
            }           
        }

        tablo =new JTable(veri, sutun);          
        tablo.setEnabled(false);  
        tablo.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablo.setPreferredScrollableViewportSize(new Dimension(100, 200));
        tablo.setRowHeight(30);        
        TableColumnModel columnModel = tablo.getColumnModel();
        for (int i = 0; i < veri[0].length; i++) {
            columnModel.getColumn(i).setPreferredWidth(30);
        }  
        
        CustomRenderer x=new CustomRenderer();
        tablo.setDefaultRenderer(Object.class, x);   
        
        JScrollPane cubuk=new JScrollPane(tablo,VERTICAL_SCROLLBAR_ALWAYS,HORIZONTAL_SCROLLBAR_ALWAYS);  
        cubuk.setBounds(20, 42, 1100, 600);
        jpnl.add(cubuk);

    }   
}
class CustomRenderer extends DefaultTableCellRenderer 
{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);       


            if (table.getModel().getValueAt(row, column)==(Object)0){
                 c.setBackground(Color.white); 

            }
            else if(table.getModel().getValueAt(row, column)==(Object)'a'|| table.getModel().getValueAt(row, column)==(Object)'c'
                    || table.getModel().getValueAt(row, column)==(Object)'g'|| table.getModel().getValueAt(row, column)==(Object)'t'
                    ||table.getModel().getValueAt(row, column)==(Object)"-"){

                  c.setBackground(Color.white); 
            }                      
            else if(table.getModel().getValueAt(row, column)==(Object)1 && table.getModel().getValueAt(row+1, column+1)!=(Object)2 )
                c.setBackground(Color.white); 
            else{
                    c.setBackground(Color.cyan);  
            }

            return c;        
    }
}
