package com.imamah.cv.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.imamah.cv.model.DemoItem;
import com.imamah.cv.base.R;

import java.util.List;
public class EducationAdapter extends RecyclerView.Adapter {
    private List<DemoItem> demoItems;
    private Context        context;
    private ImageView education_publication_link;

    public EducationAdapter(List<DemoItem> demoItems, Context context) {
        this.demoItems   = demoItems;
        this.context     = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View           row      = inflater.inflate(R.layout.education, parent, false);

        return new DemoItemHolder(row);
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
    public class DemoItemHolder extends RecyclerView.ViewHolder {
        DemoItemHolder(View itemView) {
            super(itemView);
        }
    }
}
