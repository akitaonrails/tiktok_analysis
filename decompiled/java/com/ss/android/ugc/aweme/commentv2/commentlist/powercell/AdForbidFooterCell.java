package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C050J;
import X.C1342590l2f;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class AdForbidFooterCell extends PowerCell<C050J> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.itemView.findViewById(R.id.ihy);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        View view = this.itemView;
        C786410Ut5.W5(view, C1342590l2f.LIZ(view.getLayoutParams(), ((C050J) interfaceC1891350zJl).LL, view));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a34, viewGroup, false);
    }
}
