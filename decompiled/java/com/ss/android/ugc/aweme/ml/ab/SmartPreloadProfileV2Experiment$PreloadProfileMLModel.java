package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* JADX INFO: loaded from: classes13.dex */
public class SmartPreloadProfileV2Experiment$PreloadProfileMLModel extends MLModel {

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
}
