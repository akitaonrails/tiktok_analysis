package com.ss.android.ugc.aweme.biz.wallet.biz.commonpage;

import X.AbstractC1718270uob;
import X.C0PEM;
import X.C1155840gBS;
import X.C1390410mHn;
import X.C1559260qg8;
import X.C1718160uoQ;
import X.C1718170uoR;
import X.C1718180uoS;
import X.C1718190uoT;
import X.C1718200uoU;
import X.C1749280vcc;
import X.C19EG;
import X.C23250099c;
import X.C488200JCo;
import X.C723590SZx;
import X.C724240Sb0;
import X.C817503Hh;
import X.InterfaceC1749320vcg;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class WalletCommonStepAssem extends UIContentAssem {
    public C1749280vcc LLIZLLLIL;
    public C1390410mHn LLJ;
    public final C1559260qg8 LLJI = new C1559260qg8(new C723590SZx(this, C1155840gBS.class, "KEY_STEP_DATA"), checkSupervisorPrepared());

    public final C1155840gBS Ho() {
        return (C1155840gBS) this.LLJI.getValue();
    }

    public final C1390410mHn Jo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z0t) : null;
            this.LLJ = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final C1749280vcc Lo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z18) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final void Go() {
        AbstractC1718270uob c1718160uoQ;
        if (TextUtils.equals(Ho().LL, "CREATE_USER")) {
            c1718160uoQ = new C1718190uoT(Ho().LLILLJJLI, AFwS215S0000000_26.get$arr$(363));
        } else if (TextUtils.equals(Ho().LL, "CREATE_MOBILE")) {
            c1718160uoQ = new C1718170uoR(Ho().LLILLJJLI, AFwS215S0000000_26.get$arr$(364));
        } else if (TextUtils.equals(Ho().LL, "OPEN_CA_ACCOUNT")) {
            c1718160uoQ = new C1718180uoS(Ho().LLILLJJLI, AFwS215S0000000_26.get$arr$(365));
        } else if (TextUtils.equals(Ho().LL, "SIGN_AGREEMENT")) {
            c1718160uoQ = new C1718200uoU(Ho().LLILLJJLI, AFwS215S0000000_26.get$arr$(366));
        } else if (!TextUtils.equals(Ho().LL, "RESET_MOBILE")) {
            return;
        } else {
            c1718160uoQ = new C1718160uoQ(Ho().LLILLJJLI, AFwS215S0000000_26.get$arr$(367));
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            Lo().LJ();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C488200JCo(c1718160uoQ, c19egLIZ, this, null), 2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lo().LIZ(new InterfaceC1749320vcg() { // from class: X.0unK
            @Override // X.InterfaceC1749320vcg
            public final void hide() {
                C786410Ut5.LLLZZIL(this.LIZ.Jo(), 8);
                this.LIZ.Jo().LIZLLL();
            }

            @Override // X.InterfaceC1749320vcg
            public final void show() {
                C786410Ut5.LLLZZIL(this.LIZ.Jo(), 0);
                this.LIZ.Jo().LIZJ();
            }
        });
        Go();
    }
}
