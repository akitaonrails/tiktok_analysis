package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchOutreachDataStruct implements Serializable {

    @C09CT("comment")
    public final Comment comment;

    @C09CT("type")
    public final int type;

    @C09CT("ui_style")
    public final int uiStyle;

    public SearchOutreachDataStruct() {
        this(-1, null, 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchOutreachDataStruct(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", comment=");
        sbLIZ.append(this.comment);
        sbLIZ.append(", uiStyle=");
        sbLIZ.append(this.uiStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SearchOutreachDataStruct(int i, Comment comment, int i2) {
        this.type = i;
        this.comment = comment;
        this.uiStyle = i2;
    }
}
