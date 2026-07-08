package com.lynx.tasm.behavior.ui.image;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class AbsUIImage$$PropsSetter extends LynxUI$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        AbsUIImage absUIImage = (AbsUIImage) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    absUIImage.setCapInsetsScale(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case -1249491252:
                if (str.equals("cover-start")) {
                    absUIImage.setCoverStart(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -934531685:
                if (str.equals("repeat")) {
                    absUIImage.setRepeat(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -629825370:
                if (str.equals("loop-count")) {
                    absUIImage.setLoopCount(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -320982203:
                if (str.equals("disable-default-resize")) {
                    absUIImage.setDisableDefaultResize(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -256430480:
                if (str.equals("prefetch-width")) {
                    absUIImage.setPreFetchWidth(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    absUIImage.setSource(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    absUIImage.setObjectFit(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 207594941:
                if (str.equals("prefetch-height")) {
                    absUIImage.setPreFetchHeight(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    absUIImage.setCapInsetsBackUp(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    absUIImage.setPlaceholder(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 681292984:
                if (str.equals("blur-radius")) {
                    absUIImage.setBlurRadius(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1198809474:
                if (str.equals("disable-default-placeholder")) {
                    absUIImage.setDisableDefaultPlaceholder(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1515751784:
                if (str.equals("capInsets")) {
                    absUIImage.setCapInsets(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1615092063:
                if (str.equals("auto-size")) {
                    absUIImage.setAutoSize(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
