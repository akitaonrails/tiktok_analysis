package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.AssetBundle;
import com.bytedance.android.livesdk.gift.model.FlyingMicResources;
import com.bytedance.android.livesdk.gift.model.GiftEffect;
import com.bytedance.android.livesdk.gift.model.LynxGiftExtra;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.gift.model.SecondaryEffectInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.List;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;

/* JADX INFO: loaded from: classes.dex */
public class GiftMessage extends AbstractC1136060ffY {
    public transient boolean LL;
    public transient boolean LLILLJJLI;
    public transient boolean LLILLL;
    public transient boolean LLILZ;
    public transient int LLILZLL;
    public transient int LLIZ;
    public transient String LLIZLLLIL;
    public transient boolean LLJ;

    @C09CT("asset")
    public AssetsModel asset;

    @C09CT("asset_bundle")
    public AssetBundle assetBundle;

    @C09CT("banned_display_effects")
    public Long bannedDisplayEffects;

    @C09CT("color_id")
    public Long colorId;

    @C09CT("combo_count")
    public int comboCount;

    @C09CT("disable_gift_tracking")
    public boolean disableGiftTracking;

    @C09CT("display_duration_ms")
    public long displayDurationMs;

    @C09CT("display_text_for_anchor")
    public Text displayTextForAnchor;

    @C09CT("display_text_for_audience")
    public Text displayTextForAudience;

    @C09CT("display_text_for_sender")
    public Text displayTextForSender;

    @C09CT("fan_ticket_count")
    public int fanTicketCount;

    @C09CT("flying_mic_resources")
    public FlyingMicResources flyingMicResources;

    @C09CT("flying_mic_resources_v2")
    public FlyingMicResources flyingMicResourcesV2;

    @C09CT("user")
    public User fromUser;

    @C09CT("gift_effect")
    public GiftEffect giftEffect;

    @C09CT("gift_id")
    public long giftId;

    @C09CT("monitor_info")
    public GiftMonitorInfo giftMonitorInfo;

    @C09CT("gift_variant_id")
    public int giftVariantId;

    @C09CT("gifts_in_box")
    public GiftsBoxInfo giftsInBox;

    @C09CT("group_count")
    public int groupCount;

    @C09CT("group_id")
    public long groupId;

    @C09CT("income_taskgifts")
    public Long incomeTaskgifts;

    @C09CT("interactive_gift_info")
    public InteractiveGiftInfo interactiveGiftInfo;

    @C09CT("is_asset_bundle_gift")
    public boolean isAssetBundleGift;

    @C09CT("is_first_sent")
    public boolean isFirstSendGift;

    @C09CT("linkmic_gift_expression_strategy")
    public int linkmicGiftExpressionStrategy;

    @C09CT("lynx_extra")
    public List<LynxGiftExtra> lynxExtra;

    @C09CT("gift")
    public Gift mGift;

    @C09CT("tray_info")
    public GiftTrayInfo mTrayInfo;

    @C09CT("match_info")
    public MatchInfo matchInfo;

    @C09CT("msg_filter")
    public MsgFilter msgFilter;

    @C09CT("multi_generate_message")
    public boolean multiGenerateMessage;

    @C09CT("order_id")
    public String orderId;

    @C09CT("priority")
    public GiftIMPriority priority;

    @C09CT("public_area_common")
    public PublicAreaCommon publicAreaCommon;

    @C09CT("public_area_message_common")
    public PublicAreaMessageCommon publicAreaMessageCommon;

    @C09CT("repeat_count")
    public int repeatCount;

    @C09CT("repeat_end")
    public int repeatEnd;

    @C09CT("room_fan_ticket_count")
    public long roomFanTicketCount;

    @C09CT("secondary_effect_info")
    public SecondaryEffectInfo secondaryEffectInfo;

    @C09CT("send_type")
    public Long sendType;

    @C09CT("sponsorship_info")
    public List<SponsorshipInfo> sponsorshipInfo;

    @C09CT("text_effect")
    public TextEffect textEffect;

    @C09CT("to_member_id_int")
    public long toMemberIdInt;

    @C09CT("to_user")
    public User toUser;

    @C09CT("tray_display_text")
    public Text trayDisplayText;

    @C09CT("user_identity")
    public UserIdentity userIdentity;

    @C09CT("version")
    public int version;

    @C09CT("shiny_card_unlock_token")
    public String shinyCardUnlockToken = "";

    @C09CT("effect_extra")
    public String effectExtra = "";

    @C09CT("signature_version")
    public String signatureVersion = "";

    @C09CT("to_member_id")
    public String toMemberId = "";

    @C09CT("to_member_nickname")
    public String toMemberNickname = "";
    public transient String LLILZIL = "";

    @C09CT("log_id")
    public String mLogId = "";

    @C09CT("signature")
    public String signature = "";

    /* JADX INFO: loaded from: classes18.dex */
    public static final class InteractiveGiftInfo {

        @C09CT("cross_screen_delay")
        public long crossScreenDelay;

        @C09CT("cross_screen_role")
        public long crossScreenRole;

        @C09CT("ignore_component")
        public long ignoreComponent;

        @C09CT("ignore_config")
        public int ignoreConfig;

        @C09CT("to_user_team_id")
        public long toUserTeamId;

        @C09CT("uniq_id")
        public long uniqId;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class SponsorshipInfo {
        public transient String LIZ;

        @C09CT("become_all_sponsored")
        public boolean becomeAllSponsored;

        @C09CT("gift_gallery_click_sponsor")
        public boolean giftGalleryClickSponsor;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_tray_style")
        public int giftTrayStyle;

        @C09CT("light_gift_up")
        public boolean lightGiftUp;

        @C09CT("sponsor_id")
        public long sponsorId;

        @C09CT("unlighted_gift_icon")
        public String unlightedGiftIcon = "";

        @C09CT("gift_gallery_detail_page_scheme_url")
        public String giftGalleryDetailPageSchemeUrl = "";
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return this.fromUser != null;
    }

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
    }

    public GiftMessage() {
        this.type = C001A.GIFT;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftMessage{fromUserId=");
        sbLIZ.append(this.fromUser);
        sbLIZ.append(", toUserId=");
        User user = this.toUser;
        sbLIZ.append(user != null ? user.getId() : 0L);
        sbLIZ.append(", giftId=");
        sbLIZ.append(this.giftId);
        sbLIZ.append(", repeatCount=");
        sbLIZ.append(this.repeatCount);
        sbLIZ.append(", fanTicketCount=");
        sbLIZ.append(this.fanTicketCount);
        sbLIZ.append(", repeatEnd=");
        sbLIZ.append(this.repeatEnd);
        sbLIZ.append(", comboCount=");
        sbLIZ.append(this.comboCount);
        sbLIZ.append(", groupCount=");
        sbLIZ.append(this.groupCount);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.groupId);
        sbLIZ.append(", textEffect=");
        sbLIZ.append(GsonProtectorUtils.toJson(new Gson(), this.textEffect));
        sbLIZ.append(", isUrgent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isLocal=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
