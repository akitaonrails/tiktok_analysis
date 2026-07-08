package com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class RiskyKeywords extends BaseResponse {

    @C09CT("keywords")
    public final List<String> words;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RiskyKeywords) && Intrinsics.LJFF(this.words, ((RiskyKeywords) obj).words);
    }

    public final int hashCode() {
        List<String> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RiskyKeywords(words=");
        sbLIZ.append(this.words);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RiskyKeywords(List<String> list) {
        this.words = list;
    }
}
