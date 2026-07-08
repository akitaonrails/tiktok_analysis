package com.bytedance.ies.ugc.aweme.commercialize.compliance.topics.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SensitiveTopicsResponse extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("sensitive_topics")
    public final List<SensitiveTopicStruct> sensitiveTopics;

    public SensitiveTopicsResponse() {
        this(null);
    }

    public final SensitiveTopicsResponse copy(List<SensitiveTopicStruct> list) {
        return new SensitiveTopicsResponse(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveTopicsResponse) && Intrinsics.LJFF(this.sensitiveTopics, ((SensitiveTopicsResponse) obj).sensitiveTopics);
    }

    public int hashCode() {
        List<SensitiveTopicStruct> list = this.sensitiveTopics;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SensitiveTopicsResponse(sensitiveTopics=");
        sbLIZ.append(this.sensitiveTopics);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<SensitiveTopicStruct> getSensitiveTopics() {
        return this.sensitiveTopics;
    }

    public SensitiveTopicsResponse(List<SensitiveTopicStruct> list) {
        this.sensitiveTopics = list;
    }
}
