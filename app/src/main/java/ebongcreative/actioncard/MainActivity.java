package ebongcreative.actioncard;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import archive.ebongcreative.actioncardview.ActionButton;
import archive.ebongcreative.actioncardview.ActionCardView;

public class MainActivity extends AppCompatActivity {
    private ActionCardView actionCardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CodeActionCard();

    }
    public void CodeActionCard (){
        actionCardView = findViewById(R.id.action_card);
        actionCardView.setDescription("This card was created programmically");
        actionCardView.setTitle("Did you know!");
        ActionButton yesBtn = new ActionButton.Builder(this)
                .setText("yes")
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                })
                .setTextColor(ContextCompat.getColor(this, R.color.colorAccent))
                .create();
        ActionButton noBtn = new ActionButton.Builder(this)
                .setText("no")
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(view.getContext(), "Clicked button no!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setTextColor(ContextCompat.getColor(this, R.color.colorAccent))
                .create();
          actionCardView.addActionButton(yesBtn);
          actionCardView.addActionButton(noBtn);
    }
}
