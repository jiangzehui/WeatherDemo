package com.jiangzehui.weatherdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    CityModel wm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://apicloud.mob.com/").addConverterFactory(GsonConverterFactory.create()).build();
        Api api = retrofit.create(Api.class);
        Call<CityModel> data = api.getData();
        data.enqueue(new Callback<CityModel>() {
            @Override
            public void onResponse(Call<CityModel> call, Response<CityModel> response) {

                wm = response.body();
                lv.setAdapter(new BaseAdapter() {
                    @Override
                    public int getCount() {
                        return wm.getResult().size();
                    }

                    @Override
                    public Object getItem(int i) {
                        return wm.getResult().get(i);
                    }

                    @Override
                    public long getItemId(int i) {
                        return i;
                    }

                    @Override
                    public View getView(int i, View view, ViewGroup viewGroup) {
                        TextView tv = new TextView(MainActivity.this);
                        tv.setPadding(20,20,20,20);
                        tv.setTextSize(20);
                        tv.setTextColor(Color.BLACK);
                        tv.setText(wm.getResult().get(i).getProvince());
                        return tv;
                    }
                });

            }

            @Override
            public void onFailure(Call<CityModel> call, Throwable t) {
                Log.d("xxx", t.getMessage());
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final List<CityModel.ResultBean.CityBean> list = wm.getResult().get(i).getCity();
                String str[] = new String[list.size()];
                for (int i1 = 0; i1 < list.size(); i1++) {
                    str[i1] = list.get(i1).getCity();
                }
                final String province = wm.getResult().get(i).getProvince();

                new AlertDialog.Builder(MainActivity.this).setTitle("请选择城市").setItems(str, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        final List<CityModel.ResultBean.CityBean.DistrictBean> lists=list.get(i).getDistrict();
                        String str[] = new String[lists.size()];
                        for (int i1 = 0; i1 < lists.size(); i1++) {
                            str[i1] = lists.get(i1).getDistrict();
                        }
                        new AlertDialog.Builder(MainActivity.this).setTitle("请选择城市").setItems(str, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String district = lists.get(i).getDistrict();
                               startActivity(new Intent(MainActivity.this,WeatherActivity.class).putExtra("district",district).putExtra("province",province));
                            }
                        }).show();





                    }
                }).show();
            }
        });
    }
}
