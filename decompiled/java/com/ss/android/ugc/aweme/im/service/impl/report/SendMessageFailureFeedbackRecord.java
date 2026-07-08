package com.ss.android.ugc.aweme.im.service.impl.report;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class SendMessageFailureFeedbackRecord {

    @C09CT("err_code")
    public final Integer errorCode;

    @C09CT("err_desc")
    public final String errorDesc;

    @C09CT("log_id")
    public final String logId;

    @C09CT("msg_type")
    public final Integer msgType;

    @C09CT("time")
    public final Long time;

    public SendMessageFailureFeedbackRecord() {
        this("", -1, -1, "", 0L);
    }

    public SendMessageFailureFeedbackRecord(String str, Integer num, Integer num2, String str2, Long l) {
        this.logId = str;
        this.msgType = num;
        this.errorCode = num2;
        this.errorDesc = str2;
        this.time = l;
    }
}
