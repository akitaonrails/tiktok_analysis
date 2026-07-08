package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationTemplateInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("template_id")
    public String templateId;

    @C09CT("template_key")
    public String templateKey;

    @C09CT("template_prefix")
    public final String templatePrefix;

    public CelebrationTemplateInfo() {
        this("", "", "");
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateKey(String str) {
        this.templateKey = str;
    }

    public CelebrationTemplateInfo(String str, String str2, String str3) {
        this.templateKey = str;
        this.templateId = str2;
        this.templatePrefix = str3;
    }
}
