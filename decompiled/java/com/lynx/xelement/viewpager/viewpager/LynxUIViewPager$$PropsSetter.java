package com.lynx.xelement.viewpager.viewpager;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIViewPager$$PropsSetter extends BaseLynxViewPager$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.xelement.viewpager.viewpager.BaseLynxViewPager$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxUIViewPager lynxUIViewPager = (LynxUIViewPager) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2087292118:
                if (str.equals("android-force-can-scroll")) {
                    lynxUIViewPager.setForceCanScroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1926922070:
                if (str.equals("initial-select-index")) {
                    lynxUIViewPager.setInitialSelect(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -1705023195:
                if (str.equals("page-change-animation")) {
                    lynxUIViewPager.setPageChangeAnimation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1504749759:
                if (str.equals("android-always-overscroll")) {
                    lynxUIViewPager.setAndroidAlwaysOverscroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    lynxUIViewPager.setEnableScroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 504748326:
                if (str.equals("single-page-touch")) {
                    lynxUIViewPager.setSinglePageTouch(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2126196810:
                if (str.equals("android-distinguish-swipe-tap")) {
                    lynxUIViewPager.setDistinguishSwipeTap(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
