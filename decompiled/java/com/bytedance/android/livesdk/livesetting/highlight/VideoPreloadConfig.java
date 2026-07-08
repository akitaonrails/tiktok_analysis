package com.bytedance.android.livesdk.livesetting.highlight;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoPreloadConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("is_preload_enable")
    public int isPreloadEnable;

    @C09CT("preload_highlight_count")
    public int preloadHighlightCount;

    @C09CT("preload_replay_count")
    public int preloadReplayCount;

    @C09CT("preload_video_size")
    public int preloadVideoSize;

    static {
        NormalGson.singleton();
        ADAPTER = new VideoPreloadConfig_OptTypeAdapter();
    }

    public VideoPreloadConfig() {
        this(0, 3, 3, 512);
    }

    public VideoPreloadConfig(int i, int i2, int i3, int i4) {
        this.isPreloadEnable = i;
        this.preloadReplayCount = i2;
        this.preloadHighlightCount = i3;
        this.preloadVideoSize = i4;
    }
}
