package com.ss.android.ugc.aweme.translation.service;

import X.C1383320m6M;
import X.C1390840mIU;
import X.C20702515zj;
import X.C294300BgC;
import X.C746760TRa;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;

/* JADX INFO: loaded from: classes22.dex */
public final class TranslationKevaServiceImpl implements ITranslationKevaService {
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LIZ() {
        Keva keva = C1390840mIU.LIZ;
        return C746760TRa.LIZ().LJLILLLLZI();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LIZIZ() {
        return C1390840mIU.LIZ.getBoolean("key_one_click_translation_active", C746760TRa.LIZ().LJLILLLLZI());
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LIZJ() {
        Keva keva = C1390840mIU.LIZ;
        return C1390840mIU.LIZ.getBoolean("key_has_shown_cec_translation_tooltip", false);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LIZLLL() {
        Keva keva = C1390840mIU.LIZ;
        C1390840mIU.LIZ.erase("key_one_click_translation_active");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LJFF() {
        Keva keva = C1390840mIU.LIZ;
        return C746760TRa.LIZ().LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LJI() {
        Keva keva = C1390840mIU.LIZ;
        C1390840mIU.LIZ.storeBoolean("key_has_shown_cec_translation_tooltip", true);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LJ(String str) {
        if (((Number) C294300BgC.LIZ.getValue()).intValue() > 0) {
            if (C746760TRa.LIZ().LJJJLZIJ()) {
                return true;
            }
            ICaptionKevaService iCaptionKevaServiceLIZ = C746760TRa.LIZ();
            if (str == null) {
                str = "";
            }
            if (iCaptionKevaServiceLIZ.LJJIIJZLJL(str)) {
                return true;
            }
            return false;
        }
        return LIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final boolean LJII(Aweme aweme) {
        Keva keva = C1390840mIU.LIZ;
        if (C1383320m6M.LIZIZ() && C746760TRa.LIZ().LJLILLLLZI() && !C20702515zj.LIZ(aweme, null)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationKevaService
    public final void LJIIIIZZ(boolean z) {
        C1390840mIU.LIZ.storeBoolean("key_one_click_translation_active", z);
    }
}
