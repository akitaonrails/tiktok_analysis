package com.bytedance.ies.xelement;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxImpressionView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
        str.getClass();
        if (!str.equals("impression-percent")) {
            super.LIZ(lynxBaseUI, str, c1311730kEt);
        } else {
            lynxImpressionView.impressionPercent(c1311730kEt.LJFF(str, 0));
        }
    }
}
