package com.ss.videoarch.live.ttquic;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C838410Wul;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.live.ttquic.NetworkChangeNotifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class NetworkChangeNotifier {
    public static ConnectivityManager mConnectivityManager;
    public static String mCurrentNetworkType;
    public static boolean mStartDefaultNetworkChangeMonitor;

    public static native int nativeOnNetworkChange(String str, String[] strArr);

    public static void startNetworkChangeMonitor() {
        try {
            if (init(ContextUtils.getApplicationContext()) && !mStartDefaultNetworkChangeMonitor) {
                mConnectivityManager.registerDefaultNetworkCallback(new ConnectivityManager.NetworkCallback() { // from class: X.0Uyd
                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onAvailable(Network network) {
                        NetworkChangeNotifier.handleDefaultNetworkChange(true, network);
                    }

                    @Override // android.net.ConnectivityManager.NetworkCallback
                    public final void onLost(Network network) {
                        NetworkChangeNotifier.handleDefaultNetworkChange(false, network);
                    }
                });
                mStartDefaultNetworkChangeMonitor = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static boolean init(Context context) {
        try {
            if (mConnectivityManager != null) {
                return true;
            }
            if (context == null || Build.VERSION.SDK_INT < 24 || C838410Wul.LIZ(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                return false;
            }
            if (mConnectivityManager == null) {
                mConnectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
            }
            if (mConnectivityManager == null) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void handleDefaultNetworkChange(boolean z, Network network) {
        if (network != null && z) {
            try {
                NetworkInfo networkInfoZ4 = C786410Ut5.z4(mConnectivityManager, network);
                if (networkInfoZ4 != null && !TextUtils.isEmpty(C2204961BRm.LJLLJ(networkInfoZ4, new C0WZX("dzBzEhEpEdzVUVIuRACHbhhZGc9UDTfRtVuWgbU09Hbf6AgsOWNcNOtJEj5mghXEl+w=", null)))) {
                    String strLJLLJ = C2204961BRm.LJLLJ(networkInfoZ4, new C0WZX("dzBzEhEpEdzVUVIuRACHbhhZGc9UDTfRtVuWgbU09Hbf6AgsOWNcNOtJEj5mghXEl+w=", null));
                    ArrayList arrayList = new ArrayList();
                    String str = mCurrentNetworkType;
                    if (str != null && !TextUtils.equals(strLJLLJ, str)) {
                        nativeOnNetworkChange(strLJLLJ, (String[]) arrayList.toArray(new String[0]));
                    }
                    mCurrentNetworkType = strLJLLJ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
