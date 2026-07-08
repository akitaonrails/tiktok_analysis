package com.ss.android.ugc.aweme.ml.model;

import X.C09CT;
import X.C740480T2w;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* JADX INFO: loaded from: classes13.dex */
public final class PreloadCommentMLModel extends MLModel {
    public static final C740480T2w Companion = new Object() { // from class: X.0T2w
    };

    @C09CT("group_id")
    public int groupId;

    @C09CT("client_ai_threshold")
    public float clientAIThreshold = 0.5f;

    @C09CT("recommend_threshold")
    public float recommendThreshold = 0.5f;

    @Override // com.ss.android.ugc.aweme.setting.model.MLModel
    public String toString() {
        return super.toString();
    }

    public final float getClientAIThreshold() {
        return this.clientAIThreshold;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final float getRecommendThreshold() {
        return this.recommendThreshold;
    }

    public final void setClientAIThreshold(float f) {
        this.clientAIThreshold = f;
    }

    public final void setGroupId(int i) {
        this.groupId = i;
    }

    public final void setRecommendThreshold(float f) {
        this.recommendThreshold = f;
    }
}
