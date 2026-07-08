package com.bytedance.ies.xbridge.base.runtime.depend;

import X.C1059860dge;
import X.C1871070yn3;
import X.C1871140ynA;
import X.C1871660yo0;

/* JADX INFO: loaded from: classes29.dex */
public interface IHostStyleUIDepend {
    public static final C1871660yo0 Companion = new Object() { // from class: X.0yo0
    };

    Boolean hideLoading(C1871140ynA c1871140ynA, C1059860dge c1059860dge);

    Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener);

    Boolean showDialog(DialogBuilder dialogBuilder);

    Boolean showLoading(C1871070yn3 c1871070yn3, C1059860dge c1059860dge);

    Boolean showToast(ToastBuilder toastBuilder, C1059860dge c1059860dge);
}
