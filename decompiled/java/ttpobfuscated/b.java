package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum b {
    deviceIdChanged,
    userRegionChanged,
    invalidLogicFlow,
    invalidDeviceId,
    invalidUserId,
    notInitialised,
    invalidUserAction,
    invalidStateTransition;

    public static b valueOf(String str) {
        return (b) C08FF.LIZ(b.class, str);
    }
}
