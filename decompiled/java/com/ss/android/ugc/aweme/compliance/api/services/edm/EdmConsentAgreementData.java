package com.ss.android.ugc.aweme.compliance.api.services.edm;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class EdmConsentAgreementData {
    public static final int $stable = 8;

    @C09CT("agreement_text")
    public final String agreementText;

    @C09CT("highlight_info")
    public final Map<String, HighlightInfo> highlightInfo;

    @C09CT("show_agreement")
    public final Boolean showAgreement;

    public EdmConsentAgreementData() {
        this(null, null, null);
    }

    public EdmConsentAgreementData(Boolean bool, String str, Map<String, HighlightInfo> map) {
        this.showAgreement = bool;
        this.agreementText = str;
        this.highlightInfo = map;
    }
}
