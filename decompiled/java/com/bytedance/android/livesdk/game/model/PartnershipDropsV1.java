package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipDropsV1 {

    @C09CT("end_time")
    public long endTime;

    @C09CT("game_id")
    public long gameId;

    @C09CT("join_status")
    public boolean joinStatus;

    @C09CT("reason_params")
    public ReasonParams reasonParams;

    @C09CT("reason_type_value")
    public int reasonTypeValue;

    @C09CT("start_time")
    public long startTime;

    @C09CT("started")
    public boolean started;

    @C09CT("started_time")
    public long startedTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("stock_type")
    public int stockType;

    @C09CT("user_reserve_status")
    public int userReserveStatus;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("game_name")
    public String gameName = "";

    @C09CT("game_icon")
    public String gameIcon = "";

    @C09CT("reason_type")
    public String reasonType = "";

    @C09CT("gifts")
    public List<PartnershipDropsGift> gifts = new ArrayList();

    @C09CT("tasks")
    public List<PartnershipDropsTask> tasks = new ArrayList();

    @C09CT("game_id_str")
    public String gameIdStr = "";

    @C09CT("game_tag_id")
    public String gameTagId = "";

    @C09CT("cp_name")
    public String cpName = "";

    @C09CT("country")
    public List<String> country = new ArrayList();

    @C09CT("name")
    public String name = "";

    public static final class ReasonParams {

        @C09CT("excellent_creator_params")
        public ExcellentCreatorParams excellentCreatorParams;

        @C09CT("top_reward_params")
        public TopRewardsParams topRewardParams;

        public static final class ExcellentCreatorParams {

            @C09CT("game_name")
            public String gameName = "";
        }

        public static final class TopRewardsParams {

            @C09CT("event_name")
            public String eventName = "";

            @C09CT("rank")
            public int rank;
        }
    }
}
