package com.ss.android.ugc.aweme.inbox.search.view.cell;

import X.C01GW;
import X.C0231005t;
import X.C0DTR;
import X.C1241390iPR;
import X.C12ES;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchDefaultPageFoldCell extends PowerCell<C0231005t> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1564));

    public final C1241390iPR I5() {
        return (C1241390iPR) this.LL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0231005t c0231005t = (C0231005t) interfaceC1891350zJl;
        super.onBindItemView(c0231005t);
        if (c0231005t.LL) {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.kjh));
            C0DTR.LIZIZ(this.itemView.findViewById(R.id.kjd));
            C786410Ut5.R7((LinearLayout) this.itemView.findViewById(R.id.kjh), new ACListenerS154S0100000_19(this, 194));
        } else {
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.kjd));
            C0DTR.LIZIZ(this.itemView.findViewById(R.id.kjh));
            C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.kjd), new ACListenerS154S0100000_19(this, 195));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a__, viewGroup, false);
    }
}
