package com.ss.android.ugc.aweme.compliance.protection.serviceimpl;

import X.C1701670uNp;
import X.C1735410vGF;
import X.C1BNA;
import X.C20684815ws;
import X.C2344009Gk;
import X.C346050DhT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService;
import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ScreenTimeCalcAndTimer;

/* JADX INFO: loaded from: classes27.dex */
public final class AntiAddictionServiceImpl implements IAntiAddictionService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final C1BNA LIZIZ() {
        return new ScreenTimeCalcAndTimer();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final boolean LIZJ() {
        boolean z = C1701670uNp.LIZIZ;
        C1701670uNp.LIZIZ = false;
        return z;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final void LIZLLL() {
        C20684815ws.LJIILLIIL("addict_alert", new C2344009Gk().LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String LJ() {
        String str = C1701670uNp.LIZ;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final C1BNA LJFF() {
        return new C1735410vGF();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final Boolean LIZ() {
        return Boolean.valueOf(!TextUtils.isEmpty(C346050DhT.LIZJ().LLILZLL));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final String LJI() {
        C346050DhT c346050DhTLIZJ = C346050DhT.LIZJ();
        String str = c346050DhTLIZJ.LLILZLL;
        c346050DhTLIZJ.LLILZLL = "";
        return str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService
    public final boolean LJII() {
        return C346050DhT.LIZJ().LLILLJJLI > 0 && C346050DhT.LIZJ().LLILLL > 0;
    }
}
