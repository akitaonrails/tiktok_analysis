package com.ss.android.ugc.aweme.legoImp.task;

import X.AbstractC19515011Wq;
import X.C04TD;
import X.C0CCZ;
import X.C0VZ0;
import X.C1697810uHb;
import X.C19514711Wn;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.ies.powerpermissions.IGetInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS379S0200000_13;

/* JADX INFO: loaded from: classes30.dex */
public final class PowerPermissionsTask implements C0CCZ, IGetInterceptor {
    @Override // com.bytedance.ies.powerpermissions.IGetInterceptor
    public final List<AbstractC19515011Wq> LIZ() {
        return C1697810uHb.LJIILJJIL(new AbstractC19515011Wq() { // from class: X.0Wtn
            @Override // X.AbstractC19515011Wq
            public final void LIZ(C19514611Wm c19514611Wm, String... strArr) {
                Object c098200Yq;
                if (c19514611Wm != null) {
                    if (c19514611Wm.LIZ == null) {
                        c19514611Wm.LIZJ();
                        return;
                    }
                    try {
                        C837790Wtl.LIZ((String[]) Arrays.copyOf(strArr, strArr.length), c19514611Wm.LIZ, new AwS379S0200000_13(c19514611Wm, c19514611Wm, 25));
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                        c19514611Wm.LIZIZ();
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
            }
        });
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PowerPermissionsTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static IGetInterceptor LJ() {
        Object objLIZ = C04TD.LIZ(IGetInterceptor.class, false);
        if (objLIZ != null) {
            return (IGetInterceptor) objLIZ;
        }
        if (C04TD.P1 == null) {
            synchronized (IGetInterceptor.class) {
                if (C04TD.P1 == null) {
                    C04TD.P1 = new PowerPermissionsTask();
                }
            }
        }
        return C04TD.P1;
    }

    @Override // com.bytedance.ies.powerpermissions.IGetInterceptor
    public final List<AbstractC19515011Wq> getInterceptors() {
        return new ArrayList();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C19514711Wn.LIZIZ.LIZ();
    }
}
