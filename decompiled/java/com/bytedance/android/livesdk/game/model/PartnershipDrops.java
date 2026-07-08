package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipDrops {

    @C09CT("anchor_can_join")
    public boolean anchorCanJoin;

    @C09CT("anchor_joined")
    public boolean anchorJoined;

    @C09CT("anchor_rank")
    public PartnershipDropsRankItem anchorRank;

    @C09CT("anchor_rewards")
    public List<PartnershipDropsAnchorReward> anchorRewards;

    @C09CT("auth_check")
    public boolean authCheck;

    @C09CT("end_time")
    public long endTime;

    @C09CT("event")
    public PartnershipGameEvent event;

    @C09CT("game_tag_id")
    public long gameTagId;

    @C09CT("rank_list")
    public List<PartnershipDropsRankItem> rankList;

    @C09CT("rank_show")
    public boolean rankShow;

    @C09CT("rewards")
    public List<PartnershipDropsReward> rewards;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("task_round")
    public int taskRound;

    @C09CT("task_type")
    public int taskType;

    @C09CT("cp_name")
    public String cpName = "";

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("name")
    public String name = "";

    @C09CT("icon")
    public String icon = "";

    @C09CT("head_image")
    public String headImage = "";

    @C09CT("join_rule")
    public String joinRule = "";

    @C09CT("reward_rule")
    public String rewardRule = "";

    @C09CT("rank_rule")
    public String rankRule = "";

    @C09CT("remark")
    public String remark = "";

    @C09CT("game_name")
    public String gameName = "";
}
