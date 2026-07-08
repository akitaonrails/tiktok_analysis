package com.ss.android.ugc.aweme.setting.page.base;

import X.C430540GuS;
import X.C430550GuT;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DivideCell<T extends C430550GuT> extends PowerCell<T> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int i;
        C430550GuT c430550GuT = (C430550GuT) interfaceC1891350zJl;
        View view = this.itemView;
        if (view instanceof C430540GuS) {
            C430540GuS c430540GuS = (C430540GuS) view;
            c430540GuS.setTitleAllCap(true);
            boolean z = c430550GuT.LL;
            View view2 = c430540GuS.LL;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
            int i2 = c430550GuT.LLILLJJLI;
            if (i2 != -1) {
                c430540GuS.setTitle(c430540GuS.getContext().getText(i2));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C430540GuS(viewGroup.getContext(), null, 6);
    }
}
