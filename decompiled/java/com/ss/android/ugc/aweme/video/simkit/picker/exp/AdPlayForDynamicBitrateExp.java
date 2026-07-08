package com.ss.android.ugc.aweme.video.simkit.picker.exp;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: loaded from: classes10.dex */
public interface AdPlayForDynamicBitrateExp {
    public static final AdPlayConfig LIZ = new AdPlayConfig();

    public static class AdPlayConfig {

        @C09CT("min_sample_size")
        public int minSampleSize = 10;

        @C09CT("min_continuous_size")
        public int minContinuousSize = 3;

        @C09CT("min_speed_in_kbps")
        public int minSpeedInKBps = LivePreCreateNextRoomPlayer.ENABLE;
    }
}
