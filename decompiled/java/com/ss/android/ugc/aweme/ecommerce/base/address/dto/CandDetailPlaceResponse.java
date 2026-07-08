package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CandDetailPlaceResponse {

    @C09CT("option")
    public final CandInputData candDetailPlaceOption;

    @C09CT("region_autofill_hint_message")
    public final String regionAutofillHintMessage;

    @C09CT("report")
    public final String report;

    public CandDetailPlaceResponse(String str, CandInputData candInputData, String str2) {
        this.regionAutofillHintMessage = str;
        this.candDetailPlaceOption = candInputData;
        this.report = str2;
    }
}
