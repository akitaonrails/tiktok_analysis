package com.bytedance.ies.xelement;

import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxBounceView extends UISimpleView<AndroidView> {
    public String LL;

    public LynxBounceView(Context context) {
        super((s) context, null);
        this.LL = "right";
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    @InterfaceC1312540kGC(customType = "right", name = "direction")
    public final void setDirection(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            this.LL = interfaceC1298070jsr.asString();
        }
    }
}
