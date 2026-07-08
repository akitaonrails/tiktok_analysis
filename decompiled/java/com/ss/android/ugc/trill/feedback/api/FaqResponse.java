package com.ss.android.ugc.trill.feedback.api;

import X.C09CT;
import X.C1689080u3W;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class FaqResponse implements Serializable {

    @C09CT("status_code")
    public final Integer code;

    @C09CT("faq_info_map")
    public final FaqInfoMap faqInfoMap;

    @C09CT("status_message")
    public final String message;
    public static final C1689080u3W Companion = new Object() { // from class: X.0u3W
    };
    public static final int $stable = 8;

    public FaqResponse() {
        this(null, "", 0);
    }

    public FaqResponse(FaqInfoMap faqInfoMap, String str, Integer num) {
        this.faqInfoMap = faqInfoMap;
        this.message = str;
        this.code = num;
    }
}
