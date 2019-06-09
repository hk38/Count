package android.lifeistech.count;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // カウントの値を入れる変数
    int number = 0;
    // カウントを表示するTextViewと結びつける変数
    TextView txt;

    // 画面作成時の動作
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // レイアウトファイルをセット
        setContentView(R.layout.activity_main);

        // 変数にViewを結びつける
        txt = findViewById(R.id.textView);
        // 現在の値をTextViewに反映させる
        txt.setText(String.valueOf(number));
    }

    // プラスボタンを押した時の動作
    public void plus(View v){
        // 変数の値を1増やす
        number++;
        // 現在の値をTextViewに反映させる
        txt.setText(String.valueOf(number));
        checkTextView();
    }

    // マイナスボタンを押した時の動作
    public void minus(View v) {
        // 変数の値を1減らす
        number--;
        // 現在の値をTextViewに反映させる
        txt.setText(String.valueOf(number));
        checkTextView();
    }

    // 初期化ボタンを押した時の動作
    public void reset(View v){
        // 変数の値を0にする
        number = 0;
        // 現在の値をTextViewに反映させる
        txt.setText(String.valueOf(number));
        checkTextView();
    }

    // TextViewの色や形を値に応じて変える
    public void checkTextView() {
        // 10より大きい時赤色にする
        if(Integer.parseInt(txt.getText().toString()) > 10){
            txt.setTextColor(Color.RED);
        }
        else txt.setTextColor(Color.BLACK);

        // 5の倍数の時サイズを大きくする
        if(Integer.parseInt(txt.getText().toString()) % 5 == 0){
            txt.setTextSize(40);
        }
        else txt.setTextSize(24);


    }
}