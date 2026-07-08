package com.ss.android.ugc.aweme.template;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class TemplateOperationData {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("autocut_lottie")
    public final String autocutLottie;

    @C09CT("lottie")
    public final String lottie;
    public List<String> urlPrefix;

    public TemplateOperationData() {
        this("", "", "");
    }

    public final void setUrlPrefix(List<String> list) {
        this.urlPrefix = list;
    }

    public TemplateOperationData(String str, String str2, String str3) {
        this.activityId = str;
        this.lottie = str2;
        this.autocutLottie = str3;
    }
}
