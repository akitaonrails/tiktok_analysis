package com.ss.android.ugc.aweme.legoImp.task;

import X.C07HK;
import X.C086T;
import X.C0CCZ;
import X.C0VZ0;
import X.C1514430pVp;
import X.C2188811AlT;
import X.C581900Ms0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.deeplink.IDeeplinkSdkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class InitDeeplinkSdkTask implements C0CCZ {
    public static final InitDeeplinkSdkTask LL = new InitDeeplinkSdkTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitDeeplinkSdkTask";
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
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        String string;
        int i;
        Uri data;
        IDeeplinkSdkService.LIZ.getClass();
        ((IDeeplinkSdkService) ServiceManager.get().getService(IDeeplinkSdkService.class)).LIZJ();
        C1514430pVp.LIZLLL();
        Intent intentLIZ = C086T.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitDeeplinkSdkTask intent ");
        Uri data2 = null;
        if (intentLIZ != null && (data = intentLIZ.getData()) != null) {
            string = data.toString();
        } else {
            string = null;
        }
        sbLIZ.append(string);
        C2188811AlT.LIZIZ(sbLIZ);
        IDeepLinkService iDeepLinkService = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
        boolean z = false;
        if (iDeepLinkService != null) {
            if (intentLIZ != null) {
                data2 = intentLIZ.getData();
            }
            if (iDeepLinkService.LJJLIIIJLJLI(data2) && C07HK.LIZ()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                IDeepLinkService iDeepLinkService2 = (IDeepLinkService) PluggableExtentionKt.pluggableSpi$default(IDeepLinkService.class, false, false, false, 14, null);
                if (iDeepLinkService2 != null && iDeepLinkService2.isAppHot()) {
                    z = true;
                }
                C581900Ms0.LIZ = jCurrentTimeMillis;
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                C581900Ms0.LIZIZ = i;
                if (!z) {
                    C581900Ms0.LJI = true;
                }
            }
        }
    }
}
