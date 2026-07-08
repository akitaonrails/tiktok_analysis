package com.bytedance.common.wschannel.model;

import X.C2188811AlT;
import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class ServiceConnectEvent implements Parcelable {
    public static final Parcelable.Creator<ServiceConnectEvent> CREATOR = new C854630Xfp(6);
    public final int mChannelId;
    public final boolean mConnected;
    public final String mLogInfo;
    public final int mServiceId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceConnectEvent{mChannelId=");
        sbLIZ.append(this.mChannelId);
        sbLIZ.append(", mServiceId=");
        sbLIZ.append(this.mServiceId);
        sbLIZ.append(", mConnected=");
        sbLIZ.append(this.mConnected);
        sbLIZ.append(", mLogInfo='");
        sbLIZ.append(this.mLogInfo);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mChannelId);
        parcel.writeInt(this.mServiceId);
        parcel.writeByte(this.mConnected ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mLogInfo);
    }

    public ServiceConnectEvent(int i, int i2, String str, boolean z) {
        this.mChannelId = i;
        this.mServiceId = i2;
        this.mConnected = z;
        this.mLogInfo = str;
    }
}
