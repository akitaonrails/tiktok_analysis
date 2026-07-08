package com.ss.android.ugc.aweme;

import com.ss.android.ugc.aweme.api.IAccountUtilsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountUtilsService implements IAccountUtilsService {
    @Override // com.ss.android.ugc.aweme.api.IAccountUtilsService
    public final String getCurUserId() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurUserId();
    }
}
