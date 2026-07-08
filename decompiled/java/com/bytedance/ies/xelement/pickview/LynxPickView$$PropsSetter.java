package com.bytedance.ies.xelement.pickview;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxPickView$$PropsSetter extends UIView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxPickView lynxPickView = (LynxPickView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -208291852:
                if (str.equals("visible-count")) {
                    lynxPickView.setVisibleCount(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1256871824:
                if (str.equals("mask-style")) {
                    lynxPickView.setMaskStyle(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 2065426547:
                if (str.equals("indicator-style")) {
                    lynxPickView.setIndicatorStyle(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
