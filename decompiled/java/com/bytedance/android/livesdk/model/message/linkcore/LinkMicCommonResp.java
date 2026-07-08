package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class LinkMicCommonResp {

    @C09CT("err_code")
    public long errorCode;

    @C09CT("err_msg")
    public String errorMsg;

    @C09CT("extra")
    public Map<String, byte[]> extra;

    @C09CT("linker_mode")
    public int linkerMode;

    @C09CT("linker_session_id")
    public String linkerSessionId;

    @C09CT("wait_cross_data")
    public boolean waitCrossData;

    public LinkMicCommonResp() {
        this(0L, "", C2097608Jq.LJ(), 0, false, "");
    }

    public LinkMicCommonResp(long j, String str, Map<String, byte[]> map, int i, boolean z, String str2) {
        this.errorCode = j;
        this.errorMsg = str;
        this.extra = map;
        this.linkerMode = i;
        this.waitCrossData = z;
        this.linkerSessionId = str2;
    }
}
