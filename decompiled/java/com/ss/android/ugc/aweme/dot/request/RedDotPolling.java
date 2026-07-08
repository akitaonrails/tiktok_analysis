package com.ss.android.ugc.aweme.dot.request;

import X.AnonymousClass0956;
import X.C09JN;
import X.C11JF;
import X.C11NZ;
import X.C1586680rOM;
import X.C2232408os;
import X.C23250099c;
import X.C260140AHk;
import X.C296340BjU;
import X.C817503Hh;
import X.C823050WQl;
import X.C859360XnS;
import X.EnumC1586970rOp;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.dot.request.RedDotPolling;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabRedDotOptimizationSettings;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes25.dex */
public final class RedDotPolling implements GenericLifecycleObserver {
    public static final RedDotPolling LL = new RedDotPolling();
    public static C11JF LLILLJJLI;
    public static long LLILLL;
    public static long LLILZ;
    public static AnonymousClass0956 LLILZIL;
    public static volatile boolean LLILZLL;

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onForeground() {
        LIZIZ(true);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            onForeground();
        }
    }

    public static void LIZ() {
        if ((((Number) C296340BjU.LIZ.getValue()).intValue() & 2) == 2) {
            LLILZLL = false;
            AnonymousClass0956 anonymousClass0956 = LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LLILZIL = null;
        } else {
            C11JF c11jf = LLILLJJLI;
            if (c11jf != null) {
                c11jf.dispose();
            }
        }
        if (LLILLL > 0) {
            LLILZ = System.currentTimeMillis() - LLILLL;
            LLILLL = 0L;
        }
    }

    public static void LIZLLL() {
        if (ProcessLifecycleOwner.Companion.get().getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            LLILLL = System.currentTimeMillis();
            C1586680rOM c1586680rOM = C1586680rOM.LIZ;
            EnumC1586970rOp enumC1586970rOp = EnumC1586970rOp.POOLING;
            boolean zLJI = MethodIDManager.LJI(137209);
            c1586680rOM.getClass();
            C1586680rOM.LIZJ(enumC1586970rOp, null);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public final void LIZJ() {
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(this);
        LIZIZ(true);
        StateOwner.LL.getClass();
        StateOwner.LLILZLL.observeForever(new Observer() { // from class: X.0rOn
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    RedDotPolling.LL.getClass();
                    RedDotPolling.LIZ();
                }
            }
        });
        StateOwner.LLILZIL.observeForever(new Observer() { // from class: X.0rOo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    RedDotPolling.LL.getClass();
                    RedDotPolling.LIZ();
                }
            }
        });
    }

    public static void LIZIZ(boolean z) {
        if (!((Boolean) C260140AHk.LIZ.getValue()).booleanValue()) {
            return;
        }
        if ((((Number) C296340BjU.LIZ.getValue()).intValue() & 2) == 2) {
            long j = FriendsTabRedDotOptimizationSettings.LIZ().pollingIntervalSeconds * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            AnonymousClass0956 anonymousClass0956 = LLILZIL;
            if (anonymousClass0956 != null && anonymousClass0956.isActive() && LLILZLL) {
                return;
            }
            AnonymousClass0956 anonymousClass09562 = LLILZIL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            LLILZLL = true;
            LLILZIL = C23250099c.LIZLLL(C817503Hh.LL, new C2232408os(C823050WQl.LIZLLL()), null, new C859360XnS(j, null, z), 2);
            return;
        }
        C11JF c11jf = LLILLJJLI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        long j2 = FriendsTabRedDotOptimizationSettings.LIZ().pollingIntervalSeconds;
        LLILLJJLI = (C11JF) C11NZ.LJJJJJL(j2, j2, TimeUnit.SECONDS).LJJLJLI(new C09JN() { // from class: X.0XnT
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RedDotPolling@1325.polling$2");
                RedDotPolling.LL.getClass();
                RedDotPolling.LIZLLL();
                C1C7U.LIZIZ("RedDotPolling@1325.polling$2");
            }
        });
    }
}
