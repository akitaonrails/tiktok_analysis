package com.bytedance.android.livesdk.livesetting.other;

import X.C0V19;
import X.C1161920gLG;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.ApplogFlushOpt;
import com.bytedance.android.livesdk.livesetting.other.AppLogFlushOptSetting;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.applog.AppLog;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("ttlive_applog_flush_opt")
public final class AppLogFlushOptSetting {
    public static boolean isHasTriggerGapFlush;
    public static int watchCount;
    public static final AppLogFlushOptSetting INSTANCE = new AppLogFlushOptSetting();
    public static final ApplogFlushOpt DEFAULT = new ApplogFlushOpt();
    public static final Handler handlerLeave = new BPEAHandler(Looper.getMainLooper());
    public static final Handler handlerNormal = new BPEAHandler(Looper.getMainLooper());

    public final void release() {
        watchCount = 0;
        isHasTriggerGapFlush = false;
        handlerNormal.removeCallbacksAndMessages(null);
    }

    private final void watchCountPlusOne() {
        watchCount++;
    }

    public final void gapTimeFlush() {
        if (isHasTriggerGapFlush) {
            return;
        }
        isHasTriggerGapFlush = true;
        triggerGapFlush();
    }

    public final ApplogFlushOpt getValue() {
        return (ApplogFlushOpt) SettingsManager.INSTANCE.getValueSafely("ttlive_applog_flush_opt", DEFAULT);
    }

    private final long flushGapTime() {
        ApplogFlushOpt value = getValue();
        if (value != null) {
            return value.flushGapDuration;
        }
        return 0L;
    }

    private final boolean isBackgroundFlush() {
        ApplogFlushOpt value;
        return isOpt() && (value = getValue()) != null && value.flushBackgroundType > 0;
    }

    private final boolean isGapFlush() {
        return isOpt() && flushGapTime() > 0;
    }

    private final boolean isLeaveRoomFlush() {
        ApplogFlushOpt value;
        return isOpt() && (value = getValue()) != null && value.flushLeaveRoomType > 0;
    }

    private final boolean isWatchRoomFlush() {
        return isOpt() && watchCount > 1 && watchRoomFlushType() > 0 && (watchCount - 1) % watchRoomFlushType() == 0;
    }

    private final long leaveRoomDelayTime() {
        ApplogFlushOpt value = getValue();
        if (value != null) {
            return value.flushLeaveRoomDelayDuration;
        }
        return 0L;
    }

    private final long watchRoomDelayTime() {
        ApplogFlushOpt value = getValue();
        if (value != null) {
            return value.flushWatchRoomDelayDuration;
        }
        return 0L;
    }

    private final int watchRoomFlushType() {
        ApplogFlushOpt value = getValue();
        if (value != null) {
            return value.flushWatchRoomType;
        }
        return 0;
    }

    public final void backgroundFlush() {
        if (isBackgroundFlush() && ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).isAppBackground()) {
            flushAppLog();
        }
    }

    public final void flushAppLog() {
        if (isOpt()) {
            if (AppLogFlushTeaThreadFixExp.INSTANCE.isEnable()) {
                AppLog.flushAsync();
            } else {
                C0V19.LIZJ().LIZIZ(new Runnable() { // from class: X.0IKV
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AppLogFlushOptSetting@8170.flushAppLog$1");
                        try {
                            try {
                                com.ss.android.common.applog.AppLog.flush();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("flushWhenSlideUp catch error");
                                sbLIZ.append(e.getMessage());
                                C20441214yg.LJ("AppLogFlushOptSetting", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AppLogFlushOptSetting@8170.flushAppLog$1");
                    }
                });
            }
        }
    }

    public final boolean isOpt() {
        ApplogFlushOpt value = getValue();
        if (value != null) {
            return value.isOpt;
        }
        return false;
    }

    public final boolean isReportOpt() {
        ApplogFlushOpt value = getValue();
        if (value != null) {
            return value.isReportOpt;
        }
        return false;
    }

    public final void leaveRoomFlush() {
        if (isLeaveRoomFlush()) {
            Handler handler = handlerLeave;
            handler.removeCallbacksAndMessages(null);
            C786410Ut5.LJLIIL(leaveRoomDelayTime(), handler, new Runnable() { // from class: X.0IJi
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AppLogFlushOptSetting@8170.leaveRoomFlush$1");
                    try {
                        AppLogFlushOptSetting.INSTANCE.flushAppLog();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AppLogFlushOptSetting@8170.leaveRoomFlush$1");
                }
            });
        }
    }

    public final void triggerGapFlush() {
        if (isGapFlush()) {
            Handler handler = handlerNormal;
            handler.removeCallbacksAndMessages(null);
            C786410Ut5.LJLIIL(flushGapTime(), handler, new Runnable() { // from class: X.0IJh
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AppLogFlushOptSetting@8170.triggerGapFlush$1");
                    try {
                        AppLogFlushOptSetting appLogFlushOptSetting = AppLogFlushOptSetting.INSTANCE;
                        appLogFlushOptSetting.flushAppLog();
                        appLogFlushOptSetting.triggerGapFlush();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AppLogFlushOptSetting@8170.triggerGapFlush$1");
                }
            });
        }
    }

    public final void watchRoomFlush() {
        watchCountPlusOne();
        if (isWatchRoomFlush()) {
            C786410Ut5.LJLIIL(watchRoomDelayTime(), handlerNormal, new Runnable() { // from class: X.0IJg
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AppLogFlushOptSetting@8170.watchRoomFlush$1");
                    try {
                        AppLogFlushOptSetting.INSTANCE.flushAppLog();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AppLogFlushOptSetting@8170.watchRoomFlush$1");
                }
            });
        }
    }

    public final ApplogFlushOpt getDEFAULT() {
        return DEFAULT;
    }
}
