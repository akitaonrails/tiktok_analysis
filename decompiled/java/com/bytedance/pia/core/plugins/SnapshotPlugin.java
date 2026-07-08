package com.bytedance.pia.core.plugins;

import X.C1287700jc8;
import X.C1BO6;
import X.C2204041BNy;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.pia.core.PiaManifest;

/* JADX INFO: loaded from: classes35.dex */
public final class SnapshotPlugin extends C1BO6 {
    @Override // X.C1BO6
    public final String LIZ() {
        return "snapshot";
    }

    @Override // X.C1BO6
    public final void LIZIZ() {
        C786410Ut5.LJJZZIII(C1287700jc8.LIZ(), new Runnable() { // from class: X.08FR
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SnapShotManager@13d9.initialize$1");
                try {
                    if (C08FS.LIZ.compareAndSet(false, true)) {
                        PatternProtector.compile("<meta name=\"pia-snapshot\" content=\"(.*?)\">", 0);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SnapShotManager@13d9.initialize$1");
            }
        });
    }

    public SnapshotPlugin(C2204041BNy c2204041BNy, PiaManifest piaManifest) {
        super(c2204041BNy);
    }
}
