package com.ss.android.ugc.aweme.social.sticker;

import X.C098200Yq;
import X.C189200o6;
import X.C20171713wJ;
import X.C356901a3;
import X.C785410UrT;
import X.DialogC1389620mGW;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseCreateSocialStickerHandler$dismissLoading$1$1$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ C20171713wJ LL;
    public final /* synthetic */ Lifecycle LLILLJJLI;

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
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        Object c098200Yq;
        DialogC1389620mGW dialogC1389620mGW;
        C356901a3.LJFF(this, lifecycleOwner);
        C20171713wJ c20171713wJ = this.LL;
        try {
            DialogC1389620mGW dialogC1389620mGW2 = c20171713wJ.LIZLLL;
            if (dialogC1389620mGW2 != null && dialogC1389620mGW2.isShowing() && (dialogC1389620mGW = c20171713wJ.LIZLLL) != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        this.LL.LJ = false;
        this.LLILLJJLI.removeObserver(this);
    }

    public BaseCreateSocialStickerHandler$dismissLoading$1$1$1(Lifecycle lifecycle, C20171713wJ c20171713wJ) {
        this.LL = c20171713wJ;
        this.LLILLJJLI = lifecycle;
    }
}
