package com.ss.android.ugc.aweme.im.lightinteract.api.platform.strategybridge;

import X.C09CT;
import X.C0Z8Y;
import X.C1419705h5;
import X.C786410Ut5;
import X.InterfaceC898340ZMa;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.exitcontrol.LightInteractionExitBean;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LightInteractionMetaData implements InterfaceC898340ZMa {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("affinity_score_ranking")
    public final Integer affinityScoreRanking;

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

    @C09CT("has_streak_reminder_inline_msg")
    public final boolean hasStreakReminderInlineMsg;

    @C09CT("have_message_today")
    public final Boolean haveMessageToday;

    @C09CT("im_bulletin_board_type")
    public final int imBulletinBoardType;

    @C09CT("inner_push_type")
    public final int innerPushType;

    @C09CT("is_block")
    public final Boolean isBlock;

    @C09CT("is_blocked")
    public final Boolean isBlocked;

    @C09CT("is_mute")
    public final Boolean isMute;

    @C09CT("is_recommend")
    public final Boolean isRecommend;

    @C09CT("is_stranger")
    public final Boolean isStranger;

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

    @C09CT("peer_user_can_messaged")
    public final Boolean peerUserCanMessaged;

    @C09CT("peer_user_have_birthday")
    public final Boolean peerUserHaveBirthday;

    @C09CT("uid")
    public final String uid;

    @C09CT("unread_count")
    public final Long unreadCount;

    static {
        new C0Z8Y();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LightInteractionMetaData() {
        Boolean bool = Boolean.FALSE;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        IMHostApi.LIZ.getClass();
        this(false, null, "", null, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, null, null, jCurrentTimeMillis, C1419705h5.LIZ() != null ? r0.getServerTime() : 0L, TimeZone.getDefault().getID(), null, null, null, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightInteractionMetaData)) {
            return false;
        }
        LightInteractionMetaData lightInteractionMetaData = (LightInteractionMetaData) obj;
        return this.enteredChat == lightInteractionMetaData.enteredChat && Intrinsics.LJFF(this.followStatus, lightInteractionMetaData.followStatus) && Intrinsics.LJFF(this.fromPath, lightInteractionMetaData.fromPath) && Intrinsics.LJFF(this.unreadCount, lightInteractionMetaData.unreadCount) && Intrinsics.LJFF(this.isRecommend, lightInteractionMetaData.isRecommend) && Intrinsics.LJFF(this.onlineStatus, lightInteractionMetaData.onlineStatus) && Intrinsics.LJFF(this.followerStatus, lightInteractionMetaData.followerStatus) && Intrinsics.LJFF(this.isBlock, lightInteractionMetaData.isBlock) && Intrinsics.LJFF(this.isBlocked, lightInteractionMetaData.isBlocked) && Intrinsics.LJFF(this.isMute, lightInteractionMetaData.isMute) && Intrinsics.LJFF(this.isStranger, lightInteractionMetaData.isStranger) && Intrinsics.LJFF(this.conversationType, lightInteractionMetaData.conversationType) && Intrinsics.LJFF(this.latestMessageType, lightInteractionMetaData.latestMessageType) && Intrinsics.LJFF(this.latestMessageSendFromMe, lightInteractionMetaData.latestMessageSendFromMe) && Intrinsics.LJFF(this.latestMessageLightInteractionName, lightInteractionMetaData.latestMessageLightInteractionName) && Intrinsics.LJFF(this.lastShowMsgAsrc, lightInteractionMetaData.lastShowMsgAsrc) && Intrinsics.LJFF(this.firstShowSayHiTimeMs, lightInteractionMetaData.firstShowSayHiTimeMs) && Intrinsics.LJFF(this.uid, lightInteractionMetaData.uid) && Intrinsics.LJFF(this.conversationId, lightInteractionMetaData.conversationId) && this.imBulletinBoardType == lightInteractionMetaData.imBulletinBoardType && this.hasStreakReminderInlineMsg == lightInteractionMetaData.hasStreakReminderInlineMsg && this.innerPushType == lightInteractionMetaData.innerPushType && Intrinsics.LJFF(this.affinityScoreRanking, lightInteractionMetaData.affinityScoreRanking) && Intrinsics.LJFF(this.lightInteractionExitBean, lightInteractionMetaData.lightInteractionExitBean) && this.currentLocaleTimeSecond == lightInteractionMetaData.currentLocaleTimeSecond && this.currentServerTimeSecond == lightInteractionMetaData.currentServerTimeSecond && Intrinsics.LJFF(this.defaultTimeZoneId, lightInteractionMetaData.defaultTimeZoneId) && Intrinsics.LJFF(this.peerUserCanMessaged, lightInteractionMetaData.peerUserCanMessaged) && Intrinsics.LJFF(this.peerUserHaveBirthday, lightInteractionMetaData.peerUserHaveBirthday) && Intrinsics.LJFF(this.currentUserDMPermission, lightInteractionMetaData.currentUserDMPermission) && Intrinsics.LJFF(this.haveMessageToday, lightInteractionMetaData.haveMessageToday);
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
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        LightInteractionExitBean lightInteractionExitBean = this.lightInteractionExitBean;
        int iHashCode19 = (((((((iHashCode18 + (lightInteractionExitBean == null ? 0 : lightInteractionExitBean.hashCode())) * 31) + C786410Ut5.Y2(this.currentLocaleTimeSecond)) * 31) + C786410Ut5.Y2(this.currentServerTimeSecond)) * 31) + this.defaultTimeZoneId.hashCode()) * 31;
        Boolean bool7 = this.peerUserCanMessaged;
        int iHashCode20 = (iHashCode19 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.peerUserHaveBirthday;
        int iHashCode21 = (iHashCode20 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num7 = this.currentUserDMPermission;
        int iHashCode22 = (iHashCode21 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool9 = this.haveMessageToday;
        return iHashCode22 + (bool9 != null ? bool9.hashCode() : 0);
    }

    public final String toString() {
        return "LightInteractionMetaData(enteredChat=" + this.enteredChat + ", followStatus=" + this.followStatus + ", fromPath=" + this.fromPath + ", unreadCount=" + this.unreadCount + ", isRecommend=" + this.isRecommend + ", onlineStatus=" + this.onlineStatus + ", followerStatus=" + this.followerStatus + ", isBlock=" + this.isBlock + ", isBlocked=" + this.isBlocked + ", isMute=" + this.isMute + ", isStranger=" + this.isStranger + ", conversationType=" + this.conversationType + ", latestMessageType=" + this.latestMessageType + ", latestMessageSendFromMe=" + this.latestMessageSendFromMe + ", latestMessageLightInteractionName=" + this.latestMessageLightInteractionName + ", lastShowMsgAsrc=" + this.lastShowMsgAsrc + ", firstShowSayHiTimeMs=" + this.firstShowSayHiTimeMs + ", uid=" + this.uid + ", conversationId=" + this.conversationId + ", imBulletinBoardType=" + this.imBulletinBoardType + ", hasStreakReminderInlineMsg=" + this.hasStreakReminderInlineMsg + ", innerPushType=" + this.innerPushType + ", affinityScoreRanking=" + this.affinityScoreRanking + ", lightInteractionExitBean=" + this.lightInteractionExitBean + ", currentLocaleTimeSecond=" + this.currentLocaleTimeSecond + ", currentServerTimeSecond=" + this.currentServerTimeSecond + ", defaultTimeZoneId=" + this.defaultTimeZoneId + ", peerUserCanMessaged=" + this.peerUserCanMessaged + ", peerUserHaveBirthday=" + this.peerUserHaveBirthday + ", currentUserDMPermission=" + this.currentUserDMPermission + ", haveMessageToday=" + this.haveMessageToday + ')';
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

    public LightInteractionMetaData(boolean z, Integer num, String str, Long l, Boolean bool, Integer num2, Integer num3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num4, Integer num5, Boolean bool6, String str2, String str3, Long l2, String str4, String str5, int i, boolean z2, int i2, Integer num6, LightInteractionExitBean lightInteractionExitBean, long j, long j2, String str6, Boolean bool7, Boolean bool8, Integer num7, Boolean bool9) {
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
        this.lightInteractionExitBean = lightInteractionExitBean;
        this.currentLocaleTimeSecond = j;
        this.currentServerTimeSecond = j2;
        this.defaultTimeZoneId = str6;
        this.peerUserCanMessaged = bool7;
        this.peerUserHaveBirthday = bool8;
        this.currentUserDMPermission = num7;
        this.haveMessageToday = bool9;
    }
}
