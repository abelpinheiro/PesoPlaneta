import java.awt.event.*;

public class PesoPlaneta implements ActionListener
{
    private LayoutPro layout;

    public PesoPlaneta(){
        
        layout = new LayoutPro();
        
        layout.getTfpeso().addActionListener(this);
        layout.getTfmostraRes().addActionListener(this);
        layout.getRbmerc().addActionListener(this);
        layout.getRbjup().addActionListener(this);
        layout.getRbmar().addActionListener(this); 
        layout.getRbven().addActionListener(this);
        layout.getRbsat().addActionListener(this);
        layout.getRbura().addActionListener(this);
        
    }
     
    
    
    @Override
    public void actionPerformed(ActionEvent e){
         
           double PesoTerra = Double.parseDouble(layout.getTfpeso().getText());
           if (e.getSource() == layout.getRbmerc()){
               
                   layout.getRbven().setSelected(false);
                   layout.getRbmar().setSelected(false);
                   layout.getRbsat().setSelected(false);
                   layout.getRbura().setSelected(false);
                   layout.getRbjup().setSelected(false);
                   
                   double PesoPlaneta = (PesoTerra) * 0.38;
                   String resultado = String.format("%.2fkg", PesoPlaneta);
                   layout.getTfmostraRes().setText(resultado);       
                   
           }
           
           if (e.getSource() == layout.getRbven()){
                     
                   layout.getRbmar().setSelected(false);
                   layout.getRbmerc().setSelected(false);
                   layout.getRbsat().setSelected(false);
                   layout.getRbura().setSelected(false);
                   layout.getRbjup().setSelected(false);
                     
                   double PesoPlaneta = (PesoTerra) * 0.91;
                   String resultado = String.format("%.2fkg", PesoPlaneta);
                   layout.getTfmostraRes().setText(resultado);
                                
           }
           
           if (e.getSource() == layout.getRbura()){
               
                  layout.getRbven().setSelected(false);
                  layout.getRbmar().setSelected(false);
                  layout.getRbsat().setSelected(false);
                  layout.getRbjup().setSelected(false);
                  layout.getRbjup().setSelected(false);
               
                  double PesoPlaneta = (PesoTerra) * 0.92;
                  String resultado = String.format("%.2fkg", PesoPlaneta);
                  layout.getTfmostraRes().setText(resultado);
                          
           }
           
           if (e.getSource() == layout.getRbjup()){
               
                   layout.getRbven().setSelected(false);
                   layout.getRbmar().setSelected(false);
                   layout.getRbsat().setSelected(false);
                   layout.getRbura().setSelected(false);
                   layout.getRbmerc().setSelected(false);
                     
                   double PesoPlaneta = (PesoTerra) * 2.34;
                   String resultado = String.format("%.2fkg", PesoPlaneta);
                   layout.getTfmostraRes().setText(resultado);
                          
           }
           
           if (e.getSource() == layout.getRbsat()){
               
                  layout.getRbven().setSelected(false);
                  layout.getRbmar().setSelected(false);
                  layout.getRbmerc().setSelected(false);
                  layout.getRbura().setSelected(false);
                  layout.getRbjup().setSelected(false);
               
                  double PesoPlaneta = (PesoTerra) * 1.06;
                  String resultado = String.format("%.2fkg", PesoPlaneta);
                  layout.getTfmostraRes().setText(resultado);
                
           }
           
           if (e.getSource() == layout.getRbmar()){
               
                  layout.getRbven().setSelected(false);
                  layout.getRbmerc().setSelected(false);
                  layout.getRbsat().setSelected(false);
                  layout.getRbura().setSelected(false);
                  layout.getRbjup().setSelected(false);
               
                  double PesoPlaneta = (PesoTerra) * 0.38;
                  String resultado = String.format("%.2fkg", PesoPlaneta);
                  layout.getTfmostraRes().setText(resultado);
                  
           }
        
   }
}



