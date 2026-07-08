package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoTemplateInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("creative_task_info")
    public final TakoCreativeTaskInfo creativeTaskInfo;

    @C09CT("default_std_size")
    public final Integer defaultStdSize;

    @C09CT("generate_type")
    public final Integer generateType;

    @C09CT("original_prompt")
    public final String originalPrompt;

    @C09CT("tab_id")
    public final String tabId;

    @C09CT("tab_name")
    public final String tabName;

    @C09CT("template_id")
    public final String templateId;

    public TakoTemplateInfo(String str, Integer num, TakoCreativeTaskInfo takoCreativeTaskInfo, Integer num2, String str2, String str3, String str4) {
        this.templateId = str;
        this.generateType = num;
        this.creativeTaskInfo = takoCreativeTaskInfo;
        this.defaultStdSize = num2;
        this.tabId = str2;
        this.tabName = str3;
        this.originalPrompt = str4;
    }
}
