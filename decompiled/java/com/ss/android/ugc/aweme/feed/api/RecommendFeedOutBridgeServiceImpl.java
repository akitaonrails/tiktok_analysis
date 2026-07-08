package com.ss.android.ugc.aweme.feed.api;

import X.C590850NFj;
import X.C590950NFt;
import com.ss.android.ugc.aweme.legoImp.task.FeedCachePreloadTask;
import com.ss.android.ugc.aweme.requesttask.p0.FeedPreloadRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class RecommendFeedOutBridgeServiceImpl implements IRecommendFeedOutBridgeService {
    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final void LIZIZ() {
        C590850NFj.LLILZIL = true;
        C590950NFt.LIZLLL.set(true);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final void LIZLLL() {
        C590850NFj.LLILZLL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final void LJ() {
        C590850NFj.LL.LJI(4, "before_swipeup", false);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final void LJII() {
        C590850NFj.LL.LJI(5, "before_swipeup_marked", false);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final void LJIIIIZZ() {
        C590850NFj.LL.LJI(6, "pre_is", false);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final FeedPreloadRequest LJIIIZ() {
        return new FeedPreloadRequest(null, null, null, null, null, 0, null, false, false, 511);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final void LIZ(boolean z) {
        C590850NFj.LL.LJI(1, "cold_initial", z);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final FeedPreloadRequest LJI(boolean z) {
        return new FeedPreloadRequest(null, null, null, null, null, 1, null, z, false, 351);
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IRecommendFeedOutBridgeService
    public final FeedCachePreloadTask LJFF(int i, int i2) {
        return new FeedCachePreloadTask(i, i2, false);
    }
}
