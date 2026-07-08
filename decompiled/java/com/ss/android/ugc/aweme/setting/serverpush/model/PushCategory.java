package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class PushCategory {
    public boolean LIZ;

    @C09CT("category_title")
    public final String categoryTitle = "";

    @C09CT("category_tips")
    public final String categoryTips = "";

    @C09CT("item_list")
    public final List<PushItem> itemList = new ArrayList();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushCategory(categoryTitle='");
        sbLIZ.append(this.categoryTitle);
        sbLIZ.append("', items=");
        sbLIZ.append(this.itemList);
        sbLIZ.append(", checkFriendOnlyStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
