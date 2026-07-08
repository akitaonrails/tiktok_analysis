package com.lynx.tasm.behavior.ui.frame;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UIFrame$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        Boolean boolValueOf;
        UIFrame uIFrame = (UIFrame) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1751360826:
                if (str.equals("global-props")) {
                    uIFrame.setGlobalProps(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -1468080088:
                if (str.equals("auto-width")) {
                    uIFrame.setAutoWidth(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -877443322:
                if (str.equals("embedded-mode")) {
                    uIFrame.setEmbeddedMode(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -698355755:
                if (str.equals("preset-height")) {
                    uIFrame.setPresetHeight(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -285654696:
                if (str.equals("preset-width")) {
                    uIFrame.setPresetWidth(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    uIFrame.setSrc(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3076010:
                if (str.equals("data")) {
                    uIFrame.setData(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 626516761:
                if (str.equals("enable-multi-async-thread")) {
                    if (c1311730kEt.LJIIJ(str)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(c1311730kEt.LIZIZ(str, false));
                    }
                    uIFrame.setEnableMultiAsyncThread(boolValueOf);
                    return;
                }
                break;
            case 1301162757:
                if (str.equals("auto-height")) {
                    uIFrame.setAutoHeight(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
