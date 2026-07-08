package com.ss.android.ugc.aweme.im.saas.host.impl.spark;

import X.C0ZDV;
import X.EnumC2434109gJ;
import X.EnumC2434209gK;
import android.content.Context;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.api.ITtopIABService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.hyperlink.HyperlinkFeature;

/* JADX INFO: loaded from: classes15.dex */
public final class HyperLinkHelper implements HyperlinkFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.hyperlink.HyperlinkFeature
    public final boolean LIZ(RichTextInfo richTextInfo) {
        if (richTextInfo.getStatus() == C0ZDV.PASS) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Type inference failed for: r0v71, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.hyperlink.HyperlinkFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.app.Activity r18, java.lang.String r19, java.lang.String r20, X.C869590Y9l r21, int r22) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.spark.HyperLinkHelper.LIZIZ(android.app.Activity, java.lang.String, java.lang.String, X.0Y9l, int):void");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.hyperlink.HyperlinkFeature
    public final void LIZJ(Context context, String str, EnumC2434109gJ enumC2434109gJ, EnumC2434209gK enumC2434209gK, boolean z, Long l, String str2, Integer num) {
        ITtopIABService iTtopIABService = (ITtopIABService) PluggableExtentionKt.pluggableSpi$default(ITtopIABService.class, false, false, false, 14, null);
        if (iTtopIABService != null) {
            iTtopIABService.LIZ(context, str, enumC2434109gJ, enumC2434209gK, z, l, str2, num);
        }
    }
}
