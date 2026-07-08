package com.bytedance.ies.xelement.text.text;

import X.ActionModeCallbackC1315180kKS;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.text.UIText;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxTextUI extends UIText {
    public LynxTextUI(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.text.UIText
    /* JADX INFO: renamed from: LJJIIZI */
    public final ActionModeCallbackC1315180kKS createView(Context context) {
        return new ActionModeCallbackC1315180kKS(context);
    }

    @Override // com.lynx.tasm.behavior.ui.text.UIText, com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new ActionModeCallbackC1315180kKS(context);
    }

    public LynxTextUI(s sVar, Object obj) {
        super(sVar, obj);
    }
}
