package com.ss.android.ugc.aweme.series.feed.seriescenter;

import X.C01GW;
import X.C098200Yq;
import X.C0RRR;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1581030rFF;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C2200821BBo;
import X.C452501pT;
import X.InterfaceC1253240iiY;
import X.InterfaceC1574020r3w;
import X.InterfaceC1577520r9a;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minidrama.common.component.tab.SeriesHomeTabStayTimeComponent;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
@InterfaceC836760Ws6
public final class SeriesCenterFragment extends BaseFragment implements InterfaceC1253240iiY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2sqLCo3HELIOSZjYpOyY2OyYpJzs2OmsfLD06LTYPLCEnLTcKOy40JSAiPQ==";
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 952));
    public SeriesHomeTabStayTimeComponent LLIZLLLIL;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((InterfaceC1574020r3w) this.LLIZ.getValue()).onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS264S0000000_24.get$arr$(293));
        ((InterfaceC1574020r3w) this.LLIZ.getValue()).onCreate();
        ((InterfaceC1574020r3w) this.LLIZ.getValue()).LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/series/feed/seriescenter/SeriesCenterFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcZbLz3wlT83a7Vi1cqJr+/+S2O9xBqeUWOMvDVCTPqnzSWtU4RItW8Plhw==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        SeriesHomeTabStayTimeComponent seriesHomeTabStayTimeComponent = this.LLIZLLLIL;
        if (seriesHomeTabStayTimeComponent != null) {
            seriesHomeTabStayTimeComponent.LLJI = z;
            if (z) {
                seriesHomeTabStayTimeComponent.LLJ = System.currentTimeMillis();
            } else {
                seriesHomeTabStayTimeComponent.LIZ();
            }
        }
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZ(this);
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(SeriesCenterFragment.class);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLJIILJJIL;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        super.onViewCreated(view, bundle);
        ((InterfaceC1574020r3w) this.LLIZ.getValue()).onViewCreated(view, bundle);
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
            strLJIILJJIL = interfaceC1577520r9aLIZIZ.LJIILJJIL();
        } else {
            strLJIILJJIL = null;
        }
        this.LLIZLLLIL = new SeriesHomeTabStayTimeComponent(this, strLJIILJJIL, "series_center");
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZIZ(this, "series_center");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZIZ = ((InterfaceC1574020r3w) this.LLIZ.getValue()).LIZIZ(layoutInflater, viewGroup);
        C19GS c19gs = null;
        if (!(viewLIZIZ instanceof View)) {
            viewLIZIZ = null;
        }
        if (viewLIZIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZIZ, this);
                viewLIZIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZIZ;
    }
}
