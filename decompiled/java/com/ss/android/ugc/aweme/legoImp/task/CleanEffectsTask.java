package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C104100aN;
import X.C1602860roS;
import X.C2428309fN;
import X.C2428509fP;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public class CleanEffectsTask implements C0CCZ, InterfaceC799590VYf {
    public static volatile boolean LL;
    public static volatile boolean LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CleanEffectsTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
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
        try {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().clearExpiredDrafts();
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().clearCreativeCacheFiles();
            if (!C2428509fP.LIZ()) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().preloadDraftEffectList();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
