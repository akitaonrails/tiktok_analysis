package com.bytedance.sdui.render.tasm.behavior.ui.view;

import X.C1291290jhv;
import X.C1299030juP;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class UIView$$PropsSetter extends UISimpleView$$PropsSetter {
    @Override // com.bytedance.sdui.render.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.UIGroup$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.utils.SDUIUISetter
    public void LIZ(SDUIBaseUI sDUIBaseUI, String str, C1291290jhv c1291290jhv) {
        C1299030juP c1299030juP = (C1299030juP) sDUIBaseUI;
        str.getClass();
        if (!str.equals("impression_id")) {
            super.LIZ(sDUIBaseUI, str, c1291290jhv);
        } else {
            c1299030juP.setImpressionId(c1291290jhv.LJI(str));
        }
    }
}
