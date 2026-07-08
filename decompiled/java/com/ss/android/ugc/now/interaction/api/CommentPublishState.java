package com.ss.android.ugc.now.interaction.api;

import X.C2188811AlT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentPublishState extends Interaction {
    public final String awemeId;
    public final Comment comment;

    public CommentPublishState() {
        this(null, null);
    }

    public final CommentPublishState copy(Comment comment, String str) {
        return new CommentPublishState(comment, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPublishState)) {
            return false;
        }
        CommentPublishState commentPublishState = (CommentPublishState) obj;
        return Intrinsics.LJFF(this.comment, commentPublishState.comment) && Intrinsics.LJFF(this.awemeId, commentPublishState.awemeId);
    }

    public int hashCode() {
        Comment comment = this.comment;
        int iHashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        String str = this.awemeId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPublishState(comment=");
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

    public CommentPublishState(Comment comment, String str) {
        super(null);
        this.comment = comment;
        this.awemeId = str;
    }
}
