package com.tiktok.ef.i18nmanagerapi.service.i18n;

import X.C19296810eU;
import X.C20251614Ly;
import X.InterfaceC1910030znt;
import X.InterfaceC20251114Lt;
import android.content.Context;
import com.tiktok.ef.i18nimpl.service.I18nManagerServiceImpl;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface I18nManagerServiceApi {
    void LIZ(Context context, InterfaceC20251114Lt interfaceC20251114Lt, String str, String str2);

    void LIZIZ(Context context);

    Context LIZJ(Context context);

    Locale LIZLLL(String str);

    Locale LJ();

    String LJFF(Context context);

    String LJI(Context context);

    String LJII(Context context);

    I18nManagerServiceImpl LJIIIIZZ(Map map);

    I18nManagerServiceImpl LJIIIZ(String str, String str2, String str3, String str4);

    void LJIIJ(Context context, Locale locale, C20251614Ly c20251614Ly, boolean z);

    List<InterfaceC1910030znt> LJIIJJI();

    InterfaceC1910030znt LJIIL(Context context);

    Map<String, InterfaceC1910030znt> LJIILIIL();

    String LJIILJJIL(Context context);

    List LJIILL();

    C19296810eU LJIILLIIL(String str, String str2, String str3);

    Locale LJIIZILJ(Context context);

    boolean LJIJ(Context context);

    String LJIJI(Context context, Locale locale);

    String LJIJJ(Context context);

    Locale LJIJJLI(Context context);

    String LJIL(Context context, Locale locale);

    void LJJ(Context context);

    boolean LJJI(Context context, String str);
}
