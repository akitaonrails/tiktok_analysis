package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class ShortTouchTemplateData {

    @C09CT("business_count")
    public int businessCount;

    @C09CT("end_time")
    public long endTime;

    @C09CT("has_interacted")
    public int hasInteracted;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("business_id")
    public String businessId = "";

    @C09CT("send_user_id")
    public String sendUserId = "";

    @C09CT("big_card_lottie_img_url")
    public String bigCardLottieImgUrl = "";

    @C09CT("log_params")
    public String logParams = "";
}
