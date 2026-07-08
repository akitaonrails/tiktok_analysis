package com.ss.android.ugc.aweme.live.strategy;

import X.C356901a3;
import X.C473410IhP;
import X.C799900VZk;
import X.C800150Va9;
import X.EnumC800210VaF;
import X.InterfaceC800110Va5;
import Y.ARunnableS107S0100000_7;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.performance.DowngradeLegoConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostDowngradeLegoTaskSettings;

/* JADX INFO: loaded from: classes8.dex */
public final class LegoTaskDowngradeStrategy implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final String LL;
    public final LifecycleOwner LLILLJJLI;
    public C800150Va9 LLILLL;
    public final DowngradeLegoConfig LLILZ = LiveHostDowngradeLegoTaskSettings.getConfig();
    public final ARunnableS107S0100000_7 LLILZIL = new ARunnableS107S0100000_7(this, 142);

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
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final void LIZ() {
        this.LLILLJJLI.getLifecycle().addObserver(this);
        long j = this.LLILZ.time;
        if (j > 0) {
            C473410IhP.LIZJ(this.LLILZIL, j);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        C799900VZk c799900VZk = C799900VZk.LIZ;
        InterfaceC800110Va5 interfaceC800110Va5 = new InterfaceC800110Va5() { // from class: X.0IhO
            @Override // X.InterfaceC800110Va5
            public final String scene() {
                return this.LIZ.LL;
            }

            @Override // X.InterfaceC800110Va5
            public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
                if (interfaceC800080Va2 != null && !this.LIZ.LLILZ.taskList.contains(interfaceC800080Va2.key()) && this.LIZ.LLILZ.triggerTypeList.contains(interfaceC800080Va2.triggerType().name())) {
                    return EnumC800210VaF.Suspend;
                }
                return EnumC800210VaF.Normal;
            }
        };
        c799900VZk.getClass();
        this.LLILLL = C799900VZk.LIZ(interfaceC800110Va5);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        C473410IhP.LJ(this.LLILZIL);
        C799900VZk c799900VZk = C799900VZk.LIZ;
        String str = this.LL;
        c799900VZk.getClass();
        C799900VZk.LJI(str);
        C800150Va9 c800150Va9 = this.LLILLL;
        if (c800150Va9 != null) {
            c800150Va9.LIZ(EnumC800210VaF.Suspend).LIZIZ();
        }
        this.LLILLL = null;
        this.LLILLJJLI.getLifecycle().removeObserver(this);
    }

    public LegoTaskDowngradeStrategy(String str, LifecycleOwner lifecycleOwner) {
        this.LL = str;
        this.LLILLJJLI = lifecycleOwner;
    }
}
