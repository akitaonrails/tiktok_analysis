package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AICommentPhoto implements Serializable {

    @C09CT("enable_comment")
    public boolean enableComment;

    public AICommentPhoto() {
        this(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AICommentPhoto) && this.enableComment == ((AICommentPhoto) obj).enableComment;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.enableComment);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICommentPhoto(enableComment=");
        sbLIZ.append(this.enableComment);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AICommentPhoto(boolean z) {
        this.enableComment = z;
    }
}
