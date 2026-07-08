package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentInfoStruct implements Serializable {

    @C09CT("comment")
    public final Comment comment;

    @C09CT("content_type_tags")
    public final List<String> contentTypeTags;

    public CommentInfoStruct() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentInfoStruct)) {
            return false;
        }
        CommentInfoStruct commentInfoStruct = (CommentInfoStruct) obj;
        return Intrinsics.LJFF(this.comment, commentInfoStruct.comment) && Intrinsics.LJFF(this.contentTypeTags, commentInfoStruct.contentTypeTags);
    }

    public int hashCode() {
        Comment comment = this.comment;
        int iHashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        List<String> list = this.contentTypeTags;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentInfoStruct(comment=");
        sbLIZ.append(this.comment);
        sbLIZ.append(", contentTypeTags=");
        sbLIZ.append(this.contentTypeTags);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommentInfoStruct(Comment comment, List<String> list) {
        this.comment = comment;
        this.contentTypeTags = list;
    }
}
