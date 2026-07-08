package com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.bidding;

import X.AbstractViewOnClickListenerC19509711Up;
import X.C098200Yq;
import X.C0H27;
import X.C0H28;
import X.C0I7D;
import X.C1391190mJ3;
import X.C1507790pL7;
import X.C1685300txQ;
import X.C1748470vbJ;
import X.C189200o6;
import X.C19509911Ur;
import X.C197039127h;
import X.C19773412Ya;
import X.C19EG;
import X.C19GS;
import X.C212303186j;
import X.C21578619ce;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2487409ou;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS16S0101000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes30.dex */
public final class MaxBidFragment extends Fragment implements C0H28 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLCM6PiBiKiA+HELIOSJSoiZyY9LjctZz88OCYtOyt9KiwoLSY9L2sBKDcRISEKOy40JSAiPQ==";
    public C0H27 LL;
    public int LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(426));
    public C212303186j LLILLL;
    public C197039127h LLILZ;
    public C1748470vbJ LLILZIL;
    public LinearLayout LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public TuxTextView LLJ;
    public View LLJI;

    @Override // X.C0H28
    public final void LLIIIZ() {
        int i = C2187451AjH.LIZ;
        View view = this.LLJI;
        if (view != null) {
            C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, 0));
        }
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof TuxSheet) || parentFragment == null) {
            return;
        }
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIILLIIL(this.LLILLJJLI, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C0H27 c0h27 = this.LL;
        if (c0h27 != null) {
            C786410Ut5.C3(c0h27.getContentView().getViewTreeObserver(), c0h27);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_stay_page", null);
        C19509911Ur.LIZ.getClass();
        C19509911Ur.LIZ("auction_maxbid_popup_dismiss", null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = this.LLILZLL;
        if (linearLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
            linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
        }
        C1748470vbJ c1748470vbJ = this.LLILZIL;
        if (c1748470vbJ != null) {
            c1748470vbJ.LJII(2);
            c1748470vbJ.setFocusable(true);
            c1748470vbJ.LJIIIZ(1);
            c1748470vbJ.LIZJ();
            c1748470vbJ.LJFF(false);
            c1748470vbJ.getEditText().requestFocus();
            c1748470vbJ.LIZIZ(new C19773412Ya(this, 15));
            c1748470vbJ.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.11Um
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    if (z) {
                        int i = C2187451AjH.LIZ;
                    } else {
                        int i2 = C2187451AjH.LIZ;
                    }
                }
            });
        }
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && parentFragment != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILLIIL(this.LLILLJJLI, this);
        }
        final C197039127h c197039127h = this.LLILZ;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
            C197039127h c197039127h2 = this.LLILZ;
            if (c197039127h2 != null) {
                C786410Ut5.w5(c197039127h2, 0.6f);
            }
            C786410Ut5.I7(new AbstractViewOnClickListenerC19509711Up() { // from class: X.11Ul
                @Override // X.AbstractViewOnClickListenerC19509711Up
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        C19509911Ur c19509911Ur = C19509911Ur.LIZ;
                        this.LLILLL.getClass();
                        c19509911Ur.getClass();
                        C19509911Ur.LIZ("auction_maxbid_submit", null);
                        if (C1388190mED.LIZIZ(c197039127h.getContext()) != null) {
                            this.LLILLL.getClass();
                        }
                    }
                }
            }, c197039127h);
        }
        C212303186j c212303186j = this.LLILLL;
        if (c212303186j != null) {
            c212303186j.setAuctionData(null);
        }
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText((CharSequence) null);
        }
        TuxTextView tuxTextView2 = this.LLIZLLLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText((CharSequence) null);
        }
        C197039127h c197039127h3 = this.LLILZ;
        if (c197039127h3 != null) {
            c197039127h3.setText((CharSequence) null);
        }
        TuxTextView tuxTextView3 = this.LLIZ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText((CharSequence) null);
        }
        C1748470vbJ c1748470vbJ2 = this.LLILZIL;
        if (c1748470vbJ2 != null) {
            TuxTextView tuxTextView4 = new TuxTextView(c1748470vbJ2.getContext(), null, 6, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
            C786410Ut5.R6(tuxTextView4, layoutParams);
            tuxTextView4.setIncludeFontPadding(false);
            tuxTextView4.setText((CharSequence) null);
            tuxTextView4.setTuxFont(123);
            c1748470vbJ2.LJIIL(tuxTextView4);
            C0I7D editText = c1748470vbJ2.getEditText();
            if (editText != null) {
                editText.setIncludeFontPadding(false);
            }
            c1748470vbJ2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.11Un
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                }
            });
        }
        if (this.LLILZIL != null) {
            C2487409ou.LIZJ(new ARunnableS129S0100000_29(this, 28));
        }
        System.currentTimeMillis();
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LIZJ("livesdk_tiktokec_enter_page", null);
        C19509911Ur.LIZ.getClass();
        C19509911Ur.LIZ("auction_maxbid_popup_show", null);
    }

    @Override // X.C0H28
    public final void uj(int i, int i2) {
        C21578619ce c21578619ce;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onOpened, keyboardhelper, cvh:");
        sbLIZ.append(i);
        sbLIZ.append(", kbh:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = this.LLJI;
        if (view != null) {
            C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, i2));
        }
        this.LLILLJJLI = i;
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && parentFragment != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJIILLIIL(this.LLILLJJLI + i2, this);
            int i4 = this.LLILLJJLI + i2;
            View view2 = parentFragment.getView();
            if (view2 != null && (c21578619ce = (C21578619ce) view2.findViewById(R.id.v4b)) != null) {
                HandlerHook.viewPost(c21578619ce, new ARunnableS16S0101000_5(i4, c21578619ce, 11));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bw0, viewGroup, false);
        C0H27 c0h27 = new C0H27(viewTd.getContext(), viewTd);
        this.LL = c0h27;
        c0h27.LLIZ = this;
        C786410Ut5.x3(c0h27.getContentView().getViewTreeObserver(), c0h27);
        HandlerHook.viewPost(c0h27.LL, new ARunnableS106S0100000_6(c0h27, 181));
        this.LLILLL = (C212303186j) viewTd.findViewById(R.id.bzg);
        this.LLILZ = (C197039127h) viewTd.findViewById(R.id.gkj);
        this.LLILZIL = (C1748470vbJ) viewTd.findViewById(R.id.o4e);
        this.LLILZLL = (LinearLayout) viewTd.findViewById(R.id.o4f);
        this.LLIZ = (TuxTextView) viewTd.findViewById(R.id.o4g);
        this.LLIZLLLIL = (TuxTextView) viewTd.findViewById(R.id.o4i);
        this.LLJ = (TuxTextView) viewTd.findViewById(R.id.o4j);
        this.LLJI = viewTd.findViewById(R.id.voh);
        viewTd.findViewById(R.id.warning_tips);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
