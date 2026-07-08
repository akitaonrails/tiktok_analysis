package com.ss.android.ugc.aweme.tako.botpage.components.product;

import X.C1554610qYd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoProductItemCell$onBindItemView$$inlined$registerProtocol$default$1 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            C1554610qYd.LIZLLL(null, ITakoHighLightAnimProtocol.class, null);
        }
    }
}
