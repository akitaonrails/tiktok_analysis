package com.ss.android.ugc.aweme.legoImp.task.webview;

import X.C098200Yq;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C189200o6;
import X.C2407009bw;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.lynx.hybrid.webkit.ttwebview.TTWebViewHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jv6.a;

/* JADX INFO: loaded from: classes14.dex */
public final class TTWebViewKeepAliveTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "TTWebViewKeepAliveTask";
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
        C2407009bw.LIZ();
        try {
            IPluginService iPluginService = (IPluginService) ServiceManager.get().getService(IPluginService.class);
            iPluginService.LJIL();
            if (context == null) {
                C844470XAv.LIZ.getClass();
                context = C844470XAv.LIZ();
            }
            a.install(context);
            Long lLJJIIJZLJL = iPluginService.LJJIIJZLJL();
            if (lLJJIIJZLJL != null) {
                TTWebViewHelper.splitCompatInstallExecuteTime = Long.valueOf(lLJJIIJZLJL.longValue());
            }
            iPluginService.LJJIJIIJI();
            TTWebViewHelper.isTTWebViewRemoved = iPluginService.LJJIIJ();
            C189200o6.m2constructorimpl(C823050WQl.LJ().schedule(new ARunnableS113S0100000_13(iPluginService, 111), 30L, TimeUnit.SECONDS));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
