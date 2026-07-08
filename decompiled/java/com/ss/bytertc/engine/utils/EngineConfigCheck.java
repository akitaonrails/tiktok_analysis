package com.ss.bytertc.engine.utils;

import X.C0VSJ;
import android.text.TextUtils;
import com.ss.bytertc.engine.data.EngineConfig;

/* JADX INFO: loaded from: classes21.dex */
public class EngineConfigCheck {
    public static int checkValid(EngineConfig engineConfig) {
        if (TextUtils.isEmpty(engineConfig.appID)) {
            return 1;
        }
        if (!TextUtils.isEmpty(engineConfig.nativeLoadPath)) {
            C0VSJ c0vsj = new C0VSJ(engineConfig.nativeLoadPath);
            if (!c0vsj.exists() || !c0vsj.isDirectory()) {
                return 2;
            }
            return 0;
        }
        return 0;
    }
}
