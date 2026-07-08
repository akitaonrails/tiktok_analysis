package com.ss.android.ugc.aweme.feed.landscape.networkapi;

/* JADX INFO: loaded from: classes20.dex */
public final class PhotoNoticeResponse {
    public final NoticeData notice_data;
    public final int notice_type;
    public final int status_code;
    public final String status_msg;

    public PhotoNoticeResponse(int i, String str, int i2, NoticeData noticeData) {
        this.status_code = i;
        this.status_msg = str;
        this.notice_type = i2;
        this.notice_data = noticeData;
    }
}
