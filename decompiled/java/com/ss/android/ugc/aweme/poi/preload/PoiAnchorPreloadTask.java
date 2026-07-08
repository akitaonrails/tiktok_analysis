package com.ss.android.ugc.aweme.poi.preload;

import X.C1189040h30;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpCustomPreloadTask;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorPreloadTask extends AbsFcpCustomPreloadTask {
    public static final C1189040h30 Companion = new Object() { // from class: X.0h30
    };

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "anchor_poi";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return Collections.singletonList("/tiktok/poi/slash/lite/v1");
    }
}
