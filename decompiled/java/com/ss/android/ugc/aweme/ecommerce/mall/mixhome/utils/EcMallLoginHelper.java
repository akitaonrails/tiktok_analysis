package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils;

import X.C1776060wJo;
import X.InterfaceC586170Myt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMallLoginHelper {
    public boolean LIZ;
    public ArrayList<InterfaceC586170Myt> LIZIZ;
    public final C1776060wJo LIZJ = new C1776060wJo(this, 0);

    public final void LIZ(InterfaceC586170Myt interfaceC586170Myt) {
        if (!this.LIZ) {
            this.LIZ = true;
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this.LIZJ);
        }
        ArrayList<InterfaceC586170Myt> arrayList = this.LIZIZ;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.LIZIZ = arrayList;
        }
        arrayList.add(interfaceC586170Myt);
    }

    public final void LIZIZ(InterfaceC586170Myt interfaceC586170Myt) {
        ArrayList<InterfaceC586170Myt> arrayList = this.LIZIZ;
        if (arrayList != null) {
            arrayList.remove(interfaceC586170Myt);
        }
        if (this.LIZ) {
            ArrayList<InterfaceC586170Myt> arrayList2 = this.LIZIZ;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJI(this.LIZJ);
                this.LIZ = false;
            }
        }
    }

    public final void LIZJ(final LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        final C1776060wJo c1776060wJo = new C1776060wJo(function0, 1);
        LIZ(c1776060wJo);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils.EcMallLoginHelper$runOnLoginSuccess$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    this.LIZIZ(c1776060wJo);
                }
            }
        });
    }
}
