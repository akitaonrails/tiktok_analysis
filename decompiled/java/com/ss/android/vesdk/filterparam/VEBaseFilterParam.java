package com.ss.android.vesdk.filterparam;

import X.C1DIW;
import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEBaseFilterParam implements Parcelable {
    public static final Parcelable.Creator<VEBaseFilterParam> CREATOR = new C2325341G0m(30);
    public C1DIW callback;
    public int filterDurationType;
    public String filterName;
    public int filterType;
    public int renderType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEBaseFilterParam{filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append(", filterEngineType = ");
        sbLIZ.append(this.renderType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEBaseFilterParam() {
    }

    public VEBaseFilterParam(Parcel parcel) {
        this.filterType = parcel.readInt();
        this.filterName = parcel.readString();
        this.filterDurationType = parcel.readInt();
        this.renderType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.filterType);
        parcel.writeString(this.filterName);
        parcel.writeInt(this.filterDurationType);
        parcel.writeInt(this.renderType);
    }
}
