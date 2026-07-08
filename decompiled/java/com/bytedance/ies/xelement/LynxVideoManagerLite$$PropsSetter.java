package com.bytedance.ies.xelement;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes33.dex */
public class LynxVideoManagerLite$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxVideoManagerLite lynxVideoManagerLite = (LynxVideoManagerLite) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1699818261:
                if (str.equals("enableplaylistener")) {
                    lynxVideoManagerLite.setEnablePlayListener(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1664825047:
                if (str.equals("singleplayer")) {
                    lynxVideoManagerLite.setSinglePlayer(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1531319052:
                if (str.equals("performanceLog")) {
                    lynxVideoManagerLite.setPerformanceLog(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxVideoManagerLite.setObjectFit(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    lynxVideoManagerLite.setPoster(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case -894681731:
                if (str.equals("__control")) {
                    lynxVideoManagerLite.setControl(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -810883302:
                if (str.equals("volume")) {
                    lynxVideoManagerLite.setVolume(c1311730kEt.LJ(str, 0.0f));
                    return;
                }
                break;
            case -318476791:
                if (str.equals("preload")) {
                    lynxVideoManagerLite.setPreload(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxVideoManagerLite.setSrc(c1311730kEt.LIZLLL(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxVideoManagerLite.setLoop(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 3493088:
                if (str.equals("rate")) {
                    lynxVideoManagerLite.setRate(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    lynxVideoManagerLite.setMuted(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 269397981:
                if (str.equals("inittime")) {
                    lynxVideoManagerLite.setInitTime(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 850708551:
                if (str.equals("log-extra")) {
                    lynxVideoManagerLite.setLogExtra(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 894041755:
                if (str.equals("autolifecycle")) {
                    lynxVideoManagerLite.setAutoLifecycle(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1331794760:
                if (str.equals("video-tag")) {
                    lynxVideoManagerLite.setVideoTag(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxVideoManagerLite.setAutoPlay(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1933829272:
                if (str.equals("devicechangeaware")) {
                    lynxVideoManagerLite.setDeviceChangeAware(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
