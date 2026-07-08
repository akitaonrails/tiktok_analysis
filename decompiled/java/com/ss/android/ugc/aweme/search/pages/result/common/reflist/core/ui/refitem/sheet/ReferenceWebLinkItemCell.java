package com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.refitem.sheet;

import X.C03H5;
import X.C1558420qem;
import X.C1558520qew;
import X.C434520H2c;
import X.C434640H2o;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.IReferenceListAbility;

/* JADX INFO: loaded from: classes7.dex */
public final class ReferenceWebLinkItemCell extends AssemPowerCell<ReusedUISlotAssem<? extends C03H5>, C434520H2c> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem<? extends C03H5> I5() {
        C434640H2o referenceRenderData;
        IReferenceListAbility iReferenceListAbility = (IReferenceListAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(this), IReferenceListAbility.class, null);
        return new ReferenceWebLinkItemAssem((iReferenceListAbility == null || (referenceRenderData = iReferenceListAbility.getReferenceRenderData()) == null) ? 0 : referenceRenderData.LIZLLL);
    }
}
