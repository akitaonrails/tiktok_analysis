package com.ss.android.ugc.aweme.framework.services;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes3.dex */
public interface IUserService {
    User getCurrentUser();

    String getCurrentUserID();

    boolean isLogin();

    void setIsOldUser(boolean z);
}
