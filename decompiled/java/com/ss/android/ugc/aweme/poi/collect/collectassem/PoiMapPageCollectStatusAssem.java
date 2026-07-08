package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C1179950goL;
import X.C1185430gxB;
import X.C1188530h2B;
import X.C1189060h32;
import X.C1206904nr;
import X.C1559260qg8;
import X.C19719512Dh;
import X.C723590SZx;
import X.C724240Sb0;
import X.C848230XPh;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.map.LocationDetailMobParam;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiMapPageCollectStatusAssem extends PoiCollectStatusRedBtnAssem {
    public final C1559260qg8 LLJLIL = new C1559260qg8(new C723590SZx(this, C1179950goL.class, "LocationDetailInfoHierarchyData"), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusRedBtnAssem, com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        String str;
        String str2;
        C1188530h2B c1188530h2B = Ap().LLIZ;
        if (c1188530h2B == null) {
            return;
        }
        C1188530h2B c1188530h2BCopy = c1188530h2B.copy("poi_map", "map_mode_card", c1188530h2B.getEnterFrom(), c1188530h2B.LLILZ, c1188530h2B.LLILZIL, c1188530h2B.LLILZLL, c1188530h2B.LLIZ, c1188530h2B.LLIZLLLIL, c1188530h2B.LLJ, c1188530h2B.LLJI, c1188530h2B.LLJIJIL, c1188530h2B.LLJILJIL, c1188530h2B.LLJILJILJ, c1188530h2B.LLJILLL, c1188530h2B.LLJJ, c1188530h2B.LLJJI, c1188530h2B.LLJJIII, c1188530h2B.LLJJIJI, c1188530h2B.LLJJIJIIJIL, c1188530h2B.LLJJIJIL, c1188530h2B.LLJJJ, c1188530h2B.LLJJJIL, c1188530h2B.LLJJJJ, c1188530h2B.LLJJJJJIL, c1188530h2B.LLJJJJLIIL, c1188530h2B.LLJJL, c1188530h2B.LLJJLIIIJLLLLLLLZ, c1188530h2B.LLJL, c1188530h2B.LLJLIL, c1188530h2B.LLJLILLLLZIIL, c1188530h2B.LLJLL, c1188530h2B.LLJLLIL);
        if (z) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            Map<String, String> mapForceToMap = c1188530h2BCopy.forceToMap();
            if (C19719512Dh.LJII(mapForceToMap) && mapForceToMap != null) {
                LocationDetailMobParam locationDetailMobParam = ((C1179950goL) this.LLJLIL.getValue()).LLILLJJLI;
                if (locationDetailMobParam != null) {
                    str2 = locationDetailMobParam.entranceEnterMethod;
                } else {
                    str2 = null;
                }
                C1189060h32.LJIJI(mapForceToMap, "poi_detail_enter_method", str2);
            }
            PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
            c1185430gxB.getClass();
            C1185430gxB.LJIJJ(mapForceToMap, pageFinderVia, null, null);
            return;
        }
        C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
        Map<String, String> mapForceToMap2 = c1188530h2BCopy.forceToMap();
        if (C19719512Dh.LJII(mapForceToMap2) && mapForceToMap2 != null) {
            LocationDetailMobParam locationDetailMobParam2 = ((C1179950goL) this.LLJLIL.getValue()).LLILLJJLI;
            if (locationDetailMobParam2 != null) {
                str = locationDetailMobParam2.entranceEnterMethod;
            } else {
                str = null;
            }
            C1189060h32.LJIJI(mapForceToMap2, "poi_detail_enter_method", str);
        }
        PageFinder pageFinderVia2 = PageFinder.via(C724240Sb0.LJI(this));
        c1185430gxB2.getClass();
        C1185430gxB.LJII(mapForceToMap2, pageFinderVia2, null, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusRedBtnAssem
    public final int Qp(boolean z) {
        boolean zLIZ = C1206904nr.LIZ();
        if (z) {
            if (zLIZ) {
                return 2131844689;
            }
            if (Ap().LLILZLL) {
                return 2131821909;
            }
            return 2131844791;
        }
        if (zLIZ) {
            return 2131844688;
        }
        if (Ap().LLILZLL) {
            return 2131821908;
        }
        return 2131844790;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusRedBtnAssem
    public final void Tp(PageFinder pageFinder) {
        C1188530h2B c1188530h2B = Ap().LLIZ;
        if (c1188530h2B == null) {
            return;
        }
        C1188530h2B c1188530h2BCopy = c1188530h2B.copy("poi_map", "map_mode_card", c1188530h2B.getEnterFrom(), c1188530h2B.LLILZ, c1188530h2B.LLILZIL, c1188530h2B.LLILZLL, c1188530h2B.LLIZ, c1188530h2B.LLIZLLLIL, c1188530h2B.LLJ, c1188530h2B.LLJI, c1188530h2B.LLJIJIL, c1188530h2B.LLJILJIL, c1188530h2B.LLJILJILJ, c1188530h2B.LLJILLL, c1188530h2B.LLJJ, c1188530h2B.LLJJI, c1188530h2B.LLJJIII, c1188530h2B.LLJJIJI, c1188530h2B.LLJJIJIIJIL, c1188530h2B.LLJJIJIL, c1188530h2B.LLJJJ, c1188530h2B.LLJJJIL, c1188530h2B.LLJJJJ, c1188530h2B.LLJJJJJIL, c1188530h2B.LLJJJJLIIL, c1188530h2B.LLJJL, c1188530h2B.LLJJLIIIJLLLLLLLZ, c1188530h2B.LLJL, c1188530h2B.LLJLIL, c1188530h2B.LLJLILLLLZIIL, c1188530h2B.LLJLL, c1188530h2B.LLJLLIL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1188530h2BCopy.forceToMap());
        String str = "1";
        if (C848230XPh.LL.LJI()) {
            linkedHashMap.put("is_login", "1");
            Boolean bool = (Boolean) withState(Bp(), AFwS256S0000000_18.get$arr$(294));
            if (bool != null) {
                if (!bool.booleanValue()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_favourite", str);
            }
        } else {
            linkedHashMap.put("is_login", CardStruct.IStatusCode.DEFAULT);
        }
        C1185430gxB.LIZ.getClass();
        C1185430gxB.LJJJLIIL(pageFinder, linkedHashMap);
    }
}
