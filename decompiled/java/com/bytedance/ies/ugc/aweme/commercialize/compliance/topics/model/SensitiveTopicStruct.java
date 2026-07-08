package com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model;

import X.C09CT;
import X.C2188811AlT;
import X.C746490TPz;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class SensitiveTopicStruct implements Serializable {

    @C09CT("choice")
    public Integer choice;

    @C09CT("detail_content")
    public final String detailContent;

    @C09CT("sensitive_topic_id")
    public final String sensitiveTopicId;

    @C09CT("sensitive_topic_name")
    public final String sensitiveTopicName;
    public static final C746490TPz Companion = new Object() { // from class: X.0TPz
    };
    public static final int $stable = 8;

    public SensitiveTopicStruct() {
        this(null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveTopicStruct(sensitiveTopicId=");
        sbLIZ.append(this.sensitiveTopicId);
        sbLIZ.append(", sensitiveTopicName=");
        sbLIZ.append(this.sensitiveTopicName);
        sbLIZ.append(", choice=");
        sbLIZ.append(this.choice);
        sbLIZ.append(", detailContent=");
        sbLIZ.append(this.detailContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setChoice(Integer num) {
        this.choice = num;
    }

    public SensitiveTopicStruct(String str, String str2, Integer num, String str3) {
        this.sensitiveTopicId = str;
        this.sensitiveTopicName = str2;
        this.choice = num;
        this.detailContent = str3;
    }
}
