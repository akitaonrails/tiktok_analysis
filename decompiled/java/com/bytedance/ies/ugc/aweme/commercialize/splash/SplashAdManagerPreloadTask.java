package com.bytedance.ies.ugc.aweme.commercialize.splash;

import X.AnonymousClass0716;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1030680cva;
import X.C1031060cwC;
import X.C1251804v6;
import X.C15O7;
import X.C2212241BiA;
import X.C2238381CjE;
import X.C2344809Gs;
import X.C285090BFj;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import Y.ACallableS151S0000000_16;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC20234614Fk
public class SplashAdManagerPreloadTask implements C0CCZ, InterfaceC799590VYf {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SplashAdManagerPreloadTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return ((Boolean) C1251804v6.LIZIZ.getValue()).booleanValue() ? 2 : 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C2344809Gs.LJ("SplashAdManagerPreloadTask");
        if (!((Boolean) C285090BFj.LJJJJLL.getValue()).booleanValue() && ((Boolean) C2238381CjE.LJ.getValue()).booleanValue()) {
            C15O7.LIZIZ(new ACallableS151S0000000_16(2), C15O7.LJI, null);
        }
        C2212241BiA.LIZIZ(context);
        if (((Boolean) AnonymousClass0716.LJJII.getValue()).booleanValue() && ((ISplashAdService) ServiceManager.get().getService(ISplashAdService.class)).LJIILIIL()) {
            C1031060cwC c1031060cwC = C1031060cwC.LIZ;
            c1031060cwC.getClass();
            C1031060cwC.LJ();
            C1030680cva.LJIILIIL = true;
            c1031060cwC.LIZ(context);
        }
        if (C2238381CjE.LIZ() && C1030680cva.LJFF && !C1030680cva.LJIILIIL) {
            C1030680cva.LJIILIIL = true;
            C1031060cwC.LIZ.LIZ(context);
        }
    }
}
