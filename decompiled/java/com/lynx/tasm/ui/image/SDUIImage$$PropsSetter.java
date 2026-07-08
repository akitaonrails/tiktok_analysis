package com.lynx.tasm.ui.image;

import X.C1291290jhv;
import X.C1315460kKu;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class SDUIImage$$PropsSetter extends AbsSDUIImage$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.ui.image.AbsSDUIImage$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.utils.SDUIUISetter
    public final void LIZ(SDUIBaseUI sDUIBaseUI, String str, C1291290jhv c1291290jhv) {
        C1315460kKu c1315460kKu = (C1315460kKu) sDUIBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    c1315460kKu.setCapInsetsScale(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case -1338903714:
                if (str.equals("skip-redirection")) {
                    c1315460kKu.setSkipRedirection(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
            case -1138223116:
                if (str.equals("image-config")) {
                    c1315460kKu.setImageConfig(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case -602643660:
                if (str.equals("fresco-nine-patch")) {
                    c1315460kKu.setFrescoNinePatch(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
            case 512852970:
                if (str.equals("subsample")) {
                    c1315460kKu.setSubSample(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    c1315460kKu.setCapInsetsBackUp(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 902281110:
                if (str.equals("suspendable")) {
                    c1315460kKu.setSuspendable(c1291290jhv.LIZLLL(str));
                    return;
                }
                break;
            case 1090746891:
                if (str.equals("fresco-visible")) {
                    c1315460kKu.setFrescoVisible(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 1245269388:
                if (str.equals("fresco-attach")) {
                    c1315460kKu.setFrescoAttach(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 1672916293:
                if (str.equals("fix-fresco-bug")) {
                    c1315460kKu.fixFrescoWebPBug(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
            case 1739487650:
                if (str.equals("defer-src-invalidation")) {
                    c1315460kKu.setDeferInvalidation(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c1315460kKu.setVisibility(c1291290jhv.LJFF(str, 0));
                    return;
                }
                break;
        }
        super.LIZ(sDUIBaseUI, str, c1291290jhv);
    }
}
