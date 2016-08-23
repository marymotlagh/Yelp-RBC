package com.RBC.foodnearyou;

import android.database.Cursor;

public class Resturant {
	private String _id;
	private String _name;
    private String _address	;
    private String _imageUrl;
    private String _reviews;

    public static Resturant fromCursor(Cursor cursor) {
    	Resturant rest = new Resturant();
		
    	rest.setId(cursor.getString(cursor.getColumnIndex("_id")));
    	rest.setName(cursor.getString(cursor.getColumnIndex("_name")));
    	rest.setAddress(cursor.getString(cursor.getColumnIndex("_address")));
    	rest.setImageUrl(cursor.getString(cursor.getColumnIndex("_imageUrl")));
    	rest.setReviews(cursor.getString(cursor.getColumnIndex("_reviews")));
		return rest;
	}
    
    public String getId() {
        return this._id;
    }
    public void setId(String Id) {
        this._id = Id;
    }
    public String getName() {
        return this._name;
    }
    public String getAddres() {
        return this._address;
    }
    public String getImageUrl() {
        return this._imageUrl;
    }
    public String getReviews() {
        return this._reviews;
    }
    public void setName(String Name) {
		this._name = Name;
	}
    public void setAddress(String Address) {
		this._address = Address;
	}
    public void setImageUrl(String ImageUrl) {
		this._imageUrl = ImageUrl;
	}
    public void setReviews(String _reviews) {
		this._reviews = _reviews;
	}
}
