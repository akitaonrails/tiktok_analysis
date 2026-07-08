package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account;

import X.C0XQB;
import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public final class DefaultDependencyService implements IAccountDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public void addLoginOrLogoutListener(C0XQB c0xqb) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getCsrfToken(String str) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getCurSecUserId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getDeviceChannel(Context context) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getDeviceId() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getDeviceVersionMinor() {
        return "1.0.0.0";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getSecUid() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public Integer getSellerType() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getStoreRegionUpperCase() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getUniqueId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getUserId() {
        return "123456";
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public boolean isLogin() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public void removeLoginOrLogoutListener(C0XQB c0xqb) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public void showLoginAndRegisterView(Activity activity, String str, Function1<? super Boolean, Unit> function1, Function1<? super Integer, Unit> function12) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public void updateToken() {
    }
}
