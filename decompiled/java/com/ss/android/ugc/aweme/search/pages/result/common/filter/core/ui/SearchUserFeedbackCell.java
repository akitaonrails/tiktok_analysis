package com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui;

import X.C01GW;
import X.C0Q97;
import X.C11G4;
import X.C127K;
import X.C1360520lVa;
import X.C419910GdJ;
import X.C444910HcX;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS145S0100000_10;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchUserFeedbackCell extends PowerCell<C0Q97> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 475));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 476));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C127K c127k = (C127K) this.LL.getValue();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_pen_on_doc;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c127k.setIcon(c419910GdJ);
        C127K c127k2 = (C127K) this.LL.getValue();
        C11G4 c11g4 = new C11G4(((View) this.LL.getValue()).getContext(), null);
        c11g4.LJIILL(new ACListenerS145S0100000_10(this, 23));
        c127k2.setAccessory(c11g4);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZLLL(this.itemView.getContext().getString(2131834618));
        C444910HcX c444910HcX = new C444910HcX(c1360520lVa.LIZ);
        c444910HcX.LIZ(42);
        ((C127K) this.LL.getValue()).setTitle(c444910HcX);
        C0Q97 item = getItem();
        if (item != null && item.LLILLL) {
            C786410Ut5.LJLLLLLL(0, (View) this.LLILLJJLI.getValue());
        } else {
            C786410Ut5.LJLLLLLL(8, (View) this.LLILLJJLI.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ey8, viewGroup, false);
    }
}
