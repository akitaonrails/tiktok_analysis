package com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.cluster;

import X.AnonymousClass0956;
import X.C054G;
import X.C1178080glK;
import X.C2296808zG;
import X.InterfaceC1177110gjl;
import X.InterfaceC497601wk;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCampaignMarkerPicLoader implements InterfaceC497601wk, GenericLifecycleObserver {
    public final /* synthetic */ C054G LL = C2296808zG.LIZIZ();
    public final InterfaceC1177110gjl<C1178080glK> LLILLJJLI;
    public AnonymousClass0956 LLILLL;

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
    }

    public PoiCampaignMarkerPicLoader(InterfaceC1177110gjl<C1178080glK> interfaceC1177110gjl) {
        this.LLILLJJLI = interfaceC1177110gjl;
    }
}
