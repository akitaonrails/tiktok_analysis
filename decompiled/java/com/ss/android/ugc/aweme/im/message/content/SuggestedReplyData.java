package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SuggestedReplyData extends BaseContent {

    @C09CT("content")
    public final List<String> content;

    @C09CT("is_loading")
    public final boolean isLoading;

    @C09CT("is_start")
    public final boolean isStart;

    public SuggestedReplyData() {
        this(null, false, false);
    }

    public final SuggestedReplyData copy(List<String> list, boolean z, boolean z2) {
        return new SuggestedReplyData(list, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedReplyData)) {
            return false;
        }
        SuggestedReplyData suggestedReplyData = (SuggestedReplyData) obj;
        return Intrinsics.LJFF(this.content, suggestedReplyData.content) && this.isLoading == suggestedReplyData.isLoading && this.isStart == suggestedReplyData.isStart;
    }

    public int hashCode() {
        List<String> list = this.content;
        return ((((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.isLoading)) * 31) + C786410Ut5.Z2(this.isStart);
    }

    @Override // com.ss.android.ugc.aweme.im.message.content.BaseContent
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedReplyData(content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.isLoading);
        sbLIZ.append(", isStart=");
        sbLIZ.append(this.isStart);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getContent() {
        return this.content;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isStart() {
        return this.isStart;
    }

    public SuggestedReplyData(List<String> list, boolean z, boolean z2) {
        this.content = list;
        this.isLoading = z;
        this.isStart = z2;
    }
}
