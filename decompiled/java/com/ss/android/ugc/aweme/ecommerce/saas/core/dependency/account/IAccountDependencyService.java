package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account;

import X.C0XQB;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public interface IAccountDependencyService extends IECommerceHostService {
    void addLoginOrLogoutListener(C0XQB c0xqb);

    String getCsrfToken(String str);

    String getCurSecUserId();

    String getDeviceChannel(Context context);

    String getDeviceId();

    String getDeviceVersionMinor();

    String getSecUid();

    Integer getSellerType();

    String getStoreRegionUpperCase();

    String getUniqueId();

    String getUserId();

    boolean isLogin();

    void removeLoginOrLogoutListener(C0XQB c0xqb);

    void showLoginAndRegisterView(Activity activity, String str, Function1<? super Boolean, Unit> function1, Function1<? super Integer, Unit> function12);

    void updateToken();
}
