package com.ss.android.ugc.aweme.feed.model;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FeedAppLogParams {
    public FeedItemList mData;
    public List<Aweme> mItems;
    public FeedItemList mLastFeedItemList;
    public int pullType = -1;
    public int unconsumedVideoCount;
    public int unconsumedVideoReuseCount;

    public FeedItemList getData() {
        return this.mData;
    }

    public FeedItemList getFeedItemList() {
        return this.mLastFeedItemList;
    }

    public List<Aweme> getItems() {
        return this.mItems;
    }

    public FeedAppLogParams(FeedItemList feedItemList, FeedItemList feedItemList2, List<Aweme> list) {
        this.mData = feedItemList;
        this.mLastFeedItemList = feedItemList2;
        this.mItems = list;
    }
}
