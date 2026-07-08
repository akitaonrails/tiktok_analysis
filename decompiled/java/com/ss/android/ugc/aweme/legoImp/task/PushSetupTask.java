package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1BWL;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C303010BuF;
import X.C786410Ut5;
import X.C810880VrS;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.legoapi.IInitPushTaskApi;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20234614Fk
public class PushSetupTask implements C0CCZ, InterfaceC799590VYf {
    public static PushSetupTask LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PushSetupTask";
    }

    @Override // X.InterfaceC799590VYf
    public final int level() {
        return 0;
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

    public PushSetupTask() {
        int i = C2187451AjH.LIZ;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        boolean zLIZIZ = PushMultiProcessSharedProvider.LJ(C1BWL.LIZ()).LIZIZ("ensure_init_configurations", false);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachBaseContext()#meetTrigger()@");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(", ensure: ");
        sbLIZ.append(zLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return zLIZIZ;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushSetupTaskrun()@");
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
        C810880VrS c810880VrS = C810880VrS.LIZ;
        c810880VrS.getClass();
        IInitPushTaskApi iInitPushTaskApi = C810880VrS.LIZIZ;
        if (iInitPushTaskApi != null) {
            c810880VrS.getClass();
            iInitPushTaskApi.LJFF("setupInitConfigs_in_PushSetupTask_run");
            c810880VrS.getClass();
            iInitPushTaskApi.LJIIL("setupInitConfigs_in_PushSetupTask_run");
            C303010BuF.LIZ().setupInitConfigs(context);
            c810880VrS.getClass();
            iInitPushTaskApi.LJI("setupInitConfigs_in_PushSetupTask_run");
            c810880VrS.getClass();
            iInitPushTaskApi.LJIIJJI("setupInitConfigs_in_PushSetupTask_run");
            return;
        }
        C303010BuF.LIZ().setupInitConfigs(context);
    }
}
