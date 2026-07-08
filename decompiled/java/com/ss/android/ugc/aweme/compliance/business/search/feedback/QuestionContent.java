package com.ss.android.ugc.aweme.compliance.business.search.feedback;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class QuestionContent implements Serializable {
    public static final int $stable = 8;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;
    public boolean selected;

    @C09CT("value")
    public final String value;

    public QuestionContent() {
        this("", "", false);
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public QuestionContent(String str, String str2, boolean z) {
        this.id = str;
        this.value = str2;
        this.selected = z;
    }
}
