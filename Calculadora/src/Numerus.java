import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.util.Arrays;


class Numerus {
    private Op op;
    public Numerus(Op op){
        this.op = op;
    }
   public void analisarEcalcular(){
        if (op.getValores().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nada pra Calcular, patron!");
            return
        }

        double resultado = 0;
        List<String> OperacaoAtual = op.getOperadores();
        for(String OperacaoAtual : op.getValores()){

        }


   }




}

