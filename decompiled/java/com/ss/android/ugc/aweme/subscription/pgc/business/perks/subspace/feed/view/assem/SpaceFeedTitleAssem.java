package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem;

import X.C019F;
import X.C098200Yq;
import X.C0K54;
import X.C0K7G;
import X.C0KBJ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C189200o6;
import X.C19719912Dl;
import X.C2089408Gm;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C511370K3r;
import X.C511400K3u;
import X.C511520K4g;
import X.C724750Sbp;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class SpaceFeedTitleAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public C511370K3r LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SpaceFeedTitleAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SpaceFeedTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 488), AFwS237S0000000_7.get$arr$(221), null, true);
    }

    public final C511370K3r Go() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C511370K3r.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C511370K3r) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJ;
    }

    public final SubSpaceFeedVM Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    public final void Jo(boolean z) {
        String secUid;
        String str;
        String strLJII;
        String strLIZLLL;
        User currentUser;
        String secUid2;
        Object c098200Yq;
        Object c098200Yq2;
        User currentUser2;
        if (C0K7G.LIZIZ()) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService == null || (currentUser2 = iUserService.getCurrentUser()) == null || (secUid2 = currentUser2.getSecUid()) == null) {
                secUid2 = "";
            }
            if (z) {
                C0KBJ c0kbj = C0KBJ.SUBSCRIBED_NOT_EXPIRED;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("preview_mode", "true"), new Pair("target_tab", "space"));
                C511400K3u.LIZ.getClass();
                try {
                    SettingsManager.LIZLLL().getClass();
                    c098200Yq = SettingsManager.LJI("live_subscription_lynx_url", "");
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = "";
                }
                String str2 = (String) c098200Yq;
                try {
                    if (a0.LJJJIL(str2)) {
                        c098200Yq2 = new JSONObject();
                    } else {
                        c098200Yq2 = new JSONObject(str2);
                    }
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                JSONObject jSONObject = new JSONObject();
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = jSONObject;
                }
                String strOptString = ((JSONObject) c098200Yq2).optString("subscribe_state_scheme", "");
                if (a0.LJJJIL(strOptString)) {
                    strOptString = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_subscription%2Fpages%2Fuser%2Fsubscribe%2Fstate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&hide_loading=1&trans_status_bar=0&use_spark=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Fsubscription";
                }
                LinkedHashMap linkedHashMapLJII = C2097608Jq.LJII(new Pair("anchor_id", secUid2), new Pair("log_anchor_id", secUid2), new Pair("sec_anchor_id", secUid2), new Pair("show_entrance", ""), new Pair("subscribe_state", c0kbj.getState()), new Pair("click_time", Long.valueOf(System.currentTimeMillis())));
                linkedHashMapLJII.putAll(mapLJIIIIZZ);
                strLIZLLL = C511400K3u.LIZIZ(strOptString, linkedHashMapLJII);
            } else {
                strLIZLLL = C2089408Gm.LIZ(secUid2, "full_page", C2097608Jq.LJIIIIZZ(new Pair("show_entrance", ""), new Pair("preview_mode", "true"), new Pair("target_tab", "space")));
            }
        } else {
            IUserService iUserService2 = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService2 == null || (currentUser = iUserService2.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null) {
                secUid = "";
            }
            if (!z) {
                str = "true";
            } else {
                str = "false";
            }
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("enter_from", "");
            pairArr[1] = new Pair("hide_bottom_post", "true");
            pairArr[2] = new Pair("hide_indicator", "true");
            pairArr[3] = new Pair("hide_header", "true");
            pairArr[4] = new Pair("hide_top_setting", "true");
            if (!z ? (strLJII = C511520K4g.LJII(2131849264)) == null : (strLJII = C511520K4g.LJII(2131849265)) == null) {
                strLJII = "";
            }
            pairArr[5] = new Pair("preview_title", strLJII);
            strLIZLLL = C511400K3u.LIZLLL(secUid, "", "true", str, C2097608Jq.LJIIIIZZ(pairArr));
        }
        C0K54.LIZ().LJ(getContext(), strLIZLLL, C2097608Jq.LJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.SpaceFeedTitleAssem.onViewCreated(android.view.View):void");
    }
}
