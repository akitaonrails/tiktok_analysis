package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public class AssociativeEmoticonAll {

    @C09CT("show")
    public Integer show;

    @C09CT("sourceMessage")
    public String sourceMessage;

    public Integer getShow() {
        return this.show;
    }

    public String getSourceMessage() {
        return this.sourceMessage;
    }

    public AssociativeEmoticonAll(Integer num, String str) {
        this.show = num;
        this.sourceMessage = str;
    }
}
