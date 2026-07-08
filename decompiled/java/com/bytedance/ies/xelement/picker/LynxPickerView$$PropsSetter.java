package com.bytedance.ies.xelement.picker;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes34.dex */
public class LynxPickerView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        Boolean boolValueOf;
        LynxPickerView lynxPickerView = (LynxPickerView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1274708295:
                if (str.equals("fields")) {
                    lynxPickerView.setFields(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -854975978:
                if (str.equals("confirm-color")) {
                    lynxPickerView.setConfirmColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -752785969:
                if (str.equals("range-key")) {
                    lynxPickerView.setRangeKey(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -586660946:
                if (str.equals("title-color")) {
                    lynxPickerView.setTitleColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -271594562:
                if (str.equals("confirm-string")) {
                    lynxPickerView.setConfirmString(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -28424822:
                if (str.equals("title-font-size")) {
                    lynxPickerView.setTitleFontSize(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    lynxPickerView.setEnd(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    lynxPickerView.setMode(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 49495748:
                if (str.equals("cancel-string")) {
                    lynxPickerView.setCancelString(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 108280125:
                if (str.equals("range")) {
                    lynxPickerView.setRange(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    lynxPickerView.setStart(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    lynxPickerView.setTitle(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    lynxPickerView.setValue(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    if (c1311730kEt.LJIIJ(str)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(c1311730kEt.LIZIZ(str, false));
                    }
                    lynxPickerView.setDisabled(boolValueOf);
                    return;
                }
                break;
            case 1372139088:
                if (str.equals("cancel-color")) {
                    lynxPickerView.setCancelColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1732829925:
                if (str.equals("separator")) {
                    lynxPickerView.setSeparator(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
