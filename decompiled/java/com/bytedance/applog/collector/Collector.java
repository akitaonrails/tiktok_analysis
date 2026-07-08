package com.bytedance.applog.collector;

import X.C2188191AkT;
import X.C2209791BeD;
import X.C2209901BeO;
import X.C2209911BeP;
import X.C2210041Bec;
import X.C2210331Bf5;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.EnumC2210021Bea;
import X.EnumC2210371Bf9;
import X.EnumC2210541BfQ;
import X.EnumC2210591BfV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes35.dex */
public class Collector extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        String[] stringArrayExtra = intent.getStringArrayExtra("K_DATA");
        if (stringArrayExtra != null && stringArrayExtra.length > 0) {
            for (C2209901BeO c2209901BeO : (CopyOnWriteArrayList) C2209901BeO.LJLILLLLZI) {
                String[] strArr = (String[]) stringArrayExtra.clone();
                c2209901BeO.getClass();
                if (strArr.length != 0) {
                    for (int i = 0; i < strArr.length; i++) {
                    }
                    if (c2209901BeO.LJIILIIL == null) {
                        C2210041Bec c2210041Bec = c2209901BeO.LIZLLL;
                        synchronized (c2210041Bec.LIZIZ) {
                            try {
                                if (c2210041Bec.LIZIZ.size() > c2210041Bec.LIZJ) {
                                    String strPoll = c2210041Bec.LIZIZ.poll();
                                    c2210041Bec.LIZLLL.LJJZZI.LJ(0, C2210041Bec.LJ, "AppLogCache overflow2 remove data: {}", strPoll);
                                    c2210041Bec.LIZLLL.LJJJJLI.LIZIZ(EnumC2210021Bea.CACHE_DROP_EVENT_COUNT, 1);
                                    C2210331Bf5 c2210331Bf5 = C2210331Bf5.LJ;
                                    if (c2210331Bf5.LIZ) {
                                        c2210331Bf5.LIZJ(EnumC2210541BfQ.DataCollection, EnumC2210371Bf9.CacheOverflow, EnumC2210591BfV.Fatal, strPoll, null);
                                    }
                                }
                                c2210041Bec.LIZIZ.addAll(Arrays.asList(strArr));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    } else {
                        C2209911BeP c2209911BeP = c2209901BeO.LJIILIIL;
                        c2209911BeP.LLJILJILJ.removeMessages(4);
                        c2209911BeP.LLJILJILJ.obtainMessage(4, strArr).sendToTarget();
                    }
                }
            }
            return;
        }
        C2209791BeD.LJIJJ().LJII("Collector onReceive empty", new Object[0]);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
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
}
