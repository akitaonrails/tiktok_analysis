package com.ss.android.ugc.aweme.search.lynx.core.ui.component;

import X.C01GW;
import X.C0PXJ;
import X.C1388190mED;
import X.C19EG;
import X.C452501pT;
import X.C641600PEo;
import X.C646360PWw;
import X.C647830Pb3;
import X.C648330Pbr;
import X.EnumC311510CIz;
import Y.AObserverS214S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLynxCardCell extends PowerCell<C641600PEo> {
    public C647830Pb3 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 321));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 323));
    public final AObserverS214S0100000_10 LLILZ = new AObserverS214S0100000_10(this, 20);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 324));
    public int LLILZLL = 3;
    public int LLIZ = -1;
    public C648330Pbr LLIZLLLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020b  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.ui.component.SearchLynxCardCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i == EnumC311510CIz.TYPE_SPARK.getTypeValue()) {
            i2 = 1;
        } else {
            i2 = 3;
        }
        this.LLILZLL = i2;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(viewGroup.getContext());
        if (c19egLIZIZ != null) {
            this.LLIZLLLIL = C646360PWw.LIZ(this.LLILZLL, jCurrentTimeMillis, c19egLIZIZ);
            C648330Pbr c648330Pbr = this.LLIZLLLIL;
            if (c648330Pbr != null) {
                C0PXJ c0pxj = C0PXJ.LIZ;
                AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 322);
                c0pxj.getClass();
                C0PXJ.LIZLLL(c648330Pbr, this, awS554S0100000_10);
            }
            C648330Pbr c648330Pbr2 = this.LLIZLLLIL;
            if (c648330Pbr2 == null) {
                return super.onCreateItemView(viewGroup);
            }
            return c648330Pbr2;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
