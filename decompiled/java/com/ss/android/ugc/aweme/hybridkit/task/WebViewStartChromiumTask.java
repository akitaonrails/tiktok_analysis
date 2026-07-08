package com.ss.android.ugc.aweme.hybridkit.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1510700pPo;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS27S0101000_16;
import android.content.Context;
import com.ss.android.ugc.aweme.settings.SparkWebViewWarmUpConfig;
import com.ss.android.ugc.aweme.settings.SparkWebViewWarmUpDelayConfig;
import com.ss.android.ugc.aweme.settings.WebViewPortraitConfig;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class WebViewStartChromiumTask implements C0CCZ {
    public static final WebViewStartChromiumTask LL = new WebViewStartChromiumTask();
    public static volatile boolean LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "WebViewStartChromiumTask";
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

    public static boolean LIZ() {
        boolean z;
        if (((Boolean) WebViewPortraitConfig.LIZIZ.getValue()).booleanValue()) {
            z = (C1510700pPo.LIZ().LJFF(0, "android_webview_cold_start_count_7d") > ((Number) WebViewPortraitConfig.LIZJ.getValue()).intValue()) & true;
        } else {
            z = true;
        }
        if (((Boolean) WebViewPortraitConfig.LIZLLL.getValue()).booleanValue()) {
            z &= C1510700pPo.LIZ().LJFF(0, "android_webview_cold_start_count_14d") > ((Number) WebViewPortraitConfig.LJ.getValue()).intValue();
        }
        if (((Boolean) WebViewPortraitConfig.LJFF.getValue()).booleanValue()) {
            z &= C1510700pPo.LIZ().LIZLLL("android_enter_duration_pct10_7d") < ((double) ((Number) WebViewPortraitConfig.LJI.getValue()).longValue());
        }
        if (((Boolean) WebViewPortraitConfig.LJII.getValue()).booleanValue()) {
            z &= C1510700pPo.LIZ().LIZLLL("android_enter_duration_pct20_7d") < ((double) ((Number) WebViewPortraitConfig.LJIIIIZZ.getValue()).longValue());
        }
        if (((Boolean) WebViewPortraitConfig.LJIIIZ.getValue()).booleanValue()) {
            z &= C1510700pPo.LIZ().LIZLLL("android_enter_duration_pct50_7d") < ((double) ((Number) WebViewPortraitConfig.LJIIJ.getValue()).longValue());
        }
        if (((Boolean) WebViewPortraitConfig.LJIIJJI.getValue()).booleanValue()) {
            z &= C1510700pPo.LIZ().LIZLLL("android_enter_duration_pct10_14d") < ((double) ((Number) WebViewPortraitConfig.LJIIL.getValue()).longValue());
        }
        if (((Boolean) WebViewPortraitConfig.LJIILIIL.getValue()).booleanValue()) {
            z &= C1510700pPo.LIZ().LIZLLL("android_enter_duration_pct20_14d") < ((double) ((Number) WebViewPortraitConfig.LJIILJJIL.getValue()).longValue());
        }
        if (((Boolean) WebViewPortraitConfig.LJIILL.getValue()).booleanValue()) {
            return z & (C1510700pPo.LIZ().LIZLLL("android_enter_duration_pct50_14d") < ((double) ((Number) WebViewPortraitConfig.LJIILLIIL.getValue()).longValue()));
        }
        return z;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return SparkWebViewWarmUpConfig.LIZ() > 0;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (!LIZ()) {
            return;
        }
        int iIntValue = ((Number) SparkWebViewWarmUpDelayConfig.LIZIZ.getValue()).intValue();
        C786410Ut5.LJLIIL(iIntValue, C799570VYd.LIZIZ(), new ARunnableS27S0101000_16(iIntValue, context, 5));
        WebViewWarmUpTask webViewWarmUpTask = WebViewWarmUpTask.LL;
        if (webViewWarmUpTask.meetTrigger()) {
            webViewWarmUpTask.run(context);
        }
    }
}
