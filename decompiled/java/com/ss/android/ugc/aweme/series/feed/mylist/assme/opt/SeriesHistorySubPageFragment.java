package com.ss.android.ugc.aweme.series.feed.mylist.assme.opt;

import X.C01GW;
import X.C098200Yq;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1559170qfz;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesHistorySubPageFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpOyY2O2sqLCo3Zig1JSYgHELIOSPGstOjw+LWsjOTt9GyA+ICogACw/PSAhMRY5Kx8yLyAKOy40JSAiPQ==";
    public View LL;
    public final String LLILLJJLI = UUID.randomUUID().toString();
    public final C01GW LLILLL;

    public SeriesHistorySubPageFragment() {
        new AwS568S0100000_24(this, 932);
        C13LE.LIZ(SeriesHistorySubPageViewModel.class);
        AFwS264S0000000_24.get$arr$(287);
        new C451460Hn6(this, false);
        new C451620HnM(this, true);
        new C338520DOw(this);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        C1220000hqw.LIZ(this);
        this.LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 931));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), (C1559170qfz) this.LLILLL.getValue(), C1559170qfz.class, "source_default_key");
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 199), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f55, viewGroup, false);
        this.LL = viewTd;
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
