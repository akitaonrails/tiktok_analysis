package com.ttnet.org.chromium.base;

import J.N;
import X.C08MY;
import X.C0WZX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C787230UuP;
import X.C789680UyM;
import X.C789700UyO;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import com.ttnet.org.chromium.base.PowerMonitor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class PowerMonitor {
    public static PowerMonitor LIZIZ;
    public static final C789700UyO LIZJ = new C789700UyO();
    public static C789680UyM LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public static String LJII;
    public static String LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static boolean LJIIJJI;
    public boolean LIZ;

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0UyM] */
    public static void LIZ() {
        if (LIZIZ != null) {
            return;
        }
        Context context = C787230UuP.LIZ;
        LIZIZ = new PowerMonitor();
        Intent intentLIZ = C787230UuP.LIZ(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentLIZ != null) {
            LIZIZ.LIZ = intentLIZ.getIntExtra("plugged", 0) == 0;
            N.MxETr4iO();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        C787230UuP.LIZ(context, new BroadcastReceiver() { // from class: X.0UyL
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    PowerMonitor.LIZIZ.LIZ = intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED");
                    N.MxETr4iO();
                } else {
                    C2408409cA.LIZ();
                    PowerMonitor.LIZIZ.LIZ = intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED");
                    N.MxETr4iO();
                }
            }
        }, intentFilter);
        LJIIIIZZ = context.getPackageName();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJIIIIZZ);
        sbLIZ.append(".cronet.APP_BACKGROUND");
        LJFF = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(LJIIIIZZ);
        sbLIZ2.append(".cronet.APP_FOREGROUND");
        LJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(LJIIIIZZ);
        sbLIZ3.append(".wschannel.APP_BACKGROUND");
        LJII = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(LJIIIIZZ);
        sbLIZ4.append(".wschannel.APP_FOREGROUND");
        LJI = C2188811AlT.LIZIZ(sbLIZ4);
        if (C08MY.LIZ(context) || LJIIJJI) {
            if (context instanceof Application) {
                C789700UyO c789700UyO = LIZJ;
                c789700UyO.LLILLJJLI = LIZIZ;
                ((Application) context).registerActivityLifecycleCallbacks(c789700UyO);
                return;
            }
            return;
        }
        LIZLLL = new BroadcastReceiver() { // from class: X.0UyM
            public static void LIZ(Intent intent) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String action = intent.getAction();
                if (!action.equals(PowerMonitor.LJ) && !action.equals(PowerMonitor.LJI)) {
                    if (action.equals(PowerMonitor.LJFF) || action.equals(PowerMonitor.LJII)) {
                        long j = jCurrentTimeMillis - PowerMonitor.LJIIJ;
                        PowerMonitor.LJIIJ = jCurrentTimeMillis;
                        if (j > 10000) {
                            N.MBffe1lF();
                            return;
                        }
                        return;
                    }
                    return;
                }
                long j2 = jCurrentTimeMillis - PowerMonitor.LJIIIZ;
                PowerMonitor.LJIIIZ = jCurrentTimeMillis;
                if (j2 <= 10000) {
                    return;
                }
                N.MyS7kauI();
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    LIZ(intent);
                } else {
                    C2408409cA.LIZ();
                    LIZ(intent);
                }
            }
        };
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(LJFF);
        intentFilter2.addAction(LJ);
        intentFilter2.addAction(LJII);
        intentFilter2.addAction(LJI);
        C787230UuP.LIZ(context, LIZLLL, intentFilter2);
    }

    public static int getCurrentThermalStatus() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        if (LIZIZ == null) {
            LIZ();
        }
        PowerManager powerManager = (PowerManager) C786410Ut5.H2(C787230UuP.LIZ, "power");
        if (powerManager == null) {
            return -1;
        }
        return powerManager.getCurrentThermalStatus();
    }

    public static int getRemainingBatteryCapacity() {
        if (LIZIZ == null) {
            LIZ();
        }
        return C2204961BRm.LL((BatteryManager) C786410Ut5.H2(C787230UuP.LIZ, "batterymanager"), 1, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb7UzFo87pdzP/0NcitmU1jlw==", null));
    }

    public static boolean isBatteryPower() {
        if (LIZIZ == null) {
            LIZ();
        }
        return LIZIZ.LIZ;
    }
}
