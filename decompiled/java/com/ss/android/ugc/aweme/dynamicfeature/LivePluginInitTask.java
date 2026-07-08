package com.ss.android.ugc.aweme.dynamicfeature;

import X.C0CCZ;
import X.C0VZ0;
import X.C1BLY;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.RunnableC823120WQs;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class LivePluginInitTask implements C0CCZ {
    public volatile SharedPreferences LL;
    public volatile C1BLY LLILLJJLI;
    public volatile Context LLILLL;
    public final List<String> LLILZ = Arrays.asList("df_live_twilio_link", "df_live_zego_link", "df_live_quic", "df_live_cmaf", "df_live_rtmglobal", "df_live_p2p");

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LivePluginInitTask";
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
        return 1;
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
    public final void run(Context context) {
        this.LLILLL = C786410Ut5.N3(context);
        RunnableC823120WQs.LIZIZ(new ARunnableS131S0100000_31(this, 205));
    }
}
