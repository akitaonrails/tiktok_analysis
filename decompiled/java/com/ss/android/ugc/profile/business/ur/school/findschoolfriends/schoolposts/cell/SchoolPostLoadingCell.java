package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell;

import X.C01GW;
import X.C1308910kAL;
import X.C21681819tI;
import X.C452501pT;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SchoolPostLoadingCell extends PowerLoadingCell {
    public TuxSpinner LL;
    public TuxTextView LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(364));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(362));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(363));

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        TuxSpinner tuxSpinner = this.LL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(2131845002);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void LIZJ() {
        TuxSpinner tuxSpinner = this.LL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        TuxSpinner tuxSpinner = this.LL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 0);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C21681819tI) {
            ((C21681819tI) layoutParams).LLILLJJLI = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        int iIntValue;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ((Number) this.LLILZ.getValue()).intValue());
        layoutParams.topMargin = ((Number) this.LLILZIL.getValue()).intValue();
        C786410Ut5.a6(frameLayout, layoutParams);
        TuxSpinner tuxSpinner = new TuxSpinner(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.LJLLLLLL(8, tuxSpinner);
        frameLayout.addView(tuxSpinner, new FrameLayout.LayoutParams(((Number) this.LLILLL.getValue()).intValue(), ((Number) this.LLILLL.getValue()).intValue(), 17));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1p, frameLayout.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        tuxSpinner.LIZ(R.raw.icon_spinner_normal, iIntValue);
        this.LL = tuxSpinner;
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        C786410Ut5.LJLLLLLL(8, tuxTextView);
        tuxTextView.setTextColorRes(R.attr.a1k);
        frameLayout.addView(tuxTextView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.LLILLJJLI = tuxTextView;
        return frameLayout;
    }
}
