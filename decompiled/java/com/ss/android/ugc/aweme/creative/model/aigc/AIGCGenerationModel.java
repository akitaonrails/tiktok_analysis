package com.ss.android.ugc.aweme.creative.model.aigc;

import X.EnumC547830Le9;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface AIGCGenerationModel extends Parcelable {
    UsageStatus GO();

    void LLLZIL(UsageStatus usageStatus);

    long T1();

    List<String> bH();

    String getClientTaskId();

    long getDurationMs();

    int getErrorCode();

    String getErrorMsg();

    String getErrorSource();

    String getFailReasonMsg();

    String getMusicId();

    int getProgress();

    String getPromptId();

    String getPromptText();

    List<String> getResults();

    String getServerTaskId();

    UsageStatus getStatus();

    String getStep();

    long us();

    EnumC547830Le9 v7();

    List<String> xr();
}
