package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes36.dex */
public final class SessionClickInfo {
    public final transient long LIZ;

    @C09CT("click_id")
    public final int clickId;

    @C09CT("click_refer")
    public final String clickRefer;

    @C09CT("click_tag")
    public final String clickTag;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final int id;

    @C09CT("time_stamp")
    public final long timeStamp;

    public SessionClickInfo(int i, int i2, String str, String str2, long j, long j2) {
        this.id = i;
        this.clickId = i2;
        this.clickRefer = str;
        this.clickTag = str2;
        this.timeStamp = j;
        this.LIZ = j2;
    }
}
