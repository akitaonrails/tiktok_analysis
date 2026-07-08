package com.ss.android.ugc.aweme.ecommerce.core.engine;

import X.AbstractC1746380vXw;
import X.C19465311Dn;
import X.EnumC969503qf;
import X.InterfaceC1002303vx;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes2.dex */
public interface IComponentStrategyService<VM extends ViewModel> extends ViewModelProvider.Factory {
    ViewModelProvider.Factory LIZ();

    VM LIZIZ();

    InterfaceC1002303vx<VM> LIZJ(LifecycleOwner lifecycleOwner);

    void LIZLLL(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv);

    void LJ(AbstractC1746380vXw abstractC1746380vXw, C19465311Dn c19465311Dn);

    EnumC969503qf getType();
}
