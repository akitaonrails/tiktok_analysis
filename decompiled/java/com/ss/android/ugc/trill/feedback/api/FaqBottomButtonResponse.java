package com.ss.android.ugc.trill.feedback.api;

import X.C09CT;
import X.C1689070u3V;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class FaqBottomButtonResponse implements Serializable {
    public static final int $stable = 0;
    public static final C1689070u3V Companion = new Object() { // from class: X.0u3V
    };

    @C09CT("code")
    public final Integer code;

    @C09CT("data")
    public final FaqBottomButtonData data;

    @C09CT("message")
    public final String message;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaqBottomButtonResponse)) {
            return false;
        }
        FaqBottomButtonResponse faqBottomButtonResponse = (FaqBottomButtonResponse) obj;
        return Intrinsics.LJFF(this.data, faqBottomButtonResponse.data) && Intrinsics.LJFF(this.code, faqBottomButtonResponse.code) && Intrinsics.LJFF(this.message, faqBottomButtonResponse.message);
    }

    public FaqBottomButtonResponse(FaqBottomButtonData faqBottomButtonData, Integer num, String str) {
        this.data = faqBottomButtonData;
        this.code = num;
        this.message = str;
    }
}
