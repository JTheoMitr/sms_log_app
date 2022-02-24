package android.example.smsapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;

public class ContentProviderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider);
        ListView cpListView = findViewById(R.id.lv_contentprovider);

        ContentResolver contentResolver = getContentResolver(); //fetch the content provider
        Uri uriSms = Uri.parse("content://sms/inbox");




    }
}