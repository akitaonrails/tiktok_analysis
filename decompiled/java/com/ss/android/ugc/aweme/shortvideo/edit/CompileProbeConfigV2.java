package com.ss.android.ugc.aweme.shortvideo.edit;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public class CompileProbeConfigV2 {

    @C09CT("bitrateRange")
    public final String bitrateRange;

    @C09CT("bitrateStrategy")
    public final int bitrateStrategy;

    @C09CT("endPointMs")
    public final long endPointMs;

    @C09CT("probeType")
    public final int probeType;

    @C09CT("startPointMs")
    public final long startPointMs;

    public CompileProbeConfigV2() {
        this(3000L, 4000L, 2, 0, "");
    }

    public String getBitrateRange() {
        return this.bitrateRange;
    }

    public int getBitrateStrategy() {
        return this.bitrateStrategy;
    }

    public long getEndPointMs() {
        return this.endPointMs;
    }

    public int getProbeType() {
        return this.probeType;
    }

    public long getStartPointMs() {
        return this.startPointMs;
    }

    public CompileProbeConfigV2(long j, long j2, int i, int i2, String str) {
        this.startPointMs = j;
        this.endPointMs = j2;
        this.probeType = i;
        this.bitrateStrategy = i2;
        this.bitrateRange = str;
    }
}
