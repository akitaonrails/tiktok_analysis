package com.ss.android.ugc.aweme.services.audio;

import X.C19EG;

/* JADX INFO: loaded from: classes30.dex */
public interface IVopPermissionService {
    boolean checkAllPermissionsGranted(int[] iArr);

    boolean checkAllPermissionsGranted(String[] strArr);

    boolean checkPermissionGranted(String str);

    int[] checkSelfPermissions(String[] strArr);

    void showRequestAudioSettingDialog(C19EG c19eg);
}
