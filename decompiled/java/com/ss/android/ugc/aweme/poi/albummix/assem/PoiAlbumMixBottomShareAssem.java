package com.ss.android.ugc.aweme.poi.albummix.assem;

import X.C1185360gx4;
import X.C1185370gx5;
import X.C1185430gxB;
import X.C13LP;
import X.C1558520qew;
import X.C1559260qg8;
import X.C197039127h;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.poi.model.PoiCurrentSessionInfo;
import com.ss.android.ugc.aweme.slash.data.AnchorComponentInfo;
import com.zhiliaoapp.musically.R;
import irm.AkS28S0300000_18;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAlbumMixBottomShareAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C1185370gx5.class, "PoiAlbumMixHierarchyData"), checkSupervisorPrepared());
    public C197039127h LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dyb;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        PoiCurrentSessionInfo poiCurrentSessionInfo;
        List<AnchorComponentInfo> list;
        C197039127h c197039127h;
        super.onViewCreated(view);
        this.LLJJIII = (C197039127h) view.findViewById(R.id.qwf);
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        C1185360gx4.LIZ.getClass();
        if (!C1185360gx4.LIZ()) {
            C786410Ut5.LJLLLLLL(8, LJJIJL());
            return;
        }
        C197039127h c197039127h2 = this.LLJJIII;
        if (c197039127h2 != null) {
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
        }
        C1185370gx5 c1185370gx5 = (C1185370gx5) this.LLJJI.getValue();
        if (c1185370gx5 != null && (poiCurrentSessionInfo = c1185370gx5.LLIZLLLIL) != null && (list = poiCurrentSessionInfo.anchorModuleList) != null && C13LP.LJJJLL(list) != null && (c197039127h = this.LLJJIII) != null) {
            c197039127h.LJJJLZIJ(null, null);
        }
        C197039127h c197039127h3 = this.LLJJIII;
        if (c197039127h3 != null) {
            C786410Ut5.I7(new AkS28S0300000_18(pageFinderVia, this, view, 3), c197039127h3);
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1185430gxB.LIZ.getClass();
        C1185430gxB.LJJJJZI(pageFinderVia, interfaceC665370Q7zLJIIL, "bottom_operate_btn");
    }
}
