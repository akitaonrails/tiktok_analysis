package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VESlowMotionFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VESlowMotionFilterParam> CREATOR = new C2325341G0m(50);
    public int seqIn;
    public int seqOut;
    public int slowMotionDuration;
    public float slowMotionSpeed;
    public int timeMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VESlowMotionFilterParam() {
        this.filterName = "new slow effect";
        this.filterType = 25;
        this.filterDurationType = 1;
        this.seqIn = -1;
        this.slowMotionSpeed = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VESlowMotionFilterParam{seqIn=");
        sbLIZ.append(this.seqIn);
        sbLIZ.append(", seqOut=");
        sbLIZ.append(this.seqOut);
        sbLIZ.append(", slowMotionDuration=");
        sbLIZ.append(this.slowMotionDuration);
        sbLIZ.append(", slowMotionSpeed=");
        sbLIZ.append(this.slowMotionSpeed);
        sbLIZ.append(", timeMode=");
        sbLIZ.append(this.timeMode);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VESlowMotionFilterParam(Parcel parcel) {
        super(parcel);
        this.seqIn = parcel.readInt();
        this.seqOut = parcel.readInt();
        this.slowMotionDuration = parcel.readInt();
        this.slowMotionSpeed = parcel.readFloat();
        this.timeMode = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeInt(this.slowMotionDuration);
        parcel.writeFloat(this.slowMotionSpeed);
        parcel.writeInt(this.timeMode);
    }
}
