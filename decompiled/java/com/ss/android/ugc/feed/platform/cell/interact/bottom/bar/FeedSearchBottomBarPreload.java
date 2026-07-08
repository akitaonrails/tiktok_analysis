package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpCustomPreloadTask;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class FeedSearchBottomBarPreload extends AbsFcpCustomPreloadTask {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "bottom_banner_search_rs";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return Collections.singletonList("/aweme/v2/search/general/stream/");
    }
}
