package com.ss.android.ugc.aweme.requesttask.background;

import X.C07JG;
import X.C0C64;
import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class PreCreatePlayerTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreCreatePlayerTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !ColdBootTasksDegradeExperiment.LIZ().preCreatePlayerTask;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C07JG.LIZ()) {
            return;
        }
        IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi(IPlayerManagerService.class);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_precreate_session", true, false)) {
            if (iPlayerManagerService != null) {
                iPlayerManagerService.LJIIIZ();
            }
        } else {
            if (iPlayerManagerService == null) {
                return;
            }
            iPlayerManagerService.LJ();
        }
    }
}
