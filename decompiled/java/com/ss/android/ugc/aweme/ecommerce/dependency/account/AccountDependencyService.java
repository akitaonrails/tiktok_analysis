package com.ss.android.ugc.aweme.ecommerce.dependency.account;

import X.C034S;
import X.C04TD;
import X.C0CQT;
import X.C0XMV;
import X.C0XQ7;
import X.C0XQB;
import X.C0XQS;
import X.C0XQU;
import X.C1768606wG;
import X.C2188811AlT;
import X.C847400XMc;
import X.InterfaceC586170Myt;
import android.app.Activity;
import android.content.Context;
import com.ss.android.account.token.TTTokenUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.TTSeller;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountDependencyService implements IAccountDependencyService {
    public final IAccountService accountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
    public final List<C0XQB> loginOrLogoutListeners = new CopyOnWriteArrayList();

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getDeviceVersionMinor() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getCurSecUserId() {
        AccountUserService accountUserServiceLJIIJ;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) {
            return null;
        }
        return accountUserServiceLJIIJ.getCurSecUserId();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getStoreRegionUpperCase() {
        return this.accountService.getStoreRegionUpperCase();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public void updateToken() {
        if (C847400XMc.LIZ) {
            C0XMV.LLJJJIL.LJIIIZ(false);
        }
    }

    public AccountDependencyService() {
        if (C034S.LIZ()) {
            monitorLoginOrLogout();
        }
    }

    private final void monitorLoginOrLogout() {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0XQA
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                int i3 = 1;
                if (i != 1) {
                    i3 = 2;
                    if (i != 2) {
                        i3 = 3;
                        if (i != 3) {
                            i3 = 4;
                        }
                    }
                }
                this.LL.notifyAccountChangeListener(i3, z, 0, user);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getDeviceId() {
        return DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getSecUid() {
        String secUid = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getSecUid();
        return secUid == null ? "" : secUid;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public Integer getSellerType() {
        SpecialAccount specialAccount;
        TTSeller seller;
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (currentUser == null || (specialAccount = currentUser.specialAccount) == null || (seller = specialAccount.getSeller()) == null) {
            return null;
        }
        return Integer.valueOf(seller.getType());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getUniqueId() {
        String uniqueId = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUniqueId();
        return uniqueId == null ? "" : uniqueId;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getUserId() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        return currentUserID == null ? "" : currentUserID;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public boolean isLogin() {
        return ((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin();
    }

    public void initService() {
        monitorLoginOrLogout();
    }

    public static IAccountDependencyService createIAccountDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IAccountDependencyService.class, z);
        if (objLIZ != null) {
            return (IAccountDependencyService) objLIZ;
        }
        if (C04TD.LLZLL == null) {
            synchronized (IAccountDependencyService.class) {
                if (C04TD.LLZLL == null) {
                    C04TD.LLZLL = new AccountDependencyService();
                }
            }
        }
        return C04TD.LLZLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public synchronized void addLoginOrLogoutListener(C0XQB c0xqb) {
        if (!this.loginOrLogoutListeners.contains(c0xqb)) {
            this.loginOrLogoutListeners.add(c0xqb);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getCsrfToken(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CQT.LIZJ);
        sbLIZ.append(str);
        return TTTokenUtils.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public String getDeviceChannel(Context context) {
        return DeviceRegisterManager.getChannel(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public synchronized void removeLoginOrLogoutListener(C0XQB c0xqb) {
        if (this.loginOrLogoutListeners.contains(c0xqb)) {
            this.loginOrLogoutListeners.remove(c0xqb);
        }
    }

    public final synchronized void notifyAccountChangeListener(int i, boolean z, int i2, User user) {
        Iterator<C0XQB> it2 = this.loginOrLogoutListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onAccountResult(i, z, i2, user);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService
    public void showLoginAndRegisterView(Activity activity, String str, Function1<? super Boolean, Unit> function1, final Function1<? super Integer, Unit> function12) {
        ILoginService iLoginServiceLIZJ = this.accountService.LIZJ();
        C0XQS c0xqs = new C0XQS();
        c0xqs.LIZ = activity;
        c0xqs.LIZIZ = "ECom_AccountDependencyService";
        if (str == null) {
            str = "ECom_showLoginAndRegisterView";
        }
        c0xqs.LIZJ = str;
        c0xqs.LJ = new C1768606wG(function1, 1);
        c0xqs.LJFF = new C0XQU() { // from class: X.04fb
            @Override // X.C0XQU
            public final void LIZ(int i, int i2) {
                Function1<Integer, Unit> function13;
                if (i2 == 6 && (function13 = function12) != null) {
                    function13.invoke(Integer.valueOf(i2));
                }
            }
        };
        iLoginServiceLIZJ.showLoginAndRegisterView(c0xqs.LIZ());
    }
}
