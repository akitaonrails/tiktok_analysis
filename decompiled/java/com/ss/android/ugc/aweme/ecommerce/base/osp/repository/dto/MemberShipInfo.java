package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MemberShipInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberShipInfo implements Parcelable {

    @C09CT("extra")
    public Map<String, String> extra;

    @C09CT("plan_id")
    public String planId;
    public static final Parcelable.Creator<MemberShipInfo> CREATOR = new Parcelable.Creator<MemberShipInfo>() { // from class: X.02iG
        @Override // android.os.Parcelable.Creator
        public final MemberShipInfo createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new MemberShipInfo(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MemberShipInfo[] newArray(int i) {
            return new MemberShipInfo[i];
        }
    };
    public static final int $stable = 8;

    public MemberShipInfo() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberShipInfo)) {
            return false;
        }
        MemberShipInfo memberShipInfo = (MemberShipInfo) obj;
        return Intrinsics.LJFF(this.planId, memberShipInfo.planId) && Intrinsics.LJFF(this.extra, memberShipInfo.extra);
    }

    public final int hashCode() {
        String str = this.planId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.extra;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MemberShipInfo(planId=");
        sbLIZ.append(this.planId);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.planId);
        Map<String, String> map = this.extra;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public MemberShipInfo(String str, Map<String, String> map) {
        this.planId = str;
        this.extra = map;
    }
}
