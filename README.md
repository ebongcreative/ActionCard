# ActionCard
Simple way to create Action CardViews

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them
Add it in your root build.gradle at the end of repositories:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```
		dependencies {
	        compile 'com.github.ebongcreative:ActionCard:master-SNAPSHOT'
	}

```

### XML

In your XML to manipulate JAVA

```
<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

    <archive.ebongcreative.actioncardview.ActionCardView
        android:id="@+id/action_card"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="4dp"
        android:visibility="gone"
        app:cardDividerHeight="1px"/>

    </LinearLayout>

```

In your XML 

```
<LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

    <archive.ebongcreative.actioncardview.ActionCardView
        android:id="@+id/action_card"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="4dp"
        android:visibility="gone"
        app:cardDividerHeight="1px"
        app:cardTitle="Hello"
        app:cardDescription="Description goes here">
        
        <archive.ebongcreative.actioncardview.ActionButton
            android:text="Hi"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
        
    </archive.ebongcreative.actioncardview.ActionCardView>

    </LinearLayout>
```

In JAVA
```
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

```

## Finally

Run the app

### Thanks

ebongcreativity group

```
ebongutibe@gmail.com
```

## License

This project is licensed under the MIT License

## Tweaks

* add descriptions background color
* adds title background color
