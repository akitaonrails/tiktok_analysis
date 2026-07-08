package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class EnginePlayBackSpeedPreciseExp {
    public static final PlayBackConfig LIZ = new PlayBackConfig(0);

    public static final class PlayBackConfig {

        @C09CT("is_enable_play_back")
        public final int is_enable_play_back;

        public PlayBackConfig() {
            this(0);
        }

        public final int is_enable_play_back() {
            return this.is_enable_play_back;
        }

        public PlayBackConfig(int i) {
            this.is_enable_play_back = i;
        }
    }
}
