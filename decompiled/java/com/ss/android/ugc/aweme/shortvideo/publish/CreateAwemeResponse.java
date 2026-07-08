package com.ss.android.ugc.aweme.shortvideo.publish;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class CreateAwemeResponse extends CreateBaseAwemeResponse implements Serializable, C0X12 {

    @C09CT("aweme")
    public Aweme aweme;

    @C09CT("coupon_info")
    public CouponInfo couponInfo;

    @C09CT("has_sticker_red_packet")
    public boolean hasStickerRedPacket;

    @C09CT("is_review_video")
    public int isReviewVideo;

    @C09CT("log_pb")
    public LogPbBean logPbBean;

    @C09CT("notify")
    public String[] notify;

    @C09CT("notify_extra")
    public NotifyExtra notifyExtra;
    public String requestId;

    @C09CT("response_marker")
    public ResponseMarker responseMarker;

    @C09CT("share_tip_duration")
    public int shareTipDuration;

    @C09CT("token")
    public String stickerToken;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class NotifyExtra implements Serializable {

        @C09CT("button_text")
        public String btnText;

        @C09CT("text")
        public String text;

        @C09CT("type")
        public int type;
    }

    public static final class ResponseMarker implements Serializable {

        @C09CT("add_to_playlist_fail")
        public Boolean addToPlaylistFail;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public void setLogPbBean(LogPbBean logPbBean) {
        this.logPbBean = logPbBean;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
