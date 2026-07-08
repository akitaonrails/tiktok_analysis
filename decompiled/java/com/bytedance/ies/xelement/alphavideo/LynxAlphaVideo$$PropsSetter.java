package com.bytedance.ies.xelement.alphavideo;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxAlphaVideo$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2133601602:
                if (str.equals("keep-last-frame")) {
                    lynxAlphaVideo.setKeepLastFrame(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    lynxAlphaVideo.setPoster(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -317044449:
                if (str.equals("frame-hold")) {
                    lynxAlphaVideo.setFrameHold(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxAlphaVideo.setSrc(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxAlphaVideo.setLoop(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 838895478:
                if (str.equals("last-frame")) {
                    lynxAlphaVideo.setLastFrame(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1026299997:
                if (str.equals("android-ignore-attach-status")) {
                    lynxAlphaVideo.setAndroidIgnoreAttachStatus(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxAlphaVideo.setAutoPlay(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
