package com.ss.android.ugc.aweme.search.model;

import X.C0PSG;
import X.C0Q3S;
import X.C0Q3T;
import X.C0QER;
import X.C0QXN;
import X.C1ER1;
import X.C20472080g;
import X.C666840QDq;
import X.C669650QOl;
import X.C672610QZv;
import X.EnumC669620QOi;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.SmartSearchInfoStruct;
import com.ss.android.ugc.aweme.feed.model.search.VisualSearchInfoStruct;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class SearchResultParam implements Serializable, Cloneable {
    public static final long serialVersionUID = -6308997306432769373L;
    public String appName;
    public String appTheme;
    public final C0Q3S attachProductsInfo;
    public int bindingId;
    public String blankPageID;
    public String btmUpdateBtmToken;
    public String bubbleTextType;
    public String bubbleType;
    public boolean canStartProxyFragment;
    public C20472080g capsuleWords;
    public String captionRating;
    public Long clickMoreTime;
    public String clickUserId;
    public String displaySevenSplitScreen;
    public boolean doShopResultPreload;
    public String docRank;
    public String ecParamInCurrentSearch;
    public String ecPenetrateInfo;
    public Map<String, Object> ecSearchCommonParamsFromMiddle;
    public Map<String, String> ecSuggestWordsExtraMobMap;
    public String ecTokenType;
    public Map<String, Object> ecomRecomSearchParamMap;
    public EnumC669620QOi ecomTargetTab;
    public C0QXN ecommerceNewUserModel;
    public long endToEndSession;
    public String enterFromSecond;
    public String enterFromSub;
    public String enterMethod;
    public int entityTabIndex;
    public String eventKeyword;
    public String eventType;
    public String feContext;
    public Map<String, String> feMobMap;
    public C0PSG filterOption;
    public String filtersData;
    public String fromPromotionText;
    public int fromPromotionType;
    public String fromSearchSubtag;
    public int generalSearchSortType;
    public String groupId;
    public String groupPosition;
    public String hasCoinEntrance;
    public String hasSasIcon;
    public String hashtagId;
    public Set<String> hiddenTabNames;
    public int index;
    public String interveneCards;
    public String interventionVideoIds;
    public Boolean isAheadPrefetch;
    public String isBubbleClick;
    public boolean isECEntrance;
    public boolean isECEntranceMiddlePreload;
    public boolean isFeedCollected;
    public boolean isFeedCommentClicked;
    public boolean isFeedForwardClicked;
    public boolean isFeedLiked;
    public boolean isFromGeneralSug;
    public boolean isFromProductsCardClick;
    public boolean isOpenNewSearchContainer;
    public boolean isPreloadShopResult;
    public int isPullRefresh;
    public boolean isResearchFilterBarShow;
    public String isRichSug;
    public String isSarRecall;
    public String isSasWord;
    public String isSearchGuideClick;
    public boolean isSongRecognition;
    public Boolean isSugIntentPrefetch;
    public String keyword;
    public int keywordStrategy;
    public String landTap;
    public String lastSearchId;
    public String lastSearchPidList;
    public boolean mIsFilterFromSchema;
    public C666840QDq mTimeParam;
    public Map<String, String> maskedLogInfo;
    public String mockAttachProducts;
    public String musicChartInfo;
    public String newUserExtraInfo;
    public Long nineSearchClickTime;
    public boolean notNeedResultApiPrefetch;
    public String pageFeatureParams;
    public String preSearchId;
    public String prefetchId;
    public String prefetchType;
    public Map<String, Object> productJumpParams;
    public String queryLanguage;
    public String queryRecommend;
    public String queryState;
    public String realSearchWord;
    public String recreateTabName;
    public String relatedSearchInflowCardInfo;
    public boolean removeAnimation;
    public String requestPackSource;
    public long requestStartTime;
    public C672610QZv resultAttachCard;
    public int screenHeight;
    public int screenWidth;
    public String searchBoxKeyword;
    public C0QER searchEnterParam;
    public boolean searchFromMiddle;
    public String searchGuideTextType;
    public String searchGuideType;
    public long searchSession;
    public boolean setIconByWordsExtraType;
    public String showType;
    public String singleTabType;
    public SmartSearchInfoStruct smartSearchInfo;
    public String songID;
    public String sourceBtmPageId;
    public String sourceBtmToken;
    public String subtitleType;
    public String sugHint;
    public boolean sugIsLiveSug;
    public String sugShopId;
    public String sugType;
    public String sugUserId;
    public Map<String, String> suggestWordsExtraMobMap;
    public String switchTab;
    public String tabBubbleEnterMethod;
    public String topProductIdInNineSearch;
    public String trendingEventId;
    public String trendingWordsId;
    public String ugTrackParams;
    public boolean useNewFilterArch;
    public String utmSource;
    public VisualSearchEnterModel visualSearchEnterModel;
    public VisualSearchInfoStruct visualSearchInfo;
    public String wordState;
    public String wordType;
    public String wordsExtraType;
    public String wordsLabel;
    public String wordsPosition;
    public long MODULE_RESEARCH = 1;
    public String searchFrom = "";
    public String entrySearchSource = "";
    public String visualSearchResultMonitorKey = "";
    public int forceIndex = -1;
    public String sugGenerateType = CardStruct.IStatusCode.DEFAULT;
    public int needCorrect = 1;
    public int isNonPersonalizedSearch = -1;
    public Boolean shouldRecreateEcomResultPage = Boolean.FALSE;
    public int shouldRecordInHistory = 1;
    public EnumC669620QOi changedQueryFormTab = null;

    public int getId() {
        int i = this.index * 31;
        String str = this.keyword;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String getLandTap() {
        String str = this.landTap;
        return str == null ? "" : str;
    }

    public String getLastSearchId() {
        String str = this.lastSearchId;
        this.lastSearchId = null;
        return str;
    }

    public String getSearchEnterFromPage() {
        C0QER c0qer = this.searchEnterParam;
        return (c0qer == null || TextUtils.isEmpty(c0qer.getEnterSearchFrom())) ? "" : this.searchEnterParam.getEnterSearchFrom();
    }

    public boolean getShouldRecreateEcomResultPage() {
        return this.shouldRecreateEcomResultPage.booleanValue();
    }

    public String getSugHint() {
        String str = this.sugHint;
        return str == null ? "" : str;
    }

    public long getVisibleModules() {
        return this.isResearchFilterBarShow ? (int) (((long) 0) | this.MODULE_RESEARCH) : 0;
    }

    public String key() {
        String str = this.keyword;
        return str == null ? "" : str;
    }

    public SearchResultParam() {
        int i = C0Q3T.LIZ;
        C0Q3T.LIZ = i + 1;
        this.bindingId = i;
        this.ecomRecomSearchParamMap = new ConcurrentHashMap();
        this.productJumpParams = new ConcurrentHashMap();
        this.entityTabIndex = -1;
        this.attachProductsInfo = new C0Q3S();
        this.mockAttachProducts = "";
        this.removeAnimation = false;
        this.doShopResultPreload = false;
        this.canStartProxyFragment = true;
        this.useNewFilterArch = false;
        this.isPreloadShopResult = false;
        this.isECEntranceMiddlePreload = false;
        this.isECEntrance = false;
        this.sugIsLiveSug = false;
        this.isSongRecognition = false;
        this.songID = null;
        this.feMobMap = null;
        this.wordsLabel = null;
        this.subtitleType = null;
        this.queryRecommend = null;
        this.suggestWordsExtraMobMap = null;
        this.ecSuggestWordsExtraMobMap = null;
        this.ecommerceNewUserModel = null;
        this.searchFromMiddle = false;
        this.setIconByWordsExtraType = false;
        this.searchEnterParam = C1ER1.LIZIZ.LJJLJ();
    }

    public SearchResultParam copy() {
        try {
            return (SearchResultParam) clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            SearchResultParam searchResultParam = new SearchResultParam();
            searchResultParam.keyword = this.keyword;
            searchResultParam.index = this.index;
            searchResultParam.enterMethod = this.enterMethod;
            searchResultParam.filterOption = this.filterOption;
            searchResultParam.isOpenNewSearchContainer = this.isOpenNewSearchContainer;
            searchResultParam.searchFrom = this.searchFrom;
            searchResultParam.realSearchWord = this.realSearchWord;
            searchResultParam.needCorrect = this.needCorrect;
            searchResultParam.lastSearchId = this.lastSearchId;
            searchResultParam.shouldRecordInHistory = this.shouldRecordInHistory;
            searchResultParam.prefetchId = this.prefetchId;
            searchResultParam.prefetchType = this.prefetchType;
            return searchResultParam;
        }
    }

    public Boolean getAheadPrefetch() {
        return this.isAheadPrefetch;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppTheme() {
        return this.appTheme;
    }

    public C0Q3S getAttachProductsInfo() {
        return this.attachProductsInfo;
    }

    public int getBindingId() {
        return this.bindingId;
    }

    public String getBlankPageID() {
        return this.blankPageID;
    }

    public String getBtmUpdateBtmToken() {
        return this.btmUpdateBtmToken;
    }

    public String getBubbleTextType() {
        return this.bubbleTextType;
    }

    public String getBubbleType() {
        return this.bubbleType;
    }

    public boolean getCanStartProxyFragment() {
        return this.canStartProxyFragment;
    }

    public C20472080g getCapsuleWords() {
        return this.capsuleWords;
    }

    public String getCaptionRating() {
        return this.captionRating;
    }

    public EnumC669620QOi getChangedQueryFormTab() {
        return this.changedQueryFormTab;
    }

    public Long getClickTime() {
        return this.clickMoreTime;
    }

    public String getClickUserId() {
        return this.clickUserId;
    }

    public String getDisplaySevenSplitScreen() {
        return this.displaySevenSplitScreen;
    }

    public boolean getDoShopResultPreload() {
        return this.doShopResultPreload;
    }

    public String getDocRank() {
        return this.docRank;
    }

    public String getEcParamInCurrentSearch() {
        return this.ecParamInCurrentSearch;
    }

    public String getEcPenetrateInfo() {
        return this.ecPenetrateInfo;
    }

    public Map<String, Object> getEcSearchCommonParamsFromMiddle() {
        return this.ecSearchCommonParamsFromMiddle;
    }

    public Map<String, String> getEcSuggestWordsExtraMobMap() {
        return this.ecSuggestWordsExtraMobMap;
    }

    public String getEcTokenType() {
        return this.ecTokenType;
    }

    public Map<String, Object> getEcomRecomSearchParamMap() {
        return this.ecomRecomSearchParamMap;
    }

    public EnumC669620QOi getEcomTargetTab() {
        return this.ecomTargetTab;
    }

    public C0QXN getEcommerceNewUserModel() {
        return this.ecommerceNewUserModel;
    }

    public long getEndToEndSession() {
        return this.endToEndSession;
    }

    public String getEnterFromSecond() {
        return this.enterFromSecond;
    }

    public String getEnterFromSub() {
        return this.enterFromSub;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public int getEntityTabIndex() {
        return this.entityTabIndex;
    }

    public String getEventKeyword() {
        return this.eventKeyword;
    }

    public String getEventType() {
        return this.eventType;
    }

    public String getFeContext() {
        return this.feContext;
    }

    public Map<String, String> getFeMobMap() {
        return this.feMobMap;
    }

    public C0PSG getFilterOption() {
        return this.filterOption;
    }

    public String getFiltersData() {
        return this.filtersData;
    }

    public int getForceIndex() {
        return this.forceIndex;
    }

    public String getFromPromotionText() {
        return this.fromPromotionText;
    }

    public int getFromPromotionType() {
        return this.fromPromotionType;
    }

    public String getFromSearchSubtag() {
        return this.fromSearchSubtag;
    }

    public int getGeneralSearchSortType() {
        return this.generalSearchSortType;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getGroupPosition() {
        return this.groupPosition;
    }

    public String getHasCoinEntrance() {
        return this.hasCoinEntrance;
    }

    public String getHasSasIcon() {
        return this.hasSasIcon;
    }

    public String getHashtagId() {
        return this.hashtagId;
    }

    public Set<String> getHiddenTabNames() {
        return this.hiddenTabNames;
    }

    public int getIndex() {
        return this.index;
    }

    public String getInterveneCards() {
        return this.interveneCards;
    }

    public String getInterventionVideoIds() {
        return this.interventionVideoIds;
    }

    public String getIsBubbleClick() {
        return this.isBubbleClick;
    }

    public boolean getIsFilterFromSchema() {
        return this.mIsFilterFromSchema;
    }

    public boolean getIsFromGeneralSug() {
        return this.isFromGeneralSug;
    }

    public boolean getIsFromProductsCardClick() {
        return this.isFromProductsCardClick;
    }

    public int getIsNonPersonalizedSearch() {
        return this.isNonPersonalizedSearch;
    }

    public boolean getIsPreloadShopResult() {
        return this.isPreloadShopResult;
    }

    public int getIsPullRefresh() {
        return this.isPullRefresh;
    }

    public String getIsRichSug() {
        return this.isRichSug;
    }

    public String getIsSarRecall() {
        return this.isSarRecall;
    }

    public String getIsSasWord() {
        return this.isSasWord;
    }

    public String getIsSearchGuideClick() {
        return this.isSearchGuideClick;
    }

    public boolean getIsSongRecognition() {
        return this.isSongRecognition;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public int getKeywordStrategy() {
        return this.keywordStrategy;
    }

    public String getLastSearchPidList() {
        return this.lastSearchPidList;
    }

    public Map<String, String> getMaskedLogInfo() {
        return this.maskedLogInfo;
    }

    public String getMockAttachProducts() {
        return this.mockAttachProducts;
    }

    public String getMusicChartInfo() {
        return this.musicChartInfo;
    }

    public int getNeedCorrect() {
        return this.needCorrect;
    }

    public String getNewUserExtraInfo() {
        return this.newUserExtraInfo;
    }

    public Long getNineSearchClickTime() {
        return this.nineSearchClickTime;
    }

    public boolean getNotNeedResultApiPrefetch() {
        return this.notNeedResultApiPrefetch;
    }

    public String getPageFeatureParams() {
        return this.pageFeatureParams;
    }

    public String getPreSearchId() {
        return this.preSearchId;
    }

    public String getPrefetchId() {
        return this.prefetchId;
    }

    public String getPrefetchType() {
        return this.prefetchType;
    }

    public Map<String, Object> getProductJumpParamsMap() {
        return this.productJumpParams;
    }

    public String getQueryLanguage() {
        return this.queryLanguage;
    }

    public String getQueryRecommend() {
        return this.queryRecommend;
    }

    public String getQueryState() {
        return this.queryState;
    }

    public String getRealSearchWord() {
        return this.realSearchWord;
    }

    public String getRecreateTabName() {
        return this.recreateTabName;
    }

    public String getRelatedSearchInflowCardInfo() {
        return this.relatedSearchInflowCardInfo;
    }

    public boolean getRemoveAnimation() {
        return this.removeAnimation;
    }

    public String getRequestPackSource() {
        return this.requestPackSource;
    }

    public long getRequestStartTime() {
        return this.requestStartTime;
    }

    public C672610QZv getResultAttachCard() {
        return this.resultAttachCard;
    }

    public int getScreenHeight() {
        return this.screenHeight;
    }

    public int getScreenWidth() {
        return this.screenWidth;
    }

    public String getSearchBoxKeyword() {
        return this.searchBoxKeyword;
    }

    public C0QER getSearchEnterParam() {
        return this.searchEnterParam;
    }

    public String getSearchFrom() {
        return this.searchFrom;
    }

    public boolean getSearchFromMiddle() {
        return this.searchFromMiddle;
    }

    public String getSearchGuideTextType() {
        return this.searchGuideTextType;
    }

    public String getSearchGuideType() {
        return this.searchGuideType;
    }

    public long getSearchSession() {
        return this.searchSession;
    }

    public boolean getSetIconByWordsExtraType() {
        return this.setIconByWordsExtraType;
    }

    public int getShouldRecordInHistory() {
        return this.shouldRecordInHistory;
    }

    public String getShowType() {
        return this.showType;
    }

    public String getSingleTabType() {
        return this.singleTabType;
    }

    public SmartSearchInfoStruct getSmartSearchInfo() {
        return this.smartSearchInfo;
    }

    public String getSongID() {
        return this.songID;
    }

    public String getSourceBtmPageId() {
        return this.sourceBtmPageId;
    }

    public String getSourceBtmToken() {
        return this.sourceBtmToken;
    }

    public String getSubtitleType() {
        return this.subtitleType;
    }

    public String getSugGenerateType() {
        return this.sugGenerateType;
    }

    public Boolean getSugIntentPrefetch() {
        return this.isSugIntentPrefetch;
    }

    public boolean getSugIsLiveSug() {
        return this.sugIsLiveSug;
    }

    public String getSugShopId() {
        return this.sugShopId;
    }

    public String getSugType() {
        return this.sugType;
    }

    public String getSugUserId() {
        return this.sugUserId;
    }

    public Map<String, String> getSuggestWordsExtraMobMap() {
        return this.suggestWordsExtraMobMap;
    }

    public String getSwitchTab() {
        return this.switchTab;
    }

    public String getTabBubbleEnterMethod() {
        return this.tabBubbleEnterMethod;
    }

    public C666840QDq getTimeParam() {
        return this.mTimeParam;
    }

    public String getTopProductIdInNineSearch() {
        return this.topProductIdInNineSearch;
    }

    public String getTrendingEventId() {
        return this.trendingEventId;
    }

    public String getTrendingWordsId() {
        return this.trendingWordsId;
    }

    public String getUgTrackParams() {
        return this.ugTrackParams;
    }

    public boolean getUseNewFilterArch() {
        return this.useNewFilterArch;
    }

    public String getUtmSource() {
        return this.utmSource;
    }

    public VisualSearchEnterModel getVisualSearchEnterModel() {
        return this.visualSearchEnterModel;
    }

    public VisualSearchInfoStruct getVisualSearchInfo() {
        return this.visualSearchInfo;
    }

    public String getVisualSearchResultMonitorKey() {
        return this.visualSearchResultMonitorKey;
    }

    public String getWordState() {
        return this.wordState;
    }

    public String getWordType() {
        return this.wordType;
    }

    public String getWordsExtraType() {
        return this.wordsExtraType;
    }

    public String getWordsLabel() {
        return this.wordsLabel;
    }

    public String getWordsPosition() {
        return this.wordsPosition;
    }

    public boolean isFeedCollected() {
        return this.isFeedCollected;
    }

    public boolean isFeedCommentClicked() {
        return this.isFeedCommentClicked;
    }

    public boolean isFeedForwardClicked() {
        return this.isFeedForwardClicked;
    }

    public boolean isFeedLiked() {
        return this.isFeedLiked;
    }

    public boolean isOpenNewSearchContainer() {
        return this.isOpenNewSearchContainer;
    }

    public boolean isResearchFilterBarShow() {
        return this.isResearchFilterBarShow;
    }

    public String getEntrySearchSource(Boolean bool) {
        if (bool.booleanValue() && TextUtils.isEmpty(this.entrySearchSource)) {
            return this.enterMethod;
        }
        return this.entrySearchSource;
    }

    public void setAheadPrefetch(Boolean bool) {
        this.isAheadPrefetch = bool;
    }

    public SearchResultParam setAppName(String str) {
        this.appName = str;
        return this;
    }

    public SearchResultParam setAppTheme(String str) {
        this.appTheme = str;
        return this;
    }

    public SearchResultParam setBlankPageID(String str) {
        this.blankPageID = str;
        return this;
    }

    public void setBtmUpdateBtmToken(String str) {
        this.btmUpdateBtmToken = str;
    }

    public SearchResultParam setBubbleTextType(String str) {
        this.bubbleTextType = str;
        return this;
    }

    public SearchResultParam setBubbleType(String str) {
        this.bubbleType = str;
        return this;
    }

    public SearchResultParam setCanStartProxyFragment(boolean z) {
        this.canStartProxyFragment = z;
        return this;
    }

    public SearchResultParam setCapsuleWords(C20472080g c20472080g) {
        this.capsuleWords = c20472080g;
        return this;
    }

    public SearchResultParam setCaptionRating(String str) {
        this.captionRating = str;
        return this;
    }

    public void setChangedQueryFormTab(String str) {
        EnumC669620QOi.Companion.getClass();
        this.changedQueryFormTab = C669650QOl.LIZ(str);
    }

    public SearchResultParam setClickMoreTime(long j) {
        this.clickMoreTime = Long.valueOf(j);
        return this;
    }

    public SearchResultParam setClickUserId(String str) {
        this.clickUserId = str;
        return this;
    }

    public void setDisplaySevenSplitScreen(String str) {
        this.displaySevenSplitScreen = str;
    }

    public SearchResultParam setDoShopResultPreload(boolean z) {
        this.doShopResultPreload = z;
        return this;
    }

    public void setDocRank(String str) {
        this.docRank = str;
    }

    public SearchResultParam setEcParamInCurrentSearch(String str) {
        this.ecParamInCurrentSearch = str;
        return this;
    }

    public void setEcPenetrateInfo(String str) {
        this.ecPenetrateInfo = str;
    }

    public SearchResultParam setEcSearchCommonParamsFromMiddle(Map<String, Object> map) {
        this.ecSearchCommonParamsFromMiddle = map;
        return this;
    }

    public void setEcSuggestWordsExtraMobMap(Map<String, String> map) {
        this.ecSuggestWordsExtraMobMap = map;
    }

    public SearchResultParam setEcTokenType(String str) {
        this.ecTokenType = str;
        return this;
    }

    public SearchResultParam setEcomTargetTab(EnumC669620QOi enumC669620QOi) {
        this.ecomTargetTab = enumC669620QOi;
        return this;
    }

    public SearchResultParam setEcommerceNewUserModel(C0QXN c0qxn) {
        this.ecommerceNewUserModel = c0qxn;
        return this;
    }

    public SearchResultParam setEndToEndSession(long j) {
        this.endToEndSession = j;
        return this;
    }

    public void setEnterFromSecond(String str) {
        this.enterFromSecond = str;
    }

    public SearchResultParam setEnterFromSub(String str) {
        this.enterFromSub = str;
        return this;
    }

    public SearchResultParam setEnterMethod(String str) {
        this.enterMethod = str;
        this.entrySearchSource = str;
        return this;
    }

    public SearchResultParam setEntityTabIndex(int i) {
        this.entityTabIndex = i;
        return this;
    }

    public SearchResultParam setEventKeyword(String str) {
        this.eventKeyword = str;
        return this;
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public SearchResultParam setFeContext(String str) {
        this.feContext = str;
        return this;
    }

    public void setFeMobMap(Map<String, String> map) {
        this.feMobMap = map;
    }

    public void setFeedCollected(boolean z) {
        this.isFeedCollected = z;
    }

    public void setFeedCommentClicked(boolean z) {
        this.isFeedCommentClicked = z;
    }

    public void setFeedForwardClicked(boolean z) {
        this.isFeedForwardClicked = z;
    }

    public void setFeedLiked(boolean z) {
        this.isFeedLiked = z;
    }

    public SearchResultParam setFilterOption(C0PSG c0psg) {
        this.filterOption = c0psg;
        return this;
    }

    public SearchResultParam setFiltersData(String str) {
        this.filtersData = str;
        return this;
    }

    public SearchResultParam setForceIndex(int i) {
        this.forceIndex = i;
        return this;
    }

    public SearchResultParam setFromPromotionText(String str) {
        this.fromPromotionText = str;
        return this;
    }

    public SearchResultParam setFromPromotionType(int i) {
        this.fromPromotionType = i;
        return this;
    }

    public SearchResultParam setFromSearchSubtag(String str) {
        this.fromSearchSubtag = str;
        return this;
    }

    public SearchResultParam setGeneralSearchSortType(int i) {
        this.generalSearchSortType = i;
        return this;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setGroupPosition(String str) {
        this.groupPosition = str;
    }

    public SearchResultParam setHasCoinEntrance(String str) {
        this.hasCoinEntrance = str;
        return this;
    }

    public SearchResultParam setHasSasIcon(String str) {
        this.hasSasIcon = str;
        return this;
    }

    public void setHashtagId(String str) {
        this.hashtagId = str;
    }

    public void setHiddenTabNames(Set<String> set) {
        if (this.hiddenTabNames == null) {
            this.hiddenTabNames = new HashSet();
        }
        this.hiddenTabNames.clear();
        if (set != null && !set.isEmpty()) {
            this.hiddenTabNames.addAll(set);
        }
    }

    public SearchResultParam setIndex(int i) {
        this.index = i;
        return this;
    }

    public SearchResultParam setInterveneCards(String str) {
        this.interveneCards = str;
        return this;
    }

    public SearchResultParam setInterventionVideoIds(String str) {
        this.interventionVideoIds = str;
        return this;
    }

    public SearchResultParam setIsBubbleClick(String str) {
        this.isBubbleClick = str;
        return this;
    }

    public SearchResultParam setIsFilterFromSchema(boolean z) {
        this.mIsFilterFromSchema = z;
        return this;
    }

    public SearchResultParam setIsFromGeneralSug(boolean z) {
        this.isFromGeneralSug = z;
        return this;
    }

    public SearchResultParam setIsFromProductsCardClick(boolean z) {
        this.isFromProductsCardClick = z;
        return this;
    }

    public SearchResultParam setIsNonPersonalizedSearch(int i) {
        this.isNonPersonalizedSearch = i;
        return this;
    }

    public SearchResultParam setIsPreloadShopResult(boolean z) {
        this.isPreloadShopResult = z;
        return this;
    }

    public void setIsPullRefresh(int i) {
        this.isPullRefresh = i;
    }

    public SearchResultParam setIsRichSug(String str) {
        this.isRichSug = str;
        return this;
    }

    public SearchResultParam setIsSarRecall(String str) {
        this.isSarRecall = str;
        return this;
    }

    public SearchResultParam setIsSasWord(String str) {
        this.isSasWord = str;
        return this;
    }

    public void setIsSearchGuideClick(String str) {
        this.isSearchGuideClick = str;
    }

    public void setIsSongRecognition(boolean z) {
        this.isSongRecognition = z;
    }

    public SearchResultParam setKeyword(String str) {
        this.keyword = str;
        return this;
    }

    public SearchResultParam setKeywordStrategy(int i) {
        this.keywordStrategy = i;
        return this;
    }

    public SearchResultParam setLandTap(String str) {
        this.landTap = str;
        return this;
    }

    public SearchResultParam setLastSearchId(String str) {
        this.lastSearchId = str;
        return this;
    }

    public SearchResultParam setLastSearchPidList(String str) {
        this.lastSearchPidList = str;
        return this;
    }

    public void setMaskedLogInfo(Map<String, String> map) {
        this.maskedLogInfo = map;
    }

    public void setMockAttachProducts(String str) {
        this.mockAttachProducts = str;
    }

    public void setMusicChartInfo(String str) {
        this.musicChartInfo = str;
    }

    public SearchResultParam setNeedCorrect(int i) {
        this.needCorrect = i;
        return this;
    }

    public SearchResultParam setNewUserExtraInfo(String str) {
        this.newUserExtraInfo = str;
        return this;
    }

    public SearchResultParam setNineSearchClickTime(Long l) {
        this.nineSearchClickTime = l;
        return this;
    }

    public SearchResultParam setNotNeedResultApiPrefetch(boolean z) {
        this.notNeedResultApiPrefetch = z;
        return this;
    }

    public SearchResultParam setOpenNewSearchContainer(boolean z) {
        this.isOpenNewSearchContainer = z;
        return this;
    }

    public void setPageFeatureParams(String str) {
        this.pageFeatureParams = str;
    }

    public SearchResultParam setPreSearchId(String str) {
        this.preSearchId = str;
        return this;
    }

    public void setPrefetchId(String str) {
        this.prefetchId = str;
    }

    public void setPrefetchType(String str) {
        this.prefetchType = str;
    }

    public SearchResultParam setQueryLanguage(String str) {
        this.queryLanguage = str;
        return this;
    }

    public void setQueryRecommend(String str) {
        this.queryRecommend = str;
    }

    public SearchResultParam setQueryState(String str) {
        this.queryState = str;
        return this;
    }

    public SearchResultParam setRealSearchWord(String str) {
        this.realSearchWord = str;
        return this;
    }

    public SearchResultParam setRecreateTabName(String str) {
        this.recreateTabName = str;
        return this;
    }

    public void setRelatedSearchInflowCardInfo(String str) {
        this.relatedSearchInflowCardInfo = str;
    }

    public SearchResultParam setRemoveAnimation(boolean z) {
        this.removeAnimation = z;
        return this;
    }

    public SearchResultParam setRequestPackSource(String str) {
        this.requestPackSource = str;
        return this;
    }

    public void setRequestStartTime(long j) {
        this.requestStartTime = j;
    }

    public void setResearchFilterBarShow(boolean z) {
        this.isResearchFilterBarShow = z;
    }

    public SearchResultParam setResultAttachCard(C672610QZv c672610QZv) {
        this.resultAttachCard = c672610QZv;
        return this;
    }

    public SearchResultParam setScreenHeight(int i) {
        this.screenHeight = i;
        return this;
    }

    public SearchResultParam setScreenWidth(int i) {
        this.screenWidth = i;
        return this;
    }

    public void setSearchBoxKeyword(String str) {
        this.searchBoxKeyword = str;
    }

    public SearchResultParam setSearchEnterParam(C0QER c0qer) {
        this.searchEnterParam = c0qer;
        return this;
    }

    public SearchResultParam setSearchFrom(String str) {
        setEnterMethod(str);
        this.searchFrom = str;
        return this;
    }

    public void setSearchFromMiddle(boolean z) {
        this.searchFromMiddle = z;
    }

    public void setSearchGuideTextType(String str) {
        this.searchGuideTextType = str;
    }

    public void setSearchGuideType(String str) {
        this.searchGuideType = str;
    }

    public SearchResultParam setSearchSession(long j) {
        this.searchSession = j;
        return this;
    }

    public void setSetIconByWordsExtraType(boolean z) {
        this.setIconByWordsExtraType = z;
    }

    public SearchResultParam setShouldRecordInHistory(int i) {
        this.shouldRecordInHistory = i;
        return this;
    }

    public SearchResultParam setShouldRecreateEcomResultPage(boolean z) {
        this.shouldRecreateEcomResultPage = Boolean.valueOf(z);
        return this;
    }

    public void setShowType(String str) {
        this.showType = str;
    }

    public SearchResultParam setSingleTabType(String str) {
        this.singleTabType = str;
        return this;
    }

    public void setSmartSearchInfo(SmartSearchInfoStruct smartSearchInfoStruct) {
        this.smartSearchInfo = smartSearchInfoStruct;
    }

    public void setSongID(String str) {
        this.songID = str;
    }

    public void setSourceBtmPageId(String str) {
        this.sourceBtmPageId = str;
    }

    public void setSourceBtmToken(String str) {
        this.sourceBtmToken = str;
    }

    public void setSubtitleType(String str) {
        this.subtitleType = str;
    }

    public SearchResultParam setSugGenerateType(Boolean bool) {
        if (bool.booleanValue()) {
            this.sugGenerateType = "1";
            return this;
        }
        this.sugGenerateType = CardStruct.IStatusCode.DEFAULT;
        return this;
    }

    public SearchResultParam setSugHint(String str) {
        this.sugHint = str;
        return this;
    }

    public void setSugIntentPrefetch(Boolean bool) {
        this.isSugIntentPrefetch = bool;
    }

    public SearchResultParam setSugIsLiveSug(boolean z) {
        this.sugIsLiveSug = z;
        return this;
    }

    public SearchResultParam setSugShopId(String str) {
        this.sugShopId = str;
        return this;
    }

    public SearchResultParam setSugType(String str) {
        this.sugType = str;
        return this;
    }

    public SearchResultParam setSugUserId(String str) {
        this.sugUserId = str;
        return this;
    }

    public void setSuggestWordsExtraMobMap(Map<String, String> map) {
        this.suggestWordsExtraMobMap = map;
    }

    public SearchResultParam setSwitchTab(String str) {
        this.switchTab = str;
        return this;
    }

    public SearchResultParam setTabBubbleEnterMethod(String str) {
        this.tabBubbleEnterMethod = str;
        return this;
    }

    public SearchResultParam setTimeParam(C666840QDq c666840QDq) {
        this.mTimeParam = c666840QDq;
        return this;
    }

    public SearchResultParam setTopProductIdInNineSearch(String str) {
        this.topProductIdInNineSearch = str;
        return this;
    }

    public SearchResultParam setTrendingEventId(String str) {
        this.trendingEventId = str;
        return this;
    }

    public SearchResultParam setTrendingWordsId(String str) {
        this.trendingWordsId = str;
        return this;
    }

    public SearchResultParam setUgTrackParams(String str) {
        this.ugTrackParams = str;
        return this;
    }

    public SearchResultParam setUseNewFilterArch(boolean z) {
        this.useNewFilterArch = z;
        return this;
    }

    public SearchResultParam setUtmSource(String str) {
        this.utmSource = str;
        return this;
    }

    public void setVisualSearchEnterModel(VisualSearchEnterModel visualSearchEnterModel) {
        this.visualSearchEnterModel = visualSearchEnterModel;
    }

    public void setVisualSearchInfo(VisualSearchInfoStruct visualSearchInfoStruct) {
        this.visualSearchInfo = visualSearchInfoStruct;
    }

    public void setVisualSearchResultMonitorKey(String str) {
        this.visualSearchResultMonitorKey = str;
    }

    public SearchResultParam setWordState(String str) {
        this.wordState = str;
        return this;
    }

    public SearchResultParam setWordType(String str) {
        this.wordType = str;
        return this;
    }

    public void setWordsExtraType(String str) {
        this.wordsExtraType = str;
    }

    public void setWordsLabel(String str) {
        this.wordsLabel = str;
    }

    public void setWordsPosition(String str) {
        this.wordsPosition = str;
    }

    public SearchResultParam setEnterMethod(String str, boolean z) {
        this.enterMethod = str;
        if (z) {
            this.entrySearchSource = str;
        }
        return this;
    }
}
