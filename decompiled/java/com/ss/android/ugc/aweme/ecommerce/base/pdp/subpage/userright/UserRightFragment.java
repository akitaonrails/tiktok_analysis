package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright;

import X.AnonymousClass0317;
import X.C034S;
import X.C03GS;
import X.C03GT;
import X.C03GU;
import X.C048I;
import X.C098200Yq;
import X.C0OM1;
import X.C1018703yb;
import X.C10508049a;
import X.C1054004Ag;
import X.C1120604Zw;
import X.C123100dR;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1326490kch;
import X.C13LP;
import X.C1685300txQ;
import X.C1748720vbi;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2097608Jq;
import X.C740070T1h;
import X.C786410Ut5;
import X.C817603Hi;
import X.C957403oi;
import X.EnumC638250P1r;
import X.InterfaceC1748810vbr;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S1200000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class UserRightFragment extends ECBaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZzHELIOS83OGs/PC0jKSIpZzogLTc+ICg7PGsZOiohGiwrITsVOiQrJCo9PA==";
    public LinearLayout LLILLL;
    public int LLILZ;
    public int LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public Map<String, ? extends Object> LLJ;
    public final List<String> LLILZIL = new ArrayList();
    public final C03GU LLJI = new C03GU();

    static {
        new C03GT();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "rights_service";
    }

    public final String WR() {
        String str = this.LLIZLLLIL;
        return str != null ? str : C13LP.LJJLIIIJ(this.LLILZIL, ",", null, null, 0, null, null, 62);
    }

    public final LinearLayout ZR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.user_right_privacy_policy) : null;
            this.LLILLL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        ContactDetail contactDetail;
        Bundle arguments = getArguments();
        UserRight userRight = arguments != null ? (UserRight) arguments.getParcelable("data") : null;
        if (!(userRight instanceof UserRight)) {
            userRight = null;
        }
        Bundle arguments2 = getArguments();
        String strValueOf = String.valueOf(arguments2 != null ? arguments2.getString("title") : null);
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = strValueOf;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1373));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        if (userRight != null && (contactDetail = userRight.contactDetail) != null) {
            C1748720vbi.LIZIZ(this, new C048I(), new AwS580S0100000_1(this, 249));
            if (!C123100dR.LIZ(contactDetail.text)) {
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_headset;
                c1251150ifB2.LIZLLL = true;
                c1251150ifB2.LIZJ(new AwS402S0200000_1(this, contactDetail, 32));
                c0om1.LJ(c1251150ifB2);
                return c0om1;
            }
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = contactDetail.text;
            c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido.LJFF = true;
            c1250300ido.LIZ(new AwS402S0200000_1(this, contactDetail, 31));
            c0om1.LJ(c1250300ido);
        }
        return c0om1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void UR() {
        try {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("source_btm_token") : null;
            C817603Hi c817603Hi = this.LLJI.LIZ;
            if (c817603Hi.LIZ) {
                return;
            }
            c817603Hi.LJIIL(this, "a2270.b2593", string);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
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
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        String str = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround() ? "close" : "return";
        Map<String, ? extends Object> map = this.LLJ;
        if (map != null) {
            C1018703yb.LIZLLL("tiktokec_stay_page", new AwS86S1200000_1(this, str, map, 30));
            return;
        }
        C1054004Ag c1054004AgLIZ = C740070T1h.LIZ(getActivity());
        if (c1054004AgLIZ != null) {
            long jSR = SR();
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("rights_cnt", Integer.valueOf(this.LLILZLL)), new Pair("rights_content", String.valueOf(this.LLIZ)));
            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004AgLIZ.LJJIJLIJ();
            if (interfaceC1748810vbrLJJIJLIJ != null) {
                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C10508049a(), new C03GS(c1054004AgLIZ, mapLJIIIIZZ, jSR, str));
            }
        }
    }

    public final void aS(String str) {
        Map<String, ? extends Object> map = this.LLJ;
        if (map != null) {
            C1018703yb.LIZLLL("tiktokec_button_click", new AwS86S1200000_1(this, str, map, 7));
            return;
        }
        C1054004Ag c1054004AgLIZ = C740070T1h.LIZ(getContext());
        if (c1054004AgLIZ == null) {
            return;
        }
        C1018703yb.LIZLLL("tiktokec_button_click", new AwS86S1200000_1(this, c1054004AgLIZ, str, 8));
    }

    public final void VR(C957403oi c957403oi, boolean z) {
        int i;
        String strWR;
        c957403oi.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZJ("page_name", "rights_service");
        if (z) {
            i = this.LLILZLL;
        } else {
            i = this.LLILZ;
        }
        c957403oi.LIZJ("rights_cnt", Integer.valueOf(i));
        if (z) {
            strWR = this.LLIZ;
        } else {
            strWR = WR();
        }
        c957403oi.LIZJ("rights_content", strWR);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013c  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C1326490kch.LIZ.getClass();
        C1326490kch.LJIIIIZZ("UserRightFragment", "onCreateView", null);
        Context context = getContext();
        C19GS c19gs = null;
        if (context != null) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.au0, viewGroup, false);
        } else {
            viewTd = null;
        }
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
