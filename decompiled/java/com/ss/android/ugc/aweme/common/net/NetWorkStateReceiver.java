package com.ss.android.ugc.aweme.common.net;

import X.C15O7;
import X.C2103808Ma;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C2501509rB;
import X.C788530UwV;
import X.C823050WQl;
import X.C844470XAv;
import X.EnumC804620VhM;
import Y.ACallableS428S0100000_23;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {
    public static boolean LIZJ;
    public EnumC804620VhM LIZ = EnumC804620VhM.UNKNOWN;
    public final boolean LIZIZ;

    public NetWorkStateReceiver() {
        C844470XAv.LIZ.getClass();
        if (C2103808Ma.LIZJ(C844470XAv.LIZ())) {
            this.LIZIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);
        }
    }

    public final void LIZ(Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                C15O7.LIZIZ(new ACallableS428S0100000_23(this, 6), C823050WQl.LIZLLL(), null).LJ(new C2501509rB(this, 12), C15O7.LJIIIIZZ, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
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
