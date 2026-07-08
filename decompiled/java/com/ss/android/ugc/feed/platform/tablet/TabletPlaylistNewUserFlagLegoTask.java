package com.ss.android.ugc.feed.platform.tablet;

import X.C0CCZ;
import X.C0VGI;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.AObserverS230S0100000_28;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TabletPlaylistNewUserFlagLegoTask implements C0CCZ {
    public C0VGI LL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TabletPlaylistNewUserFlagLegoTask";
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
        C0VGI c0vgiObserveInitialLaunchRequestResultForever;
        if (((IPluginService) ServiceManager.get().getService(IPluginService.class)).getDeviceCheckResult().getValue() == 2) {
            AObserverS230S0100000_28 aObserverS230S0100000_28 = new AObserverS230S0100000_28(this, 53);
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            if (iPluginService != null) {
                c0vgiObserveInitialLaunchRequestResultForever = iPluginService.observeInitialLaunchRequestResultForever(aObserverS230S0100000_28);
            } else {
                c0vgiObserveInitialLaunchRequestResultForever = null;
            }
            this.LL = c0vgiObserveInitialLaunchRequestResultForever;
        }
    }
}
