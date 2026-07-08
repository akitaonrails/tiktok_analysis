package com.ss.android.ugc.trill.feedback;

import X.AbstractC1678220tm0;
import X.C036E;
import X.C05P0;
import X.C098200Yq;
import X.C0TU5;
import X.C1244280iU6;
import X.C13BV;
import X.C13LE;
import X.C13Z4;
import X.C13ZC;
import X.C1557610qdT;
import X.C1668060tVc;
import X.C1669670tYD;
import X.C1670400tZO;
import X.C1685300txQ;
import X.C1689100u3Y;
import X.C1689120u3a;
import X.C1689140u3c;
import X.C1848530yCh;
import X.C189200o6;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20030013Ys;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C259800zU;
import X.C452070Ho5;
import X.C592600NMc;
import X.C592620NMe;
import X.C592650NMh;
import X.C724750Sbp;
import X.EnumC1427810nG7;
import X.InterfaceC1461640o8g;
import X.InterfaceC1664980tQe;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1848330yCN;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.InterfaceC586170Myt;
import X.InterfaceC836760Ws6;
import Y.ARunnableS7S1000000_12;
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
import com.ss.android.ugc.aweme.experiment.SPMMapping;
import com.ss.android.ugc.aweme.experiment.SPMMappingConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.trill.feedback.FaqDetailFragment;
import com.ss.android.ugc.trill.feedback.api.CSPPageApi;
import com.ss.android.ugc.trill.feedback.compose.FaqDetailViewModel;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes26.dex */
@InterfaceC836760Ws6
public final class FaqDetailFragment extends BasePage implements InterfaceC586170Myt {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjE+ICM/ZiHELIOSMpLCsxKSYnZwkyOQEpPS46JAM+KCg+LSs4";
    public String LLJ = "";
    public long LLJI = System.currentTimeMillis();
    public String LLJIJIL = "general_v2";
    public List<String> LLJILJIL = C13BV.INSTANCE;
    public final AssemVMLazy LLJILJILJ;
    public C1689140u3c LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FaqDetailFragment.class, "vm", "getVm()Lcom/ss/android/ugc/trill/feedback/compose/FaqDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int UR() {
        return 0;
    }

    public final FaqDetailViewModel bS() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (FaqDetailViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0u3c] */
    public FaqDetailFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FaqDetailViewModel.class);
        this.LLJILJILJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS556S0100000_12(c19719912DlLIZ, 681), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS569S0100000_25((HasDefaultViewModelProviderFactory) this, 749), AFwS266S0000000_25.get$arr$(336));
        this.LLJILLL = new InterfaceC1848330yCN() { // from class: X.0u3c
            @Override // X.InterfaceC1848330yCN
            public final void LIZ() {
            }

            @Override // X.InterfaceC1848330yCN
            public final void LIZIZ(InterfaceC1553650qX5 interfaceC1553650qX5) {
                if (Intrinsics.LJFF(interfaceC1553650qX5.getOid(), "page_csp_topics_na")) {
                    String strLIZ = interfaceC1553650qX5.LIZ();
                    String str = "";
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    final String str2 = new C1844680y6U(strLIZ).LIZJ;
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it2 = interfaceC1553650qX5.getMultirefers().iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next());
                    }
                    final String string = jSONArray.toString();
                    FaqDetailViewModel faqDetailViewModelBS = this.LIZ.bS();
                    faqDetailViewModelBS.LL.put("page_id", interfaceC1553650qX5.getOid());
                    FaqDetailViewModel faqDetailViewModelBS2 = this.LIZ.bS();
                    if (str2 != null) {
                        str = str2;
                    }
                    faqDetailViewModelBS2.LL.put("origin_refer", str);
                    C0TU5 c0tu5 = C0TU5.LIZ;
                    FaqDetailFragment faqDetailFragment = this.LIZ;
                    final String str3 = faqDetailFragment.LLJIJIL;
                    final String str4 = faqDetailFragment.LLJ;
                    final AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(faqDetailFragment, 748);
                    c0tu5.getClass();
                    C20684815ws.LJFF().submit(new Runnable() { // from class: X.0u3f
                        public final /* synthetic */ String LLILZIL = "topic_list_na";

                        public final void LIZ() {
                            SPMMappingConfig sPMMappingConfig;
                            SPMMapping sPMMapping;
                            Map<String, List<String>> map;
                            List<String> list;
                            SPMMappingConfig sPMMappingConfig2 = C1689180u3g.LIZ;
                            String str5 = str3;
                            String str6 = str2;
                            if (str5 != null && str6 != null && (sPMMappingConfig = C1689180u3g.LIZIZ) != null && (sPMMapping = sPMMappingConfig.spmMapping) != null && (map = sPMMapping.mapping) != null && map.containsKey(str5) && (list = map.get(str5)) != null) {
                                Iterator<String> it3 = list.iterator();
                                while (it3.hasNext()) {
                                    if (new Regex(it3.next()).containsMatchIn(str6)) {
                                        return;
                                    }
                                }
                            }
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("access_version", "v2");
                            c2344009Gk.LJIIIIZZ("enter_from", C0TU5.LIZIZ.get("enter_from"));
                            c2344009Gk.LJIIIIZZ("entrance", str3);
                            c2344009Gk.LJIIIIZZ("faq_id", str4);
                            c2344009Gk.LJIIIIZZ("referSPM", str2);
                            c2344009Gk.LJIIIIZZ("multirefers", string);
                            c2344009Gk.LJIIIIZZ("page_type", this.LLILZIL);
                            C20684815ws.LJIILLIIL("unknown_entrance_track", c2344009Gk.LIZ);
                            Function0<Unit> function0 = awS569S0100000_25;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("FaqEventTrack@30b9.tryTrackSPMError$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("FaqEventTrack@30b9.tryTrackSPMError$1");
                        }
                    });
                }
            }
        };
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJI(this);
        }
        this.LLJILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String string;
        String string2;
        String string3;
        super.onCreate(bundle);
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(this);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string3 = arguments.getString("faq_id")) != null) {
            this.LLJ = string3;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("entrance")) != null) {
            this.LLJIJIL = string2;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("faq_types")) != null) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(URLDecoder.decode(string), new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            this.LLJILJIL = arrayList;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            this.LLJI = Long.valueOf(arguments4.getLong("start_time")).longValue();
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            FaqDetailViewModel faqDetailViewModelBS = bS();
            String string4 = arguments5.getString("enter_from");
            if (string4 == null) {
                string4 = "rap_main_na";
            }
            faqDetailViewModelBS.LL.put("enter_from", string4);
            FaqDetailViewModel faqDetailViewModelBS2 = bS();
            String string5 = arguments5.getString("entrance");
            if (string5 == null) {
                string5 = "rap_main";
            }
            faqDetailViewModelBS2.LL.put("entrance", string5);
            bS().LL.put("enter_time", String.valueOf(System.currentTimeMillis()));
        }
        C0TU5 c0tu5 = C0TU5.LIZ;
        Map<String, String> map = bS().LL;
        c0tu5.getClass();
        C0TU5.LIZIZ = map;
        C20684815ws.LJFF().submit(new ARunnableS7S1000000_12(this.LLJ, 11));
        requireContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (this.LLJ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && this.LLJIJIL.length() > 0) {
                    C23250099c.LIZLLL((InterfaceC497601wk) C592650NMh.LIZJ.getValue(), null, null, new C592620NMe(this.LLJIJIL, new AwS604S0100000_25(this, 492), new AwS604S0100000_25(this, 493), null), 3);
                    return;
                }
                CSPPageApi.FaqRequestBody.Factory.getClass();
                Map<String, String> mapLIZ = C1689120u3a.LIZ(C1689100u3Y.LIZ());
                mapLIZ.put("faq_id", this.LLJ);
                mapLIZ.put("entrance", this.LLJIJIL);
                C23250099c.LIZLLL((InterfaceC497601wk) C592650NMh.LIZJ.getValue(), null, null, new C592600NMc(mapLIZ, this.LLJILJIL, new AwS604S0100000_25(this, 494), new AwS604S0100000_25(this, 495), null), 3);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        bS().setState(AFwS266S0000000_25.get$arr$(599));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public final void ZR(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1775237595);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C05P0 c05p0LIZ = C1244280iU6.LIZ(bS(), null, c13zcLJIIJ, 0, 7);
            C259800zU c259800zU = new C259800zU();
            ?? r0 = ((C1557610qdT) c05p0LIZ.getValue()).LL;
            c259800zU.element = r0;
            if (r0 == 0 || r0.length() == 0) {
                c259800zU.element = getString(2131857655);
            }
            C1668060tVc.LIZ(c.LJI(InterfaceC1685750ty9.LIZ, 48), false, 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).I2(), null, C13Z4.LIZJ(1500532452, new AwS639S0100000_25(this, 96), c13zcLJIIJ), C13Z4.LIZJ(-864203995, new AwS639S0100000_25(c259800zU, (C259800zU<InterfaceC1664980tQe<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>>) 97), c13zcLJIIJ), C13Z4.LIZJ(1066026854, new AwS460S0200000_25(c05p0LIZ, this, 23), c13zcLJIIJ), c13zcLJIIJ, 14352390, 22);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 42);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aS(X.InterfaceC1680500tpg r13, int r14) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.feedback.FaqDetailFragment.aS(X.0tpg, int):void");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1848530yCh.LIZLLL(view, "page_csp_topics_na", new AwS604S0100000_25(this, 496));
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(-257130186, new AwS460S0200000_25(composeView, this, 24), true));
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
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 1) {
            bS().setState(new AwS37S0010000_25(z, 33));
        }
    }
}
