package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1514430pVp;
import X.C19259610Wk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC19259710Wl;
import Y.AfS197S0100000_28;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImpl.task.AdColdStartTask;
import com.ss.android.ugc.aweme.service.IAttributionService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AdColdStartTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AdColdStartTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.10Wo] */
    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILLIIL();
        C19259610Wk c19259610Wk = C19259610Wk.LIZ;
        C19259610Wk.LIZ(new InterfaceC19259710Wl() { // from class: X.10Wo
            @Override // X.InterfaceC19259710Wl
            public final void LIZ(final C19260310Wr c19260310Wr) {
                final long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                final long j = jElapsedRealtime2 - jElapsedRealtime;
                C11HU c11huLJJ = ((IAttributionService) ServiceManager.get().getService(IAttributionService.class)).LIZ(c19260310Wr, false).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ());
                final AdColdStartTask adColdStartTask = this;
                c11huLJJ.LJJIIZ(new C09JN() { // from class: X.10Wp
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("AdColdStartTask@63dd.run$1$onDataReady$1");
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("source", c19260310Wr.LIZ);
                        c2344009Gk.LIZLLL(j, "service_duration");
                        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - jElapsedRealtime2, "req_duration");
                        C20684815ws.LJIILLIIL("attribution_data_boot_perf", c2344009Gk.LIZ);
                        adColdStartTask.getClass();
                        C1C7U.LIZIZ("AdColdStartTask@63dd.run$1$onDataReady$1");
                    }
                }, new AfS197S0100000_28(adColdStartTask, 19));
            }
        });
    }
}
