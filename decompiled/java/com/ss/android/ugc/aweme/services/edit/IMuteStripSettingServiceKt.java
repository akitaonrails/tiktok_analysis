package com.ss.android.ugc.aweme.services.edit;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes.dex */
public final class IMuteStripSettingServiceKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CachedAutoMuteStripSettingStatus.values().length];
            try {
                iArr[CachedAutoMuteStripSettingStatus.ON.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CachedAutoMuteStripSettingStatus toCachedMuteStripSettingStatus(int i) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return CachedAutoMuteStripSettingStatus.DISABLED;
                    }
                    return CachedAutoMuteStripSettingStatus.ON;
                }
                return CachedAutoMuteStripSettingStatus.OFF;
            }
            return CachedAutoMuteStripSettingStatus.DISABLED;
        }
        return CachedAutoMuteStripSettingStatus.NOT_QUERIED;
    }

    public static final int toMob(CachedAutoMuteStripSettingStatus cachedAutoMuteStripSettingStatus) {
        if (cachedAutoMuteStripSettingStatus != null && WhenMappings.$EnumSwitchMapping$0[cachedAutoMuteStripSettingStatus.ordinal()] == 1) {
            return 1;
        }
        return 0;
    }
}
