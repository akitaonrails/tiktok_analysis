package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1150504el;
import X.C20684815ws;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MobMainAppStartTask implements C0CCZ {
    public final long LL = System.currentTimeMillis() - C1150504el.LIZ().LJJII;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MobMainAppStartTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (ComplianceServiceProvider.LJIILJJIL().LJII(null)) {
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("load_application_start");
            mobClickObtain.setLabelName("perf_monitor");
            mobClickObtain.setExtValueLong(this.LL);
            C20684815ws.onEvent(mobClickObtain);
        }
    }
}
