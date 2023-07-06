package com.example.bluetooth;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT=0;
    private static final int REQUEST_DISCOVER_BT=1;

    private TextView mStatusBleTv,mPairedTv;
    ImageView mBlueTv;
    Button mOnBtn,mOffBtn,mDiscoveredBtn,mPairedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStatusBleTv=findViewById(R.id.statusBlutoothTv);
        mPairedTv=findViewById(R.id.pairTv);
        mBlueTv=findViewById(R.id.bluetoothTv);



    }
}