package com.bytedance.ies.xelement.audiott;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes34.dex */
public class LynxAudioTTView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxAudioTTView lynxAudioTTView = (LynxAudioTTView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1426991399:
                if (str.equals("enableasync")) {
                    lynxAudioTTView.setEnableAsync(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxAudioTTView.setSrc(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxAudioTTView.setLoop(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 570418373:
                if (str.equals("interval")) {
                    lynxAudioTTView.setUpdateInterval(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 795307910:
                if (str.equals("headers")) {
                    lynxAudioTTView.setHeaders(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxAudioTTView.isAutoPlay(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2096002969:
                if (str.equals("pause-on-hide")) {
                    lynxAudioTTView.setPauseOnHide(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 2096812443:
                if (str.equals("playertype")) {
                    lynxAudioTTView.setPlayerType(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
