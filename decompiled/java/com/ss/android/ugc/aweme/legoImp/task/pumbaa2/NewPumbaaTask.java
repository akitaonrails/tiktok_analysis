package com.ss.android.ugc.aweme.legoImp.task.pumbaa2;

import X.C098200Yq;
import X.C0CCZ;
import X.C0VZ0;
import X.C0WS6;
import X.C189200o6;
import X.C2188811AlT;
import X.C823280WRi;
import X.C823420WRw;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AwS257S0300000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class NewPumbaaTask implements C0CCZ {
    public String LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NewPumbaaTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (context != null) {
            C0WS6 c0ws6 = new C0WS6();
            c0ws6.LIZ = SystemClock.elapsedRealtimeNanos();
            c0ws6.LIZJ = Debug.threadCpuTimeNanos();
            long j = c0ws6.LIZ;
            C823420WRw c823420WRw = C823420WRw.LIZ;
            AwS257S0300000_13 awS257S0300000_13 = new AwS257S0300000_13(this, c0ws6, context, 2);
            c823420WRw.getClass();
            if (!C823420WRw.LIZIZ.get()) {
                try {
                    awS257S0300000_13.invoke();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        C823280WRi.LIZJ("PumbaaSDK#transaction", "ensure_not_reach_here", thM5exceptionOrNullimpl);
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PumbaaSDK active cost ");
            sbLIZ.append((SystemClock.elapsedRealtimeNanos() - j) / ((long) 1000000));
            sbLIZ.append(" ms.");
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
