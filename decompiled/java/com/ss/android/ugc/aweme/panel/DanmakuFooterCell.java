package com.ss.android.ugc.aweme.panel;

import X.C1390410mHn;
import X.C786410Ut5;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DanmakuFooterCell extends PowerLoadingCell {
    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        View view = this.itemView;
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZLLL();
        C786410Ut5.LLLZZIL((C1390410mHn) view.findViewById(R.id.gb5), 8);
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 0);
        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.zmm), null);
        ((TextView) view.findViewById(R.id.zmm)).setText(view.getContext().getString(2131836755));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        View view = this.itemView;
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZLLL();
        C786410Ut5.LLLZZIL((C1390410mHn) view.findViewById(R.id.gb5), 8);
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 0);
        C786410Ut5.h9((TuxTextView) view.findViewById(R.id.zmm), new ACListenerS137S0100000_2(this, 44));
        ((TextView) view.findViewById(R.id.zmm)).setText(view.getContext().getString(2131836754));
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        View view = this.itemView;
        C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.zmm), 8);
        C786410Ut5.LLLZZIL((C1390410mHn) view.findViewById(R.id.gb5), 0);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bj5, viewGroup, false);
    }
}
