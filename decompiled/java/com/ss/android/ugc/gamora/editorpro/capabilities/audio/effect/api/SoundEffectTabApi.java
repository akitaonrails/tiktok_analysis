package com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes30.dex */
public final class SoundEffectTabApi {
    public static final /* synthetic */ int LIZ = 0;

    public interface Api {
        @InterfaceC1501200pAU("/tiktok/v1/sound/collection/")
        C0X9S<SoundEffectTabApiResponse> get(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC2177008fw Object obj);
    }
}
