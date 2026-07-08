package com.ss.android.ugc.aweme.im.saas.host.impl.im;

import X.C06CY;
import X.C1336205Ku;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMServiceBridgeApi;
import com.ss.android.ugc.aweme.im.service.service.IIMMessageOpenService;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class IMServiceBridgeImpl implements IMServiceBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMServiceBridgeApi
    public final boolean LIZLLL(EnterChatParams enterChatParams) {
        if (!(enterChatParams instanceof EnterChatParams)) {
            enterChatParams = null;
        }
        if (enterChatParams == null) {
            return false;
        }
        return C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMServiceBridgeApi
    public final void LIZJ(Context context, Bundle bundle) {
        C1336205Ku.LIZ(false).getImChatService().LJIIL(context, bundle, false, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMServiceBridgeApi
    public final Object LIZ(String str, String str2, Map map, C06CY c06cy) {
        IIMMessageOpenService iIMMessageOpenService = (IIMMessageOpenService) PluggableExtentionKt.pluggableSpi$default(IIMMessageOpenService.class, false, false, false, 14, null);
        if (iIMMessageOpenService == null) {
            return null;
        }
        return iIMMessageOpenService.LIZ(str, str2, map, c06cy);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.im.IMServiceBridgeApi
    public final Object LIZIZ(String str, String str2, Map map, C06CY c06cy) {
        IIMMessageOpenService iIMMessageOpenService = (IIMMessageOpenService) PluggableExtentionKt.pluggableSpi$default(IIMMessageOpenService.class, false, false, false, 14, null);
        if (iIMMessageOpenService == null) {
            return null;
        }
        return iIMMessageOpenService.LIZIZ(2000, str, str2, map, c06cy);
    }
}
