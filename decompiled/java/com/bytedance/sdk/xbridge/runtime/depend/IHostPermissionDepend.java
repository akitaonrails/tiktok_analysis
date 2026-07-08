package com.bytedance.sdk.xbridge.runtime.depend;

import X.InterfaceC1294060jmO;
import android.app.Activity;

/* JADX INFO: loaded from: classes24.dex */
public interface IHostPermissionDepend {
    boolean hasPermission(Activity activity, String str);

    @InterfaceC1294060jmO
    void requestPermission(Activity activity, OnPermissionGrantCallback onPermissionGrantCallback, String str);

    void requestPermissions(Activity activity, OnPermissionsGrantCallback onPermissionsGrantCallback, String[] strArr, HybridPermissionCert hybridPermissionCert);
}
