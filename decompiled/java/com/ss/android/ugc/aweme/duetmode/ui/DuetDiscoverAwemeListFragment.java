package com.ss.android.ugc.aweme.duetmode.ui;

import X.AbstractC1255880imo;
import X.C1209530ha3;
import X.C1235870iGX;
import X.C1255920ims;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes10.dex */
public final class DuetDiscoverAwemeListFragment extends DetailAwemeListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiE5LDs+JyEpHELIOSZzo6ZgE5LDsXITYvJjk2OgQ7LCI2BCw/PQkhKSIhLCEn";

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final int bS() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, X.C0P6P
    public final void LJJIFFI() {
        C1255920ims<AbstractC1255880imo> c1255920ims = this.LLILZ;
        if (c1255920ims != null) {
            c1255920ims.LIZJ(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final void dS() {
        TuxTextView tuxTextViewOR = OR(R.string.l6r);
        C786410Ut5.h9(tuxTextViewOR, new ACListenerS144S0100000_9(this, 114));
        C1235870iGX c1235870iGX = this.LLJJIJIL;
        C1209530ha3 c1209530ha3LIZ = C1209530ha3.LIZ(getContext());
        c1209530ha3LIZ.LIZIZ(OR(2131836168));
        c1209530ha3LIZ.LIZLLL(tuxTextViewOR);
        c1235870iGX.setBuilder(c1209530ha3LIZ);
    }
}
