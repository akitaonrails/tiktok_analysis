package com.ss.ttm.player;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class TraitObject {
    public final int LIZ = 0;

    private native void nativeRelease(long j);

    private long takeNativeObj() {
        return 0L;
    }

    public final void LIZ() {
        long jTakeNativeObj = takeNativeObj();
        if (jTakeNativeObj != 0) {
            try {
                nativeRelease(jTakeNativeObj);
            } catch (UnsatisfiedLinkError e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public boolean sameAs(TraitObject traitObject) {
        if (traitObject == null) {
            return false;
        }
        return equals(traitObject);
    }
}
