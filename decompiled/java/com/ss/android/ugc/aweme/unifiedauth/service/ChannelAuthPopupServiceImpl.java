package com.ss.android.ugc.aweme.unifiedauth.service;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C11S5;
import X.C211000rc;
import X.C2188811AlT;
import X.C516201zk;
import X.C824390WVp;
import X.C844470XAv;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.serverpush.ISmsSettingService;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IChannelAuthPopupService;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class ChannelAuthPopupServiceImpl implements IChannelAuthPopupService {
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LIZIZ() {
        User curUser;
        String email;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null) {
            return false;
        }
        AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) iAccountUserServiceLJFF;
        return abstractC848400XPy.isLogin() && (curUser = abstractC848400XPy.getCurUser()) != null && curUser.isHasEmail() && curUser.isEmailVerified() && (email = curUser.getEmail()) != null && email.length() != 0;
    }

    @Override // com.ss.android.ugc.aweme.unifiedauthapi.service.IChannelAuthPopupService
    public final void LIZ(int i, AwS581S0100000_2 awS581S0100000_2) {
        User curUser;
        String bindPhone;
        int i2 = -1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        awS581S0100000_2.invoke(-99);
                        return;
                    }
                    if (!LIZIZ()) {
                        awS581S0100000_2.invoke(-2);
                        return;
                    }
                    IPopupInfoService iPopupInfoService = (IPopupInfoService) ServiceManager.get().getService(IPopupInfoService.class);
                    if (iPopupInfoService == null) {
                        C211000rc.LIZIZ("ChannelAuthPopupService", "IPopupInfoService not found for edm subscribe");
                        awS581S0100000_2.invoke(-99);
                        return;
                    } else {
                        if (iPopupInfoService.LJIIL()) {
                            i2 = 1;
                        }
                        awS581S0100000_2.invoke(Integer.valueOf(i2));
                        return;
                    }
                }
                if (!LIZIZ()) {
                    awS581S0100000_2.invoke(-2);
                    return;
                }
                IPopupInfoService iPopupInfoService2 = (IPopupInfoService) ServiceManager.get().getService(IPopupInfoService.class);
                if (iPopupInfoService2 == null) {
                    C211000rc.LIZIZ("ChannelAuthPopupService", "IPopupInfoService not found for edm consent");
                    awS581S0100000_2.invoke(-99);
                    return;
                } else {
                    if (iPopupInfoService2.LIZIZ()) {
                        i2 = 1;
                    }
                    awS581S0100000_2.invoke(Integer.valueOf(i2));
                    return;
                }
            }
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null && (bindPhone = curUser.getBindPhone()) != null && bindPhone.length() != 0) {
                ISmsSettingService iSmsSettingService = (ISmsSettingService) ServiceManager.get().getService(ISmsSettingService.class);
                if (iSmsSettingService == null) {
                    C211000rc.LIZIZ("ChannelAuthPopupService", "ISmsSettingService not found");
                    awS581S0100000_2.invoke(-99);
                    return;
                }
                try {
                    iSmsSettingService.LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C516201zk(awS581S0100000_2, 161), new C516201zk(awS581S0100000_2, 162));
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("needShowSmsConsent error: ");
                    sbLIZ.append(th.getMessage());
                    C211000rc.LIZIZ("ChannelAuthPopupService", C2188811AlT.LIZIZ(sbLIZ));
                    awS581S0100000_2.invoke(-99);
                    return;
                }
            }
            awS581S0100000_2.invoke(-2);
            return;
        }
        C844470XAv.LIZ.getClass();
        if (!C824390WVp.LIZJ(C844470XAv.LIZ())) {
            i2 = 1;
        }
        awS581S0100000_2.invoke(Integer.valueOf(i2));
    }
}
