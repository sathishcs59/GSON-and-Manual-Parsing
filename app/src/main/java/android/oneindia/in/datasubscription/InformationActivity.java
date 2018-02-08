package android.oneindia.in.datasubscription;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class InformationActivity extends AppCompatActivity {
    String mProduct;
String mProductname,mProductPrice,mProductdatabalance;
    private Gson gson;
     Subscription subscription;
    private JSONArray jsonArrayBatches;
    TextView data,price,name,customerDOb,PaymentType;
    TextView customername,customermobile,customeremail,customer_expiry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        customername=(TextView)findViewById(R.id.text_customername);
        customermobile=(TextView)findViewById(R.id.text_customer_number);
        customeremail=(TextView)findViewById(R.id.text_customer_mail);
        customerDOb=(TextView)findViewById(R.id.text_dob);
        PaymentType=(TextView)findViewById(R.id.text_paymenttype);
        customeremail=(TextView)findViewById(R.id.text_customer_mail);
        customer_expiry=(TextView)findViewById(R.id.text_expirydate);
        name=(TextView)findViewById(R.id.text_product_name);
        price=(TextView)findViewById(R.id.text_product_price);
        data=(TextView)findViewById(R.id.text_available_data);
        Bundle bundle = getIntent().getExtras();
        mProduct= bundle.getString("data");


        gson=new Gson();
        subscription=gson.fromJson(mProduct,Subscription.class);
        customername.setText("Name:"+" "+subscription.getData().getAttributes().getFirstname()+subscription.getData().getAttributes().getLastname());
        customermobile.setText("Mobile:"+" "+subscription.getData().getAttributes().getContactnumber());
        customeremail.setText("Mail id:"+" "+subscription.getData().getAttributes().getEmailaddress());
        customerDOb.setText("D.O.B:"+" "+subscription.getData().getAttributes().getDateofbirth());
        PaymentType.setText("Payment Mode:"+subscription.getData().getAttributes().getPaymenttype());
        JSONObject jsonResponse = null;

        try {
            jsonResponse = new JSONObject(mProduct);
            jsonArrayBatches = jsonResponse.getJSONArray("included");
            JSONObject jsonObject=jsonArrayBatches.getJSONObject(1);
            JSONObject jsonObjectbalance  =jsonObject.getJSONObject("attributes");
            mProductdatabalance= jsonObjectbalance.getString("included-data-balance");
           customer_expiry.setText("Data expiry:"+" "+jsonObjectbalance.getString("expiry-date"));
            data.setText("Data Available:"+" "+mProductdatabalance);
            JSONObject jsonObject2=jsonArrayBatches.getJSONObject(2);
            JSONObject jsonObjectproduct  =jsonObject2.getJSONObject("attributes");
            mProductname=jsonObjectproduct.getString("name");
            name.setText("Plan:"+" "+mProductname);
            mProductPrice=jsonObjectproduct.getString("price");
            price.setText("Cost:"+" "+mProductPrice);
        } catch (JSONException e) {
            e.printStackTrace();
        }




        //subscription.getIncluded().


    }

}
