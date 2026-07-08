package com.lynx.tasm.ui.image;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class UIFilterImage$$PropsSetter extends UIImage$$PropsSetter {
    @Override // com.lynx.tasm.ui.image.UIImage$$PropsSetter, com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        UIFilterImage uIFilterImage = (UIFilterImage) lynxBaseUI;
        str.getClass();
        if (!str.equals("drop-shadow")) {
            super.LIZ(lynxBaseUI, str, c1311730kEt);
        } else {
            uIFilterImage.setDropShadow(c1311730kEt.LJII(str));
        }
    }
}
