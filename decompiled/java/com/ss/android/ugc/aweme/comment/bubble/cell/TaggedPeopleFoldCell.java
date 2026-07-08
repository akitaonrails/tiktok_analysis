package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C0SWH;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1341780l1M;
import X.C786410Ut5;
import X.EnumC1341650l19;
import X.InterfaceC1891350zJl;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class TaggedPeopleFoldCell extends PowerCell<C0SWH> {
    public SmartImageView LL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0SWH c0swh = (C0SWH) interfaceC1891350zJl;
        super.onBindItemView(c0swh);
        C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.afp);
        c1331670kl3LJFF.LIZLLL("TaggedPeopleActionCell");
        c1331670kl3LJFF.LJJ(this.LL);
        C786410Ut5.h3(c1331670kl3LJFF);
        C786410Ut5.I7(new ACListenerS146S0100000_11(c0swh, 58), this.itemView);
        C1341780l1M.LIZIZ(C1341780l1M.LIZ, this.itemView, EnumC1341650l19.BUTTON, 0.0f, null, 12);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a4u, viewGroup, false);
        this.LL = (SmartImageView) viewTd.findViewById(R.id.bh8);
        return viewTd;
    }
}
