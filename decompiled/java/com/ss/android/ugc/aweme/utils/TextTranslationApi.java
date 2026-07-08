package com.ss.android.ugc.aweme.utils;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes9.dex */
public interface TextTranslationApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/texts_translation/")
    Object getTranslateResult(@InterfaceC1501050pAF("original_texts") String str, @InterfaceC1501050pAF("translation_config") String str2, InterfaceC1364105Vn<? super TranslatedResponse> interfaceC1364105Vn);
}
