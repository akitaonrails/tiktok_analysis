package com.ss.android.ugc.aweme.base.xelements;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes33.dex */
public class LynxUILive$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxUILive lynxUILive = (LynxUILive) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxUILive.setObjectFit(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1247523363:
                if (str.equals("qualities")) {
                    lynxUILive.setQualities(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3363353:
                if (str.equals("mute")) {
                    lynxUILive.setMuted(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 1580822999:
                if (str.equals("stream-data")) {
                    lynxUILive.setStreamData(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
