package com.ss.android.ugc.aweme.minis.model;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.MinisPkg;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class MinisPkgConfig implements Parcelable {

    @C09CT("__engine_meta__")
    public final Map<String, Object> engineMeta;

    @C09CT("packages")
    public final Map<String, MinisPkg> packages;
    public static final Parcelable.Creator<MinisPkgConfig> CREATOR = new Parcelable.Creator<MinisPkgConfig>() { // from class: X.08v9
        @Override // android.os.Parcelable.Creator
        public final MinisPkgConfig createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), MinisPkg.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(MinisPkgConfig.class.getClassLoader()));
                }
            }
            return new MinisPkgConfig(linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final MinisPkgConfig[] newArray(int i) {
            return new MinisPkgConfig[i];
        }
    };
    public static final int $stable = 8;

    public MinisPkgConfig() {
        this(C2097608Jq.LJ(), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinisPkgConfig)) {
            return false;
        }
        MinisPkgConfig minisPkgConfig = (MinisPkgConfig) obj;
        return Intrinsics.LJFF(this.packages, minisPkgConfig.packages) && Intrinsics.LJFF(this.engineMeta, minisPkgConfig.engineMeta);
    }

    public final int hashCode() {
        Map<String, MinisPkg> map = this.packages;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Object> map2 = this.engineMeta;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisPkgConfig(packages=");
        sbLIZ.append(this.packages);
        sbLIZ.append(", engineMeta=");
        sbLIZ.append(this.engineMeta);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Map<String, MinisPkg> map = this.packages;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, MinisPkg> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        Map<String, Object> map2 = this.engineMeta;
        if (map2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
    }

    public MinisPkgConfig(Map<String, MinisPkg> map, Map<String, ? extends Object> map2) {
        this.packages = map;
        this.engineMeta = map2;
    }
}
