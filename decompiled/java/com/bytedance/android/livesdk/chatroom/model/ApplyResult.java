package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ApplyResult {

    @C09CT("auto_join")
    public Boolean autoJoin;

    @C09CT("weight_decay_type")
    public int decayType;

    @C09CT("linkmic_id")
    public int linkMicId;

    @C09CT("linkmic_id_str")
    public String linkMicIdStr;

    @C09CT("prompts")
    public String prompts;

    @C09CT("rtc_ext_info")
    public String rtcExtInfo;

    @C09CT("vendor")
    public int vendor;

    @C09CT("rtc_ext_info_map")
    public HashMap<Long, String> rtcExtInfoMap = new HashMap<>();

    @C09CT("link_type_permission")
    public long linkTypePermission = 0;
}
