package com.ss.android.ugc.aweme.services;

import X.C577940Mlc;
import X.C577980Mlg;
import X.C578000Mli;
import X.InterfaceC537150L4v;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordBottomTabConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class InternalMaxDurationResolverImpl implements InterfaceC537150L4v {
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    @Override // X.InterfaceC537150L4v
    public long resolveMaxDurationFor3MinWithMusic(ShortVideoContext shortVideoContext, long j) {
        return j;
    }

    @Override // X.InterfaceC537150L4v
    public long getMaxShootingDuration() {
        if (C577940Mlc.LIZ() == 1) {
            return 600000L;
        }
        if (C577980Mlg.LIZ() != 0) {
            return 180000L;
        }
        return C578000Mli.LIZ();
    }

    @Override // X.InterfaceC537150L4v
    public long getMaxShootingDuration(int i) {
        if (i != 10) {
            if (i != 11) {
                if (i != 14) {
                    if (i != 16) {
                        if (i != 18) {
                            return getMaxShootingDuration();
                        }
                        return 600000L;
                    }
                    return 15000L;
                }
                return 180000L;
            }
            return C578000Mli.LIZ();
        }
        return 15000L;
    }

    @Override // X.InterfaceC537150L4v
    public long getMaxShootingDuration(boolean z, ShortVideoContext shortVideoContext) {
        RecordBottomTabConfig recordBottomTabConfig;
        Long l;
        if (shortVideoContext.LJJJJZ()) {
            return shortVideoContext.cameraComponentModel.mMaxDuration;
        }
        if (z) {
            RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null && (recordBottomTabConfig = recordPageOptionalConfig.recordBottomTabConfig) != null && (l = recordBottomTabConfig.maxVideoDuration) != null) {
                return l.longValue();
            }
            return 15000L;
        }
        int i = shortVideoContext.shootMode;
        if (i != 11) {
            if (i != 14) {
                if (i != 18) {
                    return getMaxShootingDuration();
                }
                return 600000L;
            }
            return 180000L;
        }
        return C578000Mli.LIZ();
    }
}
