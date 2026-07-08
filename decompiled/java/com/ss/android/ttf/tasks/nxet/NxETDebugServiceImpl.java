package com.ss.android.ttf.tasks.nxet;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.nxet.INxETDebugService;
import com.ss.android.ugc.aweme.service.IEtDebugService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class NxETDebugServiceImpl implements INxETDebugService {
    @Override // com.ss.android.ugc.aweme.nxet.INxETDebugService
    public final Pair<String, Float> LIZ(View view, Long l) {
        IEtDebugService iEtDebugService = (IEtDebugService) PluggableExtentionKt.pluggableSpi$default(IEtDebugService.class, false, false, false, 14, null);
        if (iEtDebugService != null) {
            iEtDebugService.LJFF();
        }
        return null;
    }
}
