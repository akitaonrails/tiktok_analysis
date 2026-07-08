package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1906580ziK;
import X.C19260410Ws;
import X.C1BLO;
import X.C1BLQ;
import X.C1BLT;
import X.C1BLY;
import X.C2203381BLk;
import X.C2456309jt;
import X.C292500BdI;
import X.C292510BdJ;
import X.C305470ByD;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class DFUninstallTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DFUninstallTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (((Boolean) C305470ByD.LIZJ.getValue()).booleanValue() && (C2456309jt.LIZIZ() || !C1906580ziK.LJI() || C1906580ziK.LIZ)) {
            return;
        }
        ArrayList<String> arrayList = (ArrayList) C292510BdJ.LIZIZ.getValue();
        if (!C19260410Ws.LJFF()) {
            arrayList.addAll((ArrayList) C292500BdI.LIZIZ.getValue());
        }
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null && iPluginService.LIZLLL() != null) {
            C1BLY c1bly = C1BLO.LIZJ;
            if (c1bly != null) {
                c1bly.LIZJ(arrayList);
            }
            for (String str : arrayList) {
                C1BLQ.LJ(str);
                C2203381BLk c2203381BLk = C2203381BLk.LIZ;
                String strLIZ = C1BLT.LIZ(str);
                c2203381BLk.getClass();
                KevaImpl.getRepo("dynamic_task_triggered", 0).erase(strLIZ);
            }
        }
    }
}
