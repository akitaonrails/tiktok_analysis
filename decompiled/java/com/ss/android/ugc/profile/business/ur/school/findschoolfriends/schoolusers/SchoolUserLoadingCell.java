package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers;

import X.C01GW;
import X.C1390410mHn;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SchoolUserLoadingCell extends PowerLoadingCell {
    public C1390410mHn LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(365));

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
            C786410Ut5.LLLZZIL(c1390410mHn, 8);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C1390410mHn c1390410mHn = this.LL;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
            c1390410mHn.LIZJ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        C1390410mHn c1390410mHn = new C1390410mHn(viewGroup.getContext(), null, 6);
        C786410Ut5.LJLLLLLL(8, c1390410mHn);
        frameLayout.addView(c1390410mHn, new FrameLayout.LayoutParams(((Number) this.LLILLJJLI.getValue()).intValue(), ((Number) this.LLILLJJLI.getValue()).intValue(), 17));
        this.LL = c1390410mHn;
        return frameLayout;
    }
}
