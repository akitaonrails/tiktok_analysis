package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftRealTimeUpdateParams {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("celebration")
    public boolean celebration;

    @C09CT("default_selected_gift_id")
    public long defaultSelectedGiftId;

    @C09CT("fug_number")
    public long fugNumber;

    @C09CT("match_context")
    public MatchContext matchContext;

    @C09CT("room_id")
    public long roomId;

    @C09CT("to_user_id")
    public long toUserId;

    @C09CT("user_pin_number")
    public long userPinNumber;

    @C09CT("watch_live_seconds")
    public long watchLiveSeconds;

    @C09CT("gifts")
    public List<Gift> gifts = new ArrayList();

    @C09CT("realtime_server_data")
    public String realtimeServerData = "";

    @C09CT("blocklist_motivations")
    public List<Long> blocklistMotivations = new ArrayList();

    @C09CT("strategy_context")
    public String strategyContext = "";

    @C09CT("req_for_strategy")
    public String reqForStrategy = "";

    public static final class Gift {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("price")
        public long price;
    }

    public static final class MatchContext {

        @C09CT("gift_only_id")
        public long giftOnlyId;

        @C09CT("guest_score")
        public long guestScore;

        @C09CT("host_score")
        public long hostScore;

        @C09CT("pk_id")
        public long pkId;

        @C09CT("pk_in_magic_mist")
        public boolean pkInMagicMist;

        @C09CT("pk_in_top2_top3")
        public boolean pkInTop2Top3;

        @C09CT("pk_msc_task_progress")
        public long pkMscTaskProgress;

        @C09CT("pk_remain_seconds")
        public long pkRemainSeconds;

        @C09CT("pk_send_gift_in_msc_task")
        public boolean pkSendGiftInMscTask;

        @C09CT("pk_send_gift_in_start_bonus")
        public long pkSendGiftInStartBonus;

        @C09CT("pk_start_seconds")
        public long pkStartSeconds;

        @C09CT("pk_task_reward_buff")
        public long pkTaskRewardBuff;

        @C09CT("pk_task_target")
        public long pkTaskTarget;

        @C09CT("pk_task_type")
        public long pkTaskType;
    }
}
