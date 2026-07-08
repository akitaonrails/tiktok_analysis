package com.ss.android.ugc.now.interaction.api;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentCountState extends Interaction {
    public final String awemeId;
    public final long commentCount;

    public CommentCountState() {
        this(0L, null);
    }

    public final CommentCountState copy(long j, String str) {
        return new CommentCountState(j, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentCountState)) {
            return false;
        }
        CommentCountState commentCountState = (CommentCountState) obj;
        return this.commentCount == commentCountState.commentCount && Intrinsics.LJFF(this.awemeId, commentCountState.awemeId);
    }

    public int hashCode() {
        int iY2 = C786410Ut5.Y2(this.commentCount) * 31;
        String str = this.awemeId;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentCountState(commentCount=");
        sbLIZ.append(this.commentCount);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    public CommentCountState(long j, String str) {
        super(null);
        this.commentCount = j;
        this.awemeId = str;
    }
}
