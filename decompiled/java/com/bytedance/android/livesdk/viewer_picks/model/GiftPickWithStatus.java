package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public final class GiftPickWithStatus {

    @C09CT("gift_pick")
    public GiftPick giftPick;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("template_id")
    public long templateId;

    @C09CT("reject_reason")
    public String rejectReason = "";

    @C09CT("gift_name")
    public String giftName = "";

    @C09CT("content_source")
    public String contentSource = "";

    @C09CT("template_id_str")
    public String templateIdStr = "";
}
