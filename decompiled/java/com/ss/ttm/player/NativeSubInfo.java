package com.ss.ttm.player;

import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes24.dex */
public class NativeSubInfo extends SubInfo {
    public static boolean isNativeSubInfo(SubInfo subInfo) {
        return subInfo instanceof NativeSubInfo;
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubLoadFinished(int i) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubInfoCallback2(int i, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubLoadFinished2(int i, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubSwitchCompleted(int i, int i2) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubSwitchCompleted(int i, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }

    @Override // com.ss.ttm.player.SubInfo
    public final void onSubInfoCallback(int i, int i2, String str) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
