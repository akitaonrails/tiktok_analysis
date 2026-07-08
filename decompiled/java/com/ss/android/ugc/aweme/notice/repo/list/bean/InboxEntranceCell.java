package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C0ORP;
import X.C0ZBF;
import X.C0ZBG;
import X.C1902860zcK;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxEntranceCell {
    public static final C1902860zcK Companion = new Object() { // from class: X.0zcK
    };
    public Boolean archiveStatus;

    @C09CT("ui_info_before_mark_read")
    public InboxEntranceCellUIInfo beforeMarkUiInfo;

    @C09CT("unread_count_before_mark_read")
    public int beforeMarkUnreadCount;

    @C09CT("biz_params")
    public String bizParams;

    @C09CT("can_hide")
    public boolean canHide;

    @C09CT("can_pin")
    public boolean canPin;

    @C09CT("entrance_id")
    public int cellId;

    @C09CT("sub_entrance_key")
    public String entranceKey;

    @C09CT("event_tracking_fields")
    public List<KeyValueHolder> eventTrackingExtra;

    @C09CT("preview_window")
    public InboxEntranceExposedInfo exposedInfo;

    @C09CT("filter_type")
    public int filterType;

    @C09CT("function_list")
    public List<InboxEntranceFunction> functionList;

    @C09CT("group")
    public int group;

    @C09CT("last_notice_create_time")
    public long lastNoticeCreateTime;

    @C09CT("latest_unread_notice_time")
    public Long latestUnreadNoticeTime;
    public C0ZBF muteStatus;

    @C09CT("notice_preload_for_second_page")
    public NoticeItems noticePreloadItem;
    public Boolean pinStatus;

    @C09CT("sorting_priority")
    public int priority;

    @C09CT("list_type")
    public int systemNoticeType;

    @C09CT("ui_info")
    public InboxEntranceCellUIInfo uiInfo;

    @C09CT("unread_count")
    public int unreadCount;

    public InboxEntranceCell() {
        this(0, 0, 0, null, null, 0L, false, false, Integer.MIN_VALUE, 0, 0, null, null, 0, null, null, null, null, null);
    }

    public final InboxEntranceCell copy(int i, int i2, int i3, InboxEntranceCellUIInfo inboxEntranceCellUIInfo, String str, long j, boolean z, boolean z2, int i4, int i5, int i6, InboxEntranceExposedInfo inboxEntranceExposedInfo, List<KeyValueHolder> list, int i7, InboxEntranceCellUIInfo inboxEntranceCellUIInfo2, NoticeItems noticeItems, Long l, String str2, List<InboxEntranceFunction> list2) {
        return new InboxEntranceCell(i, i2, i3, inboxEntranceCellUIInfo, str, j, z, z2, i4, i5, i6, inboxEntranceExposedInfo, list, i7, inboxEntranceCellUIInfo2, noticeItems, l, str2, list2);
    }

    public String toString() {
        return "InboxEntranceCell(cellId=" + this.cellId + ", priority=" + this.priority + ", unreadCount=" + this.unreadCount + ", uiInfo=" + this.uiInfo + ", bizParams=" + this.bizParams + ", lastNoticeCreateTime=" + this.lastNoticeCreateTime + ", canHide=" + this.canHide + ", canPin=" + this.canPin + ", filterType=" + this.filterType + ", group=" + this.group + ", systemNoticeType=" + this.systemNoticeType + ", exposedInfo=" + this.exposedInfo + ", eventTrackingExtra=" + this.eventTrackingExtra + ", beforeMarkUnreadCount=" + this.beforeMarkUnreadCount + ", beforeMarkUiInfo=" + this.beforeMarkUiInfo + ", noticePreloadItem=" + this.noticePreloadItem + ", latestUnreadNoticeTime=" + this.latestUnreadNoticeTime + ", entranceKey=" + this.entranceKey + ", functionList=" + this.functionList + ')';
    }

    public final Boolean getArchiveStatus() {
        InboxEntranceFunction next;
        List<InboxEntranceFunction> list = this.functionList;
        boolean z = false;
        if (list != null) {
            Iterator<InboxEntranceFunction> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.functionType == C0ORP.ARCHIVE.getType()) {
                    break;
                }
            }
            InboxEntranceFunction inboxEntranceFunction = next;
            if (inboxEntranceFunction != null && inboxEntranceFunction.actionStatus == 1) {
                z = true;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        this.archiveStatus = boolValueOf;
        return boolValueOf;
    }

    public final C0ZBF getMuteStatus() {
        InboxEntranceFunction next;
        C0ZBF c0zbf = this.muteStatus;
        if (c0zbf != null) {
            return c0zbf;
        }
        List<InboxEntranceFunction> list = this.functionList;
        C0ZBF c0zbfLIZ = null;
        if (list != null) {
            Iterator<InboxEntranceFunction> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.functionType == C0ORP.MUTE.getType()) {
                    break;
                }
            }
            InboxEntranceFunction inboxEntranceFunction = next;
            if (inboxEntranceFunction != null) {
                c0zbfLIZ = C0ZBG.LIZ(Integer.valueOf(inboxEntranceFunction.actionStatus));
            }
        }
        this.muteStatus = c0zbfLIZ;
        return c0zbfLIZ;
    }

    public final Boolean getPinStatus() {
        InboxEntranceFunction next;
        Boolean bool = this.pinStatus;
        if (bool != null) {
            return bool;
        }
        List<InboxEntranceFunction> list = this.functionList;
        boolean z = false;
        if (list != null) {
            Iterator<InboxEntranceFunction> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.functionType == C0ORP.PIN.getType()) {
                    break;
                }
            }
            InboxEntranceFunction inboxEntranceFunction = next;
            if (inboxEntranceFunction != null && inboxEntranceFunction.actionStatus == 1) {
                z = true;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        this.pinStatus = boolValueOf;
        return boolValueOf;
    }

    public final boolean isActivity() {
        return this.cellId == 1;
    }

    public final boolean isFollower() {
        return this.cellId == 2;
    }

    public final boolean isSystemNoticeBox() {
        return this.cellId == 3;
    }

    public final boolean isTako() {
        return this.cellId == 9;
    }

    public final boolean isWorkBench() {
        return this.cellId == 12;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InboxEntranceCell)) {
            return false;
        }
        InboxEntranceCell inboxEntranceCell = (InboxEntranceCell) obj;
        if (inboxEntranceCell.cellId == this.cellId && Intrinsics.LJFF(inboxEntranceCell.entranceKey, this.entranceKey)) {
            return true;
        }
        return false;
    }

    public final void setArchiveStatus(Boolean bool) {
        this.archiveStatus = bool;
    }

    public final void setBeforeMarkUiInfo(InboxEntranceCellUIInfo inboxEntranceCellUIInfo) {
        this.beforeMarkUiInfo = inboxEntranceCellUIInfo;
    }

    public final void setBeforeMarkUnreadCount(int i) {
        this.beforeMarkUnreadCount = i;
    }

    public final void setBizParams(String str) {
        this.bizParams = str;
    }

    public final void setCanHide(boolean z) {
        this.canHide = z;
    }

    public final void setCanPin(boolean z) {
        this.canPin = z;
    }

    public final void setCellId(int i) {
        this.cellId = i;
    }

    public final void setEntranceKey(String str) {
        this.entranceKey = str;
    }

    public final void setEventTrackingExtra(List<KeyValueHolder> list) {
        this.eventTrackingExtra = list;
    }

    public final void setExposedInfo(InboxEntranceExposedInfo inboxEntranceExposedInfo) {
        this.exposedInfo = inboxEntranceExposedInfo;
    }

    public final void setFilterType(int i) {
        this.filterType = i;
    }

    public final void setFunctionList(List<InboxEntranceFunction> list) {
        this.functionList = list;
    }

    public final void setGroup(int i) {
        this.group = i;
    }

    public final void setLastNoticeCreateTime(long j) {
        this.lastNoticeCreateTime = j;
    }

    public final void setLatestUnreadNoticeTime(Long l) {
        this.latestUnreadNoticeTime = l;
    }

    public final void setMuteStatus(C0ZBF c0zbf) {
        this.muteStatus = c0zbf;
    }

    public final void setNoticePreloadItem(NoticeItems noticeItems) {
        this.noticePreloadItem = noticeItems;
    }

    public final void setPinStatus(Boolean bool) {
        this.pinStatus = bool;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public final void setSystemNoticeType(int i) {
        this.systemNoticeType = i;
    }

    public final void setUiInfo(InboxEntranceCellUIInfo inboxEntranceCellUIInfo) {
        this.uiInfo = inboxEntranceCellUIInfo;
    }

    public final void setUnreadCount(int i) {
        this.unreadCount = i;
    }

    public InboxEntranceCell(int i, int i2, int i3, InboxEntranceCellUIInfo inboxEntranceCellUIInfo, String str, long j, boolean z, boolean z2, int i4, int i5, int i6, InboxEntranceExposedInfo inboxEntranceExposedInfo, List<KeyValueHolder> list, int i7, InboxEntranceCellUIInfo inboxEntranceCellUIInfo2, NoticeItems noticeItems, Long l, String str2, List<InboxEntranceFunction> list2) {
        this.cellId = i;
        this.priority = i2;
        this.unreadCount = i3;
        this.uiInfo = inboxEntranceCellUIInfo;
        this.bizParams = str;
        this.lastNoticeCreateTime = j;
        this.canHide = z;
        this.canPin = z2;
        this.filterType = i4;
        this.group = i5;
        this.systemNoticeType = i6;
        this.exposedInfo = inboxEntranceExposedInfo;
        this.eventTrackingExtra = list;
        this.beforeMarkUnreadCount = i7;
        this.beforeMarkUiInfo = inboxEntranceCellUIInfo2;
        this.noticePreloadItem = noticeItems;
        this.latestUnreadNoticeTime = l;
        this.entranceKey = str2;
        this.functionList = list2;
    }
}
