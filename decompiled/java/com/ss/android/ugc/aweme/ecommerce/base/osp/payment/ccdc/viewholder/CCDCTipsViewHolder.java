package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C00XO;
import X.C03H8;
import X.C0H1U;
import X.C21588719eH;
import X.C679280Qkg;
import X.C870703aj;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCTipsViewHolder extends PowerCell<C00XO> implements C03H8 {
    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C870703aj.LIZ(this.itemView, new C21588719eH(C679280Qkg.LIZ(20), 0, 0, 0, false, 0, true, 254));
        ((TextView) this.itemView.findViewById(R.id.z7h)).setText(((C00XO) interfaceC1891350zJl).LL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C0H1U.LIZJ(R.layout.ane, viewGroup, false);
    }
}
