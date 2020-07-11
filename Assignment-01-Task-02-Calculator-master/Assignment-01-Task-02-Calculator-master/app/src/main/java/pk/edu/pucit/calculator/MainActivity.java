package pk.edu.pucit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String equation="";
    public String subEquation="";
    public String answer="";
    public char operator=' ';
    public double answer1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickedAC(View view)
    {
        equation="";
        subEquation="";
        answer="";
        answer1=0;
        operator=' ';
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked1(View view)
    {
        equation=equation+"1";
        subEquation=subEquation+"1";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked2(View view){
        equation=equation+"2";
        subEquation=subEquation+"2";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked3(View view){
        equation=equation+"3";
        subEquation=subEquation+"3";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked4(View view){
        equation=equation+"4";
        subEquation=subEquation+"4";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked5(View view){
        equation=equation+"5";
        subEquation=subEquation+"5";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked6(View view){
        equation=equation+"6";
        subEquation=subEquation+"6";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked7(View view){
        equation=equation+"7";
        subEquation=subEquation+"7";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked8(View view){
        equation=equation+"8";
        subEquation=subEquation+"8";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked9(View view){
        equation=equation+"9";
        subEquation=subEquation+"9";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked0(View view){
        equation=equation+"0";
        subEquation=subEquation+"0";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clicked00(View view){
        equation=equation+"00";
        subEquation=subEquation+"00";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clickedMultiply(View view){

        if(subEquation=="")
        {
            Toast.makeText(this, "Please enter operand not operator!", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(operator==' '){
        answer1=Double.valueOf(subEquation).doubleValue();
        equation=equation+"X";
        operator='*';
        subEquation="";
        }
        else if(operator!=' ') {
            double answer2=0;
            double value=Double.valueOf(subEquation).doubleValue();
            if(operator=='*')
                answer2=answer1*value;
            else if(operator=='/')
                answer2=answer1/value;
            else if(operator=='+')
                answer2=answer1+value;
            else if(operator=='-')
                answer2=answer1-value;
            else if(operator=='%')
                answer2=answer1%value;
            answer1=answer2;
            equation=equation+"X";
            operator='*';
            subEquation="";
        }
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clickedDivide(View view){
        if(subEquation=="")
        {
            Toast.makeText(this, "Please enter operand not operator!", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(operator==' '){
            answer1=Double.valueOf(subEquation).doubleValue();
            equation=equation+"/";
            operator='/';
            subEquation="";
        }
        else if(operator!=' ') {
            double answer2=0;
            double value=Double.valueOf(subEquation).doubleValue();
            if(operator=='*')
                answer2=answer1*value;
            else if(operator=='/')
                answer2=answer1/value;
            else if(operator=='+')
                answer2=answer1+value;
            else if(operator=='-')
                answer2=answer1-value;
            else if(operator=='%')
                answer2=answer1%value;
            answer1=answer2;
            equation=equation+"/";
            operator='/';
            subEquation="";
        }
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clickedPlus(View view){
        if(subEquation=="")
        {
            Toast.makeText(this, "Please enter operand not operator!", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(operator==' '){
            answer1=Double.valueOf(subEquation).doubleValue();
            equation=equation+"+";
            operator='+';
            subEquation="";
        }
        else if(operator!=' ') {
            double answer2=0;
            double value=Double.valueOf(subEquation).doubleValue();
            if(operator=='*')
                answer2=answer1*value;
            else if(operator=='/')
                answer2=answer1/value;
            else if(operator=='+')
                answer2=answer1+value;
            else if(operator=='-')
                answer2=answer1-value;
            else if(operator=='%')
                answer2=answer1%value;
            answer1=answer2;
            equation=equation+"+";
            operator='+';
            subEquation="";
        }
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clickedMinus(View view){
        if(subEquation=="")
        {
            Toast.makeText(this, "Please enter operand not operator!", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(operator==' '){
            answer1=Double.valueOf(subEquation).doubleValue();
            equation=equation+"-";
            operator='-';
            subEquation="";
        }
        else if(operator!=' ') {
            double answer2=0;
            double value=Double.valueOf(subEquation).doubleValue();
            if(operator=='*')
                answer2=answer1*value;
            else if(operator=='/')
                answer2=answer1/value;
            else if(operator=='+')
                answer2=answer1+value;
            else if(operator=='-')
                answer2=answer1-value;
            else if(operator=='%')
                answer2=answer1%value;
            answer1=answer2;
            equation=equation+"-";
            operator='-';
            subEquation="";
        }
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clickedModulus(View view){
        if(subEquation=="")
        {
            Toast.makeText(this, "Please enter operand not operator!", Toast.LENGTH_SHORT).show();
            return;
        }
        else if(operator==' '){
            answer1=Double.valueOf(subEquation).doubleValue();
            equation=equation+"%";
            operator='%';
            subEquation="";
        }
        else if(operator!=' ') {
            double answer2=0;
            double value=Double.valueOf(subEquation).doubleValue();
            if(operator=='*')
                answer2=answer1*value;
            else if(operator=='/')
                answer2=answer1/value;
            else if(operator=='+')
                answer2=answer1+value;
            else if(operator=='-')
                answer2=answer1-value;
            else if(operator=='%')
                answer2=answer1%value;
            answer1=answer2;
            equation=equation+"%";
            operator='%';
            subEquation="";
        }
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    public void clickedDelete(View view){
        if(subEquation!=""){
            subEquation = subEquation.substring(0, subEquation.length() - 1);
            equation=equation.substring(0,equation.length()-1);
            TextView v1=(TextView)findViewById(R.id.tv_equation);
            v1.setText(equation);
        }
        else if(operator!=' '){
            operator=' ';
            equation=equation.substring(0,equation.length()-1);
            TextView v1=(TextView)findViewById(R.id.tv_equation);
            v1.setText(equation);
        }
    }
    public void clickedEqual(View view){

        if(operator==' '||subEquation=="") {
            Toast.makeText(this, "Please give proper input", Toast.LENGTH_SHORT).show();
            return;
        }
        double answer2=0;
        double value=Double.valueOf(subEquation).doubleValue();
        if(operator=='*')
            answer2=answer1*value;
        else if(operator=='/')
            answer2=answer1/value;
        else if(operator=='+')
            answer2=answer1+value;
        else if(operator=='-')
            answer2=answer1-value;
        else if(operator=='%')
            answer2=answer1%value;
        operator=' ';
        TextView v1=(TextView)findViewById(R.id.tv_result);
        v1.setText(Double.toString(answer2));
        answer1=answer2;
        operator=' ';
        subEquation="";
    }
    public void clickedDot(View view){
        equation=equation+".";
        subEquation=subEquation+".";
        TextView v1=(TextView)findViewById(R.id.tv_equation);
        v1.setText(equation);
    }
    //public TextView view1=findViewById(R.id.oneButton);

}
