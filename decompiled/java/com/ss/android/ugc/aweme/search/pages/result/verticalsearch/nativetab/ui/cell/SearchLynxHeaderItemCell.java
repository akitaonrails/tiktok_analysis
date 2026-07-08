package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.nativetab.ui.cell;

import X.C01GW;
import X.C0PVZ;
import X.C1388190mED;
import X.C19EG;
import X.C21681819tI;
import X.C452501pT;
import X.C646360PWw;
import X.C647830Pb3;
import X.C648330Pbr;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLynxHeaderItemCell extends PowerCell<C0PVZ> {
    public C647830Pb3 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 819));
    public C648330Pbr LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        interfaceC1891350zJl.getClass();
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(viewGroup.getContext());
        if (c19egLIZIZ != null) {
            C648330Pbr c648330PbrLIZ = C646360PWw.LIZ(1, jCurrentTimeMillis, c19egLIZIZ);
            this.LLILLL = c648330PbrLIZ;
            return c648330PbrLIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
