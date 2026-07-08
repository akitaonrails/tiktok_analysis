package com.ss.android.ugc.aweme.tako.botpage.components.botmarket.marketitem;

import X.C0H5Z;
import X.C418440Gaw;
import X.C435280H5a;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes7.dex */
public final class TakoMarketBotItemPowerCell extends PowerCell<C435280H5a> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0H5Z c0h5z;
        C435280H5a c435280H5a = (C435280H5a) interfaceC1891350zJl;
        View view = this.itemView;
        if ((view instanceof C0H5Z) && (c0h5z = (C0H5Z) view) != null) {
            c0h5z.LIZ(c435280H5a);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C0H5Z c0h5z = new C0H5Z(viewGroup.getContext(), null, 6);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0h5z);
        c0h5z.setLayoutParams(layoutParams);
        c0h5z.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        return c0h5z;
    }
}
