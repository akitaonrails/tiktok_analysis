package com.ss.android.ugc.aweme.multi.maker;

import X.C04UD;
import X.C1052150dUD;
import X.C1400390mXt;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2429209fW;
import X.C698670Rar;
import X.C735370Ssx;
import X.C786410Ut5;
import X.EnumC1050190dR3;
import X.EnumC1430380nKG;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes17.dex */
public final class TicketMasterOldAnchorMaker extends CommonAnchorMaker {
    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz
    public final C1400390mXt LJIILL() {
        return new C1400390mXt(null, null, new AwS560S0100000_16(this, 377), null, null, 27);
    }

    public final void LJJLIIIJJI() {
        C2344009Gk c2344009Gk;
        String strSubType;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (c2344009Gk = this.LLJ) == null) {
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(LJIILJJIL(), anchorCommonStruct.getSchema());
        smartRouteBuildRoute.withParam("anchor_event_map", (HashMap) LJIJ(c2344009Gk));
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String authorUid = AwemeExtKt.getAuthorUid(interfaceC1392640mLO.LJJLIIIJJIZ());
        String str = "";
        if (authorUid == null) {
            authorUid = "";
        }
        smartRouteBuildRoute.withParam("author_id", authorUid);
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        String aid = interfaceC1392640mLO2.LJJLIIIJJIZ().getAid();
        if (aid == null) {
            aid = "";
        }
        smartRouteBuildRoute.withParam("group_id", aid);
        smartRouteBuildRoute.withParam("anchor_id", anchorCommonStruct.getId());
        smartRouteBuildRoute.withParam("enter_from", LJIJJLI());
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        String aid2 = (interfaceC1392640mLO3 != null ? interfaceC1392640mLO3 : null).LJJLIIIJJIZ().getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        smartRouteBuildRoute.withParam("from_group_id", aid2);
        smartRouteBuildRoute.withParam("previous_page", LJIJJLI());
        smartRouteBuildRoute.withParam("detail_aweme_from", LJIJJLI());
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null && (strSubType = anchorCommonStruct2.subType()) != null) {
            str = strSubType;
        }
        smartRouteBuildRoute.withParam("anchor_subtype", str);
        smartRouteBuildRoute.withParam("anchor_click_time", SystemClock.elapsedRealtime());
        smartRouteBuildRoute.withParam(C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402685956"));
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new TicketMasterOldAnchorMaker();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.THIRD_PART_GENERAL.getTYPE();
    }

    @Override // X.AbstractC1066890drz
    public final void LJJIIJ(C2344009Gk c2344009Gk) {
        Aweme awemeLJIIZILJ = LJIIZILJ();
        String strLJIJJLI = LJIJJLI();
        String strLJIJJ = LJIJJ();
        if (strLJIJJ.length() == 0) {
            strLJIJJ = "video_anchor";
        }
        if (!C04UD.LIZ()) {
            c2344009Gk.LJFF("enter_method", strLJIJJ);
            C698670Rar.LIZ.getClass();
            C698670Rar.LIZ(c2344009Gk, awemeLJIIZILJ, strLJIJJLI, false);
            C20684815ws.LJIILLIIL("multi_anchor_entrance_click", LJIJ(c2344009Gk));
        }
        if (LJIL()) {
            C2344009Gk c2344009GkLJJ = LJJ();
            c2344009GkLJJ.LJIIIIZZ("enter_method", strLJIJJ);
            c2344009GkLJJ.LJIIIIZZ("enter_from", strLJIJJLI);
            c2344009GkLJJ.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(awemeLJIIZILJ));
            String aid = awemeLJIIZILJ.getAid();
            if (aid == null) {
                aid = "";
            }
            c2344009GkLJJ.LJIIIIZZ("group_id", aid);
            c2344009GkLJJ.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJIIZILJ));
            C20684815ws.LJIILLIIL("anchor_entrance_click", c2344009GkLJJ.LIZ);
        }
    }

    public final boolean LJJIL(Context context) {
        try {
            C786410Ut5.Y3(context.getPackageManager(), "com.ticketmaster.mobile.android.na", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            if (anchorCommonStruct2.getType() == type() && Intrinsics.LJFF(anchorCommonStruct2.subType(), "ticketmaster_tp")) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct3);
        LJIILIIL(anchorCommonStruct3);
        this.LLIZ = anchorCommonStruct3;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        if (!this.LLJI) {
            LJJIJL();
        }
        this.LLJ = c2344009Gk;
        LJJII(c2344009Gk, true, true);
        if (C1052150dUD.LIZ()) {
            LJJLIIIJJI();
        } else {
            LJJIJ(new AwS595S0100000_16(this, 236));
        }
    }

    @Override // X.AbstractC1066890drz
    public final void LJJII(C2344009Gk c2344009Gk, boolean z, boolean z2) {
        String str;
        String str2;
        if (C04UD.LIZ()) {
            return;
        }
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        String keyword = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        String strCf = interfaceC1392640mLO2.Cf();
        c2344009Gk2.LJIIIIZZ("enter_method", LJIJJ());
        c2344009Gk2.LJI(new HashMap(c2344009Gk.LIZ));
        c2344009Gk2.LJIIIIZZ("enter_from", strCf);
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            keyword = anchorCommonStruct.getKeyword();
        }
        c2344009Gk2.LJIIIIZZ("anchor_entry", keyword);
        String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
        String str3 = "";
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009Gk2.LJIIIIZZ("author_id", authorUid);
        String aid = awemeLJJLIIIJJIZ.getAid();
        if (aid != null) {
            str3 = aid;
        }
        c2344009Gk2.LJIIIIZZ("group_id", str3);
        c2344009Gk2.LJIIIIZZ("click_type", "webview");
        c2344009Gk2.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ));
        if (LJJIL(LJIILJJIL())) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk2.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        if (C1052150dUD.LIZ()) {
            str2 = "TT_detail_page";
        } else {
            str2 = "weblink";
        }
        c2344009Gk2.LJIIIIZZ("page_type", str2);
        C20684815ws.LJIILLIIL("enter_multi_anchor_detail", c2344009Gk2.LIZ);
    }
}
