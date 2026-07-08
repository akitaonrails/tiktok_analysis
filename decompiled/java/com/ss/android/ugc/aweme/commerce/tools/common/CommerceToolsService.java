package com.ss.android.ugc.aweme.commerce.tools.common;

import X.C1209830haX;
import X.C1403010mc7;
import X.C1429380nIe;
import X.C15MA;
import X.InterfaceC681980Qp2;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.discover.model.BrandedContentToolSchema;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class CommerceToolsService implements ICommerceToolsService {
    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final InterfaceC681980Qp2 getMusicContext() {
        return C15MA.LL;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final boolean isCommerceChallenge() {
        return C1429380nIe.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final boolean usedCommerceSticker() {
        return C1429380nIe.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final void openBrandedContentPage(Context context) {
        String str;
        C1403010mc7.LIZ.getCommerceService().getClass();
        BrandedContentToolSchema brandedContentToolSchemaLIZ = C1209830haX.LIZ();
        if (brandedContentToolSchemaLIZ == null || (str = brandedContentToolSchemaLIZ.brandedContentInfo) == null) {
            str = "https://support.tiktok.com/en/business-and-creator/creator-and-business-accounts/branded-content-on-tiktok";
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://webview/");
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final void setCommerceChallenge(boolean z) {
        C1429380nIe.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ICommerceToolsService
    public final void handleReceptionByEvent(JSONObject jSONObject, Context context) {
        ((ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class)).LIZ(jSONObject);
    }
}
