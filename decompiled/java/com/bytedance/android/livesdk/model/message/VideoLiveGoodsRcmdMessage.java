package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class VideoLiveGoodsRcmdMessage extends AbstractC1136060ffY {

    @C09CT("rcmd_goods_id")
    public Long rcmdGoodsId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rcmdGoodsId != null) {
            sb.append(", rcmd_goods_id=");
            sb.append(this.rcmdGoodsId);
        }
        sb.replace(0, 2, "VideoLiveGoodsRcmdMessage{");
        sb.append('}');
        return sb.toString();
    }

    public VideoLiveGoodsRcmdMessage() {
        this.type = C001A.VIDEO_LIVE_GOODS_RCMD_MESSAGE;
    }
}
