package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C0SWL;
import X.C1341780l1M;
import X.C1351950lHl;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1341650l19;
import X.InterfaceC1891350zJl;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class TaggedPeopleExpandCell extends PowerCell<C0SWL> {
    public TuxTextView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0SWL c0swl = (C0SWL) interfaceC1891350zJl;
        super.onBindItemView(c0swl);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            C1351950lHl.LJIJJLI(tuxTextView);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('+');
        sbLIZ.append((c0swl.LL - c0swl.LLILLJJLI) + 2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(strLIZIZ);
        }
        C786410Ut5.I7(new ACListenerS146S0100000_11(c0swl, 57), this.itemView);
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, this.itemView, EnumC1341650l19.BUTTON, 0.0f, null, 12);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a4w, viewGroup, false);
        this.LL = (TuxTextView) viewTd.findViewById(R.id.hg5);
        return viewTd;
    }
}
