# ViewBindingInclude

- [**ViewBinding**](https://github.com/gzeinnumer/ViewBindingExample) & [**Kotlin**](https://github.com/gzeinnumer/ViewBindingExampleKT)

- Enable ViewBinding
```gradle
android {

    ...

    buildFeatures{
        viewBinding = true
    }
}
```

- activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <include
        android:id="@+id/included"
        layout="@layout/included_view_example" />

</LinearLayout>
```

- included_view_example.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.cardview.widget.CardView>

    <LinearLayout>

        <TextView
            android:id="@+id/tv1"
            android:text="ID: tv1"/>

        <TextView
            android:id="@+id/tv2"
            android:text="ID: tv2" />
    </LinearLayout>
</androidx.cardview.widget.CardView>
```

- MainActivity.java
```java
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.included.tv1.setOnClickListener(view -> Toast.makeText(MainActivity.this, "tv1 Clicked", Toast.LENGTH_SHORT).show());

        binding.included.tv2.setOnClickListener(view -> Toast.makeText(MainActivity.this, "tv2 Clicked", Toast.LENGTH_SHORT).show());
    }
}
```

---

```
Copyright 2020 M. Fadli Zein
```