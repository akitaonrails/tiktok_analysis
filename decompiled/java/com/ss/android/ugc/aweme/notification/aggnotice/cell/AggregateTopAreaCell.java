package com.ss.android.ugc.aweme.notification.aggnotice.cell;

import X.C01GW;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1844840y6k;
import X.C1890820zIu;
import X.C1910480zoc;
import X.C418440Gaw;
import X.C422830Gi1;
import X.C424560Gko;
import X.C438710HIf;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS129S0200000_27;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class AggregateTopAreaCell extends PowerCell<C1844840y6k> {
    public final float LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 616));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 615));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a5r;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1844840y6k c1844840y6k = (C1844840y6k) interfaceC1891350zJl;
        super.onBindItemView(c1844840y6k);
        C424560Gko c424560Gko = (C424560Gko) this.LLILLJJLI.getValue();
        if (c424560Gko != null) {
            C786410Ut5.H9(c424560Gko, new ACListenerS129S0200000_27(c1844840y6k, this, 24));
        }
        C424560Gko c424560Gko2 = (C424560Gko) this.LLILLJJLI.getValue();
        if (c424560Gko2 != null) {
            c424560Gko2.setCornerRadius(this.LL);
        }
        UrlModel urlModel = c1844840y6k.LL.imageUrl;
        if (urlModel != null) {
            C1910480zoc c1910480zoc = C1910480zoc.LIZ;
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(500));
            c1331670kl3LJIIIIZZ.LIZLLL("aggregate_top_area_cell");
            c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLILLJJLI.getValue());
            C1890820zIu.LIZ(c1331670kl3LJIIIIZZ);
            c1910480zoc.getClass();
            C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        String str = c1844840y6k.LL.topText;
        if (str != null) {
            TextView textView = (TextView) this.LLILLL.getValue();
            if (textView != null) {
                textView.setText(str);
            }
            TuxTextView tuxTextView = (TuxTextView) this.LLILLL.getValue();
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LLILLL.getValue();
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }
}
