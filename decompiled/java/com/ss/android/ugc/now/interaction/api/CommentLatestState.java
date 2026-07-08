package com.ss.android.ugc.now.interaction.api;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentLatestState extends Interaction {
    public final String awemeId;
    public final Comment latestComment;

    public CommentLatestState() {
        this(null, null);
    }

    public final CommentLatestState copy(Comment comment, String str) {
        return new CommentLatestState(comment, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentLatestState)) {
            return false;
        }
        CommentLatestState commentLatestState = (CommentLatestState) obj;
        return Intrinsics.LJFF(this.latestComment, commentLatestState.latestComment) && Intrinsics.LJFF(this.awemeId, commentLatestState.awemeId);
    }

    public int hashCode() {
        Comment comment = this.latestComment;
        int iHashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        String str = this.awemeId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentLatestState(latestComment=");
        sbLIZ.append(this.latestComment);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public final Comment getLatestComment() {
        return this.latestComment;
    }

    public CommentLatestState(Comment comment, String str) {
        super(null);
        this.latestComment = comment;
        this.awemeId = str;
    }
}
