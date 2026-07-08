package com.ss.android.vesdk.runtime;

import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes36.dex */
public class VEMapBufferInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<VEMapBufferInfo> CREATOR = new C2325341G0m(59);
    public static final long serialVersionUID = 1;
    public double CMTime;
    public float[] clientVertexes;
    public int[] clientVertexesLength;
    public double firstTriggerTime;
    public double[] timestamp;
    public double totalTriggerTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEMapBufferInfo() {
    }

    public VEMapBufferInfo(Parcel parcel) {
        this.CMTime = parcel.readDouble();
        this.firstTriggerTime = parcel.readDouble();
        this.totalTriggerTime = parcel.readDouble();
        this.timestamp = parcel.createDoubleArray();
        this.clientVertexes = parcel.createFloatArray();
        this.clientVertexesLength = parcel.createIntArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.CMTime);
        parcel.writeDouble(this.firstTriggerTime);
        parcel.writeDouble(this.totalTriggerTime);
        parcel.writeDoubleArray(this.timestamp);
        parcel.writeFloatArray(this.clientVertexes);
        parcel.writeIntArray(this.clientVertexesLength);
    }
}
