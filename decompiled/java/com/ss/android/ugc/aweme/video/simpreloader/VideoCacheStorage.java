package com.ss.android.ugc.aweme.video.simpreloader;

import X.C13VI;
import X.C2354709Kn;
import X.EnumC1335310kqv;
import X.EnumC1335420kr6;
import X.InterfaceC1482870ogv;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.File;

/* JADX INFO: loaded from: classes31.dex */
public class VideoCacheStorage extends C13VI {
    public final InterfaceC1482870ogv LIZIZ;

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return this.LIZIZ.getCacheDir();
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    public VideoCacheStorage(InterfaceC1482870ogv interfaceC1482870ogv) {
        this.LIZIZ = interfaceC1482870ogv;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        File fileLJIIIIZZ = LJIIIIZZ();
        long jMax = 0;
        if (fileLJIIIIZZ != null && fileLJIIIIZZ.exists()) {
            jMax = Math.max(C2354709Kn.LJIIJ(fileLJIIIIZZ.getAbsolutePath()), 0L);
        }
        if (z) {
            this.LIZIZ.clearCache();
        }
        return jMax;
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        TTVideoEngine.LLFII(2038, 1);
        TTVideoEngine.LLFII(2040, EnumC1335310kqv.EXTREME_LOW.getValue());
        TTVideoEngine.LLFII(2039, 1);
        return 0L;
    }
}
