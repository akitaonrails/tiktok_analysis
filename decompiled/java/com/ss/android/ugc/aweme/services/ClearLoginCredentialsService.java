package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C0XGR;
import X.C20684815ws;
import X.C452501pT;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;
import com.ss.android.ugc.aweme.settings.ClearLoginCredentialsSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class ClearLoginCredentialsService {
    public static final ClearLoginCredentialsService INSTANCE = new ClearLoginCredentialsService();
    public static final C01GW clearLoginConfig$delegate = C452501pT.LIZIZ(new ClearLoginCredentialsService$clearLoginConfig$2());
    public static final int $stable = 8;

    public final ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig getClearLoginConfig() {
        return (ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig) clearLoginConfig$delegate.getValue();
    }

    private final boolean isConfigLoginTypeHL() {
        return getClearLoginConfig().loginType.contains(ClearCredLoginType.HL.getValue());
    }

    private final boolean isConfigLoginTypeOcl() {
        return getClearLoginConfig().loginType.contains(ClearCredLoginType.OCL.getValue());
    }

    private final boolean shouldTryBlockingCredentialsSave() {
        return isValidConfig() && getClearLoginConfig().alwaysClear;
    }

    private final boolean shouldTryClearCredentials() {
        return isValidConfig();
    }

    public final boolean isValidConfig() {
        return !Intrinsics.LJFF(getClearLoginConfig(), new ClearLoginCredentialsSettings.ClearLoginCredentialsDefaultConfig(null, null, 0, false, 15, null));
    }

    public final boolean shouldTryBlockHLCredentialsSave() {
        return shouldTryBlockingCredentialsSave() && isConfigLoginTypeHL();
    }

    public final boolean shouldTryBlockOclCredentialsSave() {
        return shouldTryBlockingCredentialsSave() && isConfigLoginTypeHL();
    }

    public final boolean shouldTryClearHLCredentials() {
        return shouldTryClearCredentials() && isConfigLoginTypeHL();
    }

    public final boolean shouldTryClearOclCredentials() {
        return shouldTryClearCredentials() && isConfigLoginTypeOcl();
    }

    public final boolean keepLoginMethodByPlatform(BaseLoginMethod baseLoginMethod) {
        String platform;
        TPLoginMethod tPLoginMethod;
        if (getClearLoginConfig().platforms.isEmpty()) {
            return false;
        }
        LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
        LoginMethodName loginMethodName2 = LoginMethodName.THIRD_PARTY;
        if (loginMethodName == loginMethodName2 || getClearLoginConfig().platforms.contains(baseLoginMethod.getLoginMethodName().name())) {
            if (baseLoginMethod.getLoginMethodName() != loginMethodName2) {
                return false;
            }
            List<String> list = getClearLoginConfig().platforms;
            if (!(baseLoginMethod instanceof TPLoginMethod) || (tPLoginMethod = (TPLoginMethod) baseLoginMethod) == null || (platform = tPLoginMethod.getPlatform()) == null) {
                platform = "";
            }
            if (list.contains(platform)) {
                return false;
            }
        }
        return true;
    }

    public final List<BaseLoginMethod> getUpdatedLoginMethodList(List<? extends BaseLoginMethod> list, ClearCredScene clearCredScene) {
        ArrayList arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod : list) {
            if (INSTANCE.keepLoginMethodByPlatform(baseLoginMethod)) {
                arrayList.add(baseLoginMethod);
            }
        }
        triggerClearCredET(clearCredScene, list.size() - arrayList.size());
        return arrayList;
    }

    public final void triggerClearCredET(ClearCredScene clearCredScene, int i) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("action", clearCredScene.getAction().getValue());
        c0xgr.LIZLLL("login_type", clearCredScene.getLoginType().getValue());
        c0xgr.LIZ(getClearLoginConfig().configVersion, "config_version");
        c0xgr.LIZ(i, "acct_removed");
        C20684815ws.LJIILLIIL("clear_login_creds", c0xgr.LIZ);
    }
}
