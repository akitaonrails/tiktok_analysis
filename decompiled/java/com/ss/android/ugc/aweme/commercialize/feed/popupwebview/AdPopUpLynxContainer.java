package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.InterfaceC1039110d9B;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;

/* JADX INFO: loaded from: classes17.dex */
public final class AdPopUpLynxContainer implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLILLL = 0;
    public final LifecycleOwner LL;
    public final InterfaceC1039110d9B LLILLJJLI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        AdLynxStatBusiness adLynxStatBusiness;
        InterfaceC1039110d9B interfaceC1039110d9B = this.LLILLJJLI;
        if (interfaceC1039110d9B == null || (adLynxStatBusiness = (AdLynxStatBusiness) interfaceC1039110d9B.LIZIZ(AdLynxStatBusiness.class)) == null) {
            return;
        }
        adLynxStatBusiness.LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        AdLynxStatBusiness adLynxStatBusiness;
        System.currentTimeMillis();
        InterfaceC1039110d9B interfaceC1039110d9B = this.LLILLJJLI;
        if (interfaceC1039110d9B == null || (adLynxStatBusiness = (AdLynxStatBusiness) interfaceC1039110d9B.LIZIZ(AdLynxStatBusiness.class)) == null) {
            return;
        }
        adLynxStatBusiness.LIZJ();
    }

    public AdPopUpLynxContainer(LifecycleOwner lifecycleOwner, InterfaceC1039110d9B interfaceC1039110d9B) {
        this.LL = lifecycleOwner;
        this.LLILLJJLI = interfaceC1039110d9B;
        lifecycleOwner.getLifecycle().addObserver(this);
    }
}
