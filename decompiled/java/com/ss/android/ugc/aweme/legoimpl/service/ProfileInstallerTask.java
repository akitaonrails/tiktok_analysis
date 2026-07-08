package com.ss.android.ugc.aweme.legoimpl.service;

import X.C098200Yq;
import X.C0BLN;
import X.C0CCZ;
import X.C0VZ0;
import X.C189200o6;
import X.C2114808Qg;
import X.C2124808Uc;
import X.C823050WQl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2125108Uf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileInstallerTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ProfileInstallerTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        int iIntValue = ((Number) C0BLN.LIZIZ.getValue()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BACKGROUND : EnumC799870VZh.IDLE;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Object obj;
        Context context2;
        if (!((Boolean) C0BLN.LIZ.getValue()).booleanValue() || C2114808Qg.LIZIZ(context) > 2000) {
            return;
        }
        if (context == null) {
            context2 = null;
        } else {
            try {
                C2124808Uc.LIZ(context, C823050WQl.LIZLLL(), new InterfaceC2125108Uf() { // from class: X.0CA2
                    @Override // X.InterfaceC2125108Uf
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC2125108Uf
                    public final void LIZIZ() {
                    }
                });
                context2 = context;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
        }
        C189200o6.m2constructorimpl(context2);
        obj = context2;
        C189200o6.m5exceptionOrNullimpl(obj);
    }
}
