package com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default;

import X.AbstractC1914420zuy;
import X.C098200Yq;
import X.C0TVI;
import X.C10UZ;
import X.C1308910kAL;
import X.C13LP;
import X.C14K9;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C1913750ztt;
import X.C1914080zuQ;
import X.C1914170zuZ;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C419910GdJ;
import X.C431280Gve;
import X.C770750ULh;
import X.C770770ULj;
import X.C786410Ut5;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS46S2100000_28;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupFullscreenUI extends UniversalPopupUI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUiOmEmJiw6LD0gKSk8Jj8mOGHELIOSsvJj02ZjAlZys2LiQ5JTt9HSslPyohOyQgGSAjPTUKPCM/OyY+LCo9HQw=";
    public C1914080zuQ LLIZ;
    public final C770750ULh LLIZLLLIL;
    public final C770770ULj LLJ;

    public UniversalPopupFullscreenUI() {
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LJIILLIIL = false;
        c770750ULh.LJIJ = true;
        this.LLIZLLLIL = c770750ULh;
        this.LLJ = new C770770ULj();
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void WR(String str) {
        this.LLIZLLLIL.LJ = str;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void RR(Map<String, String> map, StyleExtra styleExtra) {
        Integer numLJI;
        int i;
        C1914170zuZ.LIZ.getClass();
        AbstractC1914420zuy abstractC1914420zuy = C1914170zuZ.LJII;
        if (abstractC1914420zuy != null) {
            numLJI = abstractC1914420zuy.LJI("IconChevronLeftLtr");
        } else {
            numLJI = null;
        }
        if (Intrinsics.LJFF(map.get("upper_left_back"), "true") && numLJI != null) {
            C1914080zuQ c1914080zuQ = this.LLIZ;
            if (c1914080zuQ == null) {
                c1914080zuQ = null;
            }
            TuxIconView tuxIconView = c1914080zuQ.LLILZLL;
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = numLJI.intValue();
            if (C10UZ.LIZLLL(requireContext())) {
                i = -1;
            } else {
                i = -16777216;
            }
            c419910GdJ.LIZLLL = Integer.valueOf(i);
            tuxIconView.setTuxIcon(c419910GdJ);
            C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(this, 69));
        }
        TuxIntroFragment tuxIntroFragmentLIZ = this.LLIZLLLIL.LIZ();
        C1914080zuQ c1914080zuQ2 = this.LLIZ;
        if (c1914080zuQ2 == null) {
            c1914080zuQ2 = null;
        }
        C786410Ut5.LJZ(0, c1914080zuQ2.LLILZIL);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJ(R.id.universal_popup_sub_fragment, tuxIntroFragmentLIZ, null);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void SR(SpannableStringBuilder spannableStringBuilder, String str) {
        LinearLayout linearLayout = new LinearLayout(requireContext());
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        if (spannableStringBuilder.length() > 0) {
            linearLayout.addView(C431280Gve.LIZ(requireContext(), spannableStringBuilder, str));
        }
        C770750ULh c770750ULh = this.LLIZLLLIL;
        c770750ULh.LJIILIIL = linearLayout;
        c770750ULh.LJIILJJIL = false;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void VR(String str, String str2) {
        this.LLIZLLLIL.LIZJ = new AwS46S2100000_28(this, str, str2, 1);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIJJI();
        tuxImmersionBarLIZLLL.LJIIJ(!C10UZ.LIZLLL(requireContext()));
        tuxImmersionBarLIZLLL.LJI(!C10UZ.LIZLLL(requireContext()));
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            tuxImmersionBarLIZLLL.LJFF(numLIZJ.intValue());
        }
        tuxImmersionBarLIZLLL.LIZLLL();
        C1914080zuQ c1914080zuQ = this.LLIZ;
        if (c1914080zuQ == null) {
            c1914080zuQ = null;
        }
        C14K9.LJIJJ(c1914080zuQ.LL, new C0TVI() { // from class: X.0zuR
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                view2.setPadding(view2.getPaddingLeft(), c20244914JjLIZ.LIZIZ, view2.getPaddingRight(), c20244914JjLIZ.LIZLLL);
                return c20246014Ju;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17) {
        C1913750ztt c1913750ztt = (C1913750ztt) C13LP.LJJJLZIJ(0, list);
        if (c1913750ztt != null) {
            C770770ULj c770770ULj = this.LLJ;
            c770770ULj.LIZIZ(c1913750ztt.LIZ);
            c770770ULj.LIZJ = new AwS394S0200000_28(awS596S0100000_17, c1913750ztt, 105);
            boolean z = c1913750ztt.LIZLLL;
            c770770ULj.LIZLLL = z;
            C197039127h c197039127h = c770770ULj.LIZ;
            if (c197039127h != null) {
                c197039127h.setEnabled(z);
            }
            C770750ULh c770750ULh = this.LLIZLLLIL;
            C770770ULj c770770ULj2 = this.LLJ;
            c770750ULh.LJIIIIZZ = c770770ULj2;
            c770750ULh.LJII = c770770ULj2.LJFF;
            c770750ULh.LJIIIZ = c770770ULj2.LIZJ;
        }
        C1913750ztt c1913750ztt2 = (C1913750ztt) C13LP.LJJJLZIJ(1, list);
        if (c1913750ztt2 != null) {
            C770770ULj c770770ULj3 = this.LLJ;
            c770770ULj3.LIZIZ(c1913750ztt2.LIZ);
            c770770ULj3.LIZJ = new AwS394S0200000_28(awS596S0100000_17, c1913750ztt2, 96);
            boolean z2 = c1913750ztt2.LIZLLL;
            c770770ULj3.LIZLLL = z2;
            C197039127h c197039127h2 = c770770ULj3.LIZ;
            if (c197039127h2 != null) {
                c197039127h2.setEnabled(z2);
            }
            C770750ULh c770750ULh2 = this.LLIZLLLIL;
            C770770ULj c770770ULj4 = this.LLJ;
            c770750ULh2.LJIIJJI = c770770ULj4;
            c770750ULh2.LJIIJ = c770770ULj4.LJFF;
            c770750ULh2.LJIIL = c770770ULj4.LIZJ;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iIntValue;
        C19GS c19gs;
        Integer numLIZJ;
        C1914080zuQ c1914080zuQLIZ = C1914080zuQ.LIZ(layoutInflater, viewGroup);
        this.LLIZ = c1914080zuQLIZ;
        ConstraintLayout constraintLayout = c1914080zuQLIZ.LL;
        Context context = constraintLayout.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        constraintLayout.setBackgroundColor(iIntValue);
        try {
            ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(constraintLayout, this);
            constraintLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return constraintLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return constraintLayout;
        }
    }
}
