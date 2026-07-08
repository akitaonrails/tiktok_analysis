package com.ss.android.ugc.aweme.api.component;

import X.C03H5;
import X.C0S0L;
import X.C2188811AlT;
import X.C690870R8b;
import X.C691310R9t;
import X.C723830SaL;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.DefaultCellConfig;

/* JADX INFO: loaded from: classes12.dex */
public final class CommerceVideoCellConfig extends DefaultCellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        C0S0L.LIZ.getClass();
        return C0S0L.LIZIZ(c690870R8b);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfig
    public final void LIZ(BaseCellContentComponent<? extends C03H5> baseCellContentComponent, C690870R8b c690870R8b) {
        C723830SaL.LIZ(baseCellContentComponent, null, new C691310R9t(baseCellContentComponent));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyExtraComponent cellType = ");
        sbLIZ.append(c690870R8b.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
