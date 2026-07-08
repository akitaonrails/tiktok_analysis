package com.bytedance.ies.xelement.input;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.featurecount.LynxFeatureCounter;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class LynxInputViewLegacy extends LynxInputView {
    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        super.initialize();
        LynxFeatureCounter.LIZ(87, this.mContext.LLJLILLLLZIIL);
        this.mContext.LJIILLIIL(new LynxError(220101, "A deprecated <input> is created!", "Please use <x-input> instead.", "error"));
    }

    public LynxInputViewLegacy(s sVar, Object obj) {
        super(sVar, obj);
    }
}
