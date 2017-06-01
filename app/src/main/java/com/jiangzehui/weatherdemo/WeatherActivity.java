package com.jiangzehui.weatherdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherActivity extends AppCompatActivity {
    TextView tv;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        tv = (TextView) findViewById(R.id.tv);
        lv = (ListView) findViewById(R.id.lv);
        String province = getIntent().getStringExtra("province");
        String district = getIntent().getStringExtra("district");
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://apicloud.mob.com/").addConverterFactory(GsonConverterFactory.create()).build();
        Api api = retrofit.create(Api.class);
        Call<WeatherModel> data = api.getData(province, district);
        data.enqueue(new Callback<WeatherModel>() {
            @Override
            public void onResponse(Call<WeatherModel> call, Response<WeatherModel> response) {
                final WeatherModel.ResultBean rb = response.body().getResult().get(0);
                tv.setText(rb.getCity() + "-" + rb.getDistrct() + "\n" + rb.getDate() + "\n当前温度：" + rb.getTemperature() + "\n" + rb.getWeather() + "\n" + rb.getWind() + "\n" + rb.getHumidity() + "\n数据更新时间：" + rb.getDate() + " " + rb.getTime());
                lv.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return rb.getFuture().size();
                    }

                    @Override
                    public Object getItem(int i) {
                        return rb.getFuture().get(i);
                    }

                    @Override
                    public long getItemId(int i) {
                        return i;
                    }

                    @Override
                    public View getView(int i, View view, ViewGroup viewGroup) {
                        WeatherModel.ResultBean.FutureBean fb = rb.getFuture().get(i);
                        TextView tv = new TextView(WeatherActivity.this);
                        tv.setPadding(20,20,20,20);
                        tv.setTextSize(20);
                        tv.setText(fb.getDate() + "\n" + fb.getDayTime() + "\n" + fb.getNight() + "\n" + fb.getTemperature() + "\n" + fb.getWeek() + "\n" + fb.getWind());
                        return tv;
                    }
                });

            }

            @Override
            public void onFailure(Call<WeatherModel> call, Throwable t) {
                Log.d("xxx", t.getMessage());
            }
        });
    }
}
