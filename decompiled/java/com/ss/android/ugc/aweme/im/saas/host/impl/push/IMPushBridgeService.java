package com.ss.android.ugc.aweme.im.saas.host.impl.push;

import X.C0Y8T;
import X.C0YTA;
import X.C1866720yg2;
import X.C19323510in;
import X.C19328310jZ;
import X.C2097608Jq;
import X.C817570W5j;
import X.C869590Y9l;
import X.C891310Yxt;
import X.C892090Yz9;
import X.InterfaceC896430ZEr;
import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.setting.serverpush.model.InAppPushSetting;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class IMPushBridgeService implements PushFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LIZ() {
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LIZIZ() {
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LJ() {
        InterfaceC896430ZEr interfaceC896430ZErLIZLLL;
        IMPushApi iMPushApi = (IMPushApi) PluggableExtentionKt.pluggableSpi$default(IMPushApi.class, false, false, false, 14, null);
        if (iMPushApi == null || (interfaceC896430ZErLIZLLL = iMPushApi.LIZLLL()) == null) {
            return;
        }
        interfaceC896430ZErLIZLLL.LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final String LJIIIIZZ() {
        InAppPushSetting inAppPushSetting;
        String string;
        PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
        return (pushSettingsLJ == null || (inAppPushSetting = pushSettingsLJ.inAppPushSetting) == null || (string = Integer.valueOf(inAppPushSetting.inAppImPush).toString()) == null) ? CardStruct.IStatusCode.DEFAULT : string;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LJIIJ() {
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZLLL().LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final InAppPushSetting LJIILIIL() {
        PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
        if (pushSettingsLJ != null) {
            return pushSettingsLJ.inAppPushSetting;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final boolean LJIILJJIL() {
        return C1866720yg2.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final C869590Y9l LJFF(InnerPushMessage innerPushMessage) {
        InterfaceC896430ZEr interfaceC896430ZErLIZLLL;
        IMPushApi iMPushApi = (IMPushApi) PluggableExtentionKt.pluggableSpiForReal(IMPushApi.class);
        if (iMPushApi != null && (interfaceC896430ZErLIZLLL = iMPushApi.LIZLLL()) != null) {
            return interfaceC896430ZErLIZLLL.LJFF(innerPushMessage);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final boolean LJII(C0Y8T c0y8t) {
        InterfaceC896430ZEr interfaceC896430ZErLIZLLL;
        IMPushApi iMPushApi = (IMPushApi) PluggableExtentionKt.pluggableSpi$default(IMPushApi.class, false, false, false, 14, null);
        if (iMPushApi != null && (interfaceC896430ZErLIZLLL = iMPushApi.LIZLLL()) != null) {
            return interfaceC896430ZErLIZLLL.LJII(c0y8t);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final C892090Yz9 LJIIIZ(String str) {
        IMPushApi.LIZ.getClass();
        return C817570W5j.LIZ().LIZJ().LJIIIIZZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LJIILL(List<? extends C869590Y9l> list) {
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZJ().LJII(list);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final Map<String, String> LIZJ(String str, String str2) {
        Map<String, String> mapLIZJ;
        IMessageAlertToneService.LIZ.getClass();
        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        if (iMessageAlertToneServiceLIZ == null || (mapLIZJ = iMessageAlertToneServiceLIZ.LIZJ(str, str2)) == null) {
            return C2097608Jq.LJ();
        }
        return mapLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LIZLLL(Activity activity, String str) {
        IMessageAlertToneService.LIZ.getClass();
        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        if (iMessageAlertToneServiceLIZ != null) {
            iMessageAlertToneServiceLIZ.LIZLLL(activity, str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LJI(C869590Y9l c869590Y9l, C0YTA c0yta) {
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZLLL().LJI(c869590Y9l, c0yta);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LJIIL(String str, String str2) {
        IMessageAlertToneService.LIZ.getClass();
        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        if (iMessageAlertToneServiceLIZ != null) {
            iMessageAlertToneServiceLIZ.LJII(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LJIILLIIL(int i, List list) {
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZLLL().LIZJ(i, list);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LJIIZILJ(String str, String str2) {
        IMessageAlertToneService.LIZ.getClass();
        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        if (iMessageAlertToneServiceLIZ != null) {
            iMessageAlertToneServiceLIZ.LJIILIIL(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final void LJIJ(int i, List list) {
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZLLL().LJIIL(i, list);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.push.PushFeature
    public final C19323510in LJIIJJI(InnerPushConfig innerPushConfig, InnerPushUITemplate innerPushUITemplate, Map map, Map map2) {
        return new C19323510in(1009, "inner_streak_countdown_reminder", innerPushConfig, innerPushUITemplate, map2, map, 268);
    }
}
