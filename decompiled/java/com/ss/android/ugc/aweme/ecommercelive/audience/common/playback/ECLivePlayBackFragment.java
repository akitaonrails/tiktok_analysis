package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1743880vTu;
import X.C1743890vTv;
import X.C1743900vTw;
import X.C1748770vbn;
import X.C1756050vnX;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C844470XAv;
import X.C960603pE;
import X.C987103tV;
import X.C988803tm;
import X.InterfaceC1738660vLU;
import X.InterfaceC1740480vOQ;
import X.InterfaceC1740760vOs;
import X.InterfaceC1748810vbr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import g1c.AjS69S0100000_24;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ECLivePlayBackFragment extends BaseFragment implements InterfaceC1740760vOs, InterfaceC1740480vOQ, InterfaceC1738660vLU {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLCM6PiBiKDo3ISHELIOSAiKip9KyohJCA9ZjUgKDYxKSYnZwoQBCw6LB8/KTwOKCw4DjctLiI2JjE=";
    public final AssemVMLazy LLIZ;
    public ConstraintLayout LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECLivePlayBackFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommercelive/audience/common/playback/ECLivePlaybackViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b96658";
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "live_playback_page";
    }

    @Override // X.InterfaceC1738660vLU
    public final boolean onBackPressed() {
        UR(1003, C2097608Jq.LJIIIIZZ(new Pair("click_area", "other_area"), new Pair("click_type", "slide")));
        return true;
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    public ECLivePlayBackFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECLivePlaybackViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 358);
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(313);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 662), aFwS268S0000000_26, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS570S0100000_26((Fragment) this, 663), aFwS268S0000000_26, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 664), aFwS268S0000000_26, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
    }

    public final ECLivePlaybackViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (ECLivePlaybackViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        VR().wQ2();
        C1743890vTv.LIZ.getClass();
        C1743890vTv.LIZIZ.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        VR().LLILZLL.LJIJ = Long.valueOf(System.currentTimeMillis());
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba A[PHI: r6
      0x01ba: PHI (r6v8 java.lang.String) = (r6v7 java.lang.String), (r6v10 java.lang.String) binds: [B:70:0x01b6, B:27:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlayBackFragment.onCreate(android.os.Bundle):void");
    }

    public static String SR(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void UR(int i, Map<String, ? extends Object> map) {
        Map<String, Object> mapLJ;
        C1743890vTv c1743890vTv = C1743890vTv.LIZ;
        C1743900vTw c1743900vTw = VR().LLILLJJLI;
        if (c1743900vTw != null) {
            mapLJ = c1743900vTw.LJ();
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        ConstraintLayout constraintLayout = this.LLIZLLLIL;
        c1743890vTv.getClass();
        C1743890vTv.LIZIZ(i, mapLJ, map, constraintLayout);
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 540), 3);
        View viewFindViewById = view.findViewById(R.id.l5x);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 4), viewFindViewById);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.iiv);
        this.LLIZLLLIL = constraintLayout;
        if (constraintLayout != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 5), constraintLayout);
        }
        C1743880vTu c1743880vTu = VR().LL;
        if (c1743880vTu != null) {
            Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c0.d0", PageFinder.via((Fragment) this), null, 4, null);
            Object obj = mapCreateReportParams$default.get("btm_ppre");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            boolean z = mapCreateReportParams$default.get("btm_pre") instanceof String;
            c1743880vTu.LJIIJ = str;
        }
        ECLivePlaybackViewModel eCLivePlaybackViewModelVR = VR();
        C844470XAv.LIZ.getClass();
        eCLivePlaybackViewModelVR.vQ2(C844470XAv.LIZ());
        VR().xQ2(new C2217381BqS() { // from class: X.0qxL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1569940qxM) obj2).LLIZLLLIL;
            }
        }, null, new AwS605S0100000_26(this, 655));
        VR().xQ2(new C2217381BqS() { // from class: X.0qwv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1569940qxM) obj2).LLIZ;
            }
        }, null, new AwS603S0100000_24(this, 541));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VR().LLILZLL.LJIIIIZZ = Long.valueOf(System.currentTimeMillis());
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bvp, viewGroup, false);
        VR().LLILZLL.LJIIIZ = Long.valueOf(System.currentTimeMillis());
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
