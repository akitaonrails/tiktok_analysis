package com.tiktok.ef.i18nimpl.service;

import X.C19296810eU;
import X.C20250614Lo;
import X.C20250814Lq;
import X.C20250914Lr;
import X.C20251014Ls;
import X.C20251314Lv;
import X.C20251414Lw;
import X.C20251514Lx;
import X.C20251614Ly;
import X.C810670Vr7;
import X.C837920Wty;
import X.InterfaceC1910030znt;
import X.InterfaceC20251114Lt;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class I18nManagerServiceImpl implements I18nManagerServiceApi {
    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final Locale LJ() {
        C20251414Lw c20251414Lw = C20251514Lx.LIZ;
        List<Locale> list = c20251414Lw.LIZLLL;
        return (list == null || ((ArrayList) list).isEmpty()) ? Locale.getDefault() : (Locale) ListProtector.get(c20251414Lw.LIZLLL, 0);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final List<InterfaceC1910030znt> LJIIJJI() {
        C20251414Lw c20251414Lw = C20251514Lx.LIZ;
        c20251414Lw.getClass();
        return new ArrayList(((LinkedHashMap) c20251414Lw.LIZ).values());
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final Map<String, InterfaceC1910030znt> LJIILIIL() {
        return C20251514Lx.LIZ.LIZ;
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final List LJIILL() {
        return C20251514Lx.LIZ.LIZLLL;
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final void LIZIZ(Context context) {
        Context context2;
        if (context == null) {
            context2 = C20250914Lr.LIZ;
            if (context2 == null) {
                return;
            }
        } else {
            context2 = context;
        }
        C20250614Lo.LIZ(context2, C20251314Lv.LIZJ(context, null, null), null, false, null);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final Context LIZJ(Context context) {
        if (context == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Locale localeLIZJ = C20251314Lv.LIZJ(context, null, null);
            Configuration configuration = new Configuration();
            configuration.setLocale(localeLIZJ);
            configuration.setLocales(new LocaleList(localeLIZJ));
            try {
                if (C20251314Lv.LIZ(context, "ar")) {
                    configuration.screenLayout = (configuration.screenLayout & (-193)) | 128;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            return context.createConfigurationContext(configuration);
        }
        return context;
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final Locale LIZLLL(String str) {
        InterfaceC1910030znt interfaceC1910030znt = (InterfaceC1910030znt) ((LinkedHashMap) C20251514Lx.LIZ.LIZ).get(str);
        if (interfaceC1910030znt != null) {
            return interfaceC1910030znt.getLocale();
        }
        return null;
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final String LJFF(Context context) {
        Locale locale = C20251514Lx.LIZ.LIZJ;
        if (locale != null) {
            return C20251314Lv.LIZIZ(locale);
        }
        return C20251314Lv.LIZIZ(Locale.getDefault());
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final String LJI(Context context) {
        return C20251514Lx.LIZ.LIZ(context).LIZJ();
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final String LJII(Context context) {
        return C20251014Ls.LIZ(context, "key_current_region", C837920Wty.LIZIZ(C20251314Lv.LIZJ(context, null, null)));
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final I18nManagerServiceImpl LJIIIIZZ(Map map) {
        C20251514Lx.LIZ.LIZIZ = map;
        return this;
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final InterfaceC1910030znt LJIIL(Context context) {
        return C20251514Lx.LIZ.LIZ(context);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final String LJIILJJIL(Context context) {
        Locale locale = Locale.getDefault();
        String strLIZ = C20251014Ls.LIZ(context, "key_current_locale", "");
        if (TextUtils.isEmpty(strLIZ)) {
            strLIZ = C20251314Lv.LIZLLL(null, locale, true);
            C20251014Ls.LIZIZ(context, "key_current_locale", strLIZ);
        }
        if (TextUtils.isEmpty(strLIZ)) {
            return "en";
        }
        return strLIZ;
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final Locale LJIIZILJ(Context context) {
        Resources resources;
        Configuration configuration;
        if (context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null) {
            return configuration.locale;
        }
        return null;
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final boolean LJIJ(Context context) {
        if (context == null) {
            context = C20250914Lr.LIZ;
        }
        return TextUtils.isEmpty(C20251014Ls.LIZ(context, "key_current_locale", ""));
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final String LJIJJ(Context context) {
        return C20251314Lv.LIZIZ(C20251314Lv.LIZJ(context, null, null));
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final Locale LJIJJLI(Context context) {
        return C20251314Lv.LIZJ(context, null, null);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final void LJJ(Context context) {
        Context context2;
        Context context3;
        SharedPreferences sharedPreferencesLIZJ;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorClear;
        if (context == null) {
            context2 = C20250914Lr.LIZ;
        } else {
            context2 = context;
        }
        if (context2 != null && (sharedPreferencesLIZJ = C810670Vr7.LIZJ(context2, 0, "key_language_sp_key")) != null && (editorEdit = sharedPreferencesLIZJ.edit()) != null && (editorClear = editorEdit.clear()) != null) {
            editorClear.apply();
        }
        if (context == null) {
            context3 = C20250914Lr.LIZ;
            if (context3 == null) {
                return;
            }
        } else {
            context3 = context;
        }
        C20250614Lo.LIZ(context3, C20251314Lv.LIZJ(context, null, null), null, false, null);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final String LJIJI(Context context, Locale locale) {
        return C20251314Lv.LIZIZ(locale);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final String LJIL(Context context, Locale locale) {
        return C20251314Lv.LIZLLL(null, locale, false);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final boolean LJJI(Context context, String str) {
        return C20251314Lv.LIZ(context, str);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final C19296810eU LJIILLIIL(String str, String str2, String str3) {
        return new C19296810eU("", str, str2, str3);
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final void LIZ(Context context, InterfaceC20251114Lt interfaceC20251114Lt, String str, String str2) {
        Context context2;
        if (context == null) {
            context2 = C20250914Lr.LIZ;
        } else {
            context2 = context;
        }
        Locale localeLIZJ = C20251314Lv.LIZJ(context, str, str2);
        C20250614Lo.LIZ(context2, localeLIZJ, str, true, new C20250814Lq(interfaceC20251114Lt, context, localeLIZJ, str));
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final I18nManagerServiceImpl LJIIIZ(String str, String str2, String str3, String str4) {
        C20251514Lx.LIZ.LIZ.put(str, new C19296810eU(str, str2, str3, str4));
        return this;
    }

    @Override // com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi
    public final void LJIIJ(Context context, Locale locale, C20251614Ly c20251614Ly, boolean z) {
        C20251414Lw c20251414Lw = C20251514Lx.LIZ;
        c20251414Lw.getClass();
        C20250914Lr.LIZ = context;
        C20250914Lr.LIZIZ = c20251614Ly;
        C20250914Lr.LIZJ = z;
        if (c20251414Lw.LIZJ == null) {
            c20251414Lw.LIZJ = locale;
        }
        if (((ArrayList) c20251414Lw.LIZLLL).size() == 0) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleList locales = context.getResources().getConfiguration().getLocales();
                for (int i = 0; i < locales.size(); i++) {
                    ((ArrayList) c20251414Lw.LIZLLL).add(locales.get(i));
                }
                return;
            }
            ((ArrayList) c20251414Lw.LIZLLL).add(context.getResources().getConfiguration().locale);
        }
    }

    public final I18nManagerServiceImpl LJJIFFI(String str, String str2, String str3, String str4) {
        C20251514Lx.LIZ.LIZ.put(str, new C19296810eU(str, "zh", str2, str3, str4));
        return this;
    }
}
