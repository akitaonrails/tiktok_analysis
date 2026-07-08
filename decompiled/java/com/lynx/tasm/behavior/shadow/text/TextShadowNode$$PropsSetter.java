package com.lynx.tasm.behavior.shadow.text;

import X.C1311730kEt;
import com.lynx.tasm.behavior.shadow.ShadowNode;

/* JADX INFO: loaded from: classes21.dex */
public class TextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        TextShadowNode textShadowNode = (TextShadowNode) shadowNode;
        str.getClass();
        switch (str.hashCode()) {
            case -1801128308:
                if (str.equals("tail-color-convert")) {
                    textShadowNode.setEnableTailColorConvert(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1215680224:
                if (str.equals("line-height")) {
                    textShadowNode.setLineHeight(c1311730kEt.LJ(str, 1.0E21f));
                    return;
                }
                break;
            case -356469693:
                if (str.equals("-x-auto-font-size")) {
                    textShadowNode.setAutoFontSize(c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 679001436:
                if (str.equals("enable-full-justify")) {
                    textShadowNode.setEnableFullJustify(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1381862785:
                if (str.equals("hyphens")) {
                    textShadowNode.setHyphen(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 1713623170:
                if (str.equals("text-single-line-vertical-align")) {
                    textShadowNode.setVerticalTextAlign(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 2010704238:
                if (str.equals("-x-auto-font-size-preset-sizes")) {
                    textShadowNode.setAutoFontSizePresetSizes(c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 2050754629:
                if (str.equals("-x-auto-font-size-line-ranges")) {
                    textShadowNode.setAutoFontSizeLineRanges(c1311730kEt.LIZ(str));
                    return;
                }
                break;
        }
        super.LIZIZ(shadowNode, str, c1311730kEt);
    }
}
