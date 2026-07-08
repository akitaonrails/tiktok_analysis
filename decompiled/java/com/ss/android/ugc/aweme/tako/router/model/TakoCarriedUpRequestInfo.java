package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class TakoCarriedUpRequestInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("answer_message_key")
    public String answerMessageKey;

    @C09CT("up_sync_message_params")
    public final Map<String, String> messageParams;

    @C09CT("up_sync_scene")
    public final Integer upSyncScene;

    public TakoCarriedUpRequestInfo() {
        this(null, null, null);
    }

    public final void setAnswerMessageKey(String str) {
        this.answerMessageKey = str;
    }

    public TakoCarriedUpRequestInfo(Integer num, String str, Map<String, String> map) {
        this.upSyncScene = num;
        this.answerMessageKey = str;
        this.messageParams = map;
    }
}
