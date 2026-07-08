package com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import X.InterfaceC2177008fw;
import com.ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* JADX INFO: loaded from: classes30.dex */
public final class SoundEffectCollectionApi {
    public static final /* synthetic */ int LIZ = 0;

    public interface Api {
        @InterfaceC1501200pAU("/tiktok/v1/sound/collect/")
        C0X9S<BaseNetResponse> get(@InterfaceC1501070pAH("sound_id") String str, @InterfaceC1501070pAH("type") String str2, @InterfaceC2177008fw Object obj);
    }
}
