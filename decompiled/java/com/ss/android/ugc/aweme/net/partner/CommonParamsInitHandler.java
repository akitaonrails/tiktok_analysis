package com.ss.android.ugc.aweme.net.partner;

import X.C0XM9;
import X.C1499330p7T;
import X.C718040SEo;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.services.ISettingService;

/* JADX INFO: loaded from: classes24.dex */
public final class CommonParamsInitHandler implements NetworkPartner.RequestHandler {
    public static final CommonParamsInitHandler LIZ = new CommonParamsInitHandler();

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.RequestHandler
    public final void LJIIIIZZ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        ISettingService iSettingService = (ISettingService) PluggableExtentionKt.pluggableSpi$default(ISettingService.class, false, false, false, 14, null);
        if (iSettingService != null) {
            iSettingService.installCommonParams();
        }
    }
}
