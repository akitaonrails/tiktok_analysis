package com.lynx.tasm.ui.image;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class FrescoInlineImageShadowNode$$PropsSetter extends AbsInlineImageShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        FrescoInlineImageShadowNode frescoInlineImageShadowNode = (FrescoInlineImageShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("skip-redirection")) {
            if (!str.equals("loop-count")) {
                super.LIZIZ(shadowNode, str, c1311730kEt);
                return;
            } else {
                frescoInlineImageShadowNode.setLoopCount(c1311730kEt.LJFF(str, 0));
                return;
            }
        }
        frescoInlineImageShadowNode.setSkipRedirection(c1311730kEt.LIZIZ(str, false));
    }
}
