package com.ss.android.ugc.profile.business.ur.aigc;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1221610htX;
import X.C20684815ws;
import X.C2187451AjH;
import X.EnumC1221650htb;
import X.EnumC1221770htn;
import X.EnumC1221910hu1;
import X.EnumC1221920hu2;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCMainArg;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAIGCServiceImpl implements IProfileAIGCService {
    @Override // com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService
    public final void LIZ() {
        C20684815ws.onEventV3("ai_avatar_save_success");
    }

    @Override // com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService
    public final void LIZIZ(Context context, EnumC1221910hu1 enumC1221910hu1, EnumC1221920hu2 enumC1221920hu2, EnumC1221650htb enumC1221650htb) {
        String lowerCase;
        String string;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            int i = C2187451AjH.LIZ;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aivatar/intro/v2");
        String string2 = enumC1221910hu1.toString();
        String string3 = EnumC1221770htn.IDLE.toString();
        Boolean bool = Boolean.TRUE;
        String string4 = enumC1221920hu2.toString();
        Locale locale = Locale.ROOT;
        String lowerCase2 = string4.toLowerCase(locale);
        if (enumC1221650htb != null && (string = enumC1221650htb.toString()) != null) {
            lowerCase = string.toLowerCase(locale);
        } else {
            lowerCase = null;
        }
        smartRouteBuildRoute.withNavArg(new ProfileAIGCMainArg(string2, string3, bool, lowerCase2, lowerCase, null));
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService
    public final void LIZJ(Context context, EnumC1221910hu1 enumC1221910hu1, EnumC1221920hu2 enumC1221920hu2, C1221610htX c1221610htX) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            int i = C2187451AjH.LIZ;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aivatar/avatar");
        smartRouteBuildRoute.withNavArg(new ProfileAIGCMainArg(enumC1221910hu1.toString(), EnumC1221770htn.SUCCESSFUL.toString(), null, enumC1221920hu2.toString().toLowerCase(Locale.ROOT), null, c1221610htX));
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService
    public final void LIZLLL(Context context, EnumC1221910hu1 enumC1221910hu1, EnumC1221920hu2 enumC1221920hu2, EnumC1221650htb enumC1221650htb, EnumC1221770htn enumC1221770htn, C1221610htX c1221610htX) {
        String string;
        String string2;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            int i = C2187451AjH.LIZ;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//aivatar");
        String string3 = enumC1221910hu1.toString();
        String lowerCase = null;
        if (enumC1221770htn != null) {
            string = enumC1221770htn.toString();
        } else {
            string = null;
        }
        Boolean bool = Boolean.TRUE;
        String string4 = enumC1221920hu2.toString();
        Locale locale = Locale.ROOT;
        String lowerCase2 = string4.toLowerCase(locale);
        if (enumC1221650htb != null && (string2 = enumC1221650htb.toString()) != null) {
            lowerCase = string2.toLowerCase(locale);
        }
        smartRouteBuildRoute.withNavArg(new ProfileAIGCMainArg(string3, string, bool, lowerCase2, lowerCase, c1221610htX));
        smartRouteBuildRoute.open();
    }
}
