package com.lynx.tasm.behavior.ui.scroll;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class AbsLynxUIScroll$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        AbsLynxUIScroll absLynxUIScroll = (AbsLynxUIScroll) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2039913758:
                if (str.equals("block-descendant-focusability")) {
                    absLynxUIScroll.setBlockDescendantFocusability(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -2032847360:
                if (str.equals("scroll-to-index")) {
                    absLynxUIScroll.scrollToIndex(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -1571036001:
                if (str.equals("lower-threshold")) {
                    absLynxUIScroll.setLowerThreshole(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -445000626:
                if (str.equals("enable-new-nested")) {
                    absLynxUIScroll.setEnableNewNested(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -402166408:
                if (str.equals("scroll-x")) {
                    absLynxUIScroll.setScrollX(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -402166407:
                if (str.equals("scroll-y")) {
                    absLynxUIScroll.setScrollY(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    absLynxUIScroll.setEnableScroll(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 65137827:
                if (str.equals("scroll-tap")) {
                    absLynxUIScroll.setScrollTap(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 65138261:
                if (str.equals("scroll-top")) {
                    absLynxUIScroll.setScrollTop(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 257565167:
                if (str.equals("forbid-fling-focus-change")) {
                    absLynxUIScroll.setForbidFlingFocusChange(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 660290816:
                if (str.equals("upper-threshold")) {
                    absLynxUIScroll.setUpperThreshole(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 1751260029:
                if (str.equals("scroll-bar-enable")) {
                    absLynxUIScroll.setScrollBarEnable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2019037959:
                if (str.equals("scroll-left")) {
                    absLynxUIScroll.setScrollLeft(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
