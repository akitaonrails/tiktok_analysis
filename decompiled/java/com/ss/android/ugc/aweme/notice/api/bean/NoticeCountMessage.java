package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public class NoticeCountMessage {

    @C09CT("author_id")
    public long authorId;

    @C09CT("create_time")
    public long createTime;

    @C09CT("item_id")
    public long itemId;

    @C09CT("msg_id")
    public String msgId;

    @C09CT("count")
    public int noticeCount;

    @C09CT("notify_group")
    public int noticeGroup;

    @C09CT("type")
    public int noticeType;

    @C09CT("push_type")
    public String pushType;

    @C09CT("single_group")
    public int singleGroup;

    @C09CT("content")
    public StrangerNoticeMessage strangerMessage;
}
