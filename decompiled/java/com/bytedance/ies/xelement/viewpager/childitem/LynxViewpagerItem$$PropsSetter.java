package com.bytedance.ies.xelement.viewpager.childitem;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxViewpagerItem$$PropsSetter extends UIGroup$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
        str.getClass();
        if (!str.equals("tag")) {
            super.LIZ(lynxBaseUI, str, c1311730kEt);
        } else {
            lynxViewpagerItem.setTag(c1311730kEt.LJII(str));
        }
    }
}
