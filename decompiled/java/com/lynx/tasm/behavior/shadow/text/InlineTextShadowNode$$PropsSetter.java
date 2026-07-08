package com.lynx.tasm.behavior.shadow.text;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* JADX INFO: loaded from: classes21.dex */
public class InlineTextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        InlineTextShadowNode inlineTextShadowNode = (InlineTextShadowNode) shadowNode;
        str.getClass();
        switch (str.hashCode()) {
            case -1820411228:
                if (str.equals("border-bottom-right-radius")) {
                    inlineTextShadowNode.setBorderRadius(3, c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case -1559879186:
                if (str.equals("vertical-align")) {
                    inlineTextShadowNode.setVerticalAlign(c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case -1032412580:
                if (str.equals("border-top-right-radius")) {
                    inlineTextShadowNode.setBorderRadius(2, c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case -20727064:
                if (str.equals("background-position")) {
                    inlineTextShadowNode.setBackgroundPosition(c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 605322756:
                if (str.equals("background-color")) {
                    inlineTextShadowNode.setBackgroundColor(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 609634231:
                if (str.equals("border-bottom-left-radius")) {
                    inlineTextShadowNode.setBorderRadius(4, c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 610793468:
                if (str.equals("background-image")) {
                    inlineTextShadowNode.setBackgroundImage(c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 881039699:
                if (str.equals("border-radius")) {
                    inlineTextShadowNode.setBorderRadius(0, c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 1266923840:
                if (str.equals("background-size")) {
                    inlineTextShadowNode.setBackgroundSize(c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 1466337535:
                if (str.equals("border-top-left-radius")) {
                    inlineTextShadowNode.setBorderRadius(1, c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 2005447450:
                if (str.equals("background-repeat")) {
                    inlineTextShadowNode.setBackgroundRepeat(c1311730kEt.LIZ(str));
                    return;
                }
                break;
        }
        super.LIZIZ(shadowNode, str, c1311730kEt);
    }
}
