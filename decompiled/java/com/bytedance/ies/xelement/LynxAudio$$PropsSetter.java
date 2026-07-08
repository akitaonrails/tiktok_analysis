package com.bytedance.ies.xelement;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes34.dex */
public class LynxAudio$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxAudio lynxAudio = (LynxAudio) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1669980826:
                if (str.equals("nativecontrol")) {
                    lynxAudio.setSupportNativeControl(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxAudio.setSrc(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3322014:
                if (str.equals("list")) {
                    lynxAudio.setList(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxAudio.setLoop(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1197813673:
                if (str.equals("nativeplugins")) {
                    lynxAudio.setNativePlugins(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxAudio.isAutoPlay(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    lynxAudio.setSupportFocusable(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2095859131:
                if (str.equals("playerType")) {
                    lynxAudio.setPlayerType(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
