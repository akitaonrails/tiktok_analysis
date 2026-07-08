package com.bytedance.realx.base;

import X.C0WZX;
import X.C2188191AkT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class PowerMonitorAndroid {
    public static String TAG = "PowerMonitorAndroid";
    public static Intent batteryStatus;
    public static IntentFilter ifilter;
    public static PowerManager powerManager;
    public static Context context = ContextUtils.getApplicationContext();
    public static float batteryVolt = -1.0f;
    public static BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.bytedance.realx.base.PowerMonitorAndroid.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            com_bytedance_realx_base_PowerMonitorAndroid$1_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context2, intent);
        }

        public void com_bytedance_realx_base_PowerMonitorAndroid$1__onReceive$___twin___(Context context2, Intent intent) {
            PowerMonitorAndroid.mChargeStatus = intent.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
            PowerMonitorAndroid.mBatteryTemperature = intent.getIntExtra("temperature", -1);
            PowerMonitorAndroid.mBatteryLevel = intent.getIntExtra("level", -1);
        }

        public static void com_bytedance_realx_base_PowerMonitorAndroid$1_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AnonymousClass1 anonymousClass1, Context context2, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                anonymousClass1.com_bytedance_realx_base_PowerMonitorAndroid$1__onReceive$___twin___(context2, intent);
            } else {
                C2408409cA.LIZ();
                anonymousClass1.com_bytedance_realx_base_PowerMonitorAndroid$1__onReceive$___twin___(context2, intent);
            }
        }

        public static void com_bytedance_realx_base_PowerMonitorAndroid$1_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AnonymousClass1 anonymousClass1, Context context2, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            com_bytedance_realx_base_PowerMonitorAndroid$1_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(anonymousClass1, context2, intent);
        }
    };
    public static BroadcastReceiver batterySaverReceiver = new BroadcastReceiver() { // from class: com.bytedance.realx.base.PowerMonitorAndroid.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context2, Intent intent) {
            com_bytedance_realx_base_PowerMonitorAndroid$2_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context2, intent);
        }

        public void com_bytedance_realx_base_PowerMonitorAndroid$2__onReceive$___twin___(Context context2, Intent intent) {
            if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                try {
                    PowerMonitorAndroid.mBatterySaveMode = Settings.System.getInt(context2.getContentResolver(), "POWER_SAVE_MODE_OPEN");
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                PowerMonitorAndroid.mBatterySaveMode = PowerMonitorAndroid.powerManager.isPowerSaveMode() ? 1 : 0;
            }
        }

        public static void com_bytedance_realx_base_PowerMonitorAndroid$2_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(AnonymousClass2 anonymousClass2, Context context2, Intent intent) {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                anonymousClass2.com_bytedance_realx_base_PowerMonitorAndroid$2__onReceive$___twin___(context2, intent);
            } else {
                C2408409cA.LIZ();
                anonymousClass2.com_bytedance_realx_base_PowerMonitorAndroid$2__onReceive$___twin___(context2, intent);
            }
        }

        public static void com_bytedance_realx_base_PowerMonitorAndroid$2_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(AnonymousClass2 anonymousClass2, Context context2, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            com_bytedance_realx_base_PowerMonitorAndroid$2_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(anonymousClass2, context2, intent);
        }
    };
    public static int mCpuCoreCount = -1;
    public static int mChargeStatus = -1;
    public static int mBatteryLevel = -1;
    public static int mBatteryTemperature = -1;
    public static int mBatterySaveMode = -1;
    public static BatteryManager batteryManager = (BatteryManager) C786410Ut5.H2(context, "batterymanager");

    public static int getBatteryCurrentCapacity() {
        try {
            BatteryManager batteryManager2 = batteryManager;
            if (batteryManager2 != null) {
                int iLLD = ((int) C2204961BRm.LLD(batteryManager2, 1, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8qB8hM2WGVxirn8Si2CODsXigYk=", null))) / LSPassThroughRecordSizeConfig.DEFAULT;
                if (iLLD >= 0) {
                    return iLLD;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return -1;
    }

    public static int getBatteryMaxCapacity() {
        return 0;
    }

    public static int getBatterySaveStatus() {
        try {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase("Xiaomi") && powerManager != null && mBatterySaveMode == -1) {
                mBatterySaveMode = Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN");
                C786410Ut5.LJIJJ(context, batterySaverReceiver, new IntentFilter("miui.intent.action.POWER_SAVE_MODE_CHANGED"));
            } else {
                if (str.equalsIgnoreCase("Huawei")) {
                    if (Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) {
                        mBatterySaveMode = 1;
                    } else {
                        mBatterySaveMode = 0;
                    }
                } else if (powerManager != null && mBatterySaveMode == -1) {
                    C786410Ut5.LJIJJ(context, batterySaverReceiver, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                    mBatterySaveMode = powerManager.isPowerSaveMode() ? 1 : 0;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mBatterySaveMode = -1;
        }
        return mBatterySaveMode;
    }

    public static int getVoltage() {
        return -1;
    }

    public static int getBatteryDesignCapacity() {
        int iRound = 0;
        try {
            iRound = (int) Math.round(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context), new Object[0])).doubleValue());
            return iRound;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return iRound;
        }
    }

    public static int getBatteryLevel() {
        try {
            BatteryManager batteryManager2 = batteryManager;
            if (batteryManager2 != null && mBatteryLevel == -1) {
                mBatteryLevel = C2204961BRm.LL(batteryManager2, 4, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8qB8hM2WGVxirn8Si2CODsXigYk=", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return mBatteryLevel;
    }

    public static int getBatteryTemperature() {
        return mBatteryTemperature / 10;
    }

    public static int getChargeStatus() {
        BatteryManager batteryManager2;
        try {
            if (Build.VERSION.SDK_INT >= 26 && (batteryManager2 = batteryManager) != null && mChargeStatus == -1) {
                mChargeStatus = C2204961BRm.LL(batteryManager2, 6, new C0WZX("dzBzEgAjS8/YVFkiQFyWY7qJUjhlW4WN8qB8hM2WGVxirn8Si2CODsXigYk=", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        int i = mChargeStatus;
        return (i == 5 || i == 2) ? 1 : 0;
    }

    public static int getScreenBrightness() {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            return -1;
        }
        return (int) ((((double) Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1)) / 255.0d) * 100.0d);
    }

    static {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ifilter = intentFilter;
        batteryStatus = C786410Ut5.LJIJJ(context, mBroadcastReceiver, intentFilter);
        powerManager = (PowerManager) C786410Ut5.H2(context, "power");
    }
}
