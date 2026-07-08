package com.ss.android.ugc.aweme.compliance.audiencecontrol.creator;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1163504gr;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127A;
import X.C127K;
import X.C1308910kAL;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import Y.AObserverS206S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC836760Ws6
public final class AudienceControlFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9KTAoICo9HELIOSKyAvJiEnOiogZywhLSQ4Jj19CTAoICo9KyAPJiEnOiogDz0yLygpJzs=";
    public TuxNavBar LLIZ;
    public C127K LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 131));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS229S0000000_2.get$arr$(138));
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        super.onViewCreated(view, bundle);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, view.getContext());
        View viewFindViewById = null;
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            view.setBackgroundColor(iIntValue);
            View viewFindViewById2 = this.LLIZ;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.y08);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLIZ = (TuxNavBar) viewFindViewById2;
            }
            ((TuxNavBar) viewFindViewById2).setNavBackground(iIntValue);
        }
        View viewFindViewById3 = this.LLIZ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.y08);
            } else {
                viewFindViewById3 = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById3;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById3;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 132));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131824488);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.LJIIZILJ(false);
        AudienceControlViewModel audienceControlViewModel = (AudienceControlViewModel) this.LLJ.getValue();
        if (audienceControlViewModel != null && (mutableLiveData2 = audienceControlViewModel.LL) != null) {
            mutableLiveData2.observe(getViewLifecycleOwner(), new AObserverS206S0100000_2(this, 1));
        }
        View view4 = this.LLIZLLLIL;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById = view5.findViewById(R.id.b_w);
            }
            this.LLIZLLLIL = (C127K) viewFindViewById;
            view4 = viewFindViewById;
        }
        C127K c127k = (C127K) view4;
        c127k.LJ(true, true);
        C127A c127a = new C127A(view.getContext());
        c127a.LJIILL(new AwS246S0300000_2(c127k, c127a, this, 3));
        c127k.setAccessory(c127a);
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        Pair[] pairArr = new Pair[2];
        AudienceControlViewModel audienceControlViewModel2 = (AudienceControlViewModel) this.LLJ.getValue();
        if (audienceControlViewModel2 != null && (mutableLiveData = audienceControlViewModel2.LL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            str = "on";
        } else {
            str = "off";
        }
        pairArr[0] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        pairArr[1] = new Pair("enter_from", "settings");
        c1163504gr.onEventV3("enter_aac_settings", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bfr, viewGroup, false);
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
