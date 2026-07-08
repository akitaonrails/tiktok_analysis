package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar;

import X.C01GW;
import X.C1005220cGW;
import X.C1173300gdc;
import X.C1174730gfv;
import X.C1174850gg7;
import X.C1183250gtf;
import X.C1183740guS;
import X.C1184350gvR;
import X.C1184490gvf;
import X.C1185410gx9;
import X.C1185430gxB;
import X.C1188450h23;
import X.C1188530h2B;
import X.C1206904nr;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C197039127h;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureBottomBarFavAssem extends PoiCollectStatusBaseAssem {
    public final C1559260qg8 LLJJJJLIIL = new C1559260qg8(new C723590SZx(this, C1183740guS.class, "PoiRecommendFeatureBottomBarHierarchyData"), checkSupervisorPrepared());
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1726));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1727));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1728));

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e6m;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View zp() {
        return (View) this.LLJJL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final C1184350gvR sp() {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        Boolean boolIsCollected;
        C1183250gtf c1183250gtf;
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        String str = (c1173300gdcLJ == null || (c1183250gtf = (C1183250gtf) c1173300gdcLJ.LIZ) == null) ? null : c1183250gtf.LIZIZ;
        C1184490gvf c1184490gvf = ((C1183740guS) this.LLJJJJLIIL.getValue()).LLILLJJLI;
        boolean zBooleanValue = ((str == null || (boolIsCollected = C1188450h23.LIZIZ(str)) == null) && ((poiDetailResponse = c1184490gvf.poiDetailResponse) == null || (boolIsCollected = poiDetailResponse.isCollected()) == null)) ? false : boolIsCollected.booleanValue();
        PoiListApi.PoiDetailResponse poiDetailResponse2 = c1184490gvf.poiDetailResponse;
        String name = poiDetailResponse2 != null ? poiDetailResponse2.getName() : null;
        PoiListApi.PoiDetailResponse poiDetailResponse3 = c1184490gvf.poiDetailResponse;
        return new C1184350gvR(str, name, poiDetailResponse3 != null ? poiDetailResponse3.getAddress() : null, zBooleanValue);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Ep(boolean z) {
        Map<String, String> linkedHashMap;
        Map<String, String> linkedHashMap2;
        C1188530h2B c1188530h2B = Ap().LLIZ;
        if (z) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            if (c1188530h2B == null || (linkedHashMap2 = c1188530h2B.forceToMap()) == null) {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            c1185430gxB.getClass();
            C1185430gxB.LJIJJ(linkedHashMap2, pageFinderVia, null, interfaceC665370Q7zLJIIL);
            return;
        }
        C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
        if (c1188530h2B == null || (linkedHashMap = c1188530h2B.forceToMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        PageFinder pageFinderVia2 = PageFinder.via(C724240Sb0.LJI(this));
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
        c1185430gxB2.getClass();
        C1185430gxB.LJII(linkedHashMap, pageFinderVia2, null, interfaceC665370Q7zLJIIL2);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void Jp(boolean z) {
        C197039127h c197039127h;
        int i;
        int i2;
        View viewZp = zp();
        if (viewZp instanceof C197039127h) {
            c197039127h = (C197039127h) viewZp;
        } else {
            c197039127h = null;
        }
        boolean zLIZ = C1206904nr.LIZ();
        if (z) {
            if (c197039127h != null) {
                c197039127h.setButtonVariant(1);
                Context context = LJJIJL().getContext();
                if (zLIZ) {
                    i2 = 2131844689;
                } else {
                    i2 = 2131844691;
                }
                c197039127h.setText(context.getString(i2));
                c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark_fill));
                return;
            }
            return;
        }
        if (c197039127h == null) {
            return;
        }
        c197039127h.setButtonVariant(0);
        Context context2 = LJJIJL().getContext();
        if (zLIZ) {
            i = 2131844688;
        } else {
            i = 2131844690;
        }
        c197039127h.setText(context2.getString(i));
        c197039127h.setButtonStartIcon(Integer.valueOf(R.raw.icon_bookmark));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String initialEnterFrom;
        String initialEnterMethod;
        String enterFrom;
        String enterMethod;
        String collectInfo;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        C197039127h c197039127h;
        C1183250gtf c1183250gtf;
        super.onViewCreated(view);
        C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(this);
        if (c1173300gdcLJ != null && (c1183250gtf = (C1183250gtf) c1173300gdcLJ.LIZ) != null) {
            str = c1183250gtf.LIZIZ;
        } else {
            str = null;
        }
        C1184490gvf c1184490gvf = ((C1183740guS) this.LLJJJJLIIL.getValue()).LLILLJJLI;
        C1174730gfv c1174730gfv = C1174730gfv.LIZ;
        C1185410gx9 c1185410gx9 = c1184490gvf.poiDetailParams;
        if (c1185410gx9 != null) {
            initialEnterFrom = c1185410gx9.getInitialEnterFrom();
        } else {
            initialEnterFrom = null;
        }
        C1185410gx9 c1185410gx92 = c1184490gvf.poiDetailParams;
        if (c1185410gx92 != null) {
            initialEnterMethod = c1185410gx92.getInitialEnterMethod();
        } else {
            initialEnterMethod = null;
        }
        C1185410gx9 c1185410gx93 = c1184490gvf.poiDetailParams;
        if (c1185410gx93 != null) {
            enterFrom = c1185410gx93.getEnterFrom();
        } else {
            enterFrom = null;
        }
        C1185410gx9 c1185410gx94 = c1184490gvf.poiDetailParams;
        if (c1185410gx94 != null) {
            enterMethod = c1185410gx94.getEnterMethod();
        } else {
            enterMethod = null;
        }
        PoiListApi.PoiDetailResponse poiDetailResponse = c1184490gvf.poiDetailResponse;
        if (poiDetailResponse != null) {
            collectInfo = poiDetailResponse.getCollectInfo();
        } else {
            collectInfo = null;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
        } else {
            interfaceC665370Q7zLJFF = null;
        }
        C1174730gfv.LJIILIIL(c1174730gfv, "poi_recommend_feature", "bottom_operate_btn", str, null, null, initialEnterFrom, initialEnterMethod, enterFrom, enterMethod, collectInfo, null, null, null, interfaceC665370Q7zLJFF, PageFinder.via(LJJIJL()), 7192);
        View viewZp = zp();
        if ((viewZp instanceof C197039127h) && (c197039127h = (C197039127h) viewZp) != null) {
            C1005220cGW.LIZ(c197039127h);
        }
    }
}
