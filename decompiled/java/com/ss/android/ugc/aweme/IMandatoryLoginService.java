package com.ss.android.ugc.aweme;

import X.C0XTR;
import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes29.dex */
public interface IMandatoryLoginService {
    boolean disableForTest();

    boolean enableForcedLogin(boolean z);

    String getForcedLoginReason();

    boolean getHasRequestComplianceApi();

    Bundle getLoginActivityBundle();

    boolean reorderToFront(Activity activity);

    void setHasRequestComplianceApi(boolean z);

    boolean shouldShowForcedLogin(boolean z);

    boolean shouldShowLoginTabFirst();

    void skipLoginForTest();

    void tryShowMandatoryLoginPage(Activity activity, boolean z, String str, String str2, Bundle bundle, C0XTR c0xtr);
}
