package com.bytedance.xelement.markdown;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class MarkdownUI$$PropsSetter extends UIGroup$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        MarkdownUI markdownUI = (MarkdownUI) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1157887457:
                if (str.equals("selection-handle-color")) {
                    markdownUI.setSelectionHandleColor(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -1145258555:
                if (str.equals("selection-handle-size")) {
                    markdownUI.setSelectionHandleSize(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case -412316625:
                if (str.equals("markdown-effect")) {
                    markdownUI.setMarkdownEffect(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 263767276:
                if (str.equals("text-selection")) {
                    markdownUI.setEnableTextSelection(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1137695781:
                if (str.equals("selection-background-color")) {
                    markdownUI.setSelectionBackgroundColor(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 1257322832:
                if (str.equals("text-mark-attachments")) {
                    markdownUI.setTextMarkAttachments(c1311730kEt.LIZ(str));
                    return;
                }
                break;
            case 1916500116:
                if (str.equals("enable-region-view")) {
                    markdownUI.setVSyncAnimation(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
