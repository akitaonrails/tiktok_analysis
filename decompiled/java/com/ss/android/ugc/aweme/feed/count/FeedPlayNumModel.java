package com.ss.android.ugc.aweme.feed.count;

/* JADX INFO: loaded from: classes36.dex */
public final class FeedPlayNumModel {
    public static final int $stable = 8;
    public int batchNum;
    public int batchNumAll;
    public int date;
    public int playNum;
    public int playNumAll;
    public long playTimeBefore;
    public int recommendBatchNum;
    public int recommendPlayNum;

    public final void setBatchNum(int i) {
        this.batchNum = i;
    }

    public final void setBatchNumAll(int i) {
        this.batchNumAll = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setPlayNum(int i) {
        this.playNum = i;
    }

    public final void setPlayNumAll(int i) {
        this.playNumAll = i;
    }

    public final void setPlayTimeBefore(long j) {
        this.playTimeBefore = j;
    }

    public final void setRecommendBatchNum(int i) {
        this.recommendBatchNum = i;
    }

    public final void setRecommendPlayNum(int i) {
        this.recommendPlayNum = i;
    }

    public FeedPlayNumModel(int i, int i2, int i3, int i4, int i5, int i6, long j, int i7) {
        this.batchNum = i;
        this.batchNumAll = i2;
        this.playNum = i3;
        this.playNumAll = i4;
        this.recommendBatchNum = i5;
        this.recommendPlayNum = i6;
        this.playTimeBefore = j;
        this.date = i7;
    }
}
