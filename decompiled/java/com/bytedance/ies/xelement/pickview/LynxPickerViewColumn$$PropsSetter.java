package com.bytedance.ies.xelement.pickview;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxPickerViewColumn$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxPickerViewColumn lynxPickerViewColumn = (LynxPickerViewColumn) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -752785969:
                if (str.equals("range-key")) {
                    lynxPickerViewColumn.setRangeKey(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -208291852:
                if (str.equals("visible-count")) {
                    lynxPickerViewColumn.setVisibleCount(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 108280125:
                if (str.equals("range")) {
                    lynxPickerViewColumn.setRange(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 108532386:
                if (str.equals("font-family")) {
                    lynxPickerViewColumn.setFontFamily(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    lynxPickerViewColumn.setValue(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1256871824:
                if (str.equals("mask-style")) {
                    lynxPickerViewColumn.setMaskStyle(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 2065426547:
                if (str.equals("indicator-style")) {
                    lynxPickerViewColumn.setIndicatorStyle(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
