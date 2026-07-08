package com.lynx.tasm.behavior.shadow.text;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class RawTextShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("pseudo")) {
            if (!str.equals("text")) {
                super.LIZIZ(shadowNode, str, c1311730kEt);
                return;
            } else {
                rawTextShadowNode.setText(c1311730kEt.LIZLLL(str));
                return;
            }
        }
        rawTextShadowNode.setPsuedo(c1311730kEt.LIZIZ(str, false));
    }
}
