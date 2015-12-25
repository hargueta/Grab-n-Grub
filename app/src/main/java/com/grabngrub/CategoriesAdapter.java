package com.grabngrub;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by juice on 12/23/15.
 */
public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.MyViewHolder> {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<String> mTestData;

    public CategoriesAdapter(Context context, List<String> dataList) {
        mLayoutInflater = LayoutInflater.from(context);
        mTestData = dataList;
        mContext = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = mLayoutInflater.inflate(R.layout.adapter_item, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(rootView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String current = mTestData.get(position);
        holder.mTestText.setText(current);
    }

    @Override
    public int getItemCount() {
        return mTestData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTestText;

        public MyViewHolder(View itemView) {
            super(itemView);

            mTestText = (TextView) itemView.findViewById(R.id.test_list_text);
        }
    }
}
