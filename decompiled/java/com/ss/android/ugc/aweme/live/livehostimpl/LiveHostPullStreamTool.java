package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C04QR;
import X.C844470XAv;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPullStreamTool;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: loaded from: classes31.dex */
public class LiveHostPullStreamTool implements IHostPullStreamTool {
    @Override // com.bytedance.android.livesdkapi.host.IHostPullStreamTool
    public final boolean ni() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        C844470XAv.LIZ.getClass();
        return creativeToolsPluginService != null && creativeToolsPluginService.LJI(C844470XAv.LIZ());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPullStreamTool
    public final boolean cd(Context context) {
        return C04QR.LIZ(null, false);
    }
}
