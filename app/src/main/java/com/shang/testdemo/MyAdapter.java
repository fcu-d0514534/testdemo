package com.shang.testdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shang on 2018/1/5.
 */

public class MyAdapter extends BaseAdapter {
    String[] data={"抽籤","搜尋","健康管理參照","卡路里計算","聯絡我們","常見問題"};
    int[] picture={R.drawable.lottery,R.drawable.lottery,R.drawable.lottery,R.drawable.calories,R.drawable.gmail,R.drawable.question};


    Context context;
    public MyAdapter(Context context){
        this.context=context;
    }


    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        Holder holder;

        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.list_item,null);
            holder=new Holder();
            holder.textView=(TextView) view.findViewById(R.id.textView);
            holder.imageView=(ImageView)view.findViewById(R.id.imageView);
            view.setTag(holder);
        }else{
            holder=(Holder)view.getTag();
        }

        holder.textView.setText(data[position]);
        holder.imageView.setImageResource(picture[position]);

        return view;
    }

    class Holder{
        TextView textView;
        ImageView imageView;

    }
}
