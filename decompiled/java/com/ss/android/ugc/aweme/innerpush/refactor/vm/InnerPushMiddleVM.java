package com.ss.android.ugc.aweme.innerpush.refactor.vm;

import X.C20666515tv;
import X.C20666615tw;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;

/* JADX INFO: loaded from: classes32.dex */
public final class InnerPushMiddleVM extends BaseInnerPushVM<C20666615tw> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        InnerPushUITemplate innerPushUITemplateVQ2 = vQ2();
        return innerPushUITemplateVQ2 != null ? C20666515tv.LIZIZ(innerPushUITemplateVQ2, false) : new C20666615tw(0);
    }
}
