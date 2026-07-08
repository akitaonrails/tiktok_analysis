package com.ss.android.ugc.aweme.port.in;

import X.InterfaceC1910030znt;
import X.InterfaceC19279210be;
import android.content.Context;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public interface IAVSettingService {
    String getAppLanguage();

    String getAppLogRegion();

    Locale getCountryLocale();

    InterfaceC1910030znt getCurrentI18nItem(Context context);

    Locale getLocale(String str);

    Map<String, InterfaceC1910030znt> getLocaleMap();

    boolean getSaveAtPost();

    String getSysLanguage();

    void requestTurnOnAdAuthorization(Context context, InterfaceC19279210be interfaceC19279210be);
}
