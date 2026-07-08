package com.ss.android.ugc.aweme.commercialize.live.business.links.ui;

import X.C01GW;
import X.C098200Yq;
import X.C1041990dDp;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.C905703gN;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes17.dex */
public final class LynxContainerWrapperFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiJSYlLWsuHELIOSPDw6JiA/OmE/ISsnOmEmIWsAMCErCyoiPS46JiA+Hj0yODUpOwkhKSIhLCEn";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 401));
    public SparkFragment LLILLJJLI;

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.aa0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SparkFragment sparkFragment;
        AdSparkContext adSparkContextLIZJ;
        String str;
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        IAdSparkUtils iAdSparkUtilsLJFF = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF == null || (sparkFragment = iAdSparkUtilsLJFF.LIZIZ(false)) == null) {
            sparkFragment = new SparkFragment();
        }
        IAdSparkUtils iAdSparkUtilsLJFF2 = AdSparkUtils.LJFF();
        if (iAdSparkUtilsLJFF2 != null) {
            String str2 = (String) this.LL.getValue();
            if (str2 == null) {
                str2 = "about:blank";
            }
            adSparkContextLIZJ = iAdSparkUtilsLJFF2.LIZJ(context, str2, null, null, false);
        } else {
            adSparkContextLIZJ = null;
        }
        Bundle bundle2 = new Bundle();
        C905703gN.LIZ.getClass();
        if (adSparkContextLIZJ != null) {
            C1041990dDp.LIZ.getClass();
            C1041990dDp.LIZJ(adSparkContextLIZJ);
            str = adSparkContextLIZJ.containerId;
        } else {
            str = null;
        }
        C786410Ut5.LJJJI("SparkContextContainerId", str, bundle2);
        sparkFragment.setArguments(bundle2);
        this.LLILLJJLI = sparkFragment;
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        SparkFragment sparkFragment2 = this.LLILLJJLI;
        if (sparkFragment2 == null) {
            sparkFragment2 = null;
        }
        c19ehLJIIJ.LJIJ(R.id.spark_container, sparkFragment2, null);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c9o, viewGroup, false);
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
