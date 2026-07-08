package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import X.C0X12;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
public class MusicAwemeList extends BaseResponse implements C0X12 {

    @C09CT("can_pin_video")
    public boolean canPinVideo;

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("aweme_list")
    public List<Aweme> items;

    @C09CT("lazy_loading_ctx")
    public String lazyLoadingCtx;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("need_lazy_loading")
    public boolean needLazyLoading;

    @C09CT("rid")
    public String requestId;

    @C09CT("square_aweme_list")
    public List<Aweme> squareItems;
    public List<Aweme> showAidItems = new ArrayList();
    public List<Aweme> foldAidItems = new ArrayList();

    @C09CT("details_info")
    public List<MDPDetailInfo> detailInfos = new ArrayList();

    @C09CT("supplement_item_ids")
    public List<String> supplementItemIds = new ArrayList();

    @C09CT("draft_count")
    public int draftCount = -1;
    public ConcurrentHashMap<String, Long> cursorMap = new ConcurrentHashMap<>();
    public ConcurrentHashMap<String, Integer> hasMoreMap = new ConcurrentHashMap<>();
    public boolean containSquareData = false;
    public boolean requestingSquareData = false;
    public boolean wouldContainSquareData = false;
    public int showMoreTimes = 0;
    public boolean requestingNormalData = false;
    public String lastDataFrom = "";
    public boolean skipFiltering = false;

    public static class MDPDetailInfo implements Serializable {

        @C09CT("icon_url")
        public String iconUrl = "";

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id = "";

        @C09CT("name")
        public String name = "";
    }

    public void increaseShowMoreTime() {
        this.showMoreTimes++;
    }

    public boolean isHasMore() {
        return this.hasMore == 1;
    }

    public boolean containMDPSquareData() {
        return this.containSquareData;
    }

    public long getCursor() {
        return this.cursor;
    }

    public List<MDPDetailInfo> getDetailInfos() {
        return this.detailInfos;
    }

    public int getDraftCount() {
        return this.draftCount;
    }

    public List<Aweme> getFoldAidItems() {
        return this.foldAidItems;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<Aweme> getItems() {
        return this.items;
    }

    public String getLazyLoadingCtx() {
        return this.lazyLoadingCtx;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public List<Aweme> getShowAidItems() {
        return this.showAidItems;
    }

    public List<Aweme> getSquareItems() {
        return this.squareItems;
    }

    public List<String> getSupplementItemIds() {
        return this.supplementItemIds;
    }

    public boolean isCanPinVideo() {
        return this.canPinVideo;
    }

    public boolean isNeedLazyLoading() {
        return this.needLazyLoading;
    }

    public boolean isRequestingNormalData() {
        return this.requestingNormalData;
    }

    public boolean isRequestingSquareData() {
        return this.requestingSquareData;
    }

    public boolean isSkipFiltering() {
        return this.skipFiltering;
    }

    public String lastDataFrom() {
        return this.lastDataFrom;
    }

    public int showMoreTimes() {
        return this.showMoreTimes;
    }

    public boolean wouldContainMDPSquareData() {
        return this.wouldContainSquareData;
    }

    public void addDetailInfos(List<MDPDetailInfo> list) {
        if (this.detailInfos == null) {
            this.detailInfos = new ArrayList();
        }
        this.detailInfos.addAll(list);
    }

    public long getCursor(String str) {
        if (this.cursorMap.containsKey(str) && this.cursorMap.get(str) != null) {
            return this.cursorMap.get(str).longValue();
        }
        return this.cursor;
    }

    public int getHasMore(String str) {
        if (this.hasMoreMap.containsKey(str) && this.hasMoreMap.get(str) != null) {
            return this.hasMoreMap.get(str).intValue();
        }
        return this.hasMore;
    }

    public void setCanPinVideo(boolean z) {
        this.canPinVideo = z;
    }

    public void setContainSquareData(boolean z) {
        this.containSquareData = z;
    }

    public void setCursor(long j) {
        this.cursor = j;
        this.cursorMap.put("normal", Long.valueOf(j));
    }

    public void setDraftCount(int i) {
        this.draftCount = i;
    }

    public void setFoldAidItems(List<Aweme> list) {
        this.foldAidItems = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
        this.hasMoreMap.put("normal", Integer.valueOf(i));
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setLastDataFrom(String str) {
        this.lastDataFrom = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRequestingNormalData(boolean z) {
        this.requestingNormalData = z;
    }

    public void setRequestingSquareData(boolean z) {
        this.requestingSquareData = z;
    }

    public void setShowAidItems(List<Aweme> list) {
        this.showAidItems = list;
    }

    public void setShowMoreTimes(int i) {
        this.showMoreTimes = i;
    }

    public void setSkipFiltering(boolean z) {
        this.skipFiltering = z;
    }

    public void setWouldContainSquareData(boolean z) {
        this.wouldContainSquareData = z;
    }

    private List<Aweme> mergeAwemeLists(List<Aweme> list, List<Aweme> list2) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        return arrayList;
    }

    public void setCursor(String str, long j) {
        this.cursorMap.put(str, Long.valueOf(j));
    }

    public void setHasMore(String str, int i) {
        this.hasMoreMap.put(str, Integer.valueOf(i));
    }

    public void setSquareItems(List<Aweme> list, List<Aweme> list2) {
        if (list == list2) {
            this.squareItems = list;
        } else if (list != null && list.size() > 0 && list != list2) {
            this.squareItems = mergeAwemeLists(list, list2);
        } else {
            this.squareItems = list2;
        }
    }
}
