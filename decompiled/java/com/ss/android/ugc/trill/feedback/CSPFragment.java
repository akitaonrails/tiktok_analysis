package com.ss.android.ugc.trill.feedback;

import X.AbstractC1686530tzP;
import X.C098200Yq;
import X.C0TU5;
import X.C1244280iU6;
import X.C13LE;
import X.C13ZC;
import X.C1669670tYD;
import X.C1679930tol;
import X.C1680030tov;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1685300txQ;
import X.C1688520u2c;
import X.C1689010u3P;
import X.C1689060u3U;
import X.C1689130u3b;
import X.C1848530yCh;
import X.C189200o6;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20030013Ys;
import X.C2018907vX;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C636400Oxi;
import X.C724750Sbp;
import X.EnumC1427810nG7;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1686920u02;
import X.InterfaceC1689040u3S;
import X.InterfaceC1848330yCN;
import X.InterfaceC2217461Bqa;
import X.InterfaceC586170Myt;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.trill.feedback.api.FaqBottomButtonData;
import com.ss.android.ugc.trill.feedback.api.FaqBottomButtonResponse;
import com.ss.android.ugc.trill.feedback.api.FaqResponse;
import com.ss.android.ugc.trill.feedback.compose.CSPComposeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
@InterfaceC836760Ws6
public final class CSPFragment extends BasePage implements InterfaceC586170Myt {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICHELIOSM/ZiMpLCsxKSYnZwwAGAM+KCg+LSs4";
    public final AssemVMLazy LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public long LLJILJIL;
    public final C1689010u3P LLJILJILJ;
    public C1689130u3b LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CSPFragment.class, "vm", "getVm()Lcom/ss/android/ugc/trill/feedback/compose/CSPComposeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return 0;
    }

    public final CSPComposeViewModel cS() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (CSPComposeViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0u3b] */
    public CSPFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CSPComposeViewModel.class);
        this.LLJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS556S0100000_12(c19719912DlLIZ, 680), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS569S0100000_25((HasDefaultViewModelProviderFactory) this, 741), AFwS266S0000000_25.get$arr$(335));
        this.LLJI = "rap_main";
        this.LLJIJIL = "rap_main";
        this.LLJILJILJ = new C1689010u3P();
        this.LLJILLL = new InterfaceC1848330yCN() { // from class: X.0u3b
            @Override // X.InterfaceC1848330yCN
            public final void LIZ() {
            }

            @Override // X.InterfaceC1848330yCN
            public final void LIZIZ(InterfaceC1553650qX5 interfaceC1553650qX5) {
                if (Intrinsics.LJFF(interfaceC1553650qX5.getOid(), "page_csp_rap_main_na")) {
                    String strLIZ = interfaceC1553650qX5.LIZ();
                    String str = "";
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    String str2 = new C1844680y6U(strLIZ).LIZJ;
                    this.LIZ.cS().vQ2("page_id", interfaceC1553650qX5.getOid());
                    CSPComposeViewModel cSPComposeViewModelCS = this.LIZ.cS();
                    if (str2 != null) {
                        str = str2;
                    }
                    cSPComposeViewModelCS.vQ2("origin_refer", str);
                }
            }
        };
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.LJI(this);
        }
        this.LLJILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0TU5 c0tu5 = C0TU5.LIZ;
        Map<String, String> map = cS().LL;
        c0tu5.getClass();
        C0TU5.LIZIZ = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c A[PHI: r2
      0x007c: PHI (r2v4 X.0u3R) = (r2v17 X.0u3R), (r2v18 X.0u3R) binds: [B:10:0x0036, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:29:0x006c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS(boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.feedback.CSPFragment.dS(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            cS().vQ2("enter_from", arguments.getString("enter_from", this.LLJI));
            cS().vQ2("entrance", arguments.getString("entrance", this.LLJIJIL));
            cS().vQ2("enter_time", arguments.getString("enter_time", String.valueOf(System.currentTimeMillis())));
            this.LLJILJIL = arguments.getLong("start_time", System.currentTimeMillis());
        }
        C0TU5 c0tu5 = C0TU5.LIZ;
        Map<String, String> map = cS().LL;
        c0tu5.getClass();
        C0TU5.LIZIZ = map;
        this.LLJILJILJ.LIZIZ = new InterfaceC1689040u3S() { // from class: X.0u3Q
            @Override // X.InterfaceC1689040u3S
            public final void LIZ(FaqResponse faqResponse) {
                CSPComposeViewModel cSPComposeViewModelCS = this.LIZ.cS();
                Integer num = faqResponse.code;
                if (num != null && num.intValue() == 0) {
                    cSPComposeViewModelCS.setState(new AwS604S0100000_25(faqResponse, 507));
                } else {
                    cSPComposeViewModelCS.setState(AFwS266S0000000_25.get$arr$(349));
                }
            }
        };
        dS(false);
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        if (iAccountService != null) {
            iAccountService.LJIILL(this);
        }
        boolean z = C2018907vX.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS(X.InterfaceC1680500tpg r12, int r13) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.feedback.CSPFragment.aS(X.0tpg, int):void");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1848530yCh.LIZLLL(view, "page_csp_rap_main_na", new AwS604S0100000_25(this, 489));
    }

    public final void ZR(InterfaceC1686920u02 interfaceC1686920u02, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        String str;
        FaqBottomButtonData faqBottomButtonData;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(206947568);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1686920u02)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1688520u2c c1688520u2c = (C1688520u2c) C1244280iU6.LIZ(cS(), null, c13zcLJIIJ, 0, 7).getValue();
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            Object obj = objLJJ;
            if (objLJJ == c1680520tpi) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair("header", new C19719212De(-2015288805, new AwS639S0100000_25(this, 91), true)));
                arrayList.add(new Pair("search_tools", new C19719212De(-2111086318, new AwS639S0100000_25(this, 92), true)));
                arrayList.add(new Pair("support_tools", new C19719212De(-1184331565, new AwS639S0100000_25(this, 93), true)));
                arrayList.add(new Pair("topic_list", new C19719212De(-257576812, new AwS639S0100000_25(this, 94), true)));
                arrayList.add(new Pair("bottom_button", new C19719212De(669177941, new AwS639S0100000_25(this, 95), true)));
                c13zcLJIIJ.LJJIJIIJI(arrayList);
                obj = arrayList;
            }
            List list = (List) obj;
            c13zcLJIIJ.LJJJJL(false);
            InterfaceC1685750ty9 interfaceC1685750ty9LJ = c.LJ(interfaceC1686920u02.LIZ(InterfaceC1685750ty9.LIZ, 1.0f, true), 1.0f);
            C1680030tov c1680030tov = C1679930tol.LIZJ;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJII = c13zcLJIIJ.LJII(list);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS604S0100000_25(list, (List<? extends AbstractC1686530tzP>) 488);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C636400Oxi.LIZ(interfaceC1685750ty9LJ, null, null, false, c1680030tov, null, null, false, null, (Function1) objLJJ2, c13zcLJIIJ, 24576, 494);
            FaqBottomButtonResponse faqBottomButtonResponse = c1688520u2c.LLILLL;
            if (faqBottomButtonResponse == null || (faqBottomButtonData = faqBottomButtonResponse.data) == null || (str = faqBottomButtonData.position) == null) {
                str = C1689060u3U.LIZIZ.rapButtonDefaultConfig.position;
            }
            if (Intrinsics.LJFF(str, "sticky")) {
                bS(cS(), c13zcLJIIJ, i2 & 112);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1686920u02, i, 57);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bS(com.ss.android.ugc.trill.feedback.compose.CSPComposeViewModel r30, X.InterfaceC1680500tpg r31, int r32) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.feedback.CSPFragment.bS(com.ss.android.ugc.trill.feedback.compose.CSPComposeViewModel, X.0tpg, int):void");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(1114302422, new AwS460S0200000_25(composeView, this, 22), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) throws Throwable {
        if (i == 1 && z) {
            cS().setState(AFwS266S0000000_25.get$arr$(344));
            this.LLJILJIL = System.currentTimeMillis();
            cS().vQ2("enter_time", String.valueOf(System.currentTimeMillis()));
            dS(true);
        }
    }
}
