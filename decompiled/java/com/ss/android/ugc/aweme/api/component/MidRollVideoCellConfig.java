package com.ss.android.ugc.aweme.api.component;

import X.C03H5;
import X.C2188811AlT;
import X.C690870R8b;
import X.C723830SaL;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.DefaultCellConfig;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class MidRollVideoCellConfig extends DefaultCellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        return Intrinsics.LJFF("cell_mid_roll", c690870R8b.LIZ());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfig
    public final void LIZ(BaseCellContentComponent<? extends C03H5> baseCellContentComponent, C690870R8b c690870R8b) {
        C723830SaL.LIZ(baseCellContentComponent, null, new AwS590S0100000_11((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C03H5>) 37));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyExtraComponent cellType = ");
        sbLIZ.append(c690870R8b.LIZ());
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
