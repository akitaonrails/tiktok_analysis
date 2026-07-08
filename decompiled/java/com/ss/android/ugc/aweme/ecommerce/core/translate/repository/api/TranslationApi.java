package com.ss.android.ugc.aweme.ecommerce.core.translate.repository.api;

import X.C1528100prs;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationImage;
import com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationResponse;

/* JADX INFO: loaded from: classes24.dex */
public interface TranslationApi {
    public static final C1528100prs LIZ = C1528100prs.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/contents/translation/")
    Object getTranslation(@InterfaceC1501050pAF("trg_lang") String str, @InterfaceC1501050pAF("translation_info") String str2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<? super TranslationResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/v1/image/ocr_trans")
    Object ocrTranslation(@InterfaceC1485405rg TranslationImage translationImage, InterfaceC1364105Vn<Object> interfaceC1364105Vn);
}
