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

    /**
     * This method is called when RecyclerView needs a new {@link MyViewHolder} of the given type to represent an item.
     * This method creates a View object by inflating our custom view that is defined in
     * layout/custom_task_list.xml using the {@link #mLayoutInflater} member. The view object that is created
     * is passed in to the constructor of {@link MyViewHolder} when creating a MyViewHolder object.
     *
     * @param parent The ViewGroup into which the new View will be added after it is bound to an adapter position.
     * @param viewType The view type of the new View.
     * @return A MyViewHolder object that contains the inflated widgets in layout/list_image.xml
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = mLayoutInflater.inflate(R.layout.adapter_item, parent, false);

        MyViewHolder viewHolder = new MyViewHolder(rootView);

        return viewHolder;
    }

    /**
     * Called by RecyclerView to display the data at the specified position. We obtain the object
     * that contains the data to be displayed by accessing the element in {@link #mTestData} at
     * index position.
     *
     * @param holder The {@link MyViewHolder} which should be updated to represent the contents of the item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String current = mTestData.get(position);
        holder.mTestText.setText(current);
    }

    /**
     * Returns the total number of items in our data set {@link #mTestData}
     *
     * @return The size of our data set {@link #mTestData}
     */
    @Override
    public int getItemCount() {
        return mTestData.size();
    }

    /**
     * This class describes an item view and creates a Java reference to the widgets of
     * our custom view. An object of this class is created by the RecyclerView's onCreateViewHolder
     * method @see #onCreateViewHolder(ViewGroup parent, int viewType)
     */
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTestText;

        public MyViewHolder(View itemView) {
            super(itemView);

            mTestText = (TextView) itemView.findViewById(R.id.test_list_text);
        }
    }
}
