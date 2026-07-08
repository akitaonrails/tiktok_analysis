package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PromoteAdStatusMessage extends AbstractC1136060ffY {

    @C09CT("ad_id")
    public long adId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public PromoteAdStatusMessage() {
        this.type = C001A.PROMOTE_AD_STATUS_MESSAGE;
    }
}
