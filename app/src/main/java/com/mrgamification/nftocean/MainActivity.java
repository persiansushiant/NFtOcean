package com.mrgamification.nftocean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.mrgamification.nftocean.model.Match;
import com.mrgamification.nftocean.model.Product;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton img1, img2, barande, bazande;
    Button btn1, btn2;
    int index = 0;
    TextView txt;
    int[] myDrawables = new int[]{R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};
    String[] myFeatures = new String[]{"a", "b", "c", "d", "e"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FindViews();
        SetOnclickListeners();
        FillTextView();
        FillData();
    }

    private void FillData() {
        Product p1 = Product.findById(Product.class, 1l);
        Product p2 = Product.findById(Product.class, 2l);
        SetImageButtonWithResource(img1,p1);
        SetImageButtonWithResource(img2,p2);
    }

    private void SetImageButtonWithResource(ImageButton img, Product p) {
        int id = getResources().getIdentifier(p.getName(), "drawable", getPackageName());
        img.setImageResource(id);
    }

    private void FillTextView() {
        txt.setText("compare two nft for " + (index + 1) + " vizhegi");
    }

    private void SetOnclickListeners() {
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    private void FindViews() {
        img1 = (ImageButton) findViewById(R.id.img1);
        img2 = (ImageButton) findViewById(R.id.img2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        txt = (TextView) findViewById(R.id.txt);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
                break;

            case R.id.img1:
                barande = img1;
                bazande = img2;

                DoTheRest();
                break;
            case R.id.img2:
                barande = img2;
                bazande = img1;
                DoTheRest();
                break;
        }
    }

    private void DoTheRest() {
        bazande.setImageResource(myDrawables[index]);
        index++;
        CalculateScoreFOrBazande();
        CalculateScoreFOrBarande();
        FillTextView();
    }

    private void CalculateScoreFOrBarande() {
        List<Match> myList = Match.find(Match.class, "feature = ? and winnerId = ?", myFeatures[index - 1], getUserId() + "");
        int score = 0;
        for (Match match : myList) {
            score += match.getLooserPoint() + 400;
        }

        int newScore = score / myList.size();
        SavenewScore(newScore);
    }

    private void SavenewScore(int newScore) {

        ///save this score in Product feature
        //save match
    }

    private Object getUserId() {
        return 1;
    }

    private void CalculateScoreFOrBazande() {
        List<Match> myList = Match.find(Match.class, "feature = ? and LooserId = ?", myFeatures[index - 1], getUserId() + "");
        int score = 0;
        for (Match match : myList) {
            score += match.getLooserPoint() + 400;
        }
        int newScore = score / myList.size();
        SavenewScore(newScore);
    }
}