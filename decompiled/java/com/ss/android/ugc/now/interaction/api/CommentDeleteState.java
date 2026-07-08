package com.ss.android.ugc.now.interaction.api;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentDeleteState extends Interaction {
    public final String awemeId;
    public final Comment comment;

    public CommentDeleteState() {
        this(null, null);
    }

    public final CommentDeleteState copy(Comment comment, String str) {
        return new CommentDeleteState(comment, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentDeleteState)) {
            return false;
        }
        CommentDeleteState commentDeleteState = (CommentDeleteState) obj;
        return Intrinsics.LJFF(this.comment, commentDeleteState.comment) && Intrinsics.LJFF(this.awemeId, commentDeleteState.awemeId);
    }

    public int hashCode() {
        Comment comment = this.comment;
        int iHashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        String str = this.awemeId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentDeleteState(comment=");
        sbLIZ.append(this.comment);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public final Comment getComment() {
        return this.comment;
    }

    public CommentDeleteState(Comment comment, String str) {
        super(null);
        this.comment = comment;
        this.awemeId = str;
    }
}
