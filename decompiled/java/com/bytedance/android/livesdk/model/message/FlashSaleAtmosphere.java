package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class FlashSaleAtmosphere {

    @C09CT("end_time")
    public long endTime;

    @C09CT("enhancement_info")
    public FlashSaleEnhancementInfo enhancementInfo;

    @C09CT("pdp_viewer_count")
    public int pdpViewerCount;

    @C09CT("preheat_time")
    public long preheatTime;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
