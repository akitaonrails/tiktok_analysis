package com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default;

import X.C098200Yq;
import X.C1238130iKB;
import X.C1324840ka2;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C1914080zuQ;
import X.C19EG;
import X.C19GS;
import X.C929103k9;
import X.C985403tE;
import X.InterfaceC1320380kSq;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.StyleExtra;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupDialogUI extends UniversalPopupUI {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUiOmEmJiw6LD0gKSk8Jj8mHELIOSOGsvJj02ZjAlZys2LiQ5JTt9HSslPyohOyQgGSAjPTUIIC4/JyIZAA==";
    public C1397580mTM LLIZ;
    public C1397510mTF LLIZLLLIL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1397510mTF c1397510mTF = this.LLIZLLLIL;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void WR(String str) {
        C1397580mTM c1397580mTM = this.LLIZ;
        if (c1397580mTM == null) {
            c1397580mTM = null;
        }
        c1397580mTM.LJI(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJIIIIZZ = false;
        c1397580mTM.LJII = false;
        c1397580mTM.LJIILIIL = 1;
        this.LLIZ = c1397580mTM;
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void RR(Map<String, String> map, StyleExtra styleExtra) {
        if (this.LLIZLLLIL == null) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LJIIJJI();
            tuxImmersionBarLIZLLL.LIZLLL();
            C1397580mTM c1397580mTM = this.LLIZ;
            if (c1397580mTM == null) {
                c1397580mTM = null;
            }
            c1397580mTM.getClass();
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            this.LLIZLLLIL = c1397510mTF;
            c1397510mTF.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void SR(SpannableStringBuilder spannableStringBuilder, String str) {
        C1397580mTM c1397580mTM = this.LLIZ;
        if (c1397580mTM == null) {
            c1397580mTM = null;
        }
        c1397580mTM.LIZIZ(spannableStringBuilder);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void VR(String str, String str2) {
        if (a0.LJJJIL(str)) {
            return;
        }
        ImageView imageView = new ImageView(requireContext());
        C1324840ka2.LIZJ(imageView, NR(str, str2), InterfaceC1320380kSq.LIZ);
        C1397580mTM c1397580mTM = this.LLIZ;
        if (c1397580mTM == null) {
            c1397580mTM = null;
        }
        C929103k9.LIZ(c1397580mTM, imageView, null);
    }

    @Override // com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupUI
    public final void UR(List list, Boolean bool, AwS596S0100000_17 awS596S0100000_17) {
        C1397580mTM c1397580mTM = null;
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1397580mTM c1397580mTM2 = this.LLIZ;
            if (c1397580mTM2 != null) {
                c1397580mTM = c1397580mTM2;
            }
            C1238130iKB.LIZ(c1397580mTM, new AwS394S0200000_28(list, awS596S0100000_17, 101));
            return;
        }
        C1397580mTM c1397580mTM3 = this.LLIZ;
        if (c1397580mTM3 != null) {
            c1397580mTM = c1397580mTM3;
        }
        C985403tE.LIZ(c1397580mTM, new AwS394S0200000_28(list, awS596S0100000_17, 104));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = C1914080zuQ.LIZ(layoutInflater, viewGroup).LL;
        C19GS c19gs = null;
        if (!(constraintLayout instanceof View)) {
            constraintLayout = null;
        }
        if (constraintLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(constraintLayout, this);
                constraintLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return constraintLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return constraintLayout;
    }
}
