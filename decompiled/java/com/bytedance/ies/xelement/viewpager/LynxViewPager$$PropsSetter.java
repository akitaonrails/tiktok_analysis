package com.bytedance.ies.xelement.viewpager;

import X.C1311730kEt;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager$$PropsSetter;
import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: loaded from: classes21.dex */
public class LynxViewPager$$PropsSetter extends BaseLynxViewPager$$PropsSetter {
    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager$$PropsSetter, com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxViewPager lynxViewPager = (LynxViewPager) lynxBaseUI;
        str.getClass();
        if (!str.equals("viewpager-dynamic")) {
            super.LIZ(lynxBaseUI, str, c1311730kEt);
        } else {
            lynxViewPager.setViewPagerDynamic(c1311730kEt.LIZIZ(str, false));
        }
    }
}
