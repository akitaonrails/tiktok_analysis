package com.ss.android.ugc.gamora.editorpro.capabilities.audio.effect.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes30.dex */
public final class SoundEffectListApi {
    public static final /* synthetic */ int LIZ = 0;

    public interface ApiCollectList {
        @InterfaceC1501200pAU("/tiktok/v1/user/sound/collect/")
        C0X9S<SoundEffectListApiResponse> get(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("cursor") String str, @InterfaceC1501070pAH("count") String str2, @InterfaceC2177008fw Object obj);
    }

    public interface ApiSoundList {
        @InterfaceC1501200pAU("/tiktok/v1/sound/list/")
        C0X9S<SoundEffectListApiResponse> get(@InterfaceC1501070pAH("sc_id") String str, @InterfaceC1501070pAH("cursor") String str2, @InterfaceC1501070pAH("count") String str3, @InterfaceC2177008fw Object obj);
    }
}
