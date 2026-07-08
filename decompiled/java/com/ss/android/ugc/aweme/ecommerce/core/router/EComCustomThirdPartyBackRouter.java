package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C1943307jL;
import com.bytedance.hybrid.spark.api.ICustomSparkRouter;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class EComCustomThirdPartyBackRouter implements ICustomSparkRouter {
    @Override // com.bytedance.hybrid.spark.api.ICustomSparkRouter
    public final boolean LIZ(String str) {
        return u.LJJIIJZLJL(str, "aweme://echybrid/intercept_back", false);
    }

    @Override // com.bytedance.hybrid.spark.api.ICustomSparkRouter
    public final String LIZIZ(String str) {
        return C1943307jL.LIZ(UriProtector.parse(str), "aweme").toString();
    }
}
