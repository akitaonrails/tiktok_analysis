package com.ss.android.ugc.aweme.tools.integration.plugin.integration.impl;

import X.C289560BWo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService;

/* JADX INFO: loaded from: classes6.dex */
public final class CKResourceVEPluginStatusServiceImpl implements ICKResourceVEPluginStatusService {
    @Override // com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService
    public final void LIZ() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
    }

    @Override // com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService
    public final boolean LIZIZ() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        return (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(null)) && C289560BWo.LIZ();
    }
}
