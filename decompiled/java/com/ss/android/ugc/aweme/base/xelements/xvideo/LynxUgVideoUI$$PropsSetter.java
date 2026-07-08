package com.ss.android.ugc.aweme.base.xelements.xvideo;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes34.dex */
public class LynxUgVideoUI$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxUgVideoUI lynxUgVideoUI = (LynxUgVideoUI) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxUgVideoUI.setObjectFit(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    lynxUgVideoUI.setPoster(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -894681731:
                if (str.equals("__control")) {
                    lynxUgVideoUI.setControl(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -810883302:
                if (str.equals("volume")) {
                    lynxUgVideoUI.setVolume(c1311730kEt.LJ(str, 0.0f));
                    return;
                }
                break;
            case -642624357:
                if (str.equals("preload-key")) {
                    lynxUgVideoUI.setPreloadKey(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -17124500:
                if (str.equals("cache-size")) {
                    lynxUgVideoUI.setCacheSize(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxUgVideoUI.setSrc(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxUgVideoUI.setLoop(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 3493088:
                if (str.equals("rate")) {
                    lynxUgVideoUI.setRate(c1311730kEt.LIZJ(str, 0.0d));
                    return;
                }
                break;
            case 94416770:
                if (str.equals("cache")) {
                    lynxUgVideoUI.setCache(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    lynxUgVideoUI.setMuted(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 269397981:
                if (str.equals("inittime")) {
                    lynxUgVideoUI.setInitTime(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 894041755:
                if (str.equals("autolifecycle")) {
                    lynxUgVideoUI.setAutoLifeCycle(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1331794760:
                if (str.equals("video-tag")) {
                    lynxUgVideoUI.setVideoTag(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxUgVideoUI.setAutoPlay(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
