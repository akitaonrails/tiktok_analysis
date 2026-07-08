package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEAmazingFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEAmazingFilterParam> CREATOR = new C2325341G0m(20);
    public String algorithmResultDir;
    public int amazingEngineType;
    public int flag;
    public int order;
    public String param;
    public String path;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEAmazingFilterParam() {
        this.filterName = "amzing filter";
        this.filterType = 22;
        this.path = "";
        this.param = "";
        this.algorithmResultDir = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEAmazingFilterParam{order=");
        sbLIZ.append(this.order);
        sbLIZ.append(", path='");
        sbLIZ.append(this.path);
        sbLIZ.append('\'');
        sbLIZ.append(", param='");
        sbLIZ.append(this.param);
        sbLIZ.append('\'');
        sbLIZ.append(", amazingEngineType=");
        sbLIZ.append(this.amazingEngineType);
        sbLIZ.append(", flag =");
        sbLIZ.append(this.flag);
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append(", algorithmResultDir=");
        sbLIZ.append(this.algorithmResultDir);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEAmazingFilterParam(Parcel parcel) {
        super(parcel);
        this.order = parcel.readInt();
        this.path = parcel.readString();
        this.param = parcel.readString();
        this.amazingEngineType = parcel.readInt();
        this.flag = parcel.readInt();
        this.algorithmResultDir = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.order);
        parcel.writeString(this.path);
        parcel.writeString(this.param);
        parcel.writeInt(this.amazingEngineType);
        parcel.writeInt(this.flag);
        parcel.writeString(this.algorithmResultDir);
    }
}
