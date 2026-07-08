package com.lynx.animax.composition;

import com.lynx.animax.base.CleanupReference;
import com.lynx.animax.composition.AnimaXComposition;
import com.lynx.animax.util.AnimaXLog;

/* JADX INFO: loaded from: classes14.dex */
public class AnimaXComposition {
    public final long LIZ;

    public static native void nativeDestroy(long j);

    private native long nativeGetEndFrame(long j);

    private native long nativeGetStartFrame(long j);

    public AnimaXComposition(final long j) {
        this.LIZ = j;
        new CleanupReference(this, new Runnable(j) { // from class: X.0Uuq
            public long LL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AnimaXComposition$CleanUpRunnable@39e9.run");
                try {
                    AnimaXLog.LIZIZ("AnimaXComposition", "nativeDestroy AnimaXComposition on CleanupReference.");
                    long j2 = this.LL;
                    if (j2 != 0) {
                        AnimaXComposition.nativeDestroy(j2);
                        this.LL = 0L;
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AnimaXComposition$CleanUpRunnable@39e9.run");
            }

            {
                this.LL = j;
            }
        });
    }

    public static AnimaXComposition create(long j) {
        return new AnimaXComposition(j);
    }
}
