package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.CarouselElement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpAssemPowerCell;

/* JADX INFO: loaded from: classes7.dex */
public final class PdpCarouselMirrorCell extends PdpAssemPowerCell<PdpCarouselMirrorItemAssem, CarouselElement> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PdpCarouselMirrorItemAssem();
    }
}
