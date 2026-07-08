package com.ss.android.ugc.aweme.innerpush.refactor.vm;

import X.C1556670qbx;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;

/* JADX INFO: loaded from: classes32.dex */
public final class InnerPushBottomVM extends BaseInnerPushVM<C1556670qbx> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        InnerPushUITemplate innerPushUITemplateVQ2 = vQ2();
        return innerPushUITemplateVQ2 != null ? new C1556670qbx(innerPushUITemplateVQ2.bottomType, innerPushUITemplateVQ2.bottomBtnText, innerPushUITemplateVQ2.bottomSchemaUrl) : new C1556670qbx(0);
    }
}
