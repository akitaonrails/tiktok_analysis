package com.ss.android.ugc.aweme.im.sdk.detail.feed;

import X.C03H5;
import X.C690870R8b;
import X.C723830SaL;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.DefaultCellConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class DMVideoCellConfig extends DefaultCellConfig {
    @Override // com.ss.android.ugc.feed.platform.cell.DefaultCellConfig, com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final boolean Jg(C690870R8b c690870R8b) {
        return Intrinsics.LJFF(c690870R8b.LIZ(), "cell_dm_media_video");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfig, com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public final void NS1(BaseCellContentComponent<? extends C03H5> baseCellContentComponent, C690870R8b c690870R8b) {
        baseCellContentComponent.LJJIJL().setTag(R.id.el5, Boolean.TRUE);
        C723830SaL.LIZ(baseCellContentComponent, null, new AwS590S0100000_11((BaseCellContentComponent) baseCellContentComponent, (BaseCellContentComponent<? extends C03H5>) 601));
    }
}
