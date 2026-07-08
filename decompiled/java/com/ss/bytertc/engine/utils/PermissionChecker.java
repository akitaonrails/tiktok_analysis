package com.ss.bytertc.engine.utils;

import X.C838410Wul;
import com.bytedance.realx.base.ContextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class PermissionChecker {
    public static boolean checkAudioPermission() {
        return C838410Wul.LIZ(ContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0;
    }

    public static boolean checkCameraPermission() {
        return C838410Wul.LIZ(ContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0;
    }
}
