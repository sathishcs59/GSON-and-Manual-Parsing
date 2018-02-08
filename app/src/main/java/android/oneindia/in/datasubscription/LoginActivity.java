package android.oneindia.in.datasubscription;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class LoginActivity extends AppCompatActivity {
    private Gson gson;
    Subscription subscription;
  Button btnlogin;
  EditText edit_login;
    String loginid;
    String DataFromServer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin=(Button)findViewById(R.id.btn_login);
        edit_login=(EditText)findViewById(R.id.edit_login);
        DataFromServer = loadJSONFromAsset();
        gson=new Gson();
        subscription=gson.fromJson(DataFromServer,Subscription.class);
        loginid=subscription.getIncluded().get(0).getAttributes().getMsn();

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_login.getText().toString().equals(loginid))
                {
                    Intent loginIntent=new Intent(LoginActivity.this,InformationActivity.class);
                    loginIntent.putExtra("data",DataFromServer);
                    startActivity(loginIntent);

                }
                else
                {
                    edit_login.setError("Enter Correct MSD ID");
                }
            }
        });

    }



    public String loadJSONFromAsset()
    {
        String json = null;
        try {
            InputStream is = LoginActivity.this.getAssets().open("collection.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
