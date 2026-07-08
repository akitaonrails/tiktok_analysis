package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class VideoLiveCouponRcmdMessage extends AbstractC1136060ffY {

    @C09CT("rcmd_coupon_id")
    public Long rcmdCouponId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rcmdCouponId != null) {
            sb.append(", rcmd_coupon_id=");
            sb.append(this.rcmdCouponId);
        }
        sb.replace(0, 2, "VideoLiveCouponRcmdMessage{");
        sb.append('}');
        return sb.toString();
    }

    public VideoLiveCouponRcmdMessage() {
        this.type = C001A.VIDEO_LIVE_COUPON_RCMD_MESSAGE;
    }
}
