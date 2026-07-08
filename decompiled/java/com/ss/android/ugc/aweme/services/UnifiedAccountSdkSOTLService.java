package com.ss.android.ugc.aweme.services;

import X.C0CCZ;
import X.C0XFW;
import X.C0XG0;
import X.C0XGX;
import X.C844470XAv;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IUnifiedAccountSdkSOTLService;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLTokenPreloadTask;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class UnifiedAccountSdkSOTLService implements IUnifiedAccountSdkSOTLService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.IUnifiedAccountSdkSOTLService
    public boolean shouldShowSOTLPanel() {
        IAccountService iAccountService;
        IAccountLoginMethodsService iAccountLoginMethodsService;
        AccountUserService accountUserServiceLJIIJ;
        if (((Boolean) C0XG0.LIZ.getValue()).booleanValue() && C0XGX.LIZ() && (((iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.isLogin()) && (iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null)) != null && iAccountLoginMethodsService.LJ())) {
            List<String> list = C0XFW.LIZ;
            C844470XAv.LIZ.getClass();
            if (C0XFW.LIZIZ(C844470XAv.LIZ()) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IUnifiedAccountSdkSOTLService
    public C0CCZ getPreloadTask() {
        if (shouldShowSOTLPanel()) {
            return new SOTLTokenPreloadTask();
        }
        return null;
    }
}
