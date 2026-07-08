package com.ss.android.ugc.aweme.creative.model.aigc;

import X.EnumC547830Le9;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface WritableAIGCGenerationModel extends AIGCGenerationModel {
    void Gi(EnumC547830Le9 enumC547830Le9);

    void Jq(String str);

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    void LLLZIL(UsageStatus usageStatus);

    void P3(UsageStatus usageStatus);

    void Qd(String str);

    void RH(long j);

    void S5(String str);

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    long T1();

    void Wn(long j);

    void aO(String str);

    void ex(List<String> list);

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    String getClientTaskId();

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    int getErrorCode();

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    String getErrorMsg();

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    String getErrorSource();

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    String getFailReasonMsg();

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    List<String> getResults();

    @Override // com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel
    UsageStatus getStatus();

    void hz(List<String> list);

    void pA(long j);

    void setErrorCode(int i);

    void setErrorMsg(String str);

    void setProgress(int i);

    void setResults(List<String> list);

    void ud(String str);
}
