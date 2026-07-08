package com.bytedance.ies.xelement.input;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes33.dex */
public class LynxTextAreaView$$PropsSetter extends LynxBaseInputView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) throws IllegalAccessException, InvocationTargetException {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1550570986:
                if (str.equals("richtype")) {
                    lynxTextAreaView.setRichType(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -428786256:
                if (str.equals("max-height")) {
                    lynxTextAreaView.setMaxHeight(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 419784731:
                if (str.equals("maxlines")) {
                    lynxTextAreaView.setMaxLines(c1311730kEt.LJFF(str, Integer.MAX_VALUE));
                    return;
                }
                break;
            case 2043213058:
                if (str.equals("min-height")) {
                    lynxTextAreaView.setMinHeight(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
