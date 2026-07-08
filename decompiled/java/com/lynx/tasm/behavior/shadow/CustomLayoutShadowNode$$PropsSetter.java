package com.lynx.tasm.behavior.shadow;

import X.C1311730kEt;

/* JADX INFO: loaded from: classes21.dex */
public class CustomLayoutShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        CustomLayoutShadowNode customLayoutShadowNode = (CustomLayoutShadowNode) shadowNode;
        str.getClass();
        if (!str.equals("custom-layout")) {
            super.LIZIZ(shadowNode, str, c1311730kEt);
        } else {
            customLayoutShadowNode.setCustomLayout(c1311730kEt.LIZIZ(str, false));
        }
    }
}
