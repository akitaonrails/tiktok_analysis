package com.ss.ttm.player;

import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes24.dex */
public class NativeMaskInfo extends MaskInfo {
    public static boolean isNativeMaskInfo(MaskInfo maskInfo) {
        return maskInfo instanceof NativeMaskInfo;
    }

    @Override // com.ss.ttm.player.MaskInfo
    public final void onMaskInfoCallback(int i, int i2, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
