package com.ss.android.vesdk.clipparam;

import X.C2188811AlT;
import X.C580950MqT;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class VEClipTimelineParam implements Parcelable {
    public static final Parcelable.Creator<VEClipTimelineParam> CREATOR = new C580950MqT(8);
    public float[] curveSpeedPointX;
    public float[] curveSpeedPointY;
    public boolean isReverseCurveSpeed;
    public double speed;
    public int trimIn;
    public int trimOut;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEClipTimelineParam() {
        this.speed = 1.0d;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trimIn: ");
        sbLIZ.append(this.trimIn);
        sbLIZ.append(" trimOut: ");
        sbLIZ.append(this.trimOut);
        sbLIZ.append(" speed: ");
        sbLIZ.append(this.speed);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEClipTimelineParam(Parcel parcel) {
        boolean z;
        this.trimIn = parcel.readInt();
        this.trimOut = parcel.readInt();
        this.speed = parcel.readDouble();
        this.curveSpeedPointX = parcel.createFloatArray();
        this.curveSpeedPointY = parcel.createFloatArray();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isReverseCurveSpeed = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.trimIn);
        parcel.writeInt(this.trimOut);
        parcel.writeDouble(this.speed);
        parcel.writeFloatArray(this.curveSpeedPointX);
        parcel.writeFloatArray(this.curveSpeedPointY);
        parcel.writeByte(this.isReverseCurveSpeed ? (byte) 1 : (byte) 0);
    }
}
