package com.ss.android.ugc.aweme.minis.model.metrics;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.metrics.MinisMetricsRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MinisMetricsRequest implements Parcelable {

    @C09CT("business_err_code")
    public final String businessErrCode;

    @C09CT("client_key")
    public final String clientKey;

    @C09CT("err_business_category")
    public final String errBusinessCategory;

    @C09CT("err_business_part")
    public final String errBusinessPart;

    @C09CT("err_internal_code")
    public final String errInternalCode;

    @C09CT("err_source_type")
    public final String errSourceType;

    @C09CT("event")
    public final String event;

    @C09CT("log_extra")
    public final Map<String, String> logExtra;

    @C09CT("metrics_tag_map")
    public final Map<String, String> metricsTagMap;
    public static final Parcelable.Creator<MinisMetricsRequest> CREATOR = new Parcelable.Creator<MinisMetricsRequest>() { // from class: X.02xo
        @Override // android.os.Parcelable.Creator
        public final MinisMetricsRequest createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
            }
            return new MinisMetricsRequest(string, string2, string3, string4, string5, string6, linkedHashMap, linkedHashMap2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisMetricsRequest[] newArray(int i) {
            return new MinisMetricsRequest[i];
        }
    };
    public static final int $stable = 8;

    public MinisMetricsRequest() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisMetricsRequest)) {
            return false;
        }
        MinisMetricsRequest minisMetricsRequest = (MinisMetricsRequest) obj;
        return Intrinsics.LJFF(this.clientKey, minisMetricsRequest.clientKey) && Intrinsics.LJFF(this.event, minisMetricsRequest.event) && Intrinsics.LJFF(this.businessErrCode, minisMetricsRequest.businessErrCode) && Intrinsics.LJFF(this.errBusinessCategory, minisMetricsRequest.errBusinessCategory) && Intrinsics.LJFF(this.errBusinessPart, minisMetricsRequest.errBusinessPart) && Intrinsics.LJFF(this.errInternalCode, minisMetricsRequest.errInternalCode) && Intrinsics.LJFF(this.metricsTagMap, minisMetricsRequest.metricsTagMap) && Intrinsics.LJFF(this.logExtra, minisMetricsRequest.logExtra) && Intrinsics.LJFF(this.errSourceType, minisMetricsRequest.errSourceType);
    }

    public final int hashCode() {
        String str = this.clientKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.event;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.businessErrCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errBusinessCategory;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errBusinessPart;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.errInternalCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, String> map = this.metricsTagMap;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.logExtra;
        int iHashCode8 = (iHashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str7 = this.errSourceType;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisMetricsRequest(clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", event=");
        sbLIZ.append(this.event);
        sbLIZ.append(", businessErrCode=");
        sbLIZ.append(this.businessErrCode);
        sbLIZ.append(", errBusinessCategory=");
        sbLIZ.append(this.errBusinessCategory);
        sbLIZ.append(", errBusinessPart=");
        sbLIZ.append(this.errBusinessPart);
        sbLIZ.append(", errInternalCode=");
        sbLIZ.append(this.errInternalCode);
        sbLIZ.append(", metricsTagMap=");
        sbLIZ.append(this.metricsTagMap);
        sbLIZ.append(", logExtra=");
        sbLIZ.append(this.logExtra);
        sbLIZ.append(", errSourceType=");
        sbLIZ.append(this.errSourceType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.clientKey);
        parcel.writeString(this.event);
        parcel.writeString(this.businessErrCode);
        parcel.writeString(this.errBusinessCategory);
        parcel.writeString(this.errBusinessPart);
        parcel.writeString(this.errInternalCode);
        Map<String, String> map = this.metricsTagMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, String> map2 = this.logExtra;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeString(entry2.getValue());
            }
        }
        parcel.writeString(this.errSourceType);
    }

    public MinisMetricsRequest(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Map<String, String> map2, String str7) {
        this.clientKey = str;
        this.event = str2;
        this.businessErrCode = str3;
        this.errBusinessCategory = str4;
        this.errBusinessPart = str5;
        this.errInternalCode = str6;
        this.metricsTagMap = map;
        this.logExtra = map2;
        this.errSourceType = str7;
    }
}
