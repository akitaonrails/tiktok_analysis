package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class PushSettingDynamicUI {

    @C09CT("version")
    public final String version = "";

    @C09CT("page_title")
    public final String title = "Notifications";

    @C09CT("page_label")
    public final String pageLabel = "";

    @C09CT("category_list")
    public final List<PushCategory> categoryList = new ArrayList();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushDynamicUISettings(version='");
        sbLIZ.append(this.version);
        sbLIZ.append("', title='");
        sbLIZ.append(this.title);
        sbLIZ.append("', pageLabel='");
        sbLIZ.append(this.pageLabel);
        sbLIZ.append("', categories=");
        sbLIZ.append(this.categoryList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
