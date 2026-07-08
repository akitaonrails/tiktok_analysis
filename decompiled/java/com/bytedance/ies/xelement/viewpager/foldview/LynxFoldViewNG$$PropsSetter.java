package com.bytedance.ies.xelement.viewpager.foldview;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class LynxFoldViewNG$$PropsSetter extends BaseLynxFoldView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxFoldViewNG lynxFoldViewNG = (LynxFoldViewNG) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2081198901:
                if (str.equals("android-enable-touch-stop-fling")) {
                    lynxFoldViewNG.setEnableTouchStopFling(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -1056707280:
                if (str.equals("toolbar-interaction-enable")) {
                    lynxFoldViewNG.setToolbarInteractionEnable(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -295277545:
                if (str.equals("header-over-slot")) {
                    lynxFoldViewNG.setUnifiedHeaderOverSlot(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -183516802:
                if (str.equals("header-scrollview-enable")) {
                    lynxFoldViewNG.setHeaderScrollViewEnable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 898500533:
                if (str.equals("android-header-over-slot")) {
                    lynxFoldViewNG.setAndroidHeaderOverSlot(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1051176707:
                if (str.equals("experimental-header-slot-overflow-hit-test")) {
                    lynxFoldViewNG.setIsHeaderSlotOverflowHitTest(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1619605242:
                if (str.equals("tab-movable-enable")) {
                    lynxFoldViewNG.setTabMovableEnable(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1719615942:
                if (str.equals("android-header-tap-slop")) {
                    lynxFoldViewNG.setAndroidHeaderTapSlop(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 2038700809:
                if (str.equals("android-nested-scroll-as-child")) {
                    lynxFoldViewNG.setNestedScrollAsChild(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
