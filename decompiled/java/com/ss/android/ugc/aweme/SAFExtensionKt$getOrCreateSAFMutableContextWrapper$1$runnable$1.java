package com.ss.android.ugc.aweme;

import X.C09AY;
import X.C0R1H;
import X.C2188811AlT;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes32.dex */
public final class SAFExtensionKt$getOrCreateSAFMutableContextWrapper$1$runnable$1 extends C09AY implements Function0<Object> {
    public final /* synthetic */ LifecycleOwner LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SAFExtensionKt$getOrCreateSAFMutableContextWrapper$1$runnable$1(LifecycleOwner lifecycleOwner) {
        super(0);
        this.LL = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (C0R1H.LIZJ(this.LL) == Lifecycle.State.DESTROYED) {
            return SAFExtensionKt.LIZ.remove(this.LL);
        }
        final LifecycleOwner lifecycleOwner = this.LL;
        C0R1H.LIZIZ(lifecycleOwner, new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.SAFExtensionKt$getOrCreateSAFMutableContextWrapper$1$runnable$1.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStateChanged:");
                sbLIZ.append(event);
                sbLIZ.append(" - ");
                sbLIZ.append(lifecycleOwner2);
                C2188811AlT.LIZIZ(sbLIZ);
                if (event == Lifecycle.Event.ON_DESTROY) {
                    SAFExtensionKt.LIZ.remove(lifecycleOwner);
                }
            }
        });
        return Unit.LIZ;
    }
}
