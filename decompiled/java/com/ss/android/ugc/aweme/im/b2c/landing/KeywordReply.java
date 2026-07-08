package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class KeywordReply {

    @C09CT("keyword_id")
    public final long keyReplyId;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("replies")
    public final List<BusinessAutoMessage> replies;

    public KeywordReply() {
        this(0L, null, null, 7, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeywordReply(keyReplyId=");
        sbLIZ.append(this.keyReplyId);
        sbLIZ.append(", keyword=");
        sbLIZ.append(this.keyword);
        sbLIZ.append(", replies=");
        sbLIZ.append(this.replies);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public KeywordReply(long j, String str, List<BusinessAutoMessage> list) {
        this.keyReplyId = j;
        this.keyword = str;
        this.replies = list;
    }

    public KeywordReply(long j, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C13BV.INSTANCE : list);
    }
}
