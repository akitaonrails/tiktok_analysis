package com.bytedance.sdui.components.list;

import X.C1291290jhv;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.behavior.ui.UIGroup$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class SDUIList$$PropsSetter extends UIGroup$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdui.render.tasm.behavior.ui.UIGroup$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.utils.SDUIUISetter
    public final void LIZ(SDUIBaseUI sDUIBaseUI, String str, C1291290jhv c1291290jhv) {
        a aVar = (a) sDUIBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -1571036001:
                if (str.equals("lower-threshold")) {
                    aVar.setLowerThreshold(c1291290jhv.LIZLLL(str));
                    return;
                }
                break;
            case -1554128936:
                if (str.equals("column-count")) {
                    aVar.setColumnCount(c1291290jhv.LJFF(str, 0));
                    return;
                }
                break;
            case -1270238455:
                if (str.equals("list-type")) {
                    aVar.setListType(c1291290jhv.LJI(str));
                    return;
                }
                break;
            case 2083253753:
                if (str.equals("vertical-orientation")) {
                    aVar.setVerticalOrientation(c1291290jhv.LIZIZ(str, true));
                    return;
                }
                break;
        }
        super.LIZ(sDUIBaseUI, str, c1291290jhv);
    }
}
