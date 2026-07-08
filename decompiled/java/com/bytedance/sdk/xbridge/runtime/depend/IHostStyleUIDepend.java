package com.bytedance.sdk.xbridge.runtime.depend;

import X.C1872620ypY;
import X.C1872770ypn;
import X.InterfaceC634840OvC;
import android.app.Activity;

/* JADX INFO: loaded from: classes29.dex */
public interface IHostStyleUIDepend {
    Boolean hideLoading(C1872620ypY c1872620ypY, InterfaceC634840OvC interfaceC634840OvC);

    void setPageNaviStyle(InterfaceC634840OvC interfaceC634840OvC, Activity activity, PageTitleBar pageTitleBar);

    Boolean showDialog(DialogBuilder dialogBuilder);

    Boolean showLoading(C1872770ypn c1872770ypn, InterfaceC634840OvC interfaceC634840OvC);

    Boolean showToast(ToastBuilder toastBuilder, InterfaceC634840OvC interfaceC634840OvC);
}
