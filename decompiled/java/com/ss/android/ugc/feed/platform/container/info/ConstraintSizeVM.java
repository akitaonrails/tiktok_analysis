package com.ss.android.ugc.feed.platform.container.info;

import X.C01GW;
import X.C07HF;
import X.C0P2R;
import X.C0P2S;
import X.C0P2T;
import X.C0RJW;
import X.C1919307fT;
import X.C1919407fU;
import X.C1DDC;
import X.C266080Abm;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C693770RJf;
import X.C705800RmM;
import X.C814420VxA;
import X.InterfaceC0148002o;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class ConstraintSizeVM extends FeedBaseViewModel<C0RJW> {
    public static final C01GW<Integer> LL = C452501pT.LIZIZ(new C1919307fT());
    public static final C01GW<Integer> LLILLJJLI = C452501pT.LIZIZ(new C1919407fU());
    public static final C01GW<Integer> LLILLL = C452501pT.LIZIZ(new C0P2S());
    public static final C01GW<Integer> LLILZ = C452501pT.LIZIZ(new C0P2R());
    public static final C01GW<Integer> LLILZIL = C452501pT.LIZIZ(new C0P2T());
    public static final int LLILZLL = 4;
    public static final int LLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0RJW(C1DDC.LLILZLL.LJFF);
    }

    public final int wQ2() {
        return C693770RJf.LIZLLL() + C693770RJf.LIZJ();
    }

    public static void zQ2(C705800RmM c705800RmM) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = c705800RmM.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int iLIZ = C693770RJf.LIZ();
            int marginStart = marginLayoutParams.getMarginStart();
            int i = marginLayoutParams.topMargin;
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = i;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = iLIZ;
        }
    }

    public final void vQ2(ViewGroup viewGroup) {
        View viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.bm6);
        if (viewFindViewById2 != null) {
            if ((((Number) C266080Abm.LIZ.getValue()).intValue() & 1) == 1) {
                viewGroup.setLayoutDirection(3);
            }
            viewFindViewById2.setPaddingRelative(C693770RJf.LIZLLL(), viewFindViewById2.getPaddingTop(), viewFindViewById2.getPaddingEnd(), viewFindViewById2.getPaddingBottom());
            viewFindViewById2.setPaddingRelative(viewFindViewById2.getPaddingStart(), viewFindViewById2.getPaddingTop(), C693770RJf.LIZJ(), viewFindViewById2.getPaddingBottom());
        }
        if (C07HF.LIZ() && (viewFindViewById = viewGroup.findViewById(R.id.c25)) != null) {
            C426750GoL.LJIIIZ(viewFindViewById, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))), null, false, 27);
        }
    }

    public static void xQ2(int i, int i2, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int marginStart = marginLayoutParams.getMarginStart();
                int i3 = marginLayoutParams.topMargin;
                int marginEnd = marginLayoutParams.getMarginEnd();
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i3;
                marginLayoutParams.setMarginEnd(marginEnd);
                marginLayoutParams.bottomMargin = i2;
            }
        }
    }
}
