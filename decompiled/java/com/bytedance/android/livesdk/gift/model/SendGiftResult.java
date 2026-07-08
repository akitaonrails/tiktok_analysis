package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.List;
import tikcast.api.user_level.PayGradeInfo;
import webcast.data.FansLevelInfo;

/* JADX INFO: loaded from: classes.dex */
public class SendGiftResult {
    public long LIZIZ;
    public int LIZJ;

    @C09CT("anchor_fans_count")
    public long anchorFansCount;

    @C09CT("backpack_info")
    public BackpackInfo backpackInfo;

    @C09CT("DiamondSources")
    public List<ExchangeGiftResultData> balanceResult;

    @C09CT("coins_balance_version")
    public long coinsBalanceVersion;

    @C09CT("combo_count")
    public int comboCount;

    @C09CT("describe")
    public String describe;

    @C09CT("display_text")
    public Text displayText;

    @C09CT("fan_ticket_count")
    public int fanTicketCount;

    @C09CT("fans_club_info")
    public GiftSendFansClubInfo fansClubInfo;

    @C09CT("fans_level_info")
    public FansLevelInfo fansLevelInfo;

    @C09CT("flying_mic_resources")
    public FlyingMicResources flyingMicResources;

    @C09CT("flying_mic_resources_v2")
    public FlyingMicResources flyingMicResourcesV2;

    @C09CT("remain_times")
    public int freqLimitRemaintimes;

    @C09CT("gift_challenge_progress")
    public GiftChallengeProgress giftChallengeProgress;

    @C09CT("gift_gallery_combo_sponsor")
    public boolean giftGalleryComboSponsor;

    @C09CT("gift_variant_id")
    public int giftVariantId;

    @C09CT("gifts")
    public List<GiftResultData> gifts;

    @C09CT("group_count")
    public int groupCount;

    @C09CT("group_id")
    public long groupId;

    @C09CT("is_first_sent")
    public boolean isFirstSend;

    @C09CT("level_up_gift_info")
    public LevelUpGiftInfo levelUpGiftInfo;

    @C09CT("linkmic_gift_expression_strategy")
    public int linkmicGiftExpressionStrategy;

    @C09CT("lynx_extra")
    public List<LynxGiftExtra> lynxExtra;

    @C09CT("calm_down_remind")
    public CalmDownInfo mCalmDownInfo;

    @C09CT("gift_id")
    public long mGiftId;

    @C09CT("left_diamond")
    public long mLeftDiamonds;

    @C09CT("match_info")
    public MatchInfo matchInfo;

    @C09CT("monitor_extra")
    public String monitorExtra;

    @C09CT("msg_id")
    public long msgId;

    @C09CT("multi_generate_message")
    public boolean multiGenerateMessage;

    @C09CT("panel_refresh_data")
    public PanelRefresh panelRefreshData;

    @C09CT("pay_grade_info")
    public PayGradeInfo payGradeInfo;

    @C09CT("prop_type")
    public int propType;

    @C09CT("props")
    public List<Prop> props;

    @C09CT("repeat_count")
    public int repeatCount;

    @C09CT("room_fan_ticket_count")
    public Long roomFanTicketCount;

    @C09CT("secondary_effect_info")
    public SecondaryEffectInfo secondaryEffectInfo;

    @C09CT("sponsorship_info")
    public List<SponsorshipInfo> sponsorshipInfo;

    @C09CT("team_rank_progress")
    public TeamRankProgress teamRankProgress;

    @C09CT("to_member_id")
    public long toMemberId;

    @C09CT("version")
    public int version;

    @C09CT("to_member_nickname")
    public String toMemberNickname = "";
    public long LIZ = -1;

    @C09CT("prop_def_id")
    public long propId = -1;

    @C09CT("order_id")
    public String orderId = "";
}
