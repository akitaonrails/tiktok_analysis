package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies;

import X.AnonymousClass0317;
import X.C034S;
import X.C03DX;
import X.C049Y;
import X.C098200Yq;
import X.C10508049a;
import X.C1120604Zw;
import X.C1685300txQ;
import X.C1748720vbi;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2097908Jt;
import X.C23260099m;
import X.C817703Hj;
import X.C919503ib;
import X.C954703oH;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomTip;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.zhiliaoapp.musically.R;
import j0b.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class ReturnPoliciesFragment extends ECBaseFragment {
    public static C23260099m LLIZLLLIL = null;
    public static String LLJ = null;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZz83OGs/HELIOSPC0jKSIpZz02PDA+Jz88JCwvICogZhcpPTohJhUjJSYwISA/Dz0yLygpJzs=";
    public C03DX LLILLL;
    public int LLILZ;
    public final List<String> LLILZIL = new ArrayList();
    public c LLILZLL;
    public IPdpStarter.PdpEnterParam LLIZ;

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "return_policy";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        try {
            BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b4035", C817703Hj.LIZ(this));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C23260099m c23260099m = LLIZLLLIL;
        if (c23260099m != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            c23260099m.resumeWith(unit);
        }
        LLIZLLLIL = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        super.onStop();
        if (LLJ == null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
            }
            LLJ = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround() ? "close" : "return";
        }
        C1748720vbi.LIZIZ(this, new C10508049a(), new AwS580S0100000_1(this, 247));
    }

    public final void VR(BottomTip bottomTip) {
        Map<String, Object> map;
        C1748720vbi.LIZIZ(this, new C049Y(), new AwS580S0100000_1(bottomTip, 248));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LLIZ;
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("previous_page", "return_policy");
        linkedHashMap.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
        String str = bottomTip.link;
        if (str != null) {
            SmartRouter.buildRoute(getContext(), C919503ib.LIZ(str, C2097908Jt.LIZJ(new Pair("track_params", linkedHashMap)))).open();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02a1 A[PHI: r7
      0x02a1: PHI (r7v5 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) = (r7v2 com.ss.android.ugc.aweme.ecommerce.service.vo.Image), (r7v8 com.ss.android.ugc.aweme.ecommerce.service.vo.Image) binds: [B:104:0x029f, B:100:0x0295] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.ReturnPoliciesFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZ;
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            viewLIZ = C954703oH.LIZ(context, R.layout.arh, viewGroup, false);
        } else {
            viewLIZ = null;
        }
        if (!(viewLIZ instanceof View)) {
            viewLIZ = null;
        }
        if (viewLIZ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZ, this);
                viewLIZ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZ;
    }
}
