package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid;

import X.C13BV;
import X.C13LP;
import X.C2097608Jq;
import com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptConfigService;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.hybrid.LiveStreamAdaptAbSettings;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveStreamAdaptConfigServiceImpl implements ILiveStreamAdaptConfigService {
    @Override // com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptConfigService
    public final Set<String> LIZ() {
        Iterable iterable;
        LiveStreamAdaptAbSettings.AndroidAllowList androidAllowList;
        LiveStreamAdaptAbSettings.Model model = (LiveStreamAdaptAbSettings.Model) SettingsManager.LIZLLL().LJIIIIZZ("ttec_steram_adaptor_panel_allow_list", LiveStreamAdaptAbSettings.Model.class, null);
        if (model == null || (androidAllowList = model.f358android) == null || (iterable = androidAllowList.panelId) == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LLIIJI(iterable);
    }

    @Override // com.bytedance.android.livesdk.ecommerce.datachannel.ILiveStreamAdaptConfigService
    public final Map<String, String> LIZIZ() {
        LiveStreamAdaptAbSettings.AndroidAllowList androidAllowList;
        Map<String, String> map;
        LiveStreamAdaptAbSettings.Model model = (LiveStreamAdaptAbSettings.Model) SettingsManager.LIZLLL().LJIIIIZZ("ttec_steram_adaptor_panel_allow_list", LiveStreamAdaptAbSettings.Model.class, null);
        return (model == null || (androidAllowList = model.f358android) == null || (map = androidAllowList.channelMap) == null) ? C2097608Jq.LJ() : map;
    }
}
