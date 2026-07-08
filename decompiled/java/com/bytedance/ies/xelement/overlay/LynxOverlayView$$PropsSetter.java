package com.bytedance.ies.xelement.overlay;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxOverlayView$$PropsSetter extends UIGroup$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        Boolean boolValueOf;
        LynxOverlayView lynxOverlayView = (LynxOverlayView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1987814405:
                if (str.equals("always-show")) {
                    lynxOverlayView.setAlwaysShow(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1952821320:
                if (str.equals("overlay-id")) {
                    lynxOverlayView.setOverlayId(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1389050563:
                if (str.equals("events-pass-through")) {
                    lynxOverlayView.setEventsPassThrough(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -939362323:
                if (str.equals("cut-out-mode")) {
                    lynxOverlayView.setCutOutMode(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -865043584:
                if (str.equals("android-set-soft-input-mode")) {
                    lynxOverlayView.setAndroidSetSoftInputMode(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -243354428:
                if (str.equals("status-bar-translucent")) {
                    lynxOverlayView.setStatusBarTranslucent(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 272778088:
                if (str.equals("status-bar-translucent-style")) {
                    lynxOverlayView.setStatusBarTranslucentStyle(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    lynxOverlayView.setVisible(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 1011660130:
                if (str.equals("compat-bounding-rect")) {
                    if (c1311730kEt.LJIIJ(str)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(c1311730kEt.LIZIZ(str, false));
                    }
                    lynxOverlayView.setShouldOffsetBoundingRect(boolValueOf);
                    return;
                }
                break;
            case 1330942754:
                if (str.equals("android-enable-accessibility")) {
                    lynxOverlayView.setEnableAccessibility(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1860950378:
                if (str.equals("full-screen")) {
                    lynxOverlayView.setFullScreen(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2013950716:
                if (str.equals("android-native-event-pass")) {
                    lynxOverlayView.setNativeEventPass(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
