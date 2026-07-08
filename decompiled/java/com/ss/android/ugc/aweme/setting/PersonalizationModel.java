package com.ss.android.ugc.aweme.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PersonalizationModel {

    @C09CT("biz_name")
    public final String bizName;

    @C09CT("need_personalization")
    public final boolean needPersonalization;

    public PersonalizationModel() {
        this("", false);
    }

    public PersonalizationModel(String str, boolean z) {
        this.bizName = str;
        this.needPersonalization = z;
    }
}
