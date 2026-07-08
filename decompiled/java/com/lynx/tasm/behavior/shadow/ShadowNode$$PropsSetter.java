package com.lynx.tasm.behavior.shadow;

import X.C1311730kEt;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;

/* JADX INFO: loaded from: classes21.dex */
public class ShadowNode$$PropsSetter implements ShadowNodeSetter<ShadowNode> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
    public void LIZIZ(ShadowNode shadowNode, String str, C1311730kEt c1311730kEt) {
        str.getClass();
        switch (str.hashCode()) {
            case -1559879186:
                if (str.equals("vertical-align")) {
                    shadowNode.setVerticalAlign(c1311730kEt.LIZ(str));
                }
                break;
            case -992853731:
                if (str.equals("ignore-focus")) {
                    shadowNode.setIgnoreFocus(c1311730kEt.LIZLLL(str));
                }
                break;
            case -804847959:
                if (str.equals("pointer-events")) {
                    shadowNode.setPointerEvents(c1311730kEt.LJFF(str, 0));
                }
                break;
            case 856740501:
                if (str.equals("enable-touch-pseudo-propagation")) {
                    shadowNode.setEventThroughPropagation(c1311730kEt.LIZLLL(str));
                }
                break;
            case 1443214456:
                if (str.equals("dataset")) {
                    shadowNode.setDataset(c1311730kEt.LJI(str));
                }
                break;
            case 2100930194:
                if (str.equals("event-through")) {
                    shadowNode.setEventThrough(c1311730kEt.LIZLLL(str));
                }
                break;
        }
    }
}
