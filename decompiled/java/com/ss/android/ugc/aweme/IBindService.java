package com.ss.android.ugc.aweme;

import X.C0XTR;
import X.C19EG;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public interface IBindService {
    void bindEmail(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void bindEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr);

    void bindEmailFor3PWithCode(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void bindEmailFromSource(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void bindEmailOrMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void bindMobile(Activity activity, String str, Bundle bundle, C0XTR c0xtr);

    void bindMobile(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    void bindMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void bindMobile(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr);

    void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr);

    void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void bindOrVerifyEmailWithCodeAndLogin(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr);

    void bindOrVerifyPhoneWithCodeAndLogin(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr);

    void bindPhoneFromSource(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void changeEmail(Activity activity, String str, Bundle bundle, C0XTR c0xtr);

    void changeEmailWithTypes(Activity activity, String str, ArrayList<VerificationMethodType> arrayList, Bundle bundle);

    void changeMobileWithTypes(Activity activity, String str, ArrayList<VerificationMethodType> arrayList, Bundle bundle);

    void changeUnverifiedEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr);

    boolean emailPopUpFunctionSwitch();

    Intent getAuthorizeActivityStartIntent(Context context);

    List<String> getSocialPlatformNames();

    boolean isPlatformBound(String str);

    void modifyMobile(Activity activity, String str, Bundle bundle, C0XTR c0xtr);

    void modifyMobile(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    void returnResult(int i, int i2, Object obj);

    boolean shouldShowEmailPopUp(Integer num, Function0<Unit> function0);

    boolean shouldShowEmailPopUpInFeed();

    void showEmailPopUp(C19EG c19eg, Integer num, Function0<Unit> function0);

    void startBindEmailCodeVerify(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void startBindMobileSMSVerify(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void unbindEmailV2(Activity activity, boolean z, ArrayList<String> arrayList, String str, boolean z2, Bundle bundle);

    void unbindPhoneV2(Activity activity, ArrayList<String> arrayList, String str, boolean z, Bundle bundle);

    void verifyEmail(Activity activity, String str, Bundle bundle, C0XTR c0xtr);

    void verifyEmailFor3P(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void verifyEmailMagicLinkOnly(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr);

    void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    void verifyNon1pMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);
}
