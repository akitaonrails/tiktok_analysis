package com.ss.android.ugc.aweme.creative.model.poi;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.poi.PoiLynxInfoModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PoiLynxInfoModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PoiLynxInfoModel> CREATOR = new Parcelable.Creator<PoiLynxInfoModel>() { // from class: X.0nWu
        @Override // android.os.Parcelable.Creator
        public final PoiLynxInfoModel createFromParcel(Parcel parcel) {
            return new PoiLynxInfoModel(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PoiLynxInfoModel[] newArray(int i) {
            return new PoiLynxInfoModel[i];
        }
    };

    @C09CT("ls_alliance_extra")
    public String lsAllianceExtraJsonStr;

    @C09CT("ls_alliance_info")
    public String lsAllianceInfo;

    public PoiLynxInfoModel() {
        this(null, null);
    }

    public final PoiLynxInfoModel copy(String str, String str2) {
        return new PoiLynxInfoModel(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiLynxInfoModel)) {
            return false;
        }
        PoiLynxInfoModel poiLynxInfoModel = (PoiLynxInfoModel) obj;
        return Intrinsics.LJFF(this.lsAllianceInfo, poiLynxInfoModel.lsAllianceInfo) && Intrinsics.LJFF(this.lsAllianceExtraJsonStr, poiLynxInfoModel.lsAllianceExtraJsonStr);
    }

    public int hashCode() {
        String str = this.lsAllianceInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lsAllianceExtraJsonStr;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiLynxInfoModel(lsAllianceInfo=");
        sbLIZ.append(this.lsAllianceInfo);
        sbLIZ.append(", lsAllianceExtraJsonStr=");
        sbLIZ.append(this.lsAllianceExtraJsonStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.lsAllianceInfo);
        parcel.writeString(this.lsAllianceExtraJsonStr);
    }

    public final String getLsAllianceExtraJsonStr() {
        return this.lsAllianceExtraJsonStr;
    }

    public final String getLsAllianceInfo() {
        return this.lsAllianceInfo;
    }

    public final void setLsAllianceExtraJsonStr(String str) {
        this.lsAllianceExtraJsonStr = str;
    }

    public final void setLsAllianceInfo(String str) {
        this.lsAllianceInfo = str;
    }

    public PoiLynxInfoModel(String str, String str2) {
        this.lsAllianceInfo = str;
        this.lsAllianceExtraJsonStr = str2;
    }
}
