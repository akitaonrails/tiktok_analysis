package com.ss.android.ugc.aweme.im.callroom.api.model;

import X.C0217005f;
import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
public final class RtcInfo implements Serializable {
    public static final C0217005f Companion = new C0217005f();

    @C09CT("rtc_app_id")
    public final String rtcAppId;

    @C09CT("rtc_token")
    public final String rtcToken;

    @C09CT("rtc_user_id")
    public final String rtcUserId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtcInfo)) {
            return false;
        }
        RtcInfo rtcInfo = (RtcInfo) obj;
        return Intrinsics.LJFF(this.rtcAppId, rtcInfo.rtcAppId) && Intrinsics.LJFF(this.rtcToken, rtcInfo.rtcToken) && Intrinsics.LJFF(this.rtcUserId, rtcInfo.rtcUserId);
    }

    public int hashCode() {
        return (((this.rtcAppId.hashCode() * 31) + this.rtcToken.hashCode()) * 31) + this.rtcUserId.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RtcInfo(rtcAppId=");
        sbLIZ.append(this.rtcAppId);
        sbLIZ.append(", rtcToken=");
        sbLIZ.append(this.rtcToken);
        sbLIZ.append(", rtcUserId=");
        sbLIZ.append(this.rtcUserId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RtcInfo() {
        this("", "", "");
    }

    public final boolean isEmpty() {
        return a0.LJJJIL(this.rtcAppId) || a0.LJJJIL(this.rtcToken);
    }

    public RtcInfo(String str, String str2, String str3) {
        this.rtcAppId = str;
        this.rtcToken = str2;
        this.rtcUserId = str3;
    }
}
