package com.heytap.mcs.liquid.model;

import X.C854630Xfp;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes14.dex */
public class SeedingRequestResult implements Parcelable {
    public static final Parcelable.Creator<SeedingRequestResult> CREATOR = new C854630Xfp(18);
    public int currentStatus;
    public boolean isSuccess;
    public String requestId;
    public String traceId;
    public int verifyStatus;

    public SeedingRequestResult() {
    }

    public SeedingRequestResult(Parcel parcel) {
        this.isSuccess = parcel.readByte() != 0;
        this.requestId = parcel.readString();
        this.traceId = parcel.readString();
        this.currentStatus = parcel.readInt();
        this.verifyStatus = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SeedingRequestResult{isSuccess=" + this.isSuccess + ", requestId='" + this.requestId + "', traceId='" + this.traceId + "', currentStatus=" + this.currentStatus + ", verifyStatus=" + this.verifyStatus + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isSuccess ? (byte) 1 : (byte) 0);
        parcel.writeString(this.requestId);
        parcel.writeString(this.traceId);
        parcel.writeInt(this.currentStatus);
        parcel.writeInt(this.verifyStatus);
    }
}
