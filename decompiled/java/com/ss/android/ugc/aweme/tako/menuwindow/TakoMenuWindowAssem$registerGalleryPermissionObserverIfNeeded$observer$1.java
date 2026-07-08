package com.ss.android.ugc.aweme.tako.menuwindow;

import X.C19EG;
import X.C356901a3;
import X.C540120LGg;
import X.EnumC1853160yKA;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMenuWindowAssem$registerGalleryPermissionObserverIfNeeded$observer$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ TakoMenuWindowAssem LL;
    public final /* synthetic */ C19EG LLILLJJLI;

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
        EnumC1853160yKA enumC1853160yKA;
        boolean z;
        boolean zLIZLLL = C540120LGg.LIZLLL();
        boolean zLJ = C540120LGg.LJ();
        if (zLIZLLL) {
            enumC1853160yKA = EnumC1853160yKA.FULL_GRANTED;
        } else if (zLJ) {
            enumC1853160yKA = EnumC1853160yKA.PARTIAL_GRANTED;
        } else {
            enumC1853160yKA = EnumC1853160yKA.DENIED;
        }
        EnumC1853160yKA enumC1853160yKA2 = this.LL.mp().getState().LLILZIL;
        EnumC1853160yKA enumC1853160yKA3 = EnumC1853160yKA.DENIED;
        if (enumC1853160yKA2 == enumC1853160yKA3 && enumC1853160yKA != enumC1853160yKA3) {
            z = true;
        } else {
            z = false;
        }
        if (enumC1853160yKA != enumC1853160yKA2) {
            this.LL.mp().setState(new AwS606S0100000_27(enumC1853160yKA, 391));
        }
        if (z) {
            this.LL.mp().wQ2(this.LLILLJJLI);
        }
        TakoMenuWindowAssem takoMenuWindowAssem = this.LL;
        if (!takoMenuWindowAssem.LLL || enumC1853160yKA == enumC1853160yKA3) {
            return;
        }
        takoMenuWindowAssem.LLL = false;
        takoMenuWindowAssem.mp().wQ2(this.LLILLJJLI);
        TakoMenuWindowAssem takoMenuWindowAssem2 = this.LL;
        View view = takoMenuWindowAssem2.LLLF;
        if (view != null) {
            takoMenuWindowAssem2.LLLF = null;
            takoMenuWindowAssem2.hp(view, takoMenuWindowAssem2.LLLFF);
            takoMenuWindowAssem2.LLLFF = false;
        }
    }

    public TakoMenuWindowAssem$registerGalleryPermissionObserverIfNeeded$observer$1(TakoMenuWindowAssem takoMenuWindowAssem, C19EG c19eg) {
        this.LL = takoMenuWindowAssem;
        this.LLILLJJLI = c19eg;
    }
}
