package com.ss.android.ugc.aweme.poi.collect.detailfeed;

import X.AbstractC738140SxQ;
import X.C0RUV;
import X.C1184350gvR;
import X.C1184530gvj;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1185490gxH;
import X.C1186700gzE;
import X.C1188440h22;
import X.C1188450h23;
import X.C1188460h24;
import X.C1188530h2B;
import X.C1189060h32;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19719512Dh;
import X.C2188811AlT;
import X.C614900O9w;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C848230XPh;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PoiFeedBottomBaseFavoriteAssem extends PoiCollectStatusBaseAssem {
    public C1184530gvj LLJJJJLIIL;
    public C1186700gzE LLJJL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.e17;
    }

    public final C1188530h2B Qp() {
        C1188530h2B c1188530h2B;
        C1185490gxH c1185490gxH;
        C1188440h22 c1188440h22;
        String poiId;
        String poiInfoSource;
        String poiCityCode;
        String poiRegionCode;
        String strLIZLLL;
        String strLIZJ;
        String collectInfo;
        C1184530gvj c1184530gvj = this.LLJJJJLIIL;
        if (c1184530gvj == null || (c1188530h2B = c1184530gvj.LLIZ) == null) {
            return null;
        }
        C1186700gzE c1186700gzE = this.LLJJL;
        if (c1186700gzE != null) {
            c1185490gxH = c1186700gzE.LL;
            c1188440h22 = c1186700gzE.LLILLJJLI;
        } else {
            c1185490gxH = null;
            c1188440h22 = null;
        }
        if (c1188440h22 != null) {
            poiId = c1188440h22.getPoiId();
            poiInfoSource = c1188440h22.getPoiInfoSource();
            poiCityCode = c1188440h22.getPoiCityCode();
            poiRegionCode = c1188440h22.getPoiRegionCode();
        } else {
            poiId = null;
            poiInfoSource = null;
            poiCityCode = null;
            poiRegionCode = null;
        }
        if (c1188440h22 != null) {
            C1188460h24.LIZ.getClass();
            strLIZLLL = C1188460h24.LIZLLL(c1188440h22);
            C1188460h24.LIZ.getClass();
            strLIZJ = C1188460h24.LIZJ(c1188440h22);
            collectInfo = c1188440h22.getCollectInfo();
        } else {
            strLIZLLL = null;
            strLIZJ = null;
            collectInfo = null;
        }
        return c1188530h2B.copy(c1188530h2B.LL, c1188530h2B.LLILLJJLI, c1188530h2B.LLILLL, c1188530h2B.LLILZ, c1188530h2B.LLILZIL, c1188530h2B.LLILZLL, c1188530h2B.LLIZ, c1188530h2B.LLIZLLLIL, c1188530h2B.LLJ, c1188530h2B.LLJI, c1188530h2B.LLJIJIL, c1188530h2B.LLJILJIL, c1188530h2B.LLJILJILJ, c1188530h2B.LLJILLL, c1188530h2B.LLJJ, c1188530h2B.LLJJI, c1188530h2B.LLJJIII, c1188530h2B.LLJJIJI, poiId, poiInfoSource, poiCityCode, poiRegionCode, c1188530h2B.LLJJJJ, strLIZLLL, strLIZJ, collectInfo, c1188530h2B.LLJJLIIIJLLLLLLLZ, c1188530h2B.LLJL, c1188530h2B.LLJLIL, c1185490gxH != null ? c1185490gxH.getAuthorId() : null, c1188530h2B.LLJLL, c1188530h2B.LLJLLIL);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final C1184350gvR sp() {
        Boolean boolValueOf;
        String str;
        String str2;
        String str3;
        C1184530gvj c1184530gvj = this.LLJJJJLIIL;
        String str4 = null;
        if (c1184530gvj == null || (str3 = c1184530gvj.LL) == null || (boolValueOf = C1188450h23.LIZIZ(str3)) == null) {
            C1184530gvj c1184530gvj2 = this.LLJJJJLIIL;
            boolValueOf = c1184530gvj2 != null ? Boolean.valueOf(c1184530gvj2.LLILLJJLI) : null;
        }
        boolean zLJFF = Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
        C1184530gvj c1184530gvj3 = this.LLJJJJLIIL;
        if (c1184530gvj3 != null) {
            str = c1184530gvj3.LL;
            str2 = c1184530gvj3.LLILZ;
            str4 = c1184530gvj3.LLILZIL;
        } else {
            str = null;
            str2 = null;
        }
        return new C1184350gvR(str, str2, str4, zLJFF);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final HashMap<String, String> Yg1() {
        HashMap<String, String> mapYg1;
        PoiFeedBottomAbility poiFeedBottomAbility = (PoiFeedBottomAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), PoiFeedBottomAbility.class, null);
        if (poiFeedBottomAbility == null || (mapYg1 = poiFeedBottomAbility.Yg1()) == null) {
            return null;
        }
        return mapYg1;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        Map<String, String> mapForceToMap;
        String enterMethod;
        C1188530h2B c1188530h2BQp = Qp();
        if (c1188530h2BQp != null && (mapForceToMap = c1188530h2BQp.forceToMap()) != null) {
            if (C19719512Dh.LJII(mapForceToMap)) {
                C1185410gx9 c1185410gx9 = Ap().LLIZLLLIL;
                if (c1185410gx9 != null) {
                    enterMethod = c1185410gx9.getEnterMethod();
                } else {
                    enterMethod = null;
                }
                C1189060h32.LJIJI(mapForceToMap, "poi_detail_enter_method", enterMethod);
                mapForceToMap.put("current_page", "post_inner_page");
            }
            if (z) {
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
                c1185430gxB.getClass();
                C1185430gxB.LJIJJ(mapForceToMap, pageFinderVia, null, null);
                return;
            }
            C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
            PageFinder pageFinderVia2 = PageFinder.via(C724240Sb0.LJI(this));
            c1185430gxB2.getClass();
            C1185430gxB.LJII(mapForceToMap, pageFinderVia2, null, null);
        }
    }

    public final void Tp(Boolean bool) {
        C1188530h2B c1188530h2BQp = Qp();
        if (c1188530h2BQp == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1188530h2BQp.forceToMap());
        String str = "1";
        if (C848230XPh.LL.LJI()) {
            linkedHashMap.put("is_login", "1");
        } else {
            linkedHashMap.put("is_login", CardStruct.IStatusCode.DEFAULT);
        }
        if (bool != null) {
            if (!bool.booleanValue()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_favourite", str);
        }
        linkedHashMap.put("current_page", "post_inner_page");
        linkedHashMap.put("enter_method", "click_button_video");
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1185430gxB.getClass();
        C1185430gxB.LJJJLIIL(pageFinderVia, linkedHashMap);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void didUpdateConfig(C0RUV<? extends AbstractC738140SxQ> c0ruv) {
        C1188440h22 c1188440h22;
        String poiId;
        Boolean boolValueOf;
        super.didUpdateConfig(c0ruv);
        this.LLJJJJLIIL = (C1184530gvj) new C1559260qg8(new C723580SZw(this, C1184530gvj.class, "PoiCollectHierarchyData"), checkSupervisorPrepared()).getValue();
        C1186700gzE c1186700gzE = (C1186700gzE) new C1559260qg8(new C723580SZw(this, C1186700gzE.class, "PoiAnchorHierarchyData"), checkSupervisorPrepared()).getValue();
        this.LLJJL = c1186700gzE;
        Boolean boolValueOf2 = null;
        if (c1186700gzE != null) {
            c1188440h22 = c1186700gzE.LLILLJJLI;
        } else {
            c1188440h22 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("didUpdateConfig poi id:");
        if (c1188440h22 != null) {
            poiId = c1188440h22.getPoiId();
        } else {
            poiId = null;
        }
        sbLIZ.append(poiId);
        sbLIZ.append(", isCollected:");
        if (c1188440h22 != null) {
            boolValueOf = Boolean.valueOf(c1188440h22.isCollected());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1184530gvj c1184530gvj = this.LLJJJJLIIL;
        if (c1184530gvj != null) {
            boolValueOf2 = Boolean.valueOf(c1184530gvj.LLILLJJLI);
        }
        Tp(boolValueOf2);
        C1184530gvj c1184530gvj2 = this.LLJJJJLIIL;
        boolean z = false;
        if (c1184530gvj2 != null && c1184530gvj2.LLILLJJLI) {
            z = true;
        }
        Jp(z);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        String str;
        super.onCollectedStatusChange(c614900O9w);
        PoiFeedBottomAbility poiFeedBottomAbility = (PoiFeedBottomAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), PoiFeedBottomAbility.class, null);
        if (poiFeedBottomAbility != null) {
            C1184530gvj c1184530gvj = this.LLJJJJLIIL;
            if (c1184530gvj == null || (str = c1184530gvj.LL) == null) {
                str = "";
            }
            poiFeedBottomAbility.pI2(str, c614900O9w.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        C1188440h22 c1188440h22;
        String poiId;
        Boolean boolValueOf;
        this.LLJJJJLIIL = Ap();
        C1186700gzE c1186700gzE = (C1186700gzE) new C1559260qg8(new C723580SZw(this, C1186700gzE.class, "PoiAnchorHierarchyData"), checkSupervisorPrepared()).getValue();
        this.LLJJL = c1186700gzE;
        Boolean boolValueOf2 = null;
        if (c1186700gzE != null) {
            c1188440h22 = c1186700gzE.LLILLJJLI;
        } else {
            c1188440h22 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated poi id:");
        if (c1188440h22 != null) {
            poiId = c1188440h22.getPoiId();
        } else {
            poiId = null;
        }
        sbLIZ.append(poiId);
        sbLIZ.append(", isCollected:");
        if (c1188440h22 != null) {
            boolValueOf = Boolean.valueOf(c1188440h22.isCollected());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        super.onViewCreated(view);
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 51), LJJIJL());
        C1184530gvj c1184530gvj = this.LLJJJJLIIL;
        if (c1184530gvj != null) {
            boolValueOf2 = Boolean.valueOf(c1184530gvj.LLILLJJLI);
        }
        Tp(boolValueOf2);
    }
}
