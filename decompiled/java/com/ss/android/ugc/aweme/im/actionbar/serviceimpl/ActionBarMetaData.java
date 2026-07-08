package com.ss.android.ugc.aweme.im.actionbar.serviceimpl;

import X.C09CT;
import X.C13BV;
import X.C786410Ut5;
import X.InterfaceC898340ZMa;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class ActionBarMetaData implements InterfaceC898340ZMa {

    @C09CT("affinity_score_ranking")
    public final Integer affinityScoreRanking;

    @C09CT("social_avatar_expressions")
    public final List<String> aiMojiExpressionList;

    @C09CT("has_created_social_avatar")
    public final boolean aiMojiIsReady;

    @C09CT("ai_theater_social_enable")
    public final boolean aiTheaterSocialEnable;

    @C09CT("biz_info_avatar_duo_status")
    public final int bizInfoAvatarDuoStatus;

    @C09CT("biz_info_camera_status")
    public final int bizInfoCameraStatus;

    @C09CT("biz_info_group_shot_status")
    public final int bizInfoGroupShotStatus;

    @C09CT("biz_info_photo_swap_status")
    public final int bizInfoPhotoSwapStatus;

    @C09CT("conv_group_type")
    public final String convGroupType;

    @C09CT("conversation_has_active_streak")
    public final boolean conversationHasActiveStreak;

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("conversation_type")
    public final Integer conversationType;

    @C09CT("current_locale_time_second")
    public final long currentLocaleTimeSecond;

    @C09CT("current_server_time_second")
    public final long currentServerTimeSecond;

    @C09CT("current_user_dm_permission")
    public final Integer currentUserDMPermission;

    @C09CT("default_time_zone_id")
    public final String defaultTimeZoneId;

    @C09CT("effects_state_is_fetched")
    public final boolean effectsStateIsFetched;

    @C09CT("live_event_action_bar_enable")
    public final boolean enableGroupLiveEvent;

    @C09CT("streak_group_pet")
    public final boolean enableStreakGroupPet;

    @C09CT("entered_chat")
    public final boolean enteredChat;

    @C09CT("first_show_say_hi_time_ms")
    public final Long firstShowSayHiTimeMs;

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("follower_status")
    public final Integer followerStatus;

    @C09CT("from_path")
    public final String fromPath;

    @C09CT("group_conv_user_role")
    public final int groupConvUserRole;

    @C09CT("group_live_action_type")
    public final int groupLiveActionType;

    @C09CT("has_created_avatar_duo")
    public final boolean hasCreatedAvatarDuo;

    @C09CT("has_group_streak_egg_entrance")
    public final boolean hasGroupStreakEggEntrance;

    @C09CT("has_single_streak_egg_entrance")
    public final boolean hasSingleStreakEggEntrance;

    @C09CT("has_streak_reminder_inline_msg")
    public final boolean hasStreakReminderInlineMsg;

    @C09CT("shared_feed_entrance_impressions_limit")
    public final boolean hitSharedFeedActionBarExposeCountLimit;

    @C09CT("hit_streak_pet_acb_button_expose_count_limit")
    public final boolean hitStreakPetAcbButtonExposeCountLimit;

    @C09CT("im_bulletin_board_type")
    public final int imBulletinBoardType;

    @C09CT("inner_push_type")
    public final int innerPushType;

    @C09CT("is_block")
    public final Boolean isBlock;

    @C09CT("is_blocked")
    public final Boolean isBlocked;

    @C09CT("is_fan_group_chat")
    public final boolean isFanGroupChat;

    @C09CT("is_game_challenge_ab_enabled_on_client_group_chat")
    public final boolean isGameChallengeABEnabledOnClientGroupChat;

    @C09CT("is_game_challenge_ab_enabled_on_client_single_chat")
    public final boolean isGameChallengeABEnabledOnClientSingleChat;

    @C09CT("is_group_chat_valid")
    public final boolean isGroupChatValid;

    @C09CT("is_mute")
    public final Boolean isMute;

    @C09CT("is_recommend")
    public final Boolean isRecommend;

    @C09CT("is_stranger")
    public final Boolean isStranger;

    @C09CT("is_streak_pet_widget_showing")
    public final boolean isStreakPetWidgetShowing;

    @C09CT("user_last_message_sending_time_diff_from_now")
    public final Long lastSendMessageTimeDiff;

    @C09CT("a_src")
    public final String lastShowMsgAsrc;

    @C09CT("latest_message_light_interaction_name")
    public final String latestMessageLightInteractionName;

    @C09CT("latest_message_send_from_me")
    public final Boolean latestMessageSendFromMe;

    @C09CT("latest_message_type")
    public final Integer latestMessageType;

    @C09CT("light_interaction_exit_bean")
    public final LightInteractionExitBean lightInteractionExitBean;

    @C09CT("online_status")
    public final Integer onlineStatus;

    @C09CT("peer_hit_ai_theater_exp")
    public final boolean peerHitAITheaterExp;

    @C09CT("peer_hit_streak_pet_exp")
    public final boolean peerHitStreakPetExp;

    @C09CT("peer_hit_streak_pet_hatching_exp")
    public final boolean peerHitStreakPetHatchingExp;

    @C09CT("peer_user_can_messaged")
    public final Boolean peerUserCanMessaged;

    @C09CT("peer_user_have_birthday")
    public final Boolean peerUserHaveBirthday;

    @C09CT("photo_swap_experiment_enabled")
    public final boolean photoSwapExperimentEnabled;

    @C09CT("shared_feed_entrance_status")
    public final boolean sharedFeedEntranceStatus;

    @C09CT("should_move_group_live_to_last")
    public final boolean shouldMoveGroupLiveToLast;

    @C09CT("streak_can_display_promotional_widget")
    public final boolean streakCanDisplayPromotionalWidget;

    @C09CT("uid")
    public final String uid;

    @C09CT("unread_count")
    public final Long unreadCount;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarMetaData)) {
            return false;
        }
        ActionBarMetaData actionBarMetaData = (ActionBarMetaData) obj;
        return this.enteredChat == actionBarMetaData.enteredChat && Intrinsics.LJFF(this.followStatus, actionBarMetaData.followStatus) && Intrinsics.LJFF(this.fromPath, actionBarMetaData.fromPath) && Intrinsics.LJFF(this.unreadCount, actionBarMetaData.unreadCount) && Intrinsics.LJFF(this.isRecommend, actionBarMetaData.isRecommend) && Intrinsics.LJFF(this.onlineStatus, actionBarMetaData.onlineStatus) && Intrinsics.LJFF(this.followerStatus, actionBarMetaData.followerStatus) && Intrinsics.LJFF(this.isBlock, actionBarMetaData.isBlock) && Intrinsics.LJFF(this.isBlocked, actionBarMetaData.isBlocked) && Intrinsics.LJFF(this.isMute, actionBarMetaData.isMute) && Intrinsics.LJFF(this.isStranger, actionBarMetaData.isStranger) && Intrinsics.LJFF(this.conversationType, actionBarMetaData.conversationType) && Intrinsics.LJFF(this.latestMessageType, actionBarMetaData.latestMessageType) && Intrinsics.LJFF(this.latestMessageSendFromMe, actionBarMetaData.latestMessageSendFromMe) && Intrinsics.LJFF(this.latestMessageLightInteractionName, actionBarMetaData.latestMessageLightInteractionName) && Intrinsics.LJFF(this.lastShowMsgAsrc, actionBarMetaData.lastShowMsgAsrc) && Intrinsics.LJFF(this.firstShowSayHiTimeMs, actionBarMetaData.firstShowSayHiTimeMs) && Intrinsics.LJFF(this.uid, actionBarMetaData.uid) && Intrinsics.LJFF(this.conversationId, actionBarMetaData.conversationId) && this.imBulletinBoardType == actionBarMetaData.imBulletinBoardType && this.hasStreakReminderInlineMsg == actionBarMetaData.hasStreakReminderInlineMsg && this.innerPushType == actionBarMetaData.innerPushType && Intrinsics.LJFF(this.affinityScoreRanking, actionBarMetaData.affinityScoreRanking) && this.currentLocaleTimeSecond == actionBarMetaData.currentLocaleTimeSecond && this.currentServerTimeSecond == actionBarMetaData.currentServerTimeSecond && Intrinsics.LJFF(this.defaultTimeZoneId, actionBarMetaData.defaultTimeZoneId) && Intrinsics.LJFF(this.peerUserCanMessaged, actionBarMetaData.peerUserCanMessaged) && Intrinsics.LJFF(this.lightInteractionExitBean, actionBarMetaData.lightInteractionExitBean) && Intrinsics.LJFF(this.peerUserHaveBirthday, actionBarMetaData.peerUserHaveBirthday) && Intrinsics.LJFF(this.currentUserDMPermission, actionBarMetaData.currentUserDMPermission) && this.aiMojiIsReady == actionBarMetaData.aiMojiIsReady && Intrinsics.LJFF(this.aiMojiExpressionList, actionBarMetaData.aiMojiExpressionList) && Intrinsics.LJFF(this.lastSendMessageTimeDiff, actionBarMetaData.lastSendMessageTimeDiff) && this.isGroupChatValid == actionBarMetaData.isGroupChatValid && this.photoSwapExperimentEnabled == actionBarMetaData.photoSwapExperimentEnabled && this.bizInfoCameraStatus == actionBarMetaData.bizInfoCameraStatus && this.bizInfoPhotoSwapStatus == actionBarMetaData.bizInfoPhotoSwapStatus && this.conversationHasActiveStreak == actionBarMetaData.conversationHasActiveStreak && this.peerHitStreakPetExp == actionBarMetaData.peerHitStreakPetExp && this.hitStreakPetAcbButtonExposeCountLimit == actionBarMetaData.hitStreakPetAcbButtonExposeCountLimit && this.hitSharedFeedActionBarExposeCountLimit == actionBarMetaData.hitSharedFeedActionBarExposeCountLimit && this.effectsStateIsFetched == actionBarMetaData.effectsStateIsFetched && this.groupLiveActionType == actionBarMetaData.groupLiveActionType && this.shouldMoveGroupLiveToLast == actionBarMetaData.shouldMoveGroupLiveToLast && this.isStreakPetWidgetShowing == actionBarMetaData.isStreakPetWidgetShowing && this.bizInfoGroupShotStatus == actionBarMetaData.bizInfoGroupShotStatus && this.peerHitStreakPetHatchingExp == actionBarMetaData.peerHitStreakPetHatchingExp && this.sharedFeedEntranceStatus == actionBarMetaData.sharedFeedEntranceStatus && this.bizInfoAvatarDuoStatus == actionBarMetaData.bizInfoAvatarDuoStatus && this.hasCreatedAvatarDuo == actionBarMetaData.hasCreatedAvatarDuo && this.isFanGroupChat == actionBarMetaData.isFanGroupChat && Intrinsics.LJFF(this.convGroupType, actionBarMetaData.convGroupType) && this.isGameChallengeABEnabledOnClientSingleChat == actionBarMetaData.isGameChallengeABEnabledOnClientSingleChat && this.isGameChallengeABEnabledOnClientGroupChat == actionBarMetaData.isGameChallengeABEnabledOnClientGroupChat && this.enableStreakGroupPet == actionBarMetaData.enableStreakGroupPet && this.groupConvUserRole == actionBarMetaData.groupConvUserRole && this.enableGroupLiveEvent == actionBarMetaData.enableGroupLiveEvent && this.aiTheaterSocialEnable == actionBarMetaData.aiTheaterSocialEnable && this.peerHitAITheaterExp == actionBarMetaData.peerHitAITheaterExp && this.streakCanDisplayPromotionalWidget == actionBarMetaData.streakCanDisplayPromotionalWidget && this.hasGroupStreakEggEntrance == actionBarMetaData.hasGroupStreakEggEntrance && this.hasSingleStreakEggEntrance == actionBarMetaData.hasSingleStreakEggEntrance;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.enteredChat) * 31;
        Integer num = this.followStatus;
        int iHashCode = (((iZ2 + (num == null ? 0 : num.hashCode())) * 31) + this.fromPath.hashCode()) * 31;
        Long l = this.unreadCount;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isRecommend;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.onlineStatus;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.followerStatus;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.isBlock;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isBlocked;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isMute;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isStranger;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.conversationType;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.latestMessageType;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool6 = this.latestMessageSendFromMe;
        int iHashCode12 = (iHashCode11 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str = this.latestMessageLightInteractionName;
        int iHashCode13 = (iHashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastShowMsgAsrc;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.firstShowSayHiTimeMs;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.uid;
        int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.conversationId;
        int iHashCode17 = (((((((iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.imBulletinBoardType) * 31) + C786410Ut5.Z2(this.hasStreakReminderInlineMsg)) * 31) + this.innerPushType) * 31;
        Integer num6 = this.affinityScoreRanking;
        int iHashCode18 = (((((((iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31) + C786410Ut5.Y2(this.currentLocaleTimeSecond)) * 31) + C786410Ut5.Y2(this.currentServerTimeSecond)) * 31) + this.defaultTimeZoneId.hashCode()) * 31;
        Boolean bool7 = this.peerUserCanMessaged;
        int iHashCode19 = (iHashCode18 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        LightInteractionExitBean lightInteractionExitBean = this.lightInteractionExitBean;
        int iHashCode20 = (iHashCode19 + (lightInteractionExitBean == null ? 0 : lightInteractionExitBean.hashCode())) * 31;
        Boolean bool8 = this.peerUserHaveBirthday;
        int iHashCode21 = (iHashCode20 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num7 = this.currentUserDMPermission;
        int iHashCode22 = (((((iHashCode21 + (num7 == null ? 0 : num7.hashCode())) * 31) + C786410Ut5.Z2(this.aiMojiIsReady)) * 31) + this.aiMojiExpressionList.hashCode()) * 31;
        Long l3 = this.lastSendMessageTimeDiff;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode22 + (l3 != null ? l3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isGroupChatValid)) * 31) + C786410Ut5.Z2(this.photoSwapExperimentEnabled)) * 31) + this.bizInfoCameraStatus) * 31) + this.bizInfoPhotoSwapStatus) * 31) + C786410Ut5.Z2(this.conversationHasActiveStreak)) * 31) + C786410Ut5.Z2(this.peerHitStreakPetExp)) * 31) + C786410Ut5.Z2(this.hitStreakPetAcbButtonExposeCountLimit)) * 31) + C786410Ut5.Z2(this.hitSharedFeedActionBarExposeCountLimit)) * 31) + C786410Ut5.Z2(this.effectsStateIsFetched)) * 31) + this.groupLiveActionType) * 31) + C786410Ut5.Z2(this.shouldMoveGroupLiveToLast)) * 31) + C786410Ut5.Z2(this.isStreakPetWidgetShowing)) * 31) + this.bizInfoGroupShotStatus) * 31) + C786410Ut5.Z2(this.peerHitStreakPetHatchingExp)) * 31) + C786410Ut5.Z2(this.sharedFeedEntranceStatus)) * 31) + this.bizInfoAvatarDuoStatus) * 31) + C786410Ut5.Z2(this.hasCreatedAvatarDuo)) * 31) + C786410Ut5.Z2(this.isFanGroupChat)) * 31) + this.convGroupType.hashCode()) * 31) + C786410Ut5.Z2(this.isGameChallengeABEnabledOnClientSingleChat)) * 31) + C786410Ut5.Z2(this.isGameChallengeABEnabledOnClientGroupChat)) * 31) + C786410Ut5.Z2(this.enableStreakGroupPet)) * 31) + this.groupConvUserRole) * 31) + C786410Ut5.Z2(this.enableGroupLiveEvent)) * 31) + C786410Ut5.Z2(this.aiTheaterSocialEnable)) * 31) + C786410Ut5.Z2(this.peerHitAITheaterExp)) * 31) + C786410Ut5.Z2(this.streakCanDisplayPromotionalWidget)) * 31) + C786410Ut5.Z2(this.hasGroupStreakEggEntrance)) * 31) + C786410Ut5.Z2(this.hasSingleStreakEggEntrance);
    }

    public final String toString() {
        return "ActionBarMetaData(enteredChat=" + this.enteredChat + ", followStatus=" + this.followStatus + ", fromPath=" + this.fromPath + ", unreadCount=" + this.unreadCount + ", isRecommend=" + this.isRecommend + ", onlineStatus=" + this.onlineStatus + ", followerStatus=" + this.followerStatus + ", isBlock=" + this.isBlock + ", isBlocked=" + this.isBlocked + ", isMute=" + this.isMute + ", isStranger=" + this.isStranger + ", conversationType=" + this.conversationType + ", latestMessageType=" + this.latestMessageType + ", latestMessageSendFromMe=" + this.latestMessageSendFromMe + ", latestMessageLightInteractionName=" + this.latestMessageLightInteractionName + ", lastShowMsgAsrc=" + this.lastShowMsgAsrc + ", firstShowSayHiTimeMs=" + this.firstShowSayHiTimeMs + ", uid=" + this.uid + ", conversationId=" + this.conversationId + ", imBulletinBoardType=" + this.imBulletinBoardType + ", hasStreakReminderInlineMsg=" + this.hasStreakReminderInlineMsg + ", innerPushType=" + this.innerPushType + ", affinityScoreRanking=" + this.affinityScoreRanking + ", currentLocaleTimeSecond=" + this.currentLocaleTimeSecond + ", currentServerTimeSecond=" + this.currentServerTimeSecond + ", defaultTimeZoneId=" + this.defaultTimeZoneId + ", peerUserCanMessaged=" + this.peerUserCanMessaged + ", lightInteractionExitBean=" + this.lightInteractionExitBean + ", peerUserHaveBirthday=" + this.peerUserHaveBirthday + ", currentUserDMPermission=" + this.currentUserDMPermission + ", aiMojiIsReady=" + this.aiMojiIsReady + ", aiMojiExpressionList=" + this.aiMojiExpressionList + ", lastSendMessageTimeDiff=" + this.lastSendMessageTimeDiff + ", isGroupChatValid=" + this.isGroupChatValid + ", photoSwapExperimentEnabled=" + this.photoSwapExperimentEnabled + ", bizInfoCameraStatus=" + this.bizInfoCameraStatus + ", bizInfoPhotoSwapStatus=" + this.bizInfoPhotoSwapStatus + ", conversationHasActiveStreak=" + this.conversationHasActiveStreak + ", peerHitStreakPetExp=" + this.peerHitStreakPetExp + ", hitStreakPetAcbButtonExposeCountLimit=" + this.hitStreakPetAcbButtonExposeCountLimit + ", hitSharedFeedActionBarExposeCountLimit=" + this.hitSharedFeedActionBarExposeCountLimit + ", effectsStateIsFetched=" + this.effectsStateIsFetched + ", groupLiveActionType=" + this.groupLiveActionType + ", shouldMoveGroupLiveToLast=" + this.shouldMoveGroupLiveToLast + ", isStreakPetWidgetShowing=" + this.isStreakPetWidgetShowing + ", bizInfoGroupShotStatus=" + this.bizInfoGroupShotStatus + ", peerHitStreakPetHatchingExp=" + this.peerHitStreakPetHatchingExp + ", sharedFeedEntranceStatus=" + this.sharedFeedEntranceStatus + ", bizInfoAvatarDuoStatus=" + this.bizInfoAvatarDuoStatus + ", hasCreatedAvatarDuo=" + this.hasCreatedAvatarDuo + ", isFanGroupChat=" + this.isFanGroupChat + ", convGroupType=" + this.convGroupType + ", isGameChallengeABEnabledOnClientSingleChat=" + this.isGameChallengeABEnabledOnClientSingleChat + ", isGameChallengeABEnabledOnClientGroupChat=" + this.isGameChallengeABEnabledOnClientGroupChat + ", enableStreakGroupPet=" + this.enableStreakGroupPet + ", groupConvUserRole=" + this.groupConvUserRole + ", enableGroupLiveEvent=" + this.enableGroupLiveEvent + ", aiTheaterSocialEnable=" + this.aiTheaterSocialEnable + ", peerHitAITheaterExp=" + this.peerHitAITheaterExp + ", streakCanDisplayPromotionalWidget=" + this.streakCanDisplayPromotionalWidget + ", hasGroupStreakEggEntrance=" + this.hasGroupStreakEggEntrance + ", hasSingleStreakEggEntrance=" + this.hasSingleStreakEggEntrance + ')';
    }

    @Override // X.InterfaceC898340ZMa
    public final long LIZ() {
        return this.currentLocaleTimeSecond;
    }

    @Override // X.InterfaceC898340ZMa
    public final long LIZIZ() {
        return this.currentServerTimeSecond;
    }

    @Override // X.InterfaceC898340ZMa
    public final String LIZJ() {
        return this.fromPath;
    }

    public ActionBarMetaData(boolean z, Integer num, String str, Long l, Boolean bool, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num4, Integer num5, Boolean bool6, String str2, String str3, Long l2, String str4, String str5, int i, boolean z2, int i2, Integer num6, long j, long j2, String str6, Boolean bool7, LightInteractionExitBean lightInteractionExitBean, Boolean bool8, Integer num7, boolean z3, List<String> list, Long l3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, boolean z11, boolean z12, int i6, boolean z13, boolean z14, int i7, boolean z15, boolean z16, String str7, boolean z17, boolean z18, boolean z19, int i8, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25) {
        this.enteredChat = z;
        this.followStatus = num;
        this.fromPath = str;
        this.unreadCount = l;
        this.isRecommend = bool;
        this.onlineStatus = num2;
        this.followerStatus = num3;
        this.isBlock = bool2;
        this.isBlocked = bool3;
        this.isMute = bool4;
        this.isStranger = bool5;
        this.conversationType = num4;
        this.latestMessageType = num5;
        this.latestMessageSendFromMe = bool6;
        this.latestMessageLightInteractionName = str2;
        this.lastShowMsgAsrc = str3;
        this.firstShowSayHiTimeMs = l2;
        this.uid = str4;
        this.conversationId = str5;
        this.imBulletinBoardType = i;
        this.hasStreakReminderInlineMsg = z2;
        this.innerPushType = i2;
        this.affinityScoreRanking = num6;
        this.currentLocaleTimeSecond = j;
        this.currentServerTimeSecond = j2;
        this.defaultTimeZoneId = str6;
        this.peerUserCanMessaged = bool7;
        this.lightInteractionExitBean = lightInteractionExitBean;
        this.peerUserHaveBirthday = bool8;
        this.currentUserDMPermission = num7;
        this.aiMojiIsReady = z3;
        this.aiMojiExpressionList = list;
        this.lastSendMessageTimeDiff = l3;
        this.isGroupChatValid = z4;
        this.photoSwapExperimentEnabled = z5;
        this.bizInfoCameraStatus = i3;
        this.bizInfoPhotoSwapStatus = i4;
        this.conversationHasActiveStreak = z6;
        this.peerHitStreakPetExp = z7;
        this.hitStreakPetAcbButtonExposeCountLimit = z8;
        this.hitSharedFeedActionBarExposeCountLimit = z9;
        this.effectsStateIsFetched = z10;
        this.groupLiveActionType = i5;
        this.shouldMoveGroupLiveToLast = z11;
        this.isStreakPetWidgetShowing = z12;
        this.bizInfoGroupShotStatus = i6;
        this.peerHitStreakPetHatchingExp = z13;
        this.sharedFeedEntranceStatus = z14;
        this.bizInfoAvatarDuoStatus = i7;
        this.hasCreatedAvatarDuo = z15;
        this.isFanGroupChat = z16;
        this.convGroupType = str7;
        this.isGameChallengeABEnabledOnClientSingleChat = z17;
        this.isGameChallengeABEnabledOnClientGroupChat = z18;
        this.enableStreakGroupPet = z19;
        this.groupConvUserRole = i8;
        this.enableGroupLiveEvent = z20;
        this.aiTheaterSocialEnable = z21;
        this.peerHitAITheaterExp = z22;
        this.streakCanDisplayPromotionalWidget = z23;
        this.hasGroupStreakEggEntrance = z24;
        this.hasSingleStreakEggEntrance = z25;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionBarMetaData(boolean z, Integer num, String str, Long l, Boolean bool, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num4, Integer num5, Boolean bool6, String str2, String str3, Long l2, String str4, String str5, int i, boolean z2, int i2, Integer num6, long j, long j2, String str6, Boolean bool7, LightInteractionExitBean lightInteractionExitBean, Boolean bool8, Integer num7, boolean z3, List list, Long l3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, boolean z11, boolean z12, int i6, boolean z13, boolean z14, int i7, boolean z15, boolean z16, String str7, boolean z17, boolean z18, boolean z19, int i8, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        int i11;
        boolean z26 = z25;
        boolean z27 = z23;
        boolean z28 = z22;
        boolean z29 = z20;
        int i12 = i8;
        boolean z30 = z18;
        boolean z31 = z17;
        boolean z32 = z16;
        boolean z33 = z15;
        boolean z34 = z10;
        boolean z35 = z9;
        boolean z36 = z8;
        boolean z37 = z7;
        boolean z38 = z6;
        int i13 = i4;
        int i14 = i3;
        boolean z39 = z4;
        Long l4 = l3;
        List list2 = list;
        int i15 = i5;
        long serverTime = j2;
        boolean z40 = z5;
        String id = str6;
        long jCurrentTimeMillis = j;
        boolean z41 = z24;
        Integer num8 = num7;
        String str8 = str3;
        int i16 = i;
        boolean z42 = z21;
        Boolean bool9 = bool8;
        Integer num9 = num5;
        String str9 = str5;
        Long l5 = l2;
        boolean z43 = z19;
        LightInteractionExitBean lightInteractionExitBean2 = lightInteractionExitBean;
        Boolean bool10 = bool4;
        String str10 = str4;
        String str11 = str2;
        Boolean bool11 = bool6;
        Integer num10 = num4;
        Boolean bool12 = bool5;
        Boolean bool13 = bool7;
        Boolean bool14 = bool3;
        Boolean bool15 = bool2;
        Integer num11 = num6;
        boolean z44 = z13;
        Integer num12 = num3;
        Integer num13 = num2;
        Boolean bool16 = bool;
        int i17 = i2;
        boolean z45 = z12;
        Long l6 = l;
        boolean z46 = z14;
        String str12 = str;
        boolean z47 = z11;
        Integer num14 = num;
        boolean z48 = z3;
        boolean z49 = z2;
        boolean z50 = (i9 & 1) != 0 ? false : z;
        num14 = (i9 & 2) != 0 ? null : num14;
        str12 = (i9 & 4) != 0 ? "" : str12;
        l6 = (i9 & 8) != 0 ? null : l6;
        bool16 = (i9 & 16) != 0 ? null : bool16;
        num13 = (i9 & 32) != 0 ? null : num13;
        num12 = (i9 & 64) != 0 ? null : num12;
        bool15 = (i9 & 128) != 0 ? null : bool15;
        bool14 = (i9 & 256) != 0 ? null : bool14;
        bool10 = (i9 & 512) != 0 ? null : bool10;
        bool12 = (i9 & 1024) != 0 ? null : bool12;
        num10 = (i9 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num10;
        num9 = (i9 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num9;
        bool11 = (i9 & 8192) != 0 ? null : bool11;
        str11 = (i9 & 16384) != 0 ? null : str11;
        str8 = (32768 & i9) != 0 ? null : str8;
        l5 = (65536 & i9) != 0 ? null : l5;
        str10 = (i9 & 131072) != 0 ? null : str10;
        str9 = (i9 & 262144) != 0 ? null : str9;
        i16 = (i9 & 524288) != 0 ? 0 : i16;
        z49 = (i9 & 1048576) != 0 ? false : z49;
        i17 = (2097152 & i9) != 0 ? 0 : i17;
        num11 = (4194304 & i9) != 0 ? null : num11;
        jCurrentTimeMillis = (8388608 & i9) != 0 ? System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) : jCurrentTimeMillis;
        serverTime = (16777216 & i9) != 0 ? ((INetwork) ServiceManager.get().getService(INetwork.class)).getServerTime() : serverTime;
        id = (33554432 & i9) != 0 ? TimeZone.getDefault().getID() : id;
        bool13 = (67108864 & i9) != 0 ? null : bool13;
        lightInteractionExitBean2 = (134217728 & i9) != 0 ? null : lightInteractionExitBean2;
        bool9 = (268435456 & i9) != 0 ? null : bool9;
        num8 = (536870912 & i9) != 0 ? null : num8;
        z48 = (1073741824 & i9) != 0 ? false : z48;
        list2 = (i9 & Integer.MIN_VALUE) != 0 ? C13BV.INSTANCE : list2;
        l4 = (i10 & 1) != 0 ? null : l4;
        z39 = (i10 & 2) != 0 ? false : z39;
        z40 = (i10 & 4) != 0 ? false : z40;
        i14 = (i10 & 8) != 0 ? 0 : i14;
        i13 = (i10 & 16) != 0 ? 0 : i13;
        z38 = (i10 & 32) != 0 ? false : z38;
        z37 = (i10 & 64) != 0 ? false : z37;
        z36 = (i10 & 128) != 0 ? false : z36;
        z35 = (i10 & 256) != 0 ? false : z35;
        z34 = (i10 & 512) != 0 ? false : z34;
        i15 = (i10 & 1024) != 0 ? 0 : i15;
        z47 = (i10 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z47;
        z45 = (i10 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z45;
        if ((i10 & 16384) != 0) {
            i11 = 32768;
            z44 = false;
        } else {
            i11 = 32768;
        }
        this(z50, num14, str12, l6, bool16, num13, num12, bool15, bool14, bool10, bool12, num10, num9, bool11, str11, str8, l5, str10, str9, i16, z49, i17, num11, jCurrentTimeMillis, serverTime, id, bool13, lightInteractionExitBean2, bool9, num8, z48, list2, l4, z39, z40, i14, i13, z38, z37, z36, z35, z34, i15, z47, z45, i6, z44, (i11 & i10) != 0 ? false : z46, i7, (i10 & 131072) != 0 ? false : z33, (i10 & 262144) != 0 ? false : z32, (i10 & 524288) == 0 ? str7 : "", (i10 & 1048576) != 0 ? false : z31, (2097152 & i10) != 0 ? false : z30, (4194304 & i10) != 0 ? false : z43, (8388608 & i10) != 0 ? 0 : i12, (16777216 & i10) != 0 ? false : z29, (33554432 & i10) != 0 ? false : z42, (67108864 & i10) != 0 ? false : z28, (134217728 & i10) != 0 ? false : z27, (268435456 & i10) != 0 ? false : z41, (i10 & 536870912) != 0 ? false : z26);
    }
}
