package com.ss.android.ugc.aweme.poi.mapmode.map;

import X.AnonymousClass0956;
import X.C054G;
import X.C09AE;
import X.C1177210gjv;
import X.C2296808zG;
import X.InterfaceC1177110gjl;
import X.InterfaceC497601wk;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapModeClusterPicLoader implements InterfaceC497601wk, GenericLifecycleObserver {
    public final InterfaceC1177110gjl<C1177210gjv> LLILLJJLI;
    public AnonymousClass0956 LLILLL;
    public final /* synthetic */ C054G LL = C2296808zG.LIZIZ();
    public final List<C09AE> LLILZ = new ArrayList();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LL.LL;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        AnonymousClass0956 anonymousClass0956 = this.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((C09AE) it2.next()).LIZIZ(null);
        }
    }

    public PoiMapModeClusterPicLoader(InterfaceC1177110gjl<C1177210gjv> interfaceC1177110gjl) {
        this.LLILLJJLI = interfaceC1177110gjl;
    }
}
