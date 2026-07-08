package com.lynx.tasm.behavior.ui.scroll;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollView$$PropsSetter extends LynxUIScrollViewInternal$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.scroll.LynxUIScrollViewInternal$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxUIScrollView lynxUIScrollView = (LynxUIScrollView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2116748730:
                if (str.equals("backwards-nested-scroll")) {
                    lynxUIScrollView.setBackwardsNestedScroll(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -1571036001:
                if (str.equals("lower-threshold")) {
                    lynxUIScrollView.setLowerThreshold(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1475521756:
                if (str.equals("forwards-nested-scroll")) {
                    lynxUIScrollView.setForwardsNestedScroll(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -711580976:
                if (str.equals("scroll-orientation")) {
                    lynxUIScrollView.setScrollOrientation(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -411446853:
                if (str.equals("initial-scroll-index")) {
                    lynxUIScrollView.setInitialScrollIndex(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    lynxUIScrollView.setEnableScroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 70310635:
                if (str.equals("bounces")) {
                    lynxUIScrollView.setBounces(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 294508746:
                if (str.equals("initial-scroll-offset")) {
                    lynxUIScrollView.setInitialScrollOffset(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 660290816:
                if (str.equals("upper-threshold")) {
                    lynxUIScrollView.setUpperThreshold(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 875338749:
                if (str.equals("scroll-event-throttle")) {
                    lynxUIScrollView.setScrollEventThrottle(c1311730kEt.LJ(str, 0.0f));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
