package com.ss.android.ugc.aweme.pns.consent.core.network;

import X.C09CT;
import X.EnumC1876780ywG;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes29.dex */
public final class LightConsentRecord {

    @C09CT("coll_point_id")
    public String collectionPointId;

    @C09CT("created_at")
    public final long createdAt;

    @C09CT("extra")
    public final String extra;

    @C09CT("business_flow")
    public String flow;

    @C09CT("platform")
    public final String platform;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public String status;

    public LightConsentRecord() {
        this("", "ANDROID", 0L, EnumC1876780ywG.NOTDETERMINED.toString(), "", "");
    }

    public LightConsentRecord(String str, String str2, long j, String str3, String str4, String str5) {
        this.flow = str;
        this.platform = str2;
        this.createdAt = j;
        this.status = str3;
        this.collectionPointId = str4;
        this.extra = str5;
    }
}
