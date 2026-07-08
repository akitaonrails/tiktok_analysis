package com.ss.android.ugc.aweme.dsp.experiment;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: loaded from: classes17.dex */
public final class FirstFrameOpt {

    @C09CT("enable_api_preload")
    public final boolean enableApiPreload = true;

    @C09CT("enable_video_preload")
    public final boolean enableVideoPreload = true;

    @C09CT("preload_ttl")
    public final int preloadTtl = 21600000;

    @C09CT("video_preload_delay_time")
    public final int videoPreloadDelayTime = LivePreCreateNextRoomPlayer.ENABLE;

    @C09CT("enable_mobile_api_preload")
    public final boolean enableMobileApiPreload = true;

    @C09CT("enable_mobile_video_preload")
    public final boolean enableMobileVideoPreload = true;

    @C09CT("enable_local_cache")
    public final boolean enableLocalCache = true;

    @C09CT("enable_repeat_preload_local_media")
    public final boolean enableRepeatPreloadLocalMedia = true;

    public final boolean getEnableApiPreload() {
        return this.enableApiPreload;
    }

    public final boolean getEnableLocalCache() {
        return this.enableLocalCache;
    }

    public final boolean getEnableMobileApiPreload() {
        return this.enableMobileApiPreload;
    }

    public final boolean getEnableMobileVideoPreload() {
        return this.enableMobileVideoPreload;
    }

    public final boolean getEnableRepeatPreloadLocalMedia() {
        return this.enableRepeatPreloadLocalMedia;
    }

    public final boolean getEnableVideoPreload() {
        return this.enableVideoPreload;
    }

    public final int getPreloadTtl() {
        return this.preloadTtl;
    }

    public final int getVideoPreloadDelayTime() {
        return this.videoPreloadDelayTime;
    }
}
