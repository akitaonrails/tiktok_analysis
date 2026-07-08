package com.ss.android.ugc.aweme.ecommerce.search.page.mix;

import X.AbstractC677840QiM;
import X.AbstractC677870QiP;
import X.C678830Qjx;
import X.C678850Qjz;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.arch.MixReusedUIAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class GuessULikeTitleAssem extends MixReusedUIAssem<GuessULikeTitleAssem, C678830Qjx> {
    public TuxTextView LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bpd;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C678850Qjz c678850Qjz;
        AbstractC677870QiP abstractC677870QiP = ((AbstractC677840QiM) obj).LL;
        View viewFindViewById = null;
        if ((abstractC677870QiP instanceof C678850Qjz) && (c678850Qjz = (C678850Qjz) abstractC677870QiP) != null) {
            View view = this.LLJLIL;
            if (view == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.u_like_title);
                }
                this.LLJLIL = (TuxTextView) viewFindViewById;
                view = viewFindViewById;
            }
            ((TextView) view).setText(c678850Qjz.LJI);
        }
    }
}
