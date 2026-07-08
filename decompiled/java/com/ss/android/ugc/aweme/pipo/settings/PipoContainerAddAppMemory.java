package com.ss.android.ugc.aweme.pipo.settings;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoContainerAddAppMemory {
    public static final PipoContainerAddAppMemoryConfig LIZ = new PipoContainerAddAppMemoryConfig(Boolean.TRUE, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL));

    public static final class PipoContainerAddAppMemoryConfig {

        @C09CT("cache_time")
        public final Long cacheTime;

        @C09CT("enable")
        public final Boolean enable;

        public PipoContainerAddAppMemoryConfig() {
            this(Boolean.TRUE, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL));
        }

        public PipoContainerAddAppMemoryConfig(Boolean bool, Long l) {
            this.enable = bool;
            this.cacheTime = l;
        }
    }
}
