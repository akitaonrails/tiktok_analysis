package com.ss.android.ugc.aweme.pipo.errorsdk.fragment;

import X.C098200Yq;
import X.C1411110mpB;
import X.C1685300txQ;
import X.C1725050uzX;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1725110uzd;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS32S1300000_26;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionButton;
import com.ss.android.ugc.aweme.pipo.errorsdk.ErrorActionUIData;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ErrorCodeSdkBottomSheetFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9LTc+Jj0gLC5iLzHELIOS0yLygpJzt9DTc+Jj0QJyEpGis4Cio4PSA+Gy0pLDsVOiQrJCo9PA==";
    public ErrorActionUIData LL;
    public String LLILLJJLI;
    public InterfaceC1725110uzd LLILLL;
    public C1725050uzX LLILZ;
    public TuxIconView LLILZIL;
    public TuxIconView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;

    public final TuxIconView NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hbq) : null;
            this.LLILZIL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxIconView OR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hbs) : null;
            this.LLILZLL = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        ErrorActionUIData errorActionUIData = this.LL;
        if (errorActionUIData != null) {
            View viewFindViewById = this.LLIZ;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.hbv);
                } else {
                    viewFindViewById = null;
                }
                this.LLIZ = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            if (textView != null) {
                textView.setText(errorActionUIData.errorTitle);
            }
            View viewFindViewById3 = this.LLIZLLLIL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.hbu);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLIZLLLIL = (TuxTextView) viewFindViewById3;
            }
            TextView textView2 = (TextView) viewFindViewById3;
            if (textView2 != null) {
                textView2.setText(errorActionUIData.errorText);
            }
            View viewFindViewById4 = this.LLJ;
            if (viewFindViewById4 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById4 = view4.findViewById(R.id.hbp);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLJ = (TuxTextView) viewFindViewById4;
            }
            TextView textView3 = (TextView) viewFindViewById4;
            if (textView3 != null) {
                ErrorActionButton errorActionButton = errorActionUIData.primaryButton;
                if (errorActionButton != null) {
                    str = errorActionButton.btnText;
                } else {
                    str = null;
                }
                textView3.setText(str);
            }
            if (Intrinsics.LJFF(errorActionUIData.showClose, Boolean.TRUE)) {
                TuxIconView tuxIconViewNR = NR();
                if (tuxIconViewNR != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconViewNR, 0);
                }
                TuxIconView tuxIconViewNR2 = NR();
                if (tuxIconViewNR2 != null) {
                    C786410Ut5.a9(tuxIconViewNR2, new ACListenerS128S0200000_26(this, errorActionUIData, 10));
                }
            } else {
                TuxIconView tuxIconViewNR3 = NR();
                if (tuxIconViewNR3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconViewNR3, 4);
                }
            }
            Integer numLIZIZ = C1411110mpB.LIZIZ(errorActionUIData.iconType);
            if (numLIZIZ == null) {
                TuxIconView tuxIconViewOR = OR();
                if (tuxIconViewOR != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconViewOR, 8);
                }
            } else {
                TuxIconView tuxIconViewOR2 = OR();
                if (tuxIconViewOR2 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconViewOR2, 0);
                }
                TuxIconView tuxIconViewOR3 = OR();
                if (tuxIconViewOR3 != null) {
                    tuxIconViewOR3.setIconRes(numLIZIZ.intValue());
                }
            }
            View viewFindViewById5 = this.LLJ;
            if (viewFindViewById5 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById5 = view5.findViewById(R.id.hbp);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLJ = (TuxTextView) viewFindViewById5;
            }
            MR((TuxTextView) viewFindViewById5, errorActionUIData.type, errorActionUIData.primaryButton);
            View view6 = this.LLJI;
            if (view6 == null) {
                View view7 = getView();
                if (view7 != null) {
                    viewFindViewById2 = view7.findViewById(R.id.hbr);
                }
                this.LLJI = (TuxTextView) viewFindViewById2;
                view6 = viewFindViewById2;
            }
            MR((TuxTextView) view6, errorActionUIData.type, errorActionUIData.secondaryButton);
        }
    }

    public final void MR(TuxTextView tuxTextView, String str, ErrorActionButton errorActionButton) {
        Context context;
        if (tuxTextView == null || (context = getContext()) == null) {
            return;
        }
        if (errorActionButton == null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        tuxTextView.setText(errorActionButton.btnText);
        C786410Ut5.h9(tuxTextView, new ACListenerS32S1300000_26(this, str, errorActionButton, context, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dvq, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
