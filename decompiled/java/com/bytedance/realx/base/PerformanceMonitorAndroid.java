package com.bytedance.realx.base;

import X.C0VSJ;
import X.C786410Ut5;
import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes21.dex */
public class PerformanceMonitorAndroid implements ComponentCallbacks2 {
    public static final FileFilter CPU_IDLE_STATE_FILTER = new FileFilter() { // from class: com.bytedance.realx.base.PerformanceMonitorAndroid.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("state")) {
                return false;
            }
            for (int i = 5; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    };
    public static int mCpuCoreCount = -1;
    public static int mCpuIdleStateCount = -1;
    public static int mThermalState = -1;
    public static int mMemoryState = 0;
    public static boolean mMemoryStateRegisterd = false;
    public static PerformanceMonitorAndroid mPerformanceMonitor = new PerformanceMonitorAndroid();

    public static int convertThermalState(int i) {
        switch (i) {
            case 0:
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
            case 6:
                return 3;
            default:
                return 4;
        }
    }

    public static int getCpuIdleStateCount() {
        int length = 0;
        try {
            File[] fileArrListFiles = new C0VSJ("/sys/devices/system/cpu/cpu0/cpuidle/").listFiles(CPU_IDLE_STATE_FILTER);
            if (fileArrListFiles != null) {
                length = fileArrListFiles.length;
                return length;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return length;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public static boolean getIfRoomsDevice() {
        return "a3382".equals(Build.MODEL.toLowerCase());
    }

    public static int getThermalState() {
        if (Build.VERSION.SDK_INT >= 29 && mThermalState == -1) {
            PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = new PowerManager.OnThermalStatusChangedListener() { // from class: com.bytedance.realx.base.PerformanceMonitorAndroid.2
                @Override // android.os.PowerManager.OnThermalStatusChangedListener
                public void onThermalStatusChanged(int i) {
                    PerformanceMonitorAndroid.mThermalState = PerformanceMonitorAndroid.convertThermalState(i);
                }
            };
            mThermalState = 4;
            PowerManager powerManager = (PowerManager) C786410Ut5.H2(ContextUtils.getApplicationContext(), "power");
            if (powerManager != null) {
                try {
                    int currentThermalStatus = powerManager.getCurrentThermalStatus();
                    mThermalState = currentThermalStatus;
                    mThermalState = convertThermalState(currentThermalStatus);
                    powerManager.addThermalStatusListener(onThermalStatusChangedListener);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return mThermalState;
                }
            }
        } else if (mThermalState == -1) {
            mThermalState = 4;
        }
        return mThermalState;
    }

    public static int getCurrentPidMemorySize() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(applicationContext, "activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static int getJavaAppMemoryUsage() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(applicationContext, "activity");
            if (activityManager == null) {
                return 0;
            }
            return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].dalvikPss;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static int getMemoryState() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return -1;
        }
        if (!mMemoryStateRegisterd) {
            applicationContext.registerComponentCallbacks(mPerformanceMonitor);
            mMemoryStateRegisterd = true;
        }
        return mMemoryState;
    }

    public static int getThreadCount() {
        return Thread.activeCount();
    }

    public static void setThermalState(int i) {
        mThermalState = i;
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i != 5) {
            if (i != 10) {
                if (i != 15) {
                    if (i != 20) {
                        if (i != 40) {
                            if (i != 60) {
                                if (i == 80) {
                                    mMemoryState = 7;
                                    return;
                                }
                                return;
                            }
                            mMemoryState = 6;
                            return;
                        }
                        mMemoryState = 5;
                        return;
                    }
                    mMemoryState = 4;
                    return;
                }
                mMemoryState = 3;
                return;
            }
            mMemoryState = 2;
            return;
        }
        mMemoryState = 1;
    }
}
