package com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.assem;

import X.C1180060goW;
import X.C1184190gvB;
import X.C1559260qg8;
import X.C339190DRl;
import X.C723580SZw;
import X.C786410Ut5;
import X.InterfaceC1184290gvL;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiNavButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.navbar.dynamic.PoiDynamicNavBarModule;
import irm.AkS87S0100000_18;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class NavBarFoldButtonAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1184190gvB.class, "poi_dynamic_nav_bar_hierarchy_data"), checkSupervisorPrepared());
    public final Map<Integer, InterfaceC1184290gvL> LLJ = new LinkedHashMap();

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        PoiDynamicNavBarModule poiDynamicNavBarModule;
        PoiNavButtonGroup poiNavButtonGroup;
        List<PoiButton> list;
        super.xo();
        C1184190gvB c1184190gvB = (C1184190gvB) this.LLIZLLLIL.getValue();
        if (c1184190gvB == null || (poiDynamicNavBarModule = c1184190gvB.LL) == null || (poiNavButtonGroup = poiDynamicNavBarModule.getPoiNavButtonGroup()) == null || (list = poiNavButtonGroup.foldButtons) == null || list.isEmpty()) {
            C339190DRl.LIZIZ(LJJIJL());
        } else {
            C1180060goW.LIZ(LJJIJL(), new AwS562S0100000_18(this, 1075));
            C339190DRl.LIZLLL(LJJIJL());
        }
        this.LLJ.put(6, new InterfaceC1184290gvL() { // from class: X.0gvJ
            @Override // X.InterfaceC1184290gvL
            public final boolean LJIILIIL() {
                return ((C0C64.LJIILLIIL().LJIJ(31744, 0, "review_center_mvp", false) == 1 || C0C64.LJIILLIIL().LJIJ(31744, 0, "review_center_mvp", false) == 2) && C848230XPh.LL.LJI()) ? false : true;
            }
        });
        this.LLJ.put(12, new InterfaceC1184290gvL() { // from class: X.0gvK
            @Override // X.InterfaceC1184290gvL
            public final boolean LJIILIIL() {
                IPoiMapService iPoiMapService = (IPoiMapService) PluggableExtentionKt.pluggableSpi$default(IPoiMapService.class, false, false, false, 14, null);
                return !(iPoiMapService != null && iPoiMapService.LJFF());
            }
        });
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.I7(new AkS87S0100000_18(this, 33), LJJIJL());
    }
}
