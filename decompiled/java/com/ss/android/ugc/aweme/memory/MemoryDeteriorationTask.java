package com.ss.android.ugc.aweme.memory;

import X.C0C64;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C13LQ;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.memrelief.mock.MemoryMock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class MemoryDeteriorationTask implements C0CCZ, InterfaceC799590VYf {
    public final EnumC799870VZh LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MemoryDeteriorationTask";
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
    public final int priority() {
        return 2;
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
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return this.LL;
    }

    public MemoryDeteriorationTask(EnumC799870VZh enumC799870VZh) {
        this.LL = enumC799870VZh;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0bt4] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0bt4] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        try {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "memory_deterioration_java", true);
            if (iLJIJ > 0) {
                MemoryMock.LIZ(iLJIJ, true);
            }
            int iLJIJ2 = C0C64.LJIILLIIL().LJIJ(31744, 0, "memory_deterioration_malloc", true);
            if (iLJIJ2 > 0) {
                MemoryMock.LIZIZ(iLJIJ2);
                new Object() { // from class: X.0bt4
                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pss:");
                        sbLIZ.append(0);
                        sbLIZ.append(", nativeHeap:");
                        sbLIZ.append(0);
                        sbLIZ.append(", privateOther:");
                        sbLIZ.append(0);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                }.toString();
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "memory_deterioration_mmap", true) > 0) {
                long[] jArrLIZJ = MemoryMock.LIZJ(iLJIJ2);
                ?? r1 = new Object() { // from class: X.0bt4
                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pss:");
                        sbLIZ.append(0);
                        sbLIZ.append(", nativeHeap:");
                        sbLIZ.append(0);
                        sbLIZ.append(", privateOther:");
                        sbLIZ.append(0);
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                };
                C13LQ.LJJIZ(jArrLIZJ, ",");
                r1.toString();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
