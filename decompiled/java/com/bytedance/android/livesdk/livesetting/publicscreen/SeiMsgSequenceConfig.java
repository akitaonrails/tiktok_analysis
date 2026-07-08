package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SeiMsgSequenceConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("report_msg_count")
    public int msgCount;

    @C09CT("report_msg_id_interval")
    public int reportMsgIdInterval;

    @C09CT("report_msg_id_seq_interval")
    public int reportMsgIdSeqInterval;

    static {
        NormalGson.singleton();
        ADAPTER = new SeiMsgSequenceConfig_OptTypeAdapter();
    }
}
