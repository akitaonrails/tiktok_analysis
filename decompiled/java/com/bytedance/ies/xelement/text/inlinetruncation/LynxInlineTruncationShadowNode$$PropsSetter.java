package com.bytedance.ies.xelement.text.inlinetruncation;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxInlineTruncationShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        LynxInlineTruncationShadowNode lynxInlineTruncationShadowNode = (LynxInlineTruncationShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("stick")) {
            super.LIZIZ(shadowNode, str, c1311730kEt);
        } else {
            lynxInlineTruncationShadowNode.setStick(c1311730kEt.LIZIZ(str, false));
        }
    }
}
