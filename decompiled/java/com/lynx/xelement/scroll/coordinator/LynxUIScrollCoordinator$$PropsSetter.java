package com.lynx.xelement.scroll.coordinator;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinator$$PropsSetter extends BaseScrollCoordinator$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.xelement.scroll.coordinator.BaseScrollCoordinator$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxUIScrollCoordinator lynxUIScrollCoordinator = (LynxUIScrollCoordinator) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2081198901:
                if (str.equals("android-enable-touch-stop-fling")) {
                    lynxUIScrollCoordinator.setEnableTouchStopFling(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -1056707280:
                if (str.equals("toolbar-interaction-enable")) {
                    lynxUIScrollCoordinator.setToolbarInteractionEnable(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -295277545:
                if (str.equals("header-over-slot")) {
                    lynxUIScrollCoordinator.setHeaderOverSlot(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -183516802:
                if (str.equals("header-scrollview-enable")) {
                    lynxUIScrollCoordinator.setHeaderScrollViewEnable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 898500533:
                if (str.equals("android-header-over-slot")) {
                    lynxUIScrollCoordinator.setAndroidHeaderOverSlot(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1051176707:
                if (str.equals("experimental-header-slot-overflow-hit-test")) {
                    lynxUIScrollCoordinator.setHeaderSlotOverflowHitTest(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1619605242:
                if (str.equals("tab-movable-enable")) {
                    lynxUIScrollCoordinator.setTabMovableEnable(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1719615942:
                if (str.equals("android-header-tap-slop")) {
                    lynxUIScrollCoordinator.setAndroidHeaderTapSlop(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 2038700809:
                if (str.equals("android-nested-scroll-as-child")) {
                    lynxUIScrollCoordinator.setNestedScrollAsChild(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
