package com.ss.android.ugc.aweme.paid.content.consumption;

import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpCustomPreloadTask;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesAnchorEntrancePreloadTask extends AbsFcpCustomPreloadTask {
    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "anchor_paid_collection";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return Collections.singletonList("/tiktok/v1/paid_content/mini_drama/video");
    }
}
