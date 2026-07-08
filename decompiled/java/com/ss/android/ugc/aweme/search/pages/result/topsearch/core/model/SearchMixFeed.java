package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import X.C0PCB;
import X.C0PFN;
import X.C0PL6;
import X.C0PLS;
import X.C0PVY;
import X.C1017070cZd;
import X.C1227904rF;
import X.C138300ft;
import X.C13BV;
import X.C13LP;
import X.C321460Ciu;
import X.C587350N1x;
import X.C679490Ql1;
import X.InterfaceC594520NTm;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data.BrandZoneCard;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.o;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.ss.android.ugc.aweme.discover.model.SearchMinis;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.search.AIAdCardStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchInflowMultiAdCardStruct;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.CollectionLive;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchOperationInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.core.model.FeedbackCard;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.NimbleCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.fusioncard.Top1SummaryCard;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.StreamParam;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.SummaryInfo;
import com.ss.android.ugc.aweme.search.pages.result.pov.model.Top1MultiSummary;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.helppost.model.SearchHelpPostCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model.SearchPreciseAd;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.viralsong.ViralSongCard;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.model.ImageCollectionCardData;
import com.ss.android.ugc.aweme.search.pages.visualsearch.model.TryOnStruct;
import com.ss.android.ugc.aweme.search.performance.core.model.PreloadImg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class SearchMixFeed extends SearchMixFeedBase implements Serializable {
    public C0PCB LL;
    public boolean LLILLL;
    public String LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public LogPbBean LLIZLLLIL;
    public C679490Ql1 LLJ;
    public C0PLS LLJI;
    public boolean LLJILJILJ;

    @C09CT("action_bar")
    public SearchMixCardActionBar actionBar;

    @C09CT("featured_aggregated")
    public AggregatedVideo aggregatedVideo;

    @C09CT("aggregation_pros_cons")
    public Map<String, Object> aggregationProsCons;

    @C09CT("ai_ad_card")
    public AIAdCardStruct aiAdCard;
    public boolean alreadyLayout;

    @C09CT("aweme_info")
    public Aweme aweme;
    public List<Aweme> awemePoolAwemeList;

    @C09CT("tikbot")
    public TakoInfo bot;

    @C09CT("brand_zone_card")
    public BrandZoneCard brandZoneCard;

    @C09CT("card_profile")
    public SearchMixCardProfile cardProfile;

    @C09CT("challenge_list")
    public List<SearchChallenge> challengeList;

    @C09CT("collection_live")
    public CollectionLive collectionLive;

    @C09CT("comment_list")
    public List<Comment> commentList;

    @C09CT("common_aladdin")
    public CommonAladdin commonAladdin;

    @C09CT("doc_id")
    public long docId;

    @C09CT("dynamic_patch")
    public DynamicPatch dynamicPatch;

    @C09CT("entity_card")
    public SearchHubEntityCard entityCard;

    @C09CT("feature_account_title")
    public String featuredAccountTitle;

    @C09CT("feedback_card")
    public FeedbackCard feedbackCard;

    @C09CT("related_search_card_group_position")
    public int groupPosition;

    @C09CT("has_top_user")
    public boolean hasTopUser;

    @C09CT("hotspot_info")
    public SearchSpot hotSpot;

    @C09CT("image_collection_card")
    public ImageCollectionCardData imageLoadMoreData;
    public boolean isReal;

    @C09CT("lynx_ssr_info")
    public LynxSSRInfo lynxSSRInfo;

    @C09CT("ala_src")
    public String mAlaSrc;

    @C09CT("words_query_record")
    public RecommendWordMob mRecommendWordMob;

    @C09CT("mini_game")
    public SearchMinis miniGame;

    @C09CT("minis")
    public SearchMinis minis;

    @C09CT("nimble_card_info")
    public NimbleCardInfo nimbleCardInfo;

    @C09CT("activity_info")
    public SearchOperationInfo operation;

    @C09CT("polling")
    public PollingInfo polling;

    @C09CT("precise_ad")
    public SearchPreciseAd preciseAd;

    @C09CT("preload_img")
    public PreloadImg preloadImg;

    @C09CT("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @C09CT("related_word_list")
    public List<RelatedWord> relatedWordList;

    @C09CT("review_aggregation")
    public Map<String, Object> reviewAggregation;

    @C09CT("search_aweme_info")
    public SearchAwemeInfo searchAwemeInfo;

    @C09CT("card_info")
    public SearchCardInfo searchCardInfo;

    @C09CT("help_post_card")
    public SearchHelpPostCard searchHelpPostCard;

    @C09CT("search_lyrics")
    public SearchLyrics searchLyrics;

    @C09CT("should_hide_title")
    public Boolean shouldHideTitle;

    @C09CT("tako_sug_words_card")
    public TakoSugWordCard sugCard;

    @C09CT("tako_waiting_list_card")
    public TakoWaitingListCard takoWaitingListCard;

    @C09CT("top1_multi_summary")
    public Top1MultiSummary top1MultiSummary;

    @C09CT("summary_card")
    public Top1SummaryCard top1SummaryCard;

    @C09CT("tryon_card")
    public TryOnStruct tryOnCard;

    @C09CT("user_list")
    public List<SearchUser> users;

    @C09CT("viral_song_card")
    public ViralSongCard viralSongCard;

    @C09CT("view_more")
    public boolean isShowViewMore = true;
    public int LLILLJJLI = -1;
    public String LLILZ = "";
    public transient int chunkID = -1;
    public final int LLJIJIL = C321460Ciu.LIZ();
    public boolean LLJILJIL = false;
    public int LLJILLL = -1;

    public String getABaseId() {
        String str;
        SummaryInfo summaryInfo;
        if (this.LLILZLL == null) {
            Top1MultiSummary top1MultiSummary = getTop1MultiSummary();
            String str2 = "";
            if (top1MultiSummary == null || (summaryInfo = top1MultiSummary.getSummaryInfo()) == null || (str = summaryInfo.streamParam) == null) {
                str = "";
            }
            if (Intrinsics.LJFF(str, "")) {
                setABaseId("");
            } else {
                try {
                    C1227904rF.LIZ.getClass();
                    String str3 = ((StreamParam) GsonProtectorUtils.fromJson(C1227904rF.LIZLLL(), str, StreamParam.class)).aBaseKey;
                    if (str3 != null) {
                        str2 = str3;
                    }
                } catch (o e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                setABaseId(str2);
            }
        }
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase
    public Set<String> getAdCidList() {
        AwemeRawAd rawAdData;
        String creativeIdStr;
        List<? extends Map<?, ?>> list;
        String strValueOf;
        Map map;
        Aweme aweme;
        String strLIZ;
        String strLIZ2;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        List<String> list2;
        List<Aweme> awemeList;
        List list3;
        List<Aweme> awemeList2;
        Integer num = this.docType;
        if (num != null) {
            if (num.intValue() == 10003) {
                DynamicPatch dynamicPatch = getDynamicPatch();
                if (dynamicPatch == null || (awemeList2 = dynamicPatch.getAwemeList()) == null) {
                    awemeList2 = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Aweme> it2 = awemeList2.iterator();
                while (it2.hasNext()) {
                    String strLIZ3 = C0PL6.LIZ(it2.next());
                    if (strLIZ3 != null) {
                        arrayList.add(strLIZ3);
                    }
                }
                return C13LP.LLIIJI(arrayList);
            }
            if (num.intValue() == 187) {
                CollectionLive collectionLive = getCollectionLive();
                if (collectionLive == null || (list3 = collectionLive.lives) == null) {
                    list3 = C13BV.INSTANCE;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    String strLIZ4 = C0PL6.LIZ((Aweme) it3.next());
                    if (strLIZ4 != null) {
                        arrayList2.add(strLIZ4);
                    }
                }
                return C13LP.LLIIJI(arrayList2);
            }
            if (num.intValue() == 180) {
                DynamicPatch dynamicPatch2 = getDynamicPatch();
                if (dynamicPatch2 == null || (awemeList = dynamicPatch2.getAwemeList()) == null) {
                    awemeList = C13BV.INSTANCE;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator<Aweme> it4 = awemeList.iterator();
                while (it4.hasNext()) {
                    String strLIZ5 = C0PL6.LIZ(it4.next());
                    if (strLIZ5 != null) {
                        arrayList3.add(strLIZ5);
                    }
                }
                return C13LP.LLIIJI(arrayList3);
            }
            if (num.intValue() == 10008) {
                DynamicPatch dynamicPatch3 = getDynamicPatch();
                return C13LP.LLIIJI(C13LP.LJJJJLI((dynamicPatch3 == null || (list2 = dynamicPatch3.createIds) == null) ? C13BV.INSTANCE : new ArrayList(list2)));
            }
        }
        Aweme aweme2 = getAweme();
        if (((aweme2 == null || (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme2)) == null || !awemeRawAdLJJIJLIJ.isSoftAd) ? false : true) || (aweme2 != null && AwemeExtKt.isPseudoAd(aweme2))) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (aweme2 != null && aweme2.isAd() && (strLIZ2 = C587350N1x.LIZ(aweme2)) != null) {
            linkedHashSet.add(strLIZ2);
        }
        SingleLive singleLive = this.singleLive;
        if (singleLive != null && (aweme = singleLive.aweme) != null && (strLIZ = C587350N1x.LIZ(aweme)) != null) {
            linkedHashSet.add(strLIZ);
        }
        SearchInflowMultiAdCardStruct searchInflowMultiAdCardStruct = this.multiAdCard;
        if (searchInflowMultiAdCardStruct != null && (list = searchInflowMultiAdCardStruct.awemeListRaw) != null && !list.isEmpty()) {
            Iterator<? extends Map<?, ?>> it5 = list.iterator();
            while (it5.hasNext()) {
                Map<?, ?> next = it5.next();
                Object obj = next != null ? next.get("raw_ad_data") : null;
                Object obj2 = (!(obj instanceof Map) || (map = (Map) obj) == null) ? null : map.get("creative_id");
                if (obj2 instanceof Double) {
                    strValueOf = String.valueOf((long) ((Number) obj2).doubleValue());
                } else if (obj2 != null) {
                    strValueOf = obj2.toString();
                }
                if (strValueOf != null) {
                    linkedHashSet.add(strValueOf);
                }
            }
        }
        BrandZoneCard brandZoneCard = this.brandZoneCard;
        if (brandZoneCard != null && (rawAdData = brandZoneCard.getRawAdData()) != null && (creativeIdStr = rawAdData.getCreativeIdStr()) != null) {
            linkedHashSet.add(creativeIdStr);
        }
        return linkedHashSet;
    }

    public String getCardTitle() {
        return TextUtils.isEmpty(this.cardTitle) ? "" : this.cardTitle;
    }

    public DynamicPatch getDynamicPatch() {
        DynamicPatch dynamicPatch = this.dynamicPatch;
        if (dynamicPatch != null) {
            dynamicPatch.setDocId(this.providerDocIdStr);
        }
        return this.dynamicPatch;
    }

    public String getFeaturedAccountTitle() {
        return TextUtils.isEmpty(this.featuredAccountTitle) ? "" : this.featuredAccountTitle;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase, X.C0PLT
    public int getFeedType() {
        int i = this.feedType;
        if (i == 1) {
            return 65280;
        }
        if (i == 2) {
            return 65456;
        }
        if (i == 4) {
            return 65458;
        }
        if (i == 6) {
            return 37;
        }
        if (i == 12) {
            return 65467;
        }
        if (i == 46) {
            return 65515;
        }
        if (i == 701 || i == 801) {
            return 65280;
        }
        if (i == 998) {
            return this.searchCardInfo != null ? 998 : -1;
        }
        if (i != 999) {
            return i;
        }
        return 65514;
    }

    public boolean hasAggregatedVideoCreationIntention() {
        Boolean bool;
        AggregatedVideo aggregatedVideo = this.aggregatedVideo;
        if (aggregatedVideo == null || (bool = aggregatedVideo.showInflowUseSoundButton) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean isAggregatedVideo() {
        return this.feedType == 36;
    }

    public boolean isAweme() {
        return this.feedType == 1;
    }

    public boolean isMusicAggregatedVideo() {
        int i = this.feedType;
        return i == 41 || i == 42;
    }

    public boolean isNimble() {
        return this.feedType == 205;
    }

    public boolean isNimbleContainerCard() {
        int i = this.feedType;
        return i == 217 || i == 216;
    }

    public boolean isOnlinePovCard() {
        if (this.feedType != 206) {
            return ((Boolean) C138300ft.LIZ.getValue()).booleanValue() && this.feedType == 241;
        }
        return true;
    }

    public boolean isQrecVirtualEnable() {
        return "1".equals(this.qrecVirtualEnable);
    }

    public boolean isTako() {
        return this.feedType == 35;
    }

    public boolean isTop1Card() {
        String str;
        SearchMixCardProfile searchMixCardProfile = this.cardProfile;
        return (searchMixCardProfile == null || (str = searchMixCardProfile.uniqueId) == null || str.isEmpty()) ? false : true;
    }

    public boolean isTrendingNativeData() {
        SearchSpot searchSpot = this.hotSpot;
        return searchSpot != null && searchSpot.isHotspotDegradation();
    }

    public boolean isViralSongCard() {
        return this.feedType == 57;
    }

    public boolean isVisualSearchAweme() {
        return this.feedType == 801;
    }

    public boolean isVisualSearchCard() {
        int i = this.feedType;
        return i == 701 || i == 801 || i == 803 || i == 805;
    }

    public boolean isVisualSearchOnlinePovCard() {
        return this.feedType == 803;
    }

    public boolean isVisualSearchTryOnCard() {
        return this.feedType == 805;
    }

    public boolean needShowShootBtn() {
        Boolean bool;
        AggregatedVideo aggregatedVideo = this.aggregatedVideo;
        if (aggregatedVideo == null || (bool = aggregatedVideo.showUseSoundButton) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase
    public String getImprId() {
        return getLobPb().getImprId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase
    public int hashCode() {
        String str;
        int iHashCode = super.hashCode() * 31;
        Aweme aweme = this.aweme;
        int iHashCode2 = (iHashCode + (aweme != null ? aweme.hashCode() : 0)) * 31;
        List<SearchUser> list = this.users;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<Comment> list2 = this.commentList;
        int iHashCode4 = (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<SearchChallenge> list3 = this.challengeList;
        int iHashCode5 = (iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<RelatedWord> list4 = this.relatedWordList;
        int iHashCode6 = (iHashCode5 + (list4 != null ? list4.hashCode() : 0)) * 31;
        DynamicPatch dynamicPatch = this.dynamicPatch;
        int iHashCode7 = (iHashCode6 + (dynamicPatch != null ? dynamicPatch.hashCode() : 0)) * 31;
        String str2 = this.featuredAccountTitle;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        SearchCardInfo searchCardInfo = this.searchCardInfo;
        int iHashCode9 = (iHashCode8 + (searchCardInfo != null ? searchCardInfo.hashCode() : 0)) * 31;
        SearchSpot searchSpot = this.hotSpot;
        int iHashCode10 = (iHashCode9 + (searchSpot != null ? searchSpot.hashCode() : 0)) * 31;
        AggregatedVideo aggregatedVideo = this.aggregatedVideo;
        int iHashCode11 = (iHashCode10 + (aggregatedVideo != null ? aggregatedVideo.hashCode() : 0)) * 31;
        CollectionLive collectionLive = this.collectionLive;
        int iHashCode12 = (iHashCode11 + (collectionLive != null ? collectionLive.hashCode() : 0)) * 31;
        SearchHelpPostCard searchHelpPostCard = this.searchHelpPostCard;
        int iHashCode13 = (((iHashCode12 + (searchHelpPostCard != null ? searchHelpPostCard.hashCode() : 0)) * 31) + ((this.searchHelpPostCard == null || (str = this.providerDocIdStr) == null) ? 0 : str.hashCode())) * 31;
        Top1MultiSummary top1MultiSummary = this.top1MultiSummary;
        int iHashCode14 = (iHashCode13 + (top1MultiSummary != null ? top1MultiSummary.hashCode() : 0)) * 31;
        Top1SummaryCard top1SummaryCard = this.top1SummaryCard;
        int iHashCode15 = iHashCode14 + (top1SummaryCard != null ? top1SummaryCard.hashCode() : 0);
        if (!(this instanceof C0PFN)) {
            return iHashCode15;
        }
        InterfaceC594520NTm interfaceC594520NTmLIZ = ((C0PFN) this).LIZ();
        return (iHashCode15 * 31) + (interfaceC594520NTmLIZ != null ? interfaceC594520NTmLIZ.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase
    public boolean isCustomContent() {
        return getFeedType() == 65465;
    }

    public boolean isSingluarCard() {
        AggregatedVideo aggregatedVideo;
        List<Aweme> list;
        Aweme aweme;
        if (getFeedType() == 65280 && (aweme = this.aweme) != null && AwemeExtKt.isPhotoMode(aweme)) {
            return true;
        }
        return isAggregatedVideo() && (aggregatedVideo = this.aggregatedVideo) != null && (list = aggregatedVideo.awemes) != null && list.size() >= 3;
    }

    public SearchMixCardActionBar getActionBar() {
        return this.actionBar;
    }

    public AggregatedVideo getAggregatedVideo() {
        return this.aggregatedVideo;
    }

    public Map<String, Object> getAggregationProsCons() {
        return this.aggregationProsCons;
    }

    public AIAdCardStruct getAiAdCard() {
        return this.aiAdCard;
    }

    public String getAlaSrc() {
        return this.mAlaSrc;
    }

    @Override // X.C0PLT
    public Aweme getAweme() {
        return this.aweme;
    }

    public TakoInfo getBot() {
        return this.bot;
    }

    public BrandZoneCard getBrandZoneCard() {
        return this.brandZoneCard;
    }

    public int getCardIndex() {
        return this.LLILLJJLI;
    }

    public SearchMixCardProfile getCardProfile() {
        return this.cardProfile;
    }

    public List<SearchChallenge> getChallengeList() {
        return this.challengeList;
    }

    public CollectionLive getCollectionLive() {
        return this.collectionLive;
    }

    @Override // X.C0PLT
    public List<Comment> getCommentList() {
        return this.commentList;
    }

    public CommonAladdin getCommonAladdin() {
        return this.commonAladdin;
    }

    public C0PCB getCustomContent() {
        return this.LL;
    }

    public long getDocId() {
        return this.docId;
    }

    public SearchHubEntityCard getEntityCard() {
        return this.entityCard;
    }

    public String getEntityType() {
        return this.LLILZIL;
    }

    public String getEntryVideoId() {
        return this.LLILZ;
    }

    public FeedbackCard getFeedbackCard() {
        return this.feedbackCard;
    }

    public String getFeedbackType() {
        return this.feedbackType;
    }

    public int getGroupPosition() {
        return this.groupPosition;
    }

    public SearchSpot getHotSpot() {
        return this.hotSpot;
    }

    public ImageCollectionCardData getImageLoadMoreData() {
        return this.imageLoadMoreData;
    }

    public LogPbBean getLobPb() {
        return this.LLIZLLLIL;
    }

    public LynxSSRInfo getLynxSSRInfo() {
        return this.lynxSSRInfo;
    }

    public NimbleCardInfo getNimbleCardInfo() {
        return this.nimbleCardInfo;
    }

    public SearchOperationInfo getOperationInfo() {
        return this.operation;
    }

    public int getOriginFeedType() {
        return this.feedType;
    }

    public PollingInfo getPolling() {
        return this.polling;
    }

    public SearchPreciseAd getPreciseAd() {
        return this.preciseAd;
    }

    public PreloadImg getPreloadImg() {
        return this.preloadImg;
    }

    public String getProviderDocIdStr() {
        return this.providerDocIdStr;
    }

    public int getRank() {
        return this.rank;
    }

    public RecommendWordMob getRecommendWordMob() {
        return this.mRecommendWordMob;
    }

    public List<RelatedWord> getRelatedWordList() {
        return this.relatedWordList;
    }

    public Map<String, Object> getReviewAggregation() {
        return this.reviewAggregation;
    }

    public SearchAwemeInfo getSearchAwemeInfo() {
        return this.searchAwemeInfo;
    }

    public SearchCardInfo getSearchCardInfo() {
        return this.searchCardInfo;
    }

    public C0PLS getSearchCardPosInfo() {
        return this.LLJI;
    }

    public C679490Ql1 getSearchCardUiInfo() {
        return this.LLJ;
    }

    public SearchHelpPostCard getSearchHelpPostCard() {
        return this.searchHelpPostCard;
    }

    public Boolean getShouldHideTitle() {
        return this.shouldHideTitle;
    }

    public int getSmartSearchFeedTypeVal() {
        return this.LLJILLL;
    }

    public TakoSugWordCard getSugCard() {
        return this.sugCard;
    }

    public Top1MultiSummary getTop1MultiSummary() {
        return this.top1MultiSummary;
    }

    public Top1SummaryCard getTop1SummaryCard() {
        return this.top1SummaryCard;
    }

    public TryOnStruct getTryOnCard() {
        return this.tryOnCard;
    }

    public List<SearchUser> getUsers() {
        return this.users;
    }

    public ViralSongCard getViralSongCard() {
        return this.viralSongCard;
    }

    public boolean isAggregatedVideoHistoryEntrance() {
        return this.LLIZ;
    }

    public boolean isEntrance() {
        return this.LLILLL;
    }

    public boolean isHasTopUser() {
        return this.hasTopUser;
    }

    public boolean isSearchHubSubCard() {
        return this.LLJILJIL;
    }

    public boolean isShowViewMore() {
        return this.isShowViewMore;
    }

    public boolean isWeakEntity() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC594520NTm
    public int retrieveIncrementalId() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchMixFeed)) {
            return false;
        }
        SearchMixFeed searchMixFeed = (SearchMixFeed) obj;
        if (this.feedType != searchMixFeed.feedType || !C0PVY.LIZ(this.aweme, searchMixFeed.aweme) || !C0PVY.LIZ(this.users, searchMixFeed.users) || !C0PVY.LIZ(this.commentList, searchMixFeed.commentList) || !C0PVY.LIZ(this.challengeList, searchMixFeed.challengeList) || !C0PVY.LIZ(this.relatedWordList, searchMixFeed.relatedWordList) || !C0PVY.LIZ(this.dynamicPatch, searchMixFeed.dynamicPatch) || !C0PVY.LIZ(this.featuredAccountTitle, searchMixFeed.featuredAccountTitle) || !C0PVY.LIZ(this.hotSpot, searchMixFeed.hotSpot) || !C0PVY.LIZ(this.aggregatedVideo, searchMixFeed.aggregatedVideo) || !C0PVY.LIZ(this.bot, searchMixFeed.bot) || !C0PVY.LIZ(this.minis, searchMixFeed.minis) || !C0PVY.LIZ(this.miniGame, searchMixFeed.miniGame) || !C0PVY.LIZ(this.top1MultiSummary, searchMixFeed.top1MultiSummary) || !C0PVY.LIZ(this.top1SummaryCard, searchMixFeed.top1SummaryCard) || !C0PVY.LIZ(this.aiAdCard, searchMixFeed.aiAdCard) || !C0PVY.LIZ(this.searchHelpPostCard, searchMixFeed.searchHelpPostCard)) {
            return false;
        }
        if (this instanceof C0PFN) {
            InterfaceC594520NTm interfaceC594520NTmLIZ = ((C0PFN) this).LIZ();
            if (!(searchMixFeed instanceof C0PFN) || !C0PVY.LIZ(interfaceC594520NTmLIZ, ((C0PFN) searchMixFeed).LIZ())) {
                return false;
            }
        }
        return C0PVY.LIZ(this.collectionLive, searchMixFeed.collectionLive);
    }

    public void setABaseId(String str) {
        this.LLILZLL = str;
    }

    public void setActionBar(SearchMixCardActionBar searchMixCardActionBar) {
        this.actionBar = searchMixCardActionBar;
    }

    public void setAiAdCard(AIAdCardStruct aIAdCardStruct) {
        this.aiAdCard = aIAdCardStruct;
    }

    public void setAlaSrc(String str) {
        this.mAlaSrc = str;
    }

    @Override // X.C0PLT
    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public void setBot(TakoInfo takoInfo) {
        this.bot = takoInfo;
    }

    public void setBrandZoneCard(BrandZoneCard brandZoneCard) {
        this.brandZoneCard = brandZoneCard;
    }

    public void setCardIndex(int i) {
        this.LLILLJJLI = i;
    }

    public void setCardProfile(SearchMixCardProfile searchMixCardProfile) {
        this.cardProfile = searchMixCardProfile;
    }

    public void setCardTitle(String str) {
        this.cardTitle = str;
    }

    public void setCollectionLive(CollectionLive collectionLive) {
        this.collectionLive = collectionLive;
    }

    public void setCommonAladdin(CommonAladdin commonAladdin) {
        this.commonAladdin = commonAladdin;
    }

    public void setCustomContent(C0PCB c0pcb) {
        this.LL = c0pcb;
    }

    public void setDynamicPatch(DynamicPatch dynamicPatch) {
        this.dynamicPatch = dynamicPatch;
    }

    public void setEntityType(String str) {
        this.LLILZIL = str;
    }

    public void setEntryVideoId(String str) {
        this.LLILZ = str;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase, X.C0PLT
    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setFeedbackType(String str) {
        this.feedbackType = str;
    }

    public void setGroupPosition(int i) {
        this.groupPosition = i;
    }

    public void setHasTopUser(boolean z) {
        this.hasTopUser = z;
    }

    public void setIsAggregatedVideoHistoryEntrance(boolean z) {
        this.LLIZ = z;
    }

    public void setIsEntrance(boolean z) {
        this.LLILLL = z;
    }

    public void setIsWeakEntity(boolean z) {
        this.LLJILJILJ = z;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.LLIZLLLIL = logPbBean;
    }

    public void setNimbleCardInfo(NimbleCardInfo nimbleCardInfo) {
        this.nimbleCardInfo = nimbleCardInfo;
    }

    public void setPolling(PollingInfo pollingInfo) {
        this.polling = pollingInfo;
    }

    public void setPreloadImg(PreloadImg preloadImg) {
        this.preloadImg = preloadImg;
    }

    public void setProviderDocIdStr(String str) {
        this.providerDocIdStr = str;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    @Override // X.C0PLT, X.C0X12
    public void setRequestId(String str) {
        super.setRequestId(str);
        Aweme aweme = this.aweme;
        if (aweme != null) {
            aweme.setRequestId(str);
        }
    }

    public void setSearchCardInto(SearchCardInfo searchCardInfo) {
        this.searchCardInfo = searchCardInfo;
    }

    public void setSearchCardPosInfo(C0PLS c0pls) {
        this.LLJI = c0pls;
    }

    public void setSearchCardUiInfo(C679490Ql1 c679490Ql1) {
        this.LLJ = c679490Ql1;
    }

    public void setSearchHubSubCard(boolean z) {
        this.LLJILJIL = z;
    }

    public void setSearchPreciseAd(SearchPreciseAd searchPreciseAd) {
        this.preciseAd = searchPreciseAd;
    }

    public void setShowViewMore(boolean z) {
        this.isShowViewMore = z;
    }

    public void setSmartSearchFeedTypeVal(int i) {
        this.LLJILLL = i;
    }

    public void setSugCard(TakoSugWordCard takoSugWordCard) {
        this.sugCard = takoSugWordCard;
    }

    public void setTop1MultiSummary(Top1MultiSummary top1MultiSummary) {
        this.top1MultiSummary = top1MultiSummary;
    }

    public void setTop1SummaryCard(Top1SummaryCard top1SummaryCard) {
        this.top1SummaryCard = top1SummaryCard;
    }

    public void setUsers(List<SearchUser> list) {
        this.users = list;
    }
}
