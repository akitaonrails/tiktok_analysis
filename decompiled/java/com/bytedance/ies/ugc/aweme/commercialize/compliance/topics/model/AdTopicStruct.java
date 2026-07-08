package com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model;

import X.C09CT;
import X.C2188811AlT;
import X.C746480TPy;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class AdTopicStruct implements Serializable {

    @C09CT("ad_topic_id")
    public final String adTopicId;

    @C09CT("ad_topic_name")
    public final String adTopicName;

    @C09CT("choice")
    public Integer choice;

    @C09CT("is_inferred_by_tiktok")
    public final Boolean isInferredByTikTok;

    @C09CT("is_parent")
    public final Boolean isParent;
    public static final C746480TPy Companion = new Object() { // from class: X.0TPy
    };
    public static final int $stable = 8;

    public AdTopicStruct() {
        this(null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdTopicStruct(adTopicId=");
        sbLIZ.append(this.adTopicId);
        sbLIZ.append(", adTopicName=");
        sbLIZ.append(this.adTopicName);
        sbLIZ.append(", choice=");
        sbLIZ.append(this.choice);
        sbLIZ.append(", isParent=");
        sbLIZ.append(this.isParent);
        sbLIZ.append(", isInferredByTikTok=");
        sbLIZ.append(this.isInferredByTikTok);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isInferredByTikTok() {
        return this.isInferredByTikTok;
    }

    public final Boolean isParent() {
        return this.isParent;
    }

    public final void setChoice(Integer num) {
        this.choice = num;
    }

    public AdTopicStruct(String str, String str2, Integer num, Boolean bool, Boolean bool2) {
        this.adTopicId = str;
        this.adTopicName = str2;
        this.choice = num;
        this.isParent = bool;
        this.isInferredByTikTok = bool2;
    }
}
