package kotlin.jvm.internal;

import X.C05JD;
import X.C06UM;
import X.C09AY;
import X.C0PEM;
import X.C1189060h32;
import X.C1204470hRt;
import X.C1204880hSY;
import X.C1205290hTD;
import X.C1227904rF;
import X.C1DFH;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C631370Opb;
import X.C724240Sb0;
import X.C724270Sb3;
import X.EnumC1161660gKq;
import X.InterfaceC1381130m2p;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.nearby.feedcard.NearbyFeedCellAssem;
import com.ss.android.ugc.tiktok.report.interfaces.IReportService;
import com.ss.android.ugc.tiktok.report.utils.ReportConfigUtils;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS3S2101000_18 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS3S2101000_18 awS3S2101000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadFirstScreen biz=");
        sbLIZ.append(awS3S2101000_18.s0);
        sbLIZ.append(" url=");
        sbLIZ.append(awS3S2101000_18.s1);
        sbLIZ.append(" mode=");
        sbLIZ.append((EnumC1161660gKq) awS3S2101000_18.l2);
        sbLIZ.append(" viewCount=");
        sbLIZ.append(awS3S2101000_18.i3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS3S2101000_18 awS3S2101000_18) {
        Object obj;
        String str;
        String aid;
        String str2;
        String aid2;
        String authorUid;
        String str3;
        String aid3;
        String authorUid2;
        String aid4;
        Object obj2;
        String authorUid3;
        PoiDataStruct poiDataStruct;
        String string;
        PoiDataStruct poiDataStruct2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        NearbyFeedCellAssem nearbyFeedCellAssem = (NearbyFeedCellAssem) awS3S2101000_18.l2;
        if (nearbyFeedCellAssem.LLLIZZ && jCurrentTimeMillis - nearbyFeedCellAssem.LLLJ > 500) {
            nearbyFeedCellAssem.LLLJ = jCurrentTimeMillis;
            nearbyFeedCellAssem.LLLIZZ = false;
            C1205290hTD c1205290hTD = C1205290hTD.LIZ;
            String str4 = awS3S2101000_18.s0;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = awS3S2101000_18.s1;
            if (str6 == null) {
                str6 = "";
            }
            C724270Sb3 c724270Sb3 = nearbyFeedCellAssem.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String strValueOf = String.valueOf(((C1204470hRt) obj).LL.getAwemeType());
            Aweme aweme = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme == null || (poiDataStruct2 = aweme.getPoiDataStruct()) == null || (str = poiDataStruct2.poiId) == null) {
                str = "";
            }
            String strValueOf2 = String.valueOf(awS3S2101000_18.i3);
            c1205290hTD.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_nearby");
            c2344009Gk.LJIIIIZZ("enter_method", "long_press");
            c2344009Gk.LJIIIIZZ("group_id", str4);
            c2344009Gk.LJIIIIZZ("author_id", str6);
            c2344009Gk.LJIIIIZZ("aweme_type", strValueOf);
            c2344009Gk.LJIIIIZZ("enable_location", C1204880hSY.LIZ());
            C1189060h32.LJJIFFI(c2344009Gk, "poi_id", str);
            c2344009Gk.LJIIIIZZ("nearby_tab_city_id", C1204880hSY.LIZIZ());
            c2344009Gk.LJIIIIZZ("nearby_rank", strValueOf2);
            C20684815ws.LJIILLIIL("click_report", c2344009Gk.LIZ);
            Aweme aweme2 = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                aid = "";
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", "homepage_nearby");
            c2344009Gk2.LJIIIIZZ("enter_method", "long_press");
            c2344009Gk2.LJIIIIZZ("group_id", aid);
            C20684815ws.LJIILLIIL("report", c2344009Gk2.LIZ);
            Aweme aweme3 = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme3 != null && AwemeExtKt.isPhotoMode(aweme3)) {
                str2 = "photo_mode";
            } else {
                str2 = "video";
            }
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("enter_method", "long_press");
            pairArr[1] = new Pair("enable_location", C1204880hSY.LIZ());
            Aweme aweme4 = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme4 == null || (aid2 = aweme4.getAid()) == null) {
                aid2 = "";
            }
            pairArr[2] = new Pair("group_id", aid2);
            Aweme aweme5 = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme5 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme5)) == null) {
                authorUid = "";
            }
            pairArr[3] = new Pair("author_id", authorUid);
            Aweme aweme6 = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme6 != null && (string = Integer.valueOf(aweme6.getAwemeType()).toString()) != null) {
                str5 = string;
            }
            pairArr[4] = new Pair("aweme_type", str5);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Aweme aweme7 = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme7 != null && (poiDataStruct = aweme7.getPoiDataStruct()) != null) {
                str3 = poiDataStruct.poiId;
            } else {
                str3 = null;
            }
            C1189060h32.LJIJI(mapLJIIJ, "poi_id", str3);
            C1227904rF.LIZ.getClass();
            String json = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), mapLJIIJ);
            Uri.Builder builderAppendQueryParameter = UriProtector.parse("https://www.tiktok.com/falcon/communitysafety/page/reasons/index.html?isFirst=1&container_color_auto_dark=1&hide_nav_bar=1&should_full_screen=1&hide_loading=1").buildUpon().appendQueryParameter("report_type", str2);
            Aweme aweme8 = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme8 != null) {
                aid3 = aweme8.getAid();
            } else {
                aid3 = null;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("object_id", aid3);
            Aweme aweme9 = ((C1204470hRt) C631370Opb.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2)).LL;
            if (aweme9 != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme9);
            } else {
                authorUid2 = null;
            }
            UriProtector.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", builderAppendQueryParameter2.appendQueryParameter("owner_id", authorUid2).appendQueryParameter("enter_from", "homepage_nearby").appendQueryParameter("enter_time", String.valueOf(System.currentTimeMillis())).appendQueryParameter("extra_log_params", json).toString()).toString();
            if (C724240Sb0.LIZ((NearbyFeedCellAssem) awS3S2101000_18.l2) != null) {
                NearbyFeedCellAssem nearbyFeedCellAssem2 = (NearbyFeedCellAssem) awS3S2101000_18.l2;
                Uri.Builder builderAppendQueryParameter3 = new Uri.Builder().appendQueryParameter("report_type", str2);
                Aweme aweme10 = ((C1204470hRt) C631370Opb.LIZ(nearbyFeedCellAssem2)).LL;
                if (aweme10 != null) {
                    aid4 = aweme10.getAid();
                } else {
                    aid4 = null;
                }
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("object_id", aid4);
                C724270Sb3 c724270Sb32 = nearbyFeedCellAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                Aweme aweme11 = ((C1204470hRt) obj2).LL;
                if (aweme11 != null) {
                    authorUid3 = AwemeExtKt.getAuthorUid(aweme11);
                } else {
                    authorUid3 = null;
                }
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("owner_id", authorUid3).appendQueryParameter("enter_from", "homepage_nearby").appendQueryParameter("enter_time", String.valueOf(System.currentTimeMillis())).appendQueryParameter("extra_log_params", json);
                ReportConfigUtils reportConfigUtils = ReportConfigUtils.INSTANCE;
                Bundle bundle = new Bundle();
                bundle.putInt("111", 1);
                InterfaceC1381130m2p interfaceC1381130m2pConvertToReportConfig = reportConfigUtils.convertToReportConfig(builderAppendQueryParameter5, bundle);
                IReportService.LIZ.getClass();
                C06UM.LIZ().report(new AwS600S0100000_21(interfaceC1381130m2pConvertToReportConfig, 191));
            }
            ((NearbyFeedCellAssem) awS3S2101000_18.l2).LLLIL = true;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C05JD((NearbyFeedCellAssem) awS3S2101000_18.l2, null), 3);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S2101000_18(NearbyFeedCellAssem nearbyFeedCellAssem, String str, String str2, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = nearbyFeedCellAssem;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS3S2101000_18(String str, String str2, EnumC1161660gKq enumC1161660gKq, int i, int i2) {
        super(0);
        this.$t = i2;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = enumC1161660gKq;
        this.i3 = i;
    }
}
