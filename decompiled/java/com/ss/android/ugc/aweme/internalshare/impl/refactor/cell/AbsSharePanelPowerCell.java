package com.ss.android.ugc.aweme.internalshare.impl.refactor.cell;

import X.C1196320hEk;
import X.C1361580lXI;
import X.C1362120lYA;
import X.C1402380mb6;
import X.C1554960qZC;
import X.C2211751BhN;
import X.InterfaceC1361730lXX;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes22.dex */
public abstract class AbsSharePanelPowerCell<T extends InterfaceC1361730lXX> extends PowerCell<T> {
    public final C1361580lXI LL = new C1361580lXI();
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public boolean I5() {
        return this instanceof SharePanelAggregationPowerCell;
    }

    public int N5() {
        return 0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        View view = this.itemView;
        if (!this.LLILLJJLI) {
            C2211751BhN.LIZ(view, new C1402380mb6(this, (AbsSharePanelPowerCell<InterfaceC1361730lXX>) 2));
            this.LLILLJJLI = true;
        }
        View view2 = this.itemView;
        if (I5() && !this.LLILLL) {
            C2211751BhN.LIZ(view2, this.LL);
            this.LLILLL = true;
        }
        super.onViewAttachedToWindow();
    }

    public final C1362120lYA L5() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7zLIZ, "source_default_key", C1362120lYA.class, null)) == null) {
            return null;
        }
        return (C1362120lYA) interfaceC1555100qZQLIZIZ.getSource();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onItemViewCreated() {
        super.onItemViewCreated();
    }
}
