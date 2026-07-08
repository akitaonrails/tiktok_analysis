package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PageMemoryMonitorConfig {
    public static final int $stable = 8;

    @C09CT("pss")
    public final boolean enablePss;

    @C09CT("thread")
    public final boolean enableThread;

    @C09CT("vss")
    public final boolean enableVss;

    @C09CT("interval")
    public final long interval;

    @C09CT("pageList")
    public final List<String> pageList;

    @C09CT("sample")
    public final float sample;

    @C09CT("short")
    public final boolean shortName;

    public PageMemoryMonitorConfig() {
        this(0.0f, 30000L, false, false, false, false, null);
    }

    public PageMemoryMonitorConfig(float f, long j, boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        this.sample = f;
        this.interval = j;
        this.enablePss = z;
        this.enableThread = z2;
        this.enableVss = z3;
        this.shortName = z4;
        this.pageList = list;
    }
}
