package androidlabs.gsheets2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidlabs.gsheets2.R;
import androidlabs.gsheets2.model.MyDataModel;


import java.util.List;

public class MyArrayAdapter extends ArrayAdapter<MyDataModel> {

    List<MyDataModel> modelList;
    Context context;
    private LayoutInflater mInflater;

    // Constructors
    public MyArrayAdapter(Context context, List<MyDataModel> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        modelList = objects;
    }

    @Override
    public MyDataModel getItem(int position) {
        return modelList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder vh;
        if (convertView == null) {
            View view = mInflater.inflate(R.layout.layout_row_view, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        MyDataModel item = getItem(position);

        vh.textViewName.setText(item.getName());
        vh.textViewCountry.setText(item.getCountry());

        return vh.rootView;
    }



    private static class ViewHolder {
        public final RelativeLayout rootView;

        public final TextView textViewName;
        public final TextView textViewCountry;

        private ViewHolder(RelativeLayout rootView, TextView textViewName, TextView textViewCountry) {
            this.rootView = rootView;
            this.textViewName = textViewName;
            this.textViewCountry = textViewCountry;
        }

        public static ViewHolder create(RelativeLayout rootView) {
            TextView textViewName = (TextView) rootView.findViewById(R.id.textViewName);
            TextView textViewCountry = (TextView) rootView.findViewById(R.id.textViewCountry);
            return new ViewHolder(rootView, textViewName, textViewCountry);
        }
    }
}