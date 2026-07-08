package com.bytedance.ies.xelement;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxScrollView$$PropsSetter extends AbsLynxUIScroll$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxScrollView lynxScrollView = (LynxScrollView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1826701651:
                if (str.equals("scroll-to-id")) {
                    lynxScrollView.scrollToId(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1383205240:
                if (str.equals("bounce")) {
                    lynxScrollView.setBounces(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1138034670:
                if (str.equals("enable-load-more")) {
                    lynxScrollView.enableLoadMore(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 363559068:
                if (str.equals("layout-direction")) {
                    lynxScrollView.setLayoutDirection(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 561570840:
                if (str.equals("overflow-text")) {
                    lynxScrollView.overflowText(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1292219859:
                if (str.equals("enable-custom-hittest")) {
                    lynxScrollView.setEnableCustomHittest(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1412362981:
                if (str.equals("android-unified-notify-item-changed")) {
                    lynxScrollView.setUnifiedNotifyItemChanged(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1448017537:
                if (str.equals("page-enable")) {
                    lynxScrollView.setPageEnable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
