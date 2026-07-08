package com.ss.android.ugc.aweme.services;

import X.AbstractC1539010q9T;
import X.AbstractC1542200qEc;
import X.C1739380vMe;
import X.C19327310jP;
import X.InterfaceC2217701Bqy;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes27.dex */
public final class ArticleModeAnchorService implements IArticleModeAnchorService {
    @Override // com.ss.android.ugc.aweme.services.IArticleModeAnchorService
    public void previewArticle(Context context, String str) {
        C1739380vMe.LIZ(str, context, false, false, null, null, null, null);
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeAnchorService
    public void openAddAnchorFlow(Context context, String str, String str2, String str3) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://anchor/link");
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("shoot_way", str2);
        smartRouteBuildRoute.withParam("creation_id", str3);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.services.IArticleModeAnchorService
    public void openRelatedArticle(Context context, String str, C19327310jP c19327310jP, AbstractC1539010q9T abstractC1539010q9T, AbstractC1542200qEc abstractC1542200qEc, InterfaceC2217701Bqy interfaceC2217701Bqy) {
        C1739380vMe.LIZ(str, context, true, true, c19327310jP, abstractC1539010q9T, abstractC1542200qEc, interfaceC2217701Bqy);
    }
}
