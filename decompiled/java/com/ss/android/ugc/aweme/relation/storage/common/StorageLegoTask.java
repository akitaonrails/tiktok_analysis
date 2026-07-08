package com.ss.android.ugc.aweme.relation.storage.common;

import X.C01GW;
import X.C036E;
import X.C065A;
import X.C0CCZ;
import X.C0O0L;
import X.C0VZ0;
import X.C1326805He;
import X.C1327105Hh;
import X.C1328305Ht;
import X.C1328705Hx;
import X.C1328805Hy;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C23250099c;
import X.C452501pT;
import X.C804440Vh4;
import X.C816930W2x;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class StorageLegoTask implements C0CCZ {
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(614));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StorageLegoTask";
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
        String strName;
        if (!this.LL.compareAndSet(false, true) || !C816930W2x.LIZ()) {
            return;
        }
        C1328305Ht c1328305Ht = C1328305Ht.LL;
        C01GW c01gw = C1328305Ht.LLILZ;
        ((IAccountService) c01gw.getValue()).LJIILL(c1328305Ht);
        C1328305Ht.LLILLJJLI.setValue(((IAccountService) c01gw.getValue()).LJIIJ().getCurUserId());
        C1328705Hx c1328705Hx = C1328705Hx.LL;
        C804440Vh4 c804440Vh4 = C036E.LIZ;
        c804440Vh4.LIZ(c1328705Hx);
        C2252321DDq c2252321DDq = C1328705Hx.LLILLJJLI;
        c2252321DDq.setValue(c804440Vh4.LIZJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init net_status: ");
        C0O0L c0o0l = (C0O0L) c2252321DDq.getValue();
        if (c0o0l != null) {
            strName = c0o0l.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        C1327105Hh.LIZIZ("NetObserver", C2188811AlT.LIZIZ(sbLIZ));
        boolean zIsLogin = ((IAccountService) this.LLILLJJLI.getValue()).LJIIJ().isLogin();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init module, isLogin: ");
        sbLIZ2.append(zIsLogin);
        C1327105Hh.LIZIZ("Lego", C2188811AlT.LIZIZ(sbLIZ2));
        if (!zIsLogin) {
            C23250099c.LIZLLL(C065A.LIZ(), null, null, new C1326805He(this, null), 3);
        } else {
            C1328805Hy.LIZ();
        }
    }
}
