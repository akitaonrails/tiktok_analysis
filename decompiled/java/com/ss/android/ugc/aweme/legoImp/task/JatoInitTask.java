package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0CD2;
import X.C0S78;
import X.C0VU1;
import X.C0VZ0;
import X.C0X35;
import X.C1514430pVp;
import X.C587360N1y;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS53S0001000_9;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC20234614Fk
public final class JatoInitTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "JatoInitTask";
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
        return 17;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return ((Boolean) C0CD2.LJII.getValue()).booleanValue() ? C0VU1.IO : C0VU1.CPU;
    }

    public static void LIZ() {
        if (CpusetManager.isReady()) {
            if ((C587360N1y.LIZ().mainThreadBindConfig & 4) == 4) {
                int iMyPid = Process.myPid();
                if (JatoXL.isInited()) {
                    AtomicBoolean atomicBoolean = C0X35.LIZLLL;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    CpusetManager.bindBigCore(iMyPid);
                    atomicBoolean.set(true);
                    return;
                }
                return;
            }
            if ((C587360N1y.LIZ().mainThreadBindConfig & 2) == 2) {
                int iMyPid2 = Process.myPid();
                if (JatoXL.isInited()) {
                    AtomicBoolean atomicBoolean2 = C0X35.LIZLLL;
                    if (!atomicBoolean2.get()) {
                        CpusetManager.bindBigCore(iMyPid2);
                        atomicBoolean2.set(true);
                    }
                }
                C0S78.LIZJ(new AwS53S0001000_9(iMyPid2, 1), true);
            }
        }
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        C1514430pVp.LIZLLL().booleanValue();
        return 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041e  */
    /* JADX WARN: Type inference failed for: r0v195, types: [X.0Vau, com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread] */
    /* JADX WARN: Type inference failed for: r0v326, types: [X.13og] */
    /* JADX WARN: Type inference failed for: r1v46, types: [X.13oc, android.content.ComponentCallbacks] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0uOn] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0uOn] */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(final android.content.Context r26) {
        /*
            Method dump skipped, instruction units count: 2139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.JatoInitTask.run(android.content.Context):void");
    }
}
