package com.ss.android.ugc.aweme.component.guide;

import X.C098200Yq;
import X.C1391190mJ3;
import X.C1548870qPN;
import X.C1685300txQ;
import X.C1715520ukA;
import X.C1716030ukz;
import X.C1716450ulf;
import X.C1849907Mj;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C343970De7;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1548890qPP;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class InfoCollectGuideFragment extends BaseWalletLandingFragment implements InterfaceC1548890qPP {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiHELIOSPWE0PSwoLGEaJiMjCiA/JCAvPQgmISEpDz0yLygpJzs=";
    public InfoCollectGuideModel LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment
    public final Map<String, String> VR() {
        String str = this.LLJILJIL;
        if (str == null) {
            str = "";
        }
        return C2097908Jt.LIZJ(new Pair("enter_from", str));
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment, com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment
    public final void UR() {
        super.UR();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJIJIL = (InfoCollectGuideModel) arguments.getParcelable("guide_content");
            String string = arguments.getString("entrance_type");
            if (string == null) {
                string = arguments.getString("enter_from");
            }
            this.LLJILJIL = string;
            String string2 = arguments.getString("session_id");
            if (string2 == null) {
                string2 = "";
            }
            this.LLJILJILJ = string2;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        new C1548870qPN().LJI("close_info_collect_guide", this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroyView_");
        sbLIZ.append(C1716450ulf.LIZ() == 1);
        C1716030ukz.LIZJ(C2188811AlT.LIZIZ(sbLIZ), false);
        if (C1716450ulf.LIZ() == 1) {
            C1716030ukz.LIZ(C1716030ukz.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment, com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && C1849907Mj.LIZ("info_collect_guide")) {
            C1715520ukA.LIZIZ(bundle, "info_collect_guide");
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // X.InterfaceC1548890qPP
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "close_info_collect_guide")) {
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS605S0100000_26(this, 95), 3);
        new C1548870qPN().LJFF("close_info_collect_guide", this);
    }

    @Override // com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingFragment, com.ss.android.ugc.aweme.foundation.fragment.BaseEntryFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c7l, viewGroup, false);
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
