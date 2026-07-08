package com.ss.android.ugc.aweme.setting.ui.cell;

import X.C1244230iU1;
import X.C786410Ut5;
import Y.ACListenerS162S0100000_28;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cell.BaseCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class SettingFooterCell extends BaseCell<C1244230iU1> {
    public RelativeLayout LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        RelativeLayout relativeLayout = this.LL;
        TuxTextView tuxTextView = relativeLayout != null ? (TuxTextView) relativeLayout.findViewById(R.id.user_info_tv) : null;
        this.LLILLJJLI = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS162S0100000_28(this, 72));
        }
        RelativeLayout relativeLayout2 = this.LL;
        TuxTextView tuxTextView2 = relativeLayout2 != null ? (TuxTextView) relativeLayout2.findViewById(R.id.version) : null;
        this.LLILLL = tuxTextView2;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS162S0100000_28(this, 73));
        }
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f6n, viewGroup, false);
        this.LL = (RelativeLayout) viewTd;
        return viewTd;
    }

    @Override // com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1244230iU1 c1244230iU1) {
        super.onBindItemView(c1244230iU1);
        RelativeLayout relativeLayout = this.LL;
        if (relativeLayout != null) {
            c1244230iU1.getClass();
            relativeLayout.setBackgroundColor(0);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            c1244230iU1.getClass();
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            c1244230iU1.getClass();
            tuxTextView2.setText((CharSequence) null);
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 != null) {
            c1244230iU1.getClass();
            tuxTextView3.setText((CharSequence) null);
        }
    }
}
