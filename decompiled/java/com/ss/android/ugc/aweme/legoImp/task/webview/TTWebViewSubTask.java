package com.ss.android.ugc.aweme.legoImp.task.webview;

import X.C086F;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C2104108Md;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.hybriddevtool.IHybridDevtoolService;
import com.ss.android.ugc.aweme.settings.TTWebViewEnableStatusSettings;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class TTWebViewSubTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TTWebViewSubTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C2104108Md.LJ(context)) {
            return;
        }
        TTWebViewEnableStatusSettings.LIZ.getClass();
        TTWebViewEnableStatusSettings.TikTokTTWebViewStatusModel tikTokTTWebViewStatusModelLIZ = TTWebViewEnableStatusSettings.LIZ();
        C086F c086f = C086F.LIZ;
        ARunnableS113S0100000_13 aRunnableS113S0100000_13 = new ARunnableS113S0100000_13(context, 112);
        long j = ((long) tikTokTTWebViewStatusModelLIZ.cookieDBDelayTime) * 1000;
        c086f.getClass();
        C086F.LIZJ(j, aRunnableS113S0100000_13);
        C086F.LIZJ(((long) tikTokTTWebViewStatusModelLIZ.checkDelayTime) * 1000, new Runnable() { // from class: X.0WcI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTWebViewSubTask@4cd4.run$2");
                try {
                    TTWebViewHelper tTWebViewHelper = TTWebViewHelper.INSTANCE;
                    C1546140qKy c1546140qKy = C1546140qKy.LIZ;
                    IHybridDevtoolService iHybridDevtoolService = (IHybridDevtoolService) ServiceManager.get().getService(IHybridDevtoolService.class, false, false);
                    if (iHybridDevtoolService != null) {
                        iHybridDevtoolService.isOpen();
                    }
                    tTWebViewHelper.checkStatus(c1546140qKy, false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTWebViewSubTask@4cd4.run$2");
            }
        });
    }
}
