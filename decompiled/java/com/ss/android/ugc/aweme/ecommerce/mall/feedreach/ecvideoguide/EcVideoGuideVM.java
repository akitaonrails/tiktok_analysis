package com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide;

import X.AnonymousClass0956;
import X.C09R9;
import X.C0PEM;
import X.C1158840gGI;
import X.C123100dR;
import X.C13LE;
import X.C1421105hJ;
import X.C1770040wA6;
import X.C1770050wA7;
import X.C1770080wAA;
import X.C1770090wAB;
import X.C1770100wAC;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C610120NwQ;
import X.C610180NwW;
import X.C948503nH;
import X.EnumC1770060wA8;
import X.EnumC1770070wA9;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class EcVideoGuideVM extends AssemViewModel<C1158840gGI> {
    public static final /* synthetic */ int LLJIJIL = 0;
    public Aweme LLILLJJLI;
    public C1770090wAB LLJ;
    public C1770080wAA LLJI;
    public String LL = "";
    public final C09R9 LLILLL = new C09R9(this, C13LE.LIZ(C610120NwQ.class));
    public final String LLILZ = "-1";
    public final String LLILZIL = "{{product_category}}";
    public final String LLILZLL = "homepage_hot";
    public final String LLIZ = "fyp_ecom_video.shop_now_button.in_app";
    public final String LLIZLLLIL = "mall_homepage";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158840gGI(0);
    }

    public final void wQ2() {
        C1770090wAB c1770090wAB = this.LLJ;
        if (c1770090wAB != null) {
            AnonymousClass0956 anonymousClass0956 = c1770090wAB.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJ = null;
        }
        ((IVideoGuideService) ServiceManager.get().getService(IVideoGuideService.class)).LIZ(false);
    }

    public final void xQ2(C1770080wAA c1770080wAA) {
        String str;
        Map<String, Object> map;
        String str2;
        Map<String, Object> map2;
        this.LLJI = c1770080wAA;
        Pair[] pairArr = new Pair[1];
        String str3 = "";
        if (c1770080wAA == null || (str = c1770080wAA.LIZ) == null) {
            str = "";
        }
        pairArr[0] = new Pair("video_id", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (c1770080wAA != null && (map2 = c1770080wAA.LJIIIZ) != null) {
            mapLJIIJ.putAll(map2);
        }
        C1421105hJ.LIZJ("tiktokec_anchor_panel_close_for_mall", mapLJIIJ);
        Pair[] pairArr2 = new Pair[2];
        pairArr2[0] = new Pair("stage", EnumC1770070wA9.ANCHOR_PANEL_HIDE.getValue());
        if (c1770080wAA != null && (str2 = c1770080wAA.LIZ) != null) {
            str3 = str2;
        }
        pairArr2[1] = new Pair("video_id", str3);
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
        if (c1770080wAA != null && (map = c1770080wAA.LJIIIZ) != null) {
            mapLJIIJ2.putAll(map);
        }
        C1421105hJ.LIZJ("rd_tiktokec_shop_video_guide", mapLJIIJ2);
        C1770090wAB c1770090wAB = this.LLJ;
        if (c1770090wAB == null) {
            return;
        }
        c1770090wAB.LJ = false;
        C1770080wAA c1770080wAA2 = this.LLJI;
        if (c1770080wAA2 != null) {
            if (c1770090wAB.LJIIIIZZ) {
                C1770050wA7.LIZJ(c1770080wAA2, EnumC1770060wA8.ANCHOR_PANEL_HIDE_HANDLED.getValue(), "panel_show_for_mall");
            } else {
                C948503nH.LJI(this, C0PEM.LIZJ, new C1770040wA6(this, c1770080wAA2, c1770090wAB, "panel_show_for_mall", null));
            }
        }
    }

    public final void yQ2(C1770080wAA c1770080wAA) {
        String str;
        long j;
        Aweme aweme;
        AnonymousClass0956 anonymousClass0956;
        Map<String, Object> map;
        String str2;
        Map<String, Object> map2;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("stage", EnumC1770070wA9.ANCHOR_PANEL_SHOW.getValue());
        String str3 = "";
        if (c1770080wAA == null || (str = c1770080wAA.LIZ) == null) {
            str = "";
        }
        pairArr[1] = new Pair("video_id", str);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (c1770080wAA != null && (map2 = c1770080wAA.LJIIIZ) != null) {
            mapLJIIJ.putAll(map2);
        }
        C1421105hJ.LIZJ("rd_tiktokec_shop_video_guide", mapLJIIJ);
        Pair[] pairArr2 = new Pair[1];
        if (c1770080wAA != null && (str2 = c1770080wAA.LIZ) != null) {
            str3 = str2;
        }
        pairArr2[0] = new Pair("video_id", str3);
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
        if (c1770080wAA != null && (map = c1770080wAA.LJIIIZ) != null) {
            mapLJIIJ2.putAll(map);
        }
        C1421105hJ.LIZJ("tiktokec_anchor_panel_show_for_mall", mapLJIIJ2);
        C1770090wAB c1770090wAB = this.LLJ;
        if (c1770090wAB != null && (c1770090wAB.LJI || c1770090wAB.LJFF)) {
            return;
        }
        String str4 = c1770080wAA.LIZ;
        C1770090wAB c1770090wAB2 = new C1770090wAB();
        if (c1770090wAB != null) {
            j = c1770090wAB.LIZ;
        } else {
            j = 0;
        }
        c1770090wAB2.LIZ = j + 1;
        c1770090wAB2.LIZIZ = str4;
        c1770090wAB2.LJ = true;
        this.LLJ = c1770090wAB2;
        if (c1770090wAB != null && (anonymousClass0956 = c1770090wAB.LIZJ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LLJ != null) {
            ((IVideoGuideService) ServiceManager.get().getService(IVideoGuideService.class)).LIZ(false);
        }
        C1770090wAB c1770090wAB3 = this.LLJ;
        if ((c1770090wAB3 != null && (c1770090wAB3.LJI || c1770090wAB3.LJFF)) || (aweme = this.LLILLJJLI) == null) {
            return;
        }
        if (c1770090wAB3 == null) {
            c1770090wAB3 = new C1770090wAB();
            c1770090wAB3.LIZ = 1L;
            c1770090wAB3.LIZIZ = aweme.getAid();
        } else {
            AnonymousClass0956 anonymousClass09562 = c1770090wAB3.LIZJ;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
        }
        this.LLJ = c1770090wAB3;
        ((IVideoGuideService) ServiceManager.get().getService(IVideoGuideService.class)).LIZ(false);
        this.LLJI = c1770080wAA;
        c1770090wAB3.LIZJ = C948503nH.LJI(this, C0PEM.LIZJ, new C610180NwW(this, c1770080wAA, c1770090wAB3, null, null));
    }

    public static Pair vQ2(C1770080wAA c1770080wAA, C1770090wAB c1770090wAB) {
        C1770100wAC c1770100wAC;
        DiversionEntranceRes diversionEntranceRes;
        if (c1770090wAB.LJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("can not show video guide ===");
            EnumC1770060wA8 enumC1770060wA8 = EnumC1770060wA8.ORDER_SUBMITTED;
            sbLIZ.append(enumC1770060wA8.getValue());
            C2188811AlT.LIZIZ(sbLIZ);
            return new Pair(Boolean.FALSE, enumC1770060wA8.getValue());
        }
        if (!c1770090wAB.LJII) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("can not show video guide ===");
            EnumC1770060wA8 enumC1770060wA82 = EnumC1770060wA8.RESPONSE_NULL;
            sbLIZ2.append(enumC1770060wA82.getValue());
            C2188811AlT.LIZIZ(sbLIZ2);
            return new Pair(Boolean.FALSE, enumC1770060wA82.getValue());
        }
        if (C123100dR.LIZ(c1770090wAB.LIZIZ) && C123100dR.LIZ(c1770080wAA.LIZ) && Intrinsics.LJFF(c1770090wAB.LIZIZ, c1770080wAA.LIZ) && (c1770100wAC = c1770090wAB.LIZLLL) != null && (diversionEntranceRes = c1770100wAC.LIZIZ) != null && diversionEntranceRes.config != null) {
            if (c1770090wAB.LJI) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("can not show video guide ===");
                EnumC1770060wA8 enumC1770060wA83 = EnumC1770060wA8.VIDEO_GUIDE_SHOWED;
                sbLIZ3.append(enumC1770060wA83.getValue());
                C2188811AlT.LIZIZ(sbLIZ3);
                return new Pair(Boolean.FALSE, enumC1770060wA83.getValue());
            }
            if (((IShopIconService) ServiceManager.get().getService(IShopIconService.class)).xu()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("can not show video guide ===");
                EnumC1770060wA8 enumC1770060wA84 = EnumC1770060wA8.TOOLTIP_SHOWING;
                sbLIZ4.append(enumC1770060wA84.getValue());
                C2188811AlT.LIZIZ(sbLIZ4);
                return new Pair(Boolean.FALSE, enumC1770060wA84.getValue());
            }
            return new Pair(Boolean.TRUE, "show_success");
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("can not show video guide ===");
        EnumC1770060wA8 enumC1770060wA85 = EnumC1770060wA8.DIVERSION_CONFIG_NULL;
        sbLIZ5.append(enumC1770060wA85.getValue());
        C2188811AlT.LIZIZ(sbLIZ5);
        return new Pair(Boolean.FALSE, enumC1770060wA85.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse r13, X.C1770090wAB r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM.zQ2(com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse, X.0wAB, X.05Vn):java.lang.Object");
    }
}
