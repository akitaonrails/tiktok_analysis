package com.ss.android.ugc.aweme.multi.maker;

import X.C1065100dp6;
import X.C1392670mLR;
import X.C13LP;
import X.C1533610q0l;
import X.C20684815ws;
import X.C2162308dZ;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C718550SGn;
import X.C786410Ut5;
import X.EnumC1050190dR3;
import X.EnumC1430380nKG;
import X.InterfaceC1392640mLO;
import X.InterfaceC1393560mMs;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.drama.app.IDramaAppService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import com.ss.android.ugc.aweme.service.MiniDramaDetailOperator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class PineDramaAnchorMaker extends CommonAnchorMaker {
    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker
    public final Map<String, String> LJJIJIIJIL() {
        String logExtra;
        PaidContentInfo paidContentInfo;
        CollectionDetailModel collectionDetailModelXm;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        Map<String, String> paidContentInnerFeedSourceParam;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("group_id", LJIIZILJ().getAid());
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (paidContentInnerFeedSourceParam = iSeriesCommonETServiceLIZ.getPaidContentInnerFeedSourceParam(LJIIZILJ())) != null) {
            for (Map.Entry<String, String> entry : paidContentInnerFeedSourceParam.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ2 = C718550SGn.LIZ();
        String seriesEnterEntrance = iSeriesCommonETServiceLIZ2 != null ? iSeriesCommonETServiceLIZ2.getSeriesEnterEntrance() : null;
        if (seriesEnterEntrance != null && seriesEnterEntrance.length() > 0) {
            linkedHashMap.put("series_enter_entrance", seriesEnterEntrance);
        }
        IDramaAppService iDramaAppService = (IDramaAppService) PluggableExtentionKt.pluggableSpi$default(IDramaAppService.class, false, false, false, 14, null);
        if (iDramaAppService != null) {
            if (iDramaAppService.LIZJ(LJIIZILJ(), LJIJJLI()) && !iDramaAppService.LJFF() && (paidContentInfo = LJIIZILJ().mPaidContentInfo) != null) {
                long paidCollectionId = paidContentInfo.getPaidCollectionId();
                if (paidCollectionId > 0) {
                    MiniDramaDetailOperator.LIZ.getClass();
                    MiniDramaDetailOperator miniDramaDetailOperatorLIZ = C1392670mLR.LIZ();
                    if (miniDramaDetailOperatorLIZ != null && (collectionDetailModelXm = miniDramaDetailOperatorLIZ.Xm(paidCollectionId)) != null && (urlModel = collectionDetailModelXm.collectionCover) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null && (true ^ a0.LJJJIL(str))) {
                        linkedHashMap.put("drama_cover", str);
                    }
                }
            }
        }
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (logExtra = anchorCommonStruct.getLogExtra()) == null) {
            logExtra = "";
        }
        linkedHashMap.put("log_extra", logExtra);
        return linkedHashMap;
    }

    public final C2344009Gk LJJIL() throws JSONException {
        Map<String, String> paidContentInnerFeedSourceParam;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", LJIJJLI());
        c2344009Gk.LJIIIIZZ("outreach_type", "feed_anchor");
        c2344009Gk.LIZJ(EnumC1430380nKG.PINE_DRAMA_ANCHOR.getTYPE(), "outreach_key");
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        c2344009Gk.LJIIIIZZ("outreach_intention", C2162308dZ.LJFF(interfaceC1392640mLO.LIZIZ(), "com.ss.android.ttmd.video") ? "guide_open" : "guide_download");
        c2344009Gk.LJIIIIZZ("outreach_to_app_id", "845221");
        c2344009Gk.LJIIIIZZ("outreach_content", LJJLIIIJJI(LJIJJLI(), ((C1065100dp6) LJJJJJL()).LJIIIIZZ("outreach_content")));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("group_id", LJIIZILJ().getAid());
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
        if (iSeriesCommonETServiceLIZ != null && (paidContentInnerFeedSourceParam = iSeriesCommonETServiceLIZ.getPaidContentInnerFeedSourceParam(LJIIZILJ())) != null && !paidContentInnerFeedSourceParam.isEmpty()) {
            for (Map.Entry<String, String> entry : paidContentInnerFeedSourceParam.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        ISeriesCommonETService.LIZ.getClass();
        ISeriesCommonETService iSeriesCommonETServiceLIZ2 = C718550SGn.LIZ();
        String seriesEnterEntrance = iSeriesCommonETServiceLIZ2 != null ? iSeriesCommonETServiceLIZ2.getSeriesEnterEntrance() : null;
        if (C1533610q0l.LIZIZ(seriesEnterEntrance)) {
            jSONObject.put("series_enter_entrance", seriesEnterEntrance);
        }
        try {
            JSONObject jSONObject2 = new JSONObject(((C1065100dp6) LJJJJJL()).LJIIIIZZ("drama_event_dynamic_extra"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject2.optString(next));
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry2.getKey(), entry2.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c2344009Gk.LJFF("outreach_extra_info", C786410Ut5.J3(jSONObject));
        return c2344009Gk;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new PineDramaAnchorMaker();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.PINE_DRAMA_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) throws JSONException {
        LJJIIJ(c2344009Gk);
        C2344009Gk c2344009GkLJJIL = LJJIL();
        c2344009GkLJJIL.LJIIIIZZ("outreach_click_method", "pre_click");
        C20684815ws.LJIILLIIL("guide_user_m2_click", c2344009GkLJJIL.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        IDramaAppService iDramaAppService = (IDramaAppService) PluggableExtentionKt.pluggableSpi$default(IDramaAppService.class, false, false, false, 14, null);
        if (iDramaAppService != null && !iDramaAppService.LJ(LJIIZILJ(), LJIJJLI())) {
            ArrayList arrayList = new ArrayList();
            for (AnchorCommonStruct anchorCommonStruct : list) {
                if (anchorCommonStruct.getType() == type()) {
                    arrayList.add(anchorCommonStruct);
                }
            }
            list.removeAll(arrayList);
            return EnumC1050190dR3.NOT_FOUND;
        }
        ArrayList arrayList2 = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct2 : list) {
            if (anchorCommonStruct2.getType() == type()) {
                arrayList2.add(anchorCommonStruct2);
            }
        }
        if (arrayList2.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) ListProtector.get(arrayList2, 0);
        list.remove(anchorCommonStruct3);
        LJIILIIL(anchorCommonStruct3);
        this.LLIZ = anchorCommonStruct3;
        if (arrayList2.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void p1(C2344009Gk c2344009Gk) throws JSONException {
        super.p1(c2344009Gk);
        IDramaAppService iDramaAppService = (IDramaAppService) PluggableExtentionKt.pluggableSpi$default(IDramaAppService.class, false, false, false, 14, null);
        if (iDramaAppService != null) {
            iDramaAppService.LJII(LJIIZILJ(), LJIJJLI());
        }
        C2344009Gk c2344009GkLJJIL = LJJIL();
        c2344009GkLJJIL.LJIIIIZZ("outreach_show_method", "pre_show");
        C20684815ws.LJIILLIIL("guide_user_m2_show", c2344009GkLJJIL.LIZ);
    }

    public static String LJJLIIIJJI(String str, String str2) {
        if (Intrinsics.LJFF(str, "paid_series_detail_page") && !u.LJIIZILJ(str2, "_innerfeed", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_innerfeed");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1 A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:32:0x0085, B:35:0x0096, B:53:0x00dd, B:38:0x00a5, B:43:0x00c1, B:47:0x00cb, B:49:0x00cf, B:51:0x00d5, B:54:0x00e1, B:57:0x00ed, B:42:0x00b6, B:40:0x00a9), top: B:86:0x0085, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.multi.maker.CommonAnchorMaker, X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL(android.view.View r11, X.C2344009Gk r12) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.multi.maker.PineDramaAnchorMaker.LJJJLL(android.view.View, X.09Gk):void");
    }
}
