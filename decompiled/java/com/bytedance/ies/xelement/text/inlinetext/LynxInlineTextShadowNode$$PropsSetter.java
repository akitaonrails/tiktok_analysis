package com.bytedance.ies.xelement.text.inlinetext;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxInlineTextShadowNode$$PropsSetter extends InlineTextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        LynxInlineTextShadowNode lynxInlineTextShadowNode = (LynxInlineTextShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("no-trim")) {
            super.LIZIZ(shadowNode, str, c1311730kEt);
        } else {
            lynxInlineTextShadowNode.setNoTrim(c1311730kEt.LIZIZ(str, true));
        }
    }
}
