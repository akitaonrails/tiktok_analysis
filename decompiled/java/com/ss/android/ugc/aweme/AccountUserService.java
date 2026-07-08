package com.ss.android.ugc.aweme;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C10EU;
import X.C2454109jX;
import X.C452501pT;
import X.C838410Wul;
import X.C844470XAv;
import X.C848230XPh;
import X.EnumC191814102i;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountUserService extends AbstractC848400XPy {
    public static final C01GW<String> LIZIZ = C452501pT.LIZIZ(new C2454109jX());

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean LIZLLL() {
        try {
            C844470XAv.LIZ.getClass();
            return C838410Wul.LIZ(C844470XAv.LIZ(), LIZIZ.getValue()) != -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean LIZ() {
        LJJIJIL();
        return C848230XPh.LL.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean LIZIZ() {
        return C10EU.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isDeleteByAgeGate() {
        LJJIJIL();
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        return currentUser != null && currentUser.getAgeGatePostAction() == EnumC191814102i.EU_EEA.getValue();
    }
}
