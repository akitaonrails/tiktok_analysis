package com.lynx.tasm.base;

import X.C0VSJ;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.base.LynxNativeMemoryTracer;
import java.util.ArrayList;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class LynxNativeMemoryTracer {
    public static int LIZ = 1;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static int LIZLLL;

    public static native void nativeStartTracing(int i);

    public static native void nativeStopTracing();

    public static native void nativeWriteRecordsToFile(String str);

    public static void LIZJ() {
        if (LIZJ) {
            nativeStopTracing();
            LIZJ = false;
        }
    }

    public static void LIZ(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getPackageName());
        sbLIZ.append(e3.d);
        sbLIZ.append("LYNX_MEMORY_TRACING_START");
        intentFilter.addAction(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(context.getPackageName());
        sbLIZ2.append(e3.d);
        sbLIZ2.append("LYNX_MEMORY_TRACING_STOP");
        intentFilter.addAction(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(context.getPackageName());
        sbLIZ3.append(e3.d);
        sbLIZ3.append("LYNX_MEMORY_TRACING_REPORT");
        intentFilter.addAction(C2188811AlT.LIZIZ(sbLIZ3));
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.0UuS
            public static void LIZ(Context context2, Intent intent) {
                String strLIZIZ;
                if (intent.getAction().endsWith("LYNX_MEMORY_TRACING_START")) {
                    int intExtra = intent.getIntExtra("min_watched_size", -1);
                    if (intExtra > 0) {
                        LynxNativeMemoryTracer.LIZIZ(intExtra);
                        return;
                    } else {
                        LynxNativeMemoryTracer.LIZIZ(LynxNativeMemoryTracer.LIZ);
                        return;
                    }
                }
                if (intent.getAction().endsWith("LYNX_MEMORY_TRACING_STOP")) {
                    LynxNativeMemoryTracer.LIZJ();
                    return;
                }
                if (!intent.getAction().endsWith("LYNX_MEMORY_TRACING_REPORT")) {
                    return;
                }
                try {
                    strLIZIZ = intent.getStringExtra("report_dir");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (strLIZIZ == null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(C786410Ut5.y2(context2, null).getPath());
                    sbLIZ4.append("/memory-reports");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                }
                LynxNativeMemoryTracer.LIZLLL(strLIZIZ);
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(context2, intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(context2, intent);
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 34 && context.getApplicationInfo().targetSdkVersion >= 34) {
            C786410Ut5.LJIJJLI(context, broadcastReceiver, intentFilter, 4);
        } else {
            C786410Ut5.LJIJJ(context, broadcastReceiver, intentFilter);
        }
        LIZIZ = true;
    }

    public static void LIZIZ(int i) {
        if (!LIZIZ) {
            return;
        }
        LIZLLL = 0;
        nativeStartTracing(i);
        LIZJ = true;
    }

    public static void LIZLLL(String str) {
        if (!LIZJ) {
            return;
        }
        if (str != null) {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && !c0vsj.isDirectory()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" is not a directory");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("can not create directory '");
                sbLIZ2.append(str);
                sbLIZ2.append("'");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c0vsj.getPath());
            sbLIZ3.append("/lynx-native-memory-report-");
            sbLIZ3.append(LIZLLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            LIZLLL++;
            nativeWriteRecordsToFile(strLIZIZ);
            return;
        }
        throw new NullPointerException("filePath is null");
    }
}
