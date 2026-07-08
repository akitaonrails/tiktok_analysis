package com.ss.android.ugc.aweme.feed.model;

import X.C0R6I;
import X.C13LE;
import X.C2217371BqR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2753014t;
import X.InterfaceC608270NtR;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbles;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import com.ss.android.ugc.aweme.feed.model.im.IMMediaModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeBizExtKt {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] $$delegatedProperties;
    public static final InterfaceC608270NtR activityId$delegate;
    public static final InterfaceC608270NtR adDescHandle$delegate;
    public static final InterfaceC608270NtR adDescMaxLines$delegate;
    public static final InterfaceC608270NtR anchorCustomData$delegate;
    public static final InterfaceC608270NtR anchorLiveDataBindSuccess$delegate;
    public static final InterfaceC608270NtR anchorWikiOfflineText$delegate;
    public static final InterfaceC608270NtR attachedVibeFeedId$delegate;
    public static final InterfaceC608270NtR awemePosition$delegate;
    public static final InterfaceC608270NtR behindTheSongVideoType$delegate;
    public static final InterfaceC608270NtR cacheAvUploadMiscInfoStruct$delegate;
    public static final InterfaceC608270NtR cacheSourceType$delegate;
    public static final InterfaceC608270NtR cachedLiveRoomStruct$delegate;
    public static final InterfaceC608270NtR captionLength$delegate;
    public static final InterfaceC608270NtR captionReturnCount$delegate;
    public static final InterfaceC608270NtR challengeId$delegate;
    public static final InterfaceC608270NtR clientAcceptanceTime$delegate;
    public static final InterfaceC608270NtR consumeFollowGuide$delegate;
    public static final InterfaceC608270NtR contentDiffType$delegate;
    public static final InterfaceC608270NtR customPayloads$delegate;
    public static final InterfaceC608270NtR descWithHashTagTruncation$delegate;
    public static final InterfaceC608270NtR disableMusicDspFreqCtrl$delegate;
    public static final InterfaceC608270NtR dmSenderUid$delegate;
    public static final InterfaceC608270NtR ellipsizeDesc$delegate;
    public static final InterfaceC608270NtR exploreClientExtra$delegate;
    public static final InterfaceC608270NtR fakeAid$delegate;
    public static final InterfaceC608270NtR fcpStoreSource$delegate;
    public static final InterfaceC608270NtR feedCount$delegate;
    public static final InterfaceC608270NtR feedSource$delegate;
    public static final InterfaceC608270NtR filterDuplicateTime$delegate;
    public static final InterfaceC608270NtR foldedHashTagDesc$delegate;
    public static final InterfaceC608270NtR foldedTextExtra$delegate;
    public static final InterfaceC608270NtR friendsMusicTitleStyle$delegate;
    public static final InterfaceC608270NtR fromRawChallenge$delegate;
    public static final InterfaceC608270NtR gCacheVideoPath$delegate;
    public static final InterfaceC608270NtR hasAd$delegate;
    public static final InterfaceC608270NtR hasCreationIntention$delegate;
    public static final InterfaceC608270NtR hasDisplayLiveNoticeButton$delegate;
    public static final InterfaceC608270NtR hasFriendsTag$delegate;
    public static final InterfaceC608270NtR hotSpot$delegate;
    public static final InterfaceC608270NtR icon$delegate;
    public static final InterfaceC608270NtR identifier$delegate;
    public static final InterfaceC608270NtR ignoreCheckPositionOfPostCard$delegate;
    public static final InterfaceC608270NtR imItemId$delegate;
    public static final InterfaceC608270NtR imMediaModel$delegate;
    public static final InterfaceC608270NtR imMsgId$delegate;
    public static final InterfaceC608270NtR interactionBubbles$delegate;
    public static final InterfaceC608270NtR isAttrUpdated$delegate;
    public static final InterfaceC608270NtR isClientSeen$delegate;
    public static final InterfaceC608270NtR isCommentClicked$delegate;
    public static final InterfaceC608270NtR isDesMoreTextShow$delegate;
    public static final InterfaceC608270NtR isDidZero$delegate;
    public static final InterfaceC608270NtR isEnableVideoSkip$delegate;
    public static final InterfaceC608270NtR isFakeResponse$delegate;
    public static final InterfaceC608270NtR isFeatureVideo$delegate;
    public static final InterfaceC608270NtR isFollowerVideoPresent$delegate;
    public static final InterfaceC608270NtR isForMusicDetailLoading$delegate;
    public static final InterfaceC608270NtR isForwardClicked$delegate;
    public static final InterfaceC608270NtR isFriendVideoPresent$delegate;
    public static final InterfaceC608270NtR isFriendsTabV2FakeAweme$delegate;
    public static final InterfaceC608270NtR isFriendsV2PublishInserted$delegate;
    public static final InterfaceC608270NtR isFriendsVideoUnread$delegate;
    public static final InterfaceC608270NtR isFromTrendingCard$delegate;
    public static final InterfaceC608270NtR isHighlighted$delegate;
    public static final InterfaceC608270NtR isIntextOccludeDesc$delegate;
    public static final InterfaceC608270NtR isIntextOccludeInteraction$delegate;
    public static final InterfaceC608270NtR isIntextOccludeTab$delegate;
    public static final InterfaceC608270NtR isIntextOut$delegate;
    public static final InterfaceC608270NtR isLocalUnpublishedAweme$delegate;
    public static final InterfaceC608270NtR isPhotoSwap$delegate;
    public static final InterfaceC608270NtR isPlaceHolder$delegate;
    public static final InterfaceC608270NtR isPreloadScroll$delegate;
    public static final InterfaceC608270NtR isPublishing$delegate;
    public static final InterfaceC608270NtR isRecBigCardFakeAweme$delegate;
    public static final InterfaceC608270NtR isReferralFakeAweme$delegate;
    public static final InterfaceC608270NtR isStoryFakeAweme$delegate;
    public static final InterfaceC608270NtR isStoryPacked$delegate;
    public static final InterfaceC608270NtR isSubAweme$delegate;
    public static final InterfaceC608270NtR isTemplateDetailPinedTop$delegate;
    public static final InterfaceC608270NtR isTemplateOriginalAweme$delegate;
    public static final InterfaceC608270NtR isUidZero$delegate;
    public static final InterfaceC608270NtR labelOriginAuthorText$delegate;
    public static final InterfaceC608270NtR lawCriticalCountry$delegate;
    public static final InterfaceC608270NtR liveCardLeaveTime$delegate;
    public static final InterfaceC608270NtR liveCardShowTime$delegate;
    public static final InterfaceC608270NtR liveMgCoverShowStyle$delegate;
    public static final InterfaceC608270NtR livePreviewLongPressDisabled$delegate;
    public static final InterfaceC608270NtR livePreviewSize$delegate;
    public static final InterfaceC608270NtR marketDropRule$delegate;
    public static final InterfaceC608270NtR mediaSafetyModel$delegate;
    public static final InterfaceC608270NtR mixFlowParam$delegate;
    public static final InterfaceC608270NtR newRelationLabel$delegate;
    public static final InterfaceC608270NtR newSourceId$delegate;
    public static final InterfaceC608270NtR newSourceType$delegate;
    public static final InterfaceC608270NtR nuTriggerScene$delegate;
    public static final InterfaceC608270NtR offlineUnwatchedCount$delegate;
    public static final InterfaceC608270NtR originalPos$delegate;
    public static final InterfaceC608270NtR photoContentType$delegate;
    public static final InterfaceC608270NtR photoDescTextComponents$delegate;
    public static final InterfaceC608270NtR photoModeTitleLine$delegate;
    public static final InterfaceC608270NtR positionInRequest$delegate;
    public static final InterfaceC608270NtR previewData$delegate;
    public static final InterfaceC608270NtR processedDesc$delegate;
    public static final InterfaceC608270NtR pullType$delegate;
    public static final InterfaceC608270NtR rank$delegate;
    public static final InterfaceC608270NtR realtimeFollowStatus$delegate;
    public static final InterfaceC608270NtR recoverReason$delegate;
    public static final InterfaceC608270NtR referralFakeAwemeType$delegate;
    public static final InterfaceC608270NtR refreshTimeForSharedFeed$delegate;
    public static final InterfaceC608270NtR relevantTime$delegate;
    public static final InterfaceC608270NtR replaceRecTagByRepost$delegate;
    public static final InterfaceC608270NtR repostFromGroupId$delegate;
    public static final InterfaceC608270NtR repostFromUserId$delegate;
    public static final InterfaceC608270NtR repostUser$delegate;
    public static final InterfaceC608270NtR rid$delegate;
    public static final InterfaceC608270NtR scenario$delegate;
    public static final InterfaceC608270NtR scheduleId$delegate;
    public static final InterfaceC608270NtR searchDocOriginLanguage$delegate;
    public static final InterfaceC608270NtR searchDocTranslate$delegate;
    public static final InterfaceC608270NtR searchExtraParams$delegate;
    public static final InterfaceC608270NtR searchFeedType$delegate;
    public static final InterfaceC608270NtR searchLynxLogParams$delegate;
    public static final InterfaceC608270NtR searchTabName$delegate;
    public static final InterfaceC608270NtR searchTabRank$delegate;
    public static final InterfaceC608270NtR serverBaseFcpConfig$delegate;
    public static final InterfaceC608270NtR sessionPosition$delegate;
    public static final InterfaceC608270NtR sessionRequestPosition$delegate;
    public static final InterfaceC608270NtR sharer$delegate;
    public static final InterfaceC608270NtR shopAdStruct$delegate;
    public static final InterfaceC608270NtR simplePromotions$delegate;
    public static final InterfaceC608270NtR slotStrategySnapshot$delegate;
    public static final InterfaceC608270NtR sourceBtmToken$delegate;
    public static final InterfaceC608270NtR subAweme$delegate;
    public static final InterfaceC608270NtR subAwemeCover$delegate;
    public static final InterfaceC608270NtR totalProductAnchors$delegate;
    public static final InterfaceC608270NtR trendingId$delegate;
    public static final InterfaceC608270NtR trendingName$delegate;
    public static final InterfaceC608270NtR userDislike$delegate;
    public static final InterfaceC608270NtR vibeFeedCoverList$delegate;
    public static final InterfaceC608270NtR withSearchSurvey$delegate;

    static {
        final boolean z = true;
        C2217371BqR c2217371BqR = new C2217371BqR(AwemeBizExtKt.class, "totalProductAnchors", "getTotalProductAnchors(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR);
        final int i = 0;
        C2217371BqR c2217371BqR2 = new C2217371BqR(AwemeBizExtKt.class, "exploreClientExtra", "getExploreClientExtra(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/explore/ExploreClientExtra;", 1);
        C13LE.LIZLLL(c2217371BqR2);
        C2217371BqR c2217371BqR3 = new C2217371BqR(AwemeBizExtKt.class, "foldedHashTagDesc", "getFoldedHashTagDesc(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/CharSequence;", 1);
        C13LE.LIZLLL(c2217371BqR3);
        C2217371BqR c2217371BqR4 = new C2217371BqR(AwemeBizExtKt.class, "descWithHashTagTruncation", "getDescWithHashTagTruncation(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR4);
        C2217371BqR c2217371BqR5 = new C2217371BqR(AwemeBizExtKt.class, "photoModeTitleLine", "getPhotoModeTitleLine(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/CharSequence;", 1);
        C13LE.LIZLLL(c2217371BqR5);
        C2217371BqR c2217371BqR6 = new C2217371BqR(AwemeBizExtKt.class, "photoContentType", "getPhotoContentType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR6);
        C2217371BqR c2217371BqR7 = new C2217371BqR(AwemeBizExtKt.class, "photoDescTextComponents", "getPhotoDescTextComponents(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/Object;", 1);
        C13LE.LIZLLL(c2217371BqR7);
        C2217371BqR c2217371BqR8 = new C2217371BqR(AwemeBizExtKt.class, "ellipsizeDesc", "getEllipsizeDesc(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/ref/WeakReference;", 1);
        C13LE.LIZLLL(c2217371BqR8);
        C2217371BqR c2217371BqR9 = new C2217371BqR(AwemeBizExtKt.class, "processedDesc", "getProcessedDesc(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/ref/WeakReference;", 1);
        C13LE.LIZLLL(c2217371BqR9);
        C2217371BqR c2217371BqR10 = new C2217371BqR(AwemeBizExtKt.class, "foldedTextExtra", "getFoldedTextExtra(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/List;", 1);
        C13LE.LIZLLL(c2217371BqR10);
        C2217371BqR c2217371BqR11 = new C2217371BqR(AwemeBizExtKt.class, "serverBaseFcpConfig", "getServerBaseFcpConfig(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/ServerBaseFcpConfig;", 1);
        C13LE.LIZLLL(c2217371BqR11);
        C2217371BqR c2217371BqR12 = new C2217371BqR(AwemeBizExtKt.class, "fcpStoreSource", "getFcpStoreSource(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/bytedance/provider/VSource;", 1);
        C13LE.LIZLLL(c2217371BqR12);
        C2217371BqR c2217371BqR13 = new C2217371BqR(AwemeBizExtKt.class, "slotStrategySnapshot", "getSlotStrategySnapshot(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/Object;", 1);
        C13LE.LIZLLL(c2217371BqR13);
        C2217371BqR c2217371BqR14 = new C2217371BqR(AwemeBizExtKt.class, "cacheAvUploadMiscInfoStruct", "getCacheAvUploadMiscInfoStruct(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/shortvideo/AVUploadMiscInfoStruct;", 1);
        C13LE.LIZLLL(c2217371BqR14);
        C2217371BqR c2217371BqR15 = new C2217371BqR(AwemeBizExtKt.class, "imItemId", "getImItemId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR15);
        C2217371BqR c2217371BqR16 = new C2217371BqR(AwemeBizExtKt.class, "imMsgId", "getImMsgId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR16);
        C2217371BqR c2217371BqR17 = new C2217371BqR(AwemeBizExtKt.class, "imMediaModel", "getImMediaModel(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/im/IMMediaModel;", 1);
        C13LE.LIZLLL(c2217371BqR17);
        C2217371BqR c2217371BqR18 = new C2217371BqR(AwemeBizExtKt.class, "customPayloads", "getCustomPayloads(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/Map;", 1);
        C13LE.LIZLLL(c2217371BqR18);
        C2217371BqR c2217371BqR19 = new C2217371BqR(AwemeBizExtKt.class, "recoverReason", "getRecoverReason(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR19);
        C2217371BqR c2217371BqR20 = new C2217371BqR(AwemeBizExtKt.class, "gCacheVideoPath", "getGCacheVideoPath(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR20);
        C2217371BqR c2217371BqR21 = new C2217371BqR(AwemeBizExtKt.class, "offlineUnwatchedCount", "getOfflineUnwatchedCount(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR21);
        C2217371BqR c2217371BqR22 = new C2217371BqR(AwemeBizExtKt.class, "userDislike", "getUserDislike(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR22);
        C2217371BqR c2217371BqR23 = new C2217371BqR(AwemeBizExtKt.class, "fromRawChallenge", "getFromRawChallenge(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/discover/model/Challenge;", 1);
        C13LE.LIZLLL(c2217371BqR23);
        C2217371BqR c2217371BqR24 = new C2217371BqR(AwemeBizExtKt.class, "scenario", "getScenario(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR24);
        C2217371BqR c2217371BqR25 = new C2217371BqR(AwemeBizExtKt.class, "lawCriticalCountry", "getLawCriticalCountry(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR25);
        C2217371BqR c2217371BqR26 = new C2217371BqR(AwemeBizExtKt.class, "shopAdStruct", "getShopAdStruct(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/commerce/model/ShopAdStruct;", 1);
        C13LE.LIZLLL(c2217371BqR26);
        C2217371BqR c2217371BqR27 = new C2217371BqR(AwemeBizExtKt.class, "simplePromotions", "getSimplePromotions(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/List;", 1);
        C13LE.LIZLLL(c2217371BqR27);
        C2217371BqR c2217371BqR28 = new C2217371BqR(AwemeBizExtKt.class, "isPublishing", "isPublishing(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR28);
        C2217371BqR c2217371BqR29 = new C2217371BqR(AwemeBizExtKt.class, "isLocalUnpublishedAweme", "isLocalUnpublishedAweme(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR29);
        C2217371BqR c2217371BqR30 = new C2217371BqR(AwemeBizExtKt.class, "ignoreCheckPositionOfPostCard", "getIgnoreCheckPositionOfPostCard(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR30);
        C2217371BqR c2217371BqR31 = new C2217371BqR(AwemeBizExtKt.class, "isPhotoSwap", "isPhotoSwap(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR31);
        C2217371BqR c2217371BqR32 = new C2217371BqR(AwemeBizExtKt.class, "hotSpot", "getHotSpot(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR32);
        C2217371BqR c2217371BqR33 = new C2217371BqR(AwemeBizExtKt.class, "sourceBtmToken", "getSourceBtmToken(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR33);
        C2217371BqR c2217371BqR34 = new C2217371BqR(AwemeBizExtKt.class, "marketDropRule", "getMarketDropRule(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR34);
        C2217371BqR c2217371BqR35 = new C2217371BqR(AwemeBizExtKt.class, "isClientSeen", "isClientSeen(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR35);
        C2217371BqR c2217371BqR36 = new C2217371BqR(AwemeBizExtKt.class, "contentDiffType", "getContentDiffType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR36);
        C2217371BqR c2217371BqR37 = new C2217371BqR(AwemeBizExtKt.class, "isDesMoreTextShow", "isDesMoreTextShow(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR37);
        C2217371BqR c2217371BqR38 = new C2217371BqR(AwemeBizExtKt.class, "anchorLiveDataBindSuccess", "getAnchorLiveDataBindSuccess(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR38);
        C2217371BqR c2217371BqR39 = new C2217371BqR(AwemeBizExtKt.class, "vibeFeedCoverList", "getVibeFeedCoverList(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/List;", 1);
        C13LE.LIZLLL(c2217371BqR39);
        C2217371BqR c2217371BqR40 = new C2217371BqR(AwemeBizExtKt.class, "attachedVibeFeedId", "getAttachedVibeFeedId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR40);
        C2217371BqR c2217371BqR41 = new C2217371BqR(AwemeBizExtKt.class, "refreshTimeForSharedFeed", "getRefreshTimeForSharedFeed(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR41);
        C2217371BqR c2217371BqR42 = new C2217371BqR(AwemeBizExtKt.class, "hasAd", "getHasAd(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR42);
        C2217371BqR c2217371BqR43 = new C2217371BqR(AwemeBizExtKt.class, "isPreloadScroll", "isPreloadScroll(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR43);
        C2217371BqR c2217371BqR44 = new C2217371BqR(AwemeBizExtKt.class, "isCommentClicked", "isCommentClicked(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR44);
        C2217371BqR c2217371BqR45 = new C2217371BqR(AwemeBizExtKt.class, "isForwardClicked", "isForwardClicked(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR45);
        C2217371BqR c2217371BqR46 = new C2217371BqR(AwemeBizExtKt.class, "adDescMaxLines", "getAdDescMaxLines(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR46);
        C2217371BqR c2217371BqR47 = new C2217371BqR(AwemeBizExtKt.class, "adDescHandle", "getAdDescHandle(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR47);
        C2217371BqR c2217371BqR48 = new C2217371BqR(AwemeBizExtKt.class, "isFakeResponse", "isFakeResponse(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR48);
        C2217371BqR c2217371BqR49 = new C2217371BqR(AwemeBizExtKt.class, "isStoryFakeAweme", "isStoryFakeAweme(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR49);
        C2217371BqR c2217371BqR50 = new C2217371BqR(AwemeBizExtKt.class, "isFriendsTabV2FakeAweme", "isFriendsTabV2FakeAweme(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR50);
        C2217371BqR c2217371BqR51 = new C2217371BqR(AwemeBizExtKt.class, "isFriendsV2PublishInserted", "isFriendsV2PublishInserted(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR51);
        C2217371BqR c2217371BqR52 = new C2217371BqR(AwemeBizExtKt.class, "hasFriendsTag", "getHasFriendsTag(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR52);
        C2217371BqR c2217371BqR53 = new C2217371BqR(AwemeBizExtKt.class, "isRecBigCardFakeAweme", "isRecBigCardFakeAweme(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR53);
        C2217371BqR c2217371BqR54 = new C2217371BqR(AwemeBizExtKt.class, "scheduleId", "getScheduleId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR54);
        C2217371BqR c2217371BqR55 = new C2217371BqR(AwemeBizExtKt.class, "isReferralFakeAweme", "isReferralFakeAweme(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR55);
        C2217371BqR c2217371BqR56 = new C2217371BqR(AwemeBizExtKt.class, "referralFakeAwemeType", "getReferralFakeAwemeType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR56);
        C2217371BqR c2217371BqR57 = new C2217371BqR(AwemeBizExtKt.class, "liveMgCoverShowStyle", "getLiveMgCoverShowStyle(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR57);
        C2217371BqR c2217371BqR58 = new C2217371BqR(AwemeBizExtKt.class, "repostFromGroupId", "getRepostFromGroupId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR58);
        C2217371BqR c2217371BqR59 = new C2217371BqR(AwemeBizExtKt.class, "repostFromUserId", "getRepostFromUserId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR59);
        C2217371BqR c2217371BqR60 = new C2217371BqR(AwemeBizExtKt.class, "filterDuplicateTime", "getFilterDuplicateTime(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)J", 1);
        C13LE.LIZLLL(c2217371BqR60);
        C2217371BqR c2217371BqR61 = new C2217371BqR(AwemeBizExtKt.class, "liveCardShowTime", "getLiveCardShowTime(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)J", 1);
        C13LE.LIZLLL(c2217371BqR61);
        C2217371BqR c2217371BqR62 = new C2217371BqR(AwemeBizExtKt.class, "liveCardLeaveTime", "getLiveCardLeaveTime(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)J", 1);
        C13LE.LIZLLL(c2217371BqR62);
        C2217371BqR c2217371BqR63 = new C2217371BqR(AwemeBizExtKt.class, "labelOriginAuthorText", "getLabelOriginAuthorText(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR63);
        C2217371BqR c2217371BqR64 = new C2217371BqR(AwemeBizExtKt.class, "originalPos", "getOriginalPos(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR64);
        C2217371BqR c2217371BqR65 = new C2217371BqR(AwemeBizExtKt.class, "feedCount", "getFeedCount(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)J", 1);
        C13LE.LIZLLL(c2217371BqR65);
        C2217371BqR c2217371BqR66 = new C2217371BqR(AwemeBizExtKt.class, "pullType", "getPullType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR66);
        C2217371BqR c2217371BqR67 = new C2217371BqR(AwemeBizExtKt.class, "activityId", "getActivityId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR67);
        C2217371BqR c2217371BqR68 = new C2217371BqR(AwemeBizExtKt.class, "newSourceType", "getNewSourceType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR68);
        C2217371BqR c2217371BqR69 = new C2217371BqR(AwemeBizExtKt.class, "newSourceId", "getNewSourceId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR69);
        C2217371BqR c2217371BqR70 = new C2217371BqR(AwemeBizExtKt.class, "withSearchSurvey", "getWithSearchSurvey(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR70);
        C2217371BqR c2217371BqR71 = new C2217371BqR(AwemeBizExtKt.class, "isEnableVideoSkip", "isEnableVideoSkip(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR71);
        C2217371BqR c2217371BqR72 = new C2217371BqR(AwemeBizExtKt.class, "relevantTime", "getRelevantTime(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/List;", 1);
        C13LE.LIZLLL(c2217371BqR72);
        C2217371BqR c2217371BqR73 = new C2217371BqR(AwemeBizExtKt.class, "anchorWikiOfflineText", "getAnchorWikiOfflineText(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR73);
        C2217371BqR c2217371BqR74 = new C2217371BqR(AwemeBizExtKt.class, "searchDocOriginLanguage", "getSearchDocOriginLanguage(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR74);
        C2217371BqR c2217371BqR75 = new C2217371BqR(AwemeBizExtKt.class, "searchDocTranslate", "getSearchDocTranslate(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR75);
        C2217371BqR c2217371BqR76 = new C2217371BqR(AwemeBizExtKt.class, "newRelationLabel", "getNewRelationLabel(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/List;", 1);
        C13LE.LIZLLL(c2217371BqR76);
        C2217371BqR c2217371BqR77 = new C2217371BqR(AwemeBizExtKt.class, "isFromTrendingCard", "isFromTrendingCard(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR77);
        C2217371BqR c2217371BqR78 = new C2217371BqR(AwemeBizExtKt.class, "rank", "getRank(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR78);
        C2217371BqR c2217371BqR79 = new C2217371BqR(AwemeBizExtKt.class, "trendingId", "getTrendingId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR79);
        C2217371BqR c2217371BqR80 = new C2217371BqR(AwemeBizExtKt.class, "trendingName", "getTrendingName(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR80);
        C2217371BqR c2217371BqR81 = new C2217371BqR(AwemeBizExtKt.class, "isStoryPacked", "isStoryPacked(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR81);
        C2217371BqR c2217371BqR82 = new C2217371BqR(AwemeBizExtKt.class, "awemePosition", "getAwemePosition(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR82);
        C2217371BqR c2217371BqR83 = new C2217371BqR(AwemeBizExtKt.class, "isPlaceHolder", "isPlaceHolder(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR83);
        C2217371BqR c2217371BqR84 = new C2217371BqR(AwemeBizExtKt.class, "cacheSourceType", "getCacheSourceType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR84);
        C2217371BqR c2217371BqR85 = new C2217371BqR(AwemeBizExtKt.class, "friendsMusicTitleStyle", "getFriendsMusicTitleStyle(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR85);
        C2217371BqR c2217371BqR86 = new C2217371BqR(AwemeBizExtKt.class, "feedSource", "getFeedSource(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR86);
        C2217371BqR c2217371BqR87 = new C2217371BqR(AwemeBizExtKt.class, "dmSenderUid", "getDmSenderUid(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR87);
        C2217371BqR c2217371BqR88 = new C2217371BqR(AwemeBizExtKt.class, "nuTriggerScene", "getNuTriggerScene(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR88);
        C2217371BqR c2217371BqR89 = new C2217371BqR(AwemeBizExtKt.class, "isTemplateDetailPinedTop", "isTemplateDetailPinedTop(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR89);
        C2217371BqR c2217371BqR90 = new C2217371BqR(AwemeBizExtKt.class, "isTemplateOriginalAweme", "isTemplateOriginalAweme(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR90);
        C2217371BqR c2217371BqR91 = new C2217371BqR(AwemeBizExtKt.class, "isFriendVideoPresent", "isFriendVideoPresent(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR91);
        C2217371BqR c2217371BqR92 = new C2217371BqR(AwemeBizExtKt.class, "isFollowerVideoPresent", "isFollowerVideoPresent(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR92);
        C2217371BqR c2217371BqR93 = new C2217371BqR(AwemeBizExtKt.class, "isUidZero", "isUidZero(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR93);
        C2217371BqR c2217371BqR94 = new C2217371BqR(AwemeBizExtKt.class, "isDidZero", "isDidZero(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR94);
        C2217371BqR c2217371BqR95 = new C2217371BqR(AwemeBizExtKt.class, "isAttrUpdated", "isAttrUpdated(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR95);
        C2217371BqR c2217371BqR96 = new C2217371BqR(AwemeBizExtKt.class, "replaceRecTagByRepost", "getReplaceRecTagByRepost(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR96);
        C2217371BqR c2217371BqR97 = new C2217371BqR(AwemeBizExtKt.class, "disableMusicDspFreqCtrl", "getDisableMusicDspFreqCtrl(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR97);
        C2217371BqR c2217371BqR98 = new C2217371BqR(AwemeBizExtKt.class, "hasCreationIntention", "getHasCreationIntention(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR98);
        C2217371BqR c2217371BqR99 = new C2217371BqR(AwemeBizExtKt.class, "challengeId", "getChallengeId(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR99);
        C2217371BqR c2217371BqR100 = new C2217371BqR(AwemeBizExtKt.class, "fakeAid", "getFakeAid(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR100);
        C2217371BqR c2217371BqR101 = new C2217371BqR(AwemeBizExtKt.class, "clientAcceptanceTime", "getClientAcceptanceTime(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)J", 1);
        C13LE.LIZLLL(c2217371BqR101);
        C2217371BqR c2217371BqR102 = new C2217371BqR(AwemeBizExtKt.class, "positionInRequest", "getPositionInRequest(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR102);
        C2217371BqR c2217371BqR103 = new C2217371BqR(AwemeBizExtKt.class, "sessionRequestPosition", "getSessionRequestPosition(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR103);
        C2217371BqR c2217371BqR104 = new C2217371BqR(AwemeBizExtKt.class, "isIntextOccludeTab", "isIntextOccludeTab(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR104);
        C2217371BqR c2217371BqR105 = new C2217371BqR(AwemeBizExtKt.class, "isIntextOccludeInteraction", "isIntextOccludeInteraction(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR105);
        C2217371BqR c2217371BqR106 = new C2217371BqR(AwemeBizExtKt.class, "isIntextOut", "isIntextOut(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR106);
        C2217371BqR c2217371BqR107 = new C2217371BqR(AwemeBizExtKt.class, "isIntextOccludeDesc", "isIntextOccludeDesc(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR107);
        C2217371BqR c2217371BqR108 = new C2217371BqR(AwemeBizExtKt.class, "mediaSafetyModel", "getMediaSafetyModel(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/im/service/model/MediaSafetyModel;", 1);
        C13LE.LIZLLL(c2217371BqR108);
        C2217371BqR c2217371BqR109 = new C2217371BqR(AwemeBizExtKt.class, "sharer", "getSharer(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/profile/model/User;", 1);
        C13LE.LIZLLL(c2217371BqR109);
        C2217371BqR c2217371BqR110 = new C2217371BqR(AwemeBizExtKt.class, "repostUser", "getRepostUser(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/profile/model/User;", 1);
        C13LE.LIZLLL(c2217371BqR110);
        C2217371BqR c2217371BqR111 = new C2217371BqR(AwemeBizExtKt.class, "previewData", "getPreviewData(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/publish/PublishPreviewInfo;", 1);
        C13LE.LIZLLL(c2217371BqR111);
        C2217371BqR c2217371BqR112 = new C2217371BqR(AwemeBizExtKt.class, "icon", "getIcon(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/base/model/UrlModel;", 1);
        C13LE.LIZLLL(c2217371BqR112);
        C2217371BqR c2217371BqR113 = new C2217371BqR(AwemeBizExtKt.class, "behindTheSongVideoType", "getBehindTheSongVideoType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR113);
        C2217371BqR c2217371BqR114 = new C2217371BqR(AwemeBizExtKt.class, "isFriendsVideoUnread", "isFriendsVideoUnread(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR114);
        C2217371BqR c2217371BqR115 = new C2217371BqR(AwemeBizExtKt.class, "sessionPosition", "getSessionPosition(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR115);
        C2217371BqR c2217371BqR116 = new C2217371BqR(AwemeBizExtKt.class, "isForMusicDetailLoading", "isForMusicDetailLoading(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR116);
        C2217371BqR c2217371BqR117 = new C2217371BqR(AwemeBizExtKt.class, "livePreviewLongPressDisabled", "getLivePreviewLongPressDisabled(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR117);
        C2217371BqR c2217371BqR118 = new C2217371BqR(AwemeBizExtKt.class, "isFeatureVideo", "isFeatureVideo(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/VideoType;", 1);
        C13LE.LIZLLL(c2217371BqR118);
        C2217371BqR c2217371BqR119 = new C2217371BqR(AwemeBizExtKt.class, "livePreviewSize", "getLivePreviewSize(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)[Ljava/lang/Integer;", 1);
        C13LE.LIZLLL(c2217371BqR119);
        C2217371BqR c2217371BqR120 = new C2217371BqR(AwemeBizExtKt.class, "rid", "getRid(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR120);
        C2217371BqR c2217371BqR121 = new C2217371BqR(AwemeBizExtKt.class, "searchTabRank", "getSearchTabRank(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/Integer;", 1);
        C13LE.LIZLLL(c2217371BqR121);
        C2217371BqR c2217371BqR122 = new C2217371BqR(AwemeBizExtKt.class, "searchTabName", "getSearchTabName(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR122);
        C2217371BqR c2217371BqR123 = new C2217371BqR(AwemeBizExtKt.class, "searchFeedType", "getSearchFeedType(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/lang/String;", 1);
        C13LE.LIZLLL(c2217371BqR123);
        C2217371BqR c2217371BqR124 = new C2217371BqR(AwemeBizExtKt.class, "mixFlowParam", "getMixFlowParam(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/MixFlowParam;", 1);
        C13LE.LIZLLL(c2217371BqR124);
        C2217371BqR c2217371BqR125 = new C2217371BqR(AwemeBizExtKt.class, "isHighlighted", "isHighlighted(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR125);
        C2217371BqR c2217371BqR126 = new C2217371BqR(AwemeBizExtKt.class, "subAwemeCover", "getSubAwemeCover(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/base/model/UrlModel;", 1);
        C13LE.LIZLLL(c2217371BqR126);
        C2217371BqR c2217371BqR127 = new C2217371BqR(AwemeBizExtKt.class, "isSubAweme", "isSubAweme(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR127);
        C2217371BqR c2217371BqR128 = new C2217371BqR(AwemeBizExtKt.class, "hasDisplayLiveNoticeButton", "getHasDisplayLiveNoticeButton(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR128);
        C2217371BqR c2217371BqR129 = new C2217371BqR(AwemeBizExtKt.class, "captionReturnCount", "getCaptionReturnCount(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR129);
        C2217371BqR c2217371BqR130 = new C2217371BqR(AwemeBizExtKt.class, "captionLength", "getCaptionLength(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR130);
        C2217371BqR c2217371BqR131 = new C2217371BqR(AwemeBizExtKt.class, "anchorCustomData", "getAnchorCustomData(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/AnchorCustomData;", 1);
        C13LE.LIZLLL(c2217371BqR131);
        C2217371BqR c2217371BqR132 = new C2217371BqR(AwemeBizExtKt.class, "subAweme", "getSubAweme(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/Aweme;", 1);
        C13LE.LIZLLL(c2217371BqR132);
        C2217371BqR c2217371BqR133 = new C2217371BqR(AwemeBizExtKt.class, "cachedLiveRoomStruct", "getCachedLiveRoomStruct(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/feed/model/live/LiveRoomStruct;", 1);
        C13LE.LIZLLL(c2217371BqR133);
        C2217371BqR c2217371BqR134 = new C2217371BqR(AwemeBizExtKt.class, "interactionBubbles", "getInteractionBubbles(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/ss/android/ugc/aweme/comment/model/InteractionBubbles;", 1);
        C13LE.LIZLLL(c2217371BqR134);
        C2217371BqR c2217371BqR135 = new C2217371BqR(AwemeBizExtKt.class, "searchExtraParams", "getSearchExtraParams(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/HashMap;", 1);
        C13LE.LIZLLL(c2217371BqR135);
        C2217371BqR c2217371BqR136 = new C2217371BqR(AwemeBizExtKt.class, "identifier", "getIdentifier(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/Map;", 1);
        C13LE.LIZLLL(c2217371BqR136);
        C2217371BqR c2217371BqR137 = new C2217371BqR(AwemeBizExtKt.class, "searchLynxLogParams", "getSearchLynxLogParams(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Ljava/util/Map;", 1);
        C13LE.LIZLLL(c2217371BqR137);
        C2217371BqR c2217371BqR138 = new C2217371BqR(AwemeBizExtKt.class, "realtimeFollowStatus", "getRealtimeFollowStatus(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)I", 1);
        C13LE.LIZLLL(c2217371BqR138);
        C2217371BqR c2217371BqR139 = new C2217371BqR(AwemeBizExtKt.class, "consumeFollowGuide", "getConsumeFollowGuide(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Z", 1);
        C13LE.LIZLLL(c2217371BqR139);
        $$delegatedProperties = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3, c2217371BqR4, c2217371BqR5, c2217371BqR6, c2217371BqR7, c2217371BqR8, c2217371BqR9, c2217371BqR10, c2217371BqR11, c2217371BqR12, c2217371BqR13, c2217371BqR14, c2217371BqR15, c2217371BqR16, c2217371BqR17, c2217371BqR18, c2217371BqR19, c2217371BqR20, c2217371BqR21, c2217371BqR22, c2217371BqR23, c2217371BqR24, c2217371BqR25, c2217371BqR26, c2217371BqR27, c2217371BqR28, c2217371BqR29, c2217371BqR30, c2217371BqR31, c2217371BqR32, c2217371BqR33, c2217371BqR34, c2217371BqR35, c2217371BqR36, c2217371BqR37, c2217371BqR38, c2217371BqR39, c2217371BqR40, c2217371BqR41, c2217371BqR42, c2217371BqR43, c2217371BqR44, c2217371BqR45, c2217371BqR46, c2217371BqR47, c2217371BqR48, c2217371BqR49, c2217371BqR50, c2217371BqR51, c2217371BqR52, c2217371BqR53, c2217371BqR54, c2217371BqR55, c2217371BqR56, c2217371BqR57, c2217371BqR58, c2217371BqR59, c2217371BqR60, c2217371BqR61, c2217371BqR62, c2217371BqR63, c2217371BqR64, c2217371BqR65, c2217371BqR66, c2217371BqR67, c2217371BqR68, c2217371BqR69, c2217371BqR70, c2217371BqR71, c2217371BqR72, c2217371BqR73, c2217371BqR74, c2217371BqR75, c2217371BqR76, c2217371BqR77, c2217371BqR78, c2217371BqR79, c2217371BqR80, c2217371BqR81, c2217371BqR82, c2217371BqR83, c2217371BqR84, c2217371BqR85, c2217371BqR86, c2217371BqR87, c2217371BqR88, c2217371BqR89, c2217371BqR90, c2217371BqR91, c2217371BqR92, c2217371BqR93, c2217371BqR94, c2217371BqR95, c2217371BqR96, c2217371BqR97, c2217371BqR98, c2217371BqR99, c2217371BqR100, c2217371BqR101, c2217371BqR102, c2217371BqR103, c2217371BqR104, c2217371BqR105, c2217371BqR106, c2217371BqR107, c2217371BqR108, c2217371BqR109, c2217371BqR110, c2217371BqR111, c2217371BqR112, c2217371BqR113, c2217371BqR114, c2217371BqR115, c2217371BqR116, c2217371BqR117, c2217371BqR118, c2217371BqR119, c2217371BqR120, c2217371BqR121, c2217371BqR122, c2217371BqR123, c2217371BqR124, c2217371BqR125, c2217371BqR126, c2217371BqR127, c2217371BqR128, c2217371BqR129, c2217371BqR130, c2217371BqR131, c2217371BqR132, c2217371BqR133, c2217371BqR134, c2217371BqR135, c2217371BqR136, c2217371BqR137, c2217371BqR138, c2217371BqR139};
        final String str = "totalProductAnchors";
        final boolean z2 = false;
        totalProductAnchors$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str, new AwemeBizData(z2, z2, z2, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str2 = "exploreClientExtra";
        final boolean z3 = true;
        final boolean z4 = false;
        exploreClientExtra$delegate = new InterfaceC608270NtR<Aweme, ExploreClientExtra>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$1
            /* JADX WARN: Multi-variable type inference failed */
            public ExploreClientExtra getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ExploreClientExtra exploreClientExtra;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str2);
                if (awemeBizData != null) {
                    exploreClientExtra = awemeBizData.fieldData;
                } else {
                    exploreClientExtra = 0;
                }
                if (!(exploreClientExtra instanceof ExploreClientExtra)) {
                    return null;
                }
                return exploreClientExtra;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, ExploreClientExtra exploreClientExtra) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str2, new AwemeBizData(z, z2, z2, exploreClientExtra));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, ExploreClientExtra exploreClientExtra) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, exploreClientExtra);
            }
        };
        final String str3 = "foldedHashTagDesc";
        foldedHashTagDesc$delegate = new InterfaceC608270NtR<Aweme, CharSequence>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public CharSequence getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str3);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof CharSequence)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, CharSequence charSequence) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str3, new AwemeBizData(z, z4, z4, charSequence));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, CharSequence charSequence) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, charSequence);
            }
        };
        final String str4 = "descWithHashTagTruncation";
        final boolean z5 = false;
        descWithHashTagTruncation$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$3
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str5;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str4);
                if (awemeBizData != null) {
                    str5 = awemeBizData.fieldData;
                } else {
                    str5 = 0;
                }
                if (!(str5 instanceof String)) {
                    return null;
                }
                return str5;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str5) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str4, new AwemeBizData(z4, z4, z4, str5));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str5) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str5);
            }
        };
        final String str5 = "photoModeTitleLine";
        final boolean z6 = true;
        final boolean z7 = false;
        photoModeTitleLine$delegate = new InterfaceC608270NtR<Aweme, CharSequence>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$4
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public CharSequence getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str5);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof CharSequence)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, CharSequence charSequence) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str5, new AwemeBizData(z4, z4, z4, charSequence));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, CharSequence charSequence) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, charSequence);
            }
        };
        final String str6 = "photoContentType";
        photoContentType$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$5
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str7;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str6);
                if (awemeBizData != null) {
                    str7 = awemeBizData.fieldData;
                } else {
                    str7 = 0;
                }
                if (!(str7 instanceof String)) {
                    return null;
                }
                return str7;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str7) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str6, new AwemeBizData(z4, z4, z4, str7));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str7) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str7);
            }
        };
        final String str7 = "photoDescTextComponents";
        photoDescTextComponents$delegate = new InterfaceC608270NtR<Aweme, Object>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$6
            public Object getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                Object obj;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str7);
                if (awemeBizData != null) {
                    obj = awemeBizData.fieldData;
                } else {
                    obj = null;
                }
                if (!(obj instanceof Object)) {
                    return null;
                }
                return obj;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
            public void setValue2(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Object obj) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str7, new AwemeBizData(z4, z4, z4, obj));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj) {
                setValue2(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, obj);
            }
        };
        final String str8 = "ellipsizeDesc";
        ellipsizeDesc$delegate = new InterfaceC608270NtR<Aweme, WeakReference<CharSequence>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.ref.WeakReference<java.lang.CharSequence>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public WeakReference<CharSequence> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str8);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof WeakReference)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, WeakReference<CharSequence> weakReference) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str8, new AwemeBizData(z4, z4, z4, weakReference));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, WeakReference<CharSequence> weakReference) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, weakReference);
            }
        };
        final String str9 = "processedDesc";
        processedDesc$delegate = new InterfaceC608270NtR<Aweme, WeakReference<CharSequence>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$8
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.ref.WeakReference<java.lang.CharSequence>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public WeakReference<CharSequence> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str9);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof WeakReference)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, WeakReference<CharSequence> weakReference) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str9, new AwemeBizData(z4, z4, z4, weakReference));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, WeakReference<CharSequence> weakReference) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, weakReference);
            }
        };
        final String str10 = "foldedTextExtra";
        foldedTextExtra$delegate = new InterfaceC608270NtR<Aweme, List<? extends TextExtraStruct>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$9
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public List<? extends TextExtraStruct> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str10);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof List)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, List<? extends TextExtraStruct> list) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str10, new AwemeBizData(z, z4, z4, list));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, List<? extends TextExtraStruct> list) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, list);
            }
        };
        final String str11 = "serverBaseFcpConfig";
        serverBaseFcpConfig$delegate = new InterfaceC608270NtR<Aweme, ServerBaseFcpConfig>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$10
            /* JADX WARN: Multi-variable type inference failed */
            public ServerBaseFcpConfig getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ServerBaseFcpConfig serverBaseFcpConfig;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str11);
                if (awemeBizData != null) {
                    serverBaseFcpConfig = awemeBizData.fieldData;
                } else {
                    serverBaseFcpConfig = 0;
                }
                if (!(serverBaseFcpConfig instanceof ServerBaseFcpConfig)) {
                    return null;
                }
                return serverBaseFcpConfig;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, ServerBaseFcpConfig serverBaseFcpConfig) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str11, new AwemeBizData(z4, z4, z4, serverBaseFcpConfig));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, ServerBaseFcpConfig serverBaseFcpConfig) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, serverBaseFcpConfig);
            }
        };
        final String str12 = "fcpStoreSource";
        fcpStoreSource$delegate = new InterfaceC608270NtR<Aweme, InterfaceC2753014t>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$11
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [X.014t] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public InterfaceC2753014t getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str12);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof InterfaceC2753014t)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, InterfaceC2753014t interfaceC2753014t) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str12, new AwemeBizData(z4, z4, z4, interfaceC2753014t));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, InterfaceC2753014t interfaceC2753014t) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, interfaceC2753014t);
            }
        };
        final String str13 = "slotStrategySnapshot";
        slotStrategySnapshot$delegate = new InterfaceC608270NtR<Aweme, Object>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$12
            public Object getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                Object obj;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str13);
                if (awemeBizData != null) {
                    obj = awemeBizData.fieldData;
                } else {
                    obj = null;
                }
                if (!(obj instanceof Object)) {
                    return null;
                }
                return obj;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
            public void setValue2(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Object obj) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str13, new AwemeBizData(z4, z4, z4, obj));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj) {
                setValue2(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, obj);
            }
        };
        final String str14 = "cacheAvUploadMiscInfoStruct";
        cacheAvUploadMiscInfoStruct$delegate = new InterfaceC608270NtR<Aweme, AVUploadMiscInfoStruct>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$13
            /* JADX WARN: Multi-variable type inference failed */
            public AVUploadMiscInfoStruct getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                AVUploadMiscInfoStruct aVUploadMiscInfoStruct;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str14);
                if (awemeBizData != null) {
                    aVUploadMiscInfoStruct = awemeBizData.fieldData;
                } else {
                    aVUploadMiscInfoStruct = 0;
                }
                if (!(aVUploadMiscInfoStruct instanceof AVUploadMiscInfoStruct)) {
                    return null;
                }
                return aVUploadMiscInfoStruct;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, AVUploadMiscInfoStruct aVUploadMiscInfoStruct) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str14, new AwemeBizData(z4, z4, z4, aVUploadMiscInfoStruct));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, AVUploadMiscInfoStruct aVUploadMiscInfoStruct) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, aVUploadMiscInfoStruct);
            }
        };
        final String str15 = "imItemId";
        imItemId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$14
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str16;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str15);
                if (awemeBizData != null) {
                    str16 = awemeBizData.fieldData;
                } else {
                    str16 = 0;
                }
                if (!(str16 instanceof String)) {
                    return null;
                }
                return str16;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str16) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str15, new AwemeBizData(z4, z4, z4, str16));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str16) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str16);
            }
        };
        final String str16 = "imMsgId";
        imMsgId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$15
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str17;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str16);
                if (awemeBizData != null) {
                    str17 = awemeBizData.fieldData;
                } else {
                    str17 = 0;
                }
                if (!(str17 instanceof String)) {
                    return null;
                }
                return str17;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str17) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str16, new AwemeBizData(z4, z4, z4, str17));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str17) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str17);
            }
        };
        final String str17 = "imMediaModel";
        imMediaModel$delegate = new InterfaceC608270NtR<Aweme, IMMediaModel>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$16
            /* JADX WARN: Multi-variable type inference failed */
            public IMMediaModel getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                IMMediaModel iMMediaModel;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str17);
                if (awemeBizData != null) {
                    iMMediaModel = awemeBizData.fieldData;
                } else {
                    iMMediaModel = 0;
                }
                if (!(iMMediaModel instanceof IMMediaModel)) {
                    return null;
                }
                return iMMediaModel;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, IMMediaModel iMMediaModel) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str17, new AwemeBizData(z4, z4, z4, iMMediaModel));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, IMMediaModel iMMediaModel) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, iMMediaModel);
            }
        };
        final String str18 = "customPayloads";
        customPayloads$delegate = new InterfaceC608270NtR<Aweme, Map<String, Object>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$17
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.String, java.lang.Object>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public Map<String, Object> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str18);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof Map)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Map<String, Object> map) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str18, new AwemeBizData(z, z4, z4, map));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Map<String, Object> map) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, map);
            }
        };
        final String str19 = "recoverReason";
        recoverReason$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$18
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str20;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str19);
                if (awemeBizData != null) {
                    str20 = awemeBizData.fieldData;
                } else {
                    str20 = 0;
                }
                if (!(str20 instanceof String)) {
                    return null;
                }
                return str20;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str20) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str19, new AwemeBizData(z4, z4, z4, str20));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str20) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str20);
            }
        };
        final String str20 = "gCacheVideoPath";
        gCacheVideoPath$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$19
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str21;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str20);
                if (awemeBizData != null) {
                    str21 = awemeBizData.fieldData;
                } else {
                    str21 = 0;
                }
                if (!(str21 instanceof String)) {
                    return null;
                }
                return str21;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str21) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str20, new AwemeBizData(z4, z4, z4, str21));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str21) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str21);
            }
        };
        final String str21 = "offlineUnwatchedCount";
        offlineUnwatchedCount$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str21);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str21, new AwemeBizData(z4, z4, z4, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str22 = "user_dislike";
        userDislike$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$3
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str22);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str22, new AwemeBizData(z4, z4, z4, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str23 = "fromRawChallenge";
        fromRawChallenge$delegate = new InterfaceC608270NtR<Aweme, Challenge>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$20
            /* JADX WARN: Multi-variable type inference failed */
            public Challenge getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                Challenge challenge;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str23);
                if (awemeBizData != null) {
                    challenge = awemeBizData.fieldData;
                } else {
                    challenge = 0;
                }
                if (!(challenge instanceof Challenge)) {
                    return null;
                }
                return challenge;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Challenge challenge) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str23, new AwemeBizData(z4, z4, z4, challenge));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Challenge challenge) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, challenge);
            }
        };
        final String str24 = "scenario";
        scenario$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$4
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str24);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str24, new AwemeBizData(z3, z4, z4, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str25 = "law_critical_country";
        final Boolean bool = Boolean.FALSE;
        lawCriticalCountry$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$5
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str25);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str25, new AwemeBizData(z3, z4, z4, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str26 = "shop_ad_struct";
        shopAdStruct$delegate = new InterfaceC608270NtR<Aweme, ShopAdStruct>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$21
            /* JADX WARN: Multi-variable type inference failed */
            public ShopAdStruct getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ShopAdStruct shopAdStruct;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str26);
                if (awemeBizData != null) {
                    shopAdStruct = awemeBizData.fieldData;
                } else {
                    shopAdStruct = 0;
                }
                if (!(shopAdStruct instanceof ShopAdStruct)) {
                    return null;
                }
                return shopAdStruct;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, ShopAdStruct shopAdStruct) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str26, new AwemeBizData(z4, z4, z4, shopAdStruct));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, ShopAdStruct shopAdStruct) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, shopAdStruct);
            }
        };
        final String str27 = "simplePromotions";
        simplePromotions$delegate = new InterfaceC608270NtR<Aweme, List<? extends SimplePromotion>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$22
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<? extends com.ss.android.ugc.aweme.commerce.model.SimplePromotion>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public List<? extends SimplePromotion> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str27);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof List)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, List<? extends SimplePromotion> list) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str27, new AwemeBizData(z6, z4, z6, list));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, List<? extends SimplePromotion> list) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, list);
            }
        };
        final String str28 = "is_publishing";
        isPublishing$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$6
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str28);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str28, new AwemeBizData(z4, z4, z4, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str29 = "is_local_aweme";
        isLocalUnpublishedAweme$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$7
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str29);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str29, new AwemeBizData(z4, z4, z4, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str30 = "ignoreCheckPositionOfPostCard";
        ignoreCheckPositionOfPostCard$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$8
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str30);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str30, new AwemeBizData(z4, z4, z4, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str31 = "isPhotoSwap";
        isPhotoSwap$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$9
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str31);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str31, new AwemeBizData(z4, z4, z4, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str32 = "hotSpot";
        hotSpot$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$23
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str33;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str32);
                if (awemeBizData != null) {
                    str33 = awemeBizData.fieldData;
                } else {
                    str33 = 0;
                }
                if (!(str33 instanceof String)) {
                    return null;
                }
                return str33;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str33) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str32, new AwemeBizData(z4, z4, z4, str33));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str33) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str33);
            }
        };
        final String str33 = "sourceBtmToken";
        sourceBtmToken$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$24
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str34;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str33);
                if (awemeBizData != null) {
                    str34 = awemeBizData.fieldData;
                } else {
                    str34 = 0;
                }
                if (!(str34 instanceof String)) {
                    return null;
                }
                return str34;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str34) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str33, new AwemeBizData(z4, z4, z4, str34));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str34) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str34);
            }
        };
        final String str34 = "marketDropRule";
        marketDropRule$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$25
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str35;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str34);
                if (awemeBizData != null) {
                    str35 = awemeBizData.fieldData;
                } else {
                    str35 = 0;
                }
                if (!(str35 instanceof String)) {
                    return null;
                }
                return str35;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str35) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str34, new AwemeBizData(z4, z4, z4, str35));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str35) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str35);
            }
        };
        final String str35 = "isClientSeen";
        isClientSeen$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$10
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str35);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str35, new AwemeBizData(z6, z4, z4, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str36 = "contentDiffType";
        contentDiffType$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$26
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str37;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str36);
                if (awemeBizData != null) {
                    str37 = awemeBizData.fieldData;
                } else {
                    str37 = 0;
                }
                if (!(str37 instanceof String)) {
                    return null;
                }
                return str37;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str37) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str36, new AwemeBizData(z6, z4, z4, str37));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str37) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str37);
            }
        };
        final String str37 = "isDesMoreTextShow";
        isDesMoreTextShow$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$11
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str37);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str37, new AwemeBizData(z4, z4, z4, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str38 = "anchorLiveDataBindSuccess";
        anchorLiveDataBindSuccess$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$12
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str38);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str38, new AwemeBizData(z4, z4, z4, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str39 = "vibeFeedCoverList";
        vibeFeedCoverList$delegate = new InterfaceC608270NtR<Aweme, List<? extends UrlModel>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$27
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public List<? extends UrlModel> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str39);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof List)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, List<? extends UrlModel> list) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str39, new AwemeBizData(z4, z4, z4, list));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, List<? extends UrlModel> list) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, list);
            }
        };
        final String str40 = "attachedVibeFeedId";
        attachedVibeFeedId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$28
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str41;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str40);
                if (awemeBizData != null) {
                    str41 = awemeBizData.fieldData;
                } else {
                    str41 = 0;
                }
                if (!(str41 instanceof String)) {
                    return null;
                }
                return str41;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str41) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str40, new AwemeBizData(z4, z4, z4, str41));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str41) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str41);
            }
        };
        final String str41 = "refreshTimeForSharedFeed";
        refreshTimeForSharedFeed$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$29
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str42;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str41);
                if (awemeBizData != null) {
                    str42 = awemeBizData.fieldData;
                } else {
                    str42 = 0;
                }
                if (!(str42 instanceof String)) {
                    return null;
                }
                return str42;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str42) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str41, new AwemeBizData(z4, z4, z4, str42));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str42) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str42);
            }
        };
        final String str42 = "hasAd";
        hasAd$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$13
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str42);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z4) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str42, new AwemeBizData(z6, z4, z4, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str43 = "isPreloadScroll";
        isPreloadScroll$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$14
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str43);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str43, new AwemeBizData(z6, z5, z5, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str44 = "isCommentClicked";
        isCommentClicked$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$15
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str44);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str44, new AwemeBizData(z6, z5, z5, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str45 = "isForwardClicked";
        isForwardClicked$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$16
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str45);
                Boolean bool2 = 0;
                if (awemeBizData != null) {
                    bool2 = awemeBizData.fieldData;
                }
                if (!(bool2 instanceof Boolean) || bool2 == 0) {
                    return bool;
                }
                return bool2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str45, new AwemeBizData(z6, z5, z5, bool2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool2);
            }
        };
        final String str46 = "adDescMaxLines";
        final int i2 = 4;
        adDescMaxLines$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$17
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str46);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i2;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str46, new AwemeBizData(z6, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str47 = "adDescHandle";
        final Boolean bool2 = Boolean.TRUE;
        adDescHandle$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$18
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str47);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool2;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str47, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str48 = "isFakeResponse";
        isFakeResponse$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$19
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str48);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str48, new AwemeBizData(z6, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str49 = "isStoryFakeAweme";
        isStoryFakeAweme$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$20
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str49);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str49, new AwemeBizData(z6, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str50 = "isFriendsTabV2FakeAweme";
        isFriendsTabV2FakeAweme$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$21
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str50);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str50, new AwemeBizData(z6, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str51 = "isFriendsV2PublishInserted";
        isFriendsV2PublishInserted$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$22
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str51);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str51, new AwemeBizData(z6, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str52 = "hasFriendsTag";
        hasFriendsTag$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$23
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str52);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str52, new AwemeBizData(z6, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str53 = "isRecBigCardFakeAweme";
        isRecBigCardFakeAweme$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$24
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str53);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str53, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str54 = "scheduleId";
        scheduleId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$30
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str55;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str54);
                if (awemeBizData != null) {
                    str55 = awemeBizData.fieldData;
                } else {
                    str55 = 0;
                }
                if (!(str55 instanceof String)) {
                    return null;
                }
                return str55;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str55) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str54, new AwemeBizData(z6, z5, z5, str55));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str55) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str55);
            }
        };
        final String str55 = "isReferralFakeAweme";
        isReferralFakeAweme$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$25
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str55);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str55, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str56 = "referralFakeAwemeType";
        referralFakeAwemeType$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$26
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str56);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str56, new AwemeBizData(z5, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str57 = "liveMgCoverShowStyle";
        liveMgCoverShowStyle$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$27
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str57);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str57, new AwemeBizData(z5, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str58 = "repostFromGroupId";
        repostFromGroupId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$31
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str59;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str58);
                if (awemeBizData != null) {
                    str59 = awemeBizData.fieldData;
                } else {
                    str59 = 0;
                }
                if (!(str59 instanceof String)) {
                    return null;
                }
                return str59;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str59) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str58, new AwemeBizData(z6, z5, z5, str59));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str59) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str59);
            }
        };
        final String str59 = "repostFromUserId";
        repostFromUserId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$32
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str60;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str59);
                if (awemeBizData != null) {
                    str60 = awemeBizData.fieldData;
                } else {
                    str60 = 0;
                }
                if (!(str60 instanceof String)) {
                    return null;
                }
                return str60;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str60) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str59, new AwemeBizData(z6, z5, z5, str60));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str60) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str60);
            }
        };
        final String str60 = "filterDuplicateTime";
        final long j = 0L;
        filterDuplicateTime$delegate = new InterfaceC608270NtR<Aweme, Long>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$28
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long, java.lang.Object] */
            public Long getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str60);
                Long l = 0;
                if (awemeBizData != null) {
                    l = awemeBizData.fieldData;
                }
                if (!(l instanceof Long) || l == 0) {
                    return j;
                }
                return l;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Long l) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str60, new AwemeBizData(z6, z5, z5, l));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Long l) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, l);
            }
        };
        final String str61 = "liveCardShowTime";
        final long j2 = -1L;
        liveCardShowTime$delegate = new InterfaceC608270NtR<Aweme, Long>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$29
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long, java.lang.Object] */
            public Long getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str61);
                Long l = 0;
                if (awemeBizData != null) {
                    l = awemeBizData.fieldData;
                }
                if (!(l instanceof Long) || l == 0) {
                    return j2;
                }
                return l;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Long l) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str61, new AwemeBizData(z6, z5, z5, l));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Long l) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, l);
            }
        };
        final String str62 = "liveCardLeaveTime";
        liveCardLeaveTime$delegate = new InterfaceC608270NtR<Aweme, Long>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$30
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long, java.lang.Object] */
            public Long getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str62);
                Long l = 0;
                if (awemeBizData != null) {
                    l = awemeBizData.fieldData;
                }
                if (!(l instanceof Long) || l == 0) {
                    return j2;
                }
                return l;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Long l) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str62, new AwemeBizData(z6, z5, z5, l));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Long l) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, l);
            }
        };
        final String str63 = "label_origin_author_text";
        labelOriginAuthorText$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$33
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str64;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str63);
                if (awemeBizData != null) {
                    str64 = awemeBizData.fieldData;
                } else {
                    str64 = 0;
                }
                if (!(str64 instanceof String)) {
                    return null;
                }
                return str64;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str64) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str63, new AwemeBizData(z6, z5, z5, str64));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str64) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str64);
            }
        };
        final String str64 = "originalPos";
        originalPos$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$31
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str64);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str64, new AwemeBizData(z6, z5, z6, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str65 = "feedCount";
        feedCount$delegate = new InterfaceC608270NtR<Aweme, Long>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$32
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long, java.lang.Object] */
            public Long getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str65);
                Long l = 0;
                if (awemeBizData != null) {
                    l = awemeBizData.fieldData;
                }
                if (!(l instanceof Long) || l == 0) {
                    return j;
                }
                return l;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Long l) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str65, new AwemeBizData(z6, z5, z5, l));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Long l) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, l);
            }
        };
        final String str66 = "pullType";
        final int i3 = -1;
        pullType$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$33
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str66);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i3;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str66, new AwemeBizData(z5, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str67 = "activity_id";
        activityId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$34
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str68;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str67);
                if (awemeBizData != null) {
                    str68 = awemeBizData.fieldData;
                } else {
                    str68 = 0;
                }
                if (!(str68 instanceof String)) {
                    return null;
                }
                return str68;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str68) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str67, new AwemeBizData(z5, z5, z5, str68));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str68) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str68);
            }
        };
        final String str68 = "new_source_type";
        newSourceType$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$35
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str69;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str68);
                if (awemeBizData != null) {
                    str69 = awemeBizData.fieldData;
                } else {
                    str69 = 0;
                }
                if (!(str69 instanceof String)) {
                    return null;
                }
                return str69;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str69) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str68, new AwemeBizData(z5, z5, z5, str69));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str69) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str69);
            }
        };
        final String str69 = "new_source_id";
        newSourceId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$36
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str70;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str69);
                if (awemeBizData != null) {
                    str70 = awemeBizData.fieldData;
                } else {
                    str70 = 0;
                }
                if (!(str70 instanceof String)) {
                    return null;
                }
                return str70;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str70) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str69, new AwemeBizData(z5, z5, z5, str70));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str70) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str70);
            }
        };
        final String str70 = "withSearchSurvey";
        withSearchSurvey$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$34
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str70);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str70, new AwemeBizData(z6, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str71 = "isEnableVideoSkip";
        isEnableVideoSkip$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$35
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str71);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str71, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str72 = "relevantTime";
        relevantTime$delegate = new InterfaceC608270NtR<Aweme, List<? extends Float>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$37
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<? extends java.lang.Float>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public List<? extends Float> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str72);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof List)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, List<? extends Float> list) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str72, new AwemeBizData(z5, z5, z5, list));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, List<? extends Float> list) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, list);
            }
        };
        final String str73 = "anchorWikiOfflineText";
        final String str74 = "";
        anchorWikiOfflineText$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$36
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.String] */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str73);
                String str75 = 0;
                if (awemeBizData != null) {
                    str75 = awemeBizData.fieldData;
                }
                if (!(str75 instanceof String) || str75 == 0) {
                    return str74;
                }
                return str75;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str75) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str73, new AwemeBizData(z6, z5, z5, str75));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str75) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str75);
            }
        };
        final String str75 = "searchDocOriginLanguage";
        searchDocOriginLanguage$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$38
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str76;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str75);
                if (awemeBizData != null) {
                    str76 = awemeBizData.fieldData;
                } else {
                    str76 = 0;
                }
                if (!(str76 instanceof String)) {
                    return null;
                }
                return str76;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str76) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str75, new AwemeBizData(z5, z5, z5, str76));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str76) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str76);
            }
        };
        final String str76 = "searchDocTranslate";
        searchDocTranslate$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$39
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str77;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str76);
                if (awemeBizData != null) {
                    str77 = awemeBizData.fieldData;
                } else {
                    str77 = 0;
                }
                if (!(str77 instanceof String)) {
                    return null;
                }
                return str77;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str77) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str76, new AwemeBizData(z5, z5, z5, str77));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str77) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str77);
            }
        };
        final String str77 = "new_relation_label";
        newRelationLabel$delegate = new InterfaceC608270NtR<Aweme, List<? extends RelationLabelNew>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<? extends com.ss.android.ugc.aweme.feed.model.RelationLabelNew>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public List<? extends RelationLabelNew> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str77);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof List)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, List<? extends RelationLabelNew> list) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str77, new AwemeBizData(z5, z5, z5, list));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, List<? extends RelationLabelNew> list) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, list);
            }
        };
        final String str78 = "isFromTrendingCard";
        final String str79 = "";
        isFromTrendingCard$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$37
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.String] */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str78);
                String str80 = 0;
                if (awemeBizData != null) {
                    str80 = awemeBizData.fieldData;
                }
                if (!(str80 instanceof String) || str80 == 0) {
                    return str79;
                }
                return str80;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str80) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str78, new AwemeBizData(z5, z5, z5, str80));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str80) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str80);
            }
        };
        final String str80 = "mRank";
        rank$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$38
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str80);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i3;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str80, new AwemeBizData(z5, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str81 = "trendingId";
        final String str82 = "";
        trendingId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$39
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.String] */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str81);
                String str83 = 0;
                if (awemeBizData != null) {
                    str83 = awemeBizData.fieldData;
                }
                if (!(str83 instanceof String) || str83 == 0) {
                    return str82;
                }
                return str83;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str83) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str81, new AwemeBizData(z5, z5, z5, str83));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str83) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str83);
            }
        };
        final String str83 = "trendingName";
        final String str84 = "";
        trendingName$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$40
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.String] */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str83);
                String str85 = 0;
                if (awemeBizData != null) {
                    str85 = awemeBizData.fieldData;
                }
                if (!(str85 instanceof String) || str85 == 0) {
                    return str84;
                }
                return str85;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str85) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str83, new AwemeBizData(z5, z5, z5, str85));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str85) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str85);
            }
        };
        final String str85 = "isStoryPacked";
        isStoryPacked$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$41
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str85);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str85, new AwemeBizData(z6, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str86 = "awemePosition";
        awemePosition$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$42
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str86);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i3;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str86, new AwemeBizData(z6, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str87 = "isPlaceHolder";
        isPlaceHolder$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$43
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str87);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str87, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str88 = "cacheSourceType";
        cacheSourceType$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$44
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str88);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i3;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str88, new AwemeBizData(z5, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str89 = "friends_music_title_style";
        friendsMusicTitleStyle$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$45
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str89);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i3;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str89, new AwemeBizData(z6, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str90 = "feedSource";
        feedSource$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$46
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str90);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str90, new AwemeBizData(z6, z5, z6, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str91 = "dmSenderUid";
        dmSenderUid$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$41
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str92;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str91);
                if (awemeBizData != null) {
                    str92 = awemeBizData.fieldData;
                } else {
                    str92 = 0;
                }
                if (!(str92 instanceof String)) {
                    return null;
                }
                return str92;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str92) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str91, new AwemeBizData(z5, z5, z5, str92));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str92) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str92);
            }
        };
        final String str92 = "nuTriggerScene";
        nuTriggerScene$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$42
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str93;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str92);
                if (awemeBizData != null) {
                    str93 = awemeBizData.fieldData;
                } else {
                    str93 = 0;
                }
                if (!(str93 instanceof String)) {
                    return null;
                }
                return str93;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str93) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str92, new AwemeBizData(z6, z5, z5, str93));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str93) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str93);
            }
        };
        final String str93 = "isTemplateDetailPinedTop";
        isTemplateDetailPinedTop$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$47
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str93);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str93, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str94 = "isTemplateOriginalAweme";
        isTemplateOriginalAweme$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$48
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str94);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str94, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str95 = "isFriendVideoPresent";
        isFriendVideoPresent$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$49
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str95);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str95, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str96 = "isFollowerVideoPresent";
        isFollowerVideoPresent$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$50
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str96);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str96, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str97 = "isUidZero";
        isUidZero$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$51
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str97);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str97, new AwemeBizData(z6, z5, z6, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str98 = "isDidZero";
        isDidZero$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$52
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str98);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str98, new AwemeBizData(z6, z5, z6, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str99 = "isAttrUpdated";
        isAttrUpdated$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$53
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str99);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str99, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str100 = "replaceRecTagByRepost";
        replaceRecTagByRepost$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$54
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str100);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str100, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str101 = "disableMusicDspFreqCtrl";
        disableMusicDspFreqCtrl$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$55
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str101);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str101, new AwemeBizData(z5, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str102 = "hasCreationIntention";
        hasCreationIntention$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$56
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str102);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str102, new AwemeBizData(z6, z5, z5, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str103 = "challengeId";
        challengeId$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$43
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str104;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str103);
                if (awemeBizData != null) {
                    str104 = awemeBizData.fieldData;
                } else {
                    str104 = 0;
                }
                if (!(str104 instanceof String)) {
                    return null;
                }
                return str104;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str104) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str103, new AwemeBizData(z5, z5, z5, str104));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str104) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str104);
            }
        };
        final String str104 = "fakeAid";
        fakeAid$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$44
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str105;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str104);
                if (awemeBizData != null) {
                    str105 = awemeBizData.fieldData;
                } else {
                    str105 = 0;
                }
                if (!(str105 instanceof String)) {
                    return null;
                }
                return str105;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str105) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str104, new AwemeBizData(z5, z5, z5, str105));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str105) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str105);
            }
        };
        final String str105 = "clientAcceptanceTime";
        clientAcceptanceTime$delegate = new InterfaceC608270NtR<Aweme, Long>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$57
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Long, java.lang.Object] */
            public Long getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str105);
                Long l = 0;
                if (awemeBizData != null) {
                    l = awemeBizData.fieldData;
                }
                if (!(l instanceof Long) || l == 0) {
                    return j2;
                }
                return l;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Long l) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str105, new AwemeBizData(z6, z5, z5, l));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Long l) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, l);
            }
        };
        final String str106 = "positionInRequest";
        final boolean z8 = true;
        positionInRequest$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$58
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str106);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i3;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str106, new AwemeBizData(z6, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str107 = "sessionRequestPosition";
        sessionRequestPosition$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$59
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str107);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i3;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str107, new AwemeBizData(z6, z5, z5, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str108 = "is_intext_occlude_tab";
        isIntextOccludeTab$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$45
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str109;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str108);
                if (awemeBizData != null) {
                    str109 = awemeBizData.fieldData;
                } else {
                    str109 = 0;
                }
                if (!(str109 instanceof String)) {
                    return null;
                }
                return str109;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str109) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str108, new AwemeBizData(z6, z5, z5, str109));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str109) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str109);
            }
        };
        final String str109 = "is_intext_occlude_interaction";
        isIntextOccludeInteraction$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$46
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str110;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str109);
                if (awemeBizData != null) {
                    str110 = awemeBizData.fieldData;
                } else {
                    str110 = 0;
                }
                if (!(str110 instanceof String)) {
                    return null;
                }
                return str110;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str110) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z5) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str109, new AwemeBizData(z6, z5, z5, str110));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str110) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str110);
            }
        };
        final String str110 = "is_intext_out";
        isIntextOut$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$47
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str111;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str110);
                if (awemeBizData != null) {
                    str111 = awemeBizData.fieldData;
                } else {
                    str111 = 0;
                }
                if (!(str111 instanceof String)) {
                    return null;
                }
                return str111;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str111) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str110, new AwemeBizData(z8, z7, z7, str111));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str111) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str111);
            }
        };
        final String str111 = "is_intext_occlude_desc";
        isIntextOccludeDesc$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$48
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str112;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str111);
                if (awemeBizData != null) {
                    str112 = awemeBizData.fieldData;
                } else {
                    str112 = 0;
                }
                if (!(str112 instanceof String)) {
                    return null;
                }
                return str112;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str112) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str111, new AwemeBizData(z8, z7, z7, str112));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str112) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str112);
            }
        };
        final String str112 = "mediaSafetyModel";
        mediaSafetyModel$delegate = new InterfaceC608270NtR<Aweme, C0R6I>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$49
            /* JADX WARN: Multi-variable type inference failed */
            public C0R6I getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                C0R6I c0r6i;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str112);
                if (awemeBizData != null) {
                    c0r6i = awemeBizData.fieldData;
                } else {
                    c0r6i = 0;
                }
                if (!(c0r6i instanceof C0R6I)) {
                    return null;
                }
                return c0r6i;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, C0R6I c0r6i) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str112, new AwemeBizData(z8, z8, z7, c0r6i));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, C0R6I c0r6i) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, c0r6i);
            }
        };
        final String str113 = "sharer";
        sharer$delegate = new InterfaceC608270NtR<Aweme, User>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$50
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.model.User] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public User getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str113);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof User)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, User user) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str113, new AwemeBizData(z8, z7, z7, user));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, User user) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, user);
            }
        };
        final String str114 = "repostUser";
        repostUser$delegate = new InterfaceC608270NtR<Aweme, User>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$51
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.model.User] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public User getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str114);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof User)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, User user) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str114, new AwemeBizData(z7, z7, z7, user));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, User user) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, user);
            }
        };
        final String str115 = "previewData";
        previewData$delegate = new InterfaceC608270NtR<Aweme, PublishPreviewInfo>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$52
            /* JADX WARN: Multi-variable type inference failed */
            public PublishPreviewInfo getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                PublishPreviewInfo publishPreviewInfo;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str115);
                if (awemeBizData != null) {
                    publishPreviewInfo = awemeBizData.fieldData;
                } else {
                    publishPreviewInfo = 0;
                }
                if (!(publishPreviewInfo instanceof PublishPreviewInfo)) {
                    return null;
                }
                return publishPreviewInfo;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, PublishPreviewInfo publishPreviewInfo) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str115, new AwemeBizData(z7, z7, z7, publishPreviewInfo));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, PublishPreviewInfo publishPreviewInfo) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, publishPreviewInfo);
            }
        };
        final String str116 = "icon";
        icon$delegate = new InterfaceC608270NtR<Aweme, UrlModel>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$53
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.base.model.UrlModel] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public UrlModel getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str116);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof UrlModel)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, UrlModel urlModel) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str116, new AwemeBizData(z7, z7, z7, urlModel));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, UrlModel urlModel) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, urlModel);
            }
        };
        final String str117 = "behindTheSongVideoType";
        behindTheSongVideoType$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$60
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str117);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str117, new AwemeBizData(z7, z7, z7, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str118 = "isFriendsVideoUnread";
        isFriendsVideoUnread$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$61
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str118);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str118, new AwemeBizData(z7, z7, z7, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str119 = "sessionPosition";
        sessionPosition$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$62
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str119);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i3;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str119, new AwemeBizData(z7, z7, z7, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str120 = "isForMusicDetailLoading";
        isForMusicDetailLoading$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$63
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str120);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str120, new AwemeBizData(z7, z7, z7, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str121 = "livePreviewLongPressDisabled";
        livePreviewLongPressDisabled$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$64
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str121);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str121, new AwemeBizData(z7, z7, z7, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str122 = "is_feature_video";
        final VideoType videoType = VideoType.DEFAULT;
        isFeatureVideo$delegate = new InterfaceC608270NtR<Aweme, VideoType>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$65
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [com.ss.android.ugc.aweme.feed.model.VideoType, java.lang.Object] */
            public VideoType getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str122);
                VideoType videoType2 = 0;
                if (awemeBizData != null) {
                    videoType2 = awemeBizData.fieldData;
                }
                if (!(videoType2 instanceof VideoType) || videoType2 == 0) {
                    return videoType;
                }
                return videoType2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, VideoType videoType2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str122, new AwemeBizData(z7, z7, z7, videoType2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, VideoType videoType2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, videoType2);
            }
        };
        final String str123 = "livePreviewSize";
        livePreviewSize$delegate = new InterfaceC608270NtR<Aweme, Integer[]>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$54
            /* JADX WARN: Multi-variable type inference failed */
            public Integer[] getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                Integer[] numArr;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str123);
                if (awemeBizData != null) {
                    numArr = awemeBizData.fieldData;
                } else {
                    numArr = 0;
                }
                if (!(numArr instanceof Integer[])) {
                    return null;
                }
                return numArr;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer[] numArr) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str123, new AwemeBizData(z7, z7, z7, numArr));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer[] numArr) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, numArr);
            }
        };
        final String str124 = "rid";
        rid$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$55
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str125;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str124);
                if (awemeBizData != null) {
                    str125 = awemeBizData.fieldData;
                } else {
                    str125 = 0;
                }
                if (!(str125 instanceof String)) {
                    return null;
                }
                return str125;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str125) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str124, new AwemeBizData(z7, z7, z7, str125));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str125) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str125);
            }
        };
        final String str125 = "SearchTabRank";
        searchTabRank$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$56
            /* JADX WARN: Multi-variable type inference failed */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                Integer num;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str125);
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                } else {
                    num = 0;
                }
                if (!(num instanceof Integer)) {
                    return null;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str125, new AwemeBizData(z7, z7, z7, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str126 = "searchTabName";
        searchTabName$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$57
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str127;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str126);
                if (awemeBizData != null) {
                    str127 = awemeBizData.fieldData;
                } else {
                    str127 = 0;
                }
                if (!(str127 instanceof String)) {
                    return null;
                }
                return str127;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str127) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str126, new AwemeBizData(z7, z7, z7, str127));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str127) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str127);
            }
        };
        final String str127 = "searchFeedType";
        searchFeedType$delegate = new InterfaceC608270NtR<Aweme, String>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$58
            /* JADX WARN: Multi-variable type inference failed */
            public String getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                String str128;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str127);
                if (awemeBizData != null) {
                    str128 = awemeBizData.fieldData;
                } else {
                    str128 = 0;
                }
                if (!(str128 instanceof String)) {
                    return null;
                }
                return str128;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, String str128) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str127, new AwemeBizData(z7, z7, z7, str128));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, String str128) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, str128);
            }
        };
        final String str128 = "mixFlowParam";
        mixFlowParam$delegate = new InterfaceC608270NtR<Aweme, MixFlowParam>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$59
            /* JADX WARN: Multi-variable type inference failed */
            public MixFlowParam getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                MixFlowParam mixFlowParam;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str128);
                if (awemeBizData != null) {
                    mixFlowParam = awemeBizData.fieldData;
                } else {
                    mixFlowParam = 0;
                }
                if (!(mixFlowParam instanceof MixFlowParam)) {
                    return null;
                }
                return mixFlowParam;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, MixFlowParam mixFlowParam) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str128, new AwemeBizData(z7, z7, z7, mixFlowParam));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, MixFlowParam mixFlowParam) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, mixFlowParam);
            }
        };
        final String str129 = "isHighlighted";
        isHighlighted$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$66
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str129);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str129, new AwemeBizData(z7, z7, z7, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str130 = "subAwemeCover";
        subAwemeCover$delegate = new InterfaceC608270NtR<Aweme, UrlModel>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$60
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.base.model.UrlModel] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public UrlModel getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str130);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof UrlModel)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, UrlModel urlModel) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str130, new AwemeBizData(z7, z7, z7, urlModel));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, UrlModel urlModel) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, urlModel);
            }
        };
        final String str131 = "isSubAweme";
        isSubAweme$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$67
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str131);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str131, new AwemeBizData(z7, z7, z7, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str132 = "hasDisplayLiveNoticeButton";
        hasDisplayLiveNoticeButton$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$68
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str132);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str132, new AwemeBizData(z7, z7, z7, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
        final String str133 = "captionReturnCount";
        captionReturnCount$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$69
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str133);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str133, new AwemeBizData(z7, z7, z7, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str134 = "captionLength";
        captionLength$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$70
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str134);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str134, new AwemeBizData(z7, z7, z7, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str135 = "anchorCustomData";
        anchorCustomData$delegate = new InterfaceC608270NtR<Aweme, AnchorCustomData>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$61
            /* JADX WARN: Multi-variable type inference failed */
            public AnchorCustomData getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                AnchorCustomData anchorCustomData;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str135);
                if (awemeBizData != null) {
                    anchorCustomData = awemeBizData.fieldData;
                } else {
                    anchorCustomData = 0;
                }
                if (!(anchorCustomData instanceof AnchorCustomData)) {
                    return null;
                }
                return anchorCustomData;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, AnchorCustomData anchorCustomData) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str135, new AwemeBizData(z7, z7, z7, anchorCustomData));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, AnchorCustomData anchorCustomData) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, anchorCustomData);
            }
        };
        final String str136 = "subAweme";
        subAweme$delegate = new InterfaceC608270NtR<Aweme, Aweme>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$62
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public Aweme getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str136);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof Aweme)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Aweme aweme2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str136, new AwemeBizData(z7, z7, z7, aweme2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Aweme aweme2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, aweme2);
            }
        };
        final String str137 = "cachedLiveRoomStruct";
        cachedLiveRoomStruct$delegate = new InterfaceC608270NtR<Aweme, LiveRoomStruct>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$63
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public LiveRoomStruct getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str137);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof LiveRoomStruct)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, LiveRoomStruct liveRoomStruct) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str137, new AwemeBizData(z7, z7, z7, liveRoomStruct));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, LiveRoomStruct liveRoomStruct) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, liveRoomStruct);
            }
        };
        final String str138 = "interactionBubbles";
        final InteractionBubbles interactionBubbles = new InteractionBubbles(null, 0L, null, false, 0L, 0L, InteractionBubbleCacheState.NO_CACHE);
        interactionBubbles$delegate = new InterfaceC608270NtR<Aweme, InteractionBubbles>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$71
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [com.ss.android.ugc.aweme.comment.model.InteractionBubbles, java.lang.Object] */
            public InteractionBubbles getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str138);
                InteractionBubbles interactionBubbles2 = 0;
                if (awemeBizData != null) {
                    interactionBubbles2 = awemeBizData.fieldData;
                }
                if (!(interactionBubbles2 instanceof InteractionBubbles) || interactionBubbles2 == 0) {
                    return interactionBubbles;
                }
                return interactionBubbles2;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, InteractionBubbles interactionBubbles2) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str138, new AwemeBizData(z7, z7, z7, interactionBubbles2));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, InteractionBubbles interactionBubbles2) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, interactionBubbles2);
            }
        };
        final String str139 = "searchExtraParams";
        searchExtraParams$delegate = new InterfaceC608270NtR<Aweme, HashMap<String, String>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$64
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap<java.lang.String, java.lang.String>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public HashMap<String, String> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str139);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof HashMap)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, HashMap<String, String> map) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str139, new AwemeBizData(z7, z7, z7, map));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, HashMap<String, String> map) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, map);
            }
        };
        final String str140 = "identifier";
        identifier$delegate = new InterfaceC608270NtR<Aweme, Map<String, ? extends String>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$65
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public Map<String, ? extends String> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str140);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof Map)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Map<String, ? extends String> map) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str140, new AwemeBizData(z7, z7, z7, map));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Map<String, ? extends String> map) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, map);
            }
        };
        final String str141 = "searchLynxLogParams";
        searchLynxLogParams$delegate = new InterfaceC608270NtR<Aweme, Map<String, ? extends String>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNullable$66
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.String, ? extends java.lang.String>] */
            /* JADX WARN: Type inference failed for: r1v6 */
            public Map<String, ? extends String> getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                ?? r1;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str141);
                if (awemeBizData != null) {
                    r1 = awemeBizData.fieldData;
                } else {
                    r1 = 0;
                }
                if (!(r1 instanceof Map)) {
                    return null;
                }
                return r1;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Map<String, ? extends String> map) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str141, new AwemeBizData(z7, z7, z7, map));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Map<String, ? extends String> map) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, map);
            }
        };
        final String str142 = "realtimeFollowStatus";
        final int i4 = -3;
        realtimeFollowStatus$delegate = new InterfaceC608270NtR<Aweme, Integer>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$72
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, java.lang.Object] */
            public Integer getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str142);
                Integer num = 0;
                if (awemeBizData != null) {
                    num = awemeBizData.fieldData;
                }
                if (!(num instanceof Integer) || num == 0) {
                    return i4;
                }
                return num;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Integer num) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str142, new AwemeBizData(z7, z7, z7, num));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Integer num) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, num);
            }
        };
        final String str143 = "consumeFollowGuide";
        consumeFollowGuide$delegate = new InterfaceC608270NtR<Aweme, Boolean>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt$special$$inlined$associatePropertyNonNull$73
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Object] */
            public Boolean getValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                AwemeBizData awemeBizData = normalBizFields.get(str143);
                Boolean bool3 = 0;
                if (awemeBizData != null) {
                    bool3 = awemeBizData.fieldData;
                }
                if (!(bool3 instanceof Boolean) || bool3 == 0) {
                    return bool;
                }
                return bool3;
            }

            @Override // X.InterfaceC608270NtR, X.InterfaceC1731706qJ
            public /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return getValue((Aweme) obj, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa);
            }

            public void setValue(Aweme aweme, InterfaceC2217461Bqa<?> interfaceC2217461Bqa, Boolean bool3) {
                ConcurrentHashMap<String, AwemeBizData> normalBizFields;
                if (z7) {
                    normalBizFields = aweme.getTransientBizFields();
                } else {
                    normalBizFields = aweme.getNormalBizFields();
                }
                normalBizFields.put(str143, new AwemeBizData(z7, z7, z7, bool3));
            }

            @Override // X.InterfaceC608270NtR
            public /* bridge */ /* synthetic */ void setValue(Aweme aweme, InterfaceC2217461Bqa interfaceC2217461Bqa, Boolean bool3) {
                setValue(aweme, (InterfaceC2217461Bqa<?>) interfaceC2217461Bqa, bool3);
            }
        };
    }

    public static final String getActivityId(Aweme aweme) {
        return (String) activityId$delegate.getValue(aweme, $$delegatedProperties[66]);
    }

    public static final boolean getAdDescHandle(Aweme aweme) {
        return ((Boolean) adDescHandle$delegate.getValue(aweme, $$delegatedProperties[46])).booleanValue();
    }

    public static final int getAdDescMaxLines(Aweme aweme) {
        return ((Number) adDescMaxLines$delegate.getValue(aweme, $$delegatedProperties[45])).intValue();
    }

    public static final AnchorCustomData getAnchorCustomData(Aweme aweme) {
        return (AnchorCustomData) anchorCustomData$delegate.getValue(aweme, $$delegatedProperties[130]);
    }

    public static final boolean getAnchorLiveDataBindSuccess(Aweme aweme) {
        return ((Boolean) anchorLiveDataBindSuccess$delegate.getValue(aweme, $$delegatedProperties[37])).booleanValue();
    }

    public static final String getAnchorWikiOfflineText(Aweme aweme) {
        return (String) anchorWikiOfflineText$delegate.getValue(aweme, $$delegatedProperties[72]);
    }

    public static final String getAttachedVibeFeedId(Aweme aweme) {
        return (String) attachedVibeFeedId$delegate.getValue(aweme, $$delegatedProperties[39]);
    }

    public static final int getAwemePosition(Aweme aweme) {
        return ((Number) awemePosition$delegate.getValue(aweme, $$delegatedProperties[81])).intValue();
    }

    public static final int getBehindTheSongVideoType(Aweme aweme) {
        return ((Number) behindTheSongVideoType$delegate.getValue(aweme, $$delegatedProperties[112])).intValue();
    }

    public static final AVUploadMiscInfoStruct getCacheAvUploadMiscInfoStruct(Aweme aweme) {
        return (AVUploadMiscInfoStruct) cacheAvUploadMiscInfoStruct$delegate.getValue(aweme, $$delegatedProperties[13]);
    }

    public static final int getCacheSourceType(Aweme aweme) {
        return ((Number) cacheSourceType$delegate.getValue(aweme, $$delegatedProperties[83])).intValue();
    }

    public static final LiveRoomStruct getCachedLiveRoomStruct(Aweme aweme) {
        return (LiveRoomStruct) cachedLiveRoomStruct$delegate.getValue(aweme, $$delegatedProperties[132]);
    }

    public static final int getCaptionLength(Aweme aweme) {
        return ((Number) captionLength$delegate.getValue(aweme, $$delegatedProperties[129])).intValue();
    }

    public static final int getCaptionReturnCount(Aweme aweme) {
        return ((Number) captionReturnCount$delegate.getValue(aweme, $$delegatedProperties[128])).intValue();
    }

    public static final String getChallengeId(Aweme aweme) {
        return (String) challengeId$delegate.getValue(aweme, $$delegatedProperties[98]);
    }

    public static final long getClientAcceptanceTime(Aweme aweme) {
        return ((Number) clientAcceptanceTime$delegate.getValue(aweme, $$delegatedProperties[100])).longValue();
    }

    public static final boolean getConsumeFollowGuide(Aweme aweme) {
        return ((Boolean) consumeFollowGuide$delegate.getValue(aweme, $$delegatedProperties[138])).booleanValue();
    }

    public static final String getContentDiffType(Aweme aweme) {
        return (String) contentDiffType$delegate.getValue(aweme, $$delegatedProperties[35]);
    }

    public static final Map<String, Object> getCustomPayloads(Aweme aweme) {
        return (Map) customPayloads$delegate.getValue(aweme, $$delegatedProperties[17]);
    }

    public static final String getDescWithHashTagTruncation(Aweme aweme) {
        return (String) descWithHashTagTruncation$delegate.getValue(aweme, $$delegatedProperties[3]);
    }

    public static final boolean getDisableMusicDspFreqCtrl(Aweme aweme) {
        return ((Boolean) disableMusicDspFreqCtrl$delegate.getValue(aweme, $$delegatedProperties[96])).booleanValue();
    }

    public static final String getDmSenderUid(Aweme aweme) {
        return (String) dmSenderUid$delegate.getValue(aweme, $$delegatedProperties[86]);
    }

    public static final WeakReference<CharSequence> getEllipsizeDesc(Aweme aweme) {
        return (WeakReference) ellipsizeDesc$delegate.getValue(aweme, $$delegatedProperties[7]);
    }

    public static final ExploreClientExtra getExploreClientExtra(Aweme aweme) {
        return (ExploreClientExtra) exploreClientExtra$delegate.getValue(aweme, $$delegatedProperties[1]);
    }

    public static final String getFakeAid(Aweme aweme) {
        return (String) fakeAid$delegate.getValue(aweme, $$delegatedProperties[99]);
    }

    public static final InterfaceC2753014t getFcpStoreSource(Aweme aweme) {
        return (InterfaceC2753014t) fcpStoreSource$delegate.getValue(aweme, $$delegatedProperties[11]);
    }

    public static final long getFeedCount(Aweme aweme) {
        return ((Number) feedCount$delegate.getValue(aweme, $$delegatedProperties[64])).longValue();
    }

    public static final int getFeedSource(Aweme aweme) {
        return ((Number) feedSource$delegate.getValue(aweme, $$delegatedProperties[85])).intValue();
    }

    public static final long getFilterDuplicateTime(Aweme aweme) {
        return ((Number) filterDuplicateTime$delegate.getValue(aweme, $$delegatedProperties[59])).longValue();
    }

    public static final CharSequence getFoldedHashTagDesc(Aweme aweme) {
        return (CharSequence) foldedHashTagDesc$delegate.getValue(aweme, $$delegatedProperties[2]);
    }

    public static final List<TextExtraStruct> getFoldedTextExtra(Aweme aweme) {
        return (List) foldedTextExtra$delegate.getValue(aweme, $$delegatedProperties[9]);
    }

    public static final int getFriendsMusicTitleStyle(Aweme aweme) {
        return ((Number) friendsMusicTitleStyle$delegate.getValue(aweme, $$delegatedProperties[84])).intValue();
    }

    public static final Challenge getFromRawChallenge(Aweme aweme) {
        return (Challenge) fromRawChallenge$delegate.getValue(aweme, $$delegatedProperties[22]);
    }

    public static final String getGCacheVideoPath(Aweme aweme) {
        return (String) gCacheVideoPath$delegate.getValue(aweme, $$delegatedProperties[19]);
    }

    public static final int getHasAd(Aweme aweme) {
        return ((Number) hasAd$delegate.getValue(aweme, $$delegatedProperties[41])).intValue();
    }

    public static final boolean getHasCreationIntention(Aweme aweme) {
        return ((Boolean) hasCreationIntention$delegate.getValue(aweme, $$delegatedProperties[97])).booleanValue();
    }

    public static final boolean getHasDisplayLiveNoticeButton(Aweme aweme) {
        return ((Boolean) hasDisplayLiveNoticeButton$delegate.getValue(aweme, $$delegatedProperties[127])).booleanValue();
    }

    public static final boolean getHasFriendsTag(Aweme aweme) {
        return ((Boolean) hasFriendsTag$delegate.getValue(aweme, $$delegatedProperties[51])).booleanValue();
    }

    public static final String getHotSpot(Aweme aweme) {
        return (String) hotSpot$delegate.getValue(aweme, $$delegatedProperties[31]);
    }

    public static final UrlModel getIcon(Aweme aweme) {
        return (UrlModel) icon$delegate.getValue(aweme, $$delegatedProperties[111]);
    }

    public static final Map<String, String> getIdentifier(Aweme aweme) {
        return (Map) identifier$delegate.getValue(aweme, $$delegatedProperties[135]);
    }

    public static final boolean getIgnoreCheckPositionOfPostCard(Aweme aweme) {
        return ((Boolean) ignoreCheckPositionOfPostCard$delegate.getValue(aweme, $$delegatedProperties[29])).booleanValue();
    }

    public static final String getImItemId(Aweme aweme) {
        return (String) imItemId$delegate.getValue(aweme, $$delegatedProperties[14]);
    }

    public static final IMMediaModel getImMediaModel(Aweme aweme) {
        return (IMMediaModel) imMediaModel$delegate.getValue(aweme, $$delegatedProperties[16]);
    }

    public static final String getImMsgId(Aweme aweme) {
        return (String) imMsgId$delegate.getValue(aweme, $$delegatedProperties[15]);
    }

    public static final InteractionBubbles getInteractionBubbles(Aweme aweme) {
        return (InteractionBubbles) interactionBubbles$delegate.getValue(aweme, $$delegatedProperties[133]);
    }

    public static final String getLabelOriginAuthorText(Aweme aweme) {
        return (String) labelOriginAuthorText$delegate.getValue(aweme, $$delegatedProperties[62]);
    }

    public static final boolean getLawCriticalCountry(Aweme aweme) {
        return ((Boolean) lawCriticalCountry$delegate.getValue(aweme, $$delegatedProperties[24])).booleanValue();
    }

    public static final long getLiveCardLeaveTime(Aweme aweme) {
        return ((Number) liveCardLeaveTime$delegate.getValue(aweme, $$delegatedProperties[61])).longValue();
    }

    public static final long getLiveCardShowTime(Aweme aweme) {
        return ((Number) liveCardShowTime$delegate.getValue(aweme, $$delegatedProperties[60])).longValue();
    }

    public static final int getLiveMgCoverShowStyle(Aweme aweme) {
        return ((Number) liveMgCoverShowStyle$delegate.getValue(aweme, $$delegatedProperties[56])).intValue();
    }

    public static final boolean getLivePreviewLongPressDisabled(Aweme aweme) {
        return ((Boolean) livePreviewLongPressDisabled$delegate.getValue(aweme, $$delegatedProperties[116])).booleanValue();
    }

    public static final Integer[] getLivePreviewSize(Aweme aweme) {
        return (Integer[]) livePreviewSize$delegate.getValue(aweme, $$delegatedProperties[118]);
    }

    public static final String getMarketDropRule(Aweme aweme) {
        return (String) marketDropRule$delegate.getValue(aweme, $$delegatedProperties[33]);
    }

    public static final C0R6I getMediaSafetyModel(Aweme aweme) {
        return (C0R6I) mediaSafetyModel$delegate.getValue(aweme, $$delegatedProperties[107]);
    }

    public static final MixFlowParam getMixFlowParam(Aweme aweme) {
        return (MixFlowParam) mixFlowParam$delegate.getValue(aweme, $$delegatedProperties[123]);
    }

    public static final List<RelationLabelNew> getNewRelationLabel(Aweme aweme) {
        return (List) newRelationLabel$delegate.getValue(aweme, $$delegatedProperties[75]);
    }

    public static final String getNewSourceId(Aweme aweme) {
        return (String) newSourceId$delegate.getValue(aweme, $$delegatedProperties[68]);
    }

    public static final String getNewSourceType(Aweme aweme) {
        return (String) newSourceType$delegate.getValue(aweme, $$delegatedProperties[67]);
    }

    public static final String getNuTriggerScene(Aweme aweme) {
        return (String) nuTriggerScene$delegate.getValue(aweme, $$delegatedProperties[87]);
    }

    public static final int getOfflineUnwatchedCount(Aweme aweme) {
        return ((Number) offlineUnwatchedCount$delegate.getValue(aweme, $$delegatedProperties[20])).intValue();
    }

    public static final int getOriginalPos(Aweme aweme) {
        return ((Number) originalPos$delegate.getValue(aweme, $$delegatedProperties[63])).intValue();
    }

    public static final String getPhotoContentType(Aweme aweme) {
        return (String) photoContentType$delegate.getValue(aweme, $$delegatedProperties[5]);
    }

    public static final Object getPhotoDescTextComponents(Aweme aweme) {
        return photoDescTextComponents$delegate.getValue(aweme, $$delegatedProperties[6]);
    }

    public static final CharSequence getPhotoModeTitleLine(Aweme aweme) {
        return (CharSequence) photoModeTitleLine$delegate.getValue(aweme, $$delegatedProperties[4]);
    }

    public static final int getPositionInRequest(Aweme aweme) {
        return ((Number) positionInRequest$delegate.getValue(aweme, $$delegatedProperties[101])).intValue();
    }

    public static final PublishPreviewInfo getPreviewData(Aweme aweme) {
        return (PublishPreviewInfo) previewData$delegate.getValue(aweme, $$delegatedProperties[110]);
    }

    public static final WeakReference<CharSequence> getProcessedDesc(Aweme aweme) {
        return (WeakReference) processedDesc$delegate.getValue(aweme, $$delegatedProperties[8]);
    }

    public static final int getPullType(Aweme aweme) {
        return ((Number) pullType$delegate.getValue(aweme, $$delegatedProperties[65])).intValue();
    }

    public static final int getRank(Aweme aweme) {
        return ((Number) rank$delegate.getValue(aweme, $$delegatedProperties[77])).intValue();
    }

    public static final int getRealtimeFollowStatus(Aweme aweme) {
        return ((Number) realtimeFollowStatus$delegate.getValue(aweme, $$delegatedProperties[137])).intValue();
    }

    public static final String getRecoverReason(Aweme aweme) {
        return (String) recoverReason$delegate.getValue(aweme, $$delegatedProperties[18]);
    }

    public static final int getReferralFakeAwemeType(Aweme aweme) {
        return ((Number) referralFakeAwemeType$delegate.getValue(aweme, $$delegatedProperties[55])).intValue();
    }

    public static final String getRefreshTimeForSharedFeed(Aweme aweme) {
        return (String) refreshTimeForSharedFeed$delegate.getValue(aweme, $$delegatedProperties[40]);
    }

    public static final List<Float> getRelevantTime(Aweme aweme) {
        return (List) relevantTime$delegate.getValue(aweme, $$delegatedProperties[71]);
    }

    public static final boolean getReplaceRecTagByRepost(Aweme aweme) {
        return ((Boolean) replaceRecTagByRepost$delegate.getValue(aweme, $$delegatedProperties[95])).booleanValue();
    }

    public static final String getRepostFromGroupId(Aweme aweme) {
        return (String) repostFromGroupId$delegate.getValue(aweme, $$delegatedProperties[57]);
    }

    public static final String getRepostFromUserId(Aweme aweme) {
        return (String) repostFromUserId$delegate.getValue(aweme, $$delegatedProperties[58]);
    }

    public static final User getRepostUser(Aweme aweme) {
        return (User) repostUser$delegate.getValue(aweme, $$delegatedProperties[109]);
    }

    public static final String getRid(Aweme aweme) {
        return (String) rid$delegate.getValue(aweme, $$delegatedProperties[119]);
    }

    public static final int getScenario(Aweme aweme) {
        return ((Number) scenario$delegate.getValue(aweme, $$delegatedProperties[23])).intValue();
    }

    public static final String getScheduleId(Aweme aweme) {
        return (String) scheduleId$delegate.getValue(aweme, $$delegatedProperties[53]);
    }

    public static final String getSearchDocOriginLanguage(Aweme aweme) {
        return (String) searchDocOriginLanguage$delegate.getValue(aweme, $$delegatedProperties[73]);
    }

    public static final String getSearchDocTranslate(Aweme aweme) {
        return (String) searchDocTranslate$delegate.getValue(aweme, $$delegatedProperties[74]);
    }

    public static final HashMap<String, String> getSearchExtraParams(Aweme aweme) {
        return (HashMap) searchExtraParams$delegate.getValue(aweme, $$delegatedProperties[134]);
    }

    public static final String getSearchFeedType(Aweme aweme) {
        return (String) searchFeedType$delegate.getValue(aweme, $$delegatedProperties[122]);
    }

    public static final Map<String, String> getSearchLynxLogParams(Aweme aweme) {
        return (Map) searchLynxLogParams$delegate.getValue(aweme, $$delegatedProperties[136]);
    }

    public static final String getSearchTabName(Aweme aweme) {
        return (String) searchTabName$delegate.getValue(aweme, $$delegatedProperties[121]);
    }

    public static final Integer getSearchTabRank(Aweme aweme) {
        return (Integer) searchTabRank$delegate.getValue(aweme, $$delegatedProperties[120]);
    }

    public static final ServerBaseFcpConfig getServerBaseFcpConfig(Aweme aweme) {
        return (ServerBaseFcpConfig) serverBaseFcpConfig$delegate.getValue(aweme, $$delegatedProperties[10]);
    }

    public static final int getSessionPosition(Aweme aweme) {
        return ((Number) sessionPosition$delegate.getValue(aweme, $$delegatedProperties[114])).intValue();
    }

    public static final int getSessionRequestPosition(Aweme aweme) {
        return ((Number) sessionRequestPosition$delegate.getValue(aweme, $$delegatedProperties[102])).intValue();
    }

    public static final User getSharer(Aweme aweme) {
        return (User) sharer$delegate.getValue(aweme, $$delegatedProperties[108]);
    }

    public static final ShopAdStruct getShopAdStruct(Aweme aweme) {
        return (ShopAdStruct) shopAdStruct$delegate.getValue(aweme, $$delegatedProperties[25]);
    }

    public static final List<SimplePromotion> getSimplePromotions(Aweme aweme) {
        return (List) simplePromotions$delegate.getValue(aweme, $$delegatedProperties[26]);
    }

    public static final Object getSlotStrategySnapshot(Aweme aweme) {
        return slotStrategySnapshot$delegate.getValue(aweme, $$delegatedProperties[12]);
    }

    public static final String getSourceBtmToken(Aweme aweme) {
        return (String) sourceBtmToken$delegate.getValue(aweme, $$delegatedProperties[32]);
    }

    public static final Aweme getSubAweme(Aweme aweme) {
        return (Aweme) subAweme$delegate.getValue(aweme, $$delegatedProperties[131]);
    }

    public static final UrlModel getSubAwemeCover(Aweme aweme) {
        return (UrlModel) subAwemeCover$delegate.getValue(aweme, $$delegatedProperties[125]);
    }

    public static final int getTotalProductAnchors(Aweme aweme) {
        return ((Number) totalProductAnchors$delegate.getValue(aweme, $$delegatedProperties[0])).intValue();
    }

    public static final String getTrendingId(Aweme aweme) {
        return (String) trendingId$delegate.getValue(aweme, $$delegatedProperties[78]);
    }

    public static final String getTrendingName(Aweme aweme) {
        return (String) trendingName$delegate.getValue(aweme, $$delegatedProperties[79]);
    }

    public static final int getUserDislike(Aweme aweme) {
        return ((Number) userDislike$delegate.getValue(aweme, $$delegatedProperties[21])).intValue();
    }

    public static final List<UrlModel> getVibeFeedCoverList(Aweme aweme) {
        return (List) vibeFeedCoverList$delegate.getValue(aweme, $$delegatedProperties[38]);
    }

    public static final boolean getWithSearchSurvey(Aweme aweme) {
        return ((Boolean) withSearchSurvey$delegate.getValue(aweme, $$delegatedProperties[69])).booleanValue();
    }

    public static final boolean isAttrUpdated(Aweme aweme) {
        return ((Boolean) isAttrUpdated$delegate.getValue(aweme, $$delegatedProperties[94])).booleanValue();
    }

    public static final boolean isClientSeen(Aweme aweme) {
        return ((Boolean) isClientSeen$delegate.getValue(aweme, $$delegatedProperties[34])).booleanValue();
    }

    public static final boolean isCommentClicked(Aweme aweme) {
        return ((Boolean) isCommentClicked$delegate.getValue(aweme, $$delegatedProperties[43])).booleanValue();
    }

    public static final boolean isDesMoreTextShow(Aweme aweme) {
        return ((Boolean) isDesMoreTextShow$delegate.getValue(aweme, $$delegatedProperties[36])).booleanValue();
    }

    public static final boolean isDidZero(Aweme aweme) {
        return ((Boolean) isDidZero$delegate.getValue(aweme, $$delegatedProperties[93])).booleanValue();
    }

    public static final boolean isEnableVideoSkip(Aweme aweme) {
        return ((Boolean) isEnableVideoSkip$delegate.getValue(aweme, $$delegatedProperties[70])).booleanValue();
    }

    public static final boolean isFakeResponse(Aweme aweme) {
        return ((Boolean) isFakeResponse$delegate.getValue(aweme, $$delegatedProperties[47])).booleanValue();
    }

    public static final VideoType isFeatureVideo(Aweme aweme) {
        return (VideoType) isFeatureVideo$delegate.getValue(aweme, $$delegatedProperties[117]);
    }

    public static final boolean isFollowerVideoPresent(Aweme aweme) {
        return ((Boolean) isFollowerVideoPresent$delegate.getValue(aweme, $$delegatedProperties[91])).booleanValue();
    }

    public static final boolean isForMusicDetailLoading(Aweme aweme) {
        return ((Boolean) isForMusicDetailLoading$delegate.getValue(aweme, $$delegatedProperties[115])).booleanValue();
    }

    public static final boolean isForwardClicked(Aweme aweme) {
        return ((Boolean) isForwardClicked$delegate.getValue(aweme, $$delegatedProperties[44])).booleanValue();
    }

    public static final boolean isFriendVideoPresent(Aweme aweme) {
        return ((Boolean) isFriendVideoPresent$delegate.getValue(aweme, $$delegatedProperties[90])).booleanValue();
    }

    public static final boolean isFriendsTabV2FakeAweme(Aweme aweme) {
        return ((Boolean) isFriendsTabV2FakeAweme$delegate.getValue(aweme, $$delegatedProperties[49])).booleanValue();
    }

    public static final boolean isFriendsV2PublishInserted(Aweme aweme) {
        return ((Boolean) isFriendsV2PublishInserted$delegate.getValue(aweme, $$delegatedProperties[50])).booleanValue();
    }

    public static final boolean isFriendsVideoUnread(Aweme aweme) {
        return ((Boolean) isFriendsVideoUnread$delegate.getValue(aweme, $$delegatedProperties[113])).booleanValue();
    }

    public static final String isFromTrendingCard(Aweme aweme) {
        return (String) isFromTrendingCard$delegate.getValue(aweme, $$delegatedProperties[76]);
    }

    public static final boolean isHighlighted(Aweme aweme) {
        return ((Boolean) isHighlighted$delegate.getValue(aweme, $$delegatedProperties[124])).booleanValue();
    }

    public static final String isIntextOccludeDesc(Aweme aweme) {
        return (String) isIntextOccludeDesc$delegate.getValue(aweme, $$delegatedProperties[106]);
    }

    public static final String isIntextOccludeInteraction(Aweme aweme) {
        return (String) isIntextOccludeInteraction$delegate.getValue(aweme, $$delegatedProperties[104]);
    }

    public static final String isIntextOccludeTab(Aweme aweme) {
        return (String) isIntextOccludeTab$delegate.getValue(aweme, $$delegatedProperties[103]);
    }

    public static final String isIntextOut(Aweme aweme) {
        return (String) isIntextOut$delegate.getValue(aweme, $$delegatedProperties[105]);
    }

    public static final boolean isLocalUnpublishedAweme(Aweme aweme) {
        return ((Boolean) isLocalUnpublishedAweme$delegate.getValue(aweme, $$delegatedProperties[28])).booleanValue();
    }

    public static final boolean isPhotoSwap(Aweme aweme) {
        return ((Boolean) isPhotoSwap$delegate.getValue(aweme, $$delegatedProperties[30])).booleanValue();
    }

    public static final boolean isPlaceHolder(Aweme aweme) {
        return ((Boolean) isPlaceHolder$delegate.getValue(aweme, $$delegatedProperties[82])).booleanValue();
    }

    public static final boolean isPreloadScroll(Aweme aweme) {
        return ((Boolean) isPreloadScroll$delegate.getValue(aweme, $$delegatedProperties[42])).booleanValue();
    }

    public static final boolean isPublishing(Aweme aweme) {
        return ((Boolean) isPublishing$delegate.getValue(aweme, $$delegatedProperties[27])).booleanValue();
    }

    public static final boolean isRecBigCardFakeAweme(Aweme aweme) {
        return ((Boolean) isRecBigCardFakeAweme$delegate.getValue(aweme, $$delegatedProperties[52])).booleanValue();
    }

    public static final boolean isReferralFakeAweme(Aweme aweme) {
        return ((Boolean) isReferralFakeAweme$delegate.getValue(aweme, $$delegatedProperties[54])).booleanValue();
    }

    public static final boolean isStoryFakeAweme(Aweme aweme) {
        return ((Boolean) isStoryFakeAweme$delegate.getValue(aweme, $$delegatedProperties[48])).booleanValue();
    }

    public static final boolean isStoryPacked(Aweme aweme) {
        return ((Boolean) isStoryPacked$delegate.getValue(aweme, $$delegatedProperties[80])).booleanValue();
    }

    public static final boolean isSubAweme(Aweme aweme) {
        return ((Boolean) isSubAweme$delegate.getValue(aweme, $$delegatedProperties[126])).booleanValue();
    }

    public static final boolean isTemplateDetailPinedTop(Aweme aweme) {
        return ((Boolean) isTemplateDetailPinedTop$delegate.getValue(aweme, $$delegatedProperties[88])).booleanValue();
    }

    public static final boolean isTemplateOriginalAweme(Aweme aweme) {
        return ((Boolean) isTemplateOriginalAweme$delegate.getValue(aweme, $$delegatedProperties[89])).booleanValue();
    }

    public static final boolean isUidZero(Aweme aweme) {
        return ((Boolean) isUidZero$delegate.getValue(aweme, $$delegatedProperties[92])).booleanValue();
    }

    public static final boolean isUserDislike(Aweme aweme) {
        if (getUserDislike(aweme) == 1) {
            return true;
        }
        return false;
    }

    public static final void setActivityId(Aweme aweme, String str) {
        activityId$delegate.setValue(aweme, $$delegatedProperties[66], str);
    }

    public static final void setAdDescHandle(Aweme aweme, boolean z) {
        adDescHandle$delegate.setValue(aweme, $$delegatedProperties[46], Boolean.valueOf(z));
    }

    public static final void setAdDescMaxLines(Aweme aweme, int i) {
        adDescMaxLines$delegate.setValue(aweme, $$delegatedProperties[45], Integer.valueOf(i));
    }

    public static final void setAnchorCustomData(Aweme aweme, AnchorCustomData anchorCustomData) {
        anchorCustomData$delegate.setValue(aweme, $$delegatedProperties[130], anchorCustomData);
    }

    public static final void setAnchorLiveDataBindSuccess(Aweme aweme, boolean z) {
        anchorLiveDataBindSuccess$delegate.setValue(aweme, $$delegatedProperties[37], Boolean.valueOf(z));
    }

    public static final void setAnchorWikiOfflineText(Aweme aweme, String str) {
        anchorWikiOfflineText$delegate.setValue(aweme, $$delegatedProperties[72], str);
    }

    public static final void setAttachedVibeFeedId(Aweme aweme, String str) {
        attachedVibeFeedId$delegate.setValue(aweme, $$delegatedProperties[39], str);
    }

    public static final void setAttrUpdated(Aweme aweme, boolean z) {
        isAttrUpdated$delegate.setValue(aweme, $$delegatedProperties[94], Boolean.valueOf(z));
    }

    public static final void setAwemePosition(Aweme aweme, int i) {
        awemePosition$delegate.setValue(aweme, $$delegatedProperties[81], Integer.valueOf(i));
    }

    public static final void setBehindTheSongVideoType(Aweme aweme, int i) {
        behindTheSongVideoType$delegate.setValue(aweme, $$delegatedProperties[112], Integer.valueOf(i));
    }

    public static final void setCacheAvUploadMiscInfoStruct(Aweme aweme, AVUploadMiscInfoStruct aVUploadMiscInfoStruct) {
        cacheAvUploadMiscInfoStruct$delegate.setValue(aweme, $$delegatedProperties[13], aVUploadMiscInfoStruct);
    }

    public static final void setCacheSourceType(Aweme aweme, int i) {
        cacheSourceType$delegate.setValue(aweme, $$delegatedProperties[83], Integer.valueOf(i));
    }

    public static final void setCachedLiveRoomStruct(Aweme aweme, LiveRoomStruct liveRoomStruct) {
        cachedLiveRoomStruct$delegate.setValue(aweme, $$delegatedProperties[132], liveRoomStruct);
    }

    public static final void setCaptionLength(Aweme aweme, int i) {
        captionLength$delegate.setValue(aweme, $$delegatedProperties[129], Integer.valueOf(i));
    }

    public static final void setCaptionReturnCount(Aweme aweme, int i) {
        captionReturnCount$delegate.setValue(aweme, $$delegatedProperties[128], Integer.valueOf(i));
    }

    public static final void setChallengeId(Aweme aweme, String str) {
        challengeId$delegate.setValue(aweme, $$delegatedProperties[98], str);
    }

    public static final void setClientAcceptanceTime(Aweme aweme, long j) {
        clientAcceptanceTime$delegate.setValue(aweme, $$delegatedProperties[100], Long.valueOf(j));
    }

    public static final void setClientSeen(Aweme aweme, boolean z) {
        isClientSeen$delegate.setValue(aweme, $$delegatedProperties[34], Boolean.valueOf(z));
    }

    public static final void setCommentClicked(Aweme aweme, boolean z) {
        isCommentClicked$delegate.setValue(aweme, $$delegatedProperties[43], Boolean.valueOf(z));
    }

    public static final void setConsumeFollowGuide(Aweme aweme, boolean z) {
        consumeFollowGuide$delegate.setValue(aweme, $$delegatedProperties[138], Boolean.valueOf(z));
    }

    public static final void setContentDiffType(Aweme aweme, String str) {
        contentDiffType$delegate.setValue(aweme, $$delegatedProperties[35], str);
    }

    public static final void setCustomPayloads(Aweme aweme, Map<String, Object> map) {
        customPayloads$delegate.setValue(aweme, $$delegatedProperties[17], map);
    }

    public static final void setDesMoreTextShow(Aweme aweme, boolean z) {
        isDesMoreTextShow$delegate.setValue(aweme, $$delegatedProperties[36], Boolean.valueOf(z));
    }

    public static final void setDescWithHashTagTruncation(Aweme aweme, String str) {
        descWithHashTagTruncation$delegate.setValue(aweme, $$delegatedProperties[3], str);
    }

    public static final void setDidZero(Aweme aweme, boolean z) {
        isDidZero$delegate.setValue(aweme, $$delegatedProperties[93], Boolean.valueOf(z));
    }

    public static final void setDisableMusicDspFreqCtrl(Aweme aweme, boolean z) {
        disableMusicDspFreqCtrl$delegate.setValue(aweme, $$delegatedProperties[96], Boolean.valueOf(z));
    }

    public static final void setDmSenderUid(Aweme aweme, String str) {
        dmSenderUid$delegate.setValue(aweme, $$delegatedProperties[86], str);
    }

    public static final void setEllipsizeDesc(Aweme aweme, WeakReference<CharSequence> weakReference) {
        ellipsizeDesc$delegate.setValue(aweme, $$delegatedProperties[7], weakReference);
    }

    public static final void setEnableVideoSkip(Aweme aweme, boolean z) {
        isEnableVideoSkip$delegate.setValue(aweme, $$delegatedProperties[70], Boolean.valueOf(z));
    }

    public static final void setExploreClientExtra(Aweme aweme, ExploreClientExtra exploreClientExtra) {
        exploreClientExtra$delegate.setValue(aweme, $$delegatedProperties[1], exploreClientExtra);
    }

    public static final void setFakeAid(Aweme aweme, String str) {
        fakeAid$delegate.setValue(aweme, $$delegatedProperties[99], str);
    }

    public static final void setFakeResponse(Aweme aweme, boolean z) {
        isFakeResponse$delegate.setValue(aweme, $$delegatedProperties[47], Boolean.valueOf(z));
    }

    public static final void setFcpStoreSource(Aweme aweme, InterfaceC2753014t interfaceC2753014t) {
        fcpStoreSource$delegate.setValue(aweme, $$delegatedProperties[11], interfaceC2753014t);
    }

    public static final void setFeatureVideo(Aweme aweme, VideoType videoType) {
        isFeatureVideo$delegate.setValue(aweme, $$delegatedProperties[117], videoType);
    }

    public static final void setFeedCount(Aweme aweme, long j) {
        feedCount$delegate.setValue(aweme, $$delegatedProperties[64], Long.valueOf(j));
    }

    public static final void setFeedSource(Aweme aweme, int i) {
        feedSource$delegate.setValue(aweme, $$delegatedProperties[85], Integer.valueOf(i));
    }

    public static final void setFilterDuplicateTime(Aweme aweme, long j) {
        filterDuplicateTime$delegate.setValue(aweme, $$delegatedProperties[59], Long.valueOf(j));
    }

    public static final void setFoldedHashTagDesc(Aweme aweme, CharSequence charSequence) {
        foldedHashTagDesc$delegate.setValue(aweme, $$delegatedProperties[2], charSequence);
    }

    public static final void setFoldedTextExtra(Aweme aweme, List<? extends TextExtraStruct> list) {
        foldedTextExtra$delegate.setValue(aweme, $$delegatedProperties[9], list);
    }

    public static final void setFollowerVideoPresent(Aweme aweme, boolean z) {
        isFollowerVideoPresent$delegate.setValue(aweme, $$delegatedProperties[91], Boolean.valueOf(z));
    }

    public static final void setForMusicDetailLoading(Aweme aweme, boolean z) {
        isForMusicDetailLoading$delegate.setValue(aweme, $$delegatedProperties[115], Boolean.valueOf(z));
    }

    public static final void setForwardClicked(Aweme aweme, boolean z) {
        isForwardClicked$delegate.setValue(aweme, $$delegatedProperties[44], Boolean.valueOf(z));
    }

    public static final void setFriendVideoPresent(Aweme aweme, boolean z) {
        isFriendVideoPresent$delegate.setValue(aweme, $$delegatedProperties[90], Boolean.valueOf(z));
    }

    public static final void setFriendsMusicTitleStyle(Aweme aweme, int i) {
        friendsMusicTitleStyle$delegate.setValue(aweme, $$delegatedProperties[84], Integer.valueOf(i));
    }

    public static final void setFriendsTabV2FakeAweme(Aweme aweme, boolean z) {
        isFriendsTabV2FakeAweme$delegate.setValue(aweme, $$delegatedProperties[49], Boolean.valueOf(z));
    }

    public static final void setFriendsV2PublishInserted(Aweme aweme, boolean z) {
        isFriendsV2PublishInserted$delegate.setValue(aweme, $$delegatedProperties[50], Boolean.valueOf(z));
    }

    public static final void setFriendsVideoUnread(Aweme aweme, boolean z) {
        isFriendsVideoUnread$delegate.setValue(aweme, $$delegatedProperties[113], Boolean.valueOf(z));
    }

    public static final void setFromRawChallenge(Aweme aweme, Challenge challenge) {
        fromRawChallenge$delegate.setValue(aweme, $$delegatedProperties[22], challenge);
    }

    public static final void setFromTrendingCard(Aweme aweme, String str) {
        isFromTrendingCard$delegate.setValue(aweme, $$delegatedProperties[76], str);
    }

    public static final void setGCacheVideoPath(Aweme aweme, String str) {
        gCacheVideoPath$delegate.setValue(aweme, $$delegatedProperties[19], str);
    }

    public static final void setHasAd(Aweme aweme, int i) {
        hasAd$delegate.setValue(aweme, $$delegatedProperties[41], Integer.valueOf(i));
    }

    public static final void setHasCreationIntention(Aweme aweme, boolean z) {
        hasCreationIntention$delegate.setValue(aweme, $$delegatedProperties[97], Boolean.valueOf(z));
    }

    public static final void setHasDisplayLiveNoticeButton(Aweme aweme, boolean z) {
        hasDisplayLiveNoticeButton$delegate.setValue(aweme, $$delegatedProperties[127], Boolean.valueOf(z));
    }

    public static final void setHasFriendsTag(Aweme aweme, boolean z) {
        hasFriendsTag$delegate.setValue(aweme, $$delegatedProperties[51], Boolean.valueOf(z));
    }

    public static final void setHighlighted(Aweme aweme, boolean z) {
        isHighlighted$delegate.setValue(aweme, $$delegatedProperties[124], Boolean.valueOf(z));
    }

    public static final void setHotSpot(Aweme aweme, String str) {
        hotSpot$delegate.setValue(aweme, $$delegatedProperties[31], str);
    }

    public static final void setIcon(Aweme aweme, UrlModel urlModel) {
        icon$delegate.setValue(aweme, $$delegatedProperties[111], urlModel);
    }

    public static final void setIdentifier(Aweme aweme, Map<String, String> map) {
        identifier$delegate.setValue(aweme, $$delegatedProperties[135], map);
    }

    public static final void setIgnoreCheckPositionOfPostCard(Aweme aweme, boolean z) {
        ignoreCheckPositionOfPostCard$delegate.setValue(aweme, $$delegatedProperties[29], Boolean.valueOf(z));
    }

    public static final void setImItemId(Aweme aweme, String str) {
        imItemId$delegate.setValue(aweme, $$delegatedProperties[14], str);
    }

    public static final void setImMediaModel(Aweme aweme, IMMediaModel iMMediaModel) {
        imMediaModel$delegate.setValue(aweme, $$delegatedProperties[16], iMMediaModel);
    }

    public static final void setImMsgId(Aweme aweme, String str) {
        imMsgId$delegate.setValue(aweme, $$delegatedProperties[15], str);
    }

    public static final void setInteractionBubbleState(Aweme aweme, InteractionBubbleCacheState interactionBubbleCacheState) {
        InteractionBubbles.Builder builderCopy = getInteractionBubbles(aweme).copy();
        builderCopy.cacheState(interactionBubbleCacheState);
        setInteractionBubbles(aweme, builderCopy.build());
    }

    public static final void setInteractionBubbles(Aweme aweme, InteractionBubbles interactionBubbles) {
        interactionBubbles$delegate.setValue(aweme, $$delegatedProperties[133], interactionBubbles);
    }

    public static final void setIntextOccludeDesc(Aweme aweme, String str) {
        isIntextOccludeDesc$delegate.setValue(aweme, $$delegatedProperties[106], str);
    }

    public static final void setIntextOccludeInteraction(Aweme aweme, String str) {
        isIntextOccludeInteraction$delegate.setValue(aweme, $$delegatedProperties[104], str);
    }

    public static final void setIntextOccludeTab(Aweme aweme, String str) {
        isIntextOccludeTab$delegate.setValue(aweme, $$delegatedProperties[103], str);
    }

    public static final void setIntextOut(Aweme aweme, String str) {
        isIntextOut$delegate.setValue(aweme, $$delegatedProperties[105], str);
    }

    public static final void setLabelOriginAuthorText(Aweme aweme, String str) {
        labelOriginAuthorText$delegate.setValue(aweme, $$delegatedProperties[62], str);
    }

    public static final void setLawCriticalCountry(Aweme aweme, boolean z) {
        lawCriticalCountry$delegate.setValue(aweme, $$delegatedProperties[24], Boolean.valueOf(z));
    }

    public static final void setLiveCardLeaveTime(Aweme aweme, long j) {
        liveCardLeaveTime$delegate.setValue(aweme, $$delegatedProperties[61], Long.valueOf(j));
    }

    public static final void setLiveCardShowTime(Aweme aweme, long j) {
        liveCardShowTime$delegate.setValue(aweme, $$delegatedProperties[60], Long.valueOf(j));
    }

    public static final void setLiveMgCoverShowStyle(Aweme aweme, int i) {
        liveMgCoverShowStyle$delegate.setValue(aweme, $$delegatedProperties[56], Integer.valueOf(i));
    }

    public static final void setLivePreviewLongPressDisabled(Aweme aweme, boolean z) {
        livePreviewLongPressDisabled$delegate.setValue(aweme, $$delegatedProperties[116], Boolean.valueOf(z));
    }

    public static final void setLivePreviewSize(Aweme aweme, Integer[] numArr) {
        livePreviewSize$delegate.setValue(aweme, $$delegatedProperties[118], numArr);
    }

    public static final void setLocalUnpublishedAweme(Aweme aweme, boolean z) {
        isLocalUnpublishedAweme$delegate.setValue(aweme, $$delegatedProperties[28], Boolean.valueOf(z));
    }

    public static final void setMarketDropRule(Aweme aweme, String str) {
        marketDropRule$delegate.setValue(aweme, $$delegatedProperties[33], str);
    }

    public static final void setMediaSafetyModel(Aweme aweme, C0R6I c0r6i) {
        mediaSafetyModel$delegate.setValue(aweme, $$delegatedProperties[107], c0r6i);
    }

    public static final void setMixFlowParam(Aweme aweme, MixFlowParam mixFlowParam) {
        mixFlowParam$delegate.setValue(aweme, $$delegatedProperties[123], mixFlowParam);
    }

    public static final void setNewRelationLabel(Aweme aweme, List<RelationLabelNew> list) {
        newRelationLabel$delegate.setValue(aweme, $$delegatedProperties[75], list);
    }

    public static final void setNewSourceId(Aweme aweme, String str) {
        newSourceId$delegate.setValue(aweme, $$delegatedProperties[68], str);
    }

    public static final void setNewSourceType(Aweme aweme, String str) {
        newSourceType$delegate.setValue(aweme, $$delegatedProperties[67], str);
    }

    public static final void setNuTriggerScene(Aweme aweme, String str) {
        nuTriggerScene$delegate.setValue(aweme, $$delegatedProperties[87], str);
    }

    public static final void setOfflineUnwatchedCount(Aweme aweme, int i) {
        offlineUnwatchedCount$delegate.setValue(aweme, $$delegatedProperties[20], Integer.valueOf(i));
    }

    public static final void setOriginalPos(Aweme aweme, int i) {
        originalPos$delegate.setValue(aweme, $$delegatedProperties[63], Integer.valueOf(i));
    }

    public static final void setPhotoContentType(Aweme aweme, String str) {
        photoContentType$delegate.setValue(aweme, $$delegatedProperties[5], str);
    }

    public static final void setPhotoDescTextComponents(Aweme aweme, Object obj) {
        photoDescTextComponents$delegate.setValue(aweme, $$delegatedProperties[6], obj);
    }

    public static final void setPhotoModeTitleLine(Aweme aweme, CharSequence charSequence) {
        photoModeTitleLine$delegate.setValue(aweme, $$delegatedProperties[4], charSequence);
    }

    public static final void setPhotoSwap(Aweme aweme, boolean z) {
        isPhotoSwap$delegate.setValue(aweme, $$delegatedProperties[30], Boolean.valueOf(z));
    }

    public static final void setPlaceHolder(Aweme aweme, boolean z) {
        isPlaceHolder$delegate.setValue(aweme, $$delegatedProperties[82], Boolean.valueOf(z));
    }

    public static final void setPositionInRequest(Aweme aweme, int i) {
        positionInRequest$delegate.setValue(aweme, $$delegatedProperties[101], Integer.valueOf(i));
    }

    public static final void setPreloadScroll(Aweme aweme, boolean z) {
        isPreloadScroll$delegate.setValue(aweme, $$delegatedProperties[42], Boolean.valueOf(z));
    }

    public static final void setPreviewData(Aweme aweme, PublishPreviewInfo publishPreviewInfo) {
        previewData$delegate.setValue(aweme, $$delegatedProperties[110], publishPreviewInfo);
    }

    public static final void setProcessedDesc(Aweme aweme, WeakReference<CharSequence> weakReference) {
        processedDesc$delegate.setValue(aweme, $$delegatedProperties[8], weakReference);
    }

    public static final void setPublishing(Aweme aweme, boolean z) {
        isPublishing$delegate.setValue(aweme, $$delegatedProperties[27], Boolean.valueOf(z));
    }

    public static final void setPullType(Aweme aweme, int i) {
        pullType$delegate.setValue(aweme, $$delegatedProperties[65], Integer.valueOf(i));
    }

    public static final void setRank(Aweme aweme, int i) {
        rank$delegate.setValue(aweme, $$delegatedProperties[77], Integer.valueOf(i));
    }

    public static final void setRealtimeFollowStatus(Aweme aweme, int i) {
        realtimeFollowStatus$delegate.setValue(aweme, $$delegatedProperties[137], Integer.valueOf(i));
    }

    public static final void setRecBigCardFakeAweme(Aweme aweme, boolean z) {
        isRecBigCardFakeAweme$delegate.setValue(aweme, $$delegatedProperties[52], Boolean.valueOf(z));
    }

    public static final void setRecoverReason(Aweme aweme, String str) {
        recoverReason$delegate.setValue(aweme, $$delegatedProperties[18], str);
    }

    public static final void setReferralFakeAweme(Aweme aweme, boolean z) {
        isReferralFakeAweme$delegate.setValue(aweme, $$delegatedProperties[54], Boolean.valueOf(z));
    }

    public static final void setReferralFakeAwemeType(Aweme aweme, int i) {
        referralFakeAwemeType$delegate.setValue(aweme, $$delegatedProperties[55], Integer.valueOf(i));
    }

    public static final void setRefreshTimeForSharedFeed(Aweme aweme, String str) {
        refreshTimeForSharedFeed$delegate.setValue(aweme, $$delegatedProperties[40], str);
    }

    public static final void setRelevantTime(Aweme aweme, List<Float> list) {
        relevantTime$delegate.setValue(aweme, $$delegatedProperties[71], list);
    }

    public static final void setReplaceRecTagByRepost(Aweme aweme, boolean z) {
        replaceRecTagByRepost$delegate.setValue(aweme, $$delegatedProperties[95], Boolean.valueOf(z));
    }

    public static final void setRepostFromGroupId(Aweme aweme, String str) {
        repostFromGroupId$delegate.setValue(aweme, $$delegatedProperties[57], str);
    }

    public static final void setRepostFromUserId(Aweme aweme, String str) {
        repostFromUserId$delegate.setValue(aweme, $$delegatedProperties[58], str);
    }

    public static final void setRepostUser(Aweme aweme, User user) {
        repostUser$delegate.setValue(aweme, $$delegatedProperties[109], user);
    }

    public static final void setRid(Aweme aweme, String str) {
        rid$delegate.setValue(aweme, $$delegatedProperties[119], str);
    }

    public static final void setScenario(Aweme aweme, int i) {
        scenario$delegate.setValue(aweme, $$delegatedProperties[23], Integer.valueOf(i));
    }

    public static final void setScheduleId(Aweme aweme, String str) {
        scheduleId$delegate.setValue(aweme, $$delegatedProperties[53], str);
    }

    public static final void setSearchDocOriginLanguage(Aweme aweme, String str) {
        searchDocOriginLanguage$delegate.setValue(aweme, $$delegatedProperties[73], str);
    }

    public static final void setSearchDocTranslate(Aweme aweme, String str) {
        searchDocTranslate$delegate.setValue(aweme, $$delegatedProperties[74], str);
    }

    public static final void setSearchExtraParams(Aweme aweme, HashMap<String, String> map) {
        searchExtraParams$delegate.setValue(aweme, $$delegatedProperties[134], map);
    }

    public static final void setSearchFeedType(Aweme aweme, String str) {
        searchFeedType$delegate.setValue(aweme, $$delegatedProperties[122], str);
    }

    public static final void setSearchLynxLogParams(Aweme aweme, Map<String, String> map) {
        searchLynxLogParams$delegate.setValue(aweme, $$delegatedProperties[136], map);
    }

    public static final void setSearchTabName(Aweme aweme, String str) {
        searchTabName$delegate.setValue(aweme, $$delegatedProperties[121], str);
    }

    public static final void setSearchTabRank(Aweme aweme, Integer num) {
        searchTabRank$delegate.setValue(aweme, $$delegatedProperties[120], num);
    }

    public static final void setServerBaseFcpConfig(Aweme aweme, ServerBaseFcpConfig serverBaseFcpConfig) {
        serverBaseFcpConfig$delegate.setValue(aweme, $$delegatedProperties[10], serverBaseFcpConfig);
    }

    public static final void setSessionPosition(Aweme aweme, int i) {
        sessionPosition$delegate.setValue(aweme, $$delegatedProperties[114], Integer.valueOf(i));
    }

    public static final void setSessionRequestPosition(Aweme aweme, int i) {
        sessionRequestPosition$delegate.setValue(aweme, $$delegatedProperties[102], Integer.valueOf(i));
    }

    public static final void setSharer(Aweme aweme, User user) {
        sharer$delegate.setValue(aweme, $$delegatedProperties[108], user);
    }

    public static final void setShopAdStruct(Aweme aweme, ShopAdStruct shopAdStruct) {
        shopAdStruct$delegate.setValue(aweme, $$delegatedProperties[25], shopAdStruct);
    }

    public static final void setSimplePromotions(Aweme aweme, List<SimplePromotion> list) {
        simplePromotions$delegate.setValue(aweme, $$delegatedProperties[26], list);
    }

    public static final void setSlotStrategySnapshot(Aweme aweme, Object obj) {
        slotStrategySnapshot$delegate.setValue(aweme, $$delegatedProperties[12], obj);
    }

    public static final void setSourceBtmToken(Aweme aweme, String str) {
        sourceBtmToken$delegate.setValue(aweme, $$delegatedProperties[32], str);
    }

    public static final void setStoryFakeAweme(Aweme aweme, boolean z) {
        isStoryFakeAweme$delegate.setValue(aweme, $$delegatedProperties[48], Boolean.valueOf(z));
    }

    public static final void setStoryPacked(Aweme aweme, boolean z) {
        isStoryPacked$delegate.setValue(aweme, $$delegatedProperties[80], Boolean.valueOf(z));
    }

    public static final void setSubAweme(Aweme aweme, boolean z) {
        isSubAweme$delegate.setValue(aweme, $$delegatedProperties[126], Boolean.valueOf(z));
    }

    public static final void setSubAwemeCover(Aweme aweme, UrlModel urlModel) {
        subAwemeCover$delegate.setValue(aweme, $$delegatedProperties[125], urlModel);
    }

    public static final void setTemplateDetailPinedTop(Aweme aweme, boolean z) {
        isTemplateDetailPinedTop$delegate.setValue(aweme, $$delegatedProperties[88], Boolean.valueOf(z));
    }

    public static final void setTemplateOriginalAweme(Aweme aweme, boolean z) {
        isTemplateOriginalAweme$delegate.setValue(aweme, $$delegatedProperties[89], Boolean.valueOf(z));
    }

    public static final void setTotalProductAnchors(Aweme aweme, int i) {
        totalProductAnchors$delegate.setValue(aweme, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public static final void setTrendingId(Aweme aweme, String str) {
        trendingId$delegate.setValue(aweme, $$delegatedProperties[78], str);
    }

    public static final void setTrendingName(Aweme aweme, String str) {
        trendingName$delegate.setValue(aweme, $$delegatedProperties[79], str);
    }

    public static final void setUidZero(Aweme aweme, boolean z) {
        isUidZero$delegate.setValue(aweme, $$delegatedProperties[92], Boolean.valueOf(z));
    }

    public static final void setUserDislike(Aweme aweme, int i) {
        userDislike$delegate.setValue(aweme, $$delegatedProperties[21], Integer.valueOf(i));
    }

    public static final void setVibeFeedCoverList(Aweme aweme, List<? extends UrlModel> list) {
        vibeFeedCoverList$delegate.setValue(aweme, $$delegatedProperties[38], list);
    }

    public static final void setWithSearchSurvey(Aweme aweme, boolean z) {
        withSearchSurvey$delegate.setValue(aweme, $$delegatedProperties[69], Boolean.valueOf(z));
    }

    public static final void setSubAweme(Aweme aweme, Aweme aweme2) {
        subAweme$delegate.setValue(aweme, $$delegatedProperties[131], aweme2);
    }

    public static final void setUserDislike(Aweme aweme, boolean z) {
        setUserDislike(aweme, z ? 1 : 0);
    }

    public static final void handleInteractionBubbleLike(Aweme aweme, boolean z, User user) {
        InteractionBubbles.Builder builderCopy = getInteractionBubbles(aweme).copy();
        builderCopy.handleLike(z, user);
        setInteractionBubbles(aweme, builderCopy.build());
    }

    public static final void setInteractionBubbleComments(Aweme aweme, List<? extends Comment> list, long j) {
        InteractionBubbles.Builder builderCopy = getInteractionBubbles(aweme).copy();
        builderCopy.commentData(list, j);
        setInteractionBubbles(aweme, builderCopy.build());
    }

    public static final void setInteractionBubbleLikes(Aweme aweme, List<? extends User> list, boolean z, long j, long j2) {
        InteractionBubbles.Builder builderCopy = getInteractionBubbles(aweme).copy();
        builderCopy.likeData(list, z, j, j2);
        setInteractionBubbles(aweme, builderCopy.build());
    }
}
