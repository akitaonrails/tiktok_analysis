package com.ss.android.ugc.aweme.lego;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C452501pT;
import X.C786410Ut5;
import X.C788060Uvk;
import X.C788070Uvl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkRestrictInfoTask implements C0CCZ {
    public static final C01GW<Keva> LL = C452501pT.LIZIZ(new C788070Uvl());
    public static String LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NetworkRestrictInfoTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) throws Exception {
        Context contextN3;
        C788060Uvk.LIZ(context);
        if (Build.VERSION.SDK_INT >= 24 && context != null && (contextN3 = C786410Ut5.N3(context)) != null) {
            C786410Ut5.LJIJJ(contextN3, new BroadcastReceiver() { // from class: X.0Uui
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    if (!C2214201BlK.LJIIJJI && intent != null) {
                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                            C2188191AkT.LIZIZ();
                        }
                    }
                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        C788060Uvk.LIZ(context2);
                    } else {
                        C2408409cA.LIZ();
                        C788060Uvk.LIZ(context2);
                    }
                }
            }, new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED"));
        }
    }
}
