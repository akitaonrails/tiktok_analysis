package com.bytedance.ies.xelement.text.text;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxTextShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public final void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        LynxTextShadowNode lynxTextShadowNode = (LynxTextShadowNode) shadowNode;
        str.getClass();
        switch (str.hashCode()) {
            case -1550570986:
                if (str.equals("richtype")) {
                    lynxTextShadowNode.setRichType(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 125841635:
                if (str.equals("ellipsize-mode")) {
                    lynxTextShadowNode.setEllipsizeMode(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1629007544:
                if (str.equals("text-maxline")) {
                    lynxTextShadowNode.setTextMaxLine(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZIZ(shadowNode, str, c1311730kEt);
    }
}
