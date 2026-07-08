package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.horizontal;

import X.C0Q0E;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C342550Dbp;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C434520H2c;
import X.C814420VxA;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceHorizontalWebLinkItemAssem extends BaseReferenceHorizontalItemAssem<C434520H2c> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C427870Gq9 LLJL;
    public TuxTextView LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ezg;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.horizontal.BaseReferenceHorizontalItemAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLJL = (C427870Gq9) view.findViewById(R.id.l9h);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.zym);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        Context context;
        C434520H2c c434520H2c = (C434520H2c) obj;
        op(c434520H2c);
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c434520H2c.LLILLJJLI);
        }
        String str = c434520H2c.LLILZLL;
        if (str != null && (context = getContext()) != null) {
            Drawable drawableLIZIZ = C342550Dbp.LIZIZ(context, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C0Q0E.LIZIZ(str));
            c1331670kl3LJIIIZ.LJJ(this.LLJL);
            c1331670kl3LJIIIZ.LJIL(drawableLIZIZ);
            c1331670kl3LJIIIZ.LJJIIZI(drawableLIZIZ);
            c1331670kl3LJIIIZ.LJIIJJI();
        }
        TuxTextView tuxTextView2 = this.LLJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c434520H2c.LLILLL);
        }
    }
}
