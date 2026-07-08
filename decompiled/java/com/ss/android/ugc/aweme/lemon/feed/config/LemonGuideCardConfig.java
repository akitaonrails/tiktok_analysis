package com.ss.android.ugc.aweme.lemon.feed.config;

import X.C03H5;
import X.C690870R8b;
import X.C723830SaL;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class LemonGuideCardConfig implements LemonCellConfigurationProtocol {
    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        return Intrinsics.LJFF(c690870R8b.LIZ(), "cell_lemon_fyp_guide");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final void NS1(BaseCellContentComponent<? extends C03H5> baseCellContentComponent, C690870R8b c690870R8b) {
        C723830SaL.LIZ(baseCellContentComponent, null, new AwS590S0100000_11((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C03H5>) 162));
    }
}
