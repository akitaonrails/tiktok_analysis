package com.ss.android.ugc.aweme.minidrama.common.component.limitedfree;

import X.C01GW;
import X.C098200Yq;
import X.C1361400lX0;
import X.C14MI;
import X.C1573890r3j;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C452501pT;
import X.C497820Jfg;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1578890rBn;
import Y.ACListenerS126S0200000_24;
import Y.ACListenerS158S0100000_24;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class BlockingLimitedFreeFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyY3OiQhKGEwJyghJiF9KyohOSHELIOSA9LSs4ZyM6JSw4LCs1OiApZw0/JyYnICE0BCwhIDs2LAM+LCoVOiQrJCo9PA==";
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final C01GW LLILZ;
    public AppCompatImageView LLILZIL;
    public TuxIconView LLILZLL;
    public C197039127h LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;

    public BlockingLimitedFreeFragment() {
        this(null, true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ISeriesLimitedFreeService iSeriesLimitedFreeService = (ISeriesLimitedFreeService) this.LLILZ.getValue();
        if (iSeriesLimitedFreeService != null) {
            iSeriesLimitedFreeService.LJIIJJI(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        ISeriesLimitedFreeService iSeriesLimitedFreeService = (ISeriesLimitedFreeService) this.LLILZ.getValue();
        if (iSeriesLimitedFreeService != null) {
            iSeriesLimitedFreeService.LJIIJJI(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i;
        int i2;
        int i3;
        super.onViewCreated(view, bundle);
        ISeriesLimitedFreeService iSeriesLimitedFreeService = (ISeriesLimitedFreeService) this.LLILZ.getValue();
        if (iSeriesLimitedFreeService != null) {
            iSeriesLimitedFreeService.LJIIJJI(true);
        }
        this.LLIZ = (C197039127h) view.findViewById(R.id.upgrade_button);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.urn);
        this.LLILZIL = (AppCompatImageView) view.findViewById(R.id.bn2);
        this.LLIZLLLIL = view.findViewById(R.id.bwd);
        this.LLJ = view.findViewById(R.id.bwe);
        this.LLJI = view.findViewById(R.id.bwf);
        View viewFindViewById = view.findViewById(R.id.bwg);
        this.LLJIJIL = viewFindViewById;
        int i4 = 0;
        if (viewFindViewById != null) {
            if (this.LLILLJJLI) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, viewFindViewById);
        }
        View view2 = this.LLIZLLLIL;
        if (view2 != null) {
            if (!this.LLILLJJLI) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view2);
        }
        View view3 = this.LLJ;
        if (view3 != null) {
            if (!this.LLILLJJLI) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view3);
        }
        View view4 = this.LLJI;
        if (view4 != null) {
            if (!(true ^ this.LLILLJJLI)) {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, view4);
        }
        C197039127h c197039127h = this.LLIZ;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS126S0200000_24(this, view, 4));
        }
        AppCompatImageView appCompatImageView = this.LLILZIL;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(EnumC1578890rBn.BACK_ICON.id());
        }
        MiniDramaHostService.LIZ.getClass();
        MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
        if (miniDramaHostServiceLIZ != null) {
            miniDramaHostServiceLIZ.LIZ();
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if (this.LL) {
            Context context = getContext();
            if (context != null) {
                int iLIZJ = C497820Jfg.LIZJ(context);
                AppCompatImageView appCompatImageView2 = this.LLILZIL;
                if (appCompatImageView2 != null) {
                    layoutParams = appCompatImageView2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.topMargin = iLIZJ;
                }
            }
            AppCompatImageView appCompatImageView3 = this.LLILZIL;
            if (appCompatImageView3 != null) {
                C786410Ut5.V7(appCompatImageView3, new ACListenerS158S0100000_24(this, 25));
            }
        } else {
            AppCompatImageView appCompatImageView4 = this.LLILZIL;
            if (appCompatImageView4 != null) {
                C786410Ut5.LLILIL(appCompatImageView4, 8);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            TuxIconView tuxIconView = this.LLILZLL;
            if (tuxIconView != null) {
                layoutParams2 = tuxIconView.getLayoutParams();
            }
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams.topMargin = ((C497820Jfg.LIZ(context2) - C497820Jfg.LIZJ(context2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(291))) / 2;
            }
        }
        Drawable drawableLIZ = C14MI.LIZ(new C1361400lX0(getContext(), R.style.y0), R.drawable.d5v);
        TuxIconView tuxIconView2 = this.LLILZLL;
        if (tuxIconView2 != null) {
            tuxIconView2.setBackground(drawableLIZ);
        }
        TuxIconView tuxIconView3 = this.LLILZLL;
        if (tuxIconView3 != null) {
            tuxIconView3.setIconRes(EnumC1578890rBn.ICON_SERIES_FILL.id());
        }
    }

    public BlockingLimitedFreeFragment(Function0 function0, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = function0;
        this.LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(601));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bgk, viewGroup, false);
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
