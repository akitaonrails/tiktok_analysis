package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells;

import X.C1556720qc2;
import X.C1741890vQh;
import X.C1755990vnR;
import X.C1761650vwZ;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCarouselSparkCellViewModel extends PdpBodyListBaseCardViewModel<C1556720qc2, C1761650vwZ> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1556720qc2(null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyListBaseCardViewModel
    public final InterfaceC0148002o vQ2(InterfaceC0148002o interfaceC0148002o, C1761650vwZ c1761650vwZ) {
        C1761650vwZ c1761650vwZ2 = c1761650vwZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c1761650vwZ2.LLILLL;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("data", str);
        return new C1556720qc2(new C1755990vnR(C1741890vQh.LJIIIIZZ(linkedHashMap), c1761650vwZ2.LLILLJJLI));
    }
}
