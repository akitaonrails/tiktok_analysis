package com.ss.android.ugc.aweme.ecommerce.ug.popup.manager;

import X.C0WXU;
import X.C1740300vO8;
import X.C2252611DEt;
import X.C23250099c;
import X.C324990Cob;
import X.C356901a3;
import X.InterfaceC20236714Gf;
import X.InterfaceC824510WWb;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public final class EcUgShopTabPopupManager$awaitPopupThenLoad$2$lifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ InterfaceC824510WWb LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        C1740300vO8.LIZ.getClass();
        if (C1740300vO8.LIZIZ) {
            if (this.LL.isActive()) {
                C324990Cob.LIZ(Boolean.TRUE, this.LL);
            }
            this.LLILLJJLI.getLifecycle().removeObserver(this);
            return;
        }
        InterfaceC824510WWb interfaceC824510WWb = this.LLILLL;
        if (interfaceC824510WWb != null) {
            interfaceC824510WWb.LJ(false);
        }
        this.LLILLJJLI.getLifecycle().removeObserver(this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILLJJLI), null, null, new C0WXU(this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LL, this.LLILLL, null), 3);
    }

    public EcUgShopTabPopupManager$awaitPopupThenLoad$2$lifecycleObserver$1(C2252611DEt c2252611DEt, Fragment fragment, InterfaceC824510WWb interfaceC824510WWb, String str, boolean z, int i, Function2 function2, boolean z2) {
        this.LL = c2252611DEt;
        this.LLILLJJLI = fragment;
        this.LLILLL = interfaceC824510WWb;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = function2;
        this.LLIZLLLIL = z2;
    }
}
