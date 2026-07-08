package com.ss.android.ugc.aweme.setting.services;

import X.C786410Ut5;
import X.C844470XAv;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.service.II18nService;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class I18nService implements II18nService {
    @Override // com.ss.android.ugc.aweme.main.service.II18nService
    public final String LIZ() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            String strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
            if (strLJIILJJIL != null) {
                return strLJIILJJIL;
            }
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.main.service.II18nService
    public final String getAppLanguage() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            C844470XAv.LIZ.getClass();
            String strLJIJJ = i18nManagerServiceApiLIZ.LJIJJ(C844470XAv.LIZ());
            if (strLJIJJ != null) {
                return strLJIJJ;
            }
        }
        return C786410Ut5.t2(Locale.getDefault());
    }
}
