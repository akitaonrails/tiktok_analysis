package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinAccountEditResponse {

    @C09CT("bulletin_account")
    public final BulletinBoardInfo accountInfo;

    @C09CT("biz_resource_entry")
    public final List<BulletinBizResourceEntry> bizResourceEntry;

    @C09CT("biz_resource_entry_toggle")
    public final List<BulletinBizResourceEntryToggle> bizResourceEntryToggle;

    @C09CT("function_settings")
    public final List<BulletinFunctionSetting> bulletinFunctionSettings;

    @C09CT("comment_enable")
    public final Boolean commentEnable;

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT("embedded_publish_content")
    public final BulletinEmbeddedPublishContent embeddedPublishContent;

    @C09CT("function_list")
    public final List<InboxEntranceFunction> functionList;

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

    @C09CT("toolkit_orders")
    public final List<BulletinToolkitModel> toolkitOrders;

    public BulletinAccountEditResponse() {
        this(-1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public BulletinAccountEditResponse(int i, String str, BulletinBoardInfo bulletinBoardInfo, List<InboxEntranceFunction> list, List<BulletinFunctionSetting> list2, Boolean bool, Boolean bool2, Boolean bool3, List<BulletinPublishAction> list3, List<BulletinPublishAction> list4, String str2, String str3, LogPbBean logPbBean, List<BulletinBizResourceEntry> list5, List<BulletinBizResourceEntryToggle> list6, BulletinEmbeddedPublishContent bulletinEmbeddedPublishContent, List<BulletinToolkitModel> list7, Boolean bool4) {
        this.statusCode = i;
        this.statusMsg = str;
        this.accountInfo = bulletinBoardInfo;
        this.functionList = list;
        this.bulletinFunctionSettings = list2;
        this.liveManagementEnable = bool;
        this.liveRoomAutoShareEnable = bool2;
        this.liveEventAutoShareEnable = bool3;
        this.quickPostSettingList = list3;
        this.plusPostSettingList = list4;
        this.contentPb = str2;
        this.shareUrl = str3;
        this.logPb = logPbBean;
        this.bizResourceEntry = list5;
        this.bizResourceEntryToggle = list6;
        this.embeddedPublishContent = bulletinEmbeddedPublishContent;
        this.toolkitOrders = list7;
        this.commentEnable = bool4;
    }
}
