package com.ss.android.ugc.aweme.share.improve.action.whythisvid;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class WhyThisVideoModel {

    @C09CT("biz_type")
    public final String bizType;

    @C09CT("body")
    public final String body;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("sub_body")
    public final String subBody;

    @C09CT("title")
    public final String title;

    public WhyThisVideoModel() {
        this("", "", "", "", "algo");
    }

    public WhyThisVideoModel(String str, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.body = str2;
        this.subBody = str3;
        this.buttonText = str4;
        this.bizType = str5;
    }
}
