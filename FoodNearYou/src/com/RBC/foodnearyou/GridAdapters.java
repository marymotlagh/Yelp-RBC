package com.RBC.foodnearyou;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;


public class GridAdapters extends BaseAdapter{

    private Context mContext;
	private LayoutInflater _inflater;
	public String _name;
	public String _address;
	public Resturant[] resData;
	public GridAdapters grvAdapter;
	
    public GridAdapters(Context c, LayoutInflater inflater, Resturant[] Data) {
        mContext = c;
        resData = Data;
        this._inflater = inflater;
    }

    public int getCount() {
        return resData.length;
    }

    public Resturant getItem(int position) {
    	return resData[position];
    }

    public long getItemId(int position) {
        return position;
    }
    class resturanttHolder {
		TextView grid_item_name = new TextView(mContext);
		TextView grid_item_address = new TextView(mContext);
		//LinearLayout gridCell = new LinearLayout(mContext);
	}
    public View getView(int position, View convertView, ViewGroup parent) {
    	//SearchActivity s = new SearchActivity();
    	//GridView grvResturant = (GridView) s.findViewById(R.id.grvResturant);
    	//if(convertView!=null && position==0 && grvResturant.getFirstVisiblePosition()>1) return convertView;
    	//if(convertView!=null && position==0) return convertView;
    	resturanttHolder holder;
		if (convertView == null) {
			holder = null;
			LayoutInflater inflater = _inflater;
			convertView = inflater.inflate(R.layout.grid_layout, parent, false);
			holder = new resturanttHolder();
			holder.grid_item_name = (TextView) convertView.findViewById(R.id.grid_item_name);
			holder.grid_item_address = (TextView) convertView.findViewById(R.id.grid_item_address);
			//holder.gridCell = (LinearLayout) row.findViewById(R.id.gridCell);
			convertView.setTag(holder);
		} else {
			holder = (resturanttHolder) convertView.getTag();
		}
		if (resData[position]!= null) {	
			holder.grid_item_name.setText(resData[position].getName());
			holder.grid_item_address.setText(resData[position].getAddres());
		}
		return convertView;
    }
}