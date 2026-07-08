package com.bytedance.ies.xelement.blur;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UIBlurView$$PropsSetter extends UIView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UIBlurView uIBlurView = (UIBlurView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -866653701:
                if (str.equals("enable-auto-blur")) {
                    uIBlurView.setEnableAutoBlur(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -91134698:
                if (str.equals("android-capture-target")) {
                    uIBlurView.setCaptureTarget(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 681292984:
                if (str.equals("blur-radius")) {
                    uIBlurView.setBlurRadius(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1574384313:
                if (str.equals("experimental-update-blur-radius")) {
                    uIBlurView.setExperimentalUpdateBlurRadius(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
