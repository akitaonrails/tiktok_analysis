package com.bytedance.ies.powerlist.debug;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.powerlist.debug.RecommendAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendAbility implements Parcelable {
    public static final Parcelable.Creator<RecommendAbility> CREATOR = new Parcelable.Creator<RecommendAbility>() { // from class: X.02so
        @Override // android.os.Parcelable.Creator
        public final RecommendAbility createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            LinkedHashMap linkedHashMap;
            boolean z3;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = parcel.readInt();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    String string2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    linkedHashMap.put(string2, Boolean.valueOf(z3));
                }
            }
            return new RecommendAbility(z, z2, i, string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendAbility[] newArray(int i) {
            return new RecommendAbility[i];
        }
    };
    public boolean asyncDiff;
    public Map<String, Boolean> asyncLayoutMap;
    public boolean enablePreload;
    public String fpsName;
    public final int preloadCount;

    public RecommendAbility() {
        this(false, false, 8, "", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendAbility)) {
            return false;
        }
        RecommendAbility recommendAbility = (RecommendAbility) obj;
        return this.asyncDiff == recommendAbility.asyncDiff && this.enablePreload == recommendAbility.enablePreload && this.preloadCount == recommendAbility.preloadCount && Intrinsics.LJFF(this.fpsName, recommendAbility.fpsName) && Intrinsics.LJFF(this.asyncLayoutMap, recommendAbility.asyncLayoutMap);
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.asyncDiff) * 31) + C786410Ut5.Z2(this.enablePreload)) * 31) + this.preloadCount) * 31) + this.fpsName.hashCode()) * 31;
        Map<String, Boolean> map = this.asyncLayoutMap;
        return iZ2 + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendAbility(asyncDiff=");
        sbLIZ.append(this.asyncDiff);
        sbLIZ.append(", enablePreload=");
        sbLIZ.append(this.enablePreload);
        sbLIZ.append(", preloadCount=");
        sbLIZ.append(this.preloadCount);
        sbLIZ.append(", fpsName=");
        sbLIZ.append(this.fpsName);
        sbLIZ.append(", asyncLayoutMap=");
        sbLIZ.append(this.asyncLayoutMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.asyncDiff ? 1 : 0);
        parcel.writeInt(this.enablePreload ? 1 : 0);
        parcel.writeInt(this.preloadCount);
        parcel.writeString(this.fpsName);
        Map<String, Boolean> map = this.asyncLayoutMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
    }

    public RecommendAbility(boolean z, boolean z2, int i, String str, Map<String, Boolean> map) {
        this.asyncDiff = z;
        this.enablePreload = z2;
        this.preloadCount = i;
        this.fpsName = str;
        this.asyncLayoutMap = map;
    }
}
