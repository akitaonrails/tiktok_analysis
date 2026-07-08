package com.lynx.tasm.behavior.ui.view;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class UIComponent$$PropsSetter extends UIView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UIComponent uIComponent = (UIComponent) lynxBaseUI;
        str.getClass();
        if (!str.equals("z-index")) {
            if (!str.equals("item-key")) {
                super.LIZ(lynxBaseUI, str, c1311730kEt);
                return;
            } else {
                uIComponent.setItemKey(c1311730kEt.LJII(str));
                return;
            }
        }
        uIComponent.setZIndex(c1311730kEt.LJFF(str, 0));
    }
}
