package com.ss.android.ugc.aweme.inbox.service;

import X.C05RV;
import X.C19212010Ec;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;

/* JADX INFO: loaded from: classes15.dex */
public final class InboxServiceImpl implements IInboxService {
    @Override // com.ss.android.ugc.aweme.inbox.service.IInboxService
    public final String LIZ() {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        String strLJIILJJIL;
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        return (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(null)) == null) ? "" : strLJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.service.IInboxService
    public final C05RV LIZJ() {
        return C19212010Ec.LIZJ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.inbox.service.IInboxService
    public final boolean LIZLLL() {
        return C19212010Ec.LIZJ.LIZLLL();
    }
}
