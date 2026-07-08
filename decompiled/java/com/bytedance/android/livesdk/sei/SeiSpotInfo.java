package com.bytedance.android.livesdk.sei;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class SeiSpotInfo implements Comparable<SeiSpotInfo> {

    @C09CT("ch_extra")
    public final String cohostExtra;

    @C09CT("mg_extra")
    public final String extra;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int spotId;

    @C09CT("type")
    public final int type;

    @C09CT("value")
    public final String value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiSpotInfo)) {
            return false;
        }
        SeiSpotInfo seiSpotInfo = (SeiSpotInfo) obj;
        return this.type == seiSpotInfo.type && Intrinsics.LJFF(this.value, seiSpotInfo.value) && Intrinsics.LJFF(this.extra, seiSpotInfo.extra) && this.spotId == seiSpotInfo.spotId && Intrinsics.LJFF(this.cohostExtra, seiSpotInfo.cohostExtra);
    }

    public final int hashCode() {
        int iHashCode = ((this.type * 31) + this.value.hashCode()) * 31;
        String str = this.extra;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.spotId) * 31;
        String str2 = this.cohostExtra;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeiSpotInfo(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", spotId=");
        sbLIZ.append(this.spotId);
        sbLIZ.append(", cohostExtra=");
        sbLIZ.append(this.cohostExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SeiSpotInfo seiSpotInfo) {
        return this.value.compareTo(seiSpotInfo.value);
    }

    public SeiSpotInfo(int i, String str, String str2, int i2, String str3) {
        this.type = i;
        this.value = str;
        this.extra = str2;
        this.spotId = i2;
        this.cohostExtra = str3;
    }
}
