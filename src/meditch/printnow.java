package meditch;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class printnow {
    
    public static boolean printcard( final String bill){
    
    final PrinterJob job=PrinterJob.getPrinterJob();
    
    Printable printtxt=new Printable() {
        @Override
        public int print(Graphics grap, PageFormat pf, int pageIndex) throws PrinterException {
            Graphics2D g2d=(Graphics2D) grap;
            g2d.translate(pf.getImageableX(), pf.getImageableY());
            g2d.setFont(new Font("monospaced",Font.BOLD,10));
             String[] bills=bill.split(":");
             int y=50;
             int i;
             for( i=0;i<bills.length;i++);
             grap.drawString(bills[i],15,y);
             y=y+15;
        
           if(pageIndex>0){ return  NO_SUCH_PAGE;}
           return PAGE_EXISTS;
    }     
    };
       PageFormat pf=new  PageFormat();
       pf.setOrientation(PageFormat.PORTRAIT);
       Paper ppr=pf.getPaper();
       
       ppr.setImageableArea(0,0, ppr.getWidth(),ppr.getHeight()-2);
       pf.setPaper(ppr);
       job.setPrintable(printtxt,pf);
       
        try{ 
        
        job.print();
        
        }catch(Exception e){
        
            System.out.println(e);
        
        }
       
       
     return true;   
    
    
    }
    }