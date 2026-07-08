package com.ss.android.ugc.aweme.feed.assem.music;

import X.C1697810uHb;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpCustomPreloadTask;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class MusicPreloadTask extends AbsFcpCustomPreloadTask {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "right_container_music_cover";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return C1697810uHb.LJIIJJI("/aweme/v1/music/detail/", "/aweme/v1/music/aweme/");
    }
}
