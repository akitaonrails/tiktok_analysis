package com.ss.android.ugc.aweme.search.pages.result.bot.ui.feedback;

import X.C098200Yq;
import X.C0DKC;
import X.C0I7D;
import X.C0OM1;
import X.C0P2H;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C661350Pwr;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.InterfaceC344240DeY;
import X.ViewTreeObserverOnGlobalLayoutListenerC636610Oy3;
import Y.ACListenerS144S0100000_9;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.search.pages.result.bot.ui.feedback.TakoFeedbackSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import u4.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class TakoFeedbackSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmJDHELIOSFiKyAnZjAlZyk2LSEuKCw4ZhEtIiAVLSAoKy4wIxYkLConDjctLiI2JjE=";
    public C0I7D LL;
    public C197039127h LLILLJJLI;
    public RecyclerView LLILLL;
    public View LLILZIL;
    public ViewTreeObserverOnGlobalLayoutListenerC636610Oy3 LLILZLL;
    public String LLIZ;
    public boolean LLILZ = true;
    public int LLIZLLLIL = -1;

    public final C197039127h MR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.cm6) : null;
            this.LLILLJJLI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C0I7D NR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hcg) : null;
            this.LL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131828537);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 1458));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            View view = this.LLILZIL;
            if (view != null) {
                ViewTreeObserverOnGlobalLayoutListenerC636610Oy3 viewTreeObserverOnGlobalLayoutListenerC636610Oy3 = this.LLILZLL;
                if (viewTreeObserverOnGlobalLayoutListenerC636610Oy3 != null) {
                    C786410Ut5.C3(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC636610Oy3);
                }
                q0.LJJII(view, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            C0I7D c0i7dNR = NR();
            if (c0i7dNR != null) {
                c0i7dNR.requestFocus();
            }
            View view = this.LLILZIL;
            if (view != null) {
                ViewTreeObserverOnGlobalLayoutListenerC636610Oy3 viewTreeObserverOnGlobalLayoutListenerC636610Oy3 = this.LLILZLL;
                if (viewTreeObserverOnGlobalLayoutListenerC636610Oy3 != null) {
                    C786410Ut5.x3(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC636610Oy3);
                }
                q0.LJJII(view, null);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.0Oy3] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        boolean z;
        DialogFragment dialogFragment;
        Window window;
        super.onViewCreated(view, bundle);
        this.LLILZIL = view;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_is_satisfied");
        } else {
            z = true;
        }
        this.LLILZ = z;
        if (z) {
            C0I7D c0i7dNR = NR();
            if (c0i7dNR != null) {
                c0i7dNR.setHint(getString(2131828536));
            }
            C197039127h c197039127hMR = MR();
            if (c197039127hMR != null) {
                C661350Pwr.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), c197039127hMR);
            }
        } else {
            C0I7D c0i7dNR2 = NR();
            if (c0i7dNR2 != null) {
                c0i7dNR2.setHint(getString(2131828535));
            }
            View viewFindViewById = this.LLILLL;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.tub);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLL = (RecyclerView) viewFindViewById;
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            if (recyclerView != null) {
                FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
                flexboxLayoutManager.LJJII(1);
                flexboxLayoutManager.LJJIFFI(0);
                flexboxLayoutManager.LJJI(4);
                flexboxLayoutManager.LJJIII(0);
                recyclerView.setLayoutManager(flexboxLayoutManager);
                Context context = getContext();
                if (context != null) {
                    C0P2H c0p2h = new C0P2H(context);
                    c0p2h.LJ(C800330VaR.LIZIZ(context, R.drawable.d3p));
                    c0p2h.LLILLJJLI = 3;
                    recyclerView.addItemDecoration(c0p2h);
                }
                recyclerView.setAdapter(new C0DKC(getContext(), new AwS588S0100000_9(this, 6)));
            }
            C197039127h c197039127hMR2 = MR();
            if (c197039127hMR2 != null) {
                C661350Pwr.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), c197039127hMR2);
            }
        }
        C197039127h c197039127hMR3 = MR();
        if (c197039127hMR3 != null) {
            C786410Ut5.U8(c197039127hMR3, new ACListenerS144S0100000_9(this, 6));
        }
        Fragment parentFragment = getParentFragment();
        if ((parentFragment instanceof TuxSheet) && (dialogFragment = (DialogFragment) parentFragment) != null) {
            if (Build.VERSION.SDK_INT < 30) {
                this.LLILZLL = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0Oy3
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        TakoFeedbackSheetFragment takoFeedbackSheetFragment = this.LL;
                        View view3 = view;
                        if (takoFeedbackSheetFragment.getContext() != null) {
                            int iLIZ = C14KI.LIZ(takoFeedbackSheetFragment.getContext());
                            Rect rect = new Rect();
                            view3.getWindowVisibleDisplayFrame(rect);
                            view3.getGlobalVisibleRect(new Rect());
                            int i = iLIZ - rect.bottom;
                            boolean z2 = i > 0;
                            View view4 = (View) view3.getParent();
                            if (view4 != null) {
                                view4.getHeight();
                            }
                            view3.getLayoutParams();
                            if (i != takoFeedbackSheetFragment.LLIZLLLIL) {
                                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), z2 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + i : 0);
                                view3.requestLayout();
                            }
                            takoFeedbackSheetFragment.LLIZLLLIL = i;
                        }
                    }
                };
            }
            Dialog dialog = dialogFragment.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setSoftInputMode(5);
            }
            C0I7D c0i7dNR3 = NR();
            if (c0i7dNR3 != null) {
                c0i7dNR3.setFocusable(true);
            }
            C0I7D c0i7dNR4 = NR();
            if (c0i7dNR4 != null) {
                c0i7dNR4.setFocusableInTouchMode(true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.exh, viewGroup, false);
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
