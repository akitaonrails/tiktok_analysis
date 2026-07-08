package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C051M;
import X.C098200Yq;
import X.C09CT;
import X.C0I0B;
import X.C123100dR;
import X.C1368220li0;
import X.C189200o6;
import X.C2201941BFw;
import X.C894660Z7w;
import X.C895650ZBr;
import X.C913380ZsO;
import X.EnumC1369370ljr;
import X.InterfaceC1294060jmO;
import X.InterfaceC1381610m3b;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIProfileExService;
import com.ss.android.ugc.aweme.profile.model.FakeDataInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public class IMUser extends IMContact implements InterfaceC1381610m3b {
    public static final C2201941BFw Companion = new C2201941BFw();
    public int accountType;

    @C09CT("avatar_medium")
    public UrlModel avatarMedium;
    public String avatarMediumStr;

    @C09CT("block_status")
    public int blockStatus;

    @C09CT("can_message_follow_status_list")
    public List<Integer> canMessageFollowStatusList;
    public long checkedUnreadStoryMillis;

    @C09CT("comment_mention_block_status")
    public long commentMentionBlockStatus;

    @C09CT("commerce_user_level")
    public int commerceUserLevel;

    @C09CT("contact_name")
    public String contactName;
    public String contactNameInitial;
    public String contactNamePinyin;

    @C09CT("custom_verify")
    public String customVerify;

    @C09CT("enable_direct_message")
    public boolean enableDirectMessage;

    @C09CT("enterprise_verify_reason")
    public String enterpriseVerifyReason;
    public FakeDataInfo fakeDataInfo;

    @C09CT("follow_status")
    public int followStatus;

    @C09CT("follow_time")
    public long followTime;

    @C09CT("follower_count")
    public int followerCount;

    @C09CT("follower_status")
    public int followerStatus;

    @C09CT("following_count")
    public int followingCount;
    public long friendRecTime;

    @C09CT("rec_type")
    public int friendRecType;
    public boolean hasUnreadStory;
    public IMUserBizInfo imUserBizInfo;
    public String initialLetter;
    public int internalShareHoldoutVersion;
    public boolean isActive;

    @C09CT("is_block")
    public boolean isBlock;

    @C09CT("is_blocked")
    public boolean isBlocked;
    public transient boolean isDeleted;
    public boolean isEnterprise;

    @C09CT("is_fake")
    public boolean isFake;

    @C09CT("is_group_owner")
    public boolean isGroupOwner;
    public boolean isMAF;

    @C09CT("secret")
    public boolean isSecret;
    public Boolean isUserEnabledQAInvite;
    public boolean isUserNotInAllFriends;
    public MatchedFriendStruct matchedFriend;
    public String nickNameInitial;
    public String nickNamePinyin;
    public transient C1368220li0 primaryMatchMeta;

    @C09CT("qa_invite_block_status")
    public long qaInviteBlockStatus;
    public String qaPrivacyMessage;

    @C09CT("recommend_reason")
    public String recommendReason;
    public String remarkInitial;

    @C09CT("remark_name")
    public String remarkName;
    public String remarkPinyin;
    public boolean searchIsBusinessAccount;
    public int searchType;

    @C09CT("short_id")
    public String shortId;

    @C09CT("signature")
    public String signature;
    public String sortWeight;

    @C09CT("invitation_status")
    public int taggedBAInvitationStatus;

    @C09CT("is_business_account")
    public boolean taggedIsBA;

    @C09CT("third_name")
    public String thirdName;

    @C09CT("verification_type")
    public int verificationType;

    @C09CT("video_mention_block_status")
    public long videoMentionBlockStatus;

    @C09CT("video_tag_block_status")
    public long videoTagBlockStatus;

    @C09CT("weibo_verify")
    public String weiboVerify;

    @C09CT("is_welcome_msg_enabled")
    public int welcomeMsgEnabled;
    public boolean withCommerceEntry;

    @C09CT("unique_id")
    public String uniqueId = "";

    @C09CT("is_mention_enabled")
    public boolean isMentionEnabled = true;

    @C09CT("can_share_message")
    public int shareStatus = getShareStatusDefault();
    public String recType = "";
    public int shareLinkRelationIndex = -1;
    public String alias = "";
    public transient Map<Integer, C1368220li0> allMatchMeta = new LinkedHashMap();
    public Long updateTime = 0L;

    public static final IMUser fromUser(User user) {
        Companion.getClass();
        return C2201941BFw.LIZJ(user);
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getFollowStatus$annotations() {
    }

    public static /* synthetic */ void getFriendRecType$annotations() {
    }

    public static final boolean isInvalidUser(String str) {
        Companion.getClass();
        return C2201941BFw.LJ(str);
    }

    public static final boolean isSelf(String str) {
        Companion.getClass();
        return C2201941BFw.LJFF(str);
    }

    public static final User toUser(IMUser iMUser) {
        Companion.getClass();
        return C2201941BFw.LJII(iMUser);
    }

    public int getShareStatusDefault() {
        return 1;
    }

    public final IMUser clone() {
        IMUser iMUser = new IMUser();
        iMUser.setUid(getUid());
        iMUser.setSecUid(getSecUid());
        iMUser.setNickName(getNickName());
        iMUser.signature = this.signature;
        iMUser.setAvatarThumb(getAvatarThumb());
        iMUser.followStatus = getFollowStatus();
        iMUser.relationListItemType = this.relationListItemType;
        iMUser.uniqueId = this.uniqueId;
        iMUser.shortId = this.shortId;
        iMUser.weiboVerify = this.weiboVerify;
        iMUser.customVerify = this.customVerify;
        iMUser.enterpriseVerifyReason = this.enterpriseVerifyReason;
        iMUser.verificationType = this.verificationType;
        iMUser.remarkName = this.remarkName;
        iMUser.setAvatarStr(getAvatarStr());
        iMUser.initialLetter = this.initialLetter;
        iMUser.sortWeight = this.sortWeight;
        iMUser.remarkPinyin = this.remarkPinyin;
        iMUser.remarkInitial = this.remarkInitial;
        iMUser.nickNamePinyin = this.nickNamePinyin;
        iMUser.nickNameInitial = this.nickNameInitial;
        iMUser.isBlock = this.isBlock;
        iMUser.isBlocked = this.isBlocked;
        iMUser.commerceUserLevel = this.commerceUserLevel;
        iMUser.withCommerceEntry = this.withCommerceEntry;
        iMUser.hasUnreadStory = this.hasUnreadStory;
        iMUser.checkedUnreadStoryMillis = this.checkedUnreadStoryMillis;
        iMUser.contactName = this.contactName;
        iMUser.contactNamePinyin = this.contactNamePinyin;
        iMUser.contactNameInitial = this.contactNameInitial;
        iMUser.setShareStatus(getShareStatus());
        iMUser.isEnterprise = this.isEnterprise;
        iMUser.accountType = this.accountType;
        iMUser.isGroupOwner = this.isGroupOwner;
        iMUser.recommendReason = this.recommendReason;
        iMUser.followerStatus = this.followerStatus;
        iMUser.thirdName = this.thirdName;
        iMUser.recType = this.recType;
        iMUser.isSecret = this.isSecret;
        iMUser.setFollowTime(this.followTime);
        iMUser.shareLinkRelationIndex = this.shareLinkRelationIndex;
        iMUser.isUserNotInAllFriends = this.isUserNotInAllFriends;
        iMUser.isUserEnabledQAInvite = this.isUserEnabledQAInvite;
        iMUser.qaPrivacyMessage = this.qaPrivacyMessage;
        iMUser.isMentionEnabled = this.isMentionEnabled;
        iMUser.commentMentionBlockStatus = this.commentMentionBlockStatus;
        iMUser.videoMentionBlockStatus = this.videoMentionBlockStatus;
        iMUser.videoTagBlockStatus = this.videoTagBlockStatus;
        iMUser.qaInviteBlockStatus = this.qaInviteBlockStatus;
        iMUser.followerCount = this.followerCount;
        iMUser.followingCount = this.followingCount;
        iMUser.internalShareHoldoutVersion = this.internalShareHoldoutVersion;
        iMUser.setAvatarMedium(getAvatarMedium());
        iMUser.canMessageFollowStatusList = this.canMessageFollowStatusList;
        iMUser.welcomeMsgEnabled = this.welcomeMsgEnabled;
        iMUser.taggedIsBA = this.taggedIsBA;
        iMUser.taggedBAInvitationStatus = this.taggedBAInvitationStatus;
        iMUser.enableDirectMessage = this.enableDirectMessage;
        iMUser.blockStatus = this.blockStatus;
        iMUser.updateTime = this.updateTime;
        iMUser.matchedFriend = this.matchedFriend;
        iMUser.setDisabledOnSharePanelReasonCode(getDisabledOnSharePanelReasonCode());
        return iMUser;
    }

    public final UrlModel getAvatarMedium() {
        if (this.avatarMedium == null && C123100dR.LIZ(this.avatarMediumStr)) {
            try {
                this.avatarMedium = (UrlModel) C051M.LIZ(UrlModel.class, this.avatarMediumStr);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return this.avatarMedium;
    }

    public final String getDisplayId() {
        String str = this.uniqueId;
        return (str == null || str.length() <= 0) ? this.shortId : str;
    }

    public final boolean isAdult() {
        IMUserB2CAccountInfo userB2CAccountInfo;
        Integer num;
        IMUserBizInfo iMUserBizInfo = this.imUserBizInfo;
        return (iMUserBizInfo == null || (userB2CAccountInfo = iMUserBizInfo.getUserB2CAccountInfo()) == null || (num = userB2CAccountInfo.bizUserLevel) == null || num.intValue() != 4) ? false : true;
    }

    public String toString() {
        return "IMUser{uid='" + getUid() + "', secUid='" + getSecUid() + "', nickName='" + getNickName() + "', signature='" + this.signature + "', avatarThumb=" + getAvatarThumb() + ", followStatus=" + getFollowStatus() + ", uniqueId='" + this.uniqueId + "', shortId='" + this.shortId + "', weiboVerify='" + this.weiboVerify + "', customVerify='" + this.customVerify + "', enterpriseVerifyReason='" + this.enterpriseVerifyReason + "', verificationType=" + this.verificationType + ", remarkName='" + this.remarkName + "', commerceUserLevel=" + this.commerceUserLevel + ", contactName='" + this.contactName + "', withCommerceEntry=" + this.withCommerceEntry + ", hasUnreadStory=" + this.hasUnreadStory + ", checkedUnreadStoryMillis=" + this.checkedUnreadStoryMillis + ", avatarStr='" + getAvatarStr() + "', sortWeight='" + this.sortWeight + "', initialLetter='" + this.initialLetter + "', remarkPinyin='" + this.remarkPinyin + "', remarkInitial='" + this.remarkInitial + "', nickNamePinyin='" + this.nickNamePinyin + "', nickNameInitial='" + this.nickNameInitial + "', contactNamePinyin='" + this.contactNamePinyin + "', contactNameInitial='" + this.contactNameInitial + "', shareStatus=" + getShareStatus() + ", searchType=" + this.searchType + ", isBlock=" + this.isBlock + ", isBlocked=" + this.isBlocked + ", isFake=" + this.isFake + ", friendRecType=" + this.friendRecType + ", friendRecTime=" + this.friendRecTime + ", enterprise=" + this.isEnterprise + ", accountType=" + this.accountType + ", followerStatus=" + this.followerStatus + ", followTime =" + this.followTime + ", secret=" + this.isSecret + ", isMentionEnabled=" + this.isMentionEnabled + ", commentMentionBlockStatus=" + this.commentMentionBlockStatus + ", videoMentionBlockStatus=" + this.videoMentionBlockStatus + ", videoTagBlockStatus=" + this.videoTagBlockStatus + ", qaInviteBlockStatus=" + this.qaInviteBlockStatus + ", followerCount=" + this.followerCount + ", followingCount=" + this.followingCount + ", internalShareHoldoutVersion=" + this.internalShareHoldoutVersion + ", avatarMedium=" + getAvatarMedium() + ", canMessageFollowStatusList=" + this.canMessageFollowStatusList + ", welcomeMsgEnabled=" + this.welcomeMsgEnabled + ", taggedIsBA=" + this.taggedIsBA + ", taggedBAInvitationStatus=" + this.taggedBAInvitationStatus + ", enableDirectMessage=" + this.enableDirectMessage + ", blockStatus=" + this.blockStatus + '}';
    }

    public final boolean forbidSendMessage() {
        return getShareStatus() == 2;
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public UrlModel getDisplayAvatar() {
        return getAvatarThumb();
    }

    @Override // com.ss.android.ugc.aweme.im.common.model.BaseContact
    public String getDisplayName() {
        String nickName = getNickName();
        if (nickName != null && nickName.length() > 0) {
            return nickName;
        }
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131831188);
    }

    public final String getDisplayUserName() {
        String strAlias = alias(this);
        return ((strAlias == null || strAlias.length() <= 0) && (strAlias = getDisplayName()) == null) ? "" : strAlias;
    }

    public final int getFollowStatus() {
        boolean zLJI = MethodIDManager.LJI(202371);
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        int i = (iIMContactUtilServiceLIZ == null || !iIMContactUtilServiceLIZ.LJIIIZ(this)) ? this.followStatus : 2;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return i;
    }

    @Override // X.InterfaceC1381610m3b
    public String getItemId() {
        return getUid();
    }

    public final String getRawNickNameForDisplay() {
        String displayName = getDisplayName();
        return displayName == null ? "" : displayName;
    }

    @Override // X.InterfaceC1381610m3b
    public EnumC1369370ljr getRelationship() {
        return getFollowStatus() == 2 ? EnumC1369370ljr.FRIENDS : getFollowStatus() == 1 ? EnumC1369370ljr.FOLLOWING : getFollowStatus() == 4 ? EnumC1369370ljr.REQUESTED : this.followerStatus == 1 ? EnumC1369370ljr.FOLLOWED : this.isMAF ? EnumC1369370ljr.MATCHED_FRIENDS : EnumC1369370ljr.NONE;
    }

    public int hashCode() {
        String uid = getUid();
        if (uid != null) {
            return uid.hashCode();
        }
        return 0;
    }

    public final int getAccountType() {
        return this.accountType;
    }

    public final String getAlias() {
        return this.alias;
    }

    @Override // X.InterfaceC1381610m3b
    public Map<Integer, C1368220li0> getAllMatchMeta() {
        return this.allMatchMeta;
    }

    public final String getAvatarMediumStr() {
        return this.avatarMediumStr;
    }

    public final int getBlockStatus() {
        return this.blockStatus;
    }

    public final List<Integer> getCanMessageFollowStatusList() {
        return this.canMessageFollowStatusList;
    }

    public final long getCheckedUnreadStoryMillis() {
        return this.checkedUnreadStoryMillis;
    }

    public final long getCommentMentionBlockStatus() {
        return this.commentMentionBlockStatus;
    }

    public final int getCommerceUserLevel() {
        return this.commerceUserLevel;
    }

    public final String getContactName() {
        return this.contactName;
    }

    public final String getContactNameInitial() {
        return this.contactNameInitial;
    }

    public final String getContactNamePinyin() {
        return this.contactNamePinyin;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final boolean getEnableDirectMessage() {
        return this.enableDirectMessage;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final FakeDataInfo getFakeDataInfo() {
        return this.fakeDataInfo;
    }

    public final long getFollowTime() {
        return this.followTime;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    public final int getFollowerStatus() {
        return this.followerStatus;
    }

    public final int getFollowingCount() {
        return this.followingCount;
    }

    public final long getFriendRecTime() {
        return this.friendRecTime;
    }

    public final int getFriendRecType() {
        return this.friendRecType;
    }

    public final boolean getHasUnreadStory() {
        return this.hasUnreadStory;
    }

    public final IMUserBizInfo getImUserBizInfo() {
        return this.imUserBizInfo;
    }

    public final String getInitialLetter() {
        return this.initialLetter;
    }

    public final int getInternalShareHoldoutVersion() {
        return this.internalShareHoldoutVersion;
    }

    public final MatchedFriendStruct getMatchedFriend() {
        return this.matchedFriend;
    }

    public final String getNickNameInitial() {
        return this.nickNameInitial;
    }

    public final String getNickNamePinyin() {
        return this.nickNamePinyin;
    }

    @Override // X.InterfaceC1381610m3b
    public C1368220li0 getPrimaryMatchMeta() {
        return this.primaryMatchMeta;
    }

    public final long getQaInviteBlockStatus() {
        return this.qaInviteBlockStatus;
    }

    public final String getQaPrivacyMessage() {
        return this.qaPrivacyMessage;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final String getRecommendReason() {
        return this.recommendReason;
    }

    public final String getRemarkInitial() {
        return this.remarkInitial;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getRemarkPinyin() {
        return this.remarkPinyin;
    }

    public final boolean getSearchIsBusinessAccount() {
        return this.searchIsBusinessAccount;
    }

    public final int getShareLinkRelationIndex() {
        return this.shareLinkRelationIndex;
    }

    public int getShareStatus() {
        return this.shareStatus;
    }

    public final String getShortId() {
        return this.shortId;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getSortWeight() {
        return this.sortWeight;
    }

    public final int getTaggedBAInvitationStatus() {
        return this.taggedBAInvitationStatus;
    }

    public final boolean getTaggedIsBA() {
        return this.taggedIsBA;
    }

    public final String getThirdName() {
        return this.thirdName;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final int getVerificationType() {
        return this.verificationType;
    }

    public final long getVideoMentionBlockStatus() {
        return this.videoMentionBlockStatus;
    }

    public final long getVideoTagBlockStatus() {
        return this.videoTagBlockStatus;
    }

    public final String getWeiboVerify() {
        return this.weiboVerify;
    }

    public final int getWelcomeMsgEnabled() {
        return this.welcomeMsgEnabled;
    }

    public final boolean getWithCommerceEntry() {
        return this.withCommerceEntry;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isBlock() {
        return this.isBlock;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isEnterprise() {
        return this.isEnterprise;
    }

    public final boolean isFake() {
        return this.isFake;
    }

    public final boolean isGroupOwner() {
        return this.isGroupOwner;
    }

    public final boolean isMAF() {
        return this.isMAF;
    }

    public final boolean isMentionEnabled() {
        return this.isMentionEnabled;
    }

    public final boolean isSecret() {
        return this.isSecret;
    }

    public final Boolean isUserEnabledQAInvite() {
        return this.isUserEnabledQAInvite;
    }

    public final boolean isUserNotInAllFriends() {
        return this.isUserNotInAllFriends;
    }

    private final String alias(IMUser iMUser) {
        String uid = iMUser.getUid();
        if (uid != null) {
            IMHostApiIProfileExService.LIZ.getClass();
            IMHostApiIProfileExService value = C895650ZBr.LIZIZ.getValue();
            if (value != null) {
                return value.LIZJ(uid);
            }
            return null;
        }
        return null;
    }

    public final void copy(IMUser iMUser) {
        setUid(iMUser.getUid());
        setSecUid(iMUser.getSecUid());
        setNickName(iMUser.getNickName());
        this.signature = iMUser.signature;
        setAvatarThumb(iMUser.getAvatarThumb());
        this.followStatus = iMUser.getFollowStatus();
        this.uniqueId = iMUser.uniqueId;
        this.shortId = iMUser.shortId;
        this.weiboVerify = iMUser.weiboVerify;
        this.customVerify = iMUser.customVerify;
        this.enterpriseVerifyReason = iMUser.enterpriseVerifyReason;
        this.verificationType = iMUser.verificationType;
        this.remarkName = iMUser.remarkName;
        this.isBlock = iMUser.isBlock;
        this.isBlocked = iMUser.isBlocked;
        this.commerceUserLevel = iMUser.commerceUserLevel;
        this.withCommerceEntry = iMUser.withCommerceEntry;
        this.hasUnreadStory = iMUser.hasUnreadStory;
        this.checkedUnreadStoryMillis = 0L;
        setShareStatus(iMUser.getShareStatus());
        this.isEnterprise = iMUser.isEnterprise;
        this.accountType = iMUser.accountType;
        this.recommendReason = iMUser.recommendReason;
        this.followerStatus = iMUser.followerStatus;
        this.thirdName = iMUser.thirdName;
        this.recType = iMUser.recType;
        this.isSecret = iMUser.isSecret;
        setFollowTime(iMUser.followTime);
        this.isUserNotInAllFriends = iMUser.isUserNotInAllFriends;
        this.isUserEnabledQAInvite = iMUser.isUserEnabledQAInvite;
        this.qaPrivacyMessage = iMUser.qaPrivacyMessage;
        this.isMentionEnabled = iMUser.isMentionEnabled;
        this.commentMentionBlockStatus = iMUser.commentMentionBlockStatus;
        this.videoTagBlockStatus = iMUser.videoTagBlockStatus;
        this.videoMentionBlockStatus = iMUser.videoMentionBlockStatus;
        this.qaInviteBlockStatus = iMUser.qaInviteBlockStatus;
        this.followingCount = iMUser.followingCount;
        this.followerCount = iMUser.followerCount;
        this.internalShareHoldoutVersion = iMUser.internalShareHoldoutVersion;
        setAvatarMedium(iMUser.getAvatarMedium());
        this.canMessageFollowStatusList = iMUser.canMessageFollowStatusList;
        this.welcomeMsgEnabled = iMUser.welcomeMsgEnabled;
        this.taggedIsBA = iMUser.taggedIsBA;
        this.enableDirectMessage = iMUser.enableDirectMessage;
        this.blockStatus = iMUser.blockStatus;
        this.updateTime = iMUser.updateTime;
        this.matchedFriend = iMUser.matchedFriend;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMUser)) {
            return false;
        }
        return Intrinsics.LJFF(getUid(), ((BaseContact) obj).getUid());
    }

    @Override // X.InterfaceC1381610m3b
    public String getSearchDimension(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return this.uniqueId;
            }
            return getDisplayName();
        }
        return this.alias;
    }

    public final void setAccountType(int i) {
        this.accountType = i;
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    @Override // X.InterfaceC1381610m3b
    public void setAllMatchMeta(Map<Integer, C1368220li0> map) {
        this.allMatchMeta = map;
    }

    public final void setAvatarMedium(UrlModel urlModel) {
        this.avatarMedium = urlModel;
        try {
            this.avatarMediumStr = C051M.LJ(urlModel, false);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void setAvatarMediumStr(String str) {
        this.avatarMediumStr = str;
    }

    public final void setBlock(boolean z) {
        this.isBlock = z;
    }

    public final void setBlockStatus(int i) {
        this.blockStatus = i;
    }

    public final void setBlocked(boolean z) {
        this.isBlocked = z;
    }

    public final void setCanMessageFollowStatusList(List<Integer> list) {
        this.canMessageFollowStatusList = list;
    }

    public final void setCheckedUnreadStoryMillis(long j) {
        this.checkedUnreadStoryMillis = j;
    }

    public final void setCommentMentionBlockStatus(long j) {
        this.commentMentionBlockStatus = j;
    }

    public final void setCommerceUserLevel(int i) {
        this.commerceUserLevel = i;
    }

    public final void setContactName(String str) {
        this.contactName = str;
    }

    public final void setContactNameInitial(String str) {
        this.contactNameInitial = str;
    }

    public final void setContactNamePinyin(String str) {
        this.contactNamePinyin = str;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public final void setEnableDirectMessage(boolean z) {
        this.enableDirectMessage = z;
    }

    public final void setEnterprise(boolean z) {
        this.isEnterprise = z;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setFake(boolean z) {
        this.isFake = z;
    }

    public final void setFakeDataInfo(FakeDataInfo fakeDataInfo) {
        this.fakeDataInfo = fakeDataInfo;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setFollowTime(long j) {
        this.followTime = j;
        this.friendRecTime = j * 1000;
    }

    public final void setFollowerCount(int i) {
        this.followerCount = i;
    }

    public final void setFollowerStatus(int i) {
        this.followerStatus = i;
    }

    public final void setFollowingCount(int i) {
        this.followingCount = i;
    }

    public final void setFriendRecTime(long j) {
        this.friendRecTime = j;
    }

    public final void setFriendRecType(int i) {
        this.friendRecType = i;
    }

    public final void setGroupOwner(boolean z) {
        this.isGroupOwner = z;
    }

    public final void setHasUnreadStory(boolean z) {
        this.hasUnreadStory = z;
    }

    public final void setImUserBizInfo(IMUserBizInfo iMUserBizInfo) {
        this.imUserBizInfo = iMUserBizInfo;
    }

    public final void setInitialLetter(String str) {
        this.initialLetter = str;
    }

    public final void setInternalShareHoldoutVersion(int i) {
        this.internalShareHoldoutVersion = i;
    }

    public final void setMAF(boolean z) {
        this.isMAF = z;
    }

    public final void setMatchedFriend(MatchedFriendStruct matchedFriendStruct) {
        this.matchedFriend = matchedFriendStruct;
    }

    public final void setMentionEnabled(boolean z) {
        this.isMentionEnabled = z;
    }

    public final void setNickNameInitial(String str) {
        this.nickNameInitial = str;
    }

    public final void setNickNamePinyin(String str) {
        this.nickNamePinyin = str;
    }

    @Override // X.InterfaceC1381610m3b
    public void setPrimaryMatchMeta(C1368220li0 c1368220li0) {
        this.primaryMatchMeta = c1368220li0;
    }

    public final void setQaInviteBlockStatus(long j) {
        this.qaInviteBlockStatus = j;
    }

    public final void setQaPrivacyMessage(String str) {
        this.qaPrivacyMessage = str;
    }

    public final void setRecType(String str) {
        this.recType = str;
    }

    public final void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public final void setRemarkInitial(String str) {
        this.remarkInitial = str;
    }

    public final void setRemarkName(String str) {
        this.remarkName = str;
    }

    public final void setRemarkPinyin(String str) {
        this.remarkPinyin = str;
    }

    public final void setSearchIsBusinessAccount(boolean z) {
        this.searchIsBusinessAccount = z;
    }

    public final void setSecret(boolean z) {
        this.isSecret = z;
    }

    public final void setShareLinkRelationIndex(int i) {
        this.shareLinkRelationIndex = i;
    }

    public void setShareStatus(int i) {
        this.shareStatus = i;
    }

    public final void setShortId(String str) {
        this.shortId = str;
    }

    public final void setSignature(String str) {
        this.signature = str;
    }

    public final void setSortWeight(String str) {
        this.sortWeight = str;
    }

    public final void setTaggedBAInvitationStatus(int i) {
        this.taggedBAInvitationStatus = i;
    }

    public final void setTaggedIsBA(boolean z) {
        this.taggedIsBA = z;
    }

    public final void setThirdName(String str) {
        this.thirdName = str;
    }

    public final void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public final void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public final void setUserEnabledQAInvite(Boolean bool) {
        this.isUserEnabledQAInvite = bool;
    }

    public final void setUserNotInAllFriends(boolean z) {
        this.isUserNotInAllFriends = z;
    }

    public final void setVerificationType(int i) {
        this.verificationType = i;
    }

    public final void setVideoMentionBlockStatus(long j) {
        this.videoMentionBlockStatus = j;
    }

    public final void setVideoTagBlockStatus(long j) {
        this.videoTagBlockStatus = j;
    }

    public final void setWeiboVerify(String str) {
        this.weiboVerify = str;
    }

    public final void setWelcomeMsgEnabled(int i) {
        this.welcomeMsgEnabled = i;
    }

    public final void setWithCommerceEntry(boolean z) {
        this.withCommerceEntry = z;
    }
}
