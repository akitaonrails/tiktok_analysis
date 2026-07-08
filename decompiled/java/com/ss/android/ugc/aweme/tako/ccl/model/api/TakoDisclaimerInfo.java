package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoDisclaimerInfo {

    @C09CT("content")
    public final String content;

    @C09CT("enable_new_format")
    public final DisclaimerType disclaimerType;

    @C09CT("image")
    public final BaseImage image;

    @C09CT("new_content_list")
    public final List<String> newContentList;

    @C09CT("title")
    public final String title;

    @C09CT("trigger_type")
    public final int triggerType;

    public TakoDisclaimerInfo() {
        this("", -1, DisclaimerType.DISCLAIMER_TYPE_DEFAULT, null, null, null);
    }

    public TakoDisclaimerInfo(String str, int i, DisclaimerType disclaimerType, String str2, BaseImage baseImage, List<String> list) {
        this.content = str;
        this.triggerType = i;
        this.disclaimerType = disclaimerType;
        this.title = str2;
        this.image = baseImage;
        this.newContentList = list;
    }
}
