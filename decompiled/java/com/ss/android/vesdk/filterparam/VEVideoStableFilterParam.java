package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEVideoStableFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoStableFilterParam> CREATOR = new C2325341G0m(56);
    public int height;
    public String ptsMatrix;
    public String videoStabMatrix;
    public int width;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEVideoStableFilterParam() {
        this.filterName = "video stable filter";
        this.filterType = 27;
        this.filterDurationType = 1;
        this.ptsMatrix = "";
        this.videoStabMatrix = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoStableFilterParam{ptsMatrix=");
        sbLIZ.append(this.ptsMatrix);
        sbLIZ.append(", videoStabMatrix='");
        sbLIZ.append(this.videoStabMatrix);
        sbLIZ.append('\'');
        sbLIZ.append(", filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append('\'');
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append('\'');
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append('\'');
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEVideoStableFilterParam(Parcel parcel) {
        super(parcel);
        this.ptsMatrix = parcel.readString();
        this.videoStabMatrix = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.ptsMatrix);
        parcel.writeString(this.videoStabMatrix);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
