package com.ss.android.ugc.aweme.commentv2.commentlist.powercell;

import X.C0HD5;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultFooterCell extends PowerCell<Object> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View view = new View(viewGroup.getContext());
        C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, C0HD5.LIZ(view, 20)));
        return view;
    }
}
