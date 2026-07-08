package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class LinkInitResult {

    @C09CT("access_key")
    public String accessKey;

    @C09CT("app_id")
    public String appId;

    @C09CT("app_sign")
    public String appSign;

    @C09CT("linkmic_id")
    public int linkMicId;

    @C09CT("linkmic_id_str")
    public String linkMicIdStr;

    @C09CT("rtc_ext_info")
    public String rtcExtInfo;

    @C09CT("vendor")
    public int vendor;

    @C09CT("rtc_ext_info_map")
    public HashMap<Long, String> rtcExtInfoMap = new HashMap<>();

    @C09CT("user_multi_live_enum")
    public int abTestInfo = 0;

    @C09CT("user_setting_info")
    public MultiLiveAnchorPanelSettings panelSettings = null;
}
