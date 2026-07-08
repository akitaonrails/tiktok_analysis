package com.bytedance.ies.powerlist.header;

import X.C423460Gj2;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class HeaderAndFooterViewCell extends PowerCell<C423460Gj2> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ViewGroup viewGroup;
        View view = ((C423460Gj2) interfaceC1891350zJl).LL;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (!Intrinsics.LJFF(viewGroup, this.itemView.findViewById(R.id.tqy))) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
                ((ViewGroup) this.itemView.findViewById(R.id.tqy)).addView(view);
                return;
            }
            return;
        }
        ((ViewGroup) this.itemView.findViewById(R.id.tqy)).addView(view);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eal, viewGroup, false);
    }
}
