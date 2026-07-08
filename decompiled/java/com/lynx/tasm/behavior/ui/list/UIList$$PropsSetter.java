package com.lynx.tasm.behavior.ui.list;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class UIList$$PropsSetter extends AbsLynxList$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UIList uIList = (UIList) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1836837422:
                if (str.equals("scroll-index")) {
                    uIList.setScrollIndex(c1311730kEt.LJFF(str, -1));
                    return;
                }
                break;
            case -1775291141:
                if (str.equals("android-stack-from-end")) {
                    uIList.setStackFromEnd(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1751296064:
                if (str.equals("android-new-scroll-top")) {
                    uIList.setListNewScrollTopSwitch(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1498894801:
                if (str.equals("max-fling-velocity-percent")) {
                    uIList.setMaxFlingVelocityPercent(c1311730kEt.LJ(str, 0.0f));
                    return;
                }
                break;
            case -1471202561:
                if (str.equals("android-enable-strict-scrollable")) {
                    uIList.setEnableStrictScrollable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1305579111:
                if (str.equals("enable-nested-scroll")) {
                    uIList.enableNestedScroll(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -1232185977:
                if (str.equals("android-enable-gap-item-decoration")) {
                    uIList.setEnableGapItemDecoration(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1200045995:
                if (str.equals("use-old-sticky")) {
                    uIList.setListOldStickySwitch(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -1042889767:
                if (str.equals("enable-async-list")) {
                    uIList.setEnableAsyncList(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1035189822:
                if (str.equals("enable-new-exposure-strategy")) {
                    uIList.setNewAppear(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -942713210:
                if (str.equals("preload-buffer-count")) {
                    uIList.setPreloadBufferCount(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -529325351:
                if (str.equals("list-platform-info")) {
                    uIList.setListPlatformInfo(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case -505938823:
                if (str.equals("update-list-info")) {
                    uIList.updateListActionInfo(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 616977828:
                if (str.equals("android-preference-consume-gesture")) {
                    uIList.setPreferenceConsumeGesture(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 626658734:
                if (str.equals("android-enable-overflow")) {
                    uIList.setEnableOverflow(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 821895493:
                if (str.equals("android-enable-item-prefetch")) {
                    uIList.setEnableItemPrefetch(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1458283840:
                if (str.equals("enable-size-cache")) {
                    uIList.setEnableSizeCache(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1598314955:
                if (str.equals("scroll-upper-lower-switch")) {
                    uIList.setUpperLowerSwitch(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1636003801:
                if (str.equals("enable-disappear")) {
                    uIList.setEnableDisappear(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1683042429:
                if (str.equals("android-diffable")) {
                    uIList.setDiffable(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1702184795:
                if (str.equals("android-trigger-sticky-layout")) {
                    uIList.setTriggerStickyLayout(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1816872768:
                if (str.equals("auto-measure")) {
                    uIList.setAutoMeasure(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1836550134:
                if (str.equals("android-ignore-attach-for-binding")) {
                    uIList.setAndroidIgnoreAttachForBinding(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1839496169:
                if (str.equals("android-enable-focus-search")) {
                    uIList.setEnableFocusSearch(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1852315393:
                if (str.equals("item-holder-type")) {
                    uIList.setItemHolderType(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1892080416:
                if (str.equals("enable-rtl")) {
                    uIList.enableRtl(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2083253753:
                if (str.equals("vertical-orientation")) {
                    uIList.setVerticalOrientation(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
