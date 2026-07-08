package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells;

import X.C20441214yg;
import X.C2188811AlT;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;

/* JADX INFO: loaded from: classes28.dex */
public abstract class ServiceBioBaseAssemCell extends ReusedUISlotAssem<ServiceBioBaseAssemCell> {
    public abstract int getLayoutId();

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return getLayoutId();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPreload(boolean z) {
        String simpleName = getClass().getSimpleName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreload isPreload: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ(simpleName, C2188811AlT.LIZIZ(sbLIZ));
        super.onPreload(z);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        C20441214yg.LIZIZ(getClass().getSimpleName(), "onViewCreated");
        attachPreload();
    }
}
