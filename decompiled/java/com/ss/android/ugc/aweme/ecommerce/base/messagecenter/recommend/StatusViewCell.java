package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.recommend;

import X.C0159002z;
import X.C0HTI;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class StatusViewCell extends PowerCell<C0159002z> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        String string2;
        super.onBindItemView(interfaceC1891350zJl);
        Context context = this.itemView.getContext();
        C1749280vcc c1749280vcc = (C1749280vcc) this.itemView;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        String str = "";
        if (context == null || (string = context.getString(2131857248)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        if (context != null && (string2 = context.getString(2131857247)) != null) {
            str = string2;
        }
        c1722300uv6.LJIIIIZZ = str;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.ng;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZ = drawableLIZ;
        c1749280vcc.setStatus(c1722300uv6);
        c1749280vcc.setTopMargin(C418440Gaw.LIZIZ(32));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C1749280vcc c1749280vcc = new C1749280vcc(viewGroup.getContext(), null, 6);
        C786410Ut5.U6(c1749280vcc, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250))));
        return c1749280vcc;
    }
}
