package com.ss.android.ugc.aweme.services.storage;

import X.C09AY;
import X.C0MB0;
import X.C23088092w;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public final class AVStorageManagerImpl$monitor$2 extends C09AY implements Function0<C23088092w> {
    public AVStorageManagerImpl$monitor$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.092w] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C23088092w invoke() {
        return new C0MB0() { // from class: X.092w
            public final AtomicBoolean LIZ = new AtomicBoolean(false);

            @Override // X.C0MB0
            public final void LIZ() {
                if (this.LIZ.compareAndSet(false, true)) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C23087092v(null), 3);
                }
            }

            public static boolean LIZJ() {
                return C0CHQ.LIZ().LJJIIZI().LJJIJIL(true) && C0CLW.LIZIZ.LIZ.getEnableAvStorageMonitor().booleanValue();
            }

            @Override // X.C0MB0
            public final void LIZIZ(File file) {
                LIZJ();
            }
        };
    }
}
