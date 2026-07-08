package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinAccountInfoResponse {

    @C09CT("bulletin_account")
    public final BulletinBoardInfo accountInfo;

    @C09CT("bar_entrance")
    public final BulletinBarEntrance barEntrance;

    @C09CT("biz_resource_entry")
    public final List<BulletinBizResourceEntry> bizResourceEntry;

    @C09CT("biz_resource_entry_toggle")
    public final List<BulletinBizResourceEntryToggle> bizResourceEntryToggle;

    @C09CT("function_settings")
    public final List<BulletinFunctionSetting> bulletinFunctionSettings;

    @C09CT("channel_access_control")
    public final BulletinChannelAccessControl channelAccessControl;

    @C09CT("comment_enable")
    public final Boolean commentEnable;

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT("embedded_publish_content")
    public final BulletinEmbeddedPublishContent embeddedPublishContent;

    @C09CT("function_list")
    public final List<InboxEntranceFunction> functionList;

    @C09CT("viewer_identity_type")
    public final int identity;

    @C09CT("live_event_auto_share_enable")
    public final Boolean liveEventAutoShareEnable;

    @C09CT("live_management_enable")
    public final Boolean liveManagementEnable;

    @C09CT("live_room_auto_share_enable")
    public final Boolean liveRoomAutoShareEnable;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("plus_post_orders")
    public final List<BulletinPublishAction> plusPostSettingList;

    @C09CT("quick_post_orders")
    public final List<BulletinPublishAction> quickPostSettingList;

    @C09CT("share_url")
    public final String shareUrl;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("subscription_info")
    public final BulletinSubscriptionInfo subscriptionInfo;

    @C09CT("toolkit_orders")
    public final List<BulletinToolkitModel> toolkitOrders;

    public BulletinAccountInfoResponse() {
        this(-1, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        return "BulletinAccountInfoResponse(statusCode=" + this.statusCode + ", statusMsg=" + this.statusMsg + ", accountInfo=" + this.accountInfo + ", functionList=" + this.functionList + ", identity=" + this.identity + ", bulletinFunctionSettings=" + this.bulletinFunctionSettings + ", subscriptionInfo=" + this.subscriptionInfo + ", channelAccessControl=" + this.channelAccessControl + ", barEntrance=" + this.barEntrance + ", quickPostSettingList=" + this.quickPostSettingList + ", plusPostSettingList=" + this.plusPostSettingList + ", logPb=" + this.logPb + ", contentPb=" + this.contentPb + ", shareUrl=" + this.shareUrl + ", liveManagementEnable=" + this.liveManagementEnable + ", liveRoomAutoShareEnable=" + this.liveRoomAutoShareEnable + ", liveEventAutoShareEnable=" + this.liveEventAutoShareEnable + ", bizResourceEntry=" + this.bizResourceEntry + ", bizResourceEntryToggle=" + this.bizResourceEntryToggle + ", embeddedPublishContent=" + this.embeddedPublishContent + ", toolkitOrders=" + this.toolkitOrders + ", commentEnable=" + this.commentEnable + ')';
    }

    public BulletinAccountInfoResponse(int i, String str, BulletinBoardInfo bulletinBoardInfo, List<InboxEntranceFunction> list, int i2, List<BulletinFunctionSetting> list2, BulletinSubscriptionInfo bulletinSubscriptionInfo, BulletinChannelAccessControl bulletinChannelAccessControl, BulletinBarEntrance bulletinBarEntrance, List<BulletinPublishAction> list3, List<BulletinPublishAction> list4, LogPbBean logPbBean, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, List<BulletinBizResourceEntry> list5, List<BulletinBizResourceEntryToggle> list6, BulletinEmbeddedPublishContent bulletinEmbeddedPublishContent, List<BulletinToolkitModel> list7, Boolean bool4) {
        this.statusCode = i;
        this.statusMsg = str;
        this.accountInfo = bulletinBoardInfo;
        this.functionList = list;
        this.identity = i2;
        this.bulletinFunctionSettings = list2;
        this.subscriptionInfo = bulletinSubscriptionInfo;
        this.channelAccessControl = bulletinChannelAccessControl;
        this.barEntrance = bulletinBarEntrance;
        this.quickPostSettingList = list3;
        this.plusPostSettingList = list4;
        this.logPb = logPbBean;
        this.contentPb = str2;
        this.shareUrl = str3;
        this.liveManagementEnable = bool;
        this.liveRoomAutoShareEnable = bool2;
        this.liveEventAutoShareEnable = bool3;
        this.bizResourceEntry = list5;
        this.bizResourceEntryToggle = list6;
        this.embeddedPublishContent = bulletinEmbeddedPublishContent;
        this.toolkitOrders = list7;
        this.commentEnable = bool4;
    }
}
