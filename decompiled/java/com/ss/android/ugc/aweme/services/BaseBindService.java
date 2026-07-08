package com.ss.android.ugc.aweme.services;

import X.C0R1H;
import X.C0TT5;
import X.C0XPA;
import X.C0XPB;
import X.C0XTR;
import X.C1239150iLp;
import X.C19EG;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BaseBindService implements IBindService, GenericLifecycleObserver {
    public boolean mKeepCallback;
    public LifecycleOwner mLifeOwner;
    public C0XTR mResult;

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void bindEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr);

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindEmailFor3PWithCode(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void bindEmailFromSource(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindEmailOrMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void bindMobile(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindOrVerifyEmailWithCodeAndLogin(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindOrVerifyPhoneWithCodeAndLogin(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void bindPhoneFromSource(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr);

    public void bindTOTP(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void changeEmail(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
    }

    public abstract /* synthetic */ void changeEmail(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    public void changeEmailVerifyByPassword(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
    }

    public abstract /* synthetic */ void changeEmailVerifyByPassword(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    public void changeEmailVerifyByPhone(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
    }

    public abstract /* synthetic */ void changeEmailVerifyByPhone(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void changeEmailWithTypes(Activity activity, String str, ArrayList<VerificationMethodType> arrayList, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void changeMobileWithTypes(Activity activity, String str, ArrayList<VerificationMethodType> arrayList, Bundle bundle);

    public void changeUnverifiedEmail(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void changeUnverifiedEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ boolean emailPopUpFunctionSwitch();

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void modifyMobile(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ boolean shouldShowEmailPopUp(Integer num, Function0<Unit> function0);

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ boolean shouldShowEmailPopUpInFeed();

    @Override // com.ss.android.ugc.aweme.IBindService
    public abstract /* synthetic */ void showEmailPopUp(C19EG c19eg, Integer num, Function0<Unit> function0);

    @Override // com.ss.android.ugc.aweme.IBindService
    public void startBindEmailCodeVerify(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void startBindMobileSMSVerify(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    public void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void unbindEmailV2(Activity activity, boolean z, ArrayList<String> arrayList, String str, boolean z2, Bundle bundle) {
    }

    public void unbindPhone(Activity activity, ArrayList<String> arrayList, String str) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void unbindPhoneV2(Activity activity, ArrayList<String> arrayList, String str, boolean z, Bundle bundle) {
    }

    public void updateTOTP(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyEmail(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyEmailMagicLinkOnly(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr) {
    }

    public void verifyEmailWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    public void verifyMobileWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, C0XTR c0xtr) {
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyNon1pMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    public void verifyTOTP(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
    }

    public Map<String, C1239150iLp> getBoundSocialPlatforms() {
        HashMap map = new HashMap();
        for (C0XPB c0xpb : C0XPA.LIZLLL.LIZIZ) {
            if (c0xpb.LIZJ) {
                map.put(c0xpb.LIZ, new C1239150iLp(c0xpb.LIZLLL));
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public List<String> getSocialPlatformNames() {
        C0XPB[] c0xpbArr = C0XPA.LIZLLL.LIZIZ;
        if (c0xpbArr == null || c0xpbArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C0XPB c0xpb : c0xpbArr) {
            arrayList.add(c0xpb.LIZ);
        }
        return arrayList;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LifecycleOwner lifecycleOwner = this.mLifeOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public Intent getAuthorizeActivityStartIntent(Context context) {
        return new Intent(context, C0TT5.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public boolean isPlatformBound(String str) {
        return C0XPA.LIZLLL.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void returnResult(int i, int i2, Object obj) {
        C0XTR c0xtr = this.mResult;
        if (c0xtr != null) {
            c0xtr.onResult(i, i2, obj);
        }
        this.mResult = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        this.mResult = c0xtr;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IBindService
    public void modifyMobile(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        this.mResult = c0xtr;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            C0R1H.LIZIZ(lifecycleOwner, this);
        }
        this.mKeepCallback = false;
    }

    @Override // com.ss.android.ugc.aweme.IBindService
    public void verifyEmailFor3P(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        this.mResult = c0xtr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr) {
        this.mResult = c0xtr;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            C0R1H.LIZIZ(lifecycleOwner, this);
        }
        this.mKeepCallback = false;
    }
}
