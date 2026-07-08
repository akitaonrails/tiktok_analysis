package com.ss.android.ugc.aweme.favorites.base.ui;

import X.C1390410mHn;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultFavoriteLoadingFooterCell extends PowerLoadingCell {
    public ViewGroup LL;
    public C1390410mHn LLILLJJLI;

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        ViewGroup viewGroup = this.LL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = 0;
        C786410Ut5.X5(layoutParams, viewGroup);
        C786410Ut5.LJLZ(8, viewGroup);
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        (c1390410mHn != null ? c1390410mHn : null).LIZLLL();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        ViewGroup viewGroup = this.LL;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        C786410Ut5.X5(layoutParams, viewGroup);
        C786410Ut5.LJLZ(0, viewGroup);
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        (c1390410mHn != null ? c1390410mHn : null).LIZJ();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        L5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        RelativeLayout relativeLayout = new RelativeLayout(viewGroup.getContext());
        C786410Ut5.e6(relativeLayout, new ViewGroup.LayoutParams(-1, -2));
        this.LL = relativeLayout;
        C1390410mHn c1390410mHn = new C1390410mHn(viewGroup.getContext(), null, 6);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        layoutParams.addRule(13);
        C786410Ut5.V6(c1390410mHn, layoutParams);
        this.LLILLJJLI = c1390410mHn;
        ViewGroup viewGroup2 = this.LL;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        viewGroup2.addView(c1390410mHn);
        ViewGroup viewGroup3 = this.LL;
        if (viewGroup3 == null) {
            return null;
        }
        return viewGroup3;
    }
}
