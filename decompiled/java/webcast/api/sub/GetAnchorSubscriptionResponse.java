package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.RedDot;
import com.bytedance.android.livesdk.chatroom.api.SubMilestoneInfo;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class GetAnchorSubscriptionResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_gift_sub_auth")
        public boolean anchorGiftSubAuth;

        @C09CT("anchor_send_sub_gift_auth")
        public boolean anchorSendSubGiftAuth;

        @C09CT("banner")
        public SubLiveBanner banner;

        @C09CT("count_info")
        public List<SubscriberCountInfo> countInfo;

        @C09CT("enable_wave_status")
        public boolean enableWaveStatus;

        @C09CT("gift_sub")
        public SubGifInfo giftSub;

        @C09CT("has_past_goal")
        public boolean hasPastGoal;

        @C09CT("has_queue")
        public boolean hasQueue;

        @C09CT("milestone_info")
        public SubMilestoneInfo milestoneInfo;

        @C09CT("perks_pin_panel")
        public PerksPinPanel perksPinPanel;

        @C09CT("received_subs")
        public long receivedSubs;

        @C09CT("red_dot")
        public RedDot redDot;

        @C09CT("sub_goal")
        public SubGoal subGoal;

        @C09CT("timer_detail")
        public TimerDetail timerDetail;

        @C09CT("tip")
        public Tip tip;

        @C09CT("transaction_tips")
        public List<UpdateTips> transactionTips;
    }
}
