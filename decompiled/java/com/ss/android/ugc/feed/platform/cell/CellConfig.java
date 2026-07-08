package com.ss.android.ugc.feed.platform.cell;

import X.C03H5;
import X.C690870R8b;
import X.C692360RDu;
import X.C723830SaL;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CellConfig implements ICellConfigurationProtocol {
    public InteractAreaComponent LL;

    public abstract void LIZ(BaseCellContentComponent<? extends C03H5> baseCellContentComponent, C690870R8b c690870R8b);

    @Override // com.ss.android.ugc.feed.platform.cell.CellConfigurationProtocol
    public void NS1(BaseCellContentComponent<? extends C03H5> baseCellContentComponent, C690870R8b c690870R8b) {
        baseCellContentComponent.LJJIJL().setTag(R.id.el5, Boolean.TRUE);
        C723830SaL.LIZ(baseCellContentComponent, null, new C692360RDu(c690870R8b, baseCellContentComponent, this, baseCellContentComponent.LJJIJL()));
        LIZ(baseCellContentComponent, c690870R8b);
    }
}
