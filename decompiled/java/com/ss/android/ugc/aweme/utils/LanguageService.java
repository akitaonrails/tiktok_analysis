package com.ss.android.ugc.aweme.utils;

import X.C0X35;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;

/* JADX INFO: loaded from: classes5.dex */
public final class LanguageService implements LanguageProvider {
    @Override // com.ss.android.ugc.aweme.utils.LanguageProvider
    public final void LIZ(Activity activity) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        C0X35.LIZ("lifecycle_set_locale", false);
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            i18nManagerServiceApiLIZ.LIZIZ(activity);
        }
        C0X35.LJIIJJI("lifecycle_set_locale", false);
    }

    @Override // com.ss.android.ugc.aweme.utils.LanguageProvider
    public final void LIZIZ(Context context) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
            i18nManagerServiceApiLIZ.LIZIZ(context);
        }
    }
}
