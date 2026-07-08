package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class SystemNoticeResponse extends BaseResponse {

    @C09CT("channel_list")
    public final List<NoticeChannelInfo> channelList;

    @C09CT("entrance_settings")
    public final EntranceSettings entranceSettings;

    @C09CT("unsubscribe_channel_settings")
    public final List<GroupUnsubscribeSetting> groupUnsubscribeSettings;

    @C09CT("notice_list")
    public final NoticeItems noticeItem;

    @C09CT("unsubscribe_setting_metadata")
    public final UnsubscribeSettingMetadata unsubscribeSetting;

    public SystemNoticeResponse() {
        this(null, null, null, null, null);
    }

    public final SystemNoticeResponse copy(NoticeItems noticeItems, List<NoticeChannelInfo> list, UnsubscribeSettingMetadata unsubscribeSettingMetadata, List<GroupUnsubscribeSetting> list2, EntranceSettings entranceSettings) {
        return new SystemNoticeResponse(noticeItems, list, unsubscribeSettingMetadata, list2, entranceSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemNoticeResponse)) {
            return false;
        }
        SystemNoticeResponse systemNoticeResponse = (SystemNoticeResponse) obj;
        return Intrinsics.LJFF(this.noticeItem, systemNoticeResponse.noticeItem) && Intrinsics.LJFF(this.channelList, systemNoticeResponse.channelList) && Intrinsics.LJFF(this.unsubscribeSetting, systemNoticeResponse.unsubscribeSetting) && Intrinsics.LJFF(this.groupUnsubscribeSettings, systemNoticeResponse.groupUnsubscribeSettings) && Intrinsics.LJFF(this.entranceSettings, systemNoticeResponse.entranceSettings);
    }

    public int hashCode() {
        NoticeItems noticeItems = this.noticeItem;
        int iHashCode = (noticeItems == null ? 0 : noticeItems.hashCode()) * 31;
        List<NoticeChannelInfo> list = this.channelList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        UnsubscribeSettingMetadata unsubscribeSettingMetadata = this.unsubscribeSetting;
        int iHashCode3 = (iHashCode2 + (unsubscribeSettingMetadata == null ? 0 : unsubscribeSettingMetadata.hashCode())) * 31;
        List<GroupUnsubscribeSetting> list2 = this.groupUnsubscribeSettings;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        EntranceSettings entranceSettings = this.entranceSettings;
        return iHashCode4 + (entranceSettings != null ? entranceSettings.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemNoticeResponse(noticeItem=");
        sbLIZ.append(this.noticeItem);
        sbLIZ.append(", channelList=");
        sbLIZ.append(this.channelList);
        sbLIZ.append(", unsubscribeSetting=");
        sbLIZ.append(this.unsubscribeSetting);
        sbLIZ.append(", groupUnsubscribeSettings=");
        sbLIZ.append(this.groupUnsubscribeSettings);
        sbLIZ.append(", entranceSettings=");
        sbLIZ.append(this.entranceSettings);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<NoticeChannelInfo> getChannelList() {
        return this.channelList;
    }

    public final EntranceSettings getEntranceSettings() {
        return this.entranceSettings;
    }

    public final List<GroupUnsubscribeSetting> getGroupUnsubscribeSettings() {
        return this.groupUnsubscribeSettings;
    }

    public final NoticeItems getNoticeItem() {
        return this.noticeItem;
    }

    public final UnsubscribeSettingMetadata getUnsubscribeSetting() {
        return this.unsubscribeSetting;
    }

    public SystemNoticeResponse(NoticeItems noticeItems, List<NoticeChannelInfo> list, UnsubscribeSettingMetadata unsubscribeSettingMetadata, List<GroupUnsubscribeSetting> list2, EntranceSettings entranceSettings) {
        this.noticeItem = noticeItems;
        this.channelList = list;
        this.unsubscribeSetting = unsubscribeSettingMetadata;
        this.groupUnsubscribeSettings = list2;
        this.entranceSettings = entranceSettings;
    }
}
