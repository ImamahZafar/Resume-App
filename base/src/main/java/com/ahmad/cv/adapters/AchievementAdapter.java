package com.ahmad.cv.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ahmad.cv.base.R;
import com.ahmad.cv.model.DemoItem;

import java.util.List;

public class AchievementAdapter extends RecyclerView.Adapter {
    private List<DemoItem> demoItems;
    private Context context;
    public AchievementAdapter(List<DemoItem> demoItems, Context context) {
        this.demoItems = demoItems;
        this.context = context;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.achievment, parent, false);
        return new AchievementAdapter.DemoItemHolder4(row);
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }
    @Override
    public int getItemCount() {
        return demoItems.size();
    }
    public class DemoItemHolder4 extends RecyclerView.ViewHolder {

        DemoItemHolder4(View itemView) {
            super(itemView);
        }
    }

}
