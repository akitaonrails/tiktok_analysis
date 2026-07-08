package com.ttnet.org.chromium.base;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C787230UuP;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class RadioUtils {
    public static Boolean LIZ;
    public static Boolean LIZIZ;

    public static int getCellDataActivity() {
        TraceEvent traceEventLIZ = TraceEvent.LIZ("RadioUtils::getCellDataActivity");
        try {
            try {
                int dataActivity = ((TelephonyManager) C786410Ut5.H2(C787230UuP.LIZ, "phone")).getDataActivity();
                if (traceEventLIZ != null) {
                    traceEventLIZ.close();
                }
                return dataActivity;
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
                if (traceEventLIZ == null) {
                    return -1;
                }
                traceEventLIZ.close();
                return -1;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (traceEventLIZ != null) {
                try {
                    traceEventLIZ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static int getCellSignalLevel() {
        TraceEvent traceEventLIZ = TraceEvent.LIZ("RadioUtils::getCellSignalLevel");
        try {
            int level = -1;
            try {
                SignalStrength signalStrength = ((TelephonyManager) C786410Ut5.H2(C787230UuP.LIZ, "phone")).getSignalStrength();
                if (signalStrength != null) {
                    level = signalStrength.getLevel();
                }
            } catch (SecurityException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (traceEventLIZ != null) {
                traceEventLIZ.close();
            }
            return level;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (traceEventLIZ != null) {
                try {
                    traceEventLIZ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static boolean isSupported() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        if (LIZ == null) {
            try {
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            boolean z = C787230UuP.LIZ.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
            LIZ = Boolean.valueOf(z);
        }
        if (!LIZ.booleanValue()) {
            return false;
        }
        if (LIZIZ == null) {
            try {
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            boolean z2 = C787230UuP.LIZ.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0;
            LIZIZ = Boolean.valueOf(z2);
        }
        return LIZIZ.booleanValue();
    }

    public static boolean isWifiConnected() {
        TraceEvent traceEventLIZ = TraceEvent.LIZ("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(C787230UuP.LIZ, "connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                if (traceEventLIZ != null) {
                    traceEventLIZ.close();
                }
                return false;
            }
            NetworkCapabilities networkCapabilitiesLJLJL = C2204961BRm.LJLJL(connectivityManager, activeNetwork, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb7UzFo87hT3/MSoc0MMsU=", null));
            if (networkCapabilitiesLJLJL == null) {
                if (traceEventLIZ != null) {
                    traceEventLIZ.close();
                }
                return false;
            }
            boolean zHasTransport = networkCapabilitiesLJLJL.hasTransport(1);
            if (traceEventLIZ != null) {
                traceEventLIZ.close();
            }
            return zHasTransport;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (traceEventLIZ != null) {
                try {
                    traceEventLIZ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
