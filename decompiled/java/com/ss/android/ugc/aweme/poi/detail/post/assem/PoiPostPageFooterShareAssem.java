package com.ss.android.ugc.aweme.poi.detail.post.assem;

import X.C061S;
import X.C1183770guV;
import X.C1185430gxB;
import X.C1558520qew;
import X.C1559260qg8;
import X.C197039127h;
import X.C339190DRl;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostPageFooterShareAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C061S.class, "PoiPostPageHierarchyData"), checkSupervisorPrepared());
    public C197039127h LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e67;
    }

    public final C061S hp() {
        return (C061S) this.LLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (C197039127h) view.findViewById(R.id.r6y);
        if (!C1183770guV.LIZ()) {
            C339190DRl.LIZIZ(LJJIJL());
            return;
        }
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1185430gxB.getClass();
        C1185430gxB.LJJJJZI(pageFinderVia, interfaceC665370Q7zLJIIL, "bottom_operate_btn");
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 60));
        }
    }
}
