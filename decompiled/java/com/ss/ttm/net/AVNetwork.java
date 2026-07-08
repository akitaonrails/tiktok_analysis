package com.ss.ttm.net;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class AVNetwork {
    public static int getNetworkType(Context context) {
        NetworkInfo networkInfoLJIJ;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
            if (connectivityManager == null || (networkInfoLJIJ = C786410Ut5.LJIJ(connectivityManager)) == null) {
                return 0;
            }
            int iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEd7IWBkvQAbKR8WVR19ZunXv", null));
            if (iLJLLILLLL == 1) {
                return 1;
            }
            if (iLJLLILLLL != 0) {
                return 0;
            }
            return 2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }
}
