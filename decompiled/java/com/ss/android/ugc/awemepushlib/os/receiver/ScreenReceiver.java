package com.ss.android.ugc.awemepushlib.os.receiver;

import X.C1C7U;
import X.C2179971ATj;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class ScreenReceiver extends BroadcastReceiver {
    public static String sExtra = null;
    public static int sFrom = -1;
    public static String sMsg;
    public Handler mHandler = new BPEAHandler(Looper.getMainLooper());

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public void sendPush(Context context, String str, int i, String str2) {
    }

    public void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver__onReceive$___twin___(final Context context, Intent intent) {
        String action = intent.getAction();
        Logger.debug();
        if (!"android.intent.action.USER_PRESENT".equals(action) || sFrom < 0) {
            return;
        }
        try {
            C786410Ut5.LJLIIL(2000L, this.mHandler, new Runnable() { // from class: com.ss.android.ugc.awemepushlib.os.receiver.ScreenReceiver.1
                @Override // java.lang.Runnable
                public void run() {
                    C1C7U.LIZ("ScreenReceiver@fca1.onReceive$1");
                    com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("ScreenReceiver@fca1.onReceive$1");
                }

                public void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver$1__run$___twin___() {
                    ScreenReceiver.this.sendPush(context, ScreenReceiver.sMsg, ScreenReceiver.sFrom, ScreenReceiver.sExtra);
                }

                public static void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    try {
                        anonymousClass1.com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(ScreenReceiver screenReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            screenReceiver.com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            screenReceiver.com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(ScreenReceiver screenReceiver, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        com_ss_android_ugc_awemepushlib_os_receiver_ScreenReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(screenReceiver, context, intent);
    }
}
