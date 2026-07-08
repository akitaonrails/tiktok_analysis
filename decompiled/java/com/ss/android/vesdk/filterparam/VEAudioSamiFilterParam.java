package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEAudioSamiFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioSamiFilterParam> CREATOR = new C2325341G0m(27);
    public boolean enable;
    public String samiModelPath;
    public String samiParam;
    public int samiType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAudioSamiFilterParam() {
        this.enable = true;
        this.filterName = "audio sami filter";
        this.samiModelPath = "";
        this.samiParam = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAudioSamiFilterParam{filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append(", samiModelPath=");
        sbLIZ.append(this.samiModelPath);
        sbLIZ.append(", samiType=");
        sbLIZ.append(this.samiType);
        sbLIZ.append(", samiParam=");
        sbLIZ.append(this.samiParam);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEAudioSamiFilterParam(Parcel parcel) {
        super(parcel);
        this.enable = true;
        this.samiModelPath = parcel.readString();
        this.samiType = parcel.readInt();
        this.samiParam = parcel.readString();
        this.enable = parcel.readByte() != 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam, com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.samiModelPath);
        parcel.writeInt(this.samiType);
        parcel.writeString(this.samiParam);
        parcel.writeByte(this.enable ? (byte) 1 : (byte) 0);
    }
}
