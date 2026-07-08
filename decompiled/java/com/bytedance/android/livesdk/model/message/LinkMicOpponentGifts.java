package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.match.EnigmaBattleExtraInfo;

/* JADX INFO: loaded from: classes.dex */
public final class LinkMicOpponentGifts extends AbstractC1136060ffY {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("enigma_battle_extra_info")
    public EnigmaBattleExtraInfo enigmaBattleExtraInfo;

    @C09CT("from_user_id")
    public long fromUserId;

    @C09CT("gift_count")
    public long giftCount;

    @C09CT("gift_icon_image")
    public ImageModel giftIconImage;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("gift_price")
    public long giftPrice;

    @C09CT("gift_to_user_id")
    public long giftToUserId;

    @C09CT("log_id")
    public String logId;

    @C09CT("repeat_count")
    public long repeatCount;

    @C09CT("send_gift_success_time")
    public long sendGiftSuccessTime;

    @C09CT("update_battle_score_time")
    public long updateBattleScoreTime;

    public LinkMicOpponentGifts() {
        this.type = C001A.LINK_MIC_OPPONENT_GIFTS;
        this.logId = "";
    }
}
