package com.tiktok.ef.i18nimpl.service.manager;

import X.C01GW;
import X.C19376510rL;
import X.C452501pT;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;

/* JADX INFO: loaded from: classes30.dex */
public final class I18nServiceImpl implements I18nServiceApi {
    public final C01GW LIZ = C452501pT.LIZIZ(new C19376510rL());

    @Override // com.tiktok.ef.i18n.service.manager.I18nServiceApi
    public final I18nManagerServiceApi LIZ() {
        return (I18nManagerServiceApi) this.LIZ.getValue();
    }
}
