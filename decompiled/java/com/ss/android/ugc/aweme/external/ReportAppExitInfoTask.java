package com.ss.android.ugc.aweme.external;

import X.AbstractC1387200mCc;
import X.C0CCZ;
import X.C0CHQ;
import X.C0VZ0;
import X.C1431870nMf;
import X.C1906580ziK;
import X.C560390LyP;
import X.C804770Vhb;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class ReportAppExitInfoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ReportAppExitInfoTask";
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
        Activity activityLIZIZ;
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZLLL("app_exit", AFwS210S0000000_22.get$arr$(65));
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        C804770Vhb c804770Vhb = C804770Vhb.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - C804770Vhb.LJFF(activityLIZIZ);
        C0CHQ.LIZ().getPublishService().LJJJLL();
        C1431870nMf.LIZLLL(jCurrentTimeMillis, context);
        C560390LyP.LIZJ();
    }
}
