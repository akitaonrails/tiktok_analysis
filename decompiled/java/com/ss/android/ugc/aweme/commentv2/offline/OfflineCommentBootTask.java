package com.ss.android.ugc.aweme.commentv2.offline;

import X.AnonymousClass0592;
import X.AnonymousClass0594;
import X.C058X;
import X.C05KA;
import X.C05M0;
import X.C05M3;
import X.C098200Yq;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1210404oQ;
import X.C189200o6;
import X.C23250099c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC497601wk;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class OfflineCommentBootTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "OfflineCommentBootTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        AnonymousClass0594.LIZ.getClass();
        if (C1210404oQ.LIZ() && AnonymousClass0594.LIZIZ.compareAndSet(false, true)) {
            C05M0 c05m0 = (C05M0) C05KA.LIZ.getValue();
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) C05KA.LIZIZ.getValue();
            try {
                C05M3.LIZ.getClass();
                C05M3.LIZ(c05m0, interfaceC497601wk);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new AnonymousClass0592(c05m0, null), 3);
            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C058X(null), 3);
        }
    }
}
