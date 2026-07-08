package com.ss.android.ugc.aweme.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePodcastHotStartPreRequestSetting {
    public static final LivePodcastHotStartPreRequestSetting INSTANCE = new LivePodcastHotStartPreRequestSetting();
    public static final LivePodcastHotStartPreRequestConfig DEFAULT = new LivePodcastHotStartPreRequestConfig();

    private final LivePodcastHotStartPreRequestConfig value() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LivePodcastHotStartPreRequestConfig livePodcastHotStartPreRequestConfig = DEFAULT;
        LivePodcastHotStartPreRequestConfig livePodcastHotStartPreRequestConfig2 = (LivePodcastHotStartPreRequestConfig) c0c64LJIILLIIL.LJJII(LivePodcastHotStartPreRequestConfig.class, livePodcastHotStartPreRequestConfig, "live_podcast_hot_start_pre_request_config", true);
        return livePodcastHotStartPreRequestConfig2 != null ? livePodcastHotStartPreRequestConfig2 : livePodcastHotStartPreRequestConfig;
    }

    public final int getInterval() {
        return value().interval;
    }

    public final boolean isEnable() {
        return value().livePermissionHotStartEnable;
    }

    public final LivePodcastHotStartPreRequestConfig getDEFAULT() {
        return DEFAULT;
    }
}
