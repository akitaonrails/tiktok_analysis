package kotlin.jvm.internal;

import X.C09AY;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1741890vQh;
import X.C19EG;
import X.C1ANM;
import X.C2188811AlT;
import X.C608170NtH;
import android.os.SystemClock;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.aigc.quality.trace.TraceErrorContext;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.AnchorInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighLightExtra;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightCellItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightVideoInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.viewmodel.HighlightsListViewModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS69S1300000_33 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS69S1300000_33 awS69S1300000_33, Object obj) {
        long jLongValue;
        String str;
        Long l;
        long jLongValue2;
        String str2;
        AnchorInfo anchorInfo;
        int iIntValue;
        String str3;
        String str4;
        String str5;
        Long l2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HighlightsListViewModel highlightsListViewModel = (HighlightsListViewModel) awS69S1300000_33.l1;
        long j = jCurrentTimeMillis - highlightsListViewModel.LLJIJIL;
        String str6 = "";
        if (zBooleanValue) {
            highlightsListViewModel.setState(AFwS240S0000000_9.get$arr$(955));
            HighlightsListViewModel highlightsListViewModel2 = (HighlightsListViewModel) awS69S1300000_33.l1;
            String str7 = highlightsListViewModel2.LLILLJJLI;
            String str8 = highlightsListViewModel2.LLILLL;
            boolean z = highlightsListViewModel2.LLJ;
            HighlightVideoInfo highlightVideoInfo = ((HighlightCellItem) awS69S1300000_33.l2).videoInfo;
            if (highlightVideoInfo != null && (l2 = highlightVideoInfo.length) != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            HighlightCellItem highlightCellItem = (HighlightCellItem) awS69S1300000_33.l2;
            HighlightVideoInfo highlightVideoInfo2 = highlightCellItem.videoInfo;
            if (highlightVideoInfo2 == null || (str2 = highlightVideoInfo2.fragmentId) == null) {
                str2 = "";
            }
            C608170NtH.LIZLLL(jLongValue2, j, str7, str8, str2, "finish_loading", highlightCellItem.daInfo, z);
            HighlightsListViewModel highlightsListViewModel3 = (HighlightsListViewModel) awS69S1300000_33.l1;
            C19EG c19eg = (C19EG) awS69S1300000_33.l3;
            String str9 = highlightsListViewModel3.LLILLJJLI;
            String str10 = awS69S1300000_33.s0;
            HighlightCellItem highlightCellItem2 = (HighlightCellItem) awS69S1300000_33.l2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HighlightVideoInfo highlightVideoInfo3 = highlightCellItem2.videoInfo;
            if (highlightVideoInfo3 != null && (str5 = highlightVideoInfo3.fragmentId) != null) {
                linkedHashMap.put("video_fragment_id", str5);
            }
            linkedHashMap.put("room_id", str9);
            Boolean bool = Boolean.TRUE;
            linkedHashMap.put("is_ecom", bool);
            HighLightExtra highLightExtra = highlightCellItem2.highLightExtra;
            if (highLightExtra != null && (str4 = highLightExtra.suggestVideoTitle) != null) {
                linkedHashMap.put("suggest_video_title", str4);
            }
            HighLightExtra highLightExtra2 = highlightCellItem2.highLightExtra;
            if (highLightExtra2 != null && (str3 = highLightExtra2.suggestVideoToast) != null) {
                linkedHashMap.put("suggest_video_toast", str3);
            }
            linkedHashMap.put("landing_to_record", bool);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("high_light_video_parameters_model", linkedHashMap);
            ArrayList arrayList = new ArrayList();
            HighLightExtra highLightExtra3 = highlightCellItem2.highLightExtra;
            if (highLightExtra3 != null && (anchorInfo = highLightExtra3.anchorInfo) != null) {
                Integer num = anchorInfo.type;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                String str11 = anchorInfo.keyword;
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = anchorInfo.url;
                if (str12 == null) {
                    str12 = "";
                }
                String str13 = anchorInfo.language;
                if (str13 == null) {
                    str13 = "";
                }
                String str14 = anchorInfo.content;
                if (str14 != null) {
                    str6 = str14;
                }
                arrayList.add(new CreateAnchorInfo(iIntValue, str11, str12, str13, str6, anchorInfo.iconUrl, Long.valueOf(SystemClock.elapsedRealtime()), anchorInfo.extra, "", "", anchorInfo.subtype, anchorInfo.canDelete, true, null, null, false, null));
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "//openVideoEdit");
            smartRouteBuildRoute.withParam("media_path", str10);
            smartRouteBuildRoute.withParam("shoot_way", "livesdk_tiktokec_shop_highlight");
            smartRouteBuildRoute.withParam("anchors", C1741890vQh.LJIIIIZZ(arrayList));
            smartRouteBuildRoute.withParam("creative_initial_model", C1741890vQh.LJIIIIZZ(linkedHashMap2));
            smartRouteBuildRoute.open();
            HighlightsListViewModel.yQ2((HighlightsListViewModel) awS69S1300000_33.l1, "download_success", Long.valueOf(j), null, 12);
        } else {
            highlightsListViewModel.setState(AFwS240S0000000_9.get$arr$(956));
            HighlightsListViewModel highlightsListViewModel4 = (HighlightsListViewModel) awS69S1300000_33.l1;
            String str15 = highlightsListViewModel4.LLILLJJLI;
            String str16 = highlightsListViewModel4.LLILLL;
            boolean z2 = highlightsListViewModel4.LLJ;
            HighlightVideoInfo highlightVideoInfo4 = ((HighlightCellItem) awS69S1300000_33.l2).videoInfo;
            if (highlightVideoInfo4 != null && (l = highlightVideoInfo4.length) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            HighlightCellItem highlightCellItem3 = (HighlightCellItem) awS69S1300000_33.l2;
            HighlightVideoInfo highlightVideoInfo5 = highlightCellItem3.videoInfo;
            if (highlightVideoInfo5 != null && (str = highlightVideoInfo5.fragmentId) != null) {
                str6 = str;
            }
            C608170NtH.LIZLLL(jLongValue, j, str15, str16, str6, "others", highlightCellItem3.daInfo, z2);
            HighlightsListViewModel.yQ2((HighlightsListViewModel) awS69S1300000_33.l1, "download_fail", Long.valueOf(j), "granted is false.", 4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS69S1300000_33 awS69S1300000_33, Object obj) {
        int i;
        TraceErrorContext traceErrorContext = (TraceErrorContext) obj;
        C1481290oeN c1481290oeN = (C1481290oeN) awS69S1300000_33.l1;
        if (c1481290oeN != null) {
            i = c1481290oeN.LJ;
        } else {
            i = 0;
        }
        traceErrorContext.errorCode = Integer.valueOf(i);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playback error: sourceId=");
        sbLIZ.append(awS69S1300000_33.s0);
        sbLIZ.append(", url=");
        sbLIZ.append(((C1ANM) awS69S1300000_33.l2).LLLLILI().LIZ.LIZJ);
        sbLIZ.append(", error=");
        sbLIZ.append((C1481290oeN) awS69S1300000_33.l1);
        sbLIZ.append(", event=");
        sbLIZ.append((C1480430ocz) awS69S1300000_33.l3);
        traceErrorContext.errorMessage = C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S1300000_33(C1481290oeN c1481290oeN, String str, C1ANM c1anm, C1480430ocz c1480430ocz, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1481290oeN;
        this.s0 = str;
        this.l2 = c1anm;
        this.l3 = c1480430ocz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS69S1300000_33(HighlightsListViewModel highlightsListViewModel, HighlightCellItem highlightCellItem, C19EG c19eg, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = highlightsListViewModel;
        this.l2 = highlightCellItem;
        this.l3 = c19eg;
        this.s0 = str;
    }
}
