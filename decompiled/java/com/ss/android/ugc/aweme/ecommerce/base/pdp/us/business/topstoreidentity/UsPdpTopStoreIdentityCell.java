package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity;

import X.EnumC1761630vwX;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpAssemPowerCell;

/* JADX INFO: loaded from: classes27.dex */
public final class UsPdpTopStoreIdentityCell extends PdpAssemPowerCell<UsPdpTopStoreIdentityReusedAssem, UsPdpTopStoreIdentityModuleVO> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new UsPdpTopStoreIdentityReusedAssem();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        if (reusedUIAssemNG1 instanceof UsPdpTopStoreIdentityReusedAssem) {
            UsPdpTopStoreIdentityReusedAssem usPdpTopStoreIdentityReusedAssem = (UsPdpTopStoreIdentityReusedAssem) reusedUIAssemNG1;
            if (usPdpTopStoreIdentityReusedAssem.LLJLLIL != EnumC1761630vwX.LL && usPdpTopStoreIdentityReusedAssem.LLJLLL) {
                usPdpTopStoreIdentityReusedAssem.LLJLLIL = EnumC1761630vwX.LLILLL;
            }
            usPdpTopStoreIdentityReusedAssem.yp();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        ReusedUIAssem<?> reusedUIAssemNG1 = NG1();
        if (reusedUIAssemNG1 instanceof UsPdpTopStoreIdentityReusedAssem) {
            UsPdpTopStoreIdentityReusedAssem usPdpTopStoreIdentityReusedAssem = (UsPdpTopStoreIdentityReusedAssem) reusedUIAssemNG1;
            if (usPdpTopStoreIdentityReusedAssem.LLJLLIL == EnumC1761630vwX.LLILLL) {
                usPdpTopStoreIdentityReusedAssem.LLJLLIL = EnumC1761630vwX.LLILZ;
            }
            usPdpTopStoreIdentityReusedAssem.yp();
        }
    }
}
