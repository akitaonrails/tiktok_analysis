package com.ss.android.ugc.aweme.im.saas.host.impl.tools;

import X.C19EG;
import X.InterfaceC21300818Xm;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.tools.IMToolsBridgeApi;
import com.ss.android.ugc.tools.IAiChatFeatureService;

/* JADX INFO: loaded from: classes15.dex */
public final class IMToolsBridgeImpl implements IMToolsBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.tools.IMToolsBridgeApi
    public final boolean LIZ(String str) {
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) != null) {
            return interfaceC21300818XmLIZ.LIZ(str);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.tools.IMToolsBridgeApi
    public final void LIZIZ(C19EG c19eg, String str) {
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) != null) {
            interfaceC21300818XmLIZ.LIZIZ(c19eg, str);
        }
    }
}
