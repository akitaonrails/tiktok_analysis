package com.ss.android.ugc.aweme.poi.recommendfeature.list.component.bottombar;

import X.C1183740guS;
import X.C1183770guV;
import X.C1185430gxB;
import X.C1365870leD;
import X.C14EU;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1599690rjL;
import X.C197039127h;
import X.C339190DRl;
import X.C622680Oba;
import X.C723590SZx;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import Y.ACListenerS153S0100000_18;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureBottomBarShareAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1183740guS.class, "PoiRecommendFeatureBottomBarHierarchyData"), checkSupervisorPrepared());
    public C197039127h LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e6o;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onShareCompleteEvent(C1365870leD c1365870leD) {
        if (Intrinsics.LJFF(c1365870leD.LIZLLL, "point_of_interest") && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIL(getContext(), LJJIJL(), c1365870leD);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (C197039127h) view.findViewById(R.id.r9q);
        if (!C1183770guV.LIZ()) {
            C339190DRl.LIZIZ(LJJIJL());
            return;
        }
        C622680Oba.LIZJ(this);
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1185430gxB.getClass();
        C1185430gxB.LJJJJZI(pageFinderVia, interfaceC665370Q7zLJIIL, "bottom_operate_btn");
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 70));
        }
    }
}
