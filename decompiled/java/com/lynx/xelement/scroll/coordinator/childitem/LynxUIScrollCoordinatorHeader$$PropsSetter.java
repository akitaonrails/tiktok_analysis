package com.lynx.xelement.scroll.coordinator.childitem;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinatorHeader$$PropsSetter extends UIGroup$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxUIScrollCoordinatorHeader lynxUIScrollCoordinatorHeader = (LynxUIScrollCoordinatorHeader) lynxBaseUI;
        str.getClass();
        if (!str.equals("android-consume-gesture")) {
            super.LIZ(lynxBaseUI, str, c1311730kEt);
        } else {
            lynxUIScrollCoordinatorHeader.setHandleGesture(c1311730kEt.LIZIZ(str, false));
        }
    }
}
