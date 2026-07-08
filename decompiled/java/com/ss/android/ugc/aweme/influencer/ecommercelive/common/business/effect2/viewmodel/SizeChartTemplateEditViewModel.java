package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel;

import X.C1731550vA1;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SizeChartTemplateItem;

/* JADX INFO: loaded from: classes27.dex */
public final class SizeChartTemplateEditViewModel extends AssemViewModel<C1731550vA1> {
    public SizeChartTemplateItem LL = new SizeChartTemplateItem(null, null, null, null, null, null, null, false, false, false, false, null, null, null, 262143);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1731550vA1(0);
    }

    public static boolean vQ2(String str, String str2) {
        if (str.length() > 0 || str2.length() > 0) {
            return true;
        }
        return false;
    }
}
