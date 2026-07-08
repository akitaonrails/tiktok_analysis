package com.ss.android.ugc.aweme.ecommerce.ug.popup.manager;

import X.C0WWZ;
import X.C2252611DEt;
import X.C23250099c;
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

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgShopTabPopupManager$awaitSafPopupThenLoad$2$lifecycleObserver$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ InterfaceC824510WWb LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLILZLL;

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
        this.LL.getLifecycle().removeObserver(this);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C0WWZ(this.LLILLJJLI, this.LL, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null), 3);
    }

    public EcUgShopTabPopupManager$awaitSafPopupThenLoad$2$lifecycleObserver$1(Fragment fragment, InterfaceC824510WWb interfaceC824510WWb, String str, Function2 function2, boolean z, C2252611DEt c2252611DEt) {
        this.LL = fragment;
        this.LLILLJJLI = interfaceC824510WWb;
        this.LLILLL = str;
        this.LLILZ = function2;
        this.LLILZIL = z;
        this.LLILZLL = c2252611DEt;
    }
}
