package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service;

import X.C0XSZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectUnpublishedResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MyEffectsResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface TemplateEffectsService {
    public static final C0XSZ LIZ = C0XSZ.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/original/effects/")
    Object getMyEffects(@InterfaceC1501070pAH("app_version") String str, InterfaceC1364105Vn<? super MyEffectsResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/effect/api/ttapp/effect")
    Object getUnpublishedEffect(@InterfaceC1501070pAH("custom_app_effect_id") String str, InterfaceC1364105Vn<? super MobileEffectUnpublishedResponse> interfaceC1364105Vn);
}
