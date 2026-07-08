package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.livesdk.message.proto.ToolBarManagement;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes36.dex */
public class RoomAuthStatus {

    @C09CT("GiftAnchorMt")
    public int anchorGiftType;

    @C09CT("anchor_level_permission")
    public AnchorLevelPermission anchorLevelPermission;

    @C09CT("GoldenEnvelope")
    public int anchorRedEnvelopeType;

    @C09CT("Banner")
    public int bannerState;

    @C09CT("BroadcastMessage")
    public Long broadcastmessage;

    @C09CT("ChatSubOnly")
    public boolean chatSubOnly;

    @C09CT("CommunityFlaggedReview")
    public boolean commentFlaggedReviewSwitch;

    @C09CT("CommunityFlagged")
    public boolean commentFlaggedSwitch;

    @C09CT("comment_tray_status")
    public long commentTrayStatus;

    @C09CT("CommentMention")
    public long commentmention;

    @C09CT("credit_entrance_for_audience")
    public boolean creditEntranceForAudience;

    @C09CT("custom_error_for_gift_setting")
    public RechargeCustomError customErrorForGiftSetting;

    @C09CT("CustomizableGiftPoll")
    public long customizablegiftpoll;

    @C09CT("CustomizablePoll")
    public Long customizablepoll = 0L;

    @C09CT("deprecated1")
    public Boolean deprecated1;

    @C09CT("deprecated2")
    public Long deprecated2;

    @C09CT("deprecated3")
    public Long deprecated3;

    @C09CT("deprecated4")
    public Long deprecated4;

    @C09CT("deprecated5")
    public Long deprecated5;

    @C09CT("deprecated6")
    public Long deprecated6;

    @C09CT("deprecated7")
    public Long deprecated7;

    @C09CT("deprecated8")
    public Long deprecated8;

    @C09CT("deprecated9")
    public Long deprecated9;

    @C09CT("DonationSticker")
    public int donationSticker;

    @C09CT("ShoppingRanking")
    public int ecRankSwitchStatus;

    @C09CT("EmotePoll")
    public long emotepoll;

    @C09CT("GoldenEnvelopeActivity")
    public int enableActivityTreasureBox;

    @C09CT("Chat")
    public boolean enableChat;

    @C09CT("ChatL2")
    public boolean enableChatL2;

    @C09CT("Danmaku")
    public boolean enableDanmaku;

    @C09CT("Digg")
    public boolean enableDigg;

    @C09CT("Pictionary")
    public long enableDrawGuess;

    @C09CT("Gift")
    public boolean enableGift;

    @C09CT("GiftPoll")
    public int enableGiftPoll;

    @C09CT("LuckMoney")
    public boolean enableLuckMoney;

    @C09CT("Poll")
    public int enablePoll;

    @C09CT("Promote")
    public boolean enablePromote;

    @C09CT("Props")
    public boolean enableProps;

    @C09CT("InteractionQuestion")
    public boolean enableQuestion;

    @C09CT("RoomContributor")
    public boolean enableRoomContributor;

    @C09CT("Share")
    public boolean enableShare;

    @C09CT("Viewers")
    public boolean enableViewers;

    @C09CT("EnableFansLevel")
    public boolean enablefanslevel;

    @C09CT("EnableShowUserUV")
    public boolean enableshowuseruv;

    @C09CT("EnigmaWhisper")
    public long enigmawhisper;

    @C09CT("EventPromotion")
    public int eventpromotion;

    @C09CT("Explore")
    public boolean exploreEnabled;

    @C09CT("FriendRankSwitch")
    public int friendrankswitch;

    @C09CT("game_guess_permission")
    public boolean gameGuessPermission;

    @C09CT("GameRankingSwitch")
    public int gamerankingswitch;

    @C09CT("transaction_history")
    public int giftRankSwitchStatus;

    @C09CT("guess_entrance_for_host")
    public boolean guessEntranceForHost;

    @C09CT("IsMultiCohost")
    public boolean isMultiCohost;

    @C09CT("Landscape")
    public int landscape;

    @C09CT("LandscapeChat")
    public Long landscapechat;

    @C09CT("PublicScreen")
    public int messageType;

    @C09CT("MultiEnableReserve")
    public boolean multienablereserve;

    @C09CT("MusicGiftEntrance")
    public long musicgiftentrance;

    @C09CT("PictionaryBubble")
    public long pictionarybubble;

    @C09CT("PictionaryPermission")
    public long pictionarypermission;

    @C09CT("PromoteOther")
    public int promoteOther;

    @C09CT("QuickChat")
    public int quickCommentState;

    @C09CT("Rank")
    public int rankState;

    @C09CT("RankingChangeAlterSwitch")
    public int rankingchangealterswitch;

    @C09CT("OffReason")
    public RoomAuthOffReasons roomAuthOffReasons;

    @C09CT("SecretRoom")
    public long secretroom;

    @C09CT("show_credit_widget")
    public boolean showCreditWidget;

    @C09CT("SpamComments")
    public boolean spamcomments;

    @C09CT("star_comment_permission_switch")
    public StarCommentPermissionSwitch starCommentPermissionSwitch;

    @C09CT("ToolBarManagement")
    public ToolBarManagement toolbarmanagement;

    @C09CT("use_user_pv")
    public boolean useUserPV;

    @C09CT("UserCount")
    public int userCountDisplayState;

    @C09CT("UserCard")
    public Boolean usercard;

    @C09CT("ViewerWishes")
    public long viewerwishes;

    /* JADX INFO: loaded from: classes.dex */
    public static final class StarCommentPermissionSwitch {

        @C09CT("OffReason")
        public String offreason = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }

    public boolean isAnchorEnvelopeRevoke() {
        return this.anchorRedEnvelopeType == 3;
    }

    public boolean isAnchorGiftEnable() {
        return this.anchorGiftType != 2;
    }

    public boolean isBannerEnable() {
        return this.bannerState != 2;
    }

    public boolean isEnableLandscape() {
        return this.landscape != 2;
    }

    public boolean isEnableStickerDonation() {
        return this.donationSticker == 1;
    }

    public boolean isMessageEnable() {
        return this.messageType != 2;
    }

    public boolean showActivityTreasureBox() {
        return this.enableActivityTreasureBox == 1;
    }

    public boolean showRedEnvelope() {
        int i = this.anchorRedEnvelopeType;
        return i == 1 || i == 3;
    }

    public String toString() {
        return "Chat:" + this.enableChat + " ; Danmaku:" + this.enableDanmaku + " ; Gift:" + this.enableGift + " ; Props:" + this.enableProps + " ; Digg:" + this.enableDigg + " ; LuckMoney:" + this.enableLuckMoney + " ; RoomContributor:" + this.enableRoomContributor + " ; Banner:" + this.bannerState + " ; GiftAnchorMt:" + this.anchorGiftType + " ; PublicScreen:" + this.messageType + " ; DonationSticker:" + this.donationSticker + " ; Share" + this.enableShare + " ; Viewers" + this.enableViewers + " ; Red Envelope:" + this.anchorRedEnvelopeType + " ; ChatL2:" + this.enableChatL2 + " ; chat_community_flagged:" + this.commentFlaggedSwitch + " ; chat_community_flagged_review:" + this.commentFlaggedReviewSwitch + " ; ";
    }

    public int getBannerState() {
        return this.bannerState;
    }

    public int getGiftRankSwitchStatus() {
        return this.giftRankSwitchStatus;
    }

    public int getLandscape() {
        return this.landscape;
    }

    public int getPromoteOther() {
        return this.promoteOther;
    }

    public int getPublicScreenAuth() {
        return this.messageType;
    }

    public int getQuickCommentState() {
        return this.quickCommentState;
    }

    public int getRankState() {
        return this.rankState;
    }

    public RoomAuthOffReasons getRoomAuthOffReasons() {
        return this.roomAuthOffReasons;
    }

    public int getUserCountDisplayState() {
        return this.userCountDisplayState;
    }

    public boolean isChatL2Enabled() {
        return this.enableChatL2;
    }

    public boolean isEnableChat() {
        return this.enableChat;
    }

    public boolean isEnableDanmaku() {
        return this.enableDanmaku;
    }

    public boolean isEnableDigg() {
        return this.enableDigg;
    }

    public boolean isEnableGift() {
        return this.enableGift;
    }

    public boolean isEnableLuckMoney() {
        return this.enableLuckMoney;
    }

    public boolean isEnablePromote() {
        return this.enablePromote;
    }

    public boolean isEnableProps() {
        return this.enableProps;
    }

    public boolean isEnableQuestion() {
        return this.enableQuestion;
    }

    public boolean isEnableRoomContributor() {
        return this.enableRoomContributor;
    }

    public boolean isEnableShare() {
        return this.enableShare;
    }

    public boolean isEnableViewers() {
        return this.enableViewers;
    }

    public boolean isExploreEnabled() {
        return this.exploreEnabled;
    }

    public boolean isMultiCohost() {
        return this.isMultiCohost;
    }

    public boolean isShowCreditWidget() {
        return this.showCreditWidget;
    }

    public boolean isUseUserPV() {
        return this.useUserPV;
    }

    public void setBannerState(int i) {
        this.bannerState = i;
    }

    public void setChatL2Enabled(boolean z) {
        this.enableChatL2 = z;
    }

    public void setEnableChat(boolean z) {
        this.enableChat = z;
    }

    public void setEnableDanmaku(boolean z) {
        this.enableDanmaku = z;
    }

    public void setEnableDigg(boolean z) {
        this.enableDigg = z;
    }

    public void setEnableGift(boolean z) {
        this.enableGift = z;
    }

    public void setEnableLuckMoney(boolean z) {
        this.enableLuckMoney = z;
    }

    public void setEnablePromote(boolean z) {
        this.enablePromote = z;
    }

    public void setEnableProps(boolean z) {
        this.enableProps = z;
    }

    public void setEnableQuestion(boolean z) {
        this.enableQuestion = z;
    }

    public void setEnableRoomContributor(boolean z) {
        this.enableRoomContributor = z;
    }

    public void setEnableViewers(boolean z) {
        this.enableViewers = z;
    }

    public void setExploreEnabled(boolean z) {
        this.exploreEnabled = z;
    }

    public void setGiftRankSwitchStatus(int i) {
        this.giftRankSwitchStatus = i;
    }

    public void setLandscape(int i) {
        this.landscape = i;
    }

    public void setMultiCohost(boolean z) {
        this.isMultiCohost = z;
    }

    public void setPromoteOther(int i) {
        this.promoteOther = i;
    }

    public void setRankState(int i) {
        this.rankState = i;
    }

    public void setShowCreditWidget(boolean z) {
        this.showCreditWidget = z;
    }

    public void setUserCountDisplayState(int i) {
        this.userCountDisplayState = i;
    }
}
