package com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.api;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Words extends BaseResponse {

    @C09CT("words")
    public final List<String> words;

    public final Words copy(List<String> list) {
        return new Words(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Words) && Intrinsics.LJFF(this.words, ((Words) obj).words);
    }

    public int hashCode() {
        List<String> list = this.words;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Words(words=");
        sbLIZ.append(this.words);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getWords() {
        return this.words;
    }

    public Words(List<String> list) {
        this.words = list;
    }
}
