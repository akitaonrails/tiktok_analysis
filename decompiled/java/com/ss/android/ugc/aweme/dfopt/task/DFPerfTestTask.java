package com.ss.android.ugc.aweme.dfopt.task;

import X.C08BQ;
import X.C0CCZ;
import X.C0VZ0;
import X.C1906580ziK;
import X.C1BLW;
import X.C2456309jt;
import X.C557050Lt1;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class DFPerfTestTask implements C0CCZ {
    public static final C557050Lt1 LL = new C557050Lt1(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DFPerfTestTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (LL.LIZ(false, true) && !C2456309jt.LIZIZ() && C1906580ziK.LJI() && !C1906580ziK.LIZ) {
            IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi(IPluginService.class);
            if (iPluginService == null) {
                Set services = ServiceManager.get().getServices(IPluginService.class);
                if (services.isEmpty() || (iPluginService = (IPluginService) ListProtector.get(new ArrayList(services), 0)) == null) {
                    return;
                }
            }
            if (iPluginService.LIZLLL() == null) {
                return;
            }
            List<String> listLIZ = C08BQ.LIZ();
            if (!listLIZ.isEmpty()) {
                for (String str : listLIZ) {
                    if (iPluginService.checkPluginInstalled(str)) {
                        C1BLW.LIZ(str);
                    }
                }
            }
        }
    }
}
