package com.lynx.tasm.behavior.ui.view;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class UIView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UIView uIView = (UIView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1389119727:
                if (str.equals("impression_id")) {
                    uIView.setImpressionId(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -505576881:
                if (str.equals("copyable")) {
                    uIView.copyable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -400775539:
                if (str.equals("blur-sampling")) {
                    uIView.setBlurSampling(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 327124377:
                if (str.equals("android-enable-auto-blur")) {
                    uIView.setBlurAutoUpdate(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
