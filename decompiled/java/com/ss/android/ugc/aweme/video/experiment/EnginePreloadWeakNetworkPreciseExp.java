package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class EnginePreloadWeakNetworkPreciseExp {
    public static final WeakNetworkConfig LIZ = new WeakNetworkConfig(0, 0, 0, 0, -1, -1, -1, -1, -1, -1);

    public static final class WeakNetworkConfig {

        @C09CT("is_weak_preload")
        public final int is_weak_preload;

        @C09CT("min_parallel_buffer_ms")
        public final int min_parallel_buffer_ms;

        @C09CT("min_parallel_safe_factor")
        public final int min_parallel_safe_factor;

        @C09CT("mobile_weak_threshold")
        public final int mobile_weak_threshold;

        @C09CT("high_max_size")
        public final int preload_high_max_size;

        @C09CT("preload_low_max_count")
        public final int preload_low_max_count;

        @C09CT("low_max_size")
        public final int preload_low_max_size;

        @C09CT("unkown_weak_threshold")
        public final int unkown_weak_threshold;

        @C09CT("weak_quick_sliding_time_ms")
        public final int weak_quick_sliding_time_ms;

        @C09CT("wifi_weak_threshold")
        public final int wifi_weak_threshold;

        public WeakNetworkConfig() {
            this(0, 0, 0, 0, -1, -1, -1, -1, -1, -1);
        }

        public final int is_weak_preload() {
            return this.is_weak_preload;
        }

        public WeakNetworkConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.is_weak_preload = i;
            this.wifi_weak_threshold = i2;
            this.mobile_weak_threshold = i3;
            this.unkown_weak_threshold = i4;
            this.preload_low_max_size = i5;
            this.preload_high_max_size = i6;
            this.preload_low_max_count = i7;
            this.min_parallel_safe_factor = i8;
            this.weak_quick_sliding_time_ms = i9;
            this.min_parallel_buffer_ms = i10;
        }
    }
}
