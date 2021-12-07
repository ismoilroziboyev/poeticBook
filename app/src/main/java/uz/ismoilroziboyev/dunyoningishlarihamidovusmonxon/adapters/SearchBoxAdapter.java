package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.R;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.ItemSearchElementBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;

public class SearchBoxAdapter extends ArrayAdapter<Poet> {

    private List<Poet> poetList;
    private List<Poet> poetsAllList;
    private OnItemClickListener onItemClickListener;

    public SearchBoxAdapter(@NonNull Context context, @NonNull List<Poet> objects, OnItemClickListener onItemClickListener) {
        super(context, R.layout.item_search_element, objects);
        this.poetList = new ArrayList<>();
        this.poetsAllList = objects;
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public int getCount() {
        return poetList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Nullable
    @Override
    public Poet getItem(int position) {
        return poetList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ItemSearchElementBinding binding;

        if (convertView == null) {
            binding = ItemSearchElementBinding.inflate(LayoutInflater.from(parent.getContext()));
        } else {
            binding = ItemSearchElementBinding.bind(convertView);
        }

        binding.titleTv.setText(poetList.get(position).getName());
        binding.chapterTv.setText(poetList.get(position).getChapter());

        binding.getRoot().setOnClickListener(v -> onItemClickListener.onItemClicked(poetList.get(position)));

        return binding.getRoot();
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();
                List<Poet> poetsSuggestion = new ArrayList<>();
                if (constraint != null) {
                    for (Poet poet : poetsAllList) {
                        if (poet.toString().toLowerCase().contains(constraint.toString().toLowerCase())) {
                            poetsSuggestion.add(poet);
                        }
                    }
                    filterResults.values = poetsSuggestion;
                    filterResults.count = poetsSuggestion.size();
                }
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                poetList.clear();
                if (results != null && results.count > 0) {

                    for (Object object : (List<?>) results.values) {
                        if (object instanceof Poet) {
                            poetList.add((Poet) object);
                        }
                    }
                    notifyDataSetChanged();
                } else if (constraint == null) {

                    poetList.addAll(poetsAllList);
                    notifyDataSetInvalidated();
                }
            }
        };
    }

    public interface OnItemClickListener {
        void onItemClicked(Poet poet);
    }
}
