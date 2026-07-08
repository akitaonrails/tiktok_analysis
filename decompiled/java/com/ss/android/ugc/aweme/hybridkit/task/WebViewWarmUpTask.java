package com.ss.android.ugc.aweme.hybridkit.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS93S0000000_16;
import android.content.Context;
import com.ss.android.ugc.aweme.settings.SparkWebViewWarmUpConfig;
import com.ss.android.ugc.aweme.settings.SparkWebViewWarmUpDelayConfig;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class WebViewWarmUpTask implements C0CCZ {
    public static final WebViewWarmUpTask LL = new WebViewWarmUpTask();
    public static volatile boolean LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "WebViewWarmUpTask";
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

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return SparkWebViewWarmUpConfig.LIZ() == 2;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C786410Ut5.LJLIIL(((Number) SparkWebViewWarmUpDelayConfig.LIZJ.getValue()).intValue(), C799570VYd.LIZIZ(), new ARunnableS93S0000000_16(2));
    }
}
