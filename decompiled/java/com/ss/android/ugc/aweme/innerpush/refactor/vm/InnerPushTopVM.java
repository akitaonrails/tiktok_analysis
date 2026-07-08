package com.ss.android.ugc.aweme.innerpush.refactor.vm;

import X.C1567300qt6;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;

/* JADX INFO: loaded from: classes32.dex */
public final class InnerPushTopVM extends BaseInnerPushVM<C1567300qt6> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        InnerPushUITemplate innerPushUITemplateVQ2 = vQ2();
        if (innerPushUITemplateVQ2 == null) {
            return new C1567300qt6(0);
        }
        int i = innerPushUITemplateVQ2.topType;
        String str = innerPushUITemplateVQ2.topImageUrl;
        return new C1567300qt6(i, innerPushUITemplateVQ2.topImageRes, str, innerPushUITemplateVQ2.topSchemaUrl, innerPushUITemplateVQ2.topImageWidth, innerPushUITemplateVQ2.topImageHeight, innerPushUITemplateVQ2.topImageRadius);
    }
}
