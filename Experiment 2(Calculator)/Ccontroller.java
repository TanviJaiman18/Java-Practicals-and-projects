import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ccontroller implements ActionListener{
    Cmodals cm;
    Cviews cv;

    Ccontroller(Cmodals cm, Cviews cv)
    {
        this.cm = cm;
        this.cv = cv;

        cv.add.addActionListener(this);
        cv.sub.addActionListener(this);
        cv.mul.addActionListener(this);
        cv.div.addActionListener(this);
        cv.per.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        double a = Double.parseDouble(cv.txta.getText());
        double b = Double.parseDouble(cv.txtb.getText());
        double r = 0;
        if(e.getSource() == cv.add){
             r = cm.add(a,b);
        }
        else if(e.getSource() == cv.sub){
             r = cm.sub(a,b);
        }
        else if(e.getSource() == cv.mul){
             r = cm.mul(a,b);
        }
        else if(e.getSource() == cv.div){
             r = cm.div(a,b);
        }
        else if(e.getSource() == cv.per){
            r = cm.per(a,b);
        }
        
        cv.txtresult.setText(String.valueOf(r));
    }
}