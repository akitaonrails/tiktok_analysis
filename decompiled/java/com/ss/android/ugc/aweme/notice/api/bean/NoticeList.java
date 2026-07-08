package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeList extends BaseResponse {

    @C09CT("direct_message_count")
    public long dmCount;

    @C09CT("entrance_count")
    public List<EntranceCount> entranceCount;

    @C09CT("follow_tab_channel_count")
    public List<Object> followTabChannelCounts;

    @C09CT("sync_in_unread_count")
    public List<KeyValueModel> groupMapping;

    @C09CT("groups_in_filters")
    public List<NoticeInboxFilterGroups> groups;

    @C09CT("notice_count")
    public List<NoticeCount> items;

    @C09CT("latest_notice_time")
    public Long latestNoticeTime;

    @C09CT("latest_unread_notice_time")
    public Long latestUnreadNoticeTime;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("server_time")
    public Long serverTime;

    @C09CT("user_id")
    public Long userId;

    public NoticeList() {
        this(null, null, null, 0L, null, null, null, null, null, null, 0L);
    }

    public final long getDmCount() {
        return this.dmCount;
    }

    public final List<EntranceCount> getEntranceCount() {
        return this.entranceCount;
    }

    public final List<Object> getFollowTabChannelCounts() {
        return this.followTabChannelCounts;
    }

    public final List<KeyValueModel> getGroupMapping() {
        return this.groupMapping;
    }

    public final List<NoticeInboxFilterGroups> getGroups() {
        return this.groups;
    }

    public final List<NoticeCount> getItems() {
        return this.items;
    }

    public final Long getLatestNoticeTime() {
        return this.latestNoticeTime;
    }

    public final Long getLatestUnreadNoticeTime() {
        return this.latestUnreadNoticeTime;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Long getServerTime() {
        return this.serverTime;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final void setDmCount(long j) {
        this.dmCount = j;
    }

    public final void setEntranceCount(List<EntranceCount> list) {
        this.entranceCount = list;
    }

    public final void setFollowTabChannelCounts(List<Object> list) {
        this.followTabChannelCounts = list;
    }

    public final void setGroupMapping(List<KeyValueModel> list) {
        this.groupMapping = list;
    }

    public final void setGroups(List<NoticeInboxFilterGroups> list) {
        this.groups = list;
    }

    public final void setItems(List<NoticeCount> list) {
        this.items = list;
    }

    public final void setLatestNoticeTime(Long l) {
        this.latestNoticeTime = l;
    }

    public final void setLatestUnreadNoticeTime(Long l) {
        this.latestUnreadNoticeTime = l;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setServerTime(Long l) {
        this.serverTime = l;
    }

    public final void setUserId(Long l) {
        this.userId = l;
    }

    public NoticeList(Long l, List<NoticeCount> list, List<EntranceCount> list2, long j, LogPbBean logPbBean, List<NoticeInboxFilterGroups> list3, List<Object> list4, Long l2, List<KeyValueModel> list5, Long l3, Long l4) {
        this.userId = l;
        this.items = list;
        this.entranceCount = list2;
        this.dmCount = j;
        this.logPb = logPbBean;
        this.groups = list3;
        this.followTabChannelCounts = list4;
        this.latestNoticeTime = l2;
        this.groupMapping = list5;
        this.latestUnreadNoticeTime = l3;
        this.serverTime = l4;
    }
}
