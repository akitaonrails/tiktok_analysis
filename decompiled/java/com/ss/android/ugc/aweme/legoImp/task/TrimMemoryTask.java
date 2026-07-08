package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class TrimMemoryTask implements C0CCZ {
    public final int LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TrimMemoryTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    public TrimMemoryTask(int i) {
        this.LL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r4) {
        /*
            r3 = this;
            boolean r0 = X.C070Q.LIZ()
            r2 = 0
            if (r0 == 0) goto L38
            X.0CBW r0 = X.C0CBW.LIZ
            boolean r0 = X.C0CBW.LIZIZ()
            if (r0 == 0) goto L22
            boolean r0 = X.C070Q.LIZ()
            if (r0 == 0) goto L22
        L15:
            boolean r0 = X.C0CP9.LIZ()
            if (r0 != 0) goto L22
            int r1 = r3.LL
            r0 = 40
            if (r1 >= r0) goto L22
            r2 = 1
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.booleanValue()
            r2 = r0 ^ 1
            Y.AObjectS388S0100000_13 r1 = new Y.AObjectS388S0100000_13
            r0 = 1
            r1.<init>(r3, r0)
            java.lang.String r0 = "run_trimMemoryTask"
            X.C1492110ovp.LIZIZ(r0, r1, r2)
            return
        L38:
            X.0XOO r0 = X.C0XOO.LIZ
            r0.getClass()
            int r1 = X.C0XOO.LIZ()
            int r0 = X.C0XOO.LJFF
            r1 = r1 & r0
            if (r1 != r0) goto L22
            boolean r0 = X.C2251971DCh.LIZ()
            if (r0 == 0) goto L22
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.TrimMemoryTask.run(android.content.Context):void");
    }
}
