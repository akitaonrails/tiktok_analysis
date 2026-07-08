package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.C19724912Fj;
import X.C1BWL;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Application;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.router.RouterOpen;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class KidsModeInitRouterTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModeInitRouterTask";
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
        C1150504el.LIZ().LIZLLL("method_init_smart_router_duration_kids_mode", false);
        Application applicationLIZ = C1BWL.LIZ();
        if (C19724912Fj.LJI == null) {
            synchronized (C19724912Fj.class) {
                try {
                    if (C19724912Fj.LJI == null) {
                        C19724912Fj.LJI = new C19724912Fj(applicationLIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C844470XAv.LIZ.getClass();
        SmartRouter.init(C844470XAv.LIZ());
        SmartRouter.configRouter("snssdk1233").withOtherSchemes(new String[]{"aweme", "sslocal"});
        SmartRouter.addInterceptor(new RouterOpen());
        C1150504el.LIZ().LJI("method_init_smart_router_duration_kids_mode", false);
    }
}
