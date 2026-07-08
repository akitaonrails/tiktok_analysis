package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider;

import X.C01GW;
import X.C2248361CzK;
import X.C418440Gaw;
import X.C687700QyG;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpDividerReusedAssem extends PdpBodyListCardReusedAssem<UsPdpDividerReusedAssem, UsPdpDividerModuleVO> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.arp;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListCardReusedAssem
    public final void tp(UsPdpDividerModuleVO usPdpDividerModuleVO) {
        UsPdpDividerModuleVO usPdpDividerModuleVO2 = usPdpDividerModuleVO;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(usPdpDividerModuleVO2.height)));
        if (getContentView().findViewById(R.id.fzz).getLayoutParams().height != iLIZIZ) {
            View viewFindViewById = getContentView().findViewById(R.id.fzz);
            ViewGroup.LayoutParams layoutParams = getContentView().findViewById(R.id.fzz).getLayoutParams();
            layoutParams.height = iLIZIZ;
            C786410Ut5.W5(viewFindViewById, layoutParams);
        }
        String str = usPdpDividerModuleVO2.color;
        if (str != null && (!a0.LJJJIL(str))) {
            C01GW c01gw = C2248361CzK.LIZ;
            Integer numLJ = C2248361CzK.LJ(LJJIJL().getContext(), str);
            if (numLJ != null) {
                getContentView().findViewById(R.id.fzz).setBackgroundColor(numLJ.intValue());
            }
        }
    }
}
