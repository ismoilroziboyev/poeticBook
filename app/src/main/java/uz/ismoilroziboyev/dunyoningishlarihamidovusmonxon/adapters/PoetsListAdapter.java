package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.R;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.ItemPoetsListBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.MySharedPreferences;

public class PoetsListAdapter extends RecyclerView.Adapter<PoetsListAdapter.MyViewHolder> {

    private List<Poet> poetList;
    private OnItemClickListener onItemClickListener;
    private MySharedPreferences mySharedPreferences;

    public PoetsListAdapter(List<Poet> poetList, OnItemClickListener onItemClickListener) {
        this.poetList = poetList;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(ItemPoetsListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        mySharedPreferences = MySharedPreferences.getInstance(holder.itemView.getContext());
        holder.binding.titleTv.setText(poetList.get(position).getName());

        if (mySharedPreferences.getLikedPoetsList().contains(poetList.get(position))) {
            holder.binding.likeButton.setImageResource(R.drawable.ic_liked);
        } else {
            holder.binding.likeButton.setImageResource(R.drawable.ic_like_unselected);
        }

//        Picasso.get().load(poetList.get(position).getImageResource()).into(holder.binding.imageView);

        holder.itemView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.animation));

        holder.binding.getRoot().setOnClickListener(v -> onItemClickListener.onItemClicked(poetList.get(position)));
    }

    @Override
    public int getItemCount() {
        return poetList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ItemPoetsListBinding binding;

        public MyViewHolder(@NonNull ItemPoetsListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public interface OnItemClickListener {
        void onItemClicked(Poet poet);
    }
}
