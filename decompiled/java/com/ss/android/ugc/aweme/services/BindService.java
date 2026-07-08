package com.ss.android.ugc.aweme.services;

import X.AbstractC848400XPy;
import X.AbstractC854370XfP;
import X.C09JN;
import X.C0T3I;
import X.C0WZX;
import X.C0XO0;
import X.C0XPY;
import X.C0XQ3;
import X.C0XQ5;
import X.C0XTR;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1440005kM;
import X.C15O7;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C18167079p;
import X.C19EG;
import X.C1AF0;
import X.C1C7U;
import X.C20688088o;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2275601E5e;
import X.C257220A6e;
import X.C257230A6f;
import X.C786410Ut5;
import X.C851380Xaa;
import X.C852810Xct;
import X.C854270XfF;
import X.C854350XfN;
import X.C854360XfO;
import X.EnumC1237810iJf;
import X.EnumC1237820iJg;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import X.EnumC854380XfQ;
import X.InterfaceC1478005qU;
import X.InterfaceC2275611E5f;
import X.InterfaceC420801kM;
import X.InterfaceC781210Ukh;
import Y.AfS81S0101000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.UserPermissionData;
import com.ss.android.ugc.aweme.services.BindService;
import com.ss.android.ugc.aweme.services.model.BindServiceData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public class BindService extends BaseBindService {
    @Override // com.ss.android.ugc.aweme.services.BaseBindService, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.BindService$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes20.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$aweme$account$model$VerificationMethodType;

        static {
            int[] iArr = new int[VerificationMethodType.values().length];
            $SwitchMap$com$ss$android$ugc$aweme$account$model$VerificationMethodType = iArr;
            try {
                iArr[VerificationMethodType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$model$VerificationMethodType[VerificationMethodType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$ss$android$ugc$aweme$account$model$VerificationMethodType[VerificationMethodType.PASSWORD.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public boolean shouldShowEmailPopUpInFeed() {
        C0XQ3.LIZ.getClass();
        InterfaceC2275611E5f.LIZ.getClass();
        C2275601E5e.LIZIZ.getValue().LJJLIL();
        if (C18167079p.LIZ() == 1 || C18167079p.LIZ() == 2 || C18167079p.LIZ() == 3) {
            return true;
        }
        Keva keva = C854360XfO.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed");
        sbLIZ.append(C854360XfO.LIZIZ);
        if (C854360XfO.LIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            return true;
        }
        C854360XfO.LIZLLL(true);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public boolean emailPopUpFunctionSwitch() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("user_bind_email_function_switch", false);
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private C0XTR postUserInfoChangeEventAfterSuccess(final C0XTR c0xtr) {
        return new C0XTR() { // from class: X.0iDf
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                BindService.lambda$postUserInfoChangeEventAfterSuccess$3(c0xtr, i, i2, obj);
            }
        };
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6AS9O4/UWfFZLMGa", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldShowEmailPopUp(java.lang.Integer r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.BindService.shouldShowEmailPopUp(java.lang.Integer, kotlin.jvm.functions.Function0):boolean");
    }

    private Bundle getVerify1pBundle(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle);
        }
        return bundle;
    }

    public static Object lambda$showEmailPopUp$2(C19EG c19eg, Integer num, Function0 function0) {
        C1C7U.LIZ("BindService@185a.showEmailPopUp$1L");
        C0XQ3 c0xq3 = C0XQ3.LIZ;
        int iIntValue = num.intValue();
        c0xq3.getClass();
        try {
            InterfaceC420801kM interfaceC420801kMLJJZ = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0XQ2
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<Boolean> c09aj) {
                    boolean zBooleanValue;
                    C1C7U.LIZ("EmailPopUp@351.showPopUpAsync$disposable$1");
                    boolean zBooleanValue2 = false;
                    C0XQ3.LIZJ = false;
                    C0XQ3.LIZLLL = false;
                    C0XQ3.LIZ.getClass();
                    boolean zLJI = MethodIDManager.LJI(137780);
                    String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    UserPermissionData.UserPermissionRequestType userPermissionRequestType = UserPermissionData.UserPermissionRequestType.COLLECTION_POPUP;
                    sbLIZ.append(userPermissionRequestType);
                    sbLIZ.append(',');
                    UserPermissionData.UserPermissionRequestType userPermissionRequestType2 = UserPermissionData.UserPermissionRequestType.COLLECTION_CHECKBOX;
                    sbLIZ.append(userPermissionRequestType2);
                    UserPermissionData.UserPermissionInfo userPermissionInfoLJJIL = ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIL(storeRegionUpperCase, C2188811AlT.LIZIZ(sbLIZ));
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    Boolean bool = userPermissionInfoLJJIL.permissionsMap().get(userPermissionRequestType.toString());
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    C0XQ3.LIZJ = zBooleanValue;
                    Boolean bool2 = userPermissionInfoLJJIL.permissionsMap().get(userPermissionRequestType2.toString());
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    }
                    C0XQ3.LIZLLL = zBooleanValue2;
                    if (C0XQ3.LIZJ) {
                        c09aj.onNext(Boolean.TRUE);
                        c09aj.onComplete();
                    } else {
                        c09aj.onError(new IllegalStateException("region or age check failed"));
                    }
                    C1C7U.LIZIZ("EmailPopUp@351.showPopUpAsync$disposable$1");
                }
            }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS81S0101000_13(iIntValue, c19eg, 5), new C09JN() { // from class: X.0XQ4
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("EmailPopUp@351.showPopUpAsync$disposable$3");
                    C0XQ3.LIZ.getClass();
                    C0XQ3.LIZ();
                    C1C7U.LIZIZ("EmailPopUp@351.showPopUpAsync$disposable$3");
                }
            }, new InterfaceC781210Ukh() { // from class: X.0ZZn
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                }
            });
            C0XQ3.LIZIZ = function0;
            final Application application = c19eg.getApplication();
            final WeakReference weakReference = new WeakReference(c19eg);
            final C11JF c11jf = (C11JF) interfaceC420801kMLJJZ;
            C20688088o c20688088o = new C20688088o() { // from class: X.08lZ
                @Override // X.C20688088o, android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                    if (Intrinsics.LJFF(weakReference.get(), activity)) {
                        c11jf.dispose();
                        Application application2 = application;
                        if (application2 != null) {
                            application2.unregisterActivityLifecycleCallbacks(this);
                        }
                    }
                }
            };
            if (application != null) {
                application.registerActivityLifecycleCallbacks(c20688088o);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C1C7U.LIZIZ("BindService@185a.showEmailPopUp$1L");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void showEmailPopUp(final C19EG c19eg, final Integer num, final Function0<Unit> function0) {
        boolean zLJI = MethodIDManager.LJI(71970);
        try {
            C15O7.LIZJ(new Callable() { // from class: X.0iDZ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BindService.lambda$showEmailPopUp$2(c19eg, num, function0);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void unbindPhone(Activity activity, ArrayList<String> arrayList, String str) {
        super.unbindPhone(activity, arrayList, str);
        UnbindPhoneOrEmailActivity.LLLZLZ(activity, arrayList, str, Boolean.FALSE, null);
    }

    public static /* synthetic */ void lambda$postUserInfoChangeEventAfterSuccess$3(C0XTR c0xtr, int i, int i2, Object obj) {
        if (i2 == 1) {
            C1440005kM.LIZ(new C854270XfF());
        }
        if (c0xtr != null) {
            c0xtr.onResult(i, i2, obj);
        }
    }

    public static /* synthetic */ void lambda$setPassword$1(C0XTR c0xtr, int i, int i2, Object obj) {
        if (c0xtr != null) {
            c0xtr.onResult(i, 1, obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle2.getString("enter_method", "").equals("click_change")) {
            C786410Ut5.LJJJI("enter_method", "click_try_phone", bundle2);
            bindMobile(activity, str, "click_try_phone", bundle2, c0xtr);
        } else {
            bindMobile(activity, str, "", bundle2, c0xtr);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void changeEmail(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        super.changeEmail(activity, str, bundle, c0xtr);
        changeEmail(activity, str, bundle, false, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void changeEmailVerifyByPassword(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        super.changeEmailVerifyByPassword(activity, str, bundle, c0xtr);
        changeEmailVerifyWithStep(activity, str, bundle, EnumC852910Xd3.VERIFY_PASSWORD, false, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void changeEmailVerifyByPhone(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        super.changeEmailVerifyByPhone(activity, str, bundle, c0xtr);
        changeEmailVerifyWithStep(activity, str, bundle, EnumC852910Xd3.PHONE_SMS_VERIFY, false, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void changeEmailWithTypes(Activity activity, String str, ArrayList<VerificationMethodType> arrayList, Bundle bundle) {
        if (arrayList.isEmpty()) {
            return;
        }
        C786410Ut5.LJJIZ(bundle, "eligible_verification_methods", arrayList);
        VerificationMethodType verificationMethodType = VerificationMethodType.EMAIL;
        if (!arrayList.contains(verificationMethodType)) {
            verificationMethodType = (VerificationMethodType) ListProtector.get(arrayList, 0);
        }
        int i = AnonymousClass2.$SwitchMap$com$ss$android$ugc$aweme$account$model$VerificationMethodType[verificationMethodType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    changeEmailVerifyByPassword(activity, str, bundle, true, null);
                    return;
                }
                return;
            }
            changeEmailVerifyByPhone(activity, str, bundle, true, null);
            return;
        }
        changeEmail(activity, str, bundle, true, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void changeMobileWithTypes(Activity activity, String str, ArrayList<VerificationMethodType> arrayList, Bundle bundle) {
        if (arrayList.isEmpty()) {
            return;
        }
        C786410Ut5.LJJIZ(bundle, "eligible_verification_methods", arrayList);
        VerificationMethodType verificationMethodType = VerificationMethodType.MOBILE;
        if (!arrayList.contains(verificationMethodType)) {
            verificationMethodType = (VerificationMethodType) ListProtector.get(arrayList, 0);
        }
        int i = AnonymousClass2.$SwitchMap$com$ss$android$ugc$aweme$account$model$VerificationMethodType[verificationMethodType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    modifyMobileVerifyByPassword(activity, str, bundle, true, null);
                    return;
                }
                return;
            }
            modifyMobile(activity, str, bundle, true, null);
            return;
        }
        modifyMobileVerifyByEmail(activity, str, bundle, true, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void modifyMobile(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        modifyMobileInner(activity, str, bundle, 0, false, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str) {
        super.unbindEmail(activity, z, arrayList, str);
        UnbindPhoneOrEmailActivity.LLLZIL(activity, z, arrayList, str, Boolean.FALSE, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyEmail(Activity activity, String str, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        super.verifyEmail(activity, str, bundle2, c0xtr);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        C786410Ut5.LJJJI("enter_from", str, bundle2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_verify_email");
        C786410Ut5.LJJJI("enter_from_item", C2188811AlT.LIZIZ(sbLIZ), bundle2);
        if (bundle2.getString("enter_method") == null || bundle2.getString("enter_method").isEmpty()) {
            C786410Ut5.LJJJI("enter_method", "email_verification", bundle2);
        }
        String email = C0XQ5.LIZJ().getEmail();
        if (!TextUtils.isEmpty(email)) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIILLIIL(bundle2, email);
        }
        if (bundle2.getString("page") == null) {
            C786410Ut5.LJJJI("page", "verify_email_settings", bundle2);
        }
        String str2 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.CONFIRM_EMAIL_BEFORE_VERIFY, EnumC852660Xce.VERIFY, bundle2, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        super.bindEmail(activity, str, str2, bundle, c0xtr);
        bindEmail(activity, str, str2, bundle, false, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindEmailFor3PWithCode(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle2);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.EMAIL_SMS_BIND, EnumC852660Xce.BIND_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr), null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindEmailFromSource(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        bundle.putBoolean("code_sent", false);
        C786410Ut5.LJJJI("args_email", str, bundle);
        bundle.putBoolean("show_edit_icon", true);
        AbstractC854370XfP abstractC854370XfP = new AbstractC854370XfP() { // from class: X.0Xej
            public static final int $stable = 0;

            @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
            public String getFirstStepId() {
                return "verify_email_code_for_change";
            }

            @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
            public HashMap<String, HashMap<String, String>> getFlowGraph() {
                return C2097608Jq.LJI(new Pair(getFirstStepId(), C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickChangeEmailAction.class.getSimpleName(), "input_email_for_change"))), new Pair("input_email_for_change", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "verify_email_code_for_change"))));
            }
        };
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZIZ(activity, abstractC854370XfP, EnumC852660Xce.BIND_EMAIL, bundle, postUserInfoChangeEventAfterSuccess(c0xtr));
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindEmailOrMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("use_phone", true);
        bundle2.putBoolean("use_email", true);
        bindEmail(activity, str, str2, bundle2, false, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle2.getString("enter_method", "").equals("click_change")) {
            C786410Ut5.LJJJI("enter_method", "click_try_phone", bundle2);
            bindMobile(activity, str, "click_try_phone", bundle2, z, c0xtr);
        } else {
            bindMobile(activity, str, "", bundle2, z, c0xtr);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobileOrEmailAndSetPwd(final Activity activity, final String str, final String str2, Bundle bundle, final C0XTR c0xtr) {
        bindMobileOrEmail(activity, str, str2, bundle, true, new C0XTR() { // from class: X.0iDc
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                this.LIZ.lambda$bindMobileOrEmailAndSetPwd$0(c0xtr, activity, str, str2, i, i2, obj);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindPhoneFromSource(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        bundle.putBoolean("code_sent", false);
        C786410Ut5.LJJJI("args_string_phone_number", str, bundle);
        bundle.putBoolean("show_edit_icon", true);
        AbstractC854370XfP abstractC854370XfP = new AbstractC854370XfP() { // from class: X.0Xek
            public static final int $stable = 0;

            @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
            public String getFirstStepId() {
                return "verify_phone_for_bind";
            }

            @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
            public HashMap<String, HashMap<String, String>> getFlowGraph() {
                return C2097608Jq.LJI(new Pair(getFirstStepId(), C2097608Jq.LJI(new Pair(InputPhoneFragment.InputPhoneActions.ClickChangePhoneAction.class.getSimpleName(), "enter_phone_for_bind"))), new Pair("enter_phone_for_bind", C2097608Jq.LJI(new Pair(InputPhoneFragment.InputPhoneActions.ClickSendCodeAction.class.getSimpleName(), "verify_phone_for_bind"))));
            }
        };
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZIZ(activity, abstractC854370XfP, EnumC852660Xce.BIND_PHONE, bundle, postUserInfoChangeEventAfterSuccess(c0xtr));
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void bindTOTP(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        super.bindTOTP(activity, str, str2, bundle, c0xtr);
        Bundle bundle2 = new BindServiceData(bundle, str, "_bind_TOTP", str2).updatedActivityData;
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.TOTP_BIND, EnumC852660Xce.BIND_TOTP, bundle2, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void changeEmail(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        super.changeEmail(activity, str, bundle2, c0xtr);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        C786410Ut5.LJJJI("enter_from", str, bundle2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_change_email");
        C786410Ut5.LJJJI("enter_from_item", C2188811AlT.LIZIZ(sbLIZ), bundle2);
        if (bundle2.getString("page") == null) {
            C786410Ut5.LJJJI("page", "change_email", bundle2);
        }
        C852810Xct c852810Xct = C852810Xct.LIZ;
        String email = C0XQ5.LIZJ().getEmail();
        c852810Xct.getClass();
        C852810Xct.LJIILLIIL(bundle2, email);
        if (z && C257220A6e.LIZIZ) {
            C854350XfN c854350XfN = new C854350XfN(VerificationMethodType.EMAIL);
            String str2 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZIZ(activity, c854350XfN, EnumC852660Xce.CHANGE_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr));
        } else {
            String str3 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZ(activity, EnumC852910Xd3.VERIFY_EMAIL_BEFORE_CHANGE, EnumC852660Xce.CHANGE_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void changeEmailVerifyByPassword(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr) {
        super.changeEmailVerifyByPassword(activity, str, bundle, c0xtr);
        changeEmailVerifyWithStep(activity, str, bundle, EnumC852910Xd3.VERIFY_PASSWORD, z, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void changeEmailVerifyByPhone(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr) {
        super.changeEmailVerifyByPhone(activity, str, bundle, c0xtr);
        changeEmailVerifyWithStep(activity, str, bundle, EnumC852910Xd3.PHONE_SMS_VERIFY, z, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void changeUnverifiedEmail(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        super.changeUnverifiedEmail(activity, str, str2, bundle, c0xtr);
        changeUnverifiedEmail(activity, str, str2, bundle, false, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void modifyMobile(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr) {
        modifyMobileInner(activity, str, bundle, 0, z, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr) {
        String email = C0XQ5.LIZJ().getEmail();
        if (!TextUtils.isEmpty(email)) {
            C852810Xct.LIZ.getClass();
            C852810Xct.LJIILLIIL(bundle, email);
        }
        modifyMobileInner(activity, str, bundle, 1, z, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, boolean z, C0XTR c0xtr) {
        modifyMobileInner(activity, str, bundle, 2, z, c0xtr);
    }

    public void setPassword(Activity activity, String str, String str2, String str3, final C0XTR c0xtr) {
        C0XQ5.LIZIZ.LJIIJJI().setPasswordForMT(activity, str, str2, str3, null, new C0XTR() { // from class: X.0iDe
            @Override // X.C0XTR
            public final void onResult(int i, int i2, Object obj) {
                BindService.lambda$setPassword$1(c0xtr, i, i2, obj);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void startBindEmailCodeVerify(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle2);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.EMAIL_SMS_BIND, EnumC852660Xce.BIND_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr), null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void startBindMobileSMSVerify(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        super.bindMobile(activity, str, str2, bundle2, false, postUserInfoChangeEventAfterSuccess(c0xtr));
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        String str3 = BindOrModifyPhoneActivity._pnsPageId;
        Intent intentPutExtras = new Intent(activity, (Class<?>) BindOrModifyPhoneActivity.class).putExtra("current_scene", EnumC852660Xce.BIND_PHONE.getValue()).putExtra("next_page", EnumC852910Xd3.PHONE_SMS_BIND.getValue()).putExtras(bundle2);
        if (!TextUtils.isEmpty(str)) {
            intentPutExtras.putExtra("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intentPutExtras.putExtra("enter_method", str2);
        }
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intentPutExtras);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void unbindPhoneV2(Activity activity, ArrayList<String> arrayList, String str, boolean z, Bundle bundle) {
        super.unbindPhoneV2(activity, arrayList, str, z, bundle);
        UnbindPhoneOrEmailActivity.LLLZLZ(activity, arrayList, str, Boolean.valueOf(z), bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void updateTOTP(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        super.updateTOTP(activity, str, str2, bundle, c0xtr);
        Bundle bundle2 = new BindServiceData(bundle, str, "_update_TOTP", str2).updatedActivityData;
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.TOTP_BIND, EnumC852660Xce.UPDATE_TOTP, bundle2, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyEmailFor3P(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        super.verifyEmailFor3P(activity, str, str2, bundle, c0xtr);
        Bundle verify1pBundle = getVerify1pBundle(str, str2, bundle);
        C852810Xct.LIZ.getClass();
        if ("".equals(C852810Xct.LJ(bundle))) {
            C0XQ5.LIZJ();
            if (C0XQ5.LIZJ().getEmail() != null) {
                C852810Xct.LJIILLIIL(bundle, C0XQ5.LIZJ().getEmail());
            } else {
                C852810Xct.LJIILLIIL(bundle, C0XO0.LIZLLL(C0XPY.LIZIZ).LLLIIIL.LJIIJ);
            }
        }
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.EMAIL_SMS_VERIFY, EnumC852660Xce.VERIFY_3P, verify1pBundle, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        super.verifyEmailForTicket(activity, str, str2, bundle2, c0xtr);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle2);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        C852810Xct c852810Xct = C852810Xct.LIZ;
        String email = C0XQ5.LIZJ().getEmail();
        c852810Xct.getClass();
        C852810Xct.LJIILLIIL(bundle2, email);
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.VERIFY_EMAIL_FOR_TICKET, EnumC852660Xce.VERIFY, bundle2, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        super.verifyMobileForTicket(activity, str, str2, bundle2, c0xtr);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle2);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        C852810Xct c852810Xct = C852810Xct.LIZ;
        String bindPhone = C0XQ5.LIZJ().getBindPhone();
        c852810Xct.getClass();
        C852810Xct.LJIJI(bundle2, bindPhone);
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.VERIFY_PHONE_FOR_TICKET, EnumC852660Xce.VERIFY, bundle2, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyNon1pMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        super.verifyNon1pMobile(activity, str, str2, bundle, c0xtr);
        Bundle verify1pBundle = getVerify1pBundle(str, str2, bundle);
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.NON1P_PHONE_BIND, EnumC852660Xce.VERIFY_3P, verify1pBundle, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyTOTP(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        super.verifyTOTP(activity, str, str2, bundle, c0xtr);
        Bundle bundle2 = new BindServiceData(bundle, str, "_verify_TOTP", str2).updatedActivityData;
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.VERIFY_TOTP, EnumC852660Xce.VERIFY_TOTP, bundle2, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, C0XTR c0xtr) {
        bindMobile(activity, str, str2, bundle, false, c0xtr);
    }

    private void changeEmailVerifyWithStep(Activity activity, String str, Bundle bundle, EnumC852910Xd3 enumC852910Xd3, boolean z, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle2.getString("page") == null) {
            C786410Ut5.LJJJI("page", "change_email", bundle2);
        }
        VerificationMethodType verificationMethodType = VerificationMethodType.PASSWORD;
        if (enumC852910Xd3 == EnumC852910Xd3.PHONE_SMS_VERIFY) {
            C852810Xct c852810Xct = C852810Xct.LIZ;
            String bindPhone = C0XQ5.LIZJ().getBindPhone();
            c852810Xct.getClass();
            C852810Xct.LJIJI(bundle2, bindPhone);
            verificationMethodType = VerificationMethodType.MOBILE;
        }
        C786410Ut5.LJJJI("enter_from", str, bundle2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_change_email");
        C786410Ut5.LJJJI("enter_from_item", C2188811AlT.LIZIZ(sbLIZ), bundle2);
        C852810Xct c852810Xct2 = C852810Xct.LIZ;
        String email = C0XQ5.LIZJ().getEmail();
        c852810Xct2.getClass();
        C852810Xct.LJIILLIIL(bundle2, email);
        if (z && C257220A6e.LIZIZ) {
            C854350XfN c854350XfN = new C854350XfN(verificationMethodType);
            String str2 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZIZ(activity, c854350XfN, EnumC852660Xce.CHANGE_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr));
        } else {
            String str3 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZ(activity, enumC852910Xd3, EnumC852660Xce.CHANGE_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr), null);
        }
    }

    private void modifyMobileInner(Activity activity, String str, Bundle bundle, int i, boolean z, C0XTR c0xtr) {
        EnumC852910Xd3 enumC852910Xd3;
        super.modifyMobile(activity, str, bundle, postUserInfoChangeEventAfterSuccess(c0xtr));
        String str2 = BindOrModifyPhoneActivity._pnsPageId;
        if (i != 1) {
            if (i != 2) {
                enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_VERIFY;
            } else {
                enumC852910Xd3 = EnumC852910Xd3.VERIFY_PASSWORD;
            }
        } else {
            enumC852910Xd3 = EnumC852910Xd3.VERIFY_EMAIL_BEFORE_CHANGE;
        }
        Intent intentPutExtra = new Intent(activity, (Class<?>) BindOrModifyPhoneActivity.class).putExtra("current_scene", EnumC852660Xce.MODIFY_PHONE.getValue()).putExtra("next_page", enumC852910Xd3.getValue()).putExtra("enter_method", "change_bind_phone_click");
        if (!TextUtils.isEmpty(str)) {
            intentPutExtra.putExtra("ENTER_REASON", str);
        }
        if (activity.getIntent().getBooleanExtra("is_from_prompt", false)) {
            if (activity.getIntent().hasExtra("enter_method")) {
                intentPutExtra.putExtra("enter_method", INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(activity.getIntent(), "enter_method"));
            }
            intentPutExtra.putExtra("page", "prompt_user_confirm");
        }
        if (INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intentPutExtra, "page") == null) {
            if (bundle.getString("page") == null) {
                C786410Ut5.LJJJI("page", "change_phone", bundle);
            }
        } else {
            if (bundle != null) {
            }
            if (!z && C257220A6e.LIZIZ) {
                EnumC854380XfQ.Companion.getClass();
                try {
                    for (final EnumC854380XfQ enumC854380XfQ : EnumC854380XfQ.values()) {
                        if (enumC854380XfQ.getValue() == i) {
                            AbstractC854370XfP abstractC854370XfP = new AbstractC854370XfP(enumC854380XfQ) { // from class: X.0XfJ
                                public static final int $stable = 0;
                                public final EnumC854380XfQ LL;

                                @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                                public HashMap<String, HashMap<String, String>> getFlowGraph() {
                                    return C2097608Jq.LJI(new Pair("verify_phone_for_change", C2097608Jq.LJI(new Pair(InputCodeFragment.InputCodeActions.VerifyPhoneCodeActionV1.class.getSimpleName(), "enter_phone_for_bind"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction.class.getSimpleName(), "verify_email_before_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction.class.getSimpleName(), "verify_password_for_change"))), new Pair("verify_email_before_change", C2097608Jq.LJI(new Pair(InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction.class.getSimpleName(), "enter_phone_for_bind"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction.class.getSimpleName(), "verify_phone_for_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickPasswordAction.class.getSimpleName(), "verify_password_for_change"))), new Pair("verify_password_for_change", C2097608Jq.LJI(new Pair(VerifyPasswordFragment.VerifyPasswordActions.ClickNextAction.class.getSimpleName(), "enter_phone_for_bind"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickEmailAction.class.getSimpleName(), "verify_email_before_change"), new Pair(BaseAccountBindingsFlowFragment.BindingActions.ClickMobileAction.class.getSimpleName(), "verify_phone_for_change"))), new Pair("enter_phone_for_bind", C2097608Jq.LJI(new Pair(InputPhoneFragment.InputPhoneActions.ClickSendCodeAction.class.getSimpleName(), "verify_phone_for_bind"))));
                                }

                                @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                                public String getFirstStepId() {
                                    int i2 = C858240Xle.LIZ[this.LL.ordinal()];
                                    if (i2 == 1) {
                                        return "verify_phone_for_change";
                                    }
                                    if (i2 == 2) {
                                        return "verify_email_before_change";
                                    }
                                    if (i2 == 3) {
                                        return "verify_password_for_change";
                                    }
                                    throw new C1954807lC();
                                }

                                {
                                    this.LL = enumC854380XfQ;
                                }
                            };
                            C786410Ut5.LJJIIJZLJL(bundle, INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intentPutExtra));
                            String str3 = CommonFlowActivity._pnsPageId;
                            C851380Xaa.LIZIZ(activity, abstractC854370XfP, EnumC852660Xce.MODIFY_PHONE, bundle, null);
                            return;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                } catch (NoSuchElementException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown type of value: ");
                    sbLIZ.append(i);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intentPutExtra);
        }
        intentPutExtra.putExtras(bundle);
        if (!z) {
        }
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intentPutExtra);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle2.getString("page") == null) {
            C786410Ut5.LJJJI("page", "add_email", bundle2);
        }
        C786410Ut5.LJJJI("enter_from", str, bundle2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_bind_email");
        C786410Ut5.LJJJI("enter_from_item", C2188811AlT.LIZIZ(sbLIZ), bundle2);
        if (str2 != null) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        if ("security_alert".equals(str)) {
            bundle2.putInt("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_SECURITY_ALERT_TOAST.getValue());
            bundle2.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_SECURITY_ALERT_TOAST.getValue());
        }
        if (z && C257230A6f.LIZIZ) {
            AbstractC854370XfP abstractC854370XfP = new AbstractC854370XfP() { // from class: X.0Xeg
                public static final int $stable = 0;

                @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                public String getFirstStepId() {
                    return "input_email_for_bind";
                }

                @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                public HashMap<String, HashMap<String, String>> getFlowGraph() {
                    return C2097608Jq.LJI(new Pair("input_email_for_bind", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "verify_email_code_for_bind"), new Pair(CommonInputEmailFragment.InputEmailActions.ClickChangeToPhoneAction.class.getSimpleName(), "enter_phone_for_bind"))), new Pair("enter_phone_for_bind", C2097608Jq.LJI(new Pair(InputPhoneFragment.InputPhoneActions.ClickSendCodeAction.class.getSimpleName(), "verify_phone_for_bind"), new Pair(InputPhoneFragment.InputPhoneActions.ClickChangeToEmailAction.class.getSimpleName(), "input_email_for_bind"))), new Pair("verify_email_code_for_bind", C2097608Jq.LJI(new Pair(InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction.class.getSimpleName(), "email_consent"))));
                }
            };
            String str3 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZIZ(activity, abstractC854370XfP, EnumC852660Xce.BIND_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr));
        } else {
            String str4 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZ(activity, EnumC852910Xd3.INPUT_EMAIL_BIND, EnumC852660Xce.BIND_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        super.bindMobile(activity, str, str2, bundle2, z, postUserInfoChangeEventAfterSuccess(c0xtr));
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        int i = bundle2.getInt("current_scene", -1);
        if (i != -1) {
            bundle2.putInt("last_scene", i);
            bundle2.remove("current_scene");
            bundle2.remove("next_page");
            bundle2.remove("current_page");
        }
        String str3 = BindOrModifyPhoneActivity._pnsPageId;
        Intent intent = new Intent(activity, (Class<?>) BindOrModifyPhoneActivity.class);
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.BIND_PHONE;
        Intent intentPutExtra = intent.putExtra("current_scene", enumC852660Xce.getValue()).putExtra("next_page", EnumC852910Xd3.INPUT_PHONE_BIND.getValue()).putExtra("enter_method", "first_bind_phone_click");
        intentPutExtra.putExtras(bundle2);
        if (!TextUtils.isEmpty(str)) {
            intentPutExtra.putExtra("ENTER_REASON", str);
            intentPutExtra.putExtra("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            intentPutExtra.putExtra("enter_method", str2);
        }
        if ("security_alert".equals(str)) {
            intentPutExtra.putExtra("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_SECURITY_ALERT_TOAST.getValue());
            intentPutExtra.putExtra("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_SECURITY_ALERT_TOAST.getValue());
        }
        if (INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intentPutExtra, "page") == null) {
            intentPutExtra.putExtra("page", "add_phone");
        }
        if (z && C257230A6f.LIZIZ) {
            AbstractC854370XfP abstractC854370XfP = new AbstractC854370XfP() { // from class: X.0Xeh
                public static final int $stable = 0;

                @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                public String getFirstStepId() {
                    return "enter_phone_for_bind";
                }

                @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                public HashMap<String, HashMap<String, String>> getFlowGraph() {
                    return C2097608Jq.LJI(new Pair("enter_phone_for_bind", C2097608Jq.LJI(new Pair(InputPhoneFragment.InputPhoneActions.ClickSendCodeAction.class.getSimpleName(), "verify_phone_for_bind"), new Pair(InputPhoneFragment.InputPhoneActions.ClickChangeToEmailAction.class.getSimpleName(), "input_email_for_bind"))), new Pair("input_email_for_bind", C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "verify_email_code_for_bind"), new Pair(CommonInputEmailFragment.InputEmailActions.ClickChangeToPhoneAction.class.getSimpleName(), "enter_phone_for_bind"))), new Pair("verify_email_code_for_bind", C2097608Jq.LJI(new Pair(InputCodeFragmentV2.VerifyCodeActions.VerifyEmailCodeAction.class.getSimpleName(), "email_consent"))));
                }
            };
            C786410Ut5.LJJIIJZLJL(bundle2, INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intentPutExtra));
            bundle2.putInt("action_type", 7);
            String str4 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZIZ(activity, abstractC854370XfP, enumC852660Xce, bundle2, c0xtr);
            return;
        }
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_BindService_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, intentPutExtra);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("use_phone", true);
        bundle.putBoolean("use_email", true);
        bindMobile(activity, str, str2, bundle, z, c0xtr);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindOrVerifyEmailWithCodeAndLogin(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr) {
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.BIND_EMAIL;
        if (!num.equals(Integer.valueOf(enumC852660Xce.getValue()))) {
            enumC852660Xce = EnumC852660Xce.VERIFY;
        }
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.EMAIL_OTP_LOGIN, enumC852660Xce, bundle, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void bindOrVerifyPhoneWithCodeAndLogin(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr) {
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.BIND_PHONE;
        if (!num.equals(Integer.valueOf(enumC852660Xce.getValue()))) {
            enumC852660Xce = EnumC852660Xce.VERIFY;
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle);
        }
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.VERIFY_OR_BIND_PHONE, enumC852660Xce, bundle, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void changeUnverifiedEmail(Activity activity, String str, String str2, Bundle bundle, boolean z, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (bundle2.getString("page") == null) {
            C786410Ut5.LJJJI("page", "change_email", bundle2);
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle2);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_change_unverified_email");
        C786410Ut5.LJJJI("enter_from_item", C2188811AlT.LIZIZ(sbLIZ), bundle2);
        if (z && C257220A6e.LIZIZ) {
            AbstractC854370XfP abstractC854370XfP = new AbstractC854370XfP() { // from class: X.0Xei
                public static final int $stable = 0;

                @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                public String getFirstStepId() {
                    return "input_email_for_change";
                }

                @Override // X.AbstractC854370XfP, X.InterfaceC1237490iJ9
                public HashMap<String, HashMap<String, String>> getFlowGraph() {
                    return C2097608Jq.LJI(new Pair(getFirstStepId(), C2097608Jq.LJI(new Pair(CommonInputEmailFragment.InputEmailActions.ClickSendCodeAction.class.getSimpleName(), "verify_email_code_for_change"), new Pair(CommonInputEmailFragment.InputEmailActions.VerifySameEmailAction.class.getSimpleName(), "verify_email_before_change"))));
                }
            };
            String str3 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZIZ(activity, abstractC854370XfP, EnumC852660Xce.CHANGE_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr));
        } else {
            String str4 = CommonFlowActivity._pnsPageId;
            C851380Xaa.LIZ(activity, EnumC852910Xd3.INPUT_EMAIL_CHANGE, EnumC852660Xce.CHANGE_EMAIL, bundle2, postUserInfoChangeEventAfterSuccess(c0xtr), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void unbindEmailV2(Activity activity, boolean z, ArrayList<String> arrayList, String str, boolean z2, Bundle bundle) {
        super.unbindEmailV2(activity, z, arrayList, str, z2, bundle);
        UnbindPhoneOrEmailActivity.LLLZIL(activity, z, arrayList, str, Boolean.valueOf(z2), bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService, com.ss.android.ugc.aweme.IBindService
    public void verifyEmailMagicLinkOnly(Activity activity, String str, String str2, Integer num, Bundle bundle, C0XTR c0xtr) {
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.BIND_EMAIL;
        if (!num.equals(Integer.valueOf(enumC852660Xce.getValue()))) {
            enumC852660Xce = EnumC852660Xce.CHANGE_EMAIL;
            if (!num.equals(Integer.valueOf(enumC852660Xce.getValue()))) {
                enumC852660Xce = EnumC852660Xce.VERIFY;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle);
        }
        String str3 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.EMAIL_LINK_LOGIN_OR_SIGNUP, enumC852660Xce, bundle, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyEmailWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        super.verifyEmailForTicket(activity, str, str2, bundle2, c0xtr);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle2);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIILLIIL(bundle2, str3);
        String str4 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.VERIFY_EMAIL_FOR_TICKET, EnumC852660Xce.VERIFY, bundle2, c0xtr, null);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseBindService
    public void verifyMobileWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, C0XTR c0xtr) {
        Bundle bundle2 = bundle;
        super.verifyMobileForTicket(activity, str, str2, bundle2, c0xtr);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle2);
        }
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("enter_method", str2, bundle2);
        }
        C852810Xct.LIZ.getClass();
        C852810Xct.LJIJI(bundle2, str3);
        String str4 = CommonFlowActivity._pnsPageId;
        C851380Xaa.LIZ(activity, EnumC852910Xd3.VERIFY_PHONE_FOR_TICKET, EnumC852660Xce.VERIFY, bundle2, c0xtr, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$bindMobileOrEmailAndSetPwd$0(final C0XTR c0xtr, final Activity activity, final String str, final String str2, final int i, final int i2, final Object obj) {
        if (i2 != 1) {
            if (c0xtr != null) {
                c0xtr.onResult(i, i2, obj);
                return;
            }
            return;
        }
        if (i != 7) {
            final String str3 = "email";
            if (0 == 0) {
                C0XQ5.LIZIZ.LJIIJ();
                AbstractC848400XPy.LJJIJIIJI(new C0T3I() { // from class: com.ss.android.ugc.aweme.services.BindService.1
                    @Override // X.C0T3I
                    public void onUpdateFailed(String str4) {
                        C0XQ5.LIZIZ.LJIIJ();
                        if (!AbstractC848400XPy.LJJIJIIJIL()) {
                            BindService.this.setPassword(activity, str3, str, str2, c0xtr);
                            return;
                        }
                        C0XTR c0xtr2 = c0xtr;
                        if (c0xtr2 == null) {
                            return;
                        }
                        c0xtr2.onResult(i, i2, obj);
                    }

                    @Override // X.C0T3I
                    public void onUpdateSuccess(boolean z) {
                        if (!z) {
                            BindService.this.setPassword(activity, str3, str, str2, c0xtr);
                            return;
                        }
                        C0XTR c0xtr2 = c0xtr;
                        if (c0xtr2 == null) {
                            return;
                        }
                        c0xtr2.onResult(i, i2, obj);
                    }
                });
                return;
            }
        }
        if (c0xtr == null) {
            return;
        }
        c0xtr.onResult(i, i2, obj);
    }
}
