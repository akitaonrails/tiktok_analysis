package com.ss.android.ugc.aweme.notice;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C0XQ7;
import X.C10EU;
import X.C1336205Ku;
import X.C1602160rnK;
import X.C1903780zdo;
import X.C20684815ws;
import X.C21376918lD;
import X.C21377018lE;
import X.C21377118lF;
import X.C21377218lG;
import X.C21377318lH;
import X.C21377418lI;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C452501pT;
import X.C786410Ut5;
import Y.ARunnableS132S0100000_32;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class DmNoticeProxyImpl implements DmNoticeProxy {
    public boolean LJ;
    public final C01GW LIZ = C452501pT.LIZIZ(new C21376918lD());
    public String LIZIZ = "";
    public final C01GW LIZJ = C452501pT.LIZIZ(new C21377118lF());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C21377018lE());
    public final C01GW LJFF = C452501pT.LIZIZ(new C21377218lG());

    public final void LJFF() {
        this.LJ = true;
        for (TuxAlertBadgeLayout tuxAlertBadgeLayout : LIZLLL().values()) {
            tuxAlertBadgeLayout.setVariant(0);
            tuxAlertBadgeLayout.LIZJ();
        }
    }

    public static DmNoticeProxy LIZJ() {
        Object objLIZ = C04TD.LIZ(DmNoticeProxy.class, false);
        if (objLIZ != null) {
            return (DmNoticeProxy) objLIZ;
        }
        if (C04TD.Q2 == null) {
            synchronized (DmNoticeProxy.class) {
                if (C04TD.Q2 == null) {
                    C04TD.Q2 = new DmNoticeProxyImpl();
                }
            }
        }
        return C04TD.Q2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void LIZ() {
        LIZLLL().remove("homepage_hot");
    }

    public final Map<String, TuxAlertBadgeLayout> LIZLLL() {
        return (Map) this.LIZ.getValue();
    }

    public final C21377418lI LJ() {
        return (C21377418lI) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final boolean LIZIZ() {
        return !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || C10EU.LJIIIIZZ() || C1336205Ku.LIZJ().LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final String T() {
        return LJ().LIZ ? "dot" : LJ().LIZIZ > 0 ? "number" : "";
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final int Z0() {
        return LJ().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void X0(String str) {
        if (LIZLLL().isEmpty()) {
            return;
        }
        if (str.length() != 0) {
            if (LIZLLL().isEmpty()) {
                str = "";
            } else {
                str = "notification_page";
            }
        }
        this.LIZIZ = str;
        if (LIZIZ()) {
            for (View view : LIZLLL().values()) {
                int visibility = view.getVisibility();
                view.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, view);
            }
            return;
        }
        int iLJIIJ = C1903780zdo.LJIIJ(99);
        if (iLJIIJ > 0) {
            if (((C21377318lH) this.LJFF.getValue()).LIZ) {
                LJFF();
            } else {
                this.LJ = false;
                for (TuxAlertBadgeLayout tuxAlertBadgeLayout : LIZLLL().values()) {
                    tuxAlertBadgeLayout.setVariant(1);
                    tuxAlertBadgeLayout.setMaxCount(2);
                    tuxAlertBadgeLayout.LIZJ();
                    tuxAlertBadgeLayout.setCount(iLJIIJ);
                }
                if (((C21377318lH) this.LJFF.getValue()).LIZIZ) {
                    ((C21377318lH) this.LJFF.getValue()).LIZIZ = false;
                    C786410Ut5.LJLIIL(3000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS132S0100000_32(this, 83));
                }
            }
        } else if (C1903780zdo.LJIIJJI(101, 11)) {
            LJFF();
        } else {
            this.LJ = false;
            Iterator<T> it2 = LIZLLL().values().iterator();
            while (it2.hasNext()) {
                ((TuxAlertBadgeLayout) it2.next()).LIZIZ();
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DmNotice needShowDot ");
        sbLIZ.append(C1903780zdo.LJIIJJI(101, 11));
        C2344809Gs.LJFF("UnreadCount", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DmNotice unread count ");
        sbLIZ2.append(iLJIIJ);
        C2344809Gs.LJFF("UnreadCount", C2188811AlT.LIZIZ(sbLIZ2));
        boolean z = this.LJ;
        if (z || iLJIIJ < 0) {
            iLJIIJ = 0;
        }
        if (z != LJ().LIZ || iLJIIJ != LJ().LIZIZ) {
            LJ().LIZ = z;
            LJ().LIZIZ = iLJIIJ;
        }
        if (this.LIZIZ.length() != 0) {
            if (((C21377418lI) this.LIZLLL.getValue()).LIZ != LJ().LIZ || ((C21377418lI) this.LIZLLL.getValue()).LIZIZ != LJ().LIZIZ) {
                ((C21377418lI) this.LIZLLL.getValue()).LIZ = LJ().LIZ;
                ((C21377418lI) this.LIZLLL.getValue()).LIZIZ = LJ().LIZIZ;
                String str2 = this.LIZIZ;
                String strT = T();
                int i = ((C21377418lI) this.LIZLLL.getValue()).LIZIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                c2344009Gk.LJIIIIZZ("notice_type", strT);
                c2344009Gk.LIZJ(i, "num");
                C20684815ws.LJIILLIIL("chat_notice_show", c2344009Gk.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy
    public final void Y0(TuxAlertBadgeLayout tuxAlertBadgeLayout) {
        LIZLLL().put("homepage_hot", tuxAlertBadgeLayout);
        X0("homepage_hot");
    }
}
