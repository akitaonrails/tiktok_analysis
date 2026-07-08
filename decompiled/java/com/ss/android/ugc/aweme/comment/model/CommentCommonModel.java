package com.ss.android.ugc.aweme.comment.model;

import X.C1349900lES;
import X.C2189821An6;
import X.InterfaceC1350190lEv;
import X.InterfaceC679410Qkt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentCommonModel implements Serializable {
    public final String accountType;
    public final Aweme aweme;
    public boolean blockSortFeatInFriendsV3;
    public final String channelNameForServer;
    public boolean choosePhotoFromInnerPage;
    public String cmtInputPos;
    public boolean commentClose;
    public final boolean commentLimited;
    public final int commentNotice;
    public String commentStickerUniqueId;
    public boolean createAIPhotoFromCommentAnchor;
    public boolean createAIPhotoFromInnerPage;
    public final boolean enableComment;
    public final String enterFrom;
    public final String enterMethod;
    public Comment enterPhotoDetailComment;
    public final String enterPosition;
    public final String eventType;
    public final C2189821An6 feedParam;
    public final boolean forceHideAutoKeyboard;
    public final boolean forceHideBatchManagementView;
    public final boolean forceHideCommentDesc;
    public final boolean forceHideDonation;
    public final boolean forceHidePoi;
    public final boolean forceOpenKeyboard;
    public final boolean fragmentReCreated;
    public String friendsV3TrackScene;
    public final String fromPage;
    public final boolean fromViewPostEntry;
    public final FypExposedCommentMobParams fypExposedCommentMobParams;
    public final String gdLabel;
    public HolidayModel holidayModel;
    public final int inboxNoticeSubType;
    public final int inboxNoticeType;
    public PhotoCacheModel innerChoosePhotoCache;
    public PhotoCacheModel innerCreateAIPhotoCache;
    public final int innerPushType;
    public boolean isFriendsSimpleDetail;
    public boolean isFriendsV3Feed;
    public boolean isInPhotoCommentDetailPage;
    public boolean isLandscapeMode;
    public final Boolean isMyProfile;
    public final boolean isNoPermissionVideoFromCommentHistory;
    public final boolean isPreBind;
    public final boolean isPreCreate;
    public final Boolean isSpiltMode;
    public boolean isVideoMusicTitleDisplayOnFeed;
    public Comment lastViewedPhotoComment;
    public final int locatePageType;
    public boolean navigationBarAutoColorOnHide;
    public final String noticeId;
    public boolean offlineCommentMode;
    public final int pageType;
    public Integer panelSessionCode;
    public boolean postFromInnerPageAddPhoto;
    public Integer reportPanelHeight;
    public final String requestId;
    public int scrollDirection;
    public transient InterfaceC1350190lEv scrollStateChangedListener;
    public final Long sessionId;
    public final boolean shouldShowVideoDesc;
    public final String showCommentPostCid;
    public transient InterfaceC679410Qkt showHeightChangeListener;
    public final boolean smoothScrollLocate;
    public String socialEntrance;
    public final String splitContainerTag;
    public C1349900lES storyCommentPageParam;
    public final String tabName;
    public String tempEnterMethod;
    public String titleClickMethod;
    public Boolean videoDescOnly;
    public int videoDescViewHeight;
    public final String videoFrom;
    public String wordsSource;

    public CommentCommonModel() {
        this(null, null, null, null, null, null, null, false, null, null, null, null, 0, null, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, null, null, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, "", null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false);
    }

    public final CommentCommonModel copy(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, Boolean bool, String str8, Boolean bool2, int i, String str9, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, int i4, int i5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Long l, String str10, int i6, boolean z13, boolean z14, InterfaceC679410Qkt interfaceC679410Qkt, InterfaceC1350190lEv interfaceC1350190lEv, String str11, boolean z15, boolean z16, String str12, FypExposedCommentMobParams fypExposedCommentMobParams, String str13, C2189821An6 c2189821An6, String str14, HolidayModel holidayModel, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, Comment comment, Comment comment2, int i7, PhotoCacheModel photoCacheModel, PhotoCacheModel photoCacheModel2, Integer num, String str15, boolean z22, boolean z23, boolean z24, String str16, C1349900lES c1349900lES, String str17, Boolean bool3, int i8, boolean z25, boolean z26, boolean z27, Integer num2, String str18, String str19, String str20, String str21, boolean z28) {
        return new CommentCommonModel(aweme, str, str2, str3, str4, str5, str6, z, str7, bool, str8, bool2, i, str9, z2, z3, z4, z5, i2, i3, i4, i5, z6, z7, z8, z9, z10, z11, z12, l, str10, i6, z13, z14, interfaceC679410Qkt, interfaceC1350190lEv, str11, z15, z16, str12, fypExposedCommentMobParams, str13, c2189821An6, str14, holidayModel, z17, z18, z19, z20, z21, comment, comment2, i7, photoCacheModel, photoCacheModel2, num, str15, z22, z23, z24, str16, c1349900lES, str17, bool3, i8, z25, z26, z27, num2, str18, str19, str20, str21, z28);
    }

    public final boolean isFriendsSimpleDetail() {
        return this.isFriendsSimpleDetail;
    }

    public final boolean isFriendsV3Feed() {
        return this.isFriendsV3Feed;
    }

    public final boolean isInPhotoCommentDetailPage() {
        return this.isInPhotoCommentDetailPage;
    }

    public final boolean isLandscapeMode() {
        return this.isLandscapeMode;
    }

    public final Boolean isMyProfile() {
        return this.isMyProfile;
    }

    public final boolean isNoPermissionVideoFromCommentHistory() {
        return this.isNoPermissionVideoFromCommentHistory;
    }

    public final boolean isPreBind() {
        return this.isPreBind;
    }

    public final boolean isPreCreate() {
        return this.isPreCreate;
    }

    public final Boolean isSpiltMode() {
        return this.isSpiltMode;
    }

    public final boolean isVideoMusicTitleDisplayOnFeed() {
        return this.isVideoMusicTitleDisplayOnFeed;
    }

    public final void setBlockSortFeatInFriendsV3(boolean z) {
        this.blockSortFeatInFriendsV3 = z;
    }

    public final void setChoosePhotoFromInnerPage(boolean z) {
        this.choosePhotoFromInnerPage = z;
    }

    public final void setCmtInputPos(String str) {
        this.cmtInputPos = str;
    }

    public final void setCommentClose(boolean z) {
        this.commentClose = z;
    }

    public final void setCommentStickerUniqueId(String str) {
        this.commentStickerUniqueId = str;
    }

    public final void setCreateAIPhotoFromCommentAnchor(boolean z) {
        this.createAIPhotoFromCommentAnchor = z;
    }

    public final void setCreateAIPhotoFromInnerPage(boolean z) {
        this.createAIPhotoFromInnerPage = z;
    }

    public final void setEnterPhotoDetailComment(Comment comment) {
        this.enterPhotoDetailComment = comment;
    }

    public final void setFriendsSimpleDetail(boolean z) {
        this.isFriendsSimpleDetail = z;
    }

    public final void setFriendsV3Feed(boolean z) {
        this.isFriendsV3Feed = z;
    }

    public final void setFriendsV3TrackScene(String str) {
        this.friendsV3TrackScene = str;
    }

    public final void setHolidayModel(HolidayModel holidayModel) {
        this.holidayModel = holidayModel;
    }

    public final void setInPhotoCommentDetailPage(boolean z) {
        this.isInPhotoCommentDetailPage = z;
    }

    public final void setInnerChoosePhotoCache(PhotoCacheModel photoCacheModel) {
        this.innerChoosePhotoCache = photoCacheModel;
    }

    public final void setInnerCreateAIPhotoCache(PhotoCacheModel photoCacheModel) {
        this.innerCreateAIPhotoCache = photoCacheModel;
    }

    public final void setLandscapeMode(boolean z) {
        this.isLandscapeMode = z;
    }

    public final void setLastViewedPhotoComment(Comment comment) {
        this.lastViewedPhotoComment = comment;
    }

    public final void setNavigationBarAutoColorOnHide(boolean z) {
        this.navigationBarAutoColorOnHide = z;
    }

    public final void setOfflineCommentMode(boolean z) {
        this.offlineCommentMode = z;
    }

    public final void setPanelSessionCode(Integer num) {
        this.panelSessionCode = num;
    }

    public final void setPostFromInnerPageAddPhoto(boolean z) {
        this.postFromInnerPageAddPhoto = z;
    }

    public final void setReportPanelHeight(Integer num) {
        this.reportPanelHeight = num;
    }

    public final void setScrollDirection(int i) {
        this.scrollDirection = i;
    }

    public final void setScrollStateChangedListener(InterfaceC1350190lEv interfaceC1350190lEv) {
        this.scrollStateChangedListener = interfaceC1350190lEv;
    }

    public final void setShowHeightChangeListener(InterfaceC679410Qkt interfaceC679410Qkt) {
        this.showHeightChangeListener = interfaceC679410Qkt;
    }

    public final void setSocialEntrance(String str) {
        this.socialEntrance = str;
    }

    public final void setStoryCommentPageParam(C1349900lES c1349900lES) {
        this.storyCommentPageParam = c1349900lES;
    }

    public final void setTempEnterMethod(String str) {
        this.tempEnterMethod = str;
    }

    public final void setTitleClickMethod(String str) {
        this.titleClickMethod = str;
    }

    public final void setVideoDescOnly(Boolean bool) {
        this.videoDescOnly = bool;
    }

    public final void setVideoDescViewHeight(int i) {
        this.videoDescViewHeight = i;
    }

    public final void setVideoMusicTitleDisplayOnFeed(boolean z) {
        this.isVideoMusicTitleDisplayOnFeed = z;
    }

    public final void setWordsSource(String str) {
        this.wordsSource = str;
    }

    public CommentCommonModel(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, Boolean bool, String str8, Boolean bool2, int i, String str9, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, int i4, int i5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Long l, String str10, int i6, boolean z13, boolean z14, InterfaceC679410Qkt interfaceC679410Qkt, InterfaceC1350190lEv interfaceC1350190lEv, String str11, boolean z15, boolean z16, String str12, FypExposedCommentMobParams fypExposedCommentMobParams, String str13, C2189821An6 c2189821An6, String str14, HolidayModel holidayModel, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, Comment comment, Comment comment2, int i7, PhotoCacheModel photoCacheModel, PhotoCacheModel photoCacheModel2, Integer num, String str15, boolean z22, boolean z23, boolean z24, String str16, C1349900lES c1349900lES, String str17, Boolean bool3, int i8, boolean z25, boolean z26, boolean z27, Integer num2, String str18, String str19, String str20, String str21, boolean z28) {
        this.aweme = aweme;
        this.requestId = str;
        this.enterFrom = str2;
        this.videoFrom = str3;
        this.enterMethod = str4;
        this.enterPosition = str5;
        this.fromPage = str6;
        this.fromViewPostEntry = z;
        this.eventType = str7;
        this.isMyProfile = bool;
        this.tabName = str8;
        this.isSpiltMode = bool2;
        this.pageType = i;
        this.accountType = str9;
        this.commentClose = z2;
        this.commentLimited = z3;
        this.enableComment = z4;
        this.isLandscapeMode = z5;
        this.commentNotice = i2;
        this.inboxNoticeType = i3;
        this.inboxNoticeSubType = i4;
        this.innerPushType = i5;
        this.forceHideBatchManagementView = z6;
        this.forceOpenKeyboard = z7;
        this.forceHideAutoKeyboard = z8;
        this.forceHideCommentDesc = z9;
        this.shouldShowVideoDesc = z10;
        this.forceHideDonation = z11;
        this.forceHidePoi = z12;
        this.sessionId = l;
        this.splitContainerTag = str10;
        this.locatePageType = i6;
        this.smoothScrollLocate = z13;
        this.isNoPermissionVideoFromCommentHistory = z14;
        this.showHeightChangeListener = interfaceC679410Qkt;
        this.scrollStateChangedListener = interfaceC1350190lEv;
        this.showCommentPostCid = str11;
        this.isPreCreate = z15;
        this.isPreBind = z16;
        this.channelNameForServer = str12;
        this.fypExposedCommentMobParams = fypExposedCommentMobParams;
        this.gdLabel = str13;
        this.feedParam = c2189821An6;
        this.noticeId = str14;
        this.holidayModel = holidayModel;
        this.isInPhotoCommentDetailPage = z17;
        this.choosePhotoFromInnerPage = z18;
        this.createAIPhotoFromInnerPage = z19;
        this.createAIPhotoFromCommentAnchor = z20;
        this.postFromInnerPageAddPhoto = z21;
        this.enterPhotoDetailComment = comment;
        this.lastViewedPhotoComment = comment2;
        this.scrollDirection = i7;
        this.innerChoosePhotoCache = photoCacheModel;
        this.innerCreateAIPhotoCache = photoCacheModel2;
        this.panelSessionCode = num;
        this.tempEnterMethod = str15;
        this.isFriendsSimpleDetail = z22;
        this.isFriendsV3Feed = z23;
        this.blockSortFeatInFriendsV3 = z24;
        this.friendsV3TrackScene = str16;
        this.storyCommentPageParam = c1349900lES;
        this.titleClickMethod = str17;
        this.videoDescOnly = bool3;
        this.videoDescViewHeight = i8;
        this.isVideoMusicTitleDisplayOnFeed = z25;
        this.fragmentReCreated = z26;
        this.navigationBarAutoColorOnHide = z27;
        this.reportPanelHeight = num2;
        this.commentStickerUniqueId = str18;
        this.wordsSource = str19;
        this.socialEntrance = str20;
        this.cmtInputPos = str21;
        this.offlineCommentMode = z28;
    }
}
