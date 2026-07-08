package com.ss.android.ugc.profile.business.profile.avatar;

import X.C03IT;
import X.C1216270hkv;
import X.C1248940ibc;
import X.C1250220idg;
import X.C1250230idh;
import X.C1250280idm;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1558420qem;
import X.C1558520qew;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C427870Gq9;
import X.C786410Ut5;
import X.EnumC1249130ibv;
import X.InterfaceC658750Psf;
import X.InterfaceC665370Q7z;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.profile.business.ur.platform.NickNameData;
import com.ss.android.ugc.profile.platform.base.data.Avatar;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileNavbarAvatarProtocol extends NavbarPlatformProtocol<NickNameData> {
    public C427870Gq9 LLJLLIL;
    public List<String> LLJLLL;
    public final C1250230idh LLJLL = new C1250230idh();
    public final C1250220idg LLJZ = new InterfaceC658750Psf() { // from class: X.0idg
        @Override // X.InterfaceC658750Psf
        public final /* synthetic */ void Ck(JSONObject jSONObject) {
        }

        @Override // X.InterfaceC658750Psf
        public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onImageLoaded isSucceed: ");
            sbLIZ.append(z);
            sbLIZ.append(", requestId: ");
            sbLIZ.append(str);
            C1720106oR.LJI("ProfileNavbarAvatarProtocol", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "nav_bar_center_avatar";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJJLIIIJILLIZJL() {
        C427870Gq9 c427870Gq9;
        UserProfileInfo userProfileInfo;
        Avatar avatar;
        UrlModel avatarMedium;
        ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
        List<String> urlList = (profileCommonInfoLJIILIIL == null || (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) == null || (avatar = userProfileInfo.getAvatar()) == null || (avatarMedium = avatar.getAvatarMedium()) == null) ? null : avatarMedium.getUrlList();
        List<String> list = this.LLJLLL;
        if (!(list == null || list.isEmpty())) {
            List<String> list2 = this.LLJLLL;
            if (list2 != null) {
                for (String str : list2) {
                    if (urlList == null || urlList.contains(str)) {
                    }
                }
            }
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileNavbarAvatarProtocol", "updateComponentUIAndData avatarUrl not changed");
            return true;
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileNavbarAvatarProtocol", "lastAvatarUrlList is empty");
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateComponentUIAndData avatarUrl ");
        sbLIZ.append(urlList);
        C1720106oR.LJI("ProfileNavbarAvatarProtocol", C2188811AlT.LIZIZ(sbLIZ));
        if (urlList != null && (c427870Gq9 = this.LLJLLIL) != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlList));
            c1331670kl3LJIIJ.LJJ(c427870Gq9);
            c1331670kl3LJIIJ.LJJJIL = this.LLJZ;
            c1331670kl3LJIIJ.LJIIJJI();
        }
        return true;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol
    public final boolean LJJLL(C1250280idm c1250280idm) {
        List<String> urlList;
        String value;
        EnumC1249130ibv enumC1249130ibv;
        UserProfileInfo userProfileInfo;
        Avatar avatar;
        UrlModel avatarMedium;
        Context context = getContext();
        if (context != null) {
            ProfileCommonInfo profileCommonInfoLJIILIIL = LJIILIIL();
            if (profileCommonInfoLJIILIIL != null && (userProfileInfo = profileCommonInfoLJIILIIL.getUserProfileInfo()) != null && (avatar = userProfileInfo.getAvatar()) != null && (avatarMedium = avatar.getAvatarMedium()) != null) {
                urlList = avatarMedium.getUrlList();
            } else {
                urlList = null;
            }
            this.LLJLLL = urlList;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initNavBarAction avatarUrl: ");
            sbLIZ.append(this.LLJLLL);
            C1720106oR.LJI("ProfileNavbarAvatarProtocol", C2188811AlT.LIZIZ(sbLIZ));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C1216270hkv.LIZIZ(32), C1216270hkv.LIZIZ(32));
            C427870Gq9 c427870Gq9 = new C427870Gq9(context);
            layoutParams.gravity = 17;
            C786410Ut5.F6(c427870Gq9, layoutParams);
            List<String> list = this.LLJLLL;
            if (list != null) {
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(list));
                c1331670kl3LJIIJ.LJJ(c427870Gq9);
                c1331670kl3LJIIJ.LJJJIL = this.LLJZ;
                c1331670kl3LJIIJ.LJIIJJI();
            }
            C1250230idh c1250230idh = this.LLJLL;
            c1250230idh.LIZJ = c427870Gq9;
            c1250230idh.LIZIZ = "nav_bar_center_avatar";
            C786410Ut5.P8(c427870Gq9, new ACListenerS154S0100000_19(this, 148));
            this.LLJLLIL = c427870Gq9;
            InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(this);
            C1248940ibc c1248940ibc = this.LLJJJJ;
            if (c1248940ibc == null || (enumC1249130ibv = c1248940ibc.LL) == null || (value = enumC1249130ibv.getValue()) == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.nl1(this.LLJLL);
                return true;
            }
            return true;
        }
        return true;
    }
}
