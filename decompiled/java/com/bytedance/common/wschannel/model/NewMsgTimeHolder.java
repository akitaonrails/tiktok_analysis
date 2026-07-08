package com.bytedance.common.wschannel.model;

import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class NewMsgTimeHolder implements Parcelable {
    public static final Parcelable.Creator<NewMsgTimeHolder> CREATOR = new C854630Xfp(5);
    public final long endDecodeTs;
    public final long receiveRawDataTs;
    public final long startDecodeTs;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public NewMsgTimeHolder(Parcel parcel) {
        this.receiveRawDataTs = parcel.readLong();
        this.startDecodeTs = parcel.readLong();
        this.endDecodeTs = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.receiveRawDataTs);
        parcel.writeLong(this.startDecodeTs);
        parcel.writeLong(this.endDecodeTs);
    }

    public NewMsgTimeHolder(long j, long j2, long j3) {
        this.receiveRawDataTs = j;
        this.startDecodeTs = j2;
        this.endDecodeTs = j3;
    }
}
