package com.lynx.tasm.behavior.ui.list.container;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UIListContainer$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UIListContainer uIListContainer = (UIListContainer) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2062142952:
                if (str.equals("update-animation-fade-in-duration")) {
                    uIListContainer.setUpdateAnimationFadeInDuration(c1311730kEt.LJFF(str, 100));
                    return;
                }
                break;
            case -1741552957:
                if (str.equals("enable-fade-in-animation")) {
                    uIListContainer.setEnableFadeInAnimation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1512080424:
                if (str.equals("experimental-recycle-sticky-item")) {
                    uIListContainer.setEnableRecycleStickyItem(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -1305579111:
                if (str.equals("enable-nested-scroll")) {
                    uIListContainer.setEnableNestedScroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -892259863:
                if (str.equals("sticky")) {
                    uIListContainer.setEnableListSticky(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -858113201:
                if (str.equals("enable-insert-platform-view-operation")) {
                    uIListContainer.setEnableInsertPlatformViewOperation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -773140599:
                if (str.equals("list-container-info")) {
                    uIListContainer.setDiffInfo(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case -711580976:
                if (str.equals("scroll-orientation")) {
                    uIListContainer.setScrollOrientation(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    uIListContainer.setEnableScroll(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 518408055:
                if (str.equals("experimental-android-defer-child-mutation-in-draw")) {
                    uIListContainer.setDeferChildMutationInDraw(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 954804946:
                if (str.equals("experimental-max-fling-distance-ratio")) {
                    uIListContainer.setMaxFlingDistanceRatio(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1013897100:
                if (str.equals("force-can-scroll")) {
                    uIListContainer.setForceCanScroll(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1276968466:
                if (str.equals("experimental-batch-render-strategy")) {
                    uIListContainer.setBatchRenderStrategy(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 1296520439:
                if (str.equals("sticky-offset")) {
                    uIListContainer.setStickyOffset(c1311730kEt.LJ(str, 0.0f));
                    return;
                }
                break;
            case 1844261742:
                if (str.equals("experimental-update-sticky-for-diff")) {
                    uIListContainer.setUpdateStickyForDiff(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 2069690902:
                if (str.equals("need-visible-item-info")) {
                    uIListContainer.setNeedVisibleItemInfo(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2083253753:
                if (str.equals("vertical-orientation")) {
                    uIListContainer.setVerticalOrientation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2107607620:
                if (str.equals("item-snap")) {
                    uIListContainer.setPagingAlignment(c1311730kEt.LJI(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
