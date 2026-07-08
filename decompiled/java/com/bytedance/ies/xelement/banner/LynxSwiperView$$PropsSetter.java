package com.bytedance.ies.xelement.banner;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes34.dex */
public class LynxSwiperView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1992012396:
                if (str.equals("duration")) {
                    lynxSwiperView.setDuration(c1311730kEt.LJFF(str, 500));
                    return;
                }
                break;
            case -1597449863:
                if (str.equals("start-margin")) {
                    lynxSwiperView.setStartMargin(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -1596393144:
                if (str.equals("indicator-dots")) {
                    lynxSwiperView.setIndicator(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    lynxSwiperView.setCircular(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1235498272:
                if (str.equals("end-margin")) {
                    lynxSwiperView.setEndMargin(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -1029251878:
                if (str.equals("indicator-active-color")) {
                    lynxSwiperView.setIndicatorActiveColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -313198140:
                if (str.equals("hardware_texture")) {
                    lynxSwiperView.setRenderHardwareTexture(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -111166008:
                if (str.equals("next-margin")) {
                    lynxSwiperView.setNextMargin(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    lynxSwiperView.setMode(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 24002884:
                if (str.equals("previous-margin")) {
                    lynxSwiperView.setPreviousMargin(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 364166425:
                if (str.equals("touchable")) {
                    lynxSwiperView.setTouchable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 570418373:
                if (str.equals("interval")) {
                    lynxSwiperView.setInterval(c1311730kEt.LJFF(str, 5000));
                    return;
                }
                break;
            case 914875020:
                if (str.equals("item-width")) {
                    lynxSwiperView.setItemWidth(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1126940025:
                if (str.equals("current")) {
                    lynxSwiperView.setCurrentIndex(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 1127093697:
                if (str.equals("current-item-id")) {
                    lynxSwiperView.setCurrentItemId(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1255595234:
                if (str.equals("hideshadow")) {
                    lynxSwiperView.setHideShadow(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxSwiperView.setAutoPlay(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1599847372:
                if (str.equals("smooth-scroll")) {
                    lynxSwiperView.setSmoothScroll(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1616798838:
                if (str.equals("shadow-color")) {
                    lynxSwiperView.setShadowColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1665556140:
                if (str.equals("page-margin")) {
                    lynxSwiperView.setPageMargin(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 2050488869:
                if (str.equals("indicator-color")) {
                    lynxSwiperView.setIndicatorColor(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
