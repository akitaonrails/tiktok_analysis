package com.ss.android.ugc.aweme.feed.model.common;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class CommonInfoForClient implements Serializable {

    @C09CT("region_high_active_time")
    public final String regionHighActiveTime;

    @C09CT("user_high_active_time")
    public final String userHighActiveTime;

    public CommonInfoForClient() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonInfoForClient)) {
            return false;
        }
        CommonInfoForClient commonInfoForClient = (CommonInfoForClient) obj;
        return Intrinsics.LJFF(this.userHighActiveTime, commonInfoForClient.userHighActiveTime) && Intrinsics.LJFF(this.regionHighActiveTime, commonInfoForClient.regionHighActiveTime);
    }

    public int hashCode() {
        String str = this.userHighActiveTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.regionHighActiveTime;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonInfoForClient(userHighActiveTime=");
        sbLIZ.append(this.userHighActiveTime);
        sbLIZ.append(", regionHighActiveTime=");
        sbLIZ.append(this.regionHighActiveTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommonInfoForClient(String str, String str2) {
        this.userHighActiveTime = str;
        this.regionHighActiveTime = str2;
    }
}
