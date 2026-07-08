package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryDumpsysDebugConfig {
    public static final List<List<String>> LIZ = C1697810uHb.LJIIJJI(Collections.singletonList("android.database.Cursor"), Collections.singletonList("android.graphics.Typeface"), Collections.singletonList("android.view.SurfaceView"), Collections.singletonList("com.ss.videoarch.liveplayer.VideoLiveManager"), Collections.singletonList("com.lynx.tasm.LynxTemplateRender"), Collections.singletonList("com.ss.ttvideo.TTKPlayerV2Temp1"));

    @C09CT("classes")
    public final List<String> classes;

    @C09CT("interval")
    public final long interval;

    @C09CT("sample")
    public final float sample;

    public MemoryDumpsysDebugConfig() {
        this(6.0E-4f, 300000L, null);
    }

    public MemoryDumpsysDebugConfig(float f, long j, List<String> list) {
        this.sample = f;
        this.interval = j;
        this.classes = list;
    }
}
