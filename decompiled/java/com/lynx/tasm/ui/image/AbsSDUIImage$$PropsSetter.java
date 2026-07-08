package com.lynx.tasm.ui.image;

import X.AbstractC1315830kLV;
import X.C1291290jhv;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class AbsSDUIImage$$PropsSetter extends SDUIUI$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.utils.SDUIUISetter
    public void LIZ(SDUIBaseUI sDUIBaseUI, String str, C1291290jhv c1291290jhv) {
        AbstractC1315830kLV abstractC1315830kLV = (AbstractC1315830kLV) sDUIBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    abstractC1315830kLV.setCapInsetsScale(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case -1249491252:
                if (str.equals("cover-start")) {
                    abstractC1315830kLV.setCoverStart(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
            case -934531685:
                if (str.equals("repeat")) {
                    abstractC1315830kLV.setRepeat(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
            case -629825370:
                if (str.equals("loop-count")) {
                    abstractC1315830kLV.setLoopCount(c1291290jhv.LJFF(str, 0));
                    return;
                }
                break;
            case -320982203:
                if (str.equals("disable-default-resize")) {
                    abstractC1315830kLV.setDisableDefaultResize(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
            case -256430480:
                if (str.equals("prefetch-width")) {
                    abstractC1315830kLV.setPreFetchWidth(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    abstractC1315830kLV.setSource(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    abstractC1315830kLV.setObjectFit(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 207594941:
                if (str.equals("prefetch-height")) {
                    abstractC1315830kLV.setPreFetchHeight(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    abstractC1315830kLV.setCapInsetsBackUp(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    abstractC1315830kLV.setPlaceholder(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 681292984:
                if (str.equals("blur-radius")) {
                    abstractC1315830kLV.setBlurRadius(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 1198809474:
                if (str.equals("disable-default-placeholder")) {
                    abstractC1315830kLV.setDisableDefaultPlaceholder(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
            case 1515751784:
                if (str.equals("capInsets")) {
                    abstractC1315830kLV.setCapInsets(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 1615092063:
                if (str.equals("auto-size")) {
                    abstractC1315830kLV.setAutoSize(c1291290jhv.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(sDUIBaseUI, str, c1291290jhv);
    }
}
