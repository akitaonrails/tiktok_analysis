package com.lynx.tasm.behavior.shadow;

import X.C1311730kEt;

/* JADX INFO: loaded from: classes21.dex */
public class NativeLayoutNodeRef$$PropsSetter extends ShadowNode$$PropsSetter {
    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        NativeLayoutNodeRef nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNode;
        str.getClass();
        if (!str.equals("vertical-align")) {
            if (!str.equals("idSelector")) {
                super.LIZIZ(shadowNode, str, c1311730kEt);
                return;
            } else {
                nativeLayoutNodeRef.setIdSelector(c1311730kEt.LJII(str));
                return;
            }
        }
        nativeLayoutNodeRef.setVerticalAlign(c1311730kEt.LIZ(str));
    }
}
