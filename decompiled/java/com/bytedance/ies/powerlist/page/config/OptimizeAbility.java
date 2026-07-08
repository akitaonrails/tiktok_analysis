package com.bytedance.ies.powerlist.page.config;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class OptimizeAbility implements Parcelable {
    public static final Parcelable.Creator<OptimizeAbility> CREATOR = new Parcelable.Creator<OptimizeAbility>() { // from class: X.0J0d
        @Override // android.os.Parcelable.Creator
        public final OptimizeAbility createFromParcel(Parcel parcel) {
            boolean z;
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap.put(parcel.readSerializable(), Integer.valueOf(parcel.readInt()));
                }
            }
            return new OptimizeAbility(i, z, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final OptimizeAbility[] newArray(int i) {
            return new OptimizeAbility[i];
        }
    };
    public final Map<Class<? extends PowerCell<?>>, Integer> customPreloadVH;
    public final boolean enable;
    public final int preloadCount;

    /* JADX WARN: Multi-variable type inference failed */
    public OptimizeAbility() {
        this(0, 0 == true ? 1 : 0, null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptimizeAbility)) {
            return false;
        }
        OptimizeAbility optimizeAbility = (OptimizeAbility) obj;
        return this.enable == optimizeAbility.enable && this.preloadCount == optimizeAbility.preloadCount && Intrinsics.LJFF(this.customPreloadVH, optimizeAbility.customPreloadVH);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.enable) * 31) + this.preloadCount) * 31;
        Map<Class<? extends PowerCell<?>>, Integer> map = this.customPreloadVH;
        return iZ2 + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OptimizeAbility(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", preloadCount=");
        sbLIZ.append(this.preloadCount);
        sbLIZ.append(", customPreloadVH=");
        sbLIZ.append(this.customPreloadVH);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enable ? 1 : 0);
        parcel.writeInt(this.preloadCount);
        Map<Class<? extends PowerCell<?>>, Integer> map = this.customPreloadVH;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<Class<? extends PowerCell<?>>, Integer> entry : map.entrySet()) {
            parcel.writeSerializable(entry.getKey());
            parcel.writeInt(entry.getValue().intValue());
        }
    }

    public OptimizeAbility(int i, boolean z, Map map) {
        this.enable = z;
        this.preloadCount = i;
        this.customPreloadVH = map;
    }

    public /* synthetic */ OptimizeAbility(int i, boolean z, Map map, int i2) {
        this((i2 & 2) != 0 ? 8 : i, (i2 & 1) != 0 ? false : z, (i2 & 4) != 0 ? null : map);
    }
}
