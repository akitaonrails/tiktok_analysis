package com.ss.android.ugc.profile.business.cd;

import X.C1248940ibc;
import X.C1558420qem;
import X.C1558520qew;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1249130ibv;
import X.InterfaceC665370Q7z;
import X.RunnableC514801zW;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.drama.ISettingRedDotManager;
import com.ss.android.ugc.profile.business.ug.ProfileNavbarActivityProtocol;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarSettingsAndPrivacyProtocol extends NavbarPlatformProtocol<BizBaseData> {
    public final ISettingRedDotManager LLJLL = (ISettingRedDotManager) PluggableExtentionKt.pluggableSpi$default(ISettingRedDotManager.class, false, false, false, 14, null);

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_end_settings_and_privacy";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final void LIZLLL() {
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, this, 2073);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            awS563S0100000_19.invoke();
        } else {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new RunnableC514801zW(awS563S0100000_19, 149));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        EnumC1249130ibv enumC1249130ibv;
        C1248940ibc c1248940ibc = this.LLJJJJ;
        if (c1248940ibc != null && (enumC1249130ibv = c1248940ibc.LL) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            String value = enumC1249130ibv.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.aP1(this.LLJ, this.LLJJJJJIL, "nav_bar_end_settings_and_privacy");
            }
        }
        ISettingRedDotManager iSettingRedDotManager = this.LLJLL;
        if (iSettingRedDotManager != null) {
            iSettingRedDotManager.LJFF();
        }
        return this instanceof ProfileNavbarActivityProtocol;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final Integer LJJI() {
        return Integer.valueOf(R.raw.icon_gear);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJJZ() {
        return Om();
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        C1248940ibc c1248940ibc;
        String value;
        ISettingRedDotManager iSettingRedDotManager = this.LLJLL;
        if (iSettingRedDotManager != null) {
            iSettingRedDotManager.LJ();
        }
        Fragment fragment = this.LLILZ;
        if ((fragment == null || !fragment.isDetached()) && (c1248940ibc = this.LLJJJJ) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            EnumC1249130ibv enumC1249130ibv = c1248940ibc.LL;
            if (enumC1249130ibv == null || (value = enumC1249130ibv.getValue()) == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.rG1(0, "nav_bar_end_settings_and_privacy", false);
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJJIZ(ProfileComponents profileComponents) {
        ISettingRedDotManager iSettingRedDotManager = this.LLJLL;
        if (iSettingRedDotManager != null) {
            iSettingRedDotManager.LJFF();
            return false;
        }
        return false;
    }
}
