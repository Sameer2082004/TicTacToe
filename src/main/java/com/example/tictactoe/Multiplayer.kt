package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Multiplayer : AppCompatActivity() {
    private var a= arrayOf<String>("","","","","","","","","");
    private var xy=3;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplayer)
        var flag=0;var x1=0;var x2=0;var x3=0;var x4=0;var x5=0;var x6=0;var x7=0;var x8=0;var x9=0
        var b1=findViewById<Button>(R.id.one)
        var b2=findViewById<Button>(R.id.two)
        var b3=findViewById<Button>(R.id.three)
        var b4=findViewById<Button>(R.id.four)
        var b5=findViewById<Button>(R.id.five)
        var b6=findViewById<Button>(R.id.six)
        var b7=findViewById<Button>(R.id.seven)
        var b8=findViewById<Button>(R.id.eight)
        var b9=findViewById<Button>(R.id.nine)
        var t=findViewById<TextView>(R.id.textView2)
        var b=findViewById<Button>(R.id.button)
        b.setOnClickListener(){
            b1.text="";b2.text="";b3.text="";b4.text="";b5.text="";b6.text="";b7.text="";b8.text="";b9.text=""
            flag=0;x1=0;x2=0;x3=0; x4=0;x5=0;x6=0;x7=0; x8=0;x9=0;xy=3;
            a[0]="";a[1]="";a[2]="";a[3]="";a[4]="";a[5]="";a[6]="";a[7]="";a[8]="";
            t.text=""
        }
        b1.setOnClickListener() {
            if (flag == 0 && x1 == 0) {
                a[0] = "x";flag = 1;
            } else if (flag == 1 && x1 == 0) {
                a[0] = "0";flag = 0;
            }
            b1.text = a[0];x1 = 1;
            winnercheck()
            if (xy == 1){
                t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==0){
                t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==2)
                t.text="It's a Tie"
        }
        b2.setOnClickListener(){
            if (flag==0 && x2==0){
                a[1]="x";flag=1;
            }
            else if(flag==1 && x2==0){
                a[1]="0";flag=0;
            }
            b2.text=a[1];x2=1;
            winnercheck()
            if (xy == 1){
                t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==0){
                t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==2)
                t.text="It's a Tie"
        }
        b3.setOnClickListener(){
            if (flag==0 && x3==0){
                a[2]="x";flag=1;
            }
            else if(flag==1 && x3==0){
                a[2]="0";flag=0;
            }
            b3.text=a[2];x3=1;
            winnercheck()
            if (xy == 1){
                t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==0){
                t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==2)
                t.text="It's a Tie"
        }
        b4.setOnClickListener(){
            if (flag==0 && x4==0){
                a[3]="x";flag=1;
            }
            else if(flag==1 && x4==0){
                a[3]="0";flag=0;
            }
            b4.text=a[3];x4=1;
            winnercheck()
            if (xy == 1){
                t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==0){
                t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==2)
                t.text="It's a Tie"
        }
        b5.setOnClickListener(){
            if (flag==0 && x5==0){
                a[4]="x";flag=1;
            }
            else if(flag==1 && x5==0){
                a[4]="0";flag=0;
            }
            b5.text=a[4];x5=1;
            winnercheck()
            if (xy == 1){
                t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==0){
                t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==2)
                t.text="It's a Tie"
        }
        b6.setOnClickListener(){
            if (flag==0 && x6==0){
                a[5]="x";flag=1;
            }
            else if(flag==1 && x6==0){
                a[5]="0";flag=0;
            }
            b6.text=a[5];x6=1;
            winnercheck()
            if (xy == 1){
                t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==0){
                t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==2)
                t.text="It's a Tie"
        }
        b7.setOnClickListener(){
            if (flag==0 && x7==0){
                a[6]="x";flag=1;
            }
            else if(flag==1 && x7==0){
                a[6]="0";flag=0;
            }
            b7.text=a[6];x7=1;
            winnercheck()
            if (xy == 1){
                t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==0){
                t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1;
            }
            else if(xy==2)
                t.text="It's a Tie"
        }
        b8.setOnClickListener(){
            if (flag==0 && x8==0){
                a[7]="x";flag=1;
            }
            else if(flag==1 && x8==0){
                a[7]="0";flag=0;
            }
            b8.text=a[7];x8=1;
            winnercheck()
            if (xy == 1){
                t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
            }
            else if(xy==0){
                t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
            }
            else if(xy==2)
                t.text="It's a Tie"
        }
        b9.setOnClickListener(){
            if (flag==0 && x9==0){
                a[8]="x";flag=1;
            }
            else if(flag==1 && x9==0){
                a[8]="0";flag=0;
            }
            b9.text=a[8];x9=1;
            winnercheck()
            if (xy == 1)
            {t.text="Player X won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1}
            else if(xy==0)
            {t.text="Player 0 won the Game";x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1}
            else if(xy==2)
                t.text="It's a Tie"
        }

    }
    private fun winnercheck(){
        if (a[0] == a[1] && a[1] == a[2] && a[0]!=""){
            if (a[1]=="x"){
                xy=1;
            }
            else if(a[1]=="0")
                xy=0;
        }
        else if (a[3] == a[4] && a[4] == a[5] && a[3]!=""){
            if (a[3]=="x"){
                xy=1;
            }
            else if(a[3]=="0")
                xy=0;
        }
        else if (a[6] == a[7] && a[7] == a[8] && a[6]!=""){
            if (a[6]=="x"){
                xy=1;
            }
            else if(a[6]=="0")
                xy=0;
        }
        else if (a[0] == a[3] && a[3] == a[6] && a[0]!=""){
            if (a[0]=="x"){
                xy=1;
            }
            else if(a[0]=="0")
                xy=0;
        }
        else if (a[1] == a[4] && a[4] == a[7] && a[1]!=""){
            if (a[1]=="x"){
                xy=1;
            }
            else if(a[1]=="0")
                xy=0;
        }
        else if (a[2] == a[5] && a[5] == a[8] && a[2]!=""){
            if (a[2]=="x"){
                xy=1;
            }
            else if(a[2]=="0")
                xy=0;
        }
        else if (a[0] == a[4] && a[4] == a[8] && a[0]!=""){
            if (a[0]=="x"){
                xy=1;
            }
            else if(a[0]=="0")
                xy=0;
        }
        else if (a[2] == a[4] && a[4] == a[6] && a[2]!=""){
            if (a[2]=="x"){
                xy=1;
            }
            else if(a[2]=="0")
                xy=0;
        }
        else if (a[0]!=""&&a[1]!=""&&a[2]!=""&&a[3]!=""&&a[4]!=""&&a[5]!=""&&a[6]!=""&&a[7]!=""&&a[8]!="")
            xy=2;

    }
}