package com.ss.android.ugc.aweme.tako.experiment;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoChatStreamTypeConfigExperiment {
    public static final Config LIZ = new Config(100, 1, 750, 30, C1697810uHb.LJIIJJI(10, 25, 40), 150, 20, true, true, true, 0);
    public static final C01GW LIZIZ;

    static {
        new Config(100L, 1, 750L, 30, C1697810uHb.LJIIJJI(10, 25, 40), 150, 20, true, true, true, 0);
        LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2045));
    }

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }

    public static final class Config {

        @C09CT("alpha_time")
        public final int alphaFps;

        @C09CT("alpha_time")
        public final long alphaTime;

        @C09CT("char_count_per_step")
        public final int charCountPerStep;

        @C09CT("char_count_strategy")
        public final int charCountStrategy;

        @C09CT("char_count_strategy_params")
        public final List<Integer> charCountStrategyParams;

        @C09CT("characters_or_bytes")
        public final int charactersOrBytes;

        @C09CT("enable_smart_script_detection")
        public final boolean enableSmartScriptDetection;

        @C09CT("enable_text_boundary_align")
        public final boolean enableTextBoundaryAlign;

        @C09CT("interval_time")
        public final long intervalTime;

        @C09CT("max_boundary_offset")
        public final int maxBoundaryOffset;

        @C09CT("prefer_sentence_boundary")
        public final boolean preferSentenceBoundary;

        public Config() {
            this(100L, 1, 750L, 30, C1697810uHb.LJIIJJI(10, 25, 40), 150, 20, true, true, true, 0);
        }

        public Config(long j, int i, long j2, int i2, List<Integer> list, int i3, int i4, boolean z, boolean z2, boolean z3, int i5) {
            this.intervalTime = j;
            this.charCountStrategy = i;
            this.alphaTime = j2;
            this.alphaFps = i2;
            this.charCountStrategyParams = list;
            this.charCountPerStep = i3;
            this.maxBoundaryOffset = i4;
            this.enableTextBoundaryAlign = z;
            this.preferSentenceBoundary = z2;
            this.enableSmartScriptDetection = z3;
            this.charactersOrBytes = i5;
        }
    }
}
