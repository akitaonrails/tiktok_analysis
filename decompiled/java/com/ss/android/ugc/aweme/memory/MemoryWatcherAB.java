package com.ss.android.ugc.aweme.memory;

import X.C01GW;
import X.C09CT;
import X.C09QA;
import X.C452501pT;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryWatcherAB {
    public static final WatcherConfig LIZ = new WatcherConfig();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C09QA());

    public static final class Config {

        @C09CT("is_open")
        public boolean isOpen;

        @C09CT("level_escape_count")
        public int levelEscapeCount;

        @C09CT("window_size")
        public int windowSize = 5;

        @C09CT("alpha")
        public float alpha = 0.2f;

        @C09CT("ewma_rate")
        public float ewmaRate = 0.5f;

        @C09CT("level_low")
        public float levelLow = 300.0f;

        @C09CT("level_medium")
        public float levelMedium = 500.0f;

        @C09CT("level_high")
        public float levelHigh = 800.0f;
    }

    public static final class WatcherConfig {

        @C09CT("java_config")
        public Config javaConfig;

        @C09CT("native_config")
        public Config nativeConfig;
    }
}
