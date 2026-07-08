package com.ss.android.ugc.aweme.app.accountsdk;

import X.C07JG;
import X.C0CCZ;
import X.C0VZ0;
import X.C1514430pVp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class NewUserPrefetchABSettingsTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NewUserPrefetchABSettingsTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        Integer numLJIIIIZZ;
        if (C1514430pVp.LIZLLL().booleanValue()) {
            Integer numLJIIIIZZ2 = ((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIIIIZZ();
            if ((numLJIIIIZZ2 != null && numLJIIIIZZ2.intValue() == 1) || (((numLJIIIIZZ = ((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIIIIZZ()) == null || numLJIIIIZZ.intValue() != 2) && ((Boolean) C07JG.LIZJ.getValue()).booleanValue())) {
                ((IPluginService) ServiceManager.get().getService(IPluginService.class)).prefetchABSettings(null);
            }
        }
    }
}
