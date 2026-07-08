package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service;

import X.C0X9S;
import X.C2269741Dsi;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.CreateMobileEffectRequestV3;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.UpdateMobileEffectRequestV3;

/* JADX INFO: loaded from: classes36.dex */
public interface TTEPEffectServiceV3 {
    public static final C2269741Dsi LIZ = C2269741Dsi.LIZ;

    @InterfaceC1501170pAR("/tiktok/v1/mobile-effect/create")
    C0X9S<MobileEffectResponse> createMobileEffect(@InterfaceC1485405rg CreateMobileEffectRequestV3 createMobileEffectRequestV3, @InterfaceC1501070pAH("device_platform") String str);

    @InterfaceC1501170pAR("/tiktok/v1/mobile-effect/update")
    C0X9S<MobileEffectResponse> updateMobileEffect(@InterfaceC1485405rg UpdateMobileEffectRequestV3 updateMobileEffectRequestV3);
}
