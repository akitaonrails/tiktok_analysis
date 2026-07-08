package com.ss.android.ugc.aweme.social.sticker.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SecretReplyResult extends BaseResponse {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("next_cursor")
    public final int nextCursor;

    @C09CT("secret_reply_result_entry")
    public final List<SecretReplyResultEntry> secretReplyResultEntries;

    @C09CT("total_count")
    public final int totalCount;

    public SecretReplyResult() {
        this(false, 0, 0, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretReplyResult)) {
            return false;
        }
        SecretReplyResult secretReplyResult = (SecretReplyResult) obj;
        return this.hasMore == secretReplyResult.hasMore && this.nextCursor == secretReplyResult.nextCursor && this.totalCount == secretReplyResult.totalCount && Intrinsics.LJFF(this.secretReplyResultEntries, secretReplyResult.secretReplyResultEntries);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.hasMore) * 31) + this.nextCursor) * 31) + this.totalCount) * 31) + this.secretReplyResultEntries.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SecretReplyResult(hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(", nextCursor=");
        sbLIZ.append(this.nextCursor);
        sbLIZ.append(", totalCount=");
        sbLIZ.append(this.totalCount);
        sbLIZ.append(", secretReplyResultEntries=");
        sbLIZ.append(this.secretReplyResultEntries);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SecretReplyResult(boolean z, int i, int i2, List<SecretReplyResultEntry> list) {
        this.hasMore = z;
        this.nextCursor = i;
        this.totalCount = i2;
        this.secretReplyResultEntries = list;
    }

    public SecretReplyResult(boolean z, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? C13BV.INSTANCE : list);
    }
}
