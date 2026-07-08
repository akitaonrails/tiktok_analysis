package com.ss.android.ugc.aweme.legoImp.task;

import X.C0BFN;
import X.C0CCZ;
import X.C0CN5;
import X.C0VZ0;
import X.C104100aN;
import X.C1514430pVp;
import X.C19254610Um;
import X.C312840COc;
import X.C312860COe;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC313560CQw;
import Y.ARunnableS84S0000000_4;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import defpackage.c2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ABClientIDTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ABClientIDTask";
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
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return Intrinsics.LJFF(((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIILIIL(), Boolean.TRUE) ? EnumC799870VZh.MAIN : (C1514430pVp.LIZLLL().booleanValue() || C0BFN.LIZ != 1) ? (C1514430pVp.LIZLLL().booleanValue() || C104100aN.LIZ().LJIILIIL() || C0BFN.LIZ != 2) ? (C1514430pVp.LIZLLL().booleanValue() || !c2.LIZ().requestAfterBootFinish) ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.FIRST_WINDOW_FOCUS;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!C1514430pVp.LIZLLL().booleanValue() && !C104100aN.LIZ().LJIILIIL()) {
            long j = C0BFN.LIZ;
            if (j > 2) {
                C0CN5.LIZIZ(Long.valueOf(j), new ARunnableS84S0000000_4(context, 6));
                return;
            }
        }
        C312840COc c312840COc = C312840COc.LIZ;
        InterfaceC313560CQw interfaceC313560CQwLJIJJ = C19254610Um.LIZIZ.LJIJJ();
        C312860COe c312860COe = new C312860COe();
        c312840COc.getClass();
        C312840COc.LIZ(interfaceC313560CQwLJIJJ, c312860COe);
    }
}
