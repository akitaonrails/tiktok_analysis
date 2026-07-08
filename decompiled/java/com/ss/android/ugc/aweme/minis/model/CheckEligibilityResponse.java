package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.CheckEligibilityResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CheckEligibilityResponse implements Parcelable {

    @C09CT("gid_age_eligibility")
    public final Map<String, Boolean> gidAgeEligibility;

    @C09CT("gid_region_eligibility")
    public final Map<String, Boolean> gidRegionEligibility;

    @C09CT("uid_age_eligibility")
    public final Map<String, Boolean> uidAgeEligibility;

    @C09CT("uid_region_eligibility")
    public final Map<String, Boolean> uidRegionEligibility;
    public static final Parcelable.Creator<CheckEligibilityResponse> CREATOR = new Parcelable.Creator<CheckEligibilityResponse>() { // from class: X.0m6J
        @Override // android.os.Parcelable.Creator
        public final CheckEligibilityResponse createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z;
            LinkedHashMap linkedHashMap2;
            boolean z2;
            LinkedHashMap linkedHashMap3;
            boolean z3;
            boolean z4;
            LinkedHashMap linkedHashMap4 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    linkedHashMap.put(string, Boolean.valueOf(z));
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    String string2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    linkedHashMap2.put(string2, Boolean.valueOf(z2));
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap3 = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashMap3 = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    String string3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    linkedHashMap3.put(string3, Boolean.valueOf(z3));
                }
            }
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                linkedHashMap4 = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    String string4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    linkedHashMap4.put(string4, Boolean.valueOf(z4));
                }
            }
            return new CheckEligibilityResponse(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckEligibilityResponse[] newArray(int i) {
            return new CheckEligibilityResponse[i];
        }
    };
    public static final int $stable = 8;

    public CheckEligibilityResponse() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckEligibilityResponse)) {
            return false;
        }
        CheckEligibilityResponse checkEligibilityResponse = (CheckEligibilityResponse) obj;
        return Intrinsics.LJFF(this.uidRegionEligibility, checkEligibilityResponse.uidRegionEligibility) && Intrinsics.LJFF(this.uidAgeEligibility, checkEligibilityResponse.uidAgeEligibility) && Intrinsics.LJFF(this.gidRegionEligibility, checkEligibilityResponse.gidRegionEligibility) && Intrinsics.LJFF(this.gidAgeEligibility, checkEligibilityResponse.gidAgeEligibility);
    }

    public final int hashCode() {
        Map<String, Boolean> map = this.uidRegionEligibility;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Boolean> map2 = this.uidAgeEligibility;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Boolean> map3 = this.gidRegionEligibility;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, Boolean> map4 = this.gidAgeEligibility;
        return iHashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckEligibilityResponse(uidRegionEligibility=");
        sbLIZ.append(this.uidRegionEligibility);
        sbLIZ.append(", uidAgeEligibility=");
        sbLIZ.append(this.uidAgeEligibility);
        sbLIZ.append(", gidRegionEligibility=");
        sbLIZ.append(this.gidRegionEligibility);
        sbLIZ.append(", gidAgeEligibility=");
        sbLIZ.append(this.gidAgeEligibility);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, Boolean> map = this.uidRegionEligibility;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeInt(entry.getValue().booleanValue() ? 1 : 0);
            }
        }
        Map<String, Boolean> map2 = this.uidAgeEligibility;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, Boolean> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                parcel.writeInt(entry2.getValue().booleanValue() ? 1 : 0);
            }
        }
        Map<String, Boolean> map3 = this.gidRegionEligibility;
        if (map3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map3.size());
            for (Map.Entry<String, Boolean> entry3 : map3.entrySet()) {
                parcel.writeString(entry3.getKey());
                parcel.writeInt(entry3.getValue().booleanValue() ? 1 : 0);
            }
        }
        Map<String, Boolean> map4 = this.gidAgeEligibility;
        if (map4 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map4.size());
        for (Map.Entry<String, Boolean> entry4 : map4.entrySet()) {
            parcel.writeString(entry4.getKey());
            parcel.writeInt(entry4.getValue().booleanValue() ? 1 : 0);
        }
    }

    public CheckEligibilityResponse(Map<String, Boolean> map, Map<String, Boolean> map2, Map<String, Boolean> map3, Map<String, Boolean> map4) {
        this.uidRegionEligibility = map;
        this.uidAgeEligibility = map2;
        this.gidRegionEligibility = map3;
        this.gidAgeEligibility = map4;
    }
}
