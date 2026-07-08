package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveGiftAssetStatisticTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "LiveGiftAssetStatisticTask";
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

    public static final class LiveEnableReportEffectCacheSizeAfterAppLaunch {
        public static final int $stable = 0;
        public static final boolean DEFAULT = true;
        public static final LiveEnableReportEffectCacheSizeAfterAppLaunch INSTANCE = new LiveEnableReportEffectCacheSizeAfterAppLaunch();

        public final boolean getValue() {
            SettingsManager.LIZLLL().getClass();
            return SettingsManager.LIZ("enable_report_gift_asset_size_background", true);
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.APP_BACKGROUND;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.LiveGiftAssetStatisticTask.run(android.content.Context):void");
    }
}
