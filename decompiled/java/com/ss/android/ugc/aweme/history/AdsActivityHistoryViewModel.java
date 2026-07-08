package com.ss.android.ugc.aweme.history;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes30.dex */
public final class AdsActivityHistoryViewModel extends AndroidViewModel {
    public final String vQ2() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        return (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? "" : accountUserServiceLJIIJ.getCurUserId();
    }

    public AdsActivityHistoryViewModel(Application application) {
        super(application);
    }
}
