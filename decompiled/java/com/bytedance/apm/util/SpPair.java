package com.bytedance.apm.util;

import X.C20307314d5;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes31.dex */
public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new C20307314d5(4);
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mKey);
        parcel.writeValue(this.mValue);
    }
}
