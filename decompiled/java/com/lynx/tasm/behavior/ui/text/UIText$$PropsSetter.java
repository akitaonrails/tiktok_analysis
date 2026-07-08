package com.lynx.tasm.behavior.ui.text;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UIText$$PropsSetter extends UIGroup$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UIText uIText = (UIText) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1157887457:
                if (str.equals("selection-handle-color")) {
                    uIText.setSelectionHandleColor(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -1145258555:
                if (str.equals("selection-handle-size")) {
                    uIText.setSelectionHandleSize(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 263767276:
                if (str.equals("text-selection")) {
                    uIText.setEnableTextSelection(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 298809032:
                if (str.equals("custom-text-selection")) {
                    uIText.setCustomTextSelection(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 315007413:
                if (str.equals("accessibility-label")) {
                    uIText.setAccessibilityLabel(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 543207321:
                if (str.equals("custom-context-menu")) {
                    uIText.setCustomContextMenu(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1137695781:
                if (str.equals("selection-background-color")) {
                    uIText.setSelectionBackgroundColor(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
