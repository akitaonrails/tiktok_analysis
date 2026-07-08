package com.ss.android.ugc.aweme.feed.model;

import X.C01GW;
import X.C0R6I;
import X.C452501pT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbles;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.commerce.model.SimplePromotion;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeBizFieldDeserializer implements j<Aweme> {
    public final C01GW gson$delegate = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(65));

    private final Gson getGson() {
        return (Gson) this.gson$delegate.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.j
    public Aweme deserialize(k kVar, Type type, i iVar) {
        if (kVar != null) {
            try {
                if (kVar.LJJ()) {
                    n nVarLJIILIIL = kVar.LJIILIIL();
                    Aweme aweme = (Aweme) getGson().LIZJ(nVarLJIILIIL, Aweme.class);
                    if (nVarLJIILIIL.LJJIJIIJIL("user_dislike")) {
                        AwemeBizExtKt.setUserDislike(aweme, nVarLJIILIIL.LJJIIZ("user_dislike").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("fromRawChallenge")) {
                        AwemeBizExtKt.setFromRawChallenge(aweme, (Challenge) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("fromRawChallenge").LJIILIIL(), Challenge.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("scenario")) {
                        AwemeBizExtKt.setScenario(aweme, nVarLJIILIIL.LJJIIZ("scenario").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("law_critical_country")) {
                        AwemeBizExtKt.setLawCriticalCountry(aweme, nVarLJIILIIL.LJJIIZ("law_critical_country").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("shop_ad_struct")) {
                        AwemeBizExtKt.setShopAdStruct(aweme, (ShopAdStruct) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("shop_ad_struct").LJIILIIL(), ShopAdStruct.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("simplePromotions")) {
                        AwemeBizExtKt.setSimplePromotions(aweme, (List) getGson().LIZLLL(nVarLJIILIIL.LJJIIZ("simplePromotions").LJIIL(), new TypeToken<List<? extends SimplePromotion>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizFieldDeserializer$deserialize$listType$1
                        }.getType()));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("is_publishing")) {
                        AwemeBizExtKt.setPublishing(aweme, nVarLJIILIIL.LJJIIZ("is_publishing").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("is_local_aweme")) {
                        AwemeBizExtKt.setLocalUnpublishedAweme(aweme, nVarLJIILIIL.LJJIIZ("is_local_aweme").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("ignoreCheckPositionOfPostCard")) {
                        AwemeBizExtKt.setIgnoreCheckPositionOfPostCard(aweme, nVarLJIILIIL.LJJIIZ("ignoreCheckPositionOfPostCard").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isPhotoSwap")) {
                        AwemeBizExtKt.setPhotoSwap(aweme, nVarLJIILIIL.LJJIIZ("isPhotoSwap").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("hotSpot")) {
                        AwemeBizExtKt.setHotSpot(aweme, nVarLJIILIIL.LJJIIZ("hotSpot").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("sourceBtmToken")) {
                        AwemeBizExtKt.setSourceBtmToken(aweme, nVarLJIILIIL.LJJIIZ("sourceBtmToken").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("marketDropRule")) {
                        AwemeBizExtKt.setMarketDropRule(aweme, nVarLJIILIIL.LJJIIZ("marketDropRule").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isClientSeen")) {
                        AwemeBizExtKt.setClientSeen(aweme, nVarLJIILIIL.LJJIIZ("isClientSeen").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("contentDiffType")) {
                        AwemeBizExtKt.setContentDiffType(aweme, nVarLJIILIIL.LJJIIZ("contentDiffType").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isDesMoreTextShow")) {
                        AwemeBizExtKt.setDesMoreTextShow(aweme, nVarLJIILIIL.LJJIIZ("isDesMoreTextShow").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("anchorLiveDataBindSuccess")) {
                        AwemeBizExtKt.setAnchorLiveDataBindSuccess(aweme, nVarLJIILIIL.LJJIIZ("anchorLiveDataBindSuccess").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("vibeFeedCoverList")) {
                        AwemeBizExtKt.setVibeFeedCoverList(aweme, (List) getGson().LIZLLL(nVarLJIILIIL.LJJIIZ("vibeFeedCoverList").LJIIL(), new TypeToken<List<? extends UrlModel>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizFieldDeserializer$deserialize$listType$2
                        }.getType()));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("attachedVibeFeedId")) {
                        AwemeBizExtKt.setAttachedVibeFeedId(aweme, nVarLJIILIIL.LJJIIZ("attachedVibeFeedId").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("hasAd")) {
                        AwemeBizExtKt.setHasAd(aweme, nVarLJIILIIL.LJJIIZ("hasAd").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isPreloadScroll")) {
                        AwemeBizExtKt.setPreloadScroll(aweme, nVarLJIILIIL.LJJIIZ("isPreloadScroll").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isCommentClicked")) {
                        AwemeBizExtKt.setCommentClicked(aweme, nVarLJIILIIL.LJJIIZ("isCommentClicked").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isForwardClicked")) {
                        AwemeBizExtKt.setForwardClicked(aweme, nVarLJIILIIL.LJJIIZ("isForwardClicked").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("adDescMaxLines")) {
                        AwemeBizExtKt.setAdDescMaxLines(aweme, nVarLJIILIIL.LJJIIZ("adDescMaxLines").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("adDescHandle")) {
                        AwemeBizExtKt.setAdDescHandle(aweme, nVarLJIILIIL.LJJIIZ("adDescHandle").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isFakeResponse")) {
                        AwemeBizExtKt.setFakeResponse(aweme, nVarLJIILIIL.LJJIIZ("isFakeResponse").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isStoryFakeAweme")) {
                        AwemeBizExtKt.setStoryFakeAweme(aweme, nVarLJIILIIL.LJJIIZ("isStoryFakeAweme").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isFriendsTabV2FakeAweme")) {
                        AwemeBizExtKt.setFriendsTabV2FakeAweme(aweme, nVarLJIILIIL.LJJIIZ("isFriendsTabV2FakeAweme").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isFriendsV2PublishInserted")) {
                        AwemeBizExtKt.setFriendsV2PublishInserted(aweme, nVarLJIILIIL.LJJIIZ("isFriendsV2PublishInserted").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("hasFriendsTag")) {
                        AwemeBizExtKt.setHasFriendsTag(aweme, nVarLJIILIIL.LJJIIZ("hasFriendsTag").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isRecBigCardFakeAweme")) {
                        AwemeBizExtKt.setRecBigCardFakeAweme(aweme, nVarLJIILIIL.LJJIIZ("isRecBigCardFakeAweme").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("scheduleId")) {
                        AwemeBizExtKt.setScheduleId(aweme, nVarLJIILIIL.LJJIIZ("scheduleId").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isReferralFakeAweme")) {
                        AwemeBizExtKt.setReferralFakeAweme(aweme, nVarLJIILIIL.LJJIIZ("isReferralFakeAweme").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("referralFakeAwemeType")) {
                        AwemeBizExtKt.setReferralFakeAwemeType(aweme, nVarLJIILIIL.LJJIIZ("referralFakeAwemeType").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("liveMgCoverShowStyle")) {
                        AwemeBizExtKt.setLiveMgCoverShowStyle(aweme, nVarLJIILIIL.LJJIIZ("liveMgCoverShowStyle").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("repostFromGroupId")) {
                        AwemeBizExtKt.setRepostFromGroupId(aweme, nVarLJIILIIL.LJJIIZ("repostFromGroupId").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("repostFromUserId")) {
                        AwemeBizExtKt.setRepostFromUserId(aweme, nVarLJIILIIL.LJJIIZ("repostFromUserId").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("filterDuplicateTime")) {
                        AwemeBizExtKt.setFilterDuplicateTime(aweme, nVarLJIILIIL.LJJIIZ("filterDuplicateTime").LJIIZILJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("liveCardShowTime")) {
                        AwemeBizExtKt.setLiveCardShowTime(aweme, nVarLJIILIIL.LJJIIZ("liveCardShowTime").LJIIZILJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("liveCardLeaveTime")) {
                        AwemeBizExtKt.setLiveCardLeaveTime(aweme, nVarLJIILIIL.LJJIIZ("liveCardLeaveTime").LJIIZILJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("label_origin_author_text")) {
                        AwemeBizExtKt.setLabelOriginAuthorText(aweme, nVarLJIILIIL.LJJIIZ("label_origin_author_text").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("originalPos")) {
                        AwemeBizExtKt.setOriginalPos(aweme, nVarLJIILIIL.LJJIIZ("originalPos").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("feedCount")) {
                        AwemeBizExtKt.setFeedCount(aweme, nVarLJIILIIL.LJJIIZ("feedCount").LJIIZILJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("pullType")) {
                        AwemeBizExtKt.setPullType(aweme, nVarLJIILIIL.LJJIIZ("pullType").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("activity_id")) {
                        AwemeBizExtKt.setActivityId(aweme, nVarLJIILIIL.LJJIIZ("activity_id").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("new_source_type")) {
                        AwemeBizExtKt.setNewSourceType(aweme, nVarLJIILIIL.LJJIIZ("new_source_type").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("new_source_id")) {
                        AwemeBizExtKt.setNewSourceId(aweme, nVarLJIILIIL.LJJIIZ("new_source_id").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("withSearchSurvey")) {
                        AwemeBizExtKt.setWithSearchSurvey(aweme, nVarLJIILIIL.LJJIIZ("withSearchSurvey").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isEnableVideoSkip")) {
                        AwemeBizExtKt.setEnableVideoSkip(aweme, nVarLJIILIIL.LJJIIZ("isEnableVideoSkip").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("relevantTime")) {
                        AwemeBizExtKt.setRelevantTime(aweme, (List) getGson().LIZLLL(nVarLJIILIIL.LJJIIZ("relevantTime").LJIIL(), new TypeToken<List<? extends Float>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizFieldDeserializer$deserialize$listType$3
                        }.getType()));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("anchorWikiOfflineText")) {
                        AwemeBizExtKt.setAnchorWikiOfflineText(aweme, nVarLJIILIIL.LJJIIZ("anchorWikiOfflineText").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("searchDocOriginLanguage")) {
                        AwemeBizExtKt.setSearchDocOriginLanguage(aweme, nVarLJIILIIL.LJJIIZ("searchDocOriginLanguage").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("searchDocTranslate")) {
                        AwemeBizExtKt.setSearchDocTranslate(aweme, nVarLJIILIIL.LJJIIZ("searchDocTranslate").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("new_relation_label")) {
                        AwemeBizExtKt.setNewRelationLabel(aweme, (List) getGson().LIZLLL(nVarLJIILIIL.LJJIIZ("new_relation_label").LJIIL(), new TypeToken<List<? extends RelationLabelNew>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizFieldDeserializer$deserialize$listType$4
                        }.getType()));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isFromTrendingCard")) {
                        AwemeBizExtKt.setFromTrendingCard(aweme, nVarLJIILIIL.LJJIIZ("isFromTrendingCard").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("mRank")) {
                        AwemeBizExtKt.setRank(aweme, nVarLJIILIIL.LJJIIZ("mRank").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("trendingId")) {
                        AwemeBizExtKt.setTrendingId(aweme, nVarLJIILIIL.LJJIIZ("trendingId").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("trendingName")) {
                        AwemeBizExtKt.setTrendingName(aweme, nVarLJIILIIL.LJJIIZ("trendingName").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isStoryPacked")) {
                        AwemeBizExtKt.setStoryPacked(aweme, nVarLJIILIIL.LJJIIZ("isStoryPacked").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("awemePosition")) {
                        AwemeBizExtKt.setAwemePosition(aweme, nVarLJIILIIL.LJJIIZ("awemePosition").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("awemeCacheType")) {
                        AwemeBizOptExtKt.setAwemeCacheType(aweme, nVarLJIILIIL.LJJIIZ("awemeCacheType").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isPlaceHolder")) {
                        AwemeBizExtKt.setPlaceHolder(aweme, nVarLJIILIIL.LJJIIZ("isPlaceHolder").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("cacheSourceType")) {
                        AwemeBizExtKt.setCacheSourceType(aweme, nVarLJIILIIL.LJJIIZ("cacheSourceType").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("friends_music_title_style")) {
                        AwemeBizExtKt.setFriendsMusicTitleStyle(aweme, nVarLJIILIIL.LJJIIZ("friends_music_title_style").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("feedSource")) {
                        AwemeBizExtKt.setFeedSource(aweme, nVarLJIILIIL.LJJIIZ("feedSource").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("dmSenderUid")) {
                        AwemeBizExtKt.setDmSenderUid(aweme, nVarLJIILIIL.LJJIIZ("dmSenderUid").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("nuTriggerScene")) {
                        AwemeBizExtKt.setNuTriggerScene(aweme, nVarLJIILIIL.LJJIIZ("nuTriggerScene").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isTemplateDetailPinedTop")) {
                        AwemeBizExtKt.setTemplateDetailPinedTop(aweme, nVarLJIILIIL.LJJIIZ("isTemplateDetailPinedTop").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isTemplateOriginalAweme")) {
                        AwemeBizExtKt.setTemplateOriginalAweme(aweme, nVarLJIILIIL.LJJIIZ("isTemplateOriginalAweme").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isFriendVideoPresent")) {
                        AwemeBizExtKt.setFriendVideoPresent(aweme, nVarLJIILIIL.LJJIIZ("isFriendVideoPresent").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isFollowerVideoPresent")) {
                        AwemeBizExtKt.setFollowerVideoPresent(aweme, nVarLJIILIIL.LJJIIZ("isFollowerVideoPresent").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isUidZero")) {
                        AwemeBizExtKt.setUidZero(aweme, nVarLJIILIIL.LJJIIZ("isUidZero").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isDidZero")) {
                        AwemeBizExtKt.setDidZero(aweme, nVarLJIILIIL.LJJIIZ("isDidZero").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isAttrUpdated")) {
                        AwemeBizExtKt.setAttrUpdated(aweme, nVarLJIILIIL.LJJIIZ("isAttrUpdated").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("replaceRecTagByRepost")) {
                        AwemeBizExtKt.setReplaceRecTagByRepost(aweme, nVarLJIILIIL.LJJIIZ("replaceRecTagByRepost").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("disableMusicDspFreqCtrl")) {
                        AwemeBizExtKt.setDisableMusicDspFreqCtrl(aweme, nVarLJIILIIL.LJJIIZ("disableMusicDspFreqCtrl").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("hasCreationIntention")) {
                        AwemeBizExtKt.setHasCreationIntention(aweme, nVarLJIILIIL.LJJIIZ("hasCreationIntention").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("challengeId")) {
                        AwemeBizExtKt.setChallengeId(aweme, nVarLJIILIIL.LJJIIZ("challengeId").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("fakeAid")) {
                        AwemeBizExtKt.setFakeAid(aweme, nVarLJIILIIL.LJJIIZ("fakeAid").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("is_intext_occlude_tab")) {
                        AwemeBizExtKt.setIntextOccludeTab(aweme, nVarLJIILIIL.LJJIIZ("is_intext_occlude_tab").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("is_intext_occlude_interaction")) {
                        AwemeBizExtKt.setIntextOccludeInteraction(aweme, nVarLJIILIIL.LJJIIZ("is_intext_occlude_interaction").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("is_intext_out")) {
                        AwemeBizExtKt.setIntextOut(aweme, nVarLJIILIIL.LJJIIZ("is_intext_out").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("is_intext_occlude_desc")) {
                        AwemeBizExtKt.setIntextOccludeDesc(aweme, nVarLJIILIIL.LJJIIZ("is_intext_occlude_desc").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("clientAcceptanceTime")) {
                        AwemeBizExtKt.setClientAcceptanceTime(aweme, nVarLJIILIIL.LJJIIZ("clientAcceptanceTime").LJIIZILJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("positionInRequest")) {
                        AwemeBizExtKt.setPositionInRequest(aweme, nVarLJIILIIL.LJJIIZ("positionInRequest").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("sessionRequestPosition")) {
                        AwemeBizExtKt.setSessionRequestPosition(aweme, nVarLJIILIIL.LJJIIZ("sessionRequestPosition").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("mediaSafetyModel")) {
                        AwemeBizExtKt.setMediaSafetyModel(aweme, (C0R6I) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("mediaSafetyModel").LJIILIIL(), C0R6I.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("sharer")) {
                        AwemeBizExtKt.setSharer(aweme, (User) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("sharer").LJIILIIL(), User.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("repostUser")) {
                        AwemeBizExtKt.setRepostUser(aweme, (User) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("repostUser").LJIILIIL(), User.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("previewData")) {
                        AwemeBizExtKt.setPreviewData(aweme, (PublishPreviewInfo) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("previewData").LJIILIIL(), PublishPreviewInfo.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("icon")) {
                        AwemeBizExtKt.setIcon(aweme, (UrlModel) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("icon").LJIILIIL(), UrlModel.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("behindTheSongVideoType")) {
                        AwemeBizExtKt.setBehindTheSongVideoType(aweme, nVarLJIILIIL.LJJIIZ("behindTheSongVideoType").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isFriendsVideoUnread")) {
                        AwemeBizExtKt.setFriendsVideoUnread(aweme, nVarLJIILIIL.LJJIIZ("isFriendsVideoUnread").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("sessionPosition")) {
                        AwemeBizExtKt.setSessionPosition(aweme, nVarLJIILIIL.LJJIIZ("sessionPosition").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isForMusicDetailLoading")) {
                        AwemeBizExtKt.setForMusicDetailLoading(aweme, nVarLJIILIIL.LJJIIZ("isForMusicDetailLoading").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("livePreviewLongPressDisabled")) {
                        AwemeBizExtKt.setLivePreviewLongPressDisabled(aweme, nVarLJIILIIL.LJJIIZ("livePreviewLongPressDisabled").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("is_feature_video")) {
                        AwemeBizExtKt.setFeatureVideo(aweme, (VideoType) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("is_feature_video").LJIILIIL(), VideoType.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("livePreviewSize")) {
                        AwemeBizExtKt.setLivePreviewSize(aweme, (Integer[]) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("livePreviewSize").LJIIL(), Integer[].class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("rid")) {
                        AwemeBizExtKt.setRid(aweme, nVarLJIILIIL.LJJIIZ("rid").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("SearchTabRank")) {
                        AwemeBizExtKt.setSearchTabRank(aweme, Integer.valueOf(nVarLJIILIIL.LJJIIZ("SearchTabRank").LJIIJJI()));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("searchTabName")) {
                        AwemeBizExtKt.setSearchTabName(aweme, nVarLJIILIIL.LJJIIZ("searchTabName").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("searchFeedType")) {
                        AwemeBizExtKt.setSearchFeedType(aweme, nVarLJIILIIL.LJJIIZ("searchFeedType").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("mixFlowParam")) {
                        AwemeBizExtKt.setMixFlowParam(aweme, (MixFlowParam) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("mixFlowParam").LJIILIIL(), MixFlowParam.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isHighlighted")) {
                        AwemeBizExtKt.setHighlighted(aweme, nVarLJIILIIL.LJJIIZ("isHighlighted").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("subAwemeCover")) {
                        AwemeBizExtKt.setSubAwemeCover(aweme, (UrlModel) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("subAwemeCover").LJIILIIL(), UrlModel.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("isSubAweme")) {
                        AwemeBizExtKt.setSubAweme(aweme, nVarLJIILIIL.LJJIIZ("isSubAweme").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("hasDisplayLiveNoticeButton")) {
                        AwemeBizExtKt.setHasDisplayLiveNoticeButton(aweme, nVarLJIILIIL.LJJIIZ("hasDisplayLiveNoticeButton").LJ());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("captionReturnCount")) {
                        AwemeBizExtKt.setCaptionReturnCount(aweme, nVarLJIILIIL.LJJIIZ("captionReturnCount").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("captionLength")) {
                        AwemeBizExtKt.setCaptionLength(aweme, nVarLJIILIIL.LJJIIZ("captionLength").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("fcp_protocol")) {
                        AwemeBizOptExtKt.setFcpProtocol(aweme, nVarLJIILIIL.LJJIIZ("fcp_protocol").LJIL());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("anchorCustomData")) {
                        AwemeBizExtKt.setAnchorCustomData(aweme, (AnchorCustomData) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("anchorCustomData").LJIILIIL(), AnchorCustomData.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("subAweme")) {
                        AwemeBizExtKt.setSubAweme(aweme, (Aweme) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("subAweme").LJIILIIL(), Aweme.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("cachedLiveRoomStruct")) {
                        AwemeBizExtKt.setCachedLiveRoomStruct(aweme, (LiveRoomStruct) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("cachedLiveRoomStruct").LJIILIIL(), LiveRoomStruct.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("interactionBubbles")) {
                        AwemeBizExtKt.setInteractionBubbles(aweme, (InteractionBubbles) getGson().LIZJ(nVarLJIILIIL.LJJIIZ("interactionBubbles").LJIILIIL(), InteractionBubbles.class));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("searchExtraParams")) {
                        AwemeBizExtKt.setSearchExtraParams(aweme, (HashMap) getGson().LIZLLL(nVarLJIILIIL.LJJIIZ("searchExtraParams").LJIILIIL(), new TypeToken<Map<String, ? extends String>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizFieldDeserializer$deserialize$type$1
                        }.getType()));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("identifier")) {
                        AwemeBizExtKt.setIdentifier(aweme, (Map) getGson().LIZLLL(nVarLJIILIIL.LJJIIZ("identifier").LJIILIIL(), new TypeToken<Map<String, ? extends String>>() { // from class: com.ss.android.ugc.aweme.feed.model.AwemeBizFieldDeserializer$deserialize$type$2
                        }.getType()));
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("realtimeFollowStatus")) {
                        AwemeBizExtKt.setRealtimeFollowStatus(aweme, nVarLJIILIIL.LJJIIZ("realtimeFollowStatus").LJIIJJI());
                    }
                    if (nVarLJIILIIL.LJJIJIIJIL("consumeFollowGuide")) {
                        AwemeBizExtKt.setConsumeFollowGuide(aweme, nVarLJIILIIL.LJJIIZ("consumeFollowGuide").LJ());
                    }
                    return aweme;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.v3();
                return null;
            }
        }
        return null;
    }
}
