package com.ss.android.ugc.aweme.notification.vh;

import X.C0207004v;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes.dex */
public final class SystemNotificationInnerSpaceCell extends PowerCell<C0207004v> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        C786410Ut5.W5(this.itemView, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new View(viewGroup.getContext());
    }
}
