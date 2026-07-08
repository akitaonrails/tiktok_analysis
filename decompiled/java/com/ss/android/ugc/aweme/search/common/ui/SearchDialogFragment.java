package com.ss.android.ugc.aweme.search.common.ui;

import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1308910kAL;
import X.C1338610kwF;
import X.C1685300txQ;
import X.C1848410yCV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21590419eY;
import X.C2187451AjH;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C452501pT;
import X.C497270Jen;
import X.C616540OGe;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC21590819ec;
import X.InterfaceC679410Qkt;
import Y.ACListenerS163S0100000_29;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.ui.SearchDialogFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import mf.a;

/* JADX INFO: loaded from: classes30.dex */
public final class SearchDialogFragment extends AmeBaseFragment implements InterfaceC679410Qkt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGHELIOSsvJiI+JytiPCZ9GyAtOyw7DCwtJSA0DjctLiI2JjE=";
    public C21590419eY LL;
    public ViewGroup LLILLJJLI;
    public ViewGroup LLILLL;
    public ViewGroup LLILZ;
    public TextView LLILZIL;
    public AppCompatTextView LLILZLL;
    public View LLIZ;
    public TextView LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(124));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 191));

    public SearchDialogFragment() {
        new AwS608S0100000_29(this, 140);
    }

    public final void MR() {
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.requestFocus();
        }
        View view3 = getView();
        if (view3 != null) {
            view3.setOnKeyListener(new View.OnKeyListener() { // from class: X.1131
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view4, int i, KeyEvent keyEvent) {
                    SearchDialogFragment searchDialogFragment;
                    C21590419eY c21590419eY;
                    if (i != 4) {
                        return false;
                    }
                    C19EG activity = this.LL.getActivity();
                    if (activity != null && !activity.isFinishing() && (searchDialogFragment = (SearchDialogFragment) activity.getSupportFragmentManager().LJJJJZI("com.ss.android.ugc.aweme.discover.ui.SearchDialogFragment")) != null && (c21590419eY = searchDialogFragment.LL) != null) {
                        c21590419eY.LIZ(false, true);
                    }
                    return true;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(SearchDialogFragment.class.getName());
        }
        super.onResume();
        MR();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/search/common/ui/SearchDialogFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzyAj5DuM6qcmwXQPuBX7QElE2DgHMOCfj/F05/fBM=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!isHidden()) {
            MR();
        }
    }

    @Override // X.InterfaceC679410Qkt
    public final void LLJLL(float f, float f2) {
        Integer numLIZJ;
        float f3 = (f * 1.0f) / f2;
        if (f3 < 0.0f) {
            return;
        }
        int iIntValue = 0;
        int iIntValue2 = ((Integer) ((ArgbEvaluator) this.LLJI.getValue()).evaluate(f3, 0, Integer.valueOf(((Number) this.LLJIJIL.getValue()).intValue()))).intValue();
        try {
            ViewGroup viewGroup = this.LLILLL;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(iIntValue2);
            }
            Context context = getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                Context context2 = getContext();
                if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2)) != null) {
                    iIntValue = numLIZJ.intValue();
                }
            } else {
                iIntValue = 8421504;
            }
            C497270Jen.LIZLLL(iIntValue, getActivity());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        AppCompatTextView appCompatTextView;
        TextView textView;
        super.onViewCreated(view, bundle);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.eqx);
        this.LL = (C21590419eY) view.findViewById(R.id.trr);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.y0w);
        this.LLILZIL = (TextView) view.findViewById(R.id.e24);
        this.LLILZLL = (AppCompatTextView) view.findViewById(R.id.eos);
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.fsn);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.fti);
        C1338610kwF c1338610kwF = (C1338610kwF) view.findViewById(R.id.fsy);
        if (c1338610kwF != null) {
            c1338610kwF.setNestedScrollingParent(this.LL);
        }
        ViewGroup viewGroup = this.LLILLJJLI;
        int iIntValue = 0;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
            } else {
                layoutParams = null;
            }
            C786410Ut5.X5(layoutParams, viewGroup);
        }
        if (!TextUtils.isEmpty(null) && (textView = this.LLILZIL) != null) {
            textView.setText((CharSequence) null);
        }
        ACListenerS163S0100000_29 aCListenerS163S0100000_29 = new ACListenerS163S0100000_29(this, 293);
        TextView textView2 = this.LLILZIL;
        if (textView2 != null) {
            C786410Ut5.T7(textView2, new ACListenerS163S0100000_29(this, 71));
        }
        C21590419eY c21590419eY = this.LL;
        if (c21590419eY != null) {
            c21590419eY.setOnCancelListener(aCListenerS163S0100000_29);
        }
        if (!TextUtils.isEmpty(null) && (appCompatTextView = this.LLILZLL) != null) {
            appCompatTextView.setText((CharSequence) null);
        }
        AppCompatTextView appCompatTextView2 = this.LLILZLL;
        if (appCompatTextView2 != null) {
            View.OnClickListener aCListenerS163S0100000_292 = new ACListenerS163S0100000_29(this, 292);
            if (C1848410yCV.LIZ) {
                aCListenerS163S0100000_292 = new f(aCListenerS163S0100000_292);
            }
            a aVar = new a(aCListenerS163S0100000_292);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(appCompatTextView2);
            }
            appCompatTextView2.setOnClickListener(aVar);
        }
        getActivity();
        TextView textView3 = this.LLIZLLLIL;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
        }
        ViewGroup viewGroup2 = this.LLILZ;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        this.LLIZ = view.findViewById(R.id.view_divider);
        if (getContext() != null) {
            AppCompatTextView appCompatTextView3 = this.LLILZLL;
            if (appCompatTextView3 != null) {
                Context context = getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                }
                appCompatTextView3.setTextColor(iIntValue);
            }
            AppCompatTextView appCompatTextView4 = this.LLILZLL;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setClickable(true);
            }
        }
        C21590419eY c21590419eY2 = this.LL;
        if (c21590419eY2 != null) {
            c21590419eY2.setMOnShowHeightChangeListener(this);
            C21590419eY c21590419eY3 = this.LL;
            if (c21590419eY3 != null) {
                c21590419eY3.setOnDialogListener(new InterfaceC21590819ec() { // from class: X.1132
                    @Override // X.InterfaceC21590819ec
                    public final void LIZ(boolean z) {
                        C19EG activity;
                        FragmentManager supportFragmentManager;
                        Fragment fragmentLJJJJZI;
                        C19EH c19ehLJIIJ;
                        if (!z && (activity = this.LIZ.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("com.ss.android.ugc.aweme.discover.ui.SearchDialogFragment")) != null && supportFragmentManager != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                            c19ehLJIIJ.LJIILL(fragmentLJJJJZI);
                            c19ehLJIIJ.LJIIJ();
                        }
                    }
                });
            }
            C21590419eY c21590419eY4 = this.LL;
            if (c21590419eY4 != null) {
                c21590419eY4.LIZ(true, true);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ex6, viewGroup, false);
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
