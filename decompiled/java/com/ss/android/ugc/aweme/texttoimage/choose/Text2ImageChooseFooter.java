package com.ss.android.ugc.aweme.texttoimage.choose;

import X.C1383370m6R;
import X.C337180DJs;
import X.C786410Ut5;
import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class Text2ImageChooseFooter extends PowerLoadingCell {
    public TuxIconView LL;
    public TuxSpinner LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        C1383370m6R.LJIILJJIL(0, 0, this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        C337180DJs.LIZJ(this.LL);
        C337180DJs.LIZ(this.LLILLJJLI);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C337180DJs.LIZ(this.LL);
        C337180DJs.LIZJ(this.LLILLJJLI);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C337180DJs.LIZ(this.LLILLJJLI);
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (TuxIconView) this.itemView.findViewById(R.id.nkq);
        this.LLILLJJLI = (TuxSpinner) this.itemView.findViewById(R.id.nkv);
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 84));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.ae7, false, 4, null);
    }
}
