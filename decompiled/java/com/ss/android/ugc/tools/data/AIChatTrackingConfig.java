package com.ss.android.ugc.tools.data;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AIChatTrackingConfig implements Parcelable {
    public static final Parcelable.Creator<AIChatTrackingConfig> CREATOR = new Parcelable.Creator<AIChatTrackingConfig>() { // from class: X.0me4
        @Override // android.os.Parcelable.Creator
        public final AIChatTrackingConfig createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AIChatTrackingConfig(string, string2, string3, string4, linkedHashMap, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatTrackingConfig[] newArray(int i) {
            return new AIChatTrackingConfig[i];
        }
    };
    public final String awemeId;
    public final Integer awemeType;
    public final String creationId;
    public final String enterFrom;
    public final String enterMethod;
    public final Map<String, String> extraParams;
    public final String sessionId;
    public final String shootWay;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatTrackingConfig)) {
            return false;
        }
        AIChatTrackingConfig aIChatTrackingConfig = (AIChatTrackingConfig) obj;
        return Intrinsics.LJFF(this.creationId, aIChatTrackingConfig.creationId) && Intrinsics.LJFF(this.shootWay, aIChatTrackingConfig.shootWay) && Intrinsics.LJFF(this.enterMethod, aIChatTrackingConfig.enterMethod) && Intrinsics.LJFF(this.enterFrom, aIChatTrackingConfig.enterFrom) && Intrinsics.LJFF(this.extraParams, aIChatTrackingConfig.extraParams) && Intrinsics.LJFF(this.awemeType, aIChatTrackingConfig.awemeType) && Intrinsics.LJFF(this.sessionId, aIChatTrackingConfig.sessionId) && Intrinsics.LJFF(this.awemeId, aIChatTrackingConfig.awemeId);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.creationId.hashCode() * 31) + this.shootWay.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.extraParams.hashCode()) * 31;
        Integer num = this.awemeType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.sessionId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.awemeId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.creationId);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterFrom);
        Map<String, String> map = this.extraParams;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        Integer num = this.awemeType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.awemeId);
    }

    public AIChatTrackingConfig() {
        this("", "", "", "", Collections.emptyMap(), null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("creationId = ");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", shootWay = ");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", enterMethod = ");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", enterFrom = ");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", extraParams = ");
        sbLIZ.append(this.extraParams);
        sbLIZ.append(", awemeType = ");
        sbLIZ.append(this.awemeType);
        sbLIZ.append(", sessionId = ");
        sbLIZ.append(this.sessionId);
        sbLIZ.append("awemeId = ");
        sbLIZ.append(this.awemeId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIChatTrackingConfig(String str, String str2, String str3, String str4, Map<String, String> map, Integer num, String str5, String str6) {
        this.creationId = str;
        this.shootWay = str2;
        this.enterMethod = str3;
        this.enterFrom = str4;
        this.extraParams = map;
        this.awemeType = num;
        this.sessionId = str5;
        this.awemeId = str6;
    }
}
