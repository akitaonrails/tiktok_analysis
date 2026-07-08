package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import X.C1762010vx9;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpAssemPowerCell;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselCell extends PdpAssemPowerCell<PdpCarouselReusedAssem, C1762010vx9> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PdpCarouselReusedAssem();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        PdpCarouselReusedAssem pdpCarouselReusedAssem;
        super.onViewDetachedFromWindow();
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        if (!(reusedUIAssemNG1 instanceof PdpCarouselReusedAssem) || (pdpCarouselReusedAssem = (PdpCarouselReusedAssem) reusedUIAssemNG1) == null) {
            return;
        }
        pdpCarouselReusedAssem.Ap().LIZ();
    }
}
