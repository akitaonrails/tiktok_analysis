package com.ss.android.ugc.aweme.services;

import X.C04TD;
import X.C0CQT;
import X.C0XQ1;
import X.C0XQ5;
import X.C2188811AlT;
import X.C2501509rB;
import X.C785410UrT;
import X.C836440Wra;
import X.C848230XPh;
import X.C848930XRz;
import X.DialogC1232330iAp;
import X.DialogC848780XRk;
import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ug.IUgCommonService;

/* JADX INFO: loaded from: classes14.dex */
public class AccountHelperService implements IAccountHelperService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public MainActivityLifecycle getHpasDialog() {
        return new MainActivityLifecycle() { // from class: com.ss.android.ugc.aweme.services.AccountHelperService.getHpasDialog.1
            @Override // com.ss.android.ugc.aweme.services.MainActivityLifecycle
            public void onDestroy() {
                DialogC848780XRk dialogC848780XRk = DialogC848780XRk.LLJI;
                if (dialogC848780XRk != null) {
                    dialogC848780XRk.dismiss();
                    C785410UrT.LIZ(dialogC848780XRk);
                }
                DialogC848780XRk.LLJI = null;
            }

            @Override // com.ss.android.ugc.aweme.services.MainActivityLifecycle
            public void onResume() {
                DialogC848780XRk dialogC848780XRk;
                DialogC848780XRk dialogC848780XRk2 = DialogC848780XRk.LLJI;
                if (dialogC848780XRk2 == null || !dialogC848780XRk2.LLIZLLLIL || C0XQ5.LIZIZ.LJFF().getTwoStepVerificationStatusFromLocal() != 1 || (dialogC848780XRk = DialogC848780XRk.LLJI) == null) {
                    return;
                }
                dialogC848780XRk.dismiss();
                C785410UrT.LIZ(dialogC848780XRk);
            }

            @Override // com.ss.android.ugc.aweme.services.MainActivityLifecycle
            public void onCreate(Activity activity) {
                try {
                    if (C848230XPh.LL.LJI()) {
                        int twoStepVerificationStatusFromLocal = C0XQ5.LIZIZ.LJFF().getTwoStepVerificationStatusFromLocal();
                        if (twoStepVerificationStatusFromLocal != -1) {
                            if (twoStepVerificationStatusFromLocal == 0) {
                                C0XQ1.LIZ(activity);
                                return;
                            }
                            return;
                        }
                        C0XQ5.LIZIZ.LJFF().getTwoStepVerificationStatusFromNetwork().LIZLLL(new C2501509rB(activity, 22));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public String selfUserApi() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append(((IProfileService) ServiceManager.get().getService(IProfileService.class)).getUserPath(true));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public String userPermissionApi() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append(((IProfileService) ServiceManager.get().getService(IProfileService.class)).getUserPermissionsPath());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static IAccountHelperService createIAccountHelperServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IAccountHelperService.class, z);
        if (objLIZ != null) {
            return (IAccountHelperService) objLIZ;
        }
        if (C04TD.w4 == null) {
            synchronized (IAccountHelperService.class) {
                if (C04TD.w4 == null) {
                    C04TD.w4 = new AccountHelperService();
                }
            }
        }
        return C04TD.w4;
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void AppsFlyerUtilsTrackLoginSuccess(String str) {
        IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpi$default(IUgCommonService.class, false, false, false, 14, null);
        if (iUgCommonService != null) {
            iUgCommonService.LIZLLL();
            C836440Wra.LJ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void appendCommonParams(StringBuilder sb) {
        AppLog.appendCommonParams(sb, false);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public Dialog getChangeIllegalUsernameDialog(Activity activity, User user) {
        return new DialogC1232330iAp(activity, user);
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void loadWebViewUrl(String str, WebView webView) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            C848930XRz.LIZ(webView, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IAccountHelperService
    public void friendUploadToken(String str, String str2, String str3) {
        IFriendsService iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi$default(IFriendsService.class, false, false, false, 14, null);
        if (iFriendsService != null) {
            iFriendsService.LJJIII(str, str2, str3);
        }
    }
}
