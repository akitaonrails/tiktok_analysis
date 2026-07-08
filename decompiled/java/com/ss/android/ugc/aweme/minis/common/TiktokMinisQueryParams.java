package com.ss.android.ugc.aweme.minis.common;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.api.MinisRawAdInfo;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TiktokMinisQueryParams implements Parcelable {

    @C09CT("ad_signal_params")
    public MinisRawAdInfo adSignalParams;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("log_extra")
    public Map<String, ? extends Object> logExtra;

    @C09CT("minis_category")
    public String minisCategory;

    @C09CT("minis_icon")
    public final String minisIconUrl;

    @C09CT("minis_name")
    public final String minisName;

    @C09CT("ttmg_init_module")
    public String ttmgInitModule;
    public static final Parcelable.Creator<TiktokMinisQueryParams> CREATOR = new Parcelable.Creator<TiktokMinisQueryParams>() { // from class: X.0mQT
        @Override // android.os.Parcelable.Creator
        public final TiktokMinisQueryParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readValue(TiktokMinisQueryParams.class.getClassLoader()));
                }
            }
            return new TiktokMinisQueryParams(string, string2, string3, string4, string5, linkedHashMap, (MinisRawAdInfo) parcel.readParcelable(TiktokMinisQueryParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TiktokMinisQueryParams[] newArray(int i) {
            return new TiktokMinisQueryParams[i];
        }
    };
    public static final int $stable = 8;

    public TiktokMinisQueryParams() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TiktokMinisQueryParams)) {
            return false;
        }
        TiktokMinisQueryParams tiktokMinisQueryParams = (TiktokMinisQueryParams) obj;
        return Intrinsics.LJFF(this.ttmgInitModule, tiktokMinisQueryParams.ttmgInitModule) && Intrinsics.LJFF(this.enterFrom, tiktokMinisQueryParams.enterFrom) && Intrinsics.LJFF(this.minisName, tiktokMinisQueryParams.minisName) && Intrinsics.LJFF(this.minisIconUrl, tiktokMinisQueryParams.minisIconUrl) && Intrinsics.LJFF(this.minisCategory, tiktokMinisQueryParams.minisCategory) && Intrinsics.LJFF(this.logExtra, tiktokMinisQueryParams.logExtra) && Intrinsics.LJFF(this.adSignalParams, tiktokMinisQueryParams.adSignalParams);
    }

    public final int hashCode() {
        String str = this.ttmgInitModule;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterFrom;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minisName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.minisIconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.minisCategory;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, ? extends Object> map = this.logExtra;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        MinisRawAdInfo minisRawAdInfo = this.adSignalParams;
        return iHashCode6 + (minisRawAdInfo != null ? minisRawAdInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TiktokMinisQueryParams(ttmgInitModule=");
        sbLIZ.append(this.ttmgInitModule);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", minisName=");
        sbLIZ.append(this.minisName);
        sbLIZ.append(", minisIconUrl=");
        sbLIZ.append(this.minisIconUrl);
        sbLIZ.append(", minisCategory=");
        sbLIZ.append(this.minisCategory);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.logExtra);
        sbLIZ.append(", adSignalParams=");
        sbLIZ.append(this.adSignalParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ttmgInitModule);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.minisName);
        parcel.writeString(this.minisIconUrl);
        parcel.writeString(this.minisCategory);
        Map<String, ? extends Object> map = this.logExtra;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }
        parcel.writeParcelable(this.adSignalParams, i);
    }

    public TiktokMinisQueryParams(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map, MinisRawAdInfo minisRawAdInfo) {
        this.ttmgInitModule = str;
        this.enterFrom = str2;
        this.minisName = str3;
        this.minisIconUrl = str4;
        this.minisCategory = str5;
        this.logExtra = map;
        this.adSignalParams = minisRawAdInfo;
    }
}
