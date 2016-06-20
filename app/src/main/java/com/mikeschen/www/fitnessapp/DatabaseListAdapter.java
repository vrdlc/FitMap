package com.mikeschen.www.fitnessapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Ramon on 6/17/16.
 */
public class DatabaseListAdapter extends RecyclerView.Adapter<DatabaseListAdapter.DatabaseViewHolder> {
    private ArrayList<Steps> mSteps = new ArrayList<>();
    private Context mContext;

    public DatabaseListAdapter(Context context, ArrayList<Steps> steps) {
        mContext = context;
        mSteps = steps;
    }

    @Override
    public DatabaseListAdapter.DatabaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.database_list_item, parent, false);
        DatabaseViewHolder viewHolder = new DatabaseViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(DatabaseListAdapter.DatabaseViewHolder holder, int position) {
        holder.bindSteps(mSteps.get(position));
    }

    @Override
    public int getItemCount() {
        return mSteps.size();
    }

    public class DatabaseViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.textViewId) TextView mTextViewId;
        @Bind(R.id.textViewSteps) TextView mTextViewSteps;
        @Bind(R.id.textViewDate) TextView mTextViewDate;
        private Context mContext;

        public DatabaseViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindSteps(Steps steps) {
            mTextViewId.setText(String.valueOf(steps.getId()));
            mTextViewSteps.setText(String.valueOf(steps.getStepsTaken()));
            mTextViewDate.setText(String.valueOf(steps.getDate()));

        }
    }
}
