package com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle;

import X.C0R1H;
import X.C1D62;
import X.C1D65;
import X.C1D66;
import X.EnumC1905420zgS;
import X.InterfaceC1541990qEH;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;

/* JADX INFO: loaded from: classes36.dex */
public final class AppLifecycleProducer implements DefaultLifecycleObserver, ILifecycleProducer, GenericLifecycleObserver {
    public C1D65 LL;

    @Override // com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer
    public final void LIZ() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer
    public final void LJJIJL(C1D62 c1d62) {
        SparkContext sparkContext;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        View viewE1;
        LifecycleOwner lifecycleOwner;
        this.LL = c1d62;
        C1D66 c1d66 = c1d62.LIZ;
        if (c1d66 != null && (sparkContext = c1d66.LJFF) != null && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null && (viewE1 = interfaceC1541990qEHLJIJJ.e1()) != null && (lifecycleOwner = ViewTreeLifecycleOwner.get(viewE1)) != null) {
            C0R1H.LIZIZ(lifecycleOwner, this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(EnumC1905420zgS.ON_CREATE, null, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(EnumC1905420zgS.ON_DESTROY, null, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(EnumC1905420zgS.ON_PAUSE, null, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(EnumC1905420zgS.ON_RESUME, null, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(EnumC1905420zgS.ON_START, null, null);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        C1D65 c1d65 = this.LL;
        if (c1d65 != null) {
            c1d65.LIZ(EnumC1905420zgS.ON_STOP, null, null);
        }
    }
}
