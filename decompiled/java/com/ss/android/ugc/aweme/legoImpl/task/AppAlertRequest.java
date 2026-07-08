package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CO3;
import X.C800010VZv;
import X.C810650Vr5;
import X.C813020Vuu;
import X.C844470XAv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.ss.android.common.applog.AppLog;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class AppAlertRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AppAlertRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        return C0CO3.NORMAL;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        C844470XAv.LIZ.getClass();
        AppLog.activeUser(C844470XAv.LIZ());
        C813020Vuu.LJIIL().LJIIJJI(C844470XAv.LIZ(), "last_active_version", C844470XAv.LIZJ());
        C813020Vuu.LJIIL().LJIIJJI(C844470XAv.LIZ(), "last_channel", C844470XAv.LJIILL);
        C813020Vuu.LJIIL().LJIIJJI(C844470XAv.LIZ(), "last_device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        C813020Vuu.LJIIL().LJIIJJI(C844470XAv.LIZ(), "last_install_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getInstallId());
        C810650Vr5.LIZIZ(context, "event_v1", "monitor", "app_alert", 0L, 0L, null);
    }
}
