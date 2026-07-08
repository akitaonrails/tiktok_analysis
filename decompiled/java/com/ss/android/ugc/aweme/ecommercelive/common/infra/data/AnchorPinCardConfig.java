package com.ss.android.ugc.aweme.ecommercelive.common.infra.data;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class AnchorPinCardConfig {

    @C09CT("button_config")
    public final Map<String, AnchorPinCardButtonProperty> buttonConfig;

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("close_toast_text")
    public final String closeToastText;

    @C09CT("education_text")
    public final String educationText;

    public AnchorPinCardConfig() {
        this(null, null, null, null);
    }

    public AnchorPinCardConfig(Map<String, AnchorPinCardButtonProperty> map, Integer num, String str, String str2) {
        this.buttonConfig = map;
        this.buttonType = num;
        this.educationText = str;
        this.closeToastText = str2;
    }
}
