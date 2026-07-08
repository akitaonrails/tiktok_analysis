package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service;

import X.C0X9S;
import X.C2269731Dsh;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequestV2;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DeleteMobileEffectRequestV2;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectIconResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.UpdateMobileEffectRequestV2;

/* JADX INFO: loaded from: classes36.dex */
public interface TTEPEffectServiceV2 {
    public static final C2269731Dsh LIZ = C2269731Dsh.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/mobile-effect/create")
    C0X9S<MobileEffectResponse> createMobileEffect(@InterfaceC1485405rg CreateMobileEffectRequestV2 createMobileEffectRequestV2, @InterfaceC1501070pAH("device_platform") String str);

    @InterfaceC1501170pAR("/tiktok/v1/mobile-effect/delete")
    Object deleteMobileEffect(@InterfaceC1485405rg DeleteMobileEffectRequestV2 deleteMobileEffectRequestV2, InterfaceC1364105Vn<? super MobileEffectResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/effect/api/ttapp/icon-list")
    Object fetchEffectInfo(@InterfaceC1501070pAH("custom_app_effect_id") String str, InterfaceC1364105Vn<? super MobileEffectIconResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/mobile-effect/update")
    C0X9S<MobileEffectResponse> updateMobileEffect(@InterfaceC1485405rg UpdateMobileEffectRequestV2 updateMobileEffectRequestV2);
}
