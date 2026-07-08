package com.lynx.xelement.input;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIBaseInputShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        LynxUIBaseInputShadowNode lynxUIBaseInputShadowNode = (LynxUIBaseInputShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("line-spacing")) {
            super.LIZIZ(shadowNode, str, c1311730kEt);
        } else {
            lynxUIBaseInputShadowNode.setLineSpacingStr(c1311730kEt.LIZLLL(str));
        }
    }
}
