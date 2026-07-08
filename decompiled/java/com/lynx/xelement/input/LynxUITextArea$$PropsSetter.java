package com.lynx.xelement.input;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes33.dex */
public class LynxUITextArea$$PropsSetter extends LynxUIBaseInput$$PropsSetter {
    @Override // com.lynx.xelement.input.LynxUIBaseInput$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxUITextArea lynxUITextArea = (LynxUITextArea) lynxBaseUI;
        str.getClass();
        if (!str.equals("maxlines")) {
            if (!str.equals("enable-scroll-bar")) {
                super.LIZ(lynxBaseUI, str, c1311730kEt);
                return;
            } else {
                lynxUITextArea.setEnableScrollBar(c1311730kEt.LIZIZ(str, false));
                return;
            }
        }
        lynxUITextArea.setMaxLines(c1311730kEt.LJFF(str, Integer.MAX_VALUE));
    }
}
