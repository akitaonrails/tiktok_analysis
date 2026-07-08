package com.ss.android.ugc.aweme.translation.service;

import X.C01GW;
import X.C13LP;
import X.C20700215zM;
import X.C20700315zN;
import X.C2252321DDq;
import X.C452501pT;
import X.C670680QSk;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class TranslationLangKevaServiceImpl implements ITranslationLangKevaService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C670680QSk());
    public List<? extends ContentLanguage> LIZIZ;

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final String LIZ() {
        String str = (String) C20700315zN.LIZJ.getValue();
        return str == null ? C20700315zN.LIZ.getString("key_selected_translation_language", "") : str;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final int LJFF() {
        Keva keva = C20700315zN.LIZ;
        return C20700315zN.LIZ.getInt("key_comment_trans_cta_banner_showed", -1);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJI() {
        Keva keva = C20700315zN.LIZ;
        Keva keva2 = C20700315zN.LIZ;
        keva2.erase("key_selected_content_language_codes");
        keva2.erase("key_selected_content_language_names");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final C20700215zM LJIIIIZZ() {
        return (C20700215zM) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final C2252321DDq LIZIZ() {
        return C20700315zN.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final List<ContentLanguage> LJII() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LIZJ(String str) {
        Keva keva = C20700315zN.LIZ;
        if (str == null) {
            str = "";
        }
        C20700315zN.LIZJ.setValue(str);
        C20700315zN.LIZ.storeString("key_selected_translation_language", str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LIZLLL(String[] strArr) {
        Keva keva = C20700315zN.LIZ;
        C20700315zN.LIZ.storeStringArray("key_selected_content_language_codes", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJ(String[] strArr) {
        Keva keva = C20700315zN.LIZ;
        C20700315zN.LIZ.storeStringArray("key_selected_content_language_names", strArr);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJIIIZ(int i) {
        C20700315zN.LIZ.storeInt("key_comment_trans_cta_banner_showed", i);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService
    public final void LJIIJ(List<? extends ContentLanguage> list) {
        this.LIZIZ = C13LP.LLIIII(list);
    }
}
