package com.ss.android.ugc.aweme.commerce.tools.mission;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionDuetRouterConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MissionDuetRouterConfig implements Parcelable {
    public static final Parcelable.Creator<MissionDuetRouterConfig> CREATOR = new Parcelable.Creator<MissionDuetRouterConfig>() { // from class: X.0mcl
        @Override // android.os.Parcelable.Creator
        public final MissionDuetRouterConfig createFromParcel(Parcel parcel) {
            HashMap map;
            Aweme aweme = (Aweme) parcel.readSerializable();
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                map = null;
            } else {
                int i = parcel.readInt();
                map = new HashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    map.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new MissionDuetRouterConfig(aweme, map, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MissionDuetRouterConfig[] newArray(int i) {
            return new MissionDuetRouterConfig[i];
        }
    };

    @C09CT("duet_aweme")
    public final Aweme duetAweme;

    @C09CT("mission_id")
    public final Long missionId;

    @C09CT("mission")
    public final HashMap<String, String> missionParam;

    public MissionDuetRouterConfig() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionDuetRouterConfig)) {
            return false;
        }
        MissionDuetRouterConfig missionDuetRouterConfig = (MissionDuetRouterConfig) obj;
        return Intrinsics.LJFF(this.duetAweme, missionDuetRouterConfig.duetAweme) && Intrinsics.LJFF(this.missionParam, missionDuetRouterConfig.missionParam) && Intrinsics.LJFF(this.missionId, missionDuetRouterConfig.missionId);
    }

    public final int hashCode() {
        Aweme aweme = this.duetAweme;
        int iHashCode = (aweme == null ? 0 : aweme.hashCode()) * 31;
        HashMap<String, String> map = this.missionParam;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Long l = this.missionId;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MissionDuetRouterConfig(duetAweme=");
        sbLIZ.append(this.duetAweme);
        sbLIZ.append(", missionParam=");
        sbLIZ.append(this.missionParam);
        sbLIZ.append(", missionId=");
        sbLIZ.append(this.missionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.duetAweme);
        HashMap<String, String> map = this.missionParam;
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
        Long l = this.missionId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public MissionDuetRouterConfig(Aweme aweme, HashMap<String, String> map, Long l) {
        this.duetAweme = aweme;
        this.missionParam = map;
        this.missionId = l;
    }
}
