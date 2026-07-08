package com.lynx.canvas;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UISurfaceCanvas$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UISurfaceCanvas uISurfaceCanvas = (UISurfaceCanvas) lynxBaseUI;
        str.getClass();
        if (!str.equals("android-surface-z-order")) {
            if (!str.equals("name")) {
                super.LIZ(lynxBaseUI, str, c1311730kEt);
                return;
            } else {
                uISurfaceCanvas.setName(c1311730kEt.LJII(str));
                return;
            }
        }
        uISurfaceCanvas.setAndroidSurfaceZOrder(c1311730kEt.LJII(str));
    }
}
