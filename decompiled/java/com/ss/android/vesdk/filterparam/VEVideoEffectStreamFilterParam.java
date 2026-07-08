package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes36.dex */
public class VEVideoEffectStreamFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoEffectStreamFilterParam> CREATOR = new C2325341G0m(55);
    public String extraString;
    public int streamFlags;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEVideoEffectStreamFilterParam() {
        this.filterName = "effect stream";
        this.filterType = 29;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoEffectStreamFilterParam{filterType=");
        sbLIZ.append(this.filterType);
        sbLIZ.append(", filterName='");
        sbLIZ.append(this.filterName);
        sbLIZ.append('\'');
        sbLIZ.append(", filterDurationType=");
        sbLIZ.append(this.filterDurationType);
        sbLIZ.append(", streamFlags=");
        sbLIZ.append(this.streamFlags);
        sbLIZ.append(", extraString=");
        sbLIZ.append(this.extraString);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEVideoEffectStreamFilterParam(Parcel parcel) {
        super(parcel);
        this.streamFlags = parcel.readInt();
        this.extraString = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.streamFlags);
        parcel.writeString(this.extraString);
    }
}
