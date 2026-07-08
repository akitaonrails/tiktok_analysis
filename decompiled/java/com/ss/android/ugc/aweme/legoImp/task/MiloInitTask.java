package com.ss.android.ugc.aweme.legoImp.task;

import X.C0BLM;
import X.C0CCZ;
import X.C0VZ0;
import X.C1BCZ;
import X.C1BWL;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2201061BCm;
import android.content.Context;
import com.ss.android.ugc.aweme.legoImp.OrbuInitTask;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class MiloInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MiloInitTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!((Boolean) C0BLM.LIZ.getValue()).booleanValue()) {
            return;
        }
        C1BCZ.LIZ(C1BWL.LIZ(), new InterfaceC2201061BCm() { // from class: X.0peg
            @Override // X.InterfaceC2201061BCm
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC2201061BCm
            public final void LIZIZ() {
                if (((Boolean) C0BOI.LIZ.getValue()).booleanValue()) {
                    C1BCA.LJJIFFI(C1519930peh.LIZ);
                }
                C1BCA.LJIJJLI(EnumC312610CNf.SATRTUP, new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0ped
                    @Override // X.InterfaceC1006670cIr
                    public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                        boolean z;
                        C1602200rnO c1602200rnO3 = c1602200rnO2;
                        boolean z2 = true;
                        if (c1602200rnO3.LIZJ()) {
                            C0XKT.LIZIZ = 3;
                            if (C0XKT.LIZIZ() == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C0XKT.LIZ(3, z);
                            if (z) {
                                OrbuInitTask orbuInitTask = new OrbuInitTask();
                                C844470XAv.LIZ.getClass();
                                orbuInitTask.run(C844470XAv.LIZ());
                            }
                            if (!C0CKZ.LJFF) {
                                C08AP.LJIIJJI = 0;
                            }
                            C0CKZ.LJFF = true;
                            C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                            return;
                        }
                        if (!c1602200rnO3.LIZIZ()) {
                            return;
                        }
                        C0XKT.LIZIZ = 2;
                        if (C0XKT.LIZIZ() != 2) {
                            z2 = false;
                        }
                        C0XKT.LIZ(2, z2);
                        if (!z2) {
                            return;
                        }
                        OrbuInitTask orbuInitTask2 = new OrbuInitTask();
                        C844470XAv.LIZ.getClass();
                        orbuInitTask2.run(C844470XAv.LIZ());
                    }
                });
            }
        });
    }
}
