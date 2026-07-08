package com.lynx.xelement.viewpager.viewpager;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class BaseLynxViewPager$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        BaseLynxViewPager baseLynxViewPager = (BaseLynxViewPager) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1332194002:
                if (str.equals("background")) {
                    baseLynxViewPager.setBackground(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 487784663:
                if (str.equals("keep-item-view")) {
                    baseLynxViewPager.setKeepItemView(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 630404516:
                if (str.equals("allow-horizontal-gesture")) {
                    baseLynxViewPager.setAllowHorizontalGesture(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 942654657:
                if (str.equals("select-index")) {
                    baseLynxViewPager.setSelect(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
