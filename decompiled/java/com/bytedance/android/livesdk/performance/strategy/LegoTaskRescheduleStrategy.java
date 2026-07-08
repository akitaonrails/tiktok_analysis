package com.bytedance.android.livesdk.performance.strategy;

import X.C356901a3;
import X.C799900VZk;
import X.C800150Va9;
import X.EnumC800210VaF;
import X.InterfaceC800110Va5;
import Y.ARunnableS107S0100000_7;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.performance.strategy.LegoTaskRescheduleStrategy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes8.dex */
public final class LegoTaskRescheduleStrategy implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final LifecycleOwner LLILLJJLI;
    public C800150Va9 LLILLL;
    public int LLILZIL;
    public final String LL = "LiveUser";
    public final DowngradeLegoConfig LLILZ = WatchLiveDowngradeLegoTaskSettings.getConfig();
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS107S0100000_7 LLIZ = new ARunnableS107S0100000_7(this, 168);

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

    public LegoTaskRescheduleStrategy(LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
        C799900VZk c799900VZk = C799900VZk.LIZ;
        InterfaceC800110Va5 interfaceC800110Va5 = new InterfaceC800110Va5() { // from class: X.0IhN
            @Override // X.InterfaceC800110Va5
            public final String scene() {
                return this.LIZ.LL;
            }

            @Override // X.InterfaceC800110Va5
            public final EnumC800210VaF LIZIZ(InterfaceC800080Va2 interfaceC800080Va2) {
                String strName;
                EnumC799980VZs enumC799980VZsTriggerType;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enter room tasks: count: ");
                LegoTaskRescheduleStrategy legoTaskRescheduleStrategy = this.LIZ;
                int i = legoTaskRescheduleStrategy.LLILZIL + 1;
                legoTaskRescheduleStrategy.LLILZIL = i;
                sbLIZ.append(i);
                sbLIZ.append(", ");
                String strKey = null;
                if (interfaceC800080Va2 != null && (enumC799980VZsTriggerType = interfaceC800080Va2.triggerType()) != null) {
                    strName = enumC799980VZsTriggerType.name();
                } else {
                    strName = null;
                }
                sbLIZ.append(strName);
                sbLIZ.append("  key ");
                if (interfaceC800080Va2 != null) {
                    strKey = interfaceC800080Va2.key();
                }
                sbLIZ.append(strKey);
                C2188811AlT.LIZIZ(sbLIZ);
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
        this.LLILZLL.removeCallbacks(this.LLIZ);
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
}
