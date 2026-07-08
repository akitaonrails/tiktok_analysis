package com.ss.android.ugc.aweme.legoImp.task;

import X.C0C64;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C104100aN;
import X.C12874052a;
import X.C1BWL;
import X.C2162308dZ;
import X.C810880VrS;
import X.C810890VrT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.app.Application;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class InitPushTask implements C0CCZ, InterfaceC799590VYf {
    public static InitPushTask LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitPushTask";
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
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static InitPushTask LIZ() {
        if (LL == null) {
            LL = new InitPushTask();
        }
        return LL;
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        return C12874052a.LIZ ? 0 : 1;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return C12874052a.LIZ ? 2 : 1;
    }

    public static boolean LJFF() {
        return C104100aN.LIZ().isNewUser() || C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "push_init_optimize_enable", true, false);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        Application applicationLIZ = C1BWL.LIZ();
        return (applicationLIZ == null || C2162308dZ.LJI(applicationLIZ)) ? EnumC799870VZh.BACKGROUND : EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.content.Context r5) {
        /*
            boolean r0 = X.C0CAU.LIZ()
            if (r0 != 0) goto L21
            X.01GW r0 = X.C282200B4g.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            int r4 = X.C786640UtS.LIZ()
        L18:
            X.C1BY8.LIZIZ()
            X.C1BY8.LIZ()
            if (r5 != 0) goto L24
            return
        L21:
            r4 = 1000(0x3e8, float:1.401E-42)
            goto L18
        L24:
            android.content.Context r0 = X.C786410Ut5.N3(r5)
            android.app.Application r0 = (android.app.Application) r0
            X.C809360Vp0.LIZ(r0)
            boolean r3 = X.C2162308dZ.LJI(r5)
            if (r3 == 0) goto Lb3
            r2 = 0
            boolean r0 = X.C1702430uP3.LIZLLL
            if (r0 == 0) goto L3d
            r0 = 5000(0x1388, double:2.4703E-320)
            X.C2187451AjH.LJFF(r0)
        L3d:
            boolean r0 = X.C2114608Qe.LIZ(r5, r2)
            if (r0 == 0) goto L5d
            X.01GW r0 = X.C0AMN.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L5d
            com.ss.android.ugc.aweme.statistic.AppLogNetworkClient r1 = new com.ss.android.ugc.aweme.statistic.AppLogNetworkClient
            r1.<init>()
            X.0Vo6 r0 = X.AbstractC808800Vo6.LIZ
            if (r1 == r0) goto L5d
            X.AbstractC808800Vo6.LIZ = r1
        L5d:
            boolean r0 = X.C10EU.LJIILIIL()
            if (r0 != 0) goto Lab
            com.ss.android.ugc.awemepushapi.IPushApi r1 = X.C303010BuF.LIZ()
            com.ss.android.ugc.aweme.services.MainServiceForPush r0 = new com.ss.android.ugc.aweme.services.MainServiceForPush
            r0.<init>()
            r1.init(r5, r0)
        L6f:
            X.C786640UtS.LIZIZ(r4)
            if (r3 != 0) goto L7a
            boolean r0 = X.C2114608Qe.LIZ(r5, r2)
            if (r0 == 0) goto Laa
        L7a:
            X.0VrS r0 = X.C810880VrS.LIZ
            r0.getClass()
            com.ss.android.legoapi.IInitPushTaskApi r0 = X.C810880VrS.LIZIZ
            if (r0 == 0) goto L8a
            X.0VrT r1 = X.C810890VrT.LIZIZ
            java.lang.String r0 = "init_push"
            r1.LJIILLIIL(r0)
        L8a:
            if (r3 == 0) goto Laa
            X.01GW r0 = X.C1240604tI.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Laa
            android.os.Handler r3 = X.C799570VYd.LIZIZ()
            Y.ARunnableS113S0100000_13 r2 = new Y.ARunnableS113S0100000_13
            r0 = 113(0x71, float:1.58E-43)
            r2.<init>(r5, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            X.C786410Ut5.LJLIIL(r0, r3, r2)
        Laa:
            return
        Lab:
            com.ss.android.ugc.awemepushapi.IPushApi r0 = X.C303010BuF.LIZ()
            r0.initMessageDepend()
            goto L6f
        Lb3:
            java.lang.String r2 = X.C2162308dZ.LIZ(r5)
            boolean r0 = X.C2114608Qe.LIZ(r5, r2)
            if (r0 == 0) goto L6f
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.InitPushTask.LJ(android.content.Context):void");
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C810880VrS.LIZ.getClass();
        if (C810880VrS.LIZIZ == null) {
            LJ(context);
            return;
        }
        C810890VrT c810890VrT = C810890VrT.LIZIZ;
        c810890VrT.LJFF("initPushAll");
        c810890VrT.LJFF("initPush_in_InitPushTask_run");
        c810890VrT.LJIIL("initPushAll");
        LJ(context);
        c810890VrT.LJIIL("initPush_in_InitPushTask_run");
        c810890VrT.LJI("initPush_in_InitPushTask_run");
        c810890VrT.LJIIJJI("initPush_in_InitPushTask_run");
    }
}
