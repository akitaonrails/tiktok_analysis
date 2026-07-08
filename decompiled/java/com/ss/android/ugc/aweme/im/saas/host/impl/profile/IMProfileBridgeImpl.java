package com.ss.android.ugc.aweme.im.saas.host.impl.profile;

import X.C19EG;
import X.C879350Yeb;
import X.EnumC1261800iwM;
import X.EnumC1261810iwN;
import X.EnumC1261820iwO;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMProfileBridge;
import com.ss.android.ugc.aweme.profile.util.UpdateProfilePopupLauncher;

/* JADX INFO: loaded from: classes20.dex */
public final class IMProfileBridgeImpl implements IMProfileBridge {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.profile.IMProfileBridge
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.profile.IMProfileBridge
    public final boolean LIZIZ(C19EG c19eg) {
        UpdateProfilePopupLauncher updateProfilePopupLauncher = (UpdateProfilePopupLauncher) PluggableExtentionKt.pluggableSpiForReal(UpdateProfilePopupLauncher.class);
        if (updateProfilePopupLauncher != null && updateProfilePopupLauncher.LIZJ(c19eg, EnumC1261800iwM.NOTIFICATION_PAGE, EnumC1261820iwO.INBOX_FIRST_PAGE, EnumC1261810iwN.DM)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.profile.IMProfileBridge
    public final void LIZJ(String str, String str2, String str3) {
        C879350Yeb.LIZ.getClass();
        C879350Yeb.LIZ(str, str2, str3);
    }
}
