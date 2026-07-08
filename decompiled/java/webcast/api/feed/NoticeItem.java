package webcast.api.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class NoticeItem {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("create_time")
    public long createTime;

    @C09CT("event_id")
    public long eventId;

    @C09CT("extra")
    public String extra = "";

    @C09CT("has_read")
    public boolean hasRead;

    @C09CT("highlight_id")
    public long highlightId;

    @C09CT("notice_id")
    public long noticeId;

    @C09CT("notice_type")
    public int noticeType;

    @C09CT("room_id")
    public long roomId;

    @C09CT("show_ui_info")
    public NoticeUIInfo showUiInfo;
}
