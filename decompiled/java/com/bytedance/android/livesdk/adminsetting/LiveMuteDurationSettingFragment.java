package com.bytedance.android.livesdk.adminsetting;

import X.C098200Yq;
import X.C0TVI;
import X.C1161920gLG;
import X.C14K9;
import X.C1685300txQ;
import X.C16FZ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C500260Jjc;
import X.C745220TLc;
import X.C745260TLg;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMuteDurationSettingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTHELIOSE4ICE0ZgklPyoePTEpDTohKTElJiEALTE4ICE0DjctLiI2JjE=";
    public C16FZ LL;
    public FrameLayout LLILLJJLI;
    public RecyclerView LLILLL;
    public C745220TLc LLILZ;
    public C745220TLc LLILZIL;
    public View.OnClickListener LLILZLL;
    public Function1<? super C745220TLc, Unit> LLIZ;

    public final RecyclerView NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gci) : null;
            this.LLILLL = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final C16FZ getLoadingViewFromXml() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nnp) : null;
            this.LL = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C745220TLc c745220TLc = this.LLILZ;
        if (c745220TLc != null) {
            Function1<? super C745220TLc, Unit> function1 = this.LLIZ;
            if (function1 != null) {
                function1.invoke(c745220TLc);
            }
            this.LLILZ = null;
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C500260Jjc.LLFFF(getLoadingViewFromXml());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (view.getContext().getResources().getDisplayMetrics().heightPixels * 73) / 100;
            C786410Ut5.W5(view, layoutParams);
        }
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.O7((FrameLayout) viewFindViewById, this.LLILZLL);
        NR().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        C745260TLg c745260TLg = new C745260TLg(getContext(), true);
        c745260TLg.LLILZLL = new AwS378S0200000_12(this, c745260TLg, 14);
        NR().setAdapter(c745260TLg);
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).OP1(new AwS378S0200000_12(this, c745260TLg, 15));
        C14K9.LJIJJ(NR(), new C0TVI() { // from class: X.0TYE
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                float fLIZIZ;
                if (c20246014Ju.LIZ.LJIIJ().LIZLLL > 0) {
                    fLIZIZ = C497740JfY.LIZIZ(12.0f);
                } else {
                    fLIZIZ = C497740JfY.LIZIZ(28.0f);
                }
                view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), (int) fLIZIZ);
                return c20246014Ju;
            }
        });
        C20097313kJ.LIZJ(NR());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gag, viewGroup, false);
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
