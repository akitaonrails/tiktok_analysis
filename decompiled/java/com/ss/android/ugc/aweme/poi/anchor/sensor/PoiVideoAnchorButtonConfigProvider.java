package com.ss.android.ugc.aweme.poi.anchor.sensor;

import X.AbstractC1387105bp;
import X.C1188440h22;
import X.C1188460h24;
import X.C1188950h2r;
import X.C1189060h32;
import X.C13LP;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C704830Rkn;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC702490Rh1;
import X.InterfaceC702540Rh6;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class PoiVideoAnchorButtonConfigProvider implements IStandardConfigProvider {
    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, Function2<Map<String, Object>, Function0<Unit>, Unit>> Ca() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<WeakReference<C704830Rkn>, InterfaceC702540Rh6> g3() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function1<Lifecycle, InterfaceC702490Rh1<? extends Object>> h1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final String o7() {
        return "bottom_button_poi_buy";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>>> I5() {
        return C2097908Jt.LIZJ(new Pair("ttls_video_anchor_poi_button_click", AFwS240S0000000_9.get$arr$(591)));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.next.standardized.condition.IStandardConfigProvider
    public final Function2<WeakReference<C704830Rkn>, String, Map<String, String>> ak() {
        return new AwS623S0100000_9(this, 138);
    }

    public static Map LIZ(Aweme aweme) {
        int size;
        int i;
        AnchorCommonStruct anchorCommonStruct;
        String logExtra;
        C1188460h24.LIZ.getClass();
        C1188440h22 c1188440h22LJ = C1188460h24.LJ(aweme, "video_custom", "homepage_hot");
        if (c1188440h22LJ == null) {
            return new LinkedHashMap();
        }
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            size = anchors.size();
        } else {
            size = 0;
        }
        if (size > 1) {
            i = 1;
        } else {
            i = 0;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_method", "video");
        pairArr[1] = new Pair("multi_anchor", String.valueOf(i));
        String poiId = c1188440h22LJ.getPoiId();
        String str = "";
        if (poiId == null) {
            poiId = "";
        }
        pairArr[2] = new Pair("poi_id", poiId);
        pairArr[3] = new Pair("btm", "c6053.d52627");
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String collectInfo = c1188440h22LJ.getCollectInfo();
        if (collectInfo == null) {
            collectInfo = "";
        }
        C1189060h32.LIZ(collectInfo, mapLJIIJ);
        C1188950h2r c1188950h2r = C1188950h2r.LIZ;
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(anchors2)) != null && (logExtra = anchorCommonStruct.getLogExtra()) != null) {
            str = logExtra;
        }
        c1188950h2r.getClass();
        C1189060h32.LJJ("main_anchor_type", C1188950h2r.LJII(str, "anchor_type"), mapLJIIJ);
        return mapLJIIJ;
    }
}
