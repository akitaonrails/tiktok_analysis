package com.ss.android.ugc.aweme.share.config;

import X.C1369950lkn;
import X.C1371600lnS;
import X.InterfaceC1366490lfD;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;

/* JADX INFO: loaded from: classes22.dex */
public class TTSharePanelLogicProtocol implements SharePanelLogicProtocol {
    public final BaseSharePackage LL;

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public View As0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public boolean Cj1() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public InterfaceC1366490lfD T72() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
    public C1369950lkn getUiConfig() {
        return null;
    }

    public TTSharePanelLogicProtocol(BaseSharePackage baseSharePackage) {
        this.LL = baseSharePackage;
    }

    public void tu(C1371600lnS c1371600lnS) {
        c1371600lnS.LJJJJJL = Cj1();
    }
}
