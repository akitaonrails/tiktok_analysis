package com.bytedance.ies.xelement;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter;

/* JADX INFO: loaded from: classes34.dex */
public class LynxPullRefreshView$$PropsSetter extends UIGroup$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxPullRefreshView lynxPullRefreshView = (LynxPullRefreshView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -2113012155:
                if (str.equals("enable-loadmore")) {
                    lynxPullRefreshView.setEnableLoadMore(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case -2024299963:
                if (str.equals("detect-scrollchild")) {
                    lynxPullRefreshView.setDetectScrollChild(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case -1813223279:
                if (str.equals("enable-refresh")) {
                    lynxPullRefreshView.setEnableRefresh(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
            case 470254793:
                if (str.equals("setting-flag")) {
                    lynxPullRefreshView.setSetingsFlag(c1311730kEt.LJFF(str, 0));
                    return;
                }
                break;
            case 886566095:
                if (str.equals("enable-auto-loadmore")) {
                    lynxPullRefreshView.setEnableAutoLoadMore(c1311730kEt.LIZIZ(str, true));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
