package com.ss.android.ugc.aweme.theater.common;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.theater.common.MobConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MobConfig implements Parcelable {
    public static final Parcelable.Creator<MobConfig> CREATOR = new Parcelable.Creator<MobConfig>() { // from class: X.0Xty
        @Override // android.os.Parcelable.Creator
        public final MobConfig createFromParcel(Parcel parcel) {
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
            return new MobConfig(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final MobConfig[] newArray(int i) {
            return new MobConfig[i];
        }
    };
    public final String eventName;
    public final Map<String, String> eventParams;

    public MobConfig() {
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
        if (!(obj instanceof MobConfig)) {
            return false;
        }
        MobConfig mobConfig = (MobConfig) obj;
        return Intrinsics.LJFF(this.eventName, mobConfig.eventName) && Intrinsics.LJFF(this.eventParams, mobConfig.eventParams);
    }

    public final int hashCode() {
        String str = this.eventName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.eventParams;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MobConfig(eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.eventParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.eventName);
        Map<String, String> map = this.eventParams;
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

    public MobConfig(String str, Map<String, String> map) {
        this.eventName = str;
        this.eventParams = map;
    }
}
