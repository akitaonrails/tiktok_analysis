package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakResData {

    @C09CT("path")
    public final String bundle;

    @C09CT("channel")
    public final String channel;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreakResData)) {
            return false;
        }
        StreakResData streakResData = (StreakResData) obj;
        return Intrinsics.LJFF(this.type, streakResData.type) && Intrinsics.LJFF(this.channel, streakResData.channel) && Intrinsics.LJFF(this.bundle, streakResData.bundle);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bundle;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakResData(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", channel=");
        sbLIZ.append(this.channel);
        sbLIZ.append(", bundle=");
        sbLIZ.append(this.bundle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        String str;
        String str2 = this.channel;
        return str2 != null && str2.length() > 0 && (str = this.bundle) != null && str.length() > 0;
    }

    public StreakResData(String str, String str2, String str3) {
        this.type = str;
        this.channel = str2;
        this.bundle = str3;
    }
}
