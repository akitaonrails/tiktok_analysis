package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.fullycustomized.edititem;

import X.C01DP;
import X.C1145904e1;
import X.C1559260qg8;
import X.C723590SZx;
import X.C723850SaN;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomizedBoardEditPageAssem extends UISlotAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.gxp;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C723850SaN.LIZLLL(this, new C1145904e1(this));
    }
}
