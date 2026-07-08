package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0J9X;
import X.C0VU1;
import X.C0VZ0;
import X.C104100aN;
import X.C1602860roS;
import X.C2428309fN;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes31.dex */
public class LivePrefetchLoadOptTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LivePrefetchLoadOptTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).U5()) {
            return false;
        }
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            return !C104100aN.LIZ().LJJIJ(AFwS189S0000000_3.get$arr$(1766));
        }
        return true;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C104100aN.LIZ().LJJIJ(new C2428309fN()) ? EnumC799870VZh.APP_BACKGROUND : EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).n4().LIZIZ();
        GlobalContext.setApplicationContext(context);
        try {
            Class.forName("com.bytedance.android.livesdk.utils.LiveAppBundleUtils");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0J9X.LIZ(context);
    }
}
