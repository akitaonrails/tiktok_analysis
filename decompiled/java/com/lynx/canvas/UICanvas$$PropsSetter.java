package com.lynx.canvas;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UICanvas$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        str.getClass();
        if (!str.equals("name")) {
            super.LIZ(lynxBaseUI, str, c1311730kEt);
        } else {
            lynxBaseUI.setName(c1311730kEt.LJII(str));
        }
    }
}
