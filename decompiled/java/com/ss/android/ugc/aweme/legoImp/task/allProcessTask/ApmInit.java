package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C07OX;
import X.C08TN;
import X.C0CCZ;
import X.C0CFN;
import X.C0V5S;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ApmInit implements C0CCZ {
    public static int LLILLJJLI;
    public static final ApmInit LL = new ApmInit();
    public static final String LLILLL = "APM_INIT";
    public static final C0V5S LLILZ = C0V5S.LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ApmInit";
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
        return 16777213;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (LLILLJJLI == 0) {
            String str = LLILLL;
            if (!C0CFN.LJFF.containsKey(str)) {
                LLILLJJLI = 1;
                C0CFN.LIZJ(LLILZ, str, ((Boolean) C07OX.LJI.getValue()).booleanValue());
                return;
            }
        }
        C08TN.LIZ().LJ("FakeMain_ensure_apminit", false);
        C0CFN.LIZ(LLILLL);
        C08TN.LIZ().LJI("FakeMain_ensure_apminit");
    }
}
