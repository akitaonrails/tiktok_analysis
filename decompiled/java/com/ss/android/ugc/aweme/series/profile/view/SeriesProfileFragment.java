package com.ss.android.ugc.aweme.series.profile.view;

import X.C098200Yq;
import X.C1155750gBJ;
import X.C1220000hqw;
import X.C13LE;
import X.C13LP;
import X.C14LC;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1567820qtw;
import X.C1572990r2H;
import X.C1573470r33;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C309690CBz;
import X.C338520DOw;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1257980iqC;
import X.InterfaceC737090Svj;
import Y.ARunnableS93S0200000_24;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.series.feed.profile.viewmodel.SeriesProfileTabViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS38S0000100_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesProfileFragment extends ProfileListFragment implements InterfaceC737090Svj, InterfaceC1257980iqC {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2s8HELIOSOyA1ISkpZzk6LTJiGiohISA/GT08LiwgLAkhKSIhLCEn";
    public final String LLILZLL = UUID.randomUUID().toString();
    public String LLIZ = "";
    public final C736950SvV LLIZLLLIL;
    public C1573470r33 LLJ;
    public final CopyOnWriteArrayList<Runnable> LLJI;

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC1257980iqC
    public final void q3(boolean z) {
    }

    public SeriesProfileFragment() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 1053);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(SeriesProfileTabViewModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(326), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJI = new CopyOnWriteArrayList<>();
    }

    @Override // X.InterfaceC1257980iqC
    public final void LJFF() {
        C1573470r33 c1573470r33WS = wS();
        if (c1573470r33WS != null) {
            c1573470r33WS.LIZIZ.manualListRefresh();
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        View view;
        View viewFindViewById;
        C1573470r33 c1573470r33WS = wS();
        if (c1573470r33WS != null && (view = c1573470r33WS.LIZLLL) != null && (viewFindViewById = view.findViewById(R.id.us_)) != null) {
            return viewFindViewById;
        }
        View view2 = getView();
        if (view2 != null) {
            return view2.findViewById(R.id.us_);
        }
        return null;
    }

    @Override // X.InterfaceC737090Svj
    public final boolean W0() {
        C1573470r33 c1573470r33WS = wS();
        if (c1573470r33WS == null) {
            return false;
        }
        c1573470r33WS.LIZIZ.manualListRefresh();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJI.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1573470r33 c1573470r33WS = wS();
        if (c1573470r33WS != null) {
            c1573470r33WS.LIZLLL = null;
        }
    }

    public final C1573470r33 wS() {
        if (getContext() == null || !isAdded() || isDetached()) {
            return null;
        }
        if (this.LLJ == null) {
            this.LLJ = new C1573470r33(this, this.LLILZLL, (SeriesProfileTabViewModel) this.LLIZLLLIL.getValue());
        }
        return this.LLJ;
    }

    @Override // X.InterfaceC1257980iqC
    public final void PB(String str) {
        if (!Intrinsics.LJFF(this.LLIZ, str)) {
            this.LLIZ = str;
            C1573470r33 c1573470r33WS = wS();
            if (c1573470r33WS != null) {
                SeriesProfileTabViewModel seriesProfileTabViewModel = c1573470r33WS.LIZIZ;
                seriesProfileTabViewModel.LLILLJJLI.clear();
                seriesProfileTabViewModel.manualListRefresh();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (viewLJJLIIIJILLIZJL == null) {
            return;
        }
        if (viewLJJLIIIJILLIZJL instanceof RecyclerView) {
            if (z) {
                ((RecyclerView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
                return;
            } else {
                ((RecyclerView) viewLJJLIIIJILLIZJL).scrollToPosition(0);
                return;
            }
        }
        if (viewLJJLIIIJILLIZJL instanceof ScrollView) {
            ((ScrollView) viewLJJLIIIJILLIZJL).scrollTo(0, 0);
        } else {
            if (!(viewLJJLIIIJILLIZJL instanceof ListView)) {
                return;
            }
            if (z) {
                ((ListView) viewLJJLIIIJILLIZJL).smoothScrollToPosition(0);
            } else {
                viewLJJLIIIJILLIZJL.scrollTo(0, 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        wS();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        String string;
        Long lLJIILIIL;
        long j;
        super.onCreate(bundle);
        Bundle arguments2 = getArguments();
        long jLongValue = 0;
        if (arguments2 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                j = arguments3.getLong("CreatorUid");
            } else {
                j = 0;
            }
            C786410Ut5.LJJJI("USER_ID", String.valueOf(j), arguments2);
        }
        C1573470r33 c1573470r33WS = wS();
        if (c1573470r33WS != null) {
            Fragment fragment = c1573470r33WS.LJFF.get();
            if (fragment != null && (arguments = fragment.getArguments()) != null && (string = arguments.getString("USER_ID")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string)) != null) {
                jLongValue = lLJIILIIL.longValue();
            }
            c1573470r33WS.LJ = jLongValue;
        }
        CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = this.LLJI;
        Iterator it2 = C13LP.LLIIII(copyOnWriteArrayList).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        copyOnWriteArrayList.clear();
    }

    @Override // X.InterfaceC1257980iqC
    public final void za(MiniUser miniUser) {
        ARunnableS93S0200000_24 aRunnableS93S0200000_24 = new ARunnableS93S0200000_24(this, miniUser, 27);
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            aRunnableS93S0200000_24.run();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runWhenPageReady, run directly: ");
            sbLIZ.append("onUserUpdated");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LLJI.add(aRunnableS93S0200000_24);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("runWhenPageReady, add to pending queue: ");
        sbLIZ2.append("onUserUpdated");
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void nS(String str, String str2) {
        super.nS(str, str2);
        C1573470r33 c1573470r33WS = wS();
        if (c1573470r33WS != null) {
            SeriesProfileTabViewModel seriesProfileTabViewModel = c1573470r33WS.LIZIZ;
            seriesProfileTabViewModel.LL.postValue(new C1567820qtw<>(Boolean.valueOf(Intrinsics.LJFF(str, String.valueOf(((C1572990r2H) seriesProfileTabViewModel.getState()).LL)))));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int iLIZIZ;
        boolean z2;
        Bundle arguments;
        super.onViewCreated(view, bundle);
        Bundle arguments2 = getArguments();
        boolean z3 = true;
        if (arguments2 != null && arguments2.getBoolean("EXTRA_IS_MY_PROFILE")) {
            z = true;
        } else {
            z = false;
        }
        if (z && (arguments = getArguments()) != null && arguments.getBoolean("EXTRA_IS_FROM_MAIN_STATE")) {
            boolean z4 = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            iLIZIZ = C14LC.LIZIZ();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iLIZIZ);
        C1573470r33 c1573470r33WS = wS();
        if (c1573470r33WS != null) {
            SeriesProfileTabViewModel seriesProfileTabViewModel = c1573470r33WS.LIZIZ;
            long j = c1573470r33WS.LJ;
            seriesProfileTabViewModel.getClass();
            seriesProfileTabViewModel.setState(new AwS38S0000100_24(j, 1));
            Fragment fragment = c1573470r33WS.LJFF.get();
            if (fragment != null) {
                SeriesProfileTabViewModel seriesProfileTabViewModel2 = c1573470r33WS.LIZIZ;
                Bundle arguments3 = fragment.getArguments();
                if (arguments3 != null && arguments3.getBoolean("EXTRA_IS_MY_PROFILE")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                seriesProfileTabViewModel2.getClass();
                seriesProfileTabViewModel2.setState(new AwS36S0010000_24(z2, 31));
                SeriesProfileTabViewModel seriesProfileTabViewModel3 = c1573470r33WS.LIZIZ;
                Bundle arguments4 = fragment.getArguments();
                if (arguments4 == null || !arguments4.getBoolean("EXTRA_IS_FROM_MAIN_STATE")) {
                    z3 = false;
                }
                seriesProfileTabViewModel3.getClass();
                seriesProfileTabViewModel3.setState(new AwS36S0010000_24(z3, 30));
                C1155750gBJ c1155750gBJ = new C1155750gBJ(c1573470r33WS.LIZ, c1573470r33WS.LIZJ);
                C1554960qZC.LIZ(C1558360qeg.LJFF(fragment, null), c1155750gBJ, C1155750gBJ.class, "source_default_key");
                C723850SaN.LIZ(fragment, false, null, new AwS390S0200000_24(fragment, c1155750gBJ, 122), 3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C1573470r33 c1573470r33WS = wS();
        C19GS c19gs = null;
        if (c1573470r33WS != null) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.bi5, viewGroup, false);
            c1573470r33WS.LIZLLL = viewTd;
        } else {
            viewTd = null;
        }
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
