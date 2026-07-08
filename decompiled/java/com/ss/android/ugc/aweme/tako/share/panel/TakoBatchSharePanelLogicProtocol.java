package com.ss.android.ugc.aweme.tako.share.panel;

import X.C1355090lMp;
import X.InterfaceC1366490lfD;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoBatchSharePanelLogicProtocol extends TTSharePanelLogicProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final View As0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public final InterfaceC1366490lfD T72() {
        final TakoBatchMessageSharePackage takoBatchMessageSharePackage;
        BaseSharePackage baseSharePackage = this.LL;
        return (!(baseSharePackage instanceof TakoBatchMessageSharePackage) || (takoBatchMessageSharePackage = (TakoBatchMessageSharePackage) baseSharePackage) == null) ? new C1355090lMp() { // from class: X.0m5p
        } : new C1355090lMp() { // from class: X.0m5o
            @Override // X.C1355090lMp, X.InterfaceC1366490lfD
            public final void LJI(Context context, BaseSharePackage baseSharePackage2) {
                C1382840m5a.LIZ.remove(takoBatchMessageSharePackage);
            }
        };
    }

    public TakoBatchSharePanelLogicProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
