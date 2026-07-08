package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.viewer_picks.model.GiftPick;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class ViewerPicksGiftPickReviewMessage extends AbstractC1136060ffY {

    @C09CT("gift_pick")
    public GiftPick giftPick;

    @C09CT("reject_reason")
    public String rejectReason;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    public ViewerPicksGiftPickReviewMessage() {
        this.type = C001A.VIEWER_PICKS_GIFT_PICK_REVIEW_MESSAGE;
        this.rejectReason = "";
    }
}
