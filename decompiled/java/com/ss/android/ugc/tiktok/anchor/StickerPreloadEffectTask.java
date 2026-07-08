package com.ss.android.ugc.tiktok.anchor;

import X.C1697810uHb;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpCustomPreloadTask;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class StickerPreloadEffectTask extends AbsFcpCustomPreloadTask {
    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "anchor_effect";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return C1697810uHb.LJIIJJI("/aweme/v1/effect/detail/", "aweme/v1/effect/list/");
    }
}
