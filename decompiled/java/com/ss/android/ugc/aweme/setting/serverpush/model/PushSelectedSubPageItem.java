package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes26.dex */
public class PushSelectedSubPageItem {

    @C09CT("description")
    public final String description;

    @C09CT("field_value")
    public final int fieldValue;

    @C09CT("select_field_value")
    public final Integer selectFieldValue;

    @C09CT("title")
    public final String title;

    public PushSelectedSubPageItem() {
        this("Title", null, -1, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushDynamicUISettings(title='");
        sbLIZ.append(this.title);
        sbLIZ.append("', description='");
        sbLIZ.append(this.description);
        sbLIZ.append("', fieldValue='");
        sbLIZ.append(this.fieldValue);
        sbLIZ.append("', selectFieldValue=");
        sbLIZ.append(this.selectFieldValue);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PushSelectedSubPageItem(String str) {
        this(str, null, -1, null);
    }

    public PushSelectedSubPageItem(String str, String str2) {
        this(str, str2, -1, null);
    }

    public PushSelectedSubPageItem(String str, String str2, int i) {
        this(str, str2, i, null);
    }

    public PushSelectedSubPageItem(String str, String str2, int i, Integer num) {
        this.title = str;
        this.description = str2;
        this.fieldValue = i;
        this.selectFieldValue = num;
    }
}
