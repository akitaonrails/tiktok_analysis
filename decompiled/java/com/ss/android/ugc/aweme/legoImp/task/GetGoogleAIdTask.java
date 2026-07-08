package com.ss.android.ugc.aweme.legoImp.task;

import X.AnonymousClass1440;
import X.C0CCZ;
import X.C0NET;
import X.C0VU1;
import X.C0VZ0;
import X.C10EU;
import X.C15O7;
import X.C1602200rnO;
import X.C1602860roS;
import X.C1848707Lx;
import X.C1BCA;
import X.C2206241BWk;
import X.C285090BFj;
import X.C587860N3w;
import X.EnumC312610CNf;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1006670cIr;
import X.InterfaceC2385309Wh;
import X.InterfaceC799590VYf;
import Y.ARunnableS93S0000000_16;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public class GetGoogleAIdTask implements C0CCZ, InterfaceC799590VYf {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GetGoogleAIdTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        C1602860roS.LIZ.getClass();
        return C1602860roS.LJ() ? C1848707Lx.LIZ() ? C0VU1.IO : C0VU1.CPU : C2206241BWk.LIZ() ? C0VU1.IO : C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return this.LL;
    }

    public GetGoogleAIdTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        EnumC799870VZh enumC799870VZh = this.LL;
        if (enumC799870VZh == EnumC799870VZh.BACKGROUND) {
            if (((Boolean) C285090BFj.LJJJJ.getValue()).booleanValue()) {
                C1602860roS.LIZ.getClass();
                if (!C1602860roS.LJ()) {
                    C0NET.LIZ.getClass();
                    try {
                        String secUid = C10EU.LIZ().getSecUid();
                        if (secUid == null) {
                            secUid = "";
                        }
                        if (C587860N3w.LIZLLL) {
                            if (Intrinsics.LJFF(C0NET.LJ(), secUid)) {
                                C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.13vC
                                    @Override // X.InterfaceC1006670cIr
                                    public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                                        if (c1602200rnO2.LIZJ()) {
                                            C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                                            AnonymousClass1440.LIZLLL = false;
                                            C823050WQl.LIZIZ().execute(new ARunnableS93S0000000_16(3));
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            ((Boolean) C285090BFj.LJJJJ.getValue()).booleanValue();
            AnonymousClass1440.LJI();
            return;
        }
        if (enumC799870VZh == EnumC799870VZh.BOOT_FINISH) {
            C15O7.LJIIIIZZ(60000L).LJ(new InterfaceC2385309Wh() { // from class: X.146R
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C799900VZk.LIZ.getClass();
                    C799890VZj c799890VZj = new C799890VZj();
                    c799890VZj.LIZ(new GetGoogleAIdTask(EnumC799870VZh.IDLE));
                    c799890VZj.LIZIZ();
                    return c15o7.LJIIL();
                }
            }, C15O7.LJIIIIZZ, null);
        } else if (enumC799870VZh == EnumC799870VZh.IDLE) {
            AnonymousClass1440.LJI();
        }
    }
}
