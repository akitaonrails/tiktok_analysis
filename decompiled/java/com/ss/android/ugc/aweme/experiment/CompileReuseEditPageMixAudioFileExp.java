package com.ss.android.ugc.aweme.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class CompileReuseEditPageMixAudioFileExp {
    public static final CompileReuseEditPageMixAudioFileExp LIZ = new CompileReuseEditPageMixAudioFileExp();
    public static final Config LIZIZ = new Config();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(34));

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Config {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("ignore_copyright")
        public final boolean ignoreCopyright = true;

        @C09CT("sample_rate")
        public final int sampleRate = 44100;

        @C09CT("bit_rate")
        public final int bitRate = 320000;

        @C09CT("channel_count")
        public final int channelCount = 2;
    }

    public static Config LIZ() {
        return (Config) LIZJ.getValue();
    }
}
