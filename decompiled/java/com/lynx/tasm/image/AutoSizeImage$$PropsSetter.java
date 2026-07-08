package com.lynx.tasm.image;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class AutoSizeImage$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        AutoSizeImage autoSizeImage = (AutoSizeImage) shadowNode;
        str.getClass();
        if (!str.equals("src")) {
            super.LIZIZ(shadowNode, str, c1311730kEt);
        } else {
            autoSizeImage.setSrc(c1311730kEt.LJII(str));
        }
    }
}
