package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ItemCommentEggGroup implements Serializable {

    @C09CT("item_comment_eggs")
    public List<ItemCommentEggData> commentEggData;

    @C09CT("edit_hint_list")
    public List<EditHint> editintist;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ItemCommentEggGroup{editintist=");
        sbLIZ.append(this.editintist);
        sbLIZ.append(", commentEggData=");
        sbLIZ.append(this.commentEggData);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public List<ItemCommentEggData> getCommentEggData() {
        return this.commentEggData;
    }

    public List<EditHint> getEditintist() {
        return this.editintist;
    }

    public void setCommentEggData(List<ItemCommentEggData> list) {
        this.commentEggData = list;
    }

    public void setEditintist(List<EditHint> list) {
        this.editintist = list;
    }
}
