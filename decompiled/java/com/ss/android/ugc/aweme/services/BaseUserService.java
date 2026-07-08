package com.ss.android.ugc.aweme.services;

import X.C0XQ7;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes4.dex */
public class BaseUserService implements IUserService {
    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public User getCurrentUser() {
        return C0XQ7.LJFF().getCurUser();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public String getCurrentUserID() {
        return C0XQ7.LJFF().getCurUserId();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public boolean isLogin() {
        return C0XQ7.LJFF().isLogin();
    }

    @Override // com.ss.android.ugc.aweme.framework.services.IUserService
    public void setIsOldUser(boolean z) {
        SharePrefCache.inst().getIsOldUser().LJ(Boolean.valueOf(z));
    }
}
