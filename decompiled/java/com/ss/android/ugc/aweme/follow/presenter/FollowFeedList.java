package com.ss.android.ugc.aweme.follow.presenter;

import X.C09CT;
import X.C0PLT;
import X.C0X12;
import X.InterfaceC20550615bE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.follow.LastViewData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public class FollowFeedList extends BaseResponse implements Cloneable, C0X12, InterfaceC20550615bE {

    @C09CT("blank_panel_text")
    public String blankPanelText;

    @C09CT("snapshot_control")
    public int cacheControl;

    @C09CT("card_insert_results")
    public List<CardInsertResultInfo> cardInsertResults;
    public long cursor;

    @C09CT("err_msg")
    public String errMsg;

    @C09CT("feed_type")
    public int feedType;

    @C09CT("fetch_recommend")
    public int fetchRecommend;

    @C09CT("has_more")
    public int hasMore;

    @C09CT("inserted_results")
    public List<FollowInsertedResult> insertedResults;

    @C09CT("is_recommend")
    public int isRecommend;

    @C09CT("last_view")
    public LastViewData lastViewData;
    public int level;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("data")
    public List<FollowFeed> mItems;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("min_cursor")
    public long minCursor;

    @C09CT("need_change_snapshot")
    public int needCache;

    @C09CT("need_delete_snapshot")
    public int needDeleteCache;

    @C09CT("new_item_count")
    public int newItemCount;

    @C09CT("new_room_count")
    public int newLiveCount;

    @C09CT("preload_data")
    public int preloadData;

    @C09CT("rid")
    public String requestId;

    @C09CT("up_phone_notice")
    public int upPhoneNotice;

    @C09CT("update_item_count")
    public int updateItemCount;

    @Override // X.InterfaceC20550615bE
    public List<Aweme> getAwemeList() {
        ArrayList arrayList = new ArrayList();
        List<FollowFeed> items = getItems();
        if (items != null && !items.isEmpty()) {
            for (int i = 0; i < items.size(); i++) {
                arrayList.add(((C0PLT) ListProtector.get(items, i)).getAweme());
            }
        }
        return arrayList;
    }

    public boolean isHasMore() {
        return this.hasMore == 1;
    }

    public boolean needCache() {
        return this.needCache == 1;
    }

    public boolean needDeleteCache() {
        return this.needDeleteCache == 1;
    }

    public boolean needUseCache() {
        return this.cacheControl == 1;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FollowFeedList m203clone() {
        try {
            FollowFeedList followFeedList = (FollowFeedList) super.clone();
            followFeedList.errMsg = this.errMsg;
            followFeedList.hasMore = this.hasMore;
            followFeedList.minCursor = this.minCursor;
            followFeedList.maxCursor = this.maxCursor;
            followFeedList.requestId = this.requestId;
            followFeedList.mItems = (ArrayList) ((ArrayList) this.mItems).clone();
            followFeedList.fetchRecommend = this.fetchRecommend;
            followFeedList.logPb = this.logPb;
            followFeedList.cursor = this.cursor;
            followFeedList.level = this.level;
            followFeedList.lastViewData = this.lastViewData;
            followFeedList.newItemCount = this.newItemCount;
            followFeedList.newLiveCount = this.newLiveCount;
            followFeedList.feedType = this.feedType;
            followFeedList.updateItemCount = this.updateItemCount;
            followFeedList.blankPanelText = this.blankPanelText;
            followFeedList.preloadData = this.preloadData;
            followFeedList.insertedResults = new ArrayList(this.insertedResults);
            followFeedList.cardInsertResults = new ArrayList(this.cardInsertResults);
            return followFeedList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC20550615bE
    public List<CardInsertResultInfo> getInsertResults() {
        return getCardInsertedResults();
    }

    @Override // X.InterfaceC20550615bE
    public String getLogId() {
        return getRequestId();
    }

    public String getBlankPanelText() {
        return this.blankPanelText;
    }

    public List<CardInsertResultInfo> getCardInsertedResults() {
        return this.cardInsertResults;
    }

    public long getCursor() {
        return this.cursor;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getFetchRecommend() {
        return this.fetchRecommend;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<FollowInsertedResult> getInsertedResults() {
        return this.insertedResults;
    }

    public int getIsRecommend() {
        return this.isRecommend;
    }

    public List<FollowFeed> getItems() {
        return this.mItems;
    }

    public LastViewData getLastViewData() {
        return this.lastViewData;
    }

    public int getLevel() {
        return this.level;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getNewItemCount() {
        return this.newItemCount;
    }

    public int getNewLiveCount() {
        return this.newLiveCount;
    }

    public int getPreloadData() {
        return this.preloadData;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public int getUpPhoneNotice() {
        return this.upPhoneNotice;
    }

    public int getUpdateItemCount() {
        return this.updateItemCount;
    }

    public void setBlankPanelText(String str) {
        this.blankPanelText = str;
    }

    public void setCardInsertedResults(List<CardInsertResultInfo> list) {
        this.cardInsertResults = list;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setFetchRecommend(int i) {
        this.fetchRecommend = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setInsertedResults(List<FollowInsertedResult> list) {
        this.insertedResults = list;
    }

    public void setIsRecommend(int i) {
        this.isRecommend = i;
    }

    public void setItems(List<FollowFeed> list) {
        this.mItems = list;
    }

    public void setLastViewData(LastViewData lastViewData) {
        this.lastViewData = lastViewData;
    }

    public void setLevel(int i) {
        this.level = i;
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

    public void setNewItemCount(int i) {
        this.newItemCount = i;
    }

    public void setNewLiveCount(int i) {
        this.newLiveCount = i;
    }

    public void setPreloadData(int i) {
        this.preloadData = i;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
        List<FollowFeed> list = this.mItems;
        if (list == null) {
            return;
        }
        Iterator<FollowFeed> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().setRequestId(str);
        }
    }

    public void setUpPhoneNotice(int i) {
        this.upPhoneNotice = i;
    }

    public void setUpdateItemCount(int i) {
        this.updateItemCount = i;
    }
}
