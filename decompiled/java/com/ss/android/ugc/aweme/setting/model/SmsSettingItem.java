package com.ss.android.ugc.aweme.setting.model;

import X.C09CT;
import X.C210100rT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class SmsSettingItem implements Serializable {
    public static final int $stable = 0;
    public static final C210100rT Companion = new Object() { // from class: X.00rT
    };

    @C09CT("disable")
    public final Boolean disable;

    @C09CT("field")
    public final String field;

    @C09CT("value")
    public final int value;

    public SmsSettingItem() {
        this("primary_sms_auth", 0, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmsSettingItem(field=");
        sbLIZ.append(this.field);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", disable=");
        sbLIZ.append(this.disable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SmsSettingItem(String str, int i, Boolean bool) {
        this.field = str;
        this.value = i;
        this.disable = bool;
    }
}
