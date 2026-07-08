package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0CCZ;
import X.C0PEM;
import X.C0VZ0;
import X.C0XKK;
import X.C1150504el;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import java.util.List;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class KidsModePolicyNoticeTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "KidsModePolicyNoticeTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean z;
        C1150504el.LIZ().LIZLLL("method_init_fetch_policy_notice_duration_kids_mode", false);
        TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
        IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
        if (iDowngradeApi != null) {
            iDowngradeApi.LJI(new AwS557S0100000_13(tTKUserCommunicationService, 121));
        }
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId != null && !a0.LJJJIL(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0XKK(tTKUserCommunicationService, null), 3);
        } else if (tTKUserCommunicationService != null) {
            tTKUserCommunicationService.LJIIJJI(0, null, "PopupShowProcessorLocal");
        }
        C1150504el.LIZ().LJI("method_init_fetch_policy_notice_duration_kids_mode", false);
    }
}
