package com.ss.android.ugc.aweme.account.main;

import X.C0CQG;
import X.C13LE;
import X.C19719912Dl;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.IAccountMainService;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;

/* JADX INFO: loaded from: classes29.dex */
public class AccountMainServiceImpl implements IAccountMainService {
    @Override // com.ss.android.ugc.aweme.IAccountMainService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(AccountMainActivityAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IAccountMainService
    public final C19719912Dl LIZIZ() {
        return C13LE.LIZ(LoginAndConsentAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IAccountMainService
    public final C19719912Dl LIZJ() {
        return C13LE.LIZ(SignUpOrLoginActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.IAccountMainService
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(AgeGateSAFWrapperFragment.class);
    }

    @Override // com.ss.android.ugc.aweme.IAccountMainService
    public final void LJ() {
        C0CQG.LIZ.getClass();
        C0CQG.LIZIZ.put("nujComponent", Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
