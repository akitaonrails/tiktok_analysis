package com.ss.android.ugc.aweme;

import X.C0XA4;
import X.C0XNJ;
import X.C0XQT;
import X.C0XTT;
import X.C0XU7;
import X.InterfaceC1748950vc5;
import X.InterfaceC849490XUd;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface ILoginService {
    List<C0XTT> getAllSupportedLoginPlatform();

    String getLoginMobEnterMethod();

    C0XNJ getLogoutProcess();

    Class<? extends Activity> getPushLoginActivityClass();

    boolean isEnableMultiAccountLogin();

    boolean isLoginActivity(Activity activity);

    boolean isLoginPanelDisplayed();

    boolean isPostRegistrationOptionalFlowDisplayed();

    boolean isReactivePageShowing();

    void loginByPlatform(C0XQT c0xqt, C0XTT c0xtt);

    void loginPanelDisplayedUpdate(boolean z, String str);

    void logout(String str, String str2);

    void logout(String str, String str2, C0XU7 c0xu7);

    void logout(String str, String str2, Bundle bundle, C0XU7 c0xu7);

    void logoutWithLoadingIndicator(String str, String str2, Bundle bundle, C0XU7 c0xu7);

    boolean needRedirectToMainAfterLogin();

    void notifyProgress(int i, int i2, String str);

    void openCountryListActivity(Activity activity, InterfaceC1748950vc5 interfaceC1748950vc5);

    void returnResult(int i, int i2, Object obj);

    void setPostRegistrationOptionalFlowDisplayed(boolean z);

    void showFTCCreateAccountView(Activity activity, boolean z);

    void showLoginAndRegisterView(C0XQT c0xqt);

    void showLoginView(C0XQT c0xqt);

    void switchAccount(SignificantUserInfo significantUserInfo, Bundle bundle, InterfaceC849490XUd interfaceC849490XUd);

    boolean toRecoverDeletedAccount(String str);

    void updateTokenForSessionExpired(String str, String str2, String str3, String str4, C0XA4 c0xa4);

    void uploadAccountNum(boolean z);
}
