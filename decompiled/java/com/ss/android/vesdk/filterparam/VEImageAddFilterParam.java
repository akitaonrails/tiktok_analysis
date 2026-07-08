package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEImageAddFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEImageAddFilterParam> CREATOR = new C2325341G0m(40);
    public float height;
    public String imagePath;
    public float width;
    public float x;
    public float y;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEImageAddFilterParam() {
        this.filterName = "image add filter";
        this.filterType = 21;
        this.imagePath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEImageAddFilterParam{imagePath='");
        sbLIZ.append(this.imagePath);
        sbLIZ.append('\'');
        sbLIZ.append(", x=");
        sbLIZ.append(this.x);
        sbLIZ.append(", y=");
        sbLIZ.append(this.y);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
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

    public VEImageAddFilterParam(Parcel parcel) {
        super(parcel);
        this.imagePath = parcel.readString();
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
        this.width = parcel.readFloat();
        this.height = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.imagePath);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
    }
}
