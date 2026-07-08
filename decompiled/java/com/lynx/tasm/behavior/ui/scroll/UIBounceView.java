package com.lynx.tasm.behavior.ui.scroll;

import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.view.View;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class UIBounceView extends UISimpleView<AndroidView> {
    public int LL;

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new AndroidView(context);
    }

    @InterfaceC1312540kGC(customType = "right", name = "direction")
    public void setDirection(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            String strAsString = interfaceC1298070jsr.asString();
            if (strAsString.equals("right")) {
                this.LL = 0;
                return;
            }
            if (strAsString.equals("left")) {
                this.LL = 1;
            } else if (strAsString.equals("top")) {
                this.LL = 2;
            } else {
                if (!strAsString.equals("bottom")) {
                    return;
                }
                this.LL = 3;
            }
        }
    }

    public UIBounceView(s sVar, Object obj) {
        super(sVar, obj);
    }
}
