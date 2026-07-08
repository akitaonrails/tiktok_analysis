package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1E21;
import X.C2275781E5w;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
@InterfaceC20234614Fk
public final class FeedRequestParamPreloadTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FeedRequestParamPreloadTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return (C1E21.LIZIZ() || ColdBootTasksDegradeExperiment.LIZ().feedRequestParamPreloadTask) ? false : true;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        if (((Boolean) C2275781E5w.LJI.getValue()).booleanValue()) {
            SettingsManager.LIZLLL().LJIIIIZZ("network_monitor_config", DetectorParam.class, null);
            ComplianceServiceProvider.LJIILIIL().LJIILL();
            DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getSSIDs(new LinkedHashMap());
            ((IMainService) ServiceManager.get().getService(IMainService.class)).isLimitAdTrackingEnabled();
            C786410Ut5.d3(context);
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || i18nManagerServiceApiLIZ.LJIJJ(context) == null) {
                C786410Ut5.t2(Locale.getDefault());
            }
        }
    }
}
