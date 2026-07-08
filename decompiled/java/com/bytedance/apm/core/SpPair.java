package com.bytedance.apm.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.apm.core.SpPair;

/* JADX INFO: loaded from: classes4.dex */
public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new Parcelable.Creator<SpPair>() { // from class: X.092V
        @Override // android.os.Parcelable.Creator
        public final SpPair createFromParcel(Parcel parcel) {
            return new SpPair(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpPair[] newArray(int i) {
            return new SpPair[i];
        }
    };
    public String mKey;
    public Object mValue;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SpPair(Parcel parcel) {
        this.mKey = parcel.readString();
        this.mValue = parcel.readValue(getClass().getClassLoader());
    }

    public SpPair(String str, Object obj) {
        this.mKey = str;
        this.mValue = obj;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mKey);
        parcel.writeValue(this.mValue);
    }
}
