package com.ss.android.ugc.aweme.im.saas.host.impl.seclink;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.seclink.IMSecLinkApi;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;

/* JADX INFO: loaded from: classes3.dex */
public final class IMSecLinkService implements IMSecLinkApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.seclink.IMSecLinkApi
    public final String LIZ(String str) {
        ISecLinkService iSecLinkService = (ISecLinkService) PluggableExtentionKt.pluggableSpi$default(ISecLinkService.class, false, false, false, 14, null);
        if (iSecLinkService != null) {
            return iSecLinkService.LIZIZ(str, "im_hyperlink");
        }
        return null;
    }
}
