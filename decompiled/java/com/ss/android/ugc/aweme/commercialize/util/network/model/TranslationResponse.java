package com.ss.android.ugc.aweme.commercialize.util.network.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TranslationResponse extends BaseResponse {

    @C09CT("translated_content")
    public final String translatedContent;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TranslationResponse) && Intrinsics.LJFF(this.translatedContent, ((TranslationResponse) obj).translatedContent);
    }

    public final int hashCode() {
        return this.translatedContent.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslationResponse(translatedContent=");
        sbLIZ.append(this.translatedContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TranslationResponse() {
        this("");
    }

    public TranslationResponse(String str) {
        this.translatedContent = str;
    }
}
