package com.lynx.tasm.behavior.ui;

import X.C1311730kEt;

/* JADX INFO: loaded from: classes21.dex */
public class LynxFlattenUI$$PropsSetter extends LynxBaseUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        str.getClass();
        if (!str.equals("opacity")) {
            if (!str.equals("transform")) {
                super.LIZ(lynxBaseUI, str, c1311730kEt);
                return;
            } else {
                lynxBaseUI.setTransform(c1311730kEt.LIZ(str));
                return;
            }
        }
        lynxBaseUI.setAlpha(c1311730kEt.LJ(str, 1.0f));
    }
}
