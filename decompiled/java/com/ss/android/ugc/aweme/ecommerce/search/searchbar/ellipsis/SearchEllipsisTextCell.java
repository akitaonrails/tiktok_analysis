package com.ss.android.ugc.aweme.ecommerce.search.searchbar.ellipsis;

import X.C01GW;
import X.C0H1U;
import X.C127K;
import X.C12ES;
import X.C19320210iG;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C687020QxA;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchEllipsisTextCell extends PowerCell<C687020QxA> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 155));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 154));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C687020QxA c687020QxA = (C687020QxA) interfaceC1891350zJl;
        super.onBindItemView(c687020QxA);
        C127K c127k = (C127K) this.LL.getValue();
        c127k.setTitle(c687020QxA.LL);
        c127k.setIcon(c687020QxA.LLILLJJLI);
        C19320210iG c19320210iG = new C19320210iG(((View) this.LL.getValue()).getContext(), null);
        View.OnClickListener onClickListener = c687020QxA.LLILLL;
        if (onClickListener != null) {
            C786410Ut5.h9(c19320210iG.LIZIZ, onClickListener);
        }
        c127k.setAccessory(c19320210iG);
        if (c687020QxA.LLILZ) {
            C0H1U.LIZIZ((View) this.LLILLJJLI.getValue());
            C426750GoL.LJIIIZ(c127k, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0, false, 16);
        } else {
            C12ES.LJIILL(0, (View) this.LLILLJJLI.getValue());
            C426750GoL.LJIIIZ(c127k, 0, 0, 0, 0, false, 16);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bqg, viewGroup, false);
    }
}
