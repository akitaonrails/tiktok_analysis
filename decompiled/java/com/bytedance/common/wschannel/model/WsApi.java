package com.bytedance.common.wschannel.model;

import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class WsApi implements Parcelable {
    public static final Parcelable.Creator<WsApi> CREATOR = new C2325341G0m(3);
    public int method;
    public int service;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.service);
        parcel.writeInt(this.method);
    }
}
