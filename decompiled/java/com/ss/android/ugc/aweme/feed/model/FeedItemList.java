package com.ss.android.ugc.aweme.feed.model;

import X.C086I;
import X.C09CT;
import X.C0X12;
import X.C0XPK;
import X.C208900rH;
import X.C592002So;
import X.InterfaceC1516270pYn;
import X.InterfaceC20550615bE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.commercialize.model.CommercePitayaInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.feed.model.common.CommonInfoForClient;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyRspStruct;
import com.ss.android.ugc.aweme.feed.model.intervention.InterventionInfoStruct;
import com.ss.android.ugc.aweme.feed.model.live.ServerDeletedLiveInfo;
import com.ss.android.ugc.aweme.feed.model.prompt.FeedPromptStruct;
import com.ss.android.ugc.aweme.theater.model.CameoData;
import com.ss.android.ugc.aweme.theater.model.CameoDraftInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public class FeedItemList implements C0X12, IFeedItemList, C0XPK, InterfaceC20550615bE, InterfaceC1516270pYn, IAITheaterInfoProvider {
    public volatile boolean appendCache;

    @C09CT("aweme_acl")
    public AwemeACLShare awemeACLShareInfo;

    @C09CT("block_code")
    public int blockCode;

    @C09CT("data")
    public CameoData cameoData;

    @C09CT("card_insert_results")
    public List<CardInsertResultInfo> cardInsertResults;

    @C09CT("chunk_index")
    public int chunkIndex;

    @C09CT("commerce_pitaya_info")
    public CommercePitayaInfo commercePitayaInfo;

    @C09CT("common_info_for_client")
    public CommonInfoForClient commonInfoForClient;

    @C09CT("consistency_rsp")
    public ConsistencyRspStruct consistencyRsp;

    @C09CT("cursor")
    public long cursor;
    public String dataUserId;

    @C09CT("DebugInfo")
    public String debugInfo;

    @C09CT("disable_adjust_for_cache")
    public boolean disableAdjustForCache;

    @C09CT("enable_re_rank")
    public boolean enableReRank;

    @C09CT("error_code")
    public int error_code;

    @C09CT("extra")
    public Extra extra;
    public int fetchType;

    @C09CT("has_ad")
    public boolean hasAd;

    @C09CT("has_locate_item")
    public boolean hasLocateItem;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("has_more_up")
    public int hasMoreUp;

    @C09CT("is_hiding_invalid_item")
    public int hidingInvalidItem;

    @C09CT("guide_word")
    public HotSearchGuideWord hotSearchGuideWord;

    @C09CT("hotsoon_text")
    public String hotSoonText;

    @C09CT("hotsoon_filtered_count")
    public int hotsoonFilteredCount;

    @C09CT("hotsoon_has_more")
    public int hotsoonHasMore;

    @C09CT("intervention_info")
    public InterventionInfoStruct interventionInfo;

    @C09CT("invalid_count")
    public int invalidCount;

    @C09CT("invalid_item_count")
    public int invalidItemCount;

    @C09CT("invalid_item_id_list")
    public List<String> invalidItemIdList;

    @C09CT("invalid_item_text")
    public String invalidItemText;

    @C09CT("is_clear_invalid_item")
    public int isClearInvalidItem;
    public boolean isFromBackupVideo;
    public boolean isFromCacheFiled;
    public boolean isFromColdCache;
    public boolean isFromLocalCache;
    public boolean isFromSplitData;
    public boolean isFromUnusedFeed;
    public boolean isLiveTopGifterColdStart;

    @C09CT("is_non_personalized")
    public boolean isNonPersonalized;

    @C09CT("aweme_list")
    public List<Aweme> items;
    public String lastRequestId;
    public volatile boolean liveAppend;
    public int loadLatestInsertCount;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT(alternate = {"max_time"}, value = "max_cursor")
    public long maxCursor;

    @C09CT("media_basic_info")
    public MediaBasicInfo mediaBasicInfo;

    @C09CT(alternate = {"min_time"}, value = "min_cursor")
    public long minCursor;
    public transient Long networkInfoKey;

    @C09CT("nuj_insert_config")
    public Integer nujInsertConfig;

    @C09CT("ocean_req_info")
    public String oceanReqInfo;
    public transient C592002So pbData;
    public int placeHolderRemovedCount;

    @C09CT("preload_ads")
    public List<Aweme> preloadAds;

    @C09CT("proactive_login_config")
    public String proactiveLoginConfig;

    @C09CT("prompt")
    public FeedPromptStruct promptResult;

    @C09CT("refresh_clear")
    public int refreshClear;
    public volatile boolean replaceFake;

    @C09CT("rid")
    public String requestId;

    @C09CT("server_base_fcp_config")
    public ServerBaseFcpConfig serverBaseFcpConfig;

    @C09CT("server_deleted_live_info")
    public ServerDeletedLiveInfo serverDeletedLiveInfo;

    @C09CT("server_predicted_time")
    public int serverPredictedTime;

    @C09CT("status_code")
    public int status_code;

    @C09CT("status_msg")
    public String status_msg;

    @C09CT("topview_over_delivery_result")
    public String topViewOverDeliveryResult;
    public Map<String, String> localExtra = new HashMap();

    @C09CT("filter_reasons")
    public Map<String, String> filterReason = new HashMap();

    public void resetForceAppend() {
        this.replaceFake = false;
        this.appendCache = false;
        this.liveAppend = false;
    }

    public void setReplaceFake() {
        this.replaceFake = true;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FeedItemList m202clone() {
        FeedItemList feedItemList = new FeedItemList();
        feedItemList.minCursor = this.minCursor;
        feedItemList.maxCursor = this.maxCursor;
        feedItemList.cursor = this.cursor;
        feedItemList.hasMore = this.hasMore;
        feedItemList.items = C208900rH.LIZ(getItems());
        CameoData cameoData = this.cameoData;
        if (cameoData != null) {
            List<Aweme> listLIZ = C208900rH.LIZ(cameoData.getPostList());
            CameoData cameoData2 = this.cameoData;
            feedItemList.cameoData = cameoData2.copy(cameoData2.getCameoDraftInfo(), listLIZ, this.cameoData.getCursor(), this.cameoData.getHasMore(), this.cameoData.getTotalCount(), this.cameoData.getAicastDraftCnt(), this.cameoData.getAiremixDraftCnt(), this.cameoData.getAiPortraitDraftCnt(), this.cameoData.getHaveAiSelf(), this.cameoData.getCameoId());
        }
        feedItemList.requestId = this.requestId;
        feedItemList.refreshClear = this.refreshClear;
        feedItemList.extra = this.extra;
        feedItemList.commonInfoForClient = this.commonInfoForClient;
        feedItemList.status_code = this.status_code;
        feedItemList.status_msg = this.status_msg;
        feedItemList.error_code = this.error_code;
        feedItemList.blockCode = this.blockCode;
        feedItemList.hotSearchGuideWord = this.hotSearchGuideWord;
        feedItemList.preloadAds = this.preloadAds;
        feedItemList.fetchType = this.fetchType;
        feedItemList.replaceFake = this.replaceFake;
        feedItemList.appendCache = this.appendCache;
        feedItemList.liveAppend = this.liveAppend;
        feedItemList.localExtra = this.localExtra;
        feedItemList.isFromLocalCache = this.isFromLocalCache;
        feedItemList.logPb = this.logPb;
        feedItemList.invalidItemCount = this.invalidItemCount;
        feedItemList.invalidCount = this.invalidCount;
        feedItemList.hidingInvalidItem = this.hidingInvalidItem;
        feedItemList.invalidItemText = this.invalidItemText;
        feedItemList.awemeACLShareInfo = this.awemeACLShareInfo;
        feedItemList.debugInfo = this.debugInfo;
        feedItemList.hasMoreUp = this.hasMoreUp;
        feedItemList.dataUserId = this.dataUserId;
        feedItemList.isClearInvalidItem = this.isClearInvalidItem;
        feedItemList.invalidItemIdList = this.invalidItemIdList;
        feedItemList.hasLocateItem = this.hasLocateItem;
        feedItemList.filterReason = this.filterReason;
        feedItemList.hotsoonFilteredCount = this.hotsoonFilteredCount;
        feedItemList.hotsoonHasMore = this.hotsoonHasMore;
        feedItemList.hotSoonText = this.hotSoonText;
        return feedItemList;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IAITheaterInfoProvider
    public CameoDraftInfo getAiTheaterLatestDraftInfo() {
        CameoData cameoData = this.cameoData;
        if (cameoData != null) {
            return cameoData.getCameoDraftInfo();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFeedItemList
    public List<Aweme> getItems() {
        if (this.fetchType == 24) {
            CameoData cameoData = this.cameoData;
            if (cameoData != null) {
                return cameoData.getPostList();
            }
            return null;
        }
        List<Aweme> list = this.items;
        if (list == null || list.size() <= 0) {
            return this.items;
        }
        try {
            ArrayList arrayList = new ArrayList(this.items);
            if (needSetPbToAweme(arrayList)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Aweme) it2.next()).setLogPbBean(this.logPb);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("FeedItemList", e.toString());
        }
        return this.items;
    }

    public boolean hasMoreUp() {
        return this.hasMoreUp == 1;
    }

    public boolean isForceAppend() {
        return this.replaceFake || this.appendCache || this.liveAppend;
    }

    public boolean isHasMore() {
        return this.hasMore == 1;
    }

    public boolean isRefreshClear() {
        return this.refreshClear == 1;
    }

    public int size() {
        if (C086I.LIZIZ(this.items)) {
            return 0;
        }
        return this.items.size();
    }

    @Override // X.InterfaceC20550615bE
    public List<Aweme> getAwemeList() {
        return getItems();
    }

    @Override // X.InterfaceC20550615bE
    public String getLogId() {
        return getRequestId();
    }

    public AwemeACLShare getAwemeACLShareInfo() {
        return this.awemeACLShareInfo;
    }

    public int getBlockCode() {
        return this.blockCode;
    }

    public List<CardInsertResultInfo> getCardInsertResults() {
        return this.cardInsertResults;
    }

    public int getChunkIndex() {
        return this.chunkIndex;
    }

    public CommercePitayaInfo getCommercePitayaInfo() {
        return this.commercePitayaInfo;
    }

    public CommonInfoForClient getCommonInfoForClient() {
        return this.commonInfoForClient;
    }

    public ConsistencyRspStruct getConsistencyRsp() {
        return this.consistencyRsp;
    }

    public long getCursor() {
        return this.cursor;
    }

    public String getDataUserId() {
        return this.dataUserId;
    }

    public String getDebugInfo() {
        return this.debugInfo;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public int getFetchType() {
        return this.fetchType;
    }

    public Map<String, String> getFilterReason() {
        return this.filterReason;
    }

    public boolean getHasLocateItem() {
        return this.hasLocateItem;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public int getHasMoreUp() {
        return this.hasMoreUp;
    }

    public int getHidingInvalidItem() {
        return this.hidingInvalidItem;
    }

    public HotSearchGuideWord getHotSearchGuideWord() {
        return this.hotSearchGuideWord;
    }

    public String getHotSoonText() {
        return this.hotSoonText;
    }

    public int getHotsoonFilteredCount() {
        return this.hotsoonFilteredCount;
    }

    public int getHotsoonHasMore() {
        return this.hotsoonHasMore;
    }

    @Override // X.InterfaceC20550615bE
    public List<CardInsertResultInfo> getInsertResults() {
        return this.cardInsertResults;
    }

    public InterventionInfoStruct getInterventionInfo() {
        return this.interventionInfo;
    }

    public int getInvalidCount() {
        return this.invalidCount;
    }

    public int getInvalidItemCount() {
        return this.invalidItemCount;
    }

    public List<String> getInvalidItemIdList() {
        return this.invalidItemIdList;
    }

    public String getInvalidItemText() {
        return this.invalidItemText;
    }

    public int getIsClearInvalidItem() {
        return this.isClearInvalidItem;
    }

    public boolean getIsNonPersonalized() {
        return this.isNonPersonalized;
    }

    public String getLastRequestId() {
        return this.lastRequestId;
    }

    public int getLoadLatestInsertCount() {
        return this.loadLatestInsertCount;
    }

    public Map<String, String> getLocalExtra() {
        return this.localExtra;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    @Override // X.InterfaceC1516270pYn
    public MediaBasicInfo getMediaBasicInfo() {
        return this.mediaBasicInfo;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public Long getNetworkInfoKey() {
        return this.networkInfoKey;
    }

    public Integer getNujInsertConfig() {
        return this.nujInsertConfig;
    }

    public String getOceanReqInfo() {
        return this.oceanReqInfo;
    }

    public C592002So getPbData() {
        return this.pbData;
    }

    public int getPlaceHolderRemovedCount() {
        return this.placeHolderRemovedCount;
    }

    public List<Aweme> getPreloadAds() {
        return this.preloadAds;
    }

    public String getProactiveLoginConfig() {
        return this.proactiveLoginConfig;
    }

    public FeedPromptStruct getPromptResult() {
        return this.promptResult;
    }

    public int getRefreshClear() {
        return this.refreshClear;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public ServerBaseFcpConfig getServerBaseFcpConfig() {
        return this.serverBaseFcpConfig;
    }

    public ServerDeletedLiveInfo getServerDeletedLiveInfo() {
        return this.serverDeletedLiveInfo;
    }

    public int getServerPredictedTime() {
        return this.serverPredictedTime;
    }

    public String getTopViewOverDeliveryResult() {
        return this.topViewOverDeliveryResult;
    }

    public boolean isDisableAdjustForCache() {
        return this.disableAdjustForCache;
    }

    public boolean isEnableReRank() {
        return this.enableReRank;
    }

    public boolean isFromBackupVideo() {
        return this.isFromBackupVideo;
    }

    public boolean isFromCacheFiled() {
        return this.isFromCacheFiled;
    }

    public boolean isFromColdCache() {
        return this.isFromColdCache;
    }

    public boolean isFromLocalCache() {
        return this.isFromLocalCache;
    }

    public boolean isFromSplitData() {
        return this.isFromSplitData;
    }

    public boolean isFromUnusedFeed() {
        return this.isFromUnusedFeed;
    }

    public boolean isHasAd() {
        return this.hasAd;
    }

    public boolean isLiveTopGifterColdStart() {
        return this.isLiveTopGifterColdStart;
    }

    private boolean needSetPbToAweme(List<Aweme> list) {
        if (list == null || list.size() == 0 || ((Aweme) ListProtector.get(list, 0)).getLogPbBean() != null) {
            return false;
        }
        return true;
    }

    public void setAppendCache(boolean z) {
        this.appendCache = z;
    }

    public void setAwemeACLShareInfo(AwemeACLShare awemeACLShare) {
        this.awemeACLShareInfo = awemeACLShare;
    }

    public void setBlockCode(int i) {
        this.blockCode = i;
    }

    public void setCardInsertResults(List<CardInsertResultInfo> list) {
        this.cardInsertResults = list;
    }

    public void setCommercePitayaInfo(CommercePitayaInfo commercePitayaInfo) {
        this.commercePitayaInfo = commercePitayaInfo;
    }

    public void setCommonInfoForClient(CommonInfoForClient commonInfoForClient) {
        this.commonInfoForClient = commonInfoForClient;
    }

    public void setConsistencyRsp(ConsistencyRspStruct consistencyRspStruct) {
        this.consistencyRsp = consistencyRspStruct;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setDataUserId(String str) {
        this.dataUserId = str;
    }

    public void setDebugInfo(String str) {
        this.debugInfo = str;
    }

    public void setEnableReRank(boolean z) {
        this.enableReRank = z;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public void setFetchType(int i) {
        this.fetchType = i;
    }

    public void setFilterReason(Map<String, String> map) {
        this.filterReason = map;
    }

    public void setFromLocalCache(boolean z) {
        this.isFromLocalCache = z;
    }

    public void setFromSplitData(boolean z) {
        this.isFromSplitData = z;
    }

    public void setFromUnusedFeed(boolean z) {
        this.isFromUnusedFeed = z;
    }

    public void setHasAd(boolean z) {
        this.hasAd = z;
    }

    public void setHasLocateItem(boolean z) {
        this.hasLocateItem = z;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setHasMoreUp(int i) {
        this.hasMoreUp = i;
    }

    public void setHidingInvalidItem(int i) {
        this.hidingInvalidItem = i;
    }

    public void setHotSearchGuideWord(HotSearchGuideWord hotSearchGuideWord) {
        this.hotSearchGuideWord = hotSearchGuideWord;
    }

    public void setHotSoonText(String str) {
        this.hotSoonText = str;
    }

    public void setHotsoonFilteredCount(int i) {
        this.hotsoonFilteredCount = i;
    }

    public void setHotsoonHasMore(int i) {
        this.hotsoonHasMore = i;
    }

    public void setInterventionInfo(InterventionInfoStruct interventionInfoStruct) {
        this.interventionInfo = interventionInfoStruct;
    }

    public void setInvalidCount(int i) {
        this.invalidCount = i;
    }

    public void setInvalidItemCount(int i) {
        this.invalidItemCount = i;
    }

    public void setInvalidItemIdList(List<String> list) {
        this.invalidItemIdList = list;
    }

    public void setInvalidItemText(String str) {
        this.invalidItemText = str;
    }

    public void setIsBackupVideo(boolean z) {
        this.isFromBackupVideo = z;
    }

    public void setIsClearInvalidItem(int i) {
        this.isClearInvalidItem = i;
    }

    public void setIsFromCacheFiled(boolean z) {
        this.isFromCacheFiled = z;
    }

    public void setIsFromColdCache(boolean z) {
        this.isFromColdCache = z;
    }

    public void setIsLiveTopGifterColdStart(boolean z) {
        this.isLiveTopGifterColdStart = z;
    }

    public FeedItemList setIsNonPersonalized(boolean z) {
        this.isNonPersonalized = z;
        return this;
    }

    public void setItems(List<Aweme> list) {
        CameoData cameoData;
        this.items = list;
        if (this.fetchType == 24 && (cameoData = this.cameoData) != null) {
            cameoData.updatePostList(list);
        }
    }

    public void setLastRequestId(String str) {
        this.lastRequestId = str;
    }

    public void setLiveAppend(boolean z) {
        this.liveAppend = z;
    }

    public void setLoadLatestInsertCount(int i) {
        this.loadLatestInsertCount = i;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    @Override // X.C0XPK
    public void setNetworkInfoKey(Long l) {
        this.networkInfoKey = l;
    }

    public void setPbData(C592002So c592002So) {
        this.pbData = c592002So;
    }

    public void setPlaceHolderRemovedCount(int i) {
        this.placeHolderRemovedCount = i;
    }

    public void setPreloadAds(List<Aweme> list) {
        this.preloadAds = list;
    }

    public void setPromptResult(FeedPromptStruct feedPromptStruct) {
        this.promptResult = feedPromptStruct;
    }

    public void setRefreshClear(int i) {
        this.refreshClear = i;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setServerBaseFcpConfig(ServerBaseFcpConfig serverBaseFcpConfig) {
        this.serverBaseFcpConfig = serverBaseFcpConfig;
    }

    public void setTopViewOverDeliveryResult(String str) {
        this.topViewOverDeliveryResult = str;
    }

    public void setLocalExtra(String str, String str2) {
        this.localExtra.put(str, str2);
    }
}
