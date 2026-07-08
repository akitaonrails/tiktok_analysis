package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class CelebrationParallelDownloadConfig {
    public static final CelebrationDownloadConfig LIZ = new CelebrationDownloadConfig(false, 0, null, null, 15, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2165));

    public static final class CelebrationDownloadConfig {

        @C09CT("enable_parallel_download")
        public final boolean enableParallelDownload;

        @C09CT("max_concurrent_downloads")
        public final int maxConcurrentDownloads;

        @C09CT("supported_celebration_types")
        public final List<Integer> supportedCelebrationTypes;

        @C09CT("supported_scenes")
        public final List<String> supportedScenes;

        public CelebrationDownloadConfig() {
            this(false, 0, null, null, 15, null);
        }

        public CelebrationDownloadConfig(boolean z, int i, List<Integer> list, List<String> list2) {
            this.enableParallelDownload = z;
            this.maxConcurrentDownloads = i;
            this.supportedCelebrationTypes = list;
            this.supportedScenes = list2;
        }

        public CelebrationDownloadConfig(boolean z, int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 8 : i, (i2 & 4) != 0 ? Collections.singletonList(2) : list, (i2 & 8) != 0 ? C1697810uHb.LJIIJJI("first_render", "reapply") : list2);
        }
    }
}
