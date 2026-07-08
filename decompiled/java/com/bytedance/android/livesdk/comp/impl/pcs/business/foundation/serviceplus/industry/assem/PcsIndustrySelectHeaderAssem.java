package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.assem;

import X.C687700QyG;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.PcsIndustrySelectFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.scope.PcsIndustrySelectScope;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PcsIndustrySelectHeaderAssem extends UISlotAssem implements InterfaceC1146704e9 {
    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fyn;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PcsIndustrySelectScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PcsIndustrySelectScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.cnb);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.06M2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C19EG activity;
                    PcsIndustrySelectFragment pcsIndustrySelectFragment;
                    C1784900wY4 c1784900wY4;
                    Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
                    if ((fragmentLJI instanceof PcsIndustrySelectFragment) && (pcsIndustrySelectFragment = (PcsIndustrySelectFragment) fragmentLJI) != null && (c1784900wY4 = pcsIndustrySelectFragment.LLJI) != null) {
                        c1784900wY4.LIZIZ(pcsIndustrySelectFragment.NR().getState(), "back");
                    }
                    Fragment fragmentLJI2 = C724240Sb0.LJI(this.LL);
                    if (fragmentLJI2 != null && (activity = fragmentLJI2.getActivity()) != null) {
                        activity.finish();
                    }
                }
            }, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.cqz);
        if (viewFindViewById2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0IJM
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Context context = view2.getContext();
                    if (context == null) {
                        return;
                    }
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, "aweme://roma_redirect/?spark_page=TT_CSP_Live_service_category_bot");
                }
            }, viewFindViewById2);
        }
    }
}
