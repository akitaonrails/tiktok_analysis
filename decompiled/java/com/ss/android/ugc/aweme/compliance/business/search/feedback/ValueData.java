package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes13.dex */
public final class ValueData {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("text_data")
    public final String textData;

    @C09CT("value")
    public final String value;

    public ValueData() {
        this("", "", "");
    }

    public ValueData(String str, String str2, String str3) {
        this.id = str;
        this.value = str2;
        this.textData = str3;
    }
}
