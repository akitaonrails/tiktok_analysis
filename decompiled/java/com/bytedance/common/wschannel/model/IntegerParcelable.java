package com.bytedance.common.wschannel.model;

import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class IntegerParcelable implements Parcelable {
    public static final Parcelable.Creator<IntegerParcelable> CREATOR = new C854630Xfp(4);
    public final int mData;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IntegerParcelable(Parcel parcel) {
        this.mData = parcel.readInt();
    }

    public IntegerParcelable(int i) {
        this.mData = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mData);
    }
}
