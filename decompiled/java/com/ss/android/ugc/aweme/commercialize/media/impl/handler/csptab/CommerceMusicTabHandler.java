package com.ss.android.ugc.aweme.commercialize.media.impl.handler.csptab;

import X.C15HD;
import X.C15HT;
import X.C15MA;
import X.C15MF;
import X.C15MG;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceMusicTabHandler implements C15HT {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.C15HT
    public final void DI(C15HD c15hd) {
        boolean z;
        C15MA.LL.getClass();
        C15MF c15mfLIZIZ = C15MA.LIZIZ();
        if (c15mfLIZIZ != null && (c15mfLIZIZ instanceof C15MG)) {
            C15MG c15mg = (C15MG) c15mfLIZIZ;
            if (c15hd == C15HD.FAVORITES) {
                z = true;
            } else {
                z = false;
            }
            c15mg.LIZ = z;
        }
    }
}
