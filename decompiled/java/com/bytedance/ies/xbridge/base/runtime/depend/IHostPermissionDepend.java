package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;

/* JADX INFO: loaded from: classes29.dex */
public interface IHostPermissionDepend {
    boolean hasPermission(Activity activity, String str);

    void requestPermission(Activity activity, OnPermissionGrantCallback onPermissionGrantCallback, String str, Cert cert);

    void requestPermissions(Activity activity, OnPermissionsGrantCallback onPermissionsGrantCallback, String[] strArr, Cert cert);
}
