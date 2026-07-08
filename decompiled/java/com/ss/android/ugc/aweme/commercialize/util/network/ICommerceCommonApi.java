package com.ss.android.ugc.aweme.commercialize.util.network;

import X.C1407305f5;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.commercialize.util.network.model.TranslationResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface ICommerceCommonApi {
    public static final C1407305f5 LIZ = C1407305f5.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/content/translation/")
    Object getSingleTranslation(@InterfaceC1501050pAF("content") String str, @InterfaceC1501050pAF("trg_lang") String str2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super TranslationResponse> interfaceC1364105Vn);
}
