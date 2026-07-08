package com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner;

import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpCustomPreloadTask;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesBottomBannerEntrancePreloadTask extends AbsFcpCustomPreloadTask {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "bottom_banner_series_mini_drama";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return Collections.singletonList("/tiktok/v1/paid_content/mini_drama/video_by_ids");
    }
}
