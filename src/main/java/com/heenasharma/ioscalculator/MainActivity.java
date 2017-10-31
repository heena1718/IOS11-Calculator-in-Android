package com.heenasharma.ioscalculator;

import android.app.Activity;
import android.content.res.Configuration;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    String op1;
    TextView result;
    int i=0;
    String operand1="0.0";
    String operand2="0.0";
    Double opp1=0.0;
    Double opp2=0.0;
    Double ans=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (getResources().getConfiguration().orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
                setContentView(R.layout.activity_main);
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                setContentView(R.layout.landscape);
                break;
        }

//        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
    }
    public void cal(View v)
    {
        switch (v.getId())
        {
            case R.id.one:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("1");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"1");
                }
                break;
            }
            case R.id.two:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("2");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"2");
                }
                break;
            }
            case R.id.three:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("3");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"3");
                }
                break;
            }
            case R.id.four:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("4");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"4");
                }
                break;
            }
            case R.id.five:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("5");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"5");
                }
                break;
            }
            case R.id.six:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("6");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"6");
                }
                break;
            }
            case R.id.seven:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("7");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"7");
                }
                break;
            }
            case R.id.eight:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("8");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"8");
                }
                break;
            }
            case R.id.nine:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("9");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"9");
                }
                break;
            }
            case R.id.zero:
            {
                op1 = result.getText().toString();
                if(op1.equalsIgnoreCase("0"))
                {
                    result.setText("0");
                }
                else if(op1.length()>=10)
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+"0");
                }
                break;
            }
            case R.id.clear:
            {
                result.setText("0");
                opp1=0.0;
                opp2=0.0;
                ans=0.0;
                i=0;
                break;
            }
            case R.id.percentage:
            {
                op1 = result.getText().toString();

                opp1 = Double.parseDouble(op1);
                opp2 = opp1/100;

                result.setText(String.valueOf(opp2));
                break;
            }

            case R.id.plus:
            {
                op1 = result.getText().toString();
                if(op1.contains("-"))
                {
                    result.setText(op1.substring(1,op1.length()));
                }
                else
                {
                    result.setText("-"+op1);
                }
                break;
            }
            case R.id.point:
            {
                op1 = result.getText().toString();
                if(op1.contains("."))
                {
                    result.setText(op1);
                }
                else
                {
                    result.setText(op1+".");
                }
                break;
            }
            case R.id.add:
            {
                operand1 = result.getText().toString();
                i = 1;
                result.setText("0");
                break;
            }
            case R.id.minius:
            {
                operand1 = result.getText().toString();
                i = 2;
                result.setText("0");
                break;
            }
            case R.id.multiply:
            {
                operand1 = result.getText().toString();
                i = 3;
                result.setText("0");
                break;
            }
            case R.id.devide:
            {
                operand1 = result.getText().toString();
                i = 4;
                result.setText("0");
                break;
            }
            case R.id.equal:
            {

                operand2 = result.getText().toString();

                   opp1 = Double.parseDouble(operand1);
                    opp2 = Double.parseDouble(operand2);

                    if (i == 1) {
                        ans = opp1 + opp2;
                    } else if (i == 2) {
                        ans = opp1 - opp2;
                    } else if (i == 3) {
                        ans = opp1 * opp2;
                    } else if (i == 4) {
                        ans = opp1 / opp2;
                    }



                String final_ans = String.valueOf(ans);

                String ff = final_ans.substring(final_ans.indexOf("."),final_ans.length());

               if(ff.equalsIgnoreCase(".0"))
                {

                    result.setText(final_ans.substring(0,final_ans.indexOf(".")));
                }
                else
                {

                    result.setText(final_ans.substring(0,10));
                }
                i=0;
                break;

            }
        }
    }
}
