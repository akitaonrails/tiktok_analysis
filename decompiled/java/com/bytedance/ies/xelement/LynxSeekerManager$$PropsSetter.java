package com.bytedance.ies.xelement;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter;

/* JADX INFO: loaded from: classes21.dex */
public class LynxSeekerManager$$PropsSetter extends LynxUI$$PropsSetter {
    @Override // com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxSeekerManager lynxSeekerManager = (LynxSeekerManager) lynxBaseUI;
        str.getClass();
        if (!str.equals("duration")) {
            if (!str.equals("currentDuration")) {
                super.LIZ(lynxBaseUI, str, c1311730kEt);
                return;
            } else {
                lynxSeekerManager.setProgress(c1311730kEt.LJFF(str, 0));
                return;
            }
        }
        lynxSeekerManager.setDuration(c1311730kEt.LJFF(str, 0));
    }
}
