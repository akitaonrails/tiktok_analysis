package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service;

import X.C0C02;
import X.C0X9S;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2286608xc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1445350niP;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.effectplatform.EPRequestInterceptor;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequestV2;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequestV3;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DeleteMobileEffectRequestV2;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectIconResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.UpdateMobileEffectRequestV2;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.UpdateMobileEffectRequestV3;
import java.util.Collections;

/* JADX INFO: loaded from: classes36.dex */
public final class TTEPEffectServiceUtilKt {
    public static final TTEPEffectServiceV2 LIZ() {
        TTEPEffectServiceV2.LIZ.getClass();
        InterfaceC1445350niP networkService = ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService();
        return (TTEPEffectServiceV2) networkService.createRetrofitWithInterceptors(networkService.getApiHost(), true, TTEPEffectServiceV2.class, Collections.singletonList(new EPRequestInterceptor()));
    }

    public static final TTEPEffectServiceV3 LIZIZ() {
        InterfaceC1445350niP networkService;
        TTEPEffectServiceV3.LIZ.getClass();
        IFoundationAVServiceProxy iFoundationAVServiceProxy = (IFoundationAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null);
        if (iFoundationAVServiceProxy == null || (networkService = iFoundationAVServiceProxy.getNetworkService()) == null) {
            return null;
        }
        return (TTEPEffectServiceV3) networkService.createRetrofitWithInterceptors(networkService.getApiHost(), true, TTEPEffectServiceV3.class, Collections.singletonList(new EPRequestInterceptor()));
    }

    public static final C0X9S<MobileEffectResponse> createMobileEffect(@InterfaceC1485405rg CreateMobileEffectRequestV3 createMobileEffectRequestV3, @InterfaceC1501070pAH("device_platform") String str) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TTEPEffectServiceUtil", "createMobileEffect, use new api");
        TTEPEffectServiceV3 tTEPEffectServiceV3LIZIZ = LIZIZ();
        if (tTEPEffectServiceV3LIZIZ != null) {
            return tTEPEffectServiceV3LIZIZ.createMobileEffect(createMobileEffectRequestV3, str);
        }
        return null;
    }

    public static final Object fetchEffectIconInfo(@InterfaceC1501070pAH("custom_app_effect_id") String str, InterfaceC1364105Vn<? super MobileEffectIconResponse> interfaceC1364105Vn) {
        return LIZ().fetchEffectInfo(str, interfaceC1364105Vn);
    }

    public static final C0X9S<MobileEffectResponse> createMobileEffect(@InterfaceC1485405rg CreateMobileEffectRequestV2 createMobileEffectRequestV2, @InterfaceC1501070pAH("device_platform") String str) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TTEPEffectServiceUtil", "createMobileEffect, use new api");
        return LIZ().createMobileEffect(createMobileEffectRequestV2, str);
    }

    public static final Object deleteMobileEffect(@InterfaceC1501060pAG(FollowStatusChangeMethod.PARAM_UID) String str, @InterfaceC1501070pAH("effect_source") int i, InterfaceC1364105Vn<? super MobileEffectResponse> interfaceC1364105Vn) {
        DeleteMobileEffectRequestV2 deleteMobileEffectRequestV2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteMobileEffect, use new api, effectId: ");
        sbLIZ.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TTEPEffectServiceUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (C0C02.LIZ() && i == 1) {
            deleteMobileEffectRequestV2 = new DeleteMobileEffectRequestV2(null, str, C2286608xc.LJ(i));
        } else {
            deleteMobileEffectRequestV2 = new DeleteMobileEffectRequestV2(C2095008Iq.LJIILIIL(str), null, C2286608xc.LJ(i));
        }
        return LIZ().deleteMobileEffect(deleteMobileEffectRequestV2, interfaceC1364105Vn);
    }

    public static final C0X9S<MobileEffectResponse> updateMobileEffect(@InterfaceC1501060pAG(FollowStatusChangeMethod.PARAM_UID) String str, @InterfaceC1501070pAH("effect_source") int i, @InterfaceC1485405rg UpdateMobileEffectRequestV2 updateMobileEffectRequestV2) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TTEPEffectServiceUtil", "updateMobileEffect, use new api");
        return LIZ().updateMobileEffect(updateMobileEffectRequestV2);
    }

    public static final C0X9S<MobileEffectResponse> updateMobileEffectV3(@InterfaceC1501060pAG(FollowStatusChangeMethod.PARAM_UID) String str, @InterfaceC1501070pAH("effect_source") int i, @InterfaceC1485405rg UpdateMobileEffectRequestV3 updateMobileEffectRequestV3) {
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("TTEPEffectServiceUtil", "updateMobileEffect, use new api");
        TTEPEffectServiceV3 tTEPEffectServiceV3LIZIZ = LIZIZ();
        if (tTEPEffectServiceV3LIZIZ != null) {
            return tTEPEffectServiceV3LIZIZ.updateMobileEffect(updateMobileEffectRequestV3);
        }
        return null;
    }
}
