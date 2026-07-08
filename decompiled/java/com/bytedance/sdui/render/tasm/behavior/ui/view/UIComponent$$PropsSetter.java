package com.bytedance.sdui.render.tasm.behavior.ui.view;

import X.C1291290jhv;
import X.C1314690kJf;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class UIComponent$$PropsSetter extends UIView$$PropsSetter {
    @Override // com.bytedance.sdui.render.tasm.behavior.ui.view.UIView$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.UIGroup$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI$$PropsSetter, com.bytedance.sdui.render.tasm.behavior.utils.SDUIUISetter
    public final void LIZ(SDUIBaseUI sDUIBaseUI, String str, C1291290jhv c1291290jhv) {
        C1314690kJf c1314690kJf = (C1314690kJf) sDUIBaseUI;
        str.getClass();
        if (!str.equals("item-key")) {
            super.LIZ(sDUIBaseUI, str, c1291290jhv);
        } else {
            c1314690kJf.setItemKey(c1291290jhv.LJI(str));
        }
    }
}
