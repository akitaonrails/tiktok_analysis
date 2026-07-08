package com.ss.android.ugc.aweme.state.ability;

import X.C612190Nzl;
import X.EnumC614120O6w;
import X.InterfaceC1631620sYq;
import X.InterfaceC346201Wa;
import X.InterfaceC612260Nzs;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public interface IStateNotifier<S> {
    void addSubscriber(InterfaceC612260Nzs<S> interfaceC612260Nzs);

    void addSubscriber(InterfaceC1631620sYq<? super String, Object, ? super EnumC614120O6w, Unit> interfaceC1631620sYq);

    void removeSubscriber(InterfaceC612260Nzs<S> interfaceC612260Nzs);

    void removeSubscriber(InterfaceC1631620sYq<? super String, Object, ? super EnumC614120O6w, Unit> interfaceC1631620sYq);

    InterfaceC346201Wa<C612190Nzl<S>> subscribe();
}
