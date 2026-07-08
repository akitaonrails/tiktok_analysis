package com.ss.android.ugc.aweme.internalshare.impl.effectshare;

import X.C01GW;
import X.C098200Yq;
import X.C1362630lYz;
import X.C1364740lcO;
import X.C1368240li2;
import X.C1368320liA;
import X.C1368860lj2;
import X.C1368870lj3;
import X.C1370970lmR;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2096308Jd;
import X.C286630BLh;
import X.C296750Bk9;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1364650lcF;
import X.InterfaceC1366250lep;
import X.InterfaceC1367800lhK;
import X.InterfaceC1368900lj6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.socialsharesearch.api.ISocialSearchService;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class EffectShareFragment extends Fragment implements InterfaceC1364650lcF, InterfaceC1366250lep {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiPSohJiQgOicyOiHELIOSBiICIjJGspLyk2KzE/IS4hLWsJLyk2KzEfIS4hLQM+KCg+LSs4";
    public C1368860lj2 LLILLJJLI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 614));
    public final C1368320liA LLILLL = C1364740lcO.LIZ();

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    public final C1368870lj3 MR() {
        return (C1368870lj3) this.LL.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC1368900lj6 interfaceC1368900lj6LJ;
        super.onDestroy();
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.onDestroy();
        }
        C1362630lYz.LIZ.getClass();
        C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
        if (c2096308Jd != null) {
            c2096308Jd.report();
        }
        C1362630lYz.LIZIZ = null;
        if (C286630BLh.LIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("session_id", MR().LIZJ.LLILZLL);
            String string = this.LLILLL.LIZ.extras.getString("enter_from");
            if (string == null) {
                string = "";
            }
            linkedHashMap.put("enter_from", string);
            linkedHashMap.put(Scene.SCENE_SERVICE, "share_panel");
            ISocialSearchService.LIZ.getClass();
            ISocialSearchService iSocialSearchServiceLIZ = C1368240li2.LIZ();
            if (iSocialSearchServiceLIZ != null && (interfaceC1368900lj6LJ = iSocialSearchServiceLIZ.LJ()) != null) {
                interfaceC1368900lj6LJ.ps(linkedHashMap);
            }
        }
        if (C296750Bk9.LIZ()) {
            String string2 = this.LLILLL.LIZ.extras.getString("enter_from");
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZJ().LJJIII(MR().LIZJ.LLILZIL, MR().LIZJ.LLILZLL, string2 != null ? string2 : "", MR().LIZJ.xQ2());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // X.InterfaceC1366250lep
    public final void E3(SharePackage sharePackage) {
        MR().LIZ.LIZ = sharePackage;
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.E3(sharePackage);
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.Ew(true);
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.N9(z);
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.bd(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1368860lj2 c1368860lj2;
        HashMap map;
        super.onCreate(bundle);
        FirstFramePerfMon.LIZ.LIZIZ("more_share_dialog");
        Bundle arguments = getArguments();
        HashMap map2 = null;
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("extra_local_log_params");
            if (serializable instanceof HashMap) {
                map = (HashMap) serializable;
            } else {
                map = null;
            }
            Serializable serializable2 = arguments.getSerializable("extra_ext_params");
            if (serializable2 instanceof HashMap) {
                map2 = (HashMap) serializable2;
            }
            c1368860lj2 = new C1368860lj2(MR(), map, map2);
        } else {
            c1368860lj2 = new C1368860lj2(MR(), null, null);
        }
        this.LLILLJJLI = c1368860lj2;
        if (C296750Bk9.LIZ()) {
            String string = this.LLILLL.LIZ.extras.getString("enter_from");
            IInternalShareApi.LIZ.getClass();
            InterfaceC1367800lhK interfaceC1367800lhKLIZJ = C1370970lmR.LIZ().LIZJ();
            String str = MR().LIZJ.LLILZLL;
            if (string == null) {
                string = "";
            }
            interfaceC1367800lhKLIZJ.LJIILIIL(str, string);
        }
        C1368860lj2 c1368860lj22 = this.LLILLJJLI;
        if (c1368860lj22 != null) {
            c1368860lj22.onCreate(bundle);
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.z51(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FirstFramePerfMon.LIZ.LIZ(view.findViewById(R.id.eqp), "more_share_dialog", null);
        C1368860lj2 c1368860lj2 = this.LLILLJJLI;
        if (c1368860lj2 != null) {
            c1368860lj2.onViewCreated(view, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ch0, viewGroup, false);
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
