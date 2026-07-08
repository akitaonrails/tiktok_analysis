package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.powerlist;

import X.C01GW;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C20642515q3;
import X.C337180DJs;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C608150NtF;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class HighlightEmptyCell extends PowerCell<C608150NtF> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 162));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.btq;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C337180DJs.LIZJ((View) this.LL.getValue());
        C1749280vcc c1749280vcc = (C1749280vcc) this.LL.getValue();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_no_video;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJI = C20642515q3.LJI(2131832860);
        c1722300uv6.LJIIIIZZ = C20642515q3.LJI(2131832859);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1749280vcc.setStatus(c1722300uv6);
    }
}
