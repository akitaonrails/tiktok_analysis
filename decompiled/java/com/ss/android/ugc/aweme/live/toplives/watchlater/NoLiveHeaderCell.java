package com.ss.android.ugc.aweme.live.toplives.watchlater;

import X.C01GW;
import X.C0HTI;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C452501pT;
import X.C786410Ut5;
import X.C993590bxl;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class NoLiveHeaderCell extends PowerCell<C993590bxl> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 167));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        Context context = this.itemView.getContext();
        C1749280vcc c1749280vcc = (C1749280vcc) this.LL.getValue();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n4;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1722300uv6.LJI = context.getString(2131856900);
        c1722300uv6.LJIIIIZZ = context.getString(2131856898);
        c1749280vcc.setStatus(c1722300uv6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gw6, viewGroup, false);
    }
}
