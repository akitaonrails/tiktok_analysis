package com.ss.android.ugc.aweme.captionsheet;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C0XQ7;
import X.C10F8;
import X.C1238760iLC;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1260870iur;
import X.C1619980sG4;
import X.C1685300txQ;
import X.C189200o6;
import X.C19323610io;
import X.C19EG;
import X.C19GS;
import X.C1E8U;
import X.C20693015yC;
import X.C20698415z4;
import X.C20703515zt;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C708050Rpz;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1058150ddt;
import X.InterfaceC20698115z1;
import Y.ALAdapterS12S0100000_16;
import Y.AUListenerS223S0200000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseCaptionSheetFragment extends Fragment implements InterfaceC1058150ddt {
    public C20698415z4 LLILLJJLI;
    public C1238760iLC LLILZIL;
    public boolean LLIZ;
    public final C01GW LL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 324));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 325));
    public final boolean LLILZ = true;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(96));

    public abstract C20693015yC SR();

    public abstract View VR(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract String getTitle();

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public boolean PR() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    public C0OM1 Sn() {
        Fragment parentFragment;
        FragmentManager childFragmentManager;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getTitle();
        c0om1.LIZJ = c1250250idj;
        try {
            parentFragment = getParentFragment();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (parentFragment != null && (childFragmentManager = parentFragment.getChildFragmentManager()) != null) {
            if (childFragmentManager.LJJLIIIIJ() == 0) {
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZJ(new AwS575S0100000_31(this, 323));
                c0om1.LIZIZ(c1251150ifB);
                return c0om1;
            }
        }
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB2.LIZJ(new AwS575S0100000_31(this, 322));
        c0om1.LJ(c1251150ifB2);
        return c0om1;
    }

    public final void UR() {
        C20703515zt.LIZ.getClass();
        String strLJII = C20703515zt.LJII(C20703515zt.LIZIZ.LLIIZ());
        C20693015yC c20693015yCSR = SR();
        if (c20693015yCSR != null) {
            C1238760iLC c1238760iLC = new C1238760iLC(new C19323610io(getString(2131828779), null, null, null, false, null, null, strLJII, false, false, null, null, false, false, null, null, null, 16777086));
            this.LLILZIL = c1238760iLC;
            c20693015yCSR.LIZ(c1238760iLC);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C708050Rpz(this, null), 3);
    }

    public final void MR() {
        int i;
        if (PR() && (i = requireView().getLayoutParams().height) != -2) {
            requireView().measure(View.MeasureSpec.makeMeasureSpec(requireView().getMeasuredWidth(), 1073741824), -2);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, requireView().getMeasuredHeight());
            valueAnimatorOfInt.setDuration(400L);
            valueAnimatorOfInt.setInterpolator(C1619980sG4.LJI());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS223S0200000_16(this, valueAnimatorOfInt, 1));
            valueAnimatorOfInt.addListener(new ALAdapterS12S0100000_16(this, 3));
            valueAnimatorOfInt.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (RR()) {
            MR();
        }
    }

    public boolean RR() {
        return this.LLILZ;
    }

    public final void OR(final Function1<? super PushSettings, Unit> function1) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        ((C1260870iur) this.LLILZLL.getValue()).LJIIJJI(new C10F8() { // from class: X.10eT
            @Override // X.C10F8
            public final void Hl(PushSettings pushSettings) {
                function1.invoke(pushSettings);
            }

            @Override // X.C10F8
            public final void onFailed(Exception exc) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIIZ(R.string.m25);
                c1389890mGx.LJIIJJI();
            }
        });
        ((C1260870iur) this.LLILZLL.getValue()).LIZJ(new Object[0]);
    }

    public void WR(String str) {
        C1238760iLC c1238760iLC;
        C20703515zt.LIZ.getClass();
        String strLJII = C20703515zt.LJII(str);
        if (strLJII != null && (c1238760iLC = this.LLILZIL) != null) {
            c1238760iLC.LJIIIIZZ(strLJII);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        InterfaceC20698115z1 interfaceC20698115z1;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 != null && (interfaceC20698115z1 = c20698415z4.LIZ) != null) {
            interfaceC20698115z1.LLLFFI(tuxSheet, f);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        InterfaceC20698115z1 interfaceC20698115z1;
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 != null && (interfaceC20698115z1 = c20698415z4.LIZ) != null) {
            interfaceC20698115z1.LLLLIIIILLL(tuxSheet, i);
        }
    }

    public ViewGroup NR(ViewGroup viewGroup, C19EG c19eg) {
        int measuredHeight;
        int iLIZIZ;
        int i;
        LinearLayout linearLayout = new LinearLayout(c19eg);
        linearLayout.setOrientation(1);
        if (!PR()) {
            Context contextRequireContext = requireContext();
            measuredHeight = C814420VxA.LIZ(((double) (C497820Jfg.LIZ(contextRequireContext) - C497820Jfg.LIZJ(contextRequireContext))) * 0.55d);
        } else if (viewGroup != null && viewGroup.getMeasuredHeight() != 0) {
            measuredHeight = viewGroup.getMeasuredHeight();
        } else {
            measuredHeight = -2;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, measuredHeight);
        if (this.LLIZ) {
            iLIZIZ = 0;
        } else if (C1E8U.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        linearLayout.setPadding(0, 0, 0, iLIZIZ);
        C786410Ut5.d6(linearLayout, layoutParams);
        if (C1E8U.LIZ()) {
            i = 166;
        } else {
            i = 268;
        }
        linearLayout.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
        return linearLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InterfaceC20698115z1 interfaceC20698115z1;
        super.onViewCreated(view, bundle);
        C20698415z4 c20698415z4 = this.LLILLJJLI;
        if (c20698415z4 != null && (interfaceC20698115z1 = c20698415z4.LIZ) != null) {
            interfaceC20698115z1.yu();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroupNR = NR(viewGroup, requireActivity());
        C19GS c19gs = null;
        TuxNavBar tuxNavBar = new TuxNavBar(requireActivity(), null, 6);
        C786410Ut5.S6(tuxNavBar, new ViewGroup.LayoutParams(-1, -2));
        tuxNavBar.setNavActions(Sn());
        viewGroupNR.addView(tuxNavBar);
        viewGroupNR.addView(VR(layoutInflater, viewGroupNR));
        try {
            ViewTreeLifecycleOwner.set(viewGroupNR, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewGroupNR, this);
            viewGroupNR.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewGroupNR;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewGroupNR;
        }
    }
}
