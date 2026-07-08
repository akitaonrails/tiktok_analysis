package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteGoLiveOptimizeConfig {
    public static final TypeAdapter ADAPTER = new LivePromoteGoLiveOptimizeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("preload_video")
    public boolean enablePreloadVideo;

    @C09CT("optimize_show_cards_records")
    public boolean optimizeShowCardsRecord;

    @C09CT("video_first_frame")
    public boolean videoFirstFrame;

    public LivePromoteGoLiveOptimizeConfig() {
        this(false, false, false);
    }

    public final boolean getEnablePreloadVideo() {
        return this.enablePreloadVideo;
    }

    public final boolean getOptimizeShowCardsRecord() {
        return this.optimizeShowCardsRecord;
    }

    public final boolean getVideoFirstFrame() {
        return this.videoFirstFrame;
    }

    public final void setEnablePreloadVideo(boolean z) {
        this.enablePreloadVideo = z;
    }

    public final void setOptimizeShowCardsRecord(boolean z) {
        this.optimizeShowCardsRecord = z;
    }

    public final void setVideoFirstFrame(boolean z) {
        this.videoFirstFrame = z;
    }

    public LivePromoteGoLiveOptimizeConfig(boolean z, boolean z2, boolean z3) {
        this.videoFirstFrame = z;
        this.enablePreloadVideo = z2;
        this.optimizeShowCardsRecord = z3;
    }
}
