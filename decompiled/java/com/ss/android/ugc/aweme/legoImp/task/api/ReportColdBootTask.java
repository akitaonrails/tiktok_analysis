package com.ss.android.ugc.aweme.legoImp.task.api;

import X.C0CCZ;
import X.C0VZ0;
import X.C1076010e6h;
import X.C799890VZj;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.notification.lego.NoticeReportBootRequest;
import com.ss.android.ugc.aweme.notification.lego.ReportColdStartRequest;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ReportColdBootTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ReportColdBootTask";
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
        C799900VZk.LIZ.getClass();
        C799890VZj c799890VZj = new C799890VZj();
        c799890VZj.LIZ(new NoticeReportBootRequest());
        c799890VZj.LIZ(new ReportColdStartRequest());
        c799890VZj.LIZ(C1076010e6h.LIZJ.LJJIIJZLJL());
        c799890VZj.LIZIZ();
    }
}
