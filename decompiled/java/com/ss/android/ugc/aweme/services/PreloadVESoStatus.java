package com.ss.android.ugc.aweme.services;

import X.C08FF;
import X.C1954807lC;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes28.dex */
public final class PreloadVESoStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PreloadVESoStatus[] $VALUES;
    public static final PreloadVESoStatus UNLOAD = new PreloadVESoStatus("UNLOAD", 0);
    public static final PreloadVESoStatus LOADING = new PreloadVESoStatus("LOADING", 1);
    public static final PreloadVESoStatus LOADED = new PreloadVESoStatus("LOADED", 2);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreloadVESoStatus.values().length];
            try {
                iArr[PreloadVESoStatus.UNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[PreloadVESoStatus.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[PreloadVESoStatus.LOADED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ PreloadVESoStatus[] $values() {
        return new PreloadVESoStatus[]{UNLOAD, LOADING, LOADED};
    }

    public static InterfaceC2044707zh<PreloadVESoStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        PreloadVESoStatus[] preloadVESoStatusArr$values = $values();
        $VALUES = preloadVESoStatusArr$values;
        $ENTRIES = new C2254308sP(preloadVESoStatusArr$values);
    }

    public static PreloadVESoStatus[] values() {
        return (PreloadVESoStatus[]) $VALUES.clone();
    }

    public final int toStatusCode() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 0;
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        return 1;
    }

    public static PreloadVESoStatus valueOf(String str) {
        return (PreloadVESoStatus) C08FF.LIZ(PreloadVESoStatus.class, str);
    }

    public PreloadVESoStatus(String str, int i) {
    }
}
