package com.bytedance.ies.xelement.input;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes33.dex */
public class LynxInputView$$PropsSetter extends LynxBaseInputView$$PropsSetter {
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) throws IllegalAccessException, InvocationTargetException {
        LynxInputView lynxInputView = (LynxInputView) lynxBaseUI;
        str.getClass();
        if (!str.equals("password")) {
            super.LIZ(lynxBaseUI, str, c1311730kEt);
        } else {
            lynxInputView.setIsPassword(c1311730kEt.LIZIZ(str, false));
        }
    }
}
