package com.ss.android.ugc.nearby.container;

import X.C1205490hTX;
import X.C21673319rv;
import X.C21673919s1;
import X.C2188811AlT;
import X.EnumC1205530hTb;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes19.dex */
public class NearbyStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public boolean LLJJJJLIIL;

    public NearbyStaggeredGridLayoutManager() {
        super(2, 1);
        this.LLJJJJLIIL = true;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.LLJJJJLIIL;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            LJJIJ(c21673319rv, c21673919s1, true);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutChildren IAE recovered: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            EnumC1205530hTb enumC1205530hTb = EnumC1205530hTb.SGLM_LAYOUT_CHILDREN_ERROR;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(enumC1205530hTb, "IllegalArgumentException", null, e);
        } catch (IndexOutOfBoundsException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onLayoutChildren IOOB recovered: ");
            sbLIZ2.append(e2.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            C1205490hTX c1205490hTX2 = C1205490hTX.LIZ;
            EnumC1205530hTb enumC1205530hTb2 = EnumC1205530hTb.SGLM_LAYOUT_CHILDREN_ERROR;
            c1205490hTX2.getClass();
            C1205490hTX.LIZLLL(enumC1205530hTb2, "IndexOutOfBoundsException", null, e2);
        } catch (NullPointerException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onLayoutChildren NPE recovered: ");
            sbLIZ3.append(e3.getMessage());
            C2188811AlT.LIZIZ(sbLIZ3);
            C1205490hTX c1205490hTX3 = C1205490hTX.LIZ;
            EnumC1205530hTb enumC1205530hTb3 = EnumC1205530hTb.SGLM_LAYOUT_CHILDREN_ERROR;
            c1205490hTX3.getClass();
            C1205490hTX.LIZLLL(enumC1205530hTb3, "NullPointerException", null, e3);
        }
    }

    public NearbyStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLJJJJLIIL = true;
    }
}
