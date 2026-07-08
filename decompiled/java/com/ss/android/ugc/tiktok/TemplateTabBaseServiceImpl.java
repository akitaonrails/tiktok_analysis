package com.ss.android.ugc.tiktok;

import X.C0CHQ;
import X.InterfaceC1445350niP;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.template.ITemplateTabBaseService;
import com.ss.android.ugc.aweme.tools.AVApi;
import lth.o;

/* JADX INFO: loaded from: classes3.dex */
public final class TemplateTabBaseServiceImpl implements ITemplateTabBaseService {
    @Override // com.ss.android.ugc.aweme.template.ITemplateTabBaseService
    public final boolean LIZIZ() {
        return !o.LJIIZILJ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.template.ITemplateTabBaseService
    public final <T> T LIZ(Class<T> cls) {
        String strLIZ;
        InterfaceC1445350niP networkService = C0CHQ.LIZ().getNetworkService();
        AVApi aVApi = (AVApi) PluggableExtentionKt.pluggableSpi$default(AVApi.class, false, false, false, 14, null);
        if (aVApi == null || (strLIZ = aVApi.LIZ()) == null) {
            strLIZ = "";
        }
        return (T) networkService.createRetrofit(strLIZ, true, cls);
    }
}
