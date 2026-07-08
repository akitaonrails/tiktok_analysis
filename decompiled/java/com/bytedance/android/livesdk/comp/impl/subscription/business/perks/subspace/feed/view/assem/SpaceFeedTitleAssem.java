package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem;

import X.C019F;
import X.C0KBI;
import X.C1161920gLG;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C495520Jby;
import X.C497390Jez;
import X.C497740JfY;
import X.C504510JqT;
import X.C506150Jt7;
import X.C506260JtI;
import X.C508940Jxc;
import X.C724750Sbp;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final class SpaceFeedTitleAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public C504510JqT LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SpaceFeedTitleAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SpaceFeedTitleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C506150Jt7(c19719912DlLIZ), new C506260JtI(), null, true);
    }

    public final C504510JqT Go() {
        if (this.LLJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C504510JqT.class, null);
            this.LLJ = interfaceC1555100qZQLIZIZ != null ? (C504510JqT) interfaceC1555100qZQLIZIZ.getSource() : null;
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
        int i;
        String strLJIJI;
        String strLJ;
        int i2;
        if (LiveSubOnlySpacePreviewSetting.INSTANCE.displaySubOnlyPreviewTab()) {
            String secUid2 = UserService.getInstance().user().getCurrentUser().getSecUid();
            if (z) {
                C0KBI c0kbi = C0KBI.SUBSCRIBED_NOT_EXPIRED;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("preview_mode", "true"), new Pair("target_tab", "space"));
                String userSubscribeStateScheme = LiveSubscribeLynxUrl.INSTANCE.getValue().getUserSubscribeStateScheme();
                if (userSubscribeStateScheme.length() == 0) {
                    userSubscribeStateScheme = "sslocal://webcast_lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_subscription%2Fpages%2Fuser%2Fsubscribe%2Fstate.js&should_full_screen=1&hide_nav_bar=1&hide_status_bar=0&hide_loading=1&trans_status_bar=0&use_spark=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Fsubscription";
                }
                C495520Jby c495520Jby = new C495520Jby(userSubscribeStateScheme);
                c495520Jby.LIZJ("anchor_id", secUid2);
                c495520Jby.LIZJ("log_anchor_id", secUid2);
                c495520Jby.LIZJ("sec_anchor_id", secUid2);
                c495520Jby.LIZJ("show_entrance", "");
                c495520Jby.LIZJ("subscribe_state", c0kbi.getState());
                c495520Jby.LIZIZ(System.currentTimeMillis(), "click_time");
                for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                    c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
                }
                strLJ = c495520Jby.LIZLLL();
                strLJ.toString();
            } else {
                strLJ = C497390Jez.LIZIZ(secUid2, "full_page", C2097608Jq.LJIIIIZZ(new Pair("show_entrance", ""), new Pair("preview_mode", "true"), new Pair("target_tab", "space")));
            }
        } else {
            InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
            if (currentUser == null || (secUid = currentUser.getSecUid()) == null) {
                secUid = "";
            }
            String str2 = "false";
            if (!z) {
                str = "true";
            } else {
                str = "false";
            }
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("enter_from", "");
            pairArr[1] = new Pair("hide_bottom_post", "true");
            pairArr[2] = new Pair("hide_indicator", "true");
            pairArr[3] = new Pair("hide_header", "true");
            pairArr[4] = new Pair("hide_top_setting", "true");
            if (z) {
                if (Ho().DQ2()) {
                    i2 = 2131856649;
                } else {
                    i2 = 2131849265;
                }
                strLJIJI = C497740JfY.LJIJI(i2);
            } else {
                if (Ho().DQ2()) {
                    i = 2131856648;
                } else {
                    i = 2131849264;
                }
                strLJIJI = C497740JfY.LJIJI(i);
            }
            pairArr[5] = new Pair("preview_title", strLJIJI);
            if (Ho().DQ2()) {
                str2 = "true";
            }
            pairArr[6] = new Pair("is_super_fans", str2);
            strLJ = C508940Jxc.LJ(secUid, "", "true", str, C2097608Jq.LJIIIIZZ(pairArr));
        }
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), strLJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01b4  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SpaceFeedTitleAssem.onViewCreated(android.view.View):void");
    }
}
