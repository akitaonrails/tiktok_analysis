package com.ss.android.ugc.aweme.creative.model.mention;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class RecommendMentionAndPrompt {

    @C09CT("mention_data")
    public final List<MentionDataItem> mentionData;

    @C09CT("prompt")
    public final List<InputBlock> prompt;

    public RecommendMentionAndPrompt() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendMentionAndPrompt)) {
            return false;
        }
        RecommendMentionAndPrompt recommendMentionAndPrompt = (RecommendMentionAndPrompt) obj;
        return Intrinsics.LJFF(this.mentionData, recommendMentionAndPrompt.mentionData) && Intrinsics.LJFF(this.prompt, recommendMentionAndPrompt.prompt);
    }

    public final int hashCode() {
        List<MentionDataItem> list = this.mentionData;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<InputBlock> list2 = this.prompt;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendMentionAndPrompt(mentionData=");
        sbLIZ.append(this.mentionData);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecommendMentionAndPrompt(List<MentionDataItem> list, List<InputBlock> list2) {
        this.mentionData = list;
        this.prompt = list2;
    }
}
