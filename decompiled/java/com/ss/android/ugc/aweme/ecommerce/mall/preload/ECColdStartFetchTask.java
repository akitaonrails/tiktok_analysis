package com.ss.android.ugc.aweme.ecommerce.mall.preload;

import X.C0CCZ;
import X.C0PEM;
import X.C0VZ0;
import X.C1769640w9S;
import X.C19304810fm;
import X.C2138808Zm;
import X.C23250099c;
import X.C596970NbD;
import X.C597530Nc7;
import X.C817503Hh;
import X.EnumC1733330vCt;
import X.EnumC19304710fl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomSecApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class ECColdStartFetchTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "ECColdStartFetchTask";
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
        IEcomSecApi iEcomSecApi;
        if (PluggableExtentionKt.pluggableSpi$default(C19304810fm.class, false, false, false, 14, null) != null && C19304810fm.LIZIZ.activeRep && (iEcomSecApi = (IEcomSecApi) PluggableExtentionKt.pluggableSpi$default(IEcomSecApi.class, false, false, false, 14, null)) != null) {
            iEcomSecApi.reportData(EnumC19304710fl.FEED_READY.getReportName());
        }
        C596970NbD.LIZIZ.LIZ(EnumC1733330vCt.SHOP_TAB_ONLINE, new C1769640w9S());
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2138808Zm(null), 2);
        C597530Nc7.LL.LIZJ();
    }
}
