package com.ss.android.ugc.aweme.series.commonfeed.component.bottombutton;

import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpCustomPreloadTask;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesBottomButtonEntrancePreloadTask extends AbsFcpCustomPreloadTask {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "bottom_button_drama";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return Collections.singletonList("/tiktok/v1/paid_content/mini_drama/video_by_ids");
    }
}
