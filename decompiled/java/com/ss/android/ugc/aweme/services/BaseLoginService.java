package com.ss.android.ugc.aweme.services;

import X.C0TNI;
import X.C0XA4;
import X.C0XMV;
import X.C0XNJ;
import X.C0XQ5;
import X.C0XQT;
import X.C0XQU;
import X.C0XTQ;
import X.C0XTR;
import X.C0XTT;
import X.C0XU6;
import X.C0XU7;
import X.C1906580ziK;
import X.C1C7U;
import X.C290680BaM;
import X.C823050WQl;
import X.C847400XMc;
import X.InterfaceC1748950vc5;
import X.InterfaceC849490XUd;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BaseLoginService implements ILoginService, GenericLifecycleObserver {
    public C0XQT mLoginParam;
    public C0XQT mPlatformParam;
    public Map<String, String> displayedLoginScreens = new ConcurrentHashMap();
    public volatile boolean postRegistrationOptionalFlowDisplayed = false;

    private boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ Class<? extends Activity> getPushLoginActivityClass();

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ boolean isEnableMultiAccountLogin();

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ boolean isLoginActivity(Activity activity);

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ boolean isReactivePageShowing();

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ boolean needRedirectToMainAfterLogin();

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ void openCountryListActivity(Activity activity, InterfaceC1748950vc5 interfaceC1748950vc5);

    public abstract /* synthetic */ void openPrivacyPolicy(Activity activity);

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ void showFTCCreateAccountView(Activity activity, boolean z);

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ void switchAccount(SignificantUserInfo significantUserInfo, Bundle bundle, InterfaceC849490XUd interfaceC849490XUd);

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ boolean toRecoverDeletedAccount(String str);

    @Override // com.ss.android.ugc.aweme.ILoginService
    public abstract /* synthetic */ void uploadAccountNum(boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$computeNumOfUidsOnDevice$1() {
        C1C7U.LIZ("BaseLoginService@2a7a.computeNumOfUidsOnDevice$1L");
        Keva repo = KevaImpl.getRepo("uid_recorder", 0);
        String[] stringArray = repo.getStringArray("logged_in_uids", new String[20]);
        int i = repo.getInt("num_of_logged_in_uids", 0);
        try {
            String secUid = C0XQ5.LIZJ().getSecUid();
            if (!TextUtils.isEmpty(secUid) && !containsInArray(stringArray, Math.min(i, 20), secUid)) {
                stringArray[i % 20] = secUid;
                repo.storeStringArray("logged_in_uids", stringArray);
                repo.storeInt("num_of_logged_in_uids", i + 1);
            }
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("BaseLoginService@2a7a.computeNumOfUidsOnDevice$1L");
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public List<C0XTT> getAllSupportedLoginPlatform() {
        return Collections.singletonList(new C0XTT("mobile"));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.displayedLoginScreens.clear();
        this.postRegistrationOptionalFlowDisplayed = false;
        C0XQT c0xqt = this.mLoginParam;
        if (c0xqt != null) {
            ComponentCallbacks2 componentCallbacks2 = c0xqt.LIZ;
            if (componentCallbacks2 instanceof LifecycleOwner) {
                ((LifecycleOwner) componentCallbacks2).getLifecycle().removeObserver(this);
            }
        }
        this.mLoginParam = null;
        this.mPlatformParam = null;
    }

    private void computeNumOfUidsOnDevice() {
        C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.0XTO
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$computeNumOfUidsOnDevice$1();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public C0XNJ getLogoutProcess() {
        if (C290680BaM.LIZ()) {
            return new C0XNJ() { // from class: X.0XTS
            };
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public boolean isLoginPanelDisplayed() {
        isDebug();
        return !this.displayedLoginScreens.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public String getLoginMobEnterMethod() {
        return C0XTQ.LIZ;
    }

    public C0XQT getLoginParam() {
        return this.mLoginParam;
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public boolean isPostRegistrationOptionalFlowDisplayed() {
        return this.postRegistrationOptionalFlowDisplayed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showLoginAndRegisterView$0(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void setPostRegistrationOptionalFlowDisplayed(boolean z) {
        this.postRegistrationOptionalFlowDisplayed = z;
        isDebug();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    @Override // com.ss.android.ugc.aweme.ILoginService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showLoginAndRegisterView(X.C0XQT r5) {
        /*
            r4 = this;
            java.lang.String r2 = ""
            r1 = 10
            r0 = 6
            r4.notifyProgress(r1, r0, r2)
            java.lang.Class<com.ss.android.ugc.aweme.deeplink.IDeepLinkService> r0 = com.ss.android.ugc.aweme.deeplink.IDeepLinkService.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi(r0)
            com.ss.android.ugc.aweme.deeplink.IDeepLinkService r0 = (com.ss.android.ugc.aweme.deeplink.IDeepLinkService) r0
            if (r0 == 0) goto L31
            boolean r0 = r0.LJJJLL()
            if (r0 == 0) goto L31
            X.0XQT r1 = r4.mLoginParam
            if (r1 == 0) goto L31
            java.lang.String r0 = com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity._pnsPageId
            java.lang.String r0 = r1.LIZIZ
            boolean r0 = X.C0XTU.LIZ(r0)
            if (r0 == 0) goto L31
            java.lang.String r1 = "cold_launch"
            java.lang.String r0 = r5.LIZIZ
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L31
            return
        L31:
            r4.mLoginParam = r5
            android.app.Activity r1 = r5.LIZ
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L79
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L85
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 == 0) goto L85
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r1 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            android.app.Activity r0 = r5.LIZ
            r1.getClass()
            boolean r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJJL(r0)
            if (r0 == 0) goto L7a
            boolean r0 = X.C07H4.LIZ()
            if (r0 == 0) goto L7a
            android.app.Activity r0 = r5.LIZ
            X.19EG r0 = (X.C19EG) r0
            androidx.lifecycle.LifecycleOwner r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJ(r0)
            if (r0 == 0) goto L85
            androidx.lifecycle.Lifecycle r3 = r0.getLifecycle()
            if (r3 == 0) goto L85
        L68:
            X.01GW r0 = X.C0AHY.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8e
            r3.addObserver(r4)
        L79:
            return
        L7a:
            android.app.Activity r0 = r5.LIZ
            X.19EG r0 = (X.C19EG) r0
            androidx.lifecycle.Lifecycle r3 = com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt.findTopSAFExpLifecycle(r0)
            if (r3 == 0) goto L85
            goto L68
        L85:
            android.app.Activity r0 = r5.LIZ
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            androidx.lifecycle.Lifecycle r3 = r0.getLifecycle()
            goto L68
        L8e:
            android.app.Activity r2 = r5.LIZ
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            X.0QpW r1 = X.EnumC682280QpW.ADD_OBSERVER
            X.0XTP r0 = new X.0XTP
            r0.<init>()
            X.C1563370qml.LIZ(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.BaseLoginService.showLoginAndRegisterView(X.0XQT):void");
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void showLoginView(C0XQT c0xqt) {
        notifyProgress(10, 6, "");
        this.mLoginParam = c0xqt;
        C0XTQ.LIZ = c0xqt.LIZJ.getString("enter_method", "");
        C0XTQ.LIZIZ = c0xqt.LIZJ.getString("enter_from", "");
        C0XTQ.LIZJ = c0xqt.LIZJ.getString("login_panel_type", "");
        ComponentCallbacks2 componentCallbacks2 = c0xqt.LIZ;
        if (componentCallbacks2 instanceof LifecycleOwner) {
            ((LifecycleOwner) componentCallbacks2).getLifecycle().addObserver(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void loginByPlatform(C0XQT c0xqt, C0XTT c0xtt) {
        this.mPlatformParam = c0xqt;
        C0XTQ.LIZ = c0xqt.LIZJ.getString("enter_method", "");
        C0XTQ.LIZIZ = c0xqt.LIZJ.getString("enter_from", "");
        C0XTQ.LIZJ = c0xqt.LIZJ.getString("login_panel_type", "");
        ComponentCallbacks2 componentCallbacks2 = c0xqt.LIZ;
        if (componentCallbacks2 instanceof LifecycleOwner) {
            ((LifecycleOwner) componentCallbacks2).getLifecycle().addObserver(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void loginPanelDisplayedUpdate(boolean z, String str) {
        if (z) {
            this.displayedLoginScreens.put(str, str);
        } else {
            this.displayedLoginScreens.remove(str);
        }
        isDebug();
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void logout(String str, String str2) {
        logout(str, str2, null);
    }

    private boolean containsInArray(String[] strArr, int i, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            if (TextUtils.equals(strArr[i2], str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void logout(String str, String str2, C0XU7 c0xu7) {
        logout(str, str2, null, c0xu7);
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void notifyProgress(int i, int i2, String str) {
        C0XQU c0xqu;
        C0XQT c0xqt = this.mLoginParam;
        if (c0xqt != null && (c0xqu = c0xqt.LJFF) != null) {
            c0xqu.LIZ(i, i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void returnResult(int i, int i2, Object obj) {
        C0XTR c0xtr;
        this.displayedLoginScreens.clear();
        C0XQT c0xqt = this.mLoginParam;
        if (c0xqt != null) {
            if (i == 19) {
                C0TNI c0tni = c0xqt.LJ;
                if (c0tni != null) {
                    c0tni.LIZ(i, i2);
                } else {
                    return;
                }
            }
            C0XTR c0xtr2 = this.mLoginParam.LIZLLL;
            if (c0xtr2 != null) {
                c0xtr2.onResult(i, i2, obj);
                if (this.mLoginParam.LJ == null) {
                    this.mLoginParam = null;
                }
            }
        }
        C0XQT c0xqt2 = this.mPlatformParam;
        if (c0xqt2 != null && (c0xtr = c0xqt2.LIZLLL) != null) {
            c0xtr.onResult(i, i2, obj);
            this.mPlatformParam = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void logout(final String str, final String str2, final Bundle bundle, final C0XU7 c0xu7) {
        Activity activityLIZIZ;
        this.displayedLoginScreens.clear();
        computeNumOfUidsOnDevice();
        final C0XU6 c0xu6LIZ = C0XU6.LIZ();
        c0xu6LIZ.getClass();
        boolean zLJI = MethodIDManager.LJI(202311);
        if (TextUtils.equals("user_logout", str2)) {
            IProtectionService iProtectionServiceLJIL = ComplianceServiceProvider.LJIL();
            if (C1906580ziK.LIZIZ() != null) {
                activityLIZIZ = C1906580ziK.LIZIZ().LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            iProtectionServiceLJIL.LJJJ(activityLIZIZ, new Runnable() { // from class: X.0XOI
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LogoutManager@da8.logout$1");
                    try {
                        c0xu6LIZ.LIZJ(str, str2, bundle, c0xu7);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LogoutManager@da8.logout$1");
                }
            }, "logout");
        } else {
            c0xu6LIZ.LIZJ(str, str2, bundle, c0xu7);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void logoutWithLoadingIndicator(String str, String str2, Bundle bundle, C0XU7 c0xu7) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("should_show_loading_dialog", true);
        logout(str, str2, bundle, c0xu7);
    }

    @Override // com.ss.android.ugc.aweme.ILoginService
    public void updateTokenForSessionExpired(String str, String str2, String str3, String str4, C0XA4 c0xa4) {
        if (C847400XMc.LIZ) {
            C0XMV.LLJJJIL.LJIIJ(false, "session_expired", str, str2, str3, str4, c0xa4);
        }
    }
}
