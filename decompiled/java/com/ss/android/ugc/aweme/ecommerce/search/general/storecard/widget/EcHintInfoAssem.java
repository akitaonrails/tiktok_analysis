package com.ss.android.ugc.aweme.ecommerce.search.general.storecard.widget;

import X.C00ZL;
import X.C00ZM;
import X.C0R45;
import X.C786410Ut5;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcHintInfoAssem extends ReusedUISlotAssem<EcHintInfoAssem> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxTextView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bs0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = null;
        if (C00ZM.LIZ() == 1) {
            View viewFindViewById2 = this.LLJJLIIIJLLLLLLLZ;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.v5t);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJLIIIJLLLLLLLZ = (TuxTextView) viewFindViewById2;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById2, 0);
            View viewFindViewById3 = this.LLJJLIIIJLLLLLLLZ;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.v5t);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJLIIIJLLLLLLLZ = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(view.getContext().getString(2131848063));
        }
        if (C00ZL.LIZ() == 1) {
            if (C00ZM.LIZ() == 1) {
                View viewFindViewById4 = this.LLJL;
                if (viewFindViewById4 == null) {
                    View viewLJJIJL3 = LJJIJL();
                    if (viewLJJIJL3 != null) {
                        viewFindViewById4 = viewLJJIJL3.findViewById(R.id.uqb);
                    } else {
                        viewFindViewById4 = null;
                    }
                    this.LLJL = viewFindViewById4;
                }
                C786410Ut5.LJLLLLLL(0, viewFindViewById4);
            }
            View viewFindViewById5 = this.LLJLIL;
            if (viewFindViewById5 == null) {
                View viewLJJIJL4 = LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById5 = viewLJJIJL4.findViewById(R.id.sr9);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJLIL = (TuxTextView) viewFindViewById5;
            }
            C786410Ut5.LLLLZLL((TuxTextView) viewFindViewById5, 0);
            View viewFindViewById6 = this.LLJLILLLLZIIL;
            if (viewFindViewById6 == null) {
                View viewLJJIJL5 = LJJIJL();
                if (viewLJJIJL5 != null) {
                    viewFindViewById6 = viewLJJIJL5.findViewById(R.id.dtq);
                } else {
                    viewFindViewById6 = null;
                }
                this.LLJLILLLLZIIL = (TuxIconView) viewFindViewById6;
            }
            C786410Ut5.LLLLLLZZ((TuxIconView) viewFindViewById6, 0);
            View viewFindViewById7 = this.LLJLIL;
            if (viewFindViewById7 == null) {
                View viewLJJIJL6 = LJJIJL();
                if (viewLJJIJL6 != null) {
                    viewFindViewById7 = viewLJJIJL6.findViewById(R.id.sr9);
                } else {
                    viewFindViewById7 = null;
                }
                this.LLJLIL = (TuxTextView) viewFindViewById7;
            }
            ((TextView) viewFindViewById7).setText(view.getContext().getString(2131835070));
        }
        View view2 = this.LLJLILLLLZIIL;
        if (view2 == null) {
            View viewLJJIJL7 = LJJIJL();
            if (viewLJJIJL7 != null) {
                viewFindViewById = viewLJJIJL7.findViewById(R.id.dtq);
            }
            this.LLJLILLLLZIIL = (TuxIconView) viewFindViewById;
            view2 = viewFindViewById;
        }
        C786410Ut5.I7(new AjS65S0100000_10(this, 30), view2);
        view.addOnAttachStateChangeListener(new C0R45(this, 0));
    }
}
