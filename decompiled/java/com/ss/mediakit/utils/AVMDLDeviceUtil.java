package com.ss.mediakit.utils;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.StatFs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public class AVMDLDeviceUtil {
    public static String sBoard;
    public static String sHardware;

    public static boolean isOverHeat(Context context) {
        return false;
    }

    public static String getDeviceBoard() {
        try {
            if (sBoard == null) {
                sBoard = Build.BOARD;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sBoard = null;
        }
        return sBoard;
    }

    public static String getDeviceHardware() {
        try {
            if (sHardware == null) {
                sHardware = Build.HARDWARE;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            sHardware = null;
        }
        return sHardware;
    }

    public static StatFs getSdcardState() {
        if ("mounted".equals(C786410Ut5.X3())) {
            try {
                return new StatFs(C786410Ut5.W3().getPath());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static long getTotalFreeStorageKB() {
        StatFs sdcardState = getSdcardState();
        if (sdcardState != null) {
            return (((long) C2204961BRm.LLF(sdcardState, new C0WZX("dzBzEhEpEcfZUV4gThuQKInEsge4OKF2AGg20sJeOZQfRFDRhQ==", null))) * ((long) C2204961BRm.LLI(sdcardState, new C0WZX("dzBzEhEpEcfZUV4gThuQKInEsge4OKF2AGg20sJeOZQfRFDRhQ==", null)))) / 1024;
        }
        return 0L;
    }

    public static long getTotalStorageSpaceKB() {
        StatFs sdcardState = getSdcardState();
        if (sdcardState != null) {
            return (C2204961BRm.LLIFFJFJJ(sdcardState, new C0WZX("dzBzEhEpEcfZUV4gThuQKInEsge4OKF2AGg20sJeOZQfRFDRhQ==", null)) * C2204961BRm.LLFZ(sdcardState, new C0WZX("dzBzEhEpEcfZUV4gThuQKInEsge4OKF2AGg20sJeOZQfRFDRhQ==", null))) / 1024;
        }
        return 0L;
    }

    public static String getDeviceModel() {
        return Build.MODEL;
    }

    public static int getBatteryPercentage(Context context) {
        if (context == null) {
            return 0;
        }
        return C2204961BRm.LL((BatteryManager) C786410Ut5.H2(context, "batterymanager"), 4, new C0WZX("dzBzEhEpEcfZUV4gThuQKInEsge4OKF2AGg20sJeOZQfRFDRhQ==", null));
    }

    public static HashMap<String, Object> getChargingState(Context context) {
        Intent intentLJIJJ;
        int i;
        if (context == null || (intentLJIJJ = C786410Ut5.LJIJJ(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return null;
        }
        int intExtra = intentLJIJJ.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
        if (intExtra != 2 && intExtra != 5) {
            i = 0;
        } else {
            i = 1;
        }
        int intExtra2 = intentLJIJJ.getIntExtra("plugged", -1);
        int intExtra3 = (intentLJIJJ.getIntExtra("level", -1) * 100) / intentLJIJJ.getIntExtra("scale", -1);
        HashMap<String, Object> map = new HashMap<>(3);
        map.put("isCharging", Integer.valueOf(i));
        map.put("chargePlug", Integer.valueOf(intExtra2));
        map.put("power", Integer.valueOf(intExtra3));
        return map;
    }

    public static boolean isPowerSaveMode(Context context) {
        if (context != null) {
            try {
                PowerManager powerManager = (PowerManager) C786410Ut5.H2(context, "power");
                if (powerManager != null) {
                    return powerManager.isPowerSaveMode();
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }
}
