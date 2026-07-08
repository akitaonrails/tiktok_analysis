package com.ss.android.ugc.aweme.minidrama.tab.v2;

import X.C098200Yq;
import X.C1220000hqw;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1559210qg3;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1561380qjY;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class DramaCategoryContentFragment extends Fragment implements InterfaceC1561380qjY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiglJyY3OiQhKGEnHELIOSKSdiP319DDctJC4QKTEpLiAhMQYjJzs2JjEKOy40JSAiPQ==";
    public SeriesCenterCenterScene LL;
    public boolean LLILLJJLI;
    public final C736950SvV LLILLL;

    @Override // X.InterfaceC1561380qjY
    public final void lP() {
    }

    @Override // X.InterfaceC1561380qjY
    public final void nd() {
    }

    @Override // X.InterfaceC1561380qjY
    public final void VN() {
        ((AssemSingleListViewModel) this.LLILLL.getValue()).manualListRefresh();
    }

    public DramaCategoryContentFragment() {
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this, 748);
        this.LLILLL = new C736950SvV(C13LE.LIZ(DramaCategoryContentListModel.class), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(223), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String string;
        super.onCreate(bundle);
        if (getArguments() != null) {
            SeriesCenterCenterScene seriesCenterCenterScene = null;
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    seriesCenterCenterScene = (SeriesCenterCenterScene) arguments.getSerializable("category", SeriesCenterCenterScene.class);
                }
            } else {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    serializable = arguments2.getSerializable("category");
                } else {
                    serializable = null;
                }
                if (serializable instanceof SeriesCenterCenterScene) {
                    seriesCenterCenterScene = (SeriesCenterCenterScene) serializable;
                }
            }
            this.LL = seriesCenterCenterScene;
            Bundle arguments3 = getArguments();
            boolean z = false;
            if (arguments3 != null) {
                Bundle arguments4 = getArguments();
                if (arguments4 != null && (string = arguments4.getString("is_from_innerfeed_discover")) != null && Boolean.parseBoolean(string)) {
                    z = true;
                }
                z = arguments3.getBoolean("is_from_innerfeed_discover", z);
            }
            this.LLILLJJLI = z;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1559210qg3 c1559210qg3 = new C1559210qg3(this.LL, this.LLILLJJLI);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), c1559210qg3, C1559210qg3.class, "source_default_key");
        C723850SaN.LIZ(this, false, null, new AwS390S0200000_24(this, c1559210qg3, 17), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bo5, viewGroup, false);
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
