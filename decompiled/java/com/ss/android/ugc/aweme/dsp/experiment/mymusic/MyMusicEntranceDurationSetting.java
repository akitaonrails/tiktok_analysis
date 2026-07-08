package com.ss.android.ugc.aweme.dsp.experiment.mymusic;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class MyMusicEntranceDurationSetting {
    public static final MyMusicEntranceDurationConfig LIZ = new MyMusicEntranceDurationConfig(90, 90);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(125));

    public static final class MyMusicEntranceDurationConfig {

        @C09CT("add_song_duration")
        public final int addSongDuration;

        @C09CT("enter_my_music_duration")
        public final int enterMyMusicDuration;

        public MyMusicEntranceDurationConfig(int i, int i2) {
            this.enterMyMusicDuration = i;
            this.addSongDuration = i2;
        }
    }
}
