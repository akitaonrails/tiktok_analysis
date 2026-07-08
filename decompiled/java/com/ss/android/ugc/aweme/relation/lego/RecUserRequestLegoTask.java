package com.ss.android.ugc.aweme.relation.lego;

import X.C09A1;
import X.C0CO3;
import X.C0PEM;
import X.C0XHY;
import X.C11NJ;
import X.C1234690iEd;
import X.C1239300iM4;
import X.C1264660j0y;
import X.C1264670j0z;
import X.C1264680j10;
import X.C1336505Kx;
import X.C1554960qZC;
import X.C19475811Ho;
import X.C1D7W;
import X.C1DFB;
import X.C2214201BlK;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C259800zU;
import X.C639060P4u;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC1337505Lh;
import X.InterfaceC1555100qZQ;
import X.InterfaceC800130Va7;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.services.IRelationDebugService;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes20.dex */
public final class RecUserRequestLegoTask implements InterfaceC800130Va7 {
    public final boolean LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "RecUserRequestLegoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.BOOT_FINISH;
    }

    public RecUserRequestLegoTask(boolean z) {
        this.LL = z;
        C0XHY.LIZ.getClass();
        C1264660j0y.LIZIZ = SystemClock.uptimeMillis();
        C1264660j0y.LIZJ = -1L;
        C11NJ c11nj = C1264660j0y.LJ;
        c11nj.LJ();
        c11nj.LIZ(C1239300iM4.LJ(new C19475811Ho(C2214201BlK.LIZLLL()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1264670j0z()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.014t, X.1D7W] */
    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        T source;
        C259800zU c259800zU = new C259800zU();
        GScope gScope = GScope.LL;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(gScope, "source_default_key", InterfaceC1337505Lh.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            source = interfaceC1555100qZQLIZIZ.getSource();
        } else {
            source = 0;
        }
        c259800zU.element = source;
        if (source == 0) {
            ?? c1d7w = new C1D7W(null);
            c259800zU.element = c1d7w;
            C1554960qZC.LIZ(gScope, c1d7w, InterfaceC1337505Lh.class, "source_default_key");
            ((C1D7W) c259800zU.element).LL.clear();
        }
        if (C1264680j10.LIZ && this.LL) {
            C23119094b c23119094bLIZ = C2296908zH.LIZ();
            C1DFB c1dfb = C0PEM.LIZJ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, c1dfb)), c1dfb.plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 23)), null, new C1336505Kx(c259800zU, null), 2);
        }
        ((IRelationDebugService) ServiceManager.get().getService(IRelationDebugService.class)).LIZIZ();
        C1234690iEd.LIZIZ.LJI();
    }
}
