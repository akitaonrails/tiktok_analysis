package com.bytedance.ies.xelement.webview.api;

import X.C1311730kEt;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter;

/* JADX INFO: loaded from: classes34.dex */
public class LynxWebView$$PropsSetter extends UISimpleView$$PropsSetter {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.ui.UIGroup$$PropsSetter, com.lynx.tasm.behavior.ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public final void LIZ(LynxBaseUI lynxBaseUI, String str, C1311730kEt c1311730kEt) {
        LynxWebView lynxWebView = (LynxWebView) lynxBaseUI;
        str.getClass();
        switch (str.hashCode()) {
            case -995427962:
                if (str.equals("params")) {
                    lynxWebView.setParams(c1311730kEt.LJI(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxWebView.setSrc(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 3213227:
                if (str.equals("html")) {
                    lynxWebView.setHtmlString(c1311730kEt.LJII(str));
                    return;
                }
                break;
            case 1504731529:
                if (str.equals("enable-debug")) {
                    lynxWebView.setDebug(c1311730kEt.LIZIZ(str, false));
                    return;
                }
                break;
            case 1969817742:
                if (str.equals("webview-type")) {
                    lynxWebView.setWebViewType(c1311730kEt.LJII(str));
                    return;
                }
                break;
        }
        super.LIZ(lynxBaseUI, str, c1311730kEt);
    }
}
