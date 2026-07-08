package com.lynx.xelement.scroll.coordinator;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class BaseScrollCoordinator$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        BaseScrollCoordinator baseScrollCoordinator = (BaseScrollCoordinator) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1662739435:
                if (str.equals("compat-container-popup")) {
                    baseScrollCoordinator.setCompatContainerPopup(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    baseScrollCoordinator.setScrollEnable(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1819831630:
                if (str.equals("granularity")) {
                    baseScrollCoordinator.setGranularity(c1311730kEt.LJ(str, 0.01f));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
