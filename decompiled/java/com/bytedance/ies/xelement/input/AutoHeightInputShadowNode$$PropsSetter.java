package com.bytedance.ies.xelement.input;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class AutoHeightInputShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        AutoHeightInputShadowNode autoHeightInputShadowNode = (AutoHeightInputShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("font-size")) {
            super.LIZIZ(shadowNode, str, c1311730kEt);
        } else {
            autoHeightInputShadowNode.setFontTextSize(c1311730kEt.LIZLLL(str));
        }
    }
}
