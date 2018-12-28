package app.meetup.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import app.meetup.R;
import app.meetup.model.News;

public class NewsFragmentAdapter extends RecyclerView.Adapter<NewsFragmentAdapter.DataViewHolder> {
    private ArrayList<News> mList;
    private Context mContext;

    public NewsFragmentAdapter(Context context, ArrayList<News> list) {
        mList = list;
        mContext = context;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_news, viewGroup, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder dataViewHolder, int i) {
        News news = mList.get(i);
        dataViewHolder.tvTitle.setText(news.getTitle());
        dataViewHolder.tvDate.setText(news.getPublishDate());
        dataViewHolder.tvAuthor.setText(news.getAuthor());
        dataViewHolder.tvSource.setText(news.getFeed());
        Glide.with(mContext)
                .load(news.getThumbImg())
                .into(dataViewHolder.imgThumbnail);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgThumbnail;
        private TextView tvTitle;
        private TextView tvDate;
        private TextView tvAuthor;
        private TextView tvSource;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);
            tvSource = itemView.findViewById(R.id.tvSource);
            imgThumbnail = itemView.findViewById(R.id.imgThumbnail);
        }
    }
}
