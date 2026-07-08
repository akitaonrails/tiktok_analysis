package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BcmStandardTrack;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BcmStandardTrack implements Parcelable {

    @C09CT("chain_param")
    public Map<String, String> chainParam;

    @C09CT("track_param")
    public Map<String, String> trackParam;
    public static final Parcelable.Creator<BcmStandardTrack> CREATOR = new Parcelable.Creator<BcmStandardTrack>() { // from class: X.02nw
        @Override // android.os.Parcelable.Creator
        public final BcmStandardTrack createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
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
            return new BcmStandardTrack(linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final BcmStandardTrack[] newArray(int i) {
            return new BcmStandardTrack[i];
        }
    };
    public static final int $stable = 8;

    public BcmStandardTrack() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BcmStandardTrack)) {
            return false;
        }
        BcmStandardTrack bcmStandardTrack = (BcmStandardTrack) obj;
        return Intrinsics.LJFF(this.trackParam, bcmStandardTrack.trackParam) && Intrinsics.LJFF(this.chainParam, bcmStandardTrack.chainParam);
    }

    public final int hashCode() {
        Map<String, String> map = this.trackParam;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, String> map2 = this.chainParam;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BcmStandardTrack(trackParam=");
        sbLIZ.append(this.trackParam);
        sbLIZ.append(", chainParam=");
        sbLIZ.append(this.chainParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, String> map = this.trackParam;
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
        Map<String, String> map2 = this.chainParam;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeString(entry2.getValue());
        }
    }

    public BcmStandardTrack(Map<String, String> map, Map<String, String> map2) {
        this.trackParam = map;
        this.chainParam = map2;
    }
}
