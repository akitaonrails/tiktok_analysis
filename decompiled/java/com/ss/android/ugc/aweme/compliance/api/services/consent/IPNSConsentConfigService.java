package com.ss.android.ugc.aweme.compliance.api.services.consent;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentBoxConfig;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.KRConsentConfig;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.TextWithInlineLink;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public interface IPNSConsentConfigService {
    CharSequence LIZ(Context context, TextWithInlineLink textWithInlineLink, String str, int i, int i2);

    TextWithInlineLink LIZIZ();

    void LIZJ();

    void LIZLLL(String str);

    void LJ(String str, Function1 function1);

    CharSequence LJFF(Context context, ConsentBoxConfig consentBoxConfig, String str, int i);

    ConsentBoxConfig LJI();

    TextWithInlineLink LJII();

    TextWithInlineLink LJIIIIZZ();

    void LJIIIZ(String str);

    KRConsentConfig LJIIJ();

    ConsentBoxConfig LJIIJJI();
}
