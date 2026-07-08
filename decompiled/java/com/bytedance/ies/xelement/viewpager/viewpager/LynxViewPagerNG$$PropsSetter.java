package com.bytedance.ies.xelement.viewpager.viewpager;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class LynxViewPagerNG$$PropsSetter extends BaseLynxViewPager$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxViewPagerNG lynxViewPagerNG = (LynxViewPagerNG) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2087292118:
                if (str.equals("android-force-can-scroll")) {
                    lynxViewPagerNG.setForceCanScroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1926922070:
                if (str.equals("initial-select-index")) {
                    lynxViewPagerNG.setInitialSelect(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -1705023195:
                if (str.equals("page-change-animation")) {
                    lynxViewPagerNG.setPageChangeAnimation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1504749759:
                if (str.equals("android-always-overscroll")) {
                    lynxViewPagerNG.setAndroidAlwaysOverscroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    lynxViewPagerNG.setEnableScroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 504748326:
                if (str.equals("single-page-touch")) {
                    lynxViewPagerNG.setSinglePageTouch(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2126196810:
                if (str.equals("android-distinguish-swipe-tap")) {
                    lynxViewPagerNG.setDistinguishSwipeTap(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
