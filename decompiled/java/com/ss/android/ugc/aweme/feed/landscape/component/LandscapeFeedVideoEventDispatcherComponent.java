package com.ss.android.ugc.aweme.feed.landscape.component;

import X.C01GW;
import X.C0RU3;
import X.C452501pT;
import X.C737030Svd;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeFeedVideoEventDispatcherComponent extends BasePanelComponent implements LandscapeFeedVideoEventDispatcherAbility, InterfaceC1554640qYg {
    public final C01GW LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(111));

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1567494017) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility
    public final C0RU3 bE2() {
        return (C0RU3) this.LL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility
    public final void Qu1(LifecycleOwner lifecycleOwner, final Function1<? super C737030Svd, Unit> function1) {
        final C0RU3 c0ru3 = (C0RU3) this.LL.getValue();
        c0ru3.LL.add(function1);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedVideoEventDispatcher$addListener$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    c0ru3.LL.remove(function1);
                }
            }
        });
    }
}
