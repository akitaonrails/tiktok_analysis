package com.ss.android.ugc.aweme.im.saas.host.impl.shareeffect;

import X.C1394200mNu;
import X.C1697810uHb;
import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.shareeffect.IMShareEffectBridgeApi;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class IMShareEffectBridgeImpl implements IMShareEffectBridgeApi {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.shareeffect.IMShareEffectBridgeApi
    public final boolean LIZ(Activity activity) {
        IPropReuseService iPropReuseService = (IPropReuseService) PluggableExtentionKt.pluggableSpi$default(IPropReuseService.class, false, false, false, 14, null);
        if (iPropReuseService != null) {
            return iPropReuseService.LIZ(activity);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.shareeffect.IMShareEffectBridgeApi
    public final void LIZJ(Context context, String str) {
        SmartRoute smartRouteLIZ = C1394200mNu.LIZ.LIZ(context, str, "chat");
        smartRouteLIZ.withParam(FollowStatusChangeMethod.PARAM_UID, str);
        smartRouteLIZ.open();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.shareeffect.IMShareEffectBridgeApi
    public final void LIZIZ(Activity activity, String str, Map map) {
        NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
        newFaceStickerBean.id = str;
        IPropReuseService iPropReuseService = (IPropReuseService) PluggableExtentionKt.pluggableSpi$default(IPropReuseService.class, false, false, false, 14, null);
        if (iPropReuseService != null) {
            iPropReuseService.LJIIJJI(activity, C1697810uHb.LJ(newFaceStickerBean), null, "share_to_dm", null, 0, null, map);
        }
    }
}
