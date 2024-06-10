package com.example.tictactoe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AgainstCPU : AppCompatActivity() {
    private var a= arrayOf<String>("","","","","","","","","");
    private var ab:String = ""
    private var xy:String = ""
    private var xyz:Int=3
    private var i:Int=0;
    private lateinit var b1:Button;private lateinit var b2:Button;private lateinit var b3:Button
    private lateinit var b4:Button;private lateinit var b5:Button;private lateinit var b6:Button
    private lateinit var b7:Button;private lateinit var b8:Button;private lateinit var b9:Button
    private lateinit var b:Button
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_against_cpu)
        b1=findViewById(R.id.one)
        b2=findViewById(R.id.two)
        b3=findViewById(R.id.three)
        b4=findViewById(R.id.four)
        b5=findViewById(R.id.five)
        b6=findViewById(R.id.six)
        b7=findViewById(R.id.seven)
        b8=findViewById(R.id.eight)
        b9=findViewById(R.id.nine)
        val t=findViewById<TextView>(R.id.textView2)
        b=findViewById(R.id.button)
        val assign: String? = intent.getStringExtra("value")
        var chance: Int;var x1=0;var x2=0;var x3=0;var x4=0;var x5=0;var x6=0;var x7=0;var x8=0;var x9=0
        if (assign == "1"){
            ab="0";xy="x";chance=1
        }
        else{
            ab="x";xy="0";chance=0
        }
        if (chance==0){
            cpumove();chance=1
        }
        b1.setOnClickListener {
            if (b1.text == "" && x1 == 0) {
                if (chance == 1) {
                    b1.text = xy;chance = 0;a[0]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x1=1;
        }
        b2.setOnClickListener {
            if (b2.text == "" && x2 == 0) {
                if (chance == 1) {
                    b2.text = xy;chance = 0;a[1]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x2=1
        }
        b3.setOnClickListener {
            if (b3.text == "" && x3 ==0) {
                if (chance == 1) {
                    b3.text = xy;chance = 0;a[2]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x3=1
        }
        b4.setOnClickListener {
            if (b4.text == "" && x4 == 0) {
                if (chance == 1) {
                    b4.text = xy;chance = 0;a[3]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x4=1
        }
        b5.setOnClickListener {
            if (b5.text == "" && x5 == 0) {
                if (chance == 1) {
                    b5.text = xy;chance = 0;a[4]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x5=1
        }
        b6.setOnClickListener {
            if (b6.text == "" && x6 == 0) {
                if (chance == 1) {
                    b6.text = xy;chance = 0;a[5]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x6=1
        }
        b7.setOnClickListener {
            if (b7.text == "" && x7 == 0) {
                if (chance == 1) {
                    b7.text = xy;chance = 0;a[6]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x7=1
        }
        b8.setOnClickListener {
            if (b8.text == "" && x8 == 0) {
                if (chance == 1) {
                    b8.text = xy;chance = 0;a[7]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x8=1
        }
        b9.setOnClickListener {
            if (b9.text == "" && x9 == 0) {
                if (chance == 1) {
                    b9.text = xy;chance = 0;a[8]=xy
                }
                i=0
                winnercheck()
                if (xyz ==3 ){cpumove();chance=1}
                winnercheck()
                if (xyz == 1){
                    if (ab=="x")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==0){
                    if(ab=="0")
                        t.text="CPU won the Game"
                    else
                        t.text="You won the Game"
                    x1=1;x2=1;x3=1; x4=1;x5=1;x6=1;x7=1; x8=1;x9=1
                }
                else if(xyz==2)
                    t.text="It's a Tie"
            }
            x9=1
        }
        var intent=Intent(this,Choosing::class.java)
        b.setOnClickListener{
            startActivity(intent)
        }
    }
    private fun winnercheck(){
        if (a[0] == a[1] && a[1] == a[2] && a[0]!=""){
            if (a[1]=="x"){
                xyz=1
            }
            else if(a[1]=="0")
                xyz=0
        }
        else if (a[3] == a[4] && a[4] == a[5] && a[3]!=""){
            if (a[3]=="x"){
                xyz=1
            }
            else if(a[3]=="0")
                xyz=0
        }
        else if (a[6] == a[7] && a[7] == a[8] && a[6]!=""){
            if (a[6]=="x"){
                xyz=1
            }
            else if(a[6]=="0")
                xyz=0
        }
        else if (a[0] == a[3] && a[3] == a[6] && a[0]!=""){
            if (a[0]=="x"){
                xyz=1
            }
            else if(a[0]=="0")
                xyz=0
        }
        else if (a[1] == a[4] && a[4] == a[7] && a[1]!=""){
            if (a[1]=="x"){
                xyz=1
            }
            else if(a[1]=="0")
                xyz=0
        }
        else if (a[2] == a[5] && a[5] == a[8] && a[2]!=""){
            if (a[2]=="x"){
                xyz=1
            }
            else if(a[2]=="0")
                xyz=0
        }
        else if (a[0] == a[4] && a[4] == a[8] && a[0]!=""){
            if (a[0]=="x"){
                xyz=1
            }
            else if(a[0]=="0")
                xyz=0
        }
        else if (a[2] == a[4] && a[4] == a[6] && a[2]!=""){
            if (a[2]=="x"){
                xyz=1
            }
            else if(a[2]=="0")
                xyz=0
        }
        else if (a[0]!=""&&a[1]!=""&&a[2]!=""&&a[3]!=""&&a[4]!=""&&a[5]!=""&&a[6]!=""&&a[7]!=""&&a[8]!="")
            xyz=2

    }
    private fun cpumove(){
        if (a[0] == ab && a[1] == ab && a[2] == "") {
            a[2] = ab;b3.text=ab
        }
        else if (a[1] == ab && a[2] == ab && a[0] == "") {
            a[0] = ab;b1.text=ab
        }
        else if (a[0] == ab && a[2] == ab && a[1] == "") {
            a[1] = ab;b2.text=ab
        }
        else if (a[3] == ab && a[4] == ab && a[5] == ""){
            a[5] = ab;b6.text=ab
        }
        else if (a[4] == ab && a[5] == ab && a[3] == ""){
            a[3] = ab;b4.text=ab
        }
        else if (a[3] == ab && a[5] == ab && a[4] == ""){
            a[4] = ab;b5.text=ab
        }
        else if (a[6] == ab && a[7] == ab && a[8] == ""){
            a[8] = ab;b9.text=ab
        }
        else if (a[7] == ab && a[8] == ab && a[6] == ""){
            a[6] = ab;b7.text=ab
        }
        else if (a[6] == ab && a[8] == ab && a[7] == ""){
            a[7] = ab;b8.text=ab
        }
        else if (a[0] == ab && a[3] == ab && a[6] == ""){
            a[6] = ab;b7.text=ab
        }
        else if (a[0] == ab && a[6] == ab && a[3] == ""){
            a[3] = ab;b4.text=ab
        }
        else if (a[3] == ab && a[6] == ab && a[0] == ""){
            a[0] = ab;b1.text=ab
        }
        else if (a[1] == ab && a[4] == ab && a[7] == ""){
            a[7] = ab;b8.text=ab
        }
        else if (a[4] == ab && a[7] == ab && a[1] == ""){
            a[1] = ab;b2.text=ab
        }
        else if (a[1] == ab && a[7] == ab && a[4] == ""){
            a[4] = ab;b5.text=ab
        }
        else if (a[2] == ab && a[5] == ab && a[8] == ""){
            a[8] = ab;b9.text=ab
        }
        else if (a[5] == ab && a[8] == ab && a[2] == ""){
            a[2] = ab;b3.text=ab
        }
        else if (a[2] == ab && a[8] == ab && a[5] == ""){
            a[5] = ab;b6.text=ab
        }
        else if (a[0] == ab && a[4] == ab && a[8] == ""){
            a[8] = ab;b9.text=ab
        }
        else if (a[0] == ab && a[8] == ab && a[4] == ""){
            a[4] = ab;b5.text=ab
        }
        else if (a[4] == ab && a[8] == ab && a[0] == ""){
            a[0] = ab;b1.text=ab
        }
        else if (a[2] == ab && a[4] == ab && a[6] == ""){
            a[6] = ab;b7.text=ab
        }
        else if (a[4] == ab && a[6] == ab && a[2] == ""){
            a[2] = ab;b3.text=ab
        }
        else if (a[2] == ab && a[6] == ab && a[4] == ""){
            a[4] = ab;b5.text=ab
        }
        else if ((a[0] == xy || a[2] == xy || a[6] == xy || a[8] == xy) && a[4]==
            ""){
            a[4] = ab;b5.text=ab
        }
        else if (a[0] == xy && a[1] == xy && a[2] == ""){
            a[2] = ab;b3.text=ab
        }
        else if (a[1] == xy && a[2] == xy && a[0] == ""){
            a[0] = ab;b1.text=ab
        }
        else if (a[0] == xy && a[2] == xy && a[1] == ""){
            a[1] = ab;b2.text=ab
        }
        else if (a[3] == xy && a[4] == xy && a[5] == ""){
            a[5] = ab;b6.text=ab
        }
        else if (a[4] == xy && a[5] == xy && a[3] == ""){
            a[3] = ab;b4.text=ab
        }
        else if (a[3] == xy && a[5] == xy && a[4] == ""){
            a[4] = ab;b5.text=ab
        }
        else if (a[6] == xy && a[7] == xy && a[8] == ""){
            a[8] = ab;b9.text=ab
        }
        else if (a[7] == xy && a[8] == xy && a[6] == ""){
            a[6] = ab;b7.text=ab
        }
        else if (a[6] == xy && a[8] == xy && a[7] == ""){
            a[7] = ab;b8.text=ab
        }
        else if (a[0] == xy && a[3] == xy && a[6] == ""){
            a[6] = ab;b7.text=ab
        }
        else if (a[0] == xy && a[6] == xy && a[3] == ""){
            a[3] = ab;b4.text=ab
        }
        else if (a[3] == xy && a[6] == xy && a[0] == ""){
            a[0] = ab;b1.text=ab
        }
        else if (a[1] == xy && a[4] == xy && a[7] == ""){
            a[7] = ab;b8.text=ab
        }
        else if (a[4] == xy && a[7] == xy && a[1] == ""){
            a[1] = ab;b2.text=ab
        }
        else if (a[1] == xy && a[7] == xy && a[4] == ""){
            a[4] = ab;b5.text=ab
        }
        else if (a[2] == xy && a[5] == xy && a[8] == ""){
            a[8] = ab;b9.text=ab
        }
        else if (a[5] == xy && a[8] == xy && a[2] == ""){
            a[2] = ab;b3.text=ab
        }
        else if (a[2] == xy && a[8] == xy && a[5] == ""){
            a[5] = ab;b6.text=ab
        }
        else if (a[0] == xy && a[4] == xy && a[8] == ""){
            a[8] = ab;b9.text=ab
        }
        else if (a[0] == xy && a[8] == xy && a[4] == ""){
            a[4] = ab;b5.text=ab
        }
        else if (a[4] == xy && a[8] == xy && a[0] == ""){
            a[0] = ab;b1.text=ab
        }
        else if (a[2] == xy && a[4] == xy && a[6] == ""){
            a[6] = ab;b7.text=ab
        }
        else if (a[4] == xy && a[6] == xy && a[2] == ""){
            a[2] = ab;b3.text=ab
        }
        else if (a[2] == xy && a[6] == xy && a[4] == ""){
            a[4] = ab;b5.text=ab
        }
        else if (a[0] =="" || a[1] =="" || a[2] =="" || a[3] =="" || a[4] =="" || a[5] =="" || a[6] =="" || a[7] =="" || a[8] =="" ){
            var y = 0
            while (y == 0) {
                var move: Int = (0..8).random()
                if (a[move] == "") {
                    a[move] = ab;i=move
                    if (i==0) b1.text=ab
                    else if (i==1) b2.text=ab
                    else if (i==2) b3.text=ab
                    else if (i==3) b4.text=ab
                    else if (i==4) b5.text=ab
                    else if (i==5) b6.text=ab
                    else if (i==6) b7.text=ab
                    else if (i==7) b8.text=ab
                    else if (i==8) b9.text=ab
                    y = 1
                }
                else
                    y = 0
            }
        }
    }
}