package com.ss.android.ugc.aweme.series.feed.mylist;

import X.C01GW;
import X.C098200Yq;
import X.C0RRR;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1559090qfr;
import X.C1570210qxn;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C296920BkQ;
import X.C452501pT;
import X.C723850SaN;
import X.C786410Ut5;
import X.EnumC1573550r3B;
import X.InterfaceC1577520r9a;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minidrama.common.component.tab.SeriesHomeTabStayTimeComponent;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC836760Ws6
public final class HistoryListFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2HELIOSsqLCo3Zig1JSYgPGsEIDwnJzc1BSYgPAM+KCg+LSs4";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.optionalArgNotNull(this, AFwS264S0000000_24.get$arr$(282), Scene.SCENE_SERVICE, String.class);
    public final C01GW LLIZLLLIL;
    public SeriesHomeTabStayTimeComponent LLJ;

    public HistoryListFragment() {
        UUID.randomUUID().toString();
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 918));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS264S0000000_24.get$arr$(281));
        C1570210qxn c1570210qxn = (C1570210qxn) this.LLIZLLLIL.getValue();
        c1570210qxn.getClass();
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent.LJIIJJI(MiniDramaPagePerformanceMonitor.LIZ(EnumC1573550r3B.MY_LIST));
        Fragment fragment = c1570210qxn.LIZ;
        C1554960qZC.LIZ(C1558360qeg.LJFF(fragment, null), (C1559090qfr) c1570210qxn.LIZLLL.getValue(), C1559090qfr.class, "source_default_key");
        C723850SaN.LIZ(fragment, false, null, new AwS390S0200000_24(fragment, c1570210qxn, 73), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/series/feed/mylist/HistoryListFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wlT83a7UapbKJ9/LK/3+hgK9t9GrHW11SkJRWfiYah", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        SeriesHomeTabStayTimeComponent seriesHomeTabStayTimeComponent = this.LLJ;
        if (seriesHomeTabStayTimeComponent != null) {
            seriesHomeTabStayTimeComponent.LLJI = z;
            if (z) {
                seriesHomeTabStayTimeComponent.LLJ = System.currentTimeMillis();
            } else {
                seriesHomeTabStayTimeComponent.LIZ();
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(HistoryListFragment.class);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLJIILJJIL;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        super.onViewCreated(view, bundle);
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
            strLJIILJJIL = interfaceC1577520r9aLIZIZ.LJIILJJIL();
        } else {
            strLJIILJJIL = null;
        }
        this.LLJ = new SeriesHomeTabStayTimeComponent(this, strLJIILJJIL, "series_mylist");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        this.LLIZLLLIL.getValue().getClass();
        MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.MY_LIST).LJIIL();
        if (C296920BkQ.LIZ()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.f5j, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.f5i, viewGroup, false);
        }
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
