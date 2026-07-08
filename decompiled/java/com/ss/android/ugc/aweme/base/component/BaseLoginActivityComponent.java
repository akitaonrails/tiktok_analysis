package com.ss.android.ugc.aweme.base.component;

import X.C0R1H;
import X.C0XPE;
import X.C786410Ut5;
import X.InterfaceC849390XTt;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BaseLoginActivityComponent implements C0XPE, GenericLifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.C0XPE
    public void LIZ(Fragment fragment, String str, String str2, Bundle bundle, InterfaceC849390XTt interfaceC849390XTt) {
        fragment.getLifecycle().addObserver(this);
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0XPE
    public void LIZIZ(Activity activity, String str, String str2, Bundle bundle, InterfaceC849390XTt interfaceC849390XTt) {
        if (activity instanceof LifecycleOwner) {
            C0R1H.LIZIZ((LifecycleOwner) activity, this);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
    }
}
