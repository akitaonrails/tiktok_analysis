package com.lynx.component.svg;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UISvg$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UISvg uISvg = (UISvg) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1556226078:
                if (str.equals("enable-serval-svg")) {
                    uISvg.setEnableServalSvg(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    uISvg.setSource(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 951530617:
                if (str.equals("content")) {
                    uISvg.setContent(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
