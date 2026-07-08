package com.bytedance.sdui.compoents.svg;

import X.C1291290jhv;
import X.C1312390kFx;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class UISvg$$PropsSetter extends SDUIUI$$PropsSetter {
    @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.utils.SDUIUISetter
    public final void LIZ(SDUIBaseUI sDUIBaseUI, String str, C1291290jhv c1291290jhv) {
        C1312390kFx c1312390kFx = (C1312390kFx) sDUIBaseUI;
        str.getClass();
        if (!str.equals("src")) {
            if (!str.equals("content")) {
                super.LIZ(sDUIBaseUI, str, c1291290jhv);
                return;
            } else {
                c1312390kFx.setContent(c1291290jhv.LJI(str));
                return;
            }
        }
        c1312390kFx.setSource(c1291290jhv.LJI(str));
    }
}
