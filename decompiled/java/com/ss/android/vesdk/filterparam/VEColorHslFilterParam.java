package com.ss.android.vesdk.filterparam;

import X.C2188811AlT;
import X.C2325341G0m;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes36.dex */
public class VEColorHslFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEColorHslFilterParam> CREATOR = new C2325341G0m(35);
    public ArrayList<HslParam> hslParamArrayList;
    public int type;
    public int version;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEColorHslFilterParam() {
        this.filterName = "color_adjust_hsl";
        this.filterType = 36;
        this.filterDurationType = 1;
        this.hslParamArrayList = new ArrayList<>();
        this.version = 1;
        this.type = 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEColorHslFilterParam{, version = ");
        sbLIZ.append(this.version);
        sbLIZ.append(e3.f);
        sbLIZ.append('\'');
        sbLIZ.append(", type = ");
        sbLIZ.append(this.type);
        sbLIZ.append(e3.f);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VEColorHslFilterParam(Parcel parcel) {
        super(parcel);
        this.version = parcel.readInt();
        this.type = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.version);
        parcel.writeInt(this.type);
    }
}
