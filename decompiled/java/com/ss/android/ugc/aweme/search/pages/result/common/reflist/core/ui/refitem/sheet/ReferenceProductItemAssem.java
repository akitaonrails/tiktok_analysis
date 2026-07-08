package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet;

import X.C03IT;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C434510H2b;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceProductItemAssem extends BaseReferenceSheetItemAssem<C434510H2b> {
    public final int LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public View LLJLLIL;
    public TuxTextView LLJLLL;
    public View LLJZ;
    public C434510H2b LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return this.LLJLIL == 2 ? R.layout.ezi : R.layout.ezh;
    }

    public ReferenceProductItemAssem(int i) {
        this.LLJLIL = i;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.BaseReferenceSheetItemAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.rxg);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.rzz);
        this.LLJLLIL = view.findViewById(R.id.rzg);
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.rzf);
        this.LLJZ = view.findViewById(R.id.rxq);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C434510H2b c434510H2b;
        TuxTextView tuxTextView;
        C434510H2b c434510H2b2 = (C434510H2b) obj;
        tp(c434510H2b2);
        this.LLJZIJLIL = c434510H2b2;
        if (c434510H2b2 != null && (tuxTextView = this.LLJLL) != null) {
            tuxTextView.setText(c434510H2b2.LLILZ);
        }
        if (this.LLJLILLLLZIIL != null && (c434510H2b = this.LLJZIJLIL) != null) {
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(c434510H2b.LLILZIL));
            c1331670kl3LJIIJ.LJJ(this.LLJLILLLLZIIL);
            C786410Ut5.h3(c1331670kl3LJIIJ);
        }
        C434510H2b c434510H2b3 = this.LLJZIJLIL;
        if (c434510H2b3 != null) {
            if (C123100dR.LIZ(c434510H2b3.LLIZ)) {
                TuxTextView tuxTextView2 = this.LLJLLL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(c434510H2b3.LLIZ);
                }
                TuxTextView tuxTextView3 = this.LLJLLL;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 0);
                }
                View view = this.LLJLLIL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View view2 = this.LLJZ;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                    return;
                }
                return;
            }
            TuxTextView tuxTextView4 = this.LLJLLL;
            if (tuxTextView4 != null) {
                C786410Ut5.LLLLZLL(tuxTextView4, 8);
            }
            View view3 = this.LLJLLIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            View view4 = this.LLJZ;
            if (view4 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, view4);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet.BaseReferenceSheetItemAssem
    public final View sp(View view) {
        return view.findViewById(R.id.fz3);
    }
}
