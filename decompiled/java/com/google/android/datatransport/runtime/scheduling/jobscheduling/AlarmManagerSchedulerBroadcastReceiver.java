package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.AbstractC818550W9d;
import X.C0WCT;
import X.C0WCW;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C816330W0p;
import X.C818570W9f;
import X.C819200WBq;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Intent intent) {
        Bundle extras;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(intent.getData(), "backendName");
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(intent.getData(), "extras");
        int iIntValue = CastIntegerProtector.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(intent.getData(), "priority")).intValue();
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        int i = extras.getInt("attemptNumber");
        C819200WBq.LIZIZ(context);
        C818570W9f c818570W9fLIZ = AbstractC818550W9d.LIZ();
        c818570W9fLIZ.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        c818570W9fLIZ.LIZJ(C816330W0p.LIZIZ(iIntValue));
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
            c818570W9fLIZ.LIZIZ = Base64.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, 0);
        }
        C0WCW c0wcw = C819200WBq.LIZ().LIZLLL;
        c0wcw.LJ.execute(new C0WCT(c0wcw, c818570W9fLIZ.LIZ(), i, new Runnable() { // from class: X.0W9b
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("AlarmManagerSchedulerBroadcastReceiver@7c.com_google_android_datatransport_runtime_scheduling_jobscheduling_AlarmManagerSchedulerBroadcastReceiver__onReceive$___twin___$1L");
                C1C7U.LIZIZ("AlarmManagerSchedulerBroadcastReceiver@7c.com_google_android_datatransport_runtime_scheduling_jobscheduling_AlarmManagerSchedulerBroadcastReceiver__onReceive$___twin___$1L");
            }
        }));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
