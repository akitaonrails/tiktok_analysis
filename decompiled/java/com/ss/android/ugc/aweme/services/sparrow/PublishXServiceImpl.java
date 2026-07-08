package com.ss.android.ugc.aweme.services.sparrow;

import X.C0CHQ;
import X.C0MZ7;
import X.C0XF1;
import X.C1431430nLx;
import X.C1433670nPZ;
import X.C1434330nQd;
import X.C1434650nR9;
import X.C259800zU;
import X.C309040C9m;
import X.C570410MYt;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ISparrowService;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS16S0410000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class PublishXServiceImpl implements C0MZ7 {
    public final void printPublishModelInOfflineStorage(PublishModel publishModel) {
    }

    private final String eventConclusion(Throwable th) {
        if (!(th instanceof C1434650nR9)) {
            return "no conclusion available";
        }
        if (isQuietlySyntheticCancel((C1434650nR9) th)) {
            return "User cancelled publish, no need to handle";
        }
        if (!(th.getCause() instanceof C1431430nLx)) {
            return "no conclusion available";
        }
        return "Debug mock publish failure enabled";
    }

    private final int eventExplanation(Throwable th) {
        if (!(th instanceof C1434650nR9) || !(th.getCause() instanceof C1431430nLx)) {
            return -1;
        }
        return 1;
    }

    private final String eventMessage(Throwable th) {
        if (!(th instanceof C1434650nR9) || !isQuietlySyntheticCancel((C1434650nR9) th)) {
            return "no message available";
        }
        return "User cancelled publish";
    }

    private final boolean isQuietlySyntheticCancel(C1434650nR9 c1434650nR9) {
        Throwable cause = c1434650nR9.getCause();
        if ((cause instanceof C1433670nPZ) && ((C1433670nPZ) cause).getCode() == -66666) {
            return true;
        }
        if ((cause instanceof C1434330nQd) && ((C1434330nQd) cause).getErrorCode() == -39993) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.String] */
    @Override // X.C0MZ7
    public void reportPublishFailure(PublishModel publishModel, C1434650nR9 c1434650nR9, boolean z) {
        String vESDKVersion;
        String effectVersion;
        C570410MYt publishXService = ((ISparrowService) ServiceManager.get().getService(ISparrowService.class)).getPublishXService();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("message", eventMessage(c1434650nR9));
        linkedHashMap.put("conclusion", eventConclusion(c1434650nR9));
        linkedHashMap.put("explanation", Integer.valueOf(eventExplanation(c1434650nR9)));
        C0CHQ.LIZ().getApplicationService().getClass();
        linkedHashMap.put("did", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        linkedHashMap.put("uid", C0CHQ.LIZ().getAccountService().getCurrentUserID());
        linkedHashMap.put("network_type", C0XF1.LIZ(C0CHQ.LIZ).toString());
        IAVSettingsService iAVSettingsServiceAvSettingsService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).avSettingsService();
        if (iAVSettingsServiceAvSettingsService == null || (vESDKVersion = iAVSettingsServiceAvSettingsService.getVESDKVersion()) == null) {
            vESDKVersion = "unknown";
        }
        linkedHashMap.put("vesdk_version", vESDKVersion);
        IAVSettingsService iAVSettingsServiceAvSettingsService2 = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).avSettingsService();
        if (iAVSettingsServiceAvSettingsService2 != null) {
            effectVersion = iAVSettingsServiceAvSettingsService2.getEffectVersion();
        } else {
            effectVersion = null;
        }
        linkedHashMap.put("effectsdk_version", effectVersion);
        publishXService.getClass();
        if (publishModel == null) {
            return;
        }
        C259800zU c259800zU = new C259800zU();
        ?? r0 = publishModel.publishId;
        c259800zU.element = r0;
        if (r0 == 0 || r0.length() == 0) {
            c259800zU.element = C309040C9m.LIZ();
        }
        C570410MYt publishXService2 = ((ISparrowService) ServiceManager.get().getService(ISparrowService.class)).getPublishXService();
        new AwS16S0410000_8(this, (PublishXServiceImpl) publishModel, (PublishModel) c259800zU, (C259800zU<String>) c1434650nR9, (C1434650nR9) z, false);
        publishXService2.getClass();
    }
}
