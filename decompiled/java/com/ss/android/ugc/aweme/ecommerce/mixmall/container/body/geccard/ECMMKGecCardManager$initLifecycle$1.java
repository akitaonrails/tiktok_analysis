package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.geccard;

import X.C21319918c1;
import X.C21322218cO;
import X.C2188811AlT;
import X.C356901a3;
import X.C599820Nfo;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.Reference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class ECMMKGecCardManager$initLifecycle$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C21319918c1 LL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public ECMMKGecCardManager$initLifecycle$1(C21319918c1 c21319918c1) {
        this.LL = c21319918c1;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SliceManager onDestroy ");
        sbLIZ.append(lifecycleOwner);
        C2188811AlT.LIZIZ(sbLIZ);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LL.LIZJ.LIZIZ();
        C21322218cO.LIZ.getClass();
        Reference reference = (Reference) ((ConcurrentHashMap) C21322218cO.LJI.LJFF.getValue()).remove("MixMall");
        if (reference != null) {
            reference.get();
        }
    }
}
