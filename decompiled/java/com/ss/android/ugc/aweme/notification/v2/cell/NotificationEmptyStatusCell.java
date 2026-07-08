package com.ss.android.ugc.aweme.notification.v2.cell;

import X.C01GW;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C419910GdJ;
import X.C452501pT;
import X.C897970ZKp;
import X.C897980ZKq;
import X.InterfaceC1891350zJl;
import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class NotificationEmptyStatusCell extends PowerCell<C897970ZKp> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1095));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cwb;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C897970ZKp c897970ZKp = (C897970ZKp) interfaceC1891350zJl;
        super.onBindItemView(c897970ZKp);
        Context context = getContext();
        if (context != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            c1722300uv6.LJI = context.getString(c897970ZKp.LL);
            c1722300uv6.LJIIIIZZ = context.getString(c897970ZKp.LLILLJJLI);
            Integer num = c897970ZKp.LLILLL;
            if (num != null) {
                num.intValue();
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c897970ZKp.LLILLL.intValue();
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                c1722300uv6.LIZ(c419910GdJ);
            }
            if (C897980ZKq.LIZ()) {
                c1722300uv6.LJI = context.getString(2131836319);
            }
            C1749280vcc c1749280vcc = (C1749280vcc) this.LL.getValue();
            if (c1749280vcc != null) {
                c1749280vcc.setStatus(c1722300uv6);
            }
        }
    }
}
