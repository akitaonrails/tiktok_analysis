package com.bytedance.common.wschannel.model;

import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class ServiceParcelable implements Parcelable {
    public static final Parcelable.Creator<ServiceParcelable> CREATOR = new C854630Xfp(7);
    public final int mChannelId;
    public final int mServiceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ServiceParcelable(int i, int i2) {
        this.mChannelId = i;
        this.mServiceId = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mChannelId);
        parcel.writeInt(this.mServiceId);
    }
}
