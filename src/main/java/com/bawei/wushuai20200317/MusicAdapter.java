package com.bawei.wushuai20200317;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.wushuai20200317.bean.ContentBean;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public Context context;
    public List<ContentBean> contentBeans;

    public MusicAdapter(Context context, Class<ContentBean> contentBeanClass) {
        this.context = context;
        this.contentBeans = contentBeans;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGrop, int i) {
        View view = View.inflate(context, R.layout.item, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i){

    }

    @Override
    public int getItemCount() {
        return contentBeans.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView images;
        TextView geming;
        TextView author;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            images = itemView.findViewById(R.id.images);
            geming = itemView.findViewById(R.id.geming);
            author = itemView.findViewById(R.id.name);
        }
    }
    private OnitemListener listener;
    public void setOnitemListener(OnitemListener onitemListener){
        listener = onitemListener;
    }
    public interface OnitemListener{
        void onclick(int i);
    }
}
