package com.ss.android.ugc.aweme.freqcontrol;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;

/* JADX INFO: loaded from: classes3.dex */
public final class UFCDebugHelper implements IUFCDebugHelper {
    @Override // com.ss.android.ugc.aweme.freqcontrol.IUFCDebugHelper
    public final boolean LIZ() {
        IDmToolsDebugService iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null);
        if (iDmToolsDebugService != null) {
            iDmToolsDebugService.LIZ();
        }
        return false;
    }
}
