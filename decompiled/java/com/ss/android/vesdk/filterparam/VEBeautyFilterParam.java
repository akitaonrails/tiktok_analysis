package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEBeautyFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEBeautyFilterParam> CREATOR = new C2325341G0m(31);
    public String beautyName;
    public int beautyType;
    public float brightenIntensity;
    public float sharpIntensity;
    public float skinToneIntensity;
    public String skinTonePath;
    public float smoothIntensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEBeautyFilterParam() {
        this.filterName = "beauty";
        this.filterType = 12;
        this.filterDurationType = 1;
        this.beautyName = "";
        this.beautyType = -1;
        this.skinTonePath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEBeautyFilterParam{beautyName='");
        sbLIZ.append(this.beautyName);
        sbLIZ.append('\'');
        sbLIZ.append(", beautyType=");
        sbLIZ.append(this.beautyType);
        sbLIZ.append(", brightenIntensity=");
        sbLIZ.append(this.brightenIntensity);
        sbLIZ.append(", smoothIntensity=");
        sbLIZ.append(this.smoothIntensity);
        sbLIZ.append(", sharpIntensity=");
        sbLIZ.append(this.sharpIntensity);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append(", skinTonePath='");
        sbLIZ.append(this.skinTonePath);
        sbLIZ.append('\'');
        sbLIZ.append(", skinToneIntensity=");
        sbLIZ.append(this.skinToneIntensity);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEBeautyFilterParam(Parcel parcel) {
        super(parcel);
        this.beautyName = parcel.readString();
        this.beautyType = parcel.readInt();
        this.brightenIntensity = parcel.readFloat();
        this.smoothIntensity = parcel.readFloat();
        this.sharpIntensity = parcel.readFloat();
        this.skinTonePath = parcel.readString();
        this.skinToneIntensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.beautyName);
        parcel.writeInt(this.beautyType);
        parcel.writeFloat(this.brightenIntensity);
        parcel.writeFloat(this.smoothIntensity);
        parcel.writeFloat(this.sharpIntensity);
        parcel.writeString(this.skinTonePath);
        parcel.writeFloat(this.skinToneIntensity);
    }
}
