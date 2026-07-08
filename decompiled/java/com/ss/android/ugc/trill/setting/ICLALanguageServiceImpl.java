package com.ss.android.ugc.trill.setting;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C11S5;
import X.C13BV;
import X.C1701940uOG;
import X.C1839820xye;
import X.C20698915z9;
import X.C20699015zA;
import X.C20699115zB;
import X.C20699315zD;
import X.C20700015zK;
import X.C20700915zT;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC20699215zC;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.serverpush.model.ClaCombineSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.ICLALanguageService;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes32.dex */
public final class ICLALanguageServiceImpl implements ICLALanguageService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(757));

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final void LIZ(ClaCombineSettings claCombineSettings) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        InterfaceC20699215zC.LIZ.getClass();
        InterfaceC20699215zC value = C20699315zD.LIZIZ.getValue();
        String json = GsonProtectorUtils.toJson((Gson) this.LIZ.getValue(), claCombineSettings);
        json.toString();
        value.LIZ("cla_combine_settings", json).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final C20700915zT LIZJ(C20700015zK c20700015zK) {
        return new C20700915zT(c20700015zK);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final SmartRoute LIZIZ(Context context, Aweme aweme, String str) {
        Integer numValueOf;
        C20698915z9 c20698915z9 = DoNotTranslateSettingPageV2.LLJJIII;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c20698915z9.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//do_not_translate/language/settingv2");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("enter_method", "TRANSLATION_SETTING");
        if (numValueOf != null) {
            smartRouteBuildRoute.withParam("aweme_type", numValueOf.intValue());
        }
        smartRouteBuildRoute.withParam("is_half_sheet", false);
        return smartRouteBuildRoute;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final TranslationLanguageSettingPage LJIIIIZZ(List list, String str, Aweme aweme) {
        Integer numValueOf;
        String str2 = TranslationLanguageSettingPage._pnsPageId;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        TranslationLanguageSettingPage translationLanguageSettingPage = new TranslationLanguageSettingPage();
        Bundle bundle = new Bundle();
        if (list != null) {
            C786410Ut5.LJJIZ(bundle, "translation_language", list.toArray(new ContentLanguage[0]));
        }
        String strLIZ = C1839820xye.LIZ().LIZ();
        TranslationLanguageSettingPage.LLJJIJIL = strLIZ;
        C786410Ut5.LJJJI("selected_translation_language_code", strLIZ, bundle);
        C786410Ut5.LJJJI("enter_method", "TRANSLATION_SETTING", bundle);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        if (numValueOf != null) {
            numValueOf.intValue();
            bundle.putInt("aweme_type", numValueOf.intValue());
        }
        bundle.putBoolean("is_half_sheet", true);
        translationLanguageSettingPage.setArguments(bundle);
        return translationLanguageSettingPage;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final SmartRoute LJ(Context context, PushSettings pushSettings, String str, Aweme aweme) {
        Integer numValueOf;
        C20698915z9 c20698915z9 = DoNotTranslateSettingPageV2.LLJJIII;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c20698915z9.getClass();
        return C20698915z9.LIZIZ(context, pushSettings, str, numValueOf);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final SmartRoute LJI(Context context, PushSettings pushSettings, String str, Aweme aweme) {
        Integer numValueOf;
        C20699015zA c20699015zA = DoNotTranslateSettingPage.LLJILLL;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c20699015zA.getClass();
        return C20699015zA.LIZ(context, pushSettings, str, numValueOf);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final DoNotTranslateSettingPageV2 LJII(PushSettings pushSettings, String str, String str2, Aweme aweme) {
        Integer numValueOf;
        C20698915z9 c20698915z9 = DoNotTranslateSettingPageV2.LLJJIII;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c20698915z9.getClass();
        DoNotTranslateSettingPageV2 doNotTranslateSettingPageV2 = new DoNotTranslateSettingPageV2();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
        if (numValueOf != null) {
            bundle.putInt("aweme_type", numValueOf.intValue());
        }
        bundle.putBoolean("is_half_sheet", true);
        if (pushSettings != null) {
            bundle.putStringArray("selected_do_not_translate_codes", (String[]) C20698915z9.LIZ(pushSettings).toArray(new String[0]));
            List list = pushSettings.allDoNotTranslate;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            C786410Ut5.LJJIZ(bundle, "all_do_not_translate", list.toArray(new ContentLanguage[0]));
        }
        doNotTranslateSettingPageV2.setArguments(bundle);
        return doNotTranslateSettingPageV2;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final SmartRoute LIZLLL(Context context, Aweme aweme, String str, String str2, List list) {
        Integer numValueOf;
        String str3 = TranslationLanguageSettingPage._pnsPageId;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        return C20699115zB.LIZ(context, list, str, str2, numValueOf);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ICLALanguageService
    public final SmartRoute LJFF(Context context, List<? extends ContentLanguage> list, List<String> list2, String str, Aweme aweme) {
        Integer numValueOf;
        C20699015zA c20699015zA = DoNotTranslateSettingPage.LLJILLL;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c20699015zA.getClass();
        return C20699015zA.LIZIZ(context, list, list2, str, numValueOf);
    }
}
