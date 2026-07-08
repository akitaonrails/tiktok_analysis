package com.ss.android.ugc.aweme.multi.maker;

import X.C01GW;
import X.C098200Yq;
import X.C1017070cZd;
import X.C1050970dSJ;
import X.C1050980dSK;
import X.C1067570dt5;
import X.C1227904rF;
import X.C1400390mXt;
import X.C1537900q7g;
import X.C1541950qED;
import X.C1741890vQh;
import X.C189200o6;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C452501pT;
import X.EnumC1430380nKG;
import X.InterfaceC1392640mLO;
import X.InterfaceC20673515v3;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService;
import com.ss.android.ugc.aweme.commercialize.anchor.model.AnchorData;
import com.ss.android.ugc.aweme.commercialize.anchor.model.MapExtra;
import com.ss.android.ugc.aweme.commercialize.anchor.model.ReportData;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public class GameLivePartnershipAnchorROI2Strategy implements ICommerceAnchorOutService {
    public static final /* synthetic */ int LJFF = 0;
    public Aweme LIZ;
    public AnchorData LIZIZ;
    public AnchorCommonStruct LIZJ;
    public boolean LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(211));

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService
    public final void LIZJ() {
        InterfaceC1392640mLO anchorContext;
        Activity activityLIZIZ;
        String schema;
        String strValueOf;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC1392640mLO anchorContext2;
        InterfaceC1392640mLO anchorContext3;
        InterfaceC1392640mLO anchorContext4;
        AwemeCommerceStruct commerceVideoAuthInfo;
        AwemeRawAd pseudoAdData;
        InterfaceC1392640mLO anchorContext5;
        AnchorCommonStruct anchorCommonStruct;
        String dataFromExtra;
        Integer numLJIIJJI;
        Aweme aweme;
        Map<String, String> trackingData;
        MapExtra mapExtra;
        ReportData reportData;
        AnchorData anchorData = this.LIZIZ;
        if (anchorData == null || (anchorContext = anchorData.getAnchorContext()) == null || (activityLIZIZ = anchorContext.LIZIZ()) == null) {
            return;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LIZJ;
        if (anchorCommonStruct2 == null || (schema = anchorCommonStruct2.getSchema()) == null) {
            schema = "";
        }
        Uri uri = UriProtector.parse(schema);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        boolean zLJFF = LJFF(uri);
        builderBuildUpon.appendQueryParameter("use_spark", "1");
        builderBuildUpon.appendQueryParameter(Scene.SCENE_SERVICE, "2");
        if (!((Boolean) this.LJ.getValue()).booleanValue() && !zLJFF) {
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(schema);
            c1537900q7g.getClass();
            new C1541950qED(activityLIZIZ, sparkContext).LIZIZ();
            return;
        }
        n nVar = new n();
        Activity activityLIZIZ2 = null;
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            AnchorData anchorData2 = this.LIZIZ;
            String strLJIIIIZZ = (anchorData2 == null || (mapExtra = anchorData2.getMapExtra()) == null || (reportData = mapExtra.getReportData()) == null) ? null : C1741890vQh.LJIIIIZZ(reportData);
            c1227904rF.getClass();
            nVar.LJJIFFI("report_data", (k) C1227904rF.LIZIZ(strLJIIIIZZ, n.class));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            C1227904rF c1227904rF2 = C1227904rF.LIZ;
            AnchorData anchorData3 = this.LIZIZ;
            String strLJIIIIZZ2 = (anchorData3 == null || (trackingData = anchorData3.getTrackingData()) == null) ? null : C1741890vQh.LJIIIIZZ(trackingData);
            c1227904rF2.getClass();
            nVar.LJJIFFI("tracking_data", (k) C1227904rF.LIZIZ(strLJIIIIZZ2, n.class));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Aweme aweme2 = this.LIZ;
        int iIntValue = (!(aweme2 != null && C1017070cZd.LJIL(aweme2).length() > 0 && ((aweme = this.LIZ) == null || !C1017070cZd.LJJJJZ(aweme))) || (anchorCommonStruct = this.LIZJ) == null || (dataFromExtra = anchorCommonStruct.getDataFromExtra("bc_toggle_style_type", "")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(dataFromExtra)) == null) ? -1 : numLJIIJJI.intValue();
        Pair[] pairArr = new Pair[13];
        AnchorCommonStruct anchorCommonStruct3 = this.LIZJ;
        pairArr[0] = new Pair("anchor_extra", String.valueOf(anchorCommonStruct3 != null ? anchorCommonStruct3.getExtra() : null));
        Aweme aweme3 = this.LIZ;
        pairArr[1] = new Pair("group_id", String.valueOf(aweme3 != null ? aweme3.getGroupId() : null));
        AnchorCommonStruct anchorCommonStruct4 = this.LIZJ;
        pairArr[2] = new Pair("anchor_type", String.valueOf(anchorCommonStruct4 != null ? anchorCommonStruct4.getType() : EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR.getTYPE()));
        Aweme aweme4 = this.LIZ;
        pairArr[3] = new Pair("author_id", aweme4 != null ? AwemeExtKt.getAuthorUid(aweme4) : null);
        Aweme aweme5 = this.LIZ;
        pairArr[4] = new Pair("request_id", aweme5 != null ? aweme5.getRequestId() : null);
        AnchorData anchorData4 = this.LIZIZ;
        pairArr[5] = new Pair("enter_from", (anchorData4 == null || (anchorContext5 = anchorData4.getAnchorContext()) == null) ? null : anchorContext5.Cf());
        Aweme aweme6 = this.LIZ;
        pairArr[6] = new Pair("awemeRawAd", (aweme6 == null || (commerceVideoAuthInfo = aweme6.getCommerceVideoAuthInfo()) == null || (pseudoAdData = commerceVideoAuthInfo.getPseudoAdData()) == null) ? null : C1741890vQh.LJIIIIZZ(pseudoAdData));
        pairArr[7] = new Pair("roi2_extra", nVar.toString());
        Aweme aweme7 = this.LIZ;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (aweme7 == null || (strValueOf = String.valueOf(C1067570dt5.LIZIZ(aweme7))) == null) {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[8] = new Pair("roi2_status", strValueOf);
        Aweme aweme8 = this.LIZ;
        pairArr[9] = new Pair("bc_label_text", aweme8 != null ? C1017070cZd.LJIL(aweme8) : "");
        Aweme aweme9 = this.LIZ;
        if (aweme9 == null || !C1017070cZd.LJJJJZ(aweme9)) {
            str = "1";
        }
        pairArr[10] = new Pair("bc_label_show", str);
        pairArr[11] = new Pair("bc_toggle_style_type", String.valueOf(iIntValue));
        pairArr[12] = new Pair("from_feed", "1");
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        String string = builderBuildUpon.toString();
        AnchorData anchorData5 = this.LIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7zK0 = (anchorData5 == null || (anchorContext4 = anchorData5.getAnchorContext()) == null) ? null : anchorContext4.k0();
        AnchorData anchorData6 = this.LIZIZ;
        C1050980dSK c1050980dSKLIZ = C1050970dSJ.LIZ(interfaceC665370Q7zK0, (anchorData6 == null || (anchorContext3 = anchorData6.getAnchorContext()) == null) ? null : anchorContext3.LIZIZ(), string, iIntValue);
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null) {
            return;
        }
        AnchorData anchorData7 = this.LIZIZ;
        if (anchorData7 != null && (anchorContext2 = anchorData7.getAnchorContext()) != null) {
            activityLIZIZ2 = anchorContext2.LIZIZ();
        }
        interfaceC20673515v3K4.pv(activityLIZIZ2, string, mapLJIIIIZZ, c1050980dSKLIZ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService
    public final void LJ() {
        String schema;
        InterfaceC1392640mLO anchorContext;
        AnchorCommonStruct anchorCommonStruct = this.LIZJ;
        if (anchorCommonStruct == null || (schema = anchorCommonStruct.getSchema()) == null) {
            schema = "";
        }
        Uri uri = UriProtector.parse(schema);
        boolean zLJFF = LJFF(uri);
        if (((Boolean) this.LJ.getValue()).booleanValue() && zLJFF && u.LJIJI(uri.getHost(), "webcast_game_detail", false)) {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            builderBuildUpon.appendQueryParameter(Scene.SCENE_SERVICE, "2");
            Pair[] pairArr = new Pair[6];
            AnchorCommonStruct anchorCommonStruct2 = this.LIZJ;
            String strCf = null;
            pairArr[0] = new Pair("anchor_extra", String.valueOf(anchorCommonStruct2 != null ? anchorCommonStruct2.getExtra() : null));
            Aweme aweme = this.LIZ;
            pairArr[1] = new Pair("group_id", String.valueOf(aweme != null ? aweme.getGroupId() : null));
            AnchorCommonStruct anchorCommonStruct3 = this.LIZJ;
            pairArr[2] = new Pair("anchor_type", String.valueOf(anchorCommonStruct3 != null ? anchorCommonStruct3.getType() : EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR.getTYPE()));
            Aweme aweme2 = this.LIZ;
            pairArr[3] = new Pair("author_id", aweme2 != null ? AwemeExtKt.getAuthorUid(aweme2) : null);
            Aweme aweme3 = this.LIZ;
            pairArr[4] = new Pair("request_id", aweme3 != null ? aweme3.getRequestId() : null);
            AnchorData anchorData = this.LIZIZ;
            if (anchorData != null && (anchorContext = anchorData.getAnchorContext()) != null) {
                strCf = anchorContext.Cf();
            }
            pairArr[5] = new Pair("enter_from", strCf);
            Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            InterfaceC20673515v3 interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
            if (interfaceC20673515v3K4 != null) {
                interfaceC20673515v3K4.LJIJJ(builderBuildUpon.build().toString(), mapLJIIIIZZ);
            }
            this.LIZLLL = true;
        }
        InterfaceC20673515v3 interfaceC20673515v3K42 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4();
        if (interfaceC20673515v3K42 != null) {
            interfaceC20673515v3K42.LJLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService
    public final C1400390mXt o2() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1067570dt5.LIZ(c2344009Gk, this.LIZJ, this.LIZ);
        Map<String, String> map = c2344009Gk.LIZ;
        return new C1400390mXt(new AwS560S0100000_16(map, (Map<String, String>) 370), new AwS560S0100000_16(map, (Map<String, String>) 371), new AwS560S0100000_16(map, (Map<String, String>) 372), null, null, 24);
    }

    public static boolean LJFF(Uri uri) {
        Object c098200Yq;
        if (uri == null || !uri.isHierarchical()) {
            return false;
        }
        try {
            c098200Yq = Boolean.valueOf(Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "use_game_partnership_sheet"), "1"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService
    public final void LLLIZZ(Aweme aweme) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        if (aweme != null && this.LIZLLL && (interfaceC20673515v3K4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4()) != null) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            interfaceC20673515v3K4.LJJJJI(aid);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.anchor.interfaces.ICommerceAnchorOutService
    public final void LIZIZ(Aweme aweme, AnchorData anchorData) {
        this.LIZ = aweme;
        this.LIZIZ = anchorData;
        this.LIZJ = anchorData.getAnchor();
    }
}
