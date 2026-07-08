package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C2109608Og;
import X.C2127508Vd;
import X.C23250099c;
import X.C817503Hh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jv6.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class SplitCompatInstall implements C0CCZ {
    public static final SplitCompatInstall LL = new SplitCompatInstall();
    public static volatile AtomicBoolean LLILLJJLI = new AtomicBoolean(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SplitCompatInstall";
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
        return 529;
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
        IPluginService iPluginService;
        if (LLILLJJLI.compareAndSet(false, true)) {
            IPluginService iPluginService2 = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
            if (iPluginService2 != null && iPluginService2.LIZLLL() != null && Intrinsics.LJFF(Boolean.valueOf(C2109608Og.LIZJ()), Boolean.TRUE) && (iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null)) != null && iPluginService.LIZLLL() != null && Intrinsics.LJFF(Boolean.valueOf(C2109608Og.LIZ.getBoolean("has_finish_first_launch_process", false)), Boolean.FALSE)) {
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C2127508Vd(context, null), 3);
                return;
            }
            try {
                a.install(context);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
