package com.ss.bduploader.net;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class NetUtils {
    public static String getNetExtraInfo(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return null;
            }
            return C2204961BRm.LJLJLLL(networkInfo, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5m3p9pTMOmFBzjujZ", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static int getNetType(Context context) {
        try {
            NetworkInfo networkInfo = getNetworkInfo(context);
            if (networkInfo == null || !networkInfo.isAvailable()) {
                return -1;
            }
            return C2204961BRm.LJLLILLLL(networkInfo, new C0WZX("dzBzEhEpEcjYQEctShOAYxA5m3p9pTMOmFBzjujZ", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public static NetworkInfo getNetworkInfo(Context context) {
        try {
            return C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
