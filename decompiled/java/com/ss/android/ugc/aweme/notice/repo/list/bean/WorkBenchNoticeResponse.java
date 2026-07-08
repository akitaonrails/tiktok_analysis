package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class WorkBenchNoticeResponse extends BaseResponse {

    @C09CT("cursor")
    public final String cursor;

    @C09CT("entrance_settings")
    public final EntranceSettings entranceSettings;

    @C09CT("filter_config")
    public final List<MissionFilterConfig> filterConfig;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("last_read_time_in_session")
    public final String lastReadTimeInSession;

    @C09CT("mission_list")
    public final List<MissionStruct> missionList;

    @C09CT("mission_tab_info")
    public final List<InboxMissionTabInfo> missionTabInfo;

    @C09CT("settings")
    public final List<MissionSetting> settings;

    @C09CT("tab_id")
    public final int tabId;

    @C09CT("total")
    public final int total;

    @C09CT("wall_time")
    public final long wallTime;

    public WorkBenchNoticeResponse() {
        this(null, null, "", 0, false, 0, null, "", 0L, null, null);
    }

    public final WorkBenchNoticeResponse copy(List<MissionStruct> list, List<InboxMissionTabInfo> list2, String str, int i, boolean z, int i2, EntranceSettings entranceSettings, String str2, long j, List<MissionFilterConfig> list3, List<MissionSetting> list4) {
        return new WorkBenchNoticeResponse(list, list2, str, i, z, i2, entranceSettings, str2, j, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkBenchNoticeResponse)) {
            return false;
        }
        WorkBenchNoticeResponse workBenchNoticeResponse = (WorkBenchNoticeResponse) obj;
        return Intrinsics.LJFF(this.missionList, workBenchNoticeResponse.missionList) && Intrinsics.LJFF(this.missionTabInfo, workBenchNoticeResponse.missionTabInfo) && Intrinsics.LJFF(this.cursor, workBenchNoticeResponse.cursor) && this.total == workBenchNoticeResponse.total && this.hasMore == workBenchNoticeResponse.hasMore && this.tabId == workBenchNoticeResponse.tabId && Intrinsics.LJFF(this.entranceSettings, workBenchNoticeResponse.entranceSettings) && Intrinsics.LJFF(this.lastReadTimeInSession, workBenchNoticeResponse.lastReadTimeInSession) && this.wallTime == workBenchNoticeResponse.wallTime && Intrinsics.LJFF(this.filterConfig, workBenchNoticeResponse.filterConfig) && Intrinsics.LJFF(this.settings, workBenchNoticeResponse.settings);
    }

    public int hashCode() {
        List<MissionStruct> list = this.missionList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<InboxMissionTabInfo> list2 = this.missionTabInfo;
        int iHashCode2 = (((((((((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31) + this.cursor.hashCode()) * 31) + this.total) * 31) + C786410Ut5.Z2(this.hasMore)) * 31) + this.tabId) * 31;
        EntranceSettings entranceSettings = this.entranceSettings;
        int iHashCode3 = (((((iHashCode2 + (entranceSettings == null ? 0 : entranceSettings.hashCode())) * 31) + this.lastReadTimeInSession.hashCode()) * 31) + C786410Ut5.Y2(this.wallTime)) * 31;
        List<MissionFilterConfig> list3 = this.filterConfig;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MissionSetting> list4 = this.settings;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return "WorkBenchNoticeResponse(missionList=" + this.missionList + ", missionTabInfo=" + this.missionTabInfo + ", cursor=" + this.cursor + ", total=" + this.total + ", hasMore=" + this.hasMore + ", tabId=" + this.tabId + ", entranceSettings=" + this.entranceSettings + ", lastReadTimeInSession=" + this.lastReadTimeInSession + ", wallTime=" + this.wallTime + ", filterConfig=" + this.filterConfig + ", settings=" + this.settings + ')';
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final EntranceSettings getEntranceSettings() {
        return this.entranceSettings;
    }

    public final List<MissionFilterConfig> getFilterConfig() {
        return this.filterConfig;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getLastReadTimeInSession() {
        return this.lastReadTimeInSession;
    }

    public final List<MissionStruct> getMissionList() {
        return this.missionList;
    }

    public final List<InboxMissionTabInfo> getMissionTabInfo() {
        return this.missionTabInfo;
    }

    public final List<MissionSetting> getSettings() {
        return this.settings;
    }

    public final int getTabId() {
        return this.tabId;
    }

    public final int getTotal() {
        return this.total;
    }

    public final long getWallTime() {
        return this.wallTime;
    }

    public WorkBenchNoticeResponse(List<MissionStruct> list, List<InboxMissionTabInfo> list2, String str, int i, boolean z, int i2, EntranceSettings entranceSettings, String str2, long j, List<MissionFilterConfig> list3, List<MissionSetting> list4) {
        this.missionList = list;
        this.missionTabInfo = list2;
        this.cursor = str;
        this.total = i;
        this.hasMore = z;
        this.tabId = i2;
        this.entranceSettings = entranceSettings;
        this.lastReadTimeInSession = str2;
        this.wallTime = j;
        this.filterConfig = list3;
        this.settings = list4;
    }
}
