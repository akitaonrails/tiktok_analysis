package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VERepeatFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VERepeatFilterParam> CREATOR = new C2325341G0m(47);
    public int repeatDuration;
    public int repeatTime;
    public int seqIn;
    public int seqOut;
    public int timeMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VERepeatFilterParam() {
        this.filterName = "new repeat effect";
        this.filterType = 25;
        this.filterDurationType = 1;
        this.seqIn = -1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VERepeatFilterParam{seqIn=");
        sbLIZ.append(this.seqIn);
        sbLIZ.append(", seqOut=");
        sbLIZ.append(this.seqOut);
        sbLIZ.append(", repeatTime=");
        sbLIZ.append(this.repeatTime);
        sbLIZ.append(", repeatDuration=");
        sbLIZ.append(this.repeatDuration);
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

    public VERepeatFilterParam(Parcel parcel) {
        super(parcel);
        this.seqIn = parcel.readInt();
        this.seqOut = parcel.readInt();
        this.repeatTime = parcel.readInt();
        this.repeatDuration = parcel.readInt();
        this.timeMode = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.seqIn);
        parcel.writeInt(this.seqOut);
        parcel.writeInt(this.repeatTime);
        parcel.writeInt(this.repeatDuration);
        parcel.writeInt(this.timeMode);
    }
}
