package com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin;

import X.C0VU1;
import X.C0X35;
import X.C1227804rE;
import X.C1514430pVp;
import X.C1782306yT;
import X.C19254610Um;
import X.EnumC799870VZh;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class PrioritizedPluginInitTask extends AbstractPluginInitTask implements InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PrioritizedPluginInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return Intrinsics.LJFF(((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIILIIL(), Boolean.TRUE) ? EnumC799870VZh.MAIN : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0X35.LIZ("pptask_part_1", false);
        ((IPluginService) ServiceManager.get().getService(IPluginService.class)).tryInit();
        C0X35.LJIIJJI("pptask_part_1", false);
        C0X35.LIZ("pptask_part_2", false);
        C19254610Um.LIZIZ.LJJIJIIJIL("prioritized_plugin_init_task");
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return;
        }
        ((Number) C1227804rE.LIZ.getValue()).intValue();
        C1782306yT.LIZ();
        ((IPluginService) ServiceManager.get().getService(IPluginService.class)).runClientExperimentUploadTask();
        ((IPluginService) ServiceManager.get().getService(IPluginService.class)).startPluginRequest(null, null, Boolean.TRUE, true, 100);
        LIZ(false);
        C0X35.LJIIJJI("pptask_part_2", false);
    }
}
