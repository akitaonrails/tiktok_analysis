package com.ss.android.ugc.tiktok.im.contact.selector.impl.cell;

import X.C0200004o;
import X.C1390410mHn;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectorLoadingCell extends PowerCell<C0200004o> {
    public static final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.i3j;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = LL;
        C786410Ut5.W5(view, layoutParams);
        C786410Ut5.LJLLLLLL(0, view);
        ((C1390410mHn) view.findViewById(R.id.gb5)).LIZJ();
    }
}
