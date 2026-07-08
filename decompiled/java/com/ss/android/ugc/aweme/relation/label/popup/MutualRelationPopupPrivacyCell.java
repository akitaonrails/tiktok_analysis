package com.ss.android.ugc.aweme.relation.label.popup;

import X.C293801Bw;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class MutualRelationPopupPrivacyCell extends PowerCell<C293801Bw> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C293801Bw c293801Bw = (C293801Bw) interfaceC1891350zJl;
        super.onBindItemView(c293801Bw);
        ((TextView) this.itemView.findViewById(R.id.ruh)).setText(c293801Bw.LL);
        C426750GoL.LJIIL(this.itemView, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.drs, viewGroup, false);
    }
}
